/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2016 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.scg.ssc.ssa

import com.google.common.collect.BiMap
import com.google.common.collect.HashMultimap
import com.google.common.collect.Multimap
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.kexpressions.Declaration
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.Parameter
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.kico.transformation.AbstractProductionTransformation
import de.cau.cs.kieler.kitt.tracing.Traceable
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.BasicBlock
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.DataDependency
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import de.cau.cs.kieler.scg.extensions.SCGCoreExtensions
import de.cau.cs.kieler.scg.extensions.SCGThreadExtensions
import de.cau.cs.kieler.scg.extensions.UnsupportedSCGException
import de.cau.cs.kieler.scg.features.SCGFeatures
import de.cau.cs.kieler.scg.ssc.features.SSAFeature
import de.cau.cs.kieler.scg.ssc.ssa.domtree.DominatorTree
import java.util.Collection
import javax.inject.Inject

import static com.google.common.collect.Lists.*
import static de.cau.cs.kieler.scg.ssc.ssa.SSAFunction.*

import static extension com.google.common.base.Predicates.*
import static extension de.cau.cs.kieler.kitt.tracing.TracingEcoreUtil.*

/**
 * The SSA transformation for SCGs
 * 
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class SCSSATransformation extends AbstractProductionTransformation implements Traceable {

    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    override getId() {
        return "scg.ssa.scssa"
    }

    override getName() {
        return "SCSSA"
    }

    override getProducedFeatureId() {
        return SSAFeature.ID
    }

    override getRequiredFeatureIds() {
        return newHashSet(SCGFeatures::BASICBLOCK_ID, SCGFeatures::DEPENDENCY_ID)
    }

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------
    @Inject extension SCGCoreExtensions
    @Inject extension SCGControlFlowExtensions
    @Inject extension SCGThreadExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension AnnotationsExtensions
    @Inject extension SSACoreExtensions
    @Inject extension IOPreserverExtensions
    @Inject extension MergeExpressionExtension    

    // -------------------------------------------------------------------------
    def SCGraph transform(SCGraph scg, KielerCompilerContext context) {
        
        // It is expected that this node is an entry node.
        val entryNode = scg.nodes.head
        if (!(entryNode instanceof Entry) || scg.basicBlocks.head.schedulingBlocks.head.nodes.head != entryNode) {
            throw new UnsupportedSCGException(
                "The SSA analysis expects an entry node as first node in the first basic block!")
        }
        val entryBB = scg.basicBlocks.head
        // map for saving parameter references
        val ssaReferences = HashMultimap.<Assignment, Parameter>create
        
        // Create new declarations for SSA versions
        val ssaDecl = scg.createSSADeclarations
        val dt = new DominatorTree(scg)

        // ---------------
        // 1. Prepare Update Scheduling
        // ---------------
        scg.prepareUpdateScheduling

        // ---------------
        // 2. Preserve output behavior
        // ---------------
        scg.preprocessIO(entryNode as Entry, ssaDecl)

        // ---------------
        // 3. Place Merge Expressions
        // ---------------
        scg.placeMergeExp(dt, ssaReferences, ssaDecl)
        
        // ---------------
        // 4. Create IO Preserving Assignments
        // ---------------
        val preserverAsm = scg.createPreservingAssignments(dt, ssaReferences, ssaDecl)

        // ---------------
        // 5. Rename Variables
        // ---------------
        scg.rename(dt, entryBB, ssaDecl, ssaReferences)
        scg.createStringAnnotation(SSAFeature.ID, SSAFeature.ID)

        // ---------------
        // 6. Optimize concurrent dominant writes
        // ---------------
        
        scg.updateSSAVersions
        scg.optimizeConcurrentDominantWrite(dt)
        
        // ---------------
        // 7. Preserve delayed Values
        // ---------------
        scg.postprocessIO(entryNode as Entry, ssaDecl, preserverAsm)

        // ---------------
        // 8. Compact SSA merge expression
        // ---------------
        for (e : scg.mergeExpressions.values) {
            e.replace(e.reduce)
        }
       
        // ---------------
        // 9. Remove unused ssa versions
        // ---------------
        scg.removeUnusedSSAVersions

        // ---------------
        // 10. Update SSA VO version numbering
        // ---------------   
        scg.updateSSAVersions
        
        // ---------------
        // 11. Update IO preservation
        // ---------------     
        scg.optimizeIO

        
        scg.createStringAnnotation(SSAFeature.ID, SSAFeature.ID)
        return scg
    }
        
    private def Collection<Node> placeMergeExp(SCGraph scg, DominatorTree dt,
        Multimap<Assignment, Parameter> ssaReferences, BiMap<ValuedObject, Declaration> ssaDecl) {
        val nodes = newLinkedHashSet
        for (node : newArrayList(scg.nodes.filter(instanceOf(Assignment).or(instanceOf(Conditional))))) {
            val expr = node.eContents.filter(Expression).head
            val refs = if (node instanceof Assignment && !node.isOutputPreserver) {
                newArrayList(expr.allReferences.filter[valuedObject != (node as Assignment).valuedObject])
            } else {
                newArrayList(expr.allReferences)
            }
            for (vor : refs) {
                val concurrentNodes = node.incoming.filter(DataDependency).filter[concurrent].map[eContainer as Node].toList         
                val mergeExp = node.createMergeExpression(concurrentNodes, vor.valuedObject, ssaReferences, ssaDecl, dt)
                vor.replace(mergeExp)
            }
        }
        return nodes
    }

    private def void rename(SCGraph scg, DominatorTree dt, BasicBlock start,
        BiMap<ValuedObject, Declaration> ssaDecl, Multimap<Assignment, Parameter> ssaReferences) {
        start.recursiveRename(dt, ssaDecl)
        for (entry : ssaReferences.entries) {
            val ref = entry.value.expression as ValuedObjectReference
            ref.valuedObject = entry.key.valuedObject
        }
    }

    private def void recursiveRename(BasicBlock block, DominatorTree dt, BiMap<ValuedObject, Declaration> ssaDecl) {
        for (sb : block.schedulingBlocks) {
            for (s : sb.nodes) {
                // rename definitions
                if (s instanceof Assignment) {
                    if (!s.outputPreserver) {
                        val isUpdate = s.isUpdate
                        // create new version
                        val vo = s.valuedObject
                        val newVO = vo.copy
                        ssaDecl.get(vo).valuedObjects.add(newVO)
                        s.valuedObject = newVO
                        // transform update
                        if (isUpdate) {
                            s.valuedObject.markSSA(COMBINE)
                            val oe = s.expression as OperatorExpression
                            if (oe.subExpressions.size > 2) {
                                oe.subExpressions.removeIf[it instanceof ValuedObjectReference && (it as ValuedObjectReference).valuedObject == vo]
                            } else {
                                s.expression = oe.subExpressions.filter[!(it instanceof ValuedObjectReference && (it as ValuedObjectReference).valuedObject == vo)].head
                            }
                        }
                    }
                }
            }
        }
        // Following basic blocks (ordered by dominator tree to create the correct numbering order)
        val bbs = (block.eContainer as SCGraph).basicBlocks
        for (m : dt.children(block).sortBy[bbs.indexOf(it)]) {
            m.recursiveRename(dt, ssaDecl)
        }
    }
           
    /**
     * Removes the parameter of the sequential reaching definition for shared variables if the variable is always written.
     */
    private def optimizeConcurrentDominantWrite(SCGraph scg, DominatorTree dt) {
        val def = scg.defs
        val use = scg.uses
        // If any assignment in any thread dominates its exit node and is always instantaneously executed, the values sequentially before the fork can never reach the join and can be removed
        for (asm : def.values.filter[!dependencies.filter(DataDependency).filter[concurrent == true && confluent == false].empty]) {
            val entry = (asm.threadEntryNode as Entry)
            if (dt.isDominator(asm.basicBlock, entry.exit.basicBlock) && entry.getIndirectControlFlows(asm).forall[instantaneousFlow]){
                val fork = asm.ancestorFork;
                // Find definitions dominated by this instantaneous concurrent write
                // TODO check nested threads
                val precedingDefs = newHashSet;  
                (fork.eContainer as SCGraph).nodes.get(0).getIndirectControlFlows(fork).filter[
                    !it.exists[eContainer == fork || eContainer == fork.join]
                ].forEach[forEach[
                    val node = it.eContainer as Node;
                    if (node instanceof Assignment) {
                        if (node.valuedObject.declaration == asm.valuedObject.declaration && node != asm){
                            precedingDefs.add(node)
                        }
                    }
                ]];
                // Remove merge expression references
                for(u : use.get(asm.valuedObject)) {
                    for (ent : fork.allNext.map[target].filter(typeof(Entry))) {
                        if (ent.threadNodes.contains(u)) {
                            for(p : precedingDefs) {
                                u.eContents.filter(Expression).head.allReferences.filter[valuedObject == p.valuedObject].toList.forEach[eContainer.remove]
                            }
                        }
                    }
                }
            }
        }
    }
    
}
    