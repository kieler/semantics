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
package de.cau.cs.kieler.scg.ssc.ssa.processors

import com.google.common.collect.HashMultimap
import de.cau.cs.kieler.core.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.core.kexpressions.Declaration
import de.cau.cs.kieler.core.kexpressions.FunctionCall
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.kico.transformation.AbstractProductionTransformation
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Exit
import de.cau.cs.kieler.scg.Join
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.RelativeWrite_Read
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import de.cau.cs.kieler.scg.extensions.SCGCoreExtensions
import de.cau.cs.kieler.scg.extensions.SCGThreadExtensions
import de.cau.cs.kieler.scg.ssc.features.SSAFeature
import de.cau.cs.kieler.scg.ssc.features.SSAOptFeature
import de.cau.cs.kieler.scg.ssc.ssa.SSACacheExtensions
import de.cau.cs.kieler.scg.ssc.ssa.SSACoreExtensions
import javax.inject.Inject

import static com.google.common.collect.Sets.*
import static de.cau.cs.kieler.scg.ssc.ssa.SSAFunction.*

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.scg.Conditional

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class SSAOptimizer extends AbstractProductionTransformation {

    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    override getId() {
        return "scg.ssa.opt"
    }

    override getName() {
        return "SSA Optimization"
    }

    override getProducedFeatureId() {
        return SSAOptFeature.ID
    }

    override getRequiredFeatureIds() {
        return newHashSet(SSAFeature.ID)
    }

    // -------------------------------------------------------------------------
    
    @Inject
    extension SCGControlFlowExtensions
    @Inject
    extension SCGCoreExtensions
    @Inject
    extension SCGThreadExtensions
    
    @Inject
    extension KExpressionsValuedObjectExtensions
    
    @Inject
    extension AnnotationsExtensions
    
    @Inject
    extension SSACoreExtensions
    @Inject
    extension SSACacheExtensions

    // -------------------------------------------------------------------------
    
    def SCGraph transform(SCGraph scg, KielerCompilerContext context) {
        // ---------------
        // 1. Remove phi nodes for assignments in the same basic block
        // ---------------
//        scg.removeSequentialDominatedPhi(context)

        // ---------------
        // 2. Remove superflouse sequential reaching parameter
        // ---------------
//        scg.removeSequentialReachingDef(context)

        // Schedule Sequential access of updates?

        // ---------------
        // 3. Remove unused join phi nodes
        // ---------------
        scg.removeUnusedJoinDefs(context)
        
        // ---------------
        // 3. Remove SSA functions with only one parameter
        // ---------------
        scg.removeTrivialSSAFunctions(context)
       
        // ---------------
        // 4. Remove unused ssa versions
        // ---------------
        scg.removeUnusedSSAVersions(context)

        // ---------------
        // 5. Update SSA VO version numbering
        // ---------------   
        scg.updateSSAVersions
        context.markSSACreatedAssignmentVariables(scg)

        scg.createStringAnnotation(SSAOptFeature.ID, SSAOptFeature.ID)
        return scg
    }
    
    /**
     * Removes init and update if nodes are in the same BB.
     */
    def removeSequentialDominatedPhi(SCGraph scg, KielerCompilerContext context) {
        val readJoinDefs = context.getReadAndJoinDef(scg)
        val def = context.getDef(scg)
        val use = context.getUse(scg)
        for (asm : readJoinDefs) {
            val fc = asm.assignment as FunctionCall
            val updateFC = fc.ssaParameterFunction(UPDATE)
            if (updateFC != null) {
                val psiRefAsmBlocks = updateFC.parameters.map[expression as ValuedObjectReference].map[valuedObject].map[def.get(it)].groupBy[basicBlock]
                for (blockAsmListPair : psiRefAsmBlocks.entrySet) {
                    val asmList = blockAsmListPair.value
                    val bb = blockAsmListPair.key
                    if (asmList.size > 1) {
                        val bbNodes = bb.nodes
                        val seqAsm = asmList.sortBy[bbNodes.indexOf(it)]
                        for (ignore : seqAsm.take(seqAsm.size - 1).map[valuedObject]) {
                            val ignoreUse = HashMultimap.create
                            for (ignoredUse : use.get(ignore)) {
                                if (bbNodes.contains(ignoredUse)) {
                                    val useNodeIndex = bbNodes.indexOf(ignoredUse)
                                    val seqDominantNode = seqAsm.findLast[bbNodes.indexOf(it) < useNodeIndex]
                                    val refs = ignoredUse.eAllContents.filter(ValuedObjectReference).toMap[valuedObject]
                                    if (refs.containsKey(seqDominantNode.valuedObject)) {
                                        // remove parameter
                                        refs.get(ignore).eContainer.remove
                                        ignoreUse.remove(ignore, ignoredUse)
                                    }
                                } else {
                                    val seqDominantNode = seqAsm.last
                                    val refs = ignoredUse.eAllContents.filter(ValuedObjectReference).toMap[valuedObject]
                                    if (refs.containsKey(seqDominantNode.valuedObject)) {
                                        // remove parameter
                                        refs.get(ignore).eContainer.remove
                                        ignoreUse.remove(ignore, ignoredUse)
                                    }
                                }
                            }
                            ignoreUse.entries.forEach[use.remove(key,value)]
                        }
                    }
                }
            }
            val initFC = fc.ssaParameterFunction(INIT)
            if (initFC != null) {
                val piRefAsmBlocks = initFC.parameters.map[expression as ValuedObjectReference].map[valuedObject].map[def.get(it)].groupBy[basicBlock]
                for (blockAsmListPair : piRefAsmBlocks.entrySet) {
                    val asmList = blockAsmListPair.value
                    val bb = blockAsmListPair.key
                    if (asmList.size > 1) {
                        val bbNodes = bb.nodes
                        val seqAsm = asmList.sortBy[bbNodes.indexOf(it)]
                        for (ignore : seqAsm.take(seqAsm.size - 1).map[valuedObject]) {
                            for (ignoredUse : use.get(ignore)) {
                                if (!bbNodes.contains(ignoredUse)) {
                                    val seqDominantNode = seqAsm.last
                                    val refs = ignoredUse.eAllContents.filter(ValuedObjectReference).toMap[valuedObject]
                                    if (refs.containsKey(seqDominantNode.valuedObject)) {
                                        // remove parameter
                                        refs.get(ignore).eContainer.remove
                                        use.remove(ignore, ignoredUse)
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    /**
     * Removes the parameter of the sequential reaching definition for shared variables if the variable is always written.
     */
    def removeSequentialReachingDef(SCGraph scg, KielerCompilerContext context) {
        val dt = context.getDominatorTree(scg)
        val joinDefs = context.getJoinDef(scg)
        val def = context.getDef(scg)
        val use = context.getUse(scg)
        // if any assignment in any thread dominates the exit node, the sequential value can never reach the join and can be removed
        for (asm : joinDefs) {
            var Node joinNode = asm
            while(!(joinNode instanceof Join)) {
                joinNode = joinNode.allPrevious.head.eContainer as Node
            }
            val exitBBs = joinNode.allPrevious.map[eContainer as Exit].map[basicBlock].toSet
            val fc = asm.assignment as FunctionCall
            val refVO = newArrayList
            val updateFC = fc.ssaParameterFunction(UPDATE)
            if (updateFC != null) {
                refVO.addAll(updateFC.parameters.map[expression as ValuedObjectReference].map[valuedObject])
            }
            val initFC = fc.ssaParameterFunction(INIT)
            if (initFC != null) {
                refVO.addAll(initFC.parameters.map[expression as ValuedObjectReference].map[valuedObject])
            }
            val exitDominantWrites = newArrayList
            for (vo : refVO) {
                val write = def.get(vo)
                val writeBB = write.basicBlock
                if (exitBBs.contains(writeBB) || exitBBs.exists[dt.isDominator(writeBB, it)] ) {
                    exitDominantWrites.add(write)
                }
            }
            if (!exitDominantWrites.empty) {
                // remove seq reaching value
                var seqReachingValueParam = fc.parameters.findFirst[expression instanceof ValuedObjectReference]
                var seqReachingVO = (seqReachingValueParam.expression as ValuedObjectReference).valuedObject
                fc.parameters.remove(seqReachingValueParam)
                use.remove(seqReachingVO, asm)
                // if any node is also in the surface of the thread, the sequential value can be removed from all concurrent read accesses
                val isSurface = exitDominantWrites.exists[
                    !(it.threadEntry.getInstantaneousControlFlows(it).empty)
                ]
                if (isSurface) {
                    val allThreadNodes = newHashSet()
                    (joinNode as Join).fork.allNext.map[target as Entry].forEach[
                        allThreadNodes.addAll(it.shallowThreadNodes)
                    ]
                    for (rem : use.get(seqReachingVO).filter[allThreadNodes.contains(it) && isSSA].filter(Assignment).filter[
                        // The first relative read must read the seq value if no init was executed
                        use.get(it.valuedObject).exists[!it.dependencies.exists[it instanceof RelativeWrite_Read]]
                    ]) {
                        val remFC = rem.assignment as FunctionCall
                        seqReachingValueParam = remFC.parameters.findFirst[expression instanceof ValuedObjectReference]
                        seqReachingVO = (seqReachingValueParam.expression as ValuedObjectReference).valuedObject
                        remFC.parameters.remove(seqReachingValueParam)
                        use.remove(seqReachingVO, asm)
                    }
                }
            }
        }
    }
    
        
    /**
     * Removes join phi node which variable is not used.
     */
    def removeUnusedJoinDefs(SCGraph scg, KielerCompilerContext context) {
        val joinDefs = context.getJoinDef(scg)
        val def = context.getDef(scg)
        val use = context.getUse(scg)
        while (joinDefs.map[valuedObject].exists[use.get(it).empty]) {
            val rem = newArrayList
            for (vo : joinDefs.map[valuedObject].filter[use.get(it).empty && !(it.eContainer as Declaration).output]) {
                val asm = def.get(vo)
                // remove def / use
                use.values.removeIf[it == asm]
                rem.add(vo)
                // remove vo
                (vo.eContainer as Declaration).valuedObjects.remove(vo)
                // remove node
                asm.allPrevious.toList.forEach[target = asm.next.target]
                asm.schedulingBlock.nodes.remove(asm)
                scg.nodes.remove(asm)
            }
            def.keySet.removeAll(rem)
            //
            joinDefs.removeIf[rem.contains(it.valuedObject)]
        }
    }
   
    /**
     * Remove SSA functions with only one parameter.
     */
    def removeTrivialSSAFunctions(SCGraph scg, KielerCompilerContext context) {
        val readJoinDefs = context.getReadAndJoinDef(scg)
        val use = context.getUse(scg)
        val removeSSAAsm = newLinkedList
        for (asm : readJoinDefs) {
            val fc = asm.assignment as FunctionCall
            if (fc.parameters.size == 1) {
                // Assumes that SSA function are only nested with depth 2 and and consists of other SSA function or VO references
                val paramExp = fc.parameters.head.expression
                if (paramExp instanceof FunctionCall) {
                    // If expression id function call remove if it has only one parameter
                    if(paramExp.parameters.size == 1) {
                        asm.assignment = paramExp.parameters.head.expression
                        removeSSAAsm += asm
                    }
                } else {
                    // remove if only one reference is parameter
                    asm.assignment = paramExp
                    removeSSAAsm += asm
                }
            }
        }
        for (rem : removeSSAAsm) {
            val replacementVO = (rem.assignment as ValuedObjectReference).valuedObject
            // Replace in usage
            for (used : use.get(rem.valuedObject)) {
                var refs = emptyList
                if(used instanceof Assignment) {
                    refs = used.assignment.allReferences
                } else if (used instanceof Conditional) {
                    refs = used.condition.allReferences
                }
                for (ref : refs) {
                    if (ref.valuedObject == rem.valuedObject) {
                        ref.valuedObject = replacementVO
                    }
                }
                // Update usage
                use.remove(rem.valuedObject, used)
                use.put(replacementVO, used)
            }
            // Fix controlflow
            rem.allPrevious.toList.forEach[target = rem.next.target]
            // Remove node
            rem.schedulingBlock.nodes.remove(rem)
            scg.nodes.remove(rem)
        }
    }

    /**
     * Remove unused ssa versions.
     */
    def removeUnusedSSAVersions(SCGraph scg, KielerCompilerContext context) {
        val use = context.getUse(scg)
        val def = context.getDef(scg)
        for (decl : scg.declarations) {
            decl.valuedObjects.removeIf[use.get(it).empty && !def.containsKey(it)]
        }
        scg.removeUnusedSSADeclarations 
    }
}
