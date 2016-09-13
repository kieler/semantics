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
import de.cau.cs.kieler.core.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.core.kexpressions.Declaration
import de.cau.cs.kieler.core.kexpressions.Expression
import de.cau.cs.kieler.core.kexpressions.OperatorExpression
import de.cau.cs.kieler.core.kexpressions.Parameter
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.kico.transformation.AbstractProductionTransformation
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.BasicBlock
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.DataDependency
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.ScgFactory
import de.cau.cs.kieler.scg.ScgPackage
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import de.cau.cs.kieler.scg.extensions.SCGCoreExtensions
import de.cau.cs.kieler.scg.extensions.SCGThreadExtensions
import de.cau.cs.kieler.scg.extensions.UnsupportedSCGException
import de.cau.cs.kieler.scg.features.SCGFeatures
import de.cau.cs.kieler.scg.ssc.features.SSAFeature
import de.cau.cs.kieler.scg.ssc.ssa.domtree.DominatorTree
import de.cau.cs.kieler.scg.ssc.ssa.processors.SSAOptimizer
import de.cau.cs.kieler.scg.ssc.ssa.processors.SeqConcTransformer
import java.util.Collection
import javax.inject.Inject

import static com.google.common.collect.Lists.*
import static de.cau.cs.kieler.scg.ssc.ssa.SSAFunction.*

import static extension com.google.common.base.Predicates.*
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

/**
 * The SSA transformation for SCGs
 * 
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class SSATransformation extends AbstractProductionTransformation {

    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    override getId() {
        return "scg.ssa"
    }

    override getName() {
        return "SSA"
    }

    override getProducedFeatureId() {
        return SSAFeature.ID
    }

    override getRequiredFeatureIds() {
        return newHashSet(SCGFeatures::BASICBLOCK_ID)
    }

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------
    @Inject
    extension SCGCoreExtensions

    @Inject
    extension SCGControlFlowExtensions

    @Inject
    extension SCGThreadExtensions

    extension ScgFactory = ScgPackage.eINSTANCE.scgFactory

    @Inject
    extension KExpressionsValuedObjectExtensions


    @Inject
    extension AnnotationsExtensions

    @Inject
    extension SSACoreExtensions

    @Inject
    extension SSACacheExtensions

    @Inject
    extension IOPreserverExtensions
    @Inject
    extension MergeExpressionExtension    

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
        
        val ssaDecl = scg.createSSADeclarations

        // ---------------
        // 1. Prepare Update Scheduling
        // ---------------
        scg.prepareUpdateScheduling

        // ---------------
        // 1. Preserve output behavior
        // ---------------
        scg.preprocessIO(entryNode as Entry, ssaDecl)

        // ---------------
        // 2. Place Phi
        // ---------------
        scg.placeMergeExp(context, ssaReferences, ssaDecl)
        
        // ---------------
        // 2. Create IO Preserving Assignmnts
        // ---------------
        val preserverAsm = scg.createPreservingAssignments(context, ssaReferences, ssaDecl)

        // ---------------
        // 3. Renaming
        // ---------------
        scg.rename(context, entryBB, ssaDecl, ssaReferences)
        scg.createStringAnnotation(SSAFeature.ID, SSAFeature.ID)

        // ---------------
        // 2. Optimize concurrent dominant write
        // ---------------
        scg.optimizeConcurrentDominantWrite(context)
        
        // ---------------
        // 2. Preserve Delayed Values
        // ---------------
        scg.postprocessIO(entryNode as Entry, ssaDecl, preserverAsm, context)

        // ---------------
        // 3. Compactize SSA merge expression
        // ---------------
        for (e : scg.getMergeExpressions.values) {
            e.replace(e.reduce)
        }
       
        // ---------------
        // 4. Remove unused ssa versions
        // ---------------
        scg.removeUnusedSSAVersions(context)

        // ---------------
        // 5. Update SSA VO version numbering
        // ---------------   
        scg.updateSSAVersions
        
        return scg
    }
        
    private def Collection<Node> placeMergeExp(SCGraph scg, KielerCompilerContext context,
        Multimap<Assignment, Parameter> ssaReferences, BiMap<ValuedObject, Declaration> ssaDecl) {
        val nodes = newLinkedHashSet
        for (node : newArrayList(scg.nodes.filter(instanceOf(Assignment).or(instanceOf(Conditional))))) {
            val expr = node.eContents.filter(Expression).head
            val refs = if (node instanceof Assignment) {
                newArrayList(expr.allReferences.filter[valuedObject != node.valuedObject])
            } else {
                newArrayList(expr.allReferences)
            }
            for (vor : refs) {
                val concurrentNodes = node.incoming.filter(DataDependency).filter[concurrent].map[eContainer as Node].toList         
                val mergeExp = if (concurrentNodes.empty) {
                    node.createMergeExpression(vor.valuedObject, ssaReferences, ssaDecl, context)
                } else {
                    concurrentNodes.add(node)
                    concurrentNodes.createMergeExpression(vor.valuedObject, ssaReferences, ssaDecl, context)
                }
                vor.replace(mergeExp)
            }
        }
        return nodes
    }

    private def void rename(SCGraph scg, KielerCompilerContext context, BasicBlock start,
        BiMap<ValuedObject, Declaration> ssaDecl, Multimap<Assignment, Parameter> ssaReferences) {
        val dt = context.getDominatorTree(scg)
        start.recursiveRename(dt, ssaDecl)
        for (entry : ssaReferences.entries) {
            val ref = entry.value.expression as ValuedObjectReference
            ref.valuedObject = entry.key.valuedObject
        }
    }

    private def void recursiveRename(BasicBlock block, DominatorTree dt, BiMap<ValuedObject, Declaration> ssaDecl) {
        for (sb : block.schedulingBlocks) {
            for (s : sb.nodes) {
                // rename def
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
                            val oe = s.assignment as OperatorExpression
                            if (oe.subExpressions.size > 2) {
                                oe.subExpressions.removeIf[it instanceof ValuedObjectReference && (it as ValuedObjectReference).valuedObject == vo]
                            } else {
                                s.assignment = oe.subExpressions.filter[!(it instanceof ValuedObjectReference && (it as ValuedObjectReference).valuedObject == vo)].head
                            }
                        }
                    }
                }
            }
        }

        val bbs = (block.eContainer as SCGraph).basicBlocks
        for (m : dt.children(block).sortBy[bbs.indexOf(it)]) {
            m.recursiveRename(dt, ssaDecl)
        }
    }
           
    /**
     * Removes the parameter of the sequential reaching definition for shared variables if the variable is always written.
     */
    private def optimizeConcurrentDominantWrite(SCGraph scg, KielerCompilerContext context) {
        val dt = context.getDominatorTree(scg)
        val def = context.getDef(scg)
        val use = context.getUse(scg)
        // if any assignment in any thread dominates the exit node, the sequential value can never reach the join and can be removed
        for (d : def.values.filter[!dependencies.filter(DataDependency).filter[concurrent == true && confluent == false].empty]) {
            val entry = (d.threadEntryNode as Entry)
            if (dt.isDominator(d.basicBlock, entry.exit.basicBlock) && entry.getIndirectControlFlows(d).forall[instantaneousFlow]){
                val fork = d.ancestorFork;
                // This is not loop safe
                val preceding = newHashSet;               
                (fork.eContainer as SCGraph).nodes.get(0).getIndirectControlFlows(fork).forEach[forEach[
                    val node = it.eContainer as Node;
                    if (node instanceof Assignment) {
                        if (node.valuedObject.declaration == d.valuedObject.declaration && node != d){
                            preceding.add(node)
                        }
                    }
                ]];
                val rem = HashMultimap.create
                for(u : use.get(d.valuedObject)) {
                    for (ent : fork.allNext.map[target].filter(typeof(Entry))) {
                        if (ent.threadNodes.contains(u)) {
                            for(p:preceding){
                                u.eContents.filter(Expression).head.allReferences.findFirst[valuedObject == p.valuedObject].eContainer.remove
                                rem.put(p.valuedObject,u)
                            }
                        }
                    }
                }
                for(r:rem.entries){
                    use.remove(r.key, r.value)
                }
            }
        }
    }

    /**
     * Remove unused ssa versions.
     */
    private def removeUnusedSSAVersions(SCGraph scg, KielerCompilerContext context) {
        val use = context.getUse(scg)
        val def = context.getDef(scg)
        for (decl : scg.declarations.filter[input == false && output == false]) {
            decl.valuedObjects.removeIf[!isRegister && !isTerm && use.get(it).empty && !def.containsKey(it)]
        }
        scg.removeUnusedSSADeclarations 
    }
    
    private def removeUnusedSSADeclarations(SCGraph scg) {
        scg.declarations.removeIf[input == false && output == false && it.valuedObjects.empty]
    }
}
    