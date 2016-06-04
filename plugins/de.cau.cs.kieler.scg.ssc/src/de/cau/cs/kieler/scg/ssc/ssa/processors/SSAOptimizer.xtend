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
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.kico.transformation.AbstractProductionTransformation
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import de.cau.cs.kieler.scg.extensions.SCGCoreExtensions
import de.cau.cs.kieler.scg.extensions.SCGThreadExtensions
import de.cau.cs.kieler.scg.ssc.features.SSAFeature
import de.cau.cs.kieler.scg.ssc.features.SSAOptFeature
import de.cau.cs.kieler.scg.ssc.ssa.SSAHelperExtensions
import javax.inject.Inject

import static de.cau.cs.kieler.scg.ssc.ssa.SSATransformation.*

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.scg.Join
import de.cau.cs.kieler.scg.Exit
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.RelativeWrite_Read

/**
 * The SSA transformation for SCGs
 * 
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
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
//    override getId() {
//        return "scg.ssa.optimizer"
//    }
//
//    override getName() {
//        return "SSA Optimizer"
//    }
    // -------------------------------------------------------------------------
    @Inject
    extension SSAHelperExtensions
    @Inject
    extension SCGControlFlowExtensions
    @Inject
    extension AnnotationsExtensions
    @Inject
    extension KExpressionsValuedObjectExtensions
    @Inject
    extension SCGThreadExtensions
    @Inject
    extension SCGCoreExtensions

    // -------------------------------------------------------------------------
//    def SCGraph process(SCGraph scg, KielerCompilerContext context) {
    def SCGraph transform(SCGraph scg, KielerCompilerContext context) {
        // Definitions
        val readDefs = context.getReadDef(scg)
        val joinDefs = context.getJoinDef(scg)
        val readJoinDefs = newHashSet
        readJoinDefs += readDefs
        readJoinDefs += joinDefs
        // Build dominator tree
        val dt = context.getDominatorTree(scg)
        // Find shared variables
        val sharedVariables = context.getsharedVariables(scg)
        val sharedVariableStart = context.getsharedVariableStart(scg)

        val use = HashMultimap.<ValuedObject, Node>create
        val def = <ValuedObject, Assignment>newHashMap
        // Analyse graph for def use
        for (node : scg.nodes) {
            if (node instanceof Assignment) {
                if (!(node.valuedObject.eContainer as Declaration).output) {
                    def.put(node.valuedObject, node)
                }
                node.assignment.allReferences.map[valuedObject].forEach [
                    use.put(it, node)
                ]
            } else if (node instanceof Conditional) {
                node.condition.allReferences.map[valuedObject].forEach [
                    use.put(it, node)
                ]
            }
        }

        // Remove psi and pi if nodes are in the same BB
//        for (asm : readJoinDefs) {
//            val fc = asm.assignment as FunctionCall
//            val psi = fc.ssaParameterFunction(PSI_SYMBOL)
//            if (psi != null) {
//                val psiRefAsmBlocks = psi.parameters.map[expression as ValuedObjectReference].map[valuedObject].map[def.get(it)].groupBy[basicBlock]
//                for (blockAsmListPair : psiRefAsmBlocks.entrySet) {
//                    val asmList = blockAsmListPair.value
//                    val bb = blockAsmListPair.key
//                    if (asmList.size > 1) {
//                        val bbNodes = bb.nodes
//                        val seqAsm = asmList.sortBy[bbNodes.indexOf(it)]
//                        for (ignore : seqAsm.take(seqAsm.size - 1).map[valuedObject]) {
//                            val ignoreUse = HashMultimap.create
//                            for (ignoredUse : use.get(ignore)) {
//                                if (bbNodes.contains(ignoredUse)) {
//                                    val useNodeIndex = bbNodes.indexOf(ignoredUse)
//                                    val seqDominantNode = seqAsm.findLast[bbNodes.indexOf(it) < useNodeIndex]
//                                    val refs = ignoredUse.eAllContents.filter(ValuedObjectReference).toMap[valuedObject]
//                                    if (refs.containsKey(seqDominantNode.valuedObject)) {
//                                        // remove parameter
//                                        refs.get(ignore).eContainer.remove
//                                        ignoreUse.remove(ignore, ignoredUse)
//                                    }
//                                } else {
//                                    val seqDominantNode = seqAsm.last
//                                    val refs = ignoredUse.eAllContents.filter(ValuedObjectReference).toMap[valuedObject]
//                                    if (refs.containsKey(seqDominantNode.valuedObject)) {
//                                        // remove parameter
//                                        refs.get(ignore).eContainer.remove
//                                        ignoreUse.remove(ignore, ignoredUse)
//                                    }
//                                }
//                            }
//                            ignoreUse.entries.forEach[use.remove(key,value)]
//                        }
//                    }
//                }
//            }
//            val pi = fc.ssaParameterFunction(PI_SYMBOL)
//            if (pi != null) {
//                val piRefAsmBlocks = pi.parameters.map[expression as ValuedObjectReference].map[valuedObject].map[def.get(it)].groupBy[basicBlock]
//                for (blockAsmListPair : piRefAsmBlocks.entrySet) {
//                    val asmList = blockAsmListPair.value
//                    val bb = blockAsmListPair.key
//                    if (asmList.size > 1) {
//                        val bbNodes = bb.nodes
//                        val seqAsm = asmList.sortBy[bbNodes.indexOf(it)]
//                        for (ignore : seqAsm.take(seqAsm.size - 1).map[valuedObject]) {
//                            for (ignoredUse : use.get(ignore)) {
//                                if (!bbNodes.contains(ignoredUse)) {
//                                    val seqDominantNode = seqAsm.last
//                                    val refs = ignoredUse.eAllContents.filter(ValuedObjectReference).toMap[valuedObject]
//                                    if (refs.containsKey(seqDominantNode.valuedObject)) {
//                                        // remove parameter
//                                        refs.get(ignore).eContainer.remove
//                                        use.remove(ignore, ignoredUse)
//                                    }
//                                }
//                            }
//                        }
//                    }
//                }
//            }
//        }

        // TODO Schedule Sequential access to updates
        // Is this possible ?

        // if any assignment in any thread dominates the exit node, the sequential value can never reach the join and can be removed
        for (asm : joinDefs) {
            var Node joinNode = asm
            while(!(joinNode instanceof Join)) {
                joinNode = joinNode.allPrevious.head.eContainer as Node
            }
            val exitBBs = joinNode.allPrevious.map[eContainer as Exit].map[basicBlock].toSet
            val fc = asm.assignment as FunctionCall
            val refVO = newArrayList
            val psi = fc.ssaParameterFunction(PSI_SYMBOL)
            if (psi != null) {
                refVO.addAll(psi.parameters.map[expression as ValuedObjectReference].map[valuedObject])
            }
            val pi = fc.ssaParameterFunction(PI_SYMBOL)
            if (pi != null) {
                refVO.addAll(pi.parameters.map[expression as ValuedObjectReference].map[valuedObject])
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
        
        
        // Removed unused defs
        // TODO only works with preserved IO otherwise the complete program is cleared because nobody reads the output
        //FIXME Currently only for join SSA assignments
//        while (def.keySet.exists[use.get(it).empty]) {
        while (joinDefs.map[valuedObject].exists[use.get(it).empty]) {
            val rem = newArrayList
//            for (vo : def.keySet.filter[use.get(it).empty && !(it.eContainer as Declaration).output]) {
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

        // update caches
        readDefs.removeIf[it.eContainer == null]
        joinDefs.removeIf[it.eContainer == null]

        // rename VOs
        for (decl : scg.declarations.filter[isSSA]) {
            for (vo : decl.valuedObjects.indexed) {
                // TODO handle variable names which contain numbers
                vo.value.name = vo.value.name.replaceAll("[0-9]*$", "") + vo.key
            }
        }

        scg.createStringAnnotation(SSAOptFeature.ID, SSAOptFeature.ID)
        return scg

//        val sharedVariableStartFork = node.ancestorForks.findFirst[sharedVariableStart.get(vo).contains(it)]
//        val sharedDefs = newArrayList(sharedVariableStartFork.allSharedVariableAssignments(vo).filter [
//            !it.hasAnnotation(SSA)
//        ]).sortBy[scg.nodes.indexOf(it)].toList
//        // Seq filter seq following
//        // TODO consider loops
//        sharedDefs.removeIf [ rem |
//            val nodeBB = node.basicBlock
//            val remBB = rem.basicBlock
//            if (nodeBB == remBB) {
//                var next = node
//                while (next.allNext.size == 1) {
//                    next = next.allNext.map[target].head
//                    if (next == remBB) {
//                        return true
//                    }
//                    if (next.basicBlock != nodeBB) {
//                        return false
//                    }
//                }
//                return false
//            } else {
//                return dt.isDom(nodeBB, remBB)
//            }
//        ]
//        // IUR filter update before initialize
//        if (node instanceof Assignment) {
//            // TODO consider loops
//            sharedDefs.remove(node)
//            sharedDefs.removeIf [ rem |
//                node.dependencies.exists[target == rem && it instanceof AbsoluteWrite_RelativeWrite]
//            ]
//        }
    }


}
