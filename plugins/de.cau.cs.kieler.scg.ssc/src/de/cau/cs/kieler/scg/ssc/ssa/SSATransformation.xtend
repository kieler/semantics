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

import com.google.common.base.Function
import com.google.common.collect.BiMap
import com.google.common.collect.HashBiMap
import com.google.common.collect.HashMultimap
import com.google.common.collect.LinkedHashMultimap
import com.google.common.collect.Multimap
import de.cau.cs.kieler.core.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.core.kexpressions.Declaration
import de.cau.cs.kieler.core.kexpressions.Expression
import de.cau.cs.kieler.core.kexpressions.FunctionCall
import de.cau.cs.kieler.core.kexpressions.Parameter
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.core.util.Pair
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.kico.transformation.AbstractProductionTransformation
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.BasicBlock
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Exit
import de.cau.cs.kieler.scg.Fork
import de.cau.cs.kieler.scg.Join
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.RelativeWrite_Read
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
import java.util.Collection
import java.util.Deque
import java.util.LinkedList
import javax.inject.Inject

import static com.google.common.collect.Lists.*
import static com.google.common.collect.Maps.*
import static de.cau.cs.kieler.scg.ssc.ssa.SSACoreExtensions.*
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
    extension KExpressionsCreateExtensions

    @Inject
    extension KExpressionsDeclarationExtensions

    @Inject
    extension AnnotationsExtensions

    @Inject
    extension SSACoreExtensions

    @Inject
    extension SSACacheExtensions

    @Inject
    extension SSAVariablePreserverExtensions

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

        // ---------------
        // 1. Preserve output behavior
        // ---------------
        scg.preserveOutput(entryNode as Entry)

        // ---------------
        // 2. Place Phi
        // ---------------
        val seqDef = scg.placePhi(context)
        context.storeSeqDef(scg, seqDef)

        // ---------------
        // 3. Place Phi at thread Join
        // ---------------
        val joinDef = scg.placeSharedJoin(context, ssaReferences)
        context.storeJoinDef(scg, joinDef)

        // ---------------
        // 4. Place Phi at thread Read access on shared variables
        // ---------------
        val readDef = scg.placeSharedRead(context, ssaReferences)
        context.storeReadDef(scg, readDef)

        // ---------------
        // 5. Renaming
        // ---------------
        scg.rename(context, entryBB, scg.createSSADeclarations, ssaReferences)
        // Order phi nodes to match the sequential phi definition by rvh
        for (phi : seqDef) {
            val fc = (phi.assignment as FunctionCall)
            val sorted = fc.parameters.sortBy[SSAVersion]
            fc.parameters.clear
            fc.parameters.addAll(sorted)
        }

        // ---------------
        // 6. Read Pre or Input Values
        // ---------------
        scg.preservePreValues
        scg.preserveInputVariables

        // ---------------
        // 7. Read Pre Values
        // ---------------           
        scg.removeUnusedSSADeclarations

        // ---------------
        // 8. Update SSA VO version numbering
        // ---------------   
        scg.updateSSAVersions

        // FIXME Post Processors: optimizer + seq/conc
        scg.createStringAnnotation(SSAFeature.ID, SSAFeature.ID)
        return scg
    }

    // -------------------------------------------------------------------------
    /**
     * Places phi nodes.
     */
    private def Collection<Assignment> placePhi(SCGraph scg, KielerCompilerContext context) {
        val dt = context.getDominatorTree(scg)
        val defsite = context.getDefsite(scg)
        val sharedVariables = context.getsharedVariables(scg)
        val placedAssignment = newLinkedHashSet
        val hasPhi = newHashMap
        val work = newHashMap
        val workStack = <BasicBlock>newLinkedList
        var iterCount = 0
        // Init with bb and 0
        hasPhi.putAll(scg.basicBlocks.toInvertedMap[0])
        work.putAll(hasPhi)

        for (vo : scg.declarations.allValuedObjectsOrdered.reverseView) {
            iterCount++
            for (n : defsite.get(vo)) {
                work.put(n, iterCount)
                workStack.push(n)
                while (!workStack.empty) {
                    workStack.pop
                    for (m : dt.getDominanceFrontiers(n)) {
                        // insert phi
                        if (hasPhi.get(m) < iterCount) {
                            var bbHead = m.firstNode
                            // Only add phi nodes for non shared variables and in threads but not on thread join
                            if (!(bbHead instanceof Join) && !sharedVariables.get(bbHead.ancestorFork).contains(vo)) {
                                // Create Phi assignment
                                val asm = createAssignment
                                val bbHeadSB = bbHead.schedulingBlock
                                bbHeadSB.nodes.add(bbHeadSB.nodes.indexOf(bbHead), asm)
                                scg.nodes.add(scg.nodes.indexOf(bbHead), asm)
                                placedAssignment.add(asm)
                                asm.valuedObject = vo
                                asm.markSSA(PHI)
                                asm.assignment = PHI.createFunction
                                // Insert before
                                bbHead.allPrevious.toList.forEach[target = asm]
                                asm.createControlFlow.target = bbHead
                                // Add to work
                                hasPhi.put(m, iterCount)
                                if (work.get(m) < iterCount) {
                                    work.put(m, iterCount)
                                    workStack.add(m)
                                }
                            }
                        }
                    }
                }
            }
        }
        return placedAssignment
    }

    /**
     * Places phi nodes at join nodes when they are no longer shared variables 
     */
    private def Collection<Assignment> placeSharedJoin(SCGraph scg, KielerCompilerContext context,
        Multimap<Assignment, Parameter> ssaReferences) {
        val sharedVariables = context.getsharedVariables(scg)
        val sharedVariableStart = context.getsharedVariableStart(scg)
        val placedAssignment = newLinkedHashSet
        val voOrder = scg.declarations.allValuedObjectsOrdered.reverseView
        for (fork : sharedVariableStart.values.toSet) {
            val join = fork.join
            for (vo : sharedVariables.get(fork).sortBy[voOrder.indexOf(it)]) {
                if (sharedVariableStart.get(vo).contains(join.fork)) {
                    // Create Psi assignment
                    val asm = createAssignment
                    scg.nodes.add(scg.nodes.indexOf(join.allNext.map[target].head), asm)
                    join.schedulingBlock.nodes.add(1, asm)
                    placedAssignment.add(asm)
                    asm.valuedObject = vo
                    asm.markSSA(JOIN)
                    val fc = JOIN.createFunction
                    // This is the sequential reaching def
                    fc.createParameter(vo.reference)
                    // IU parameter
                    val ifc = INIT.createFunction
                    val ufc = UPDATE.createFunction
                    for (sharedAssignment : join.fork.allSharedVariableAssignments(vo).filter[!isSSA].sortBy [
                        scg.nodes.indexOf(it)
                    ]) {
                        val f = if (sharedAssignment.dependencies.exists[!(it instanceof RelativeWrite_Read)]) {
                                ifc
                            } else {
                                ufc
                            }
                        val param = createParameter
                        param.expression = vo.reference
                        f.parameters += param
                        ssaReferences.put(sharedAssignment, param)
                    }
                    // Add parameter if not empty
                    if (!ifc.parameters.empty) {
                        val param = createParameter
                        param.expression = ifc
                        fc.parameters += param
                    }
                    if (!ufc.parameters.empty) {
                        val param = createParameter
                        param.expression = ufc
                        fc.parameters += param
                    }
                    asm.assignment = fc

                    // Insert after
                    val cf = join.allNext.head
                    asm.createControlFlow.target = cf.target
                    cf.target = asm
                }
            }
        }
        return placedAssignment
    }

    private def Collection<Assignment> placeSharedRead(SCGraph scg, KielerCompilerContext context,
        Multimap<Assignment, Parameter> ssaReferences) {
        val sharedVariables = context.getsharedVariables(scg)
        val sharedVariableStart = context.getsharedVariableStart(scg)
        val voOrder = scg.declarations.allValuedObjectsOrdered
        val placedNodes = LinkedHashMultimap.create
        for (node : scg.nodes.filter(instanceOf(Assignment).or(instanceOf(Conditional))).filter[!isSSA]) {
            for (vo : sharedVariables.get(node.ancestorFork).sortBy[voOrder.indexOf(it)]) {
                val expr = node.eContents.filter(Expression).head
                if (expr.allReferences.exists[valuedObject == vo]) {
                    val sharedVariableStartFork = node.ancestorForks.findFirst[sharedVariableStart.get(vo).contains(it)]
                    val sharedDefs = sharedVariableStartFork.allSharedVariableAssignments(vo).filter[!isSSA].sortBy [
                        scg.nodes.indexOf(it)
                    ]
                    // remove self
                    sharedDefs.remove(node)
                    if (!sharedDefs.empty) {
                        // Create Pi assignment
                        val asm = createAssignment
                        placedNodes.put(node, asm)
                        node.schedulingBlock.nodes.add(node.schedulingBlock.nodes.indexOf(node), asm)
                        asm.valuedObject = vo
                        asm.markSSA(READ)
                        val fc = READ.createFunction
                        // This is the sequential reaching def
                        fc.createParameter(vo.reference)
                        // IU Parameter
                        val ifc = INIT.createFunction
                        val ufc = UPDATE.createFunction
                        for (sharedAssignment : sharedDefs) {
                            val f = if (sharedAssignment.dependencies.exists[!(it instanceof RelativeWrite_Read)]) {
                                    ifc
                                } else {
                                    ufc
                                }
                            val param = createParameter
                            param.expression = vo.reference
                            f.parameters += param
                            ssaReferences.put(sharedAssignment, param)
                        }
                        // Add parameter if not empty
                        if (!ifc.parameters.empty) {
                            val param = createParameter
                            param.expression = ifc
                            fc.parameters += param
                        }
                        if (!ufc.parameters.empty) {
                            val param = createParameter
                            param.expression = ufc
                            fc.parameters += param
                        }
                        asm.assignment = fc

                        // Insert before
                        node.allPrevious.toList.forEach[target = asm]
                        asm.createControlFlow.target = node
                    }
                }
            }
        }
        for (n : placedNodes.keySet) {
            scg.nodes.addAll(scg.nodes.indexOf(n), placedNodes.get(n))
        }
        return placedNodes.values
    }

    private def void rename(SCGraph scg, KielerCompilerContext context, BasicBlock start,
        BiMap<ValuedObject, Declaration> ssaDecl, Multimap<Assignment, Parameter> ssaReferences) {
        val dt = context.getDominatorTree(scg)
        val sharedVariables = context.getsharedVariables(scg)
        val sharedVariableStart = context.getsharedVariableStart(scg)
        val versionStack = <ValuedObject, LinkedList<Integer>>newHashMap
        val versionStackFunc = [ ValuedObject vo |
            var voStack = versionStack.get(vo)
            if (voStack == null) {
                voStack = newLinkedList(0)
                versionStack.put(vo, voStack)
            }
            return voStack
        ]
        recursiveRename(start, dt, versionStackFunc, ssaDecl, ssaReferences, sharedVariables, sharedVariableStart,
            HashMultimap.create, HashMultimap.create)
    }

    private def void recursiveRename(BasicBlock block, DominatorTree dt, Function<ValuedObject, Deque<Integer>> stack,
        BiMap<ValuedObject, Declaration> ssaDecl, Multimap<Assignment, Parameter> ssaReferences,
        Multimap<Fork, ValuedObject> sharedVariables, Multimap<ValuedObject, Fork> sharedVariableStart,
        Multimap<Fork, Pair<ValuedObject, Integer>> incomingVersions,
        Multimap<Join, Pair<ValuedObject, Integer>> sequntialVersionPropagationJoin) {
        val renamedDefs = <ValuedObject>newLinkedList
        for (sb : block.schedulingBlocks) {
            for (s : sb.nodes) {
                // rename variable use
                if (s.isSSA(READ)) {
                    val ref = ((s as Assignment).assignment as FunctionCall).parameters.head.
                        expression as ValuedObjectReference
                    val vo = ref.valuedObject
                    val sharedVariableStartFork = s.ancestorForks.findFirst [
                        sharedVariableStart.get(vo).contains(it)
                    ]
                    ref.valuedObject = ssaDecl.get(vo).valuedObjects.get(
                        incomingVersions.get(sharedVariableStartFork).findFirst[first == vo].second)
                } else if (s.isSSA(JOIN)) {
                    val ref = ((s as Assignment).assignment as FunctionCall).parameters.head.
                        expression as ValuedObjectReference
                    val vo = ref.valuedObject
                    var join = s.allPrevious.map[eContainer as Node].head
                    while (!(join instanceof Join)) {
                        join = join.allPrevious.map[eContainer as Node].head
                    }
                    ref.valuedObject = ssaDecl.get(vo).valuedObjects.get(
                        incomingVersions.get((join as Join).fork).findFirst[first == vo].second)
                } else if (!s.isSSA && (s instanceof Assignment || s instanceof Conditional)) {
                    val expr = s.eContents.filter(Expression).head
                    for (ref : expr.allReferences) {
                        val vo = ref.valuedObject
                        ref.valuedObject = ssaDecl.get(vo).valuedObjects.get(stack.get(vo).peek)
                    }
                }
                if (s instanceof Assignment) {
                    if (!s.outputPreserver) {
                        // create new version
                        var vo = s.valuedObject
                        val version = ssaDecl.get(vo).valuedObjects.size
                        val newVO = vo.copy
                        ssaDecl.get(vo).valuedObjects.add(newVO)
                        stack.get(vo).push(version)
                        s.valuedObject = newVO
                        renamedDefs.add(vo)
                        for (param : ssaReferences.get(s)) {
                            val ref = param.expression as ValuedObjectReference
                            ref.valuedObject = newVO
                        }
                    }
                } else if (s instanceof Fork) {
                    // save incoming versions
                    incomingVersions.putAll(s, ssaDecl.keySet.map[new Pair(it, stack.get(it).peek)]) // .filter[sharedVariables.get(s).contains(it)]
                } else if (s instanceof Exit) {
                    // save outgoing version
                    val join = s.next?.target
                    if (join instanceof Join) {
                        for (voVersion : incomingVersions.get(join.fork)) {
                            if (!sharedVariables.get(join.fork).contains(voVersion.first) &&
                                voVersion.second != stack.get(voVersion.first).peek) {
                                sequntialVersionPropagationJoin.put(join,
                                    new Pair(voVersion.first, stack.get(voVersion.first).peek))
                            }
                        }
                    }
                } else if (s instanceof Join) {
                    // propagate sequential versions
                    for (voVersion : sequntialVersionPropagationJoin.get(s)) {
                        stack.get(voVersion.first).push(voVersion.second)
                        renamedDefs.add(voVersion.first)
                    }
                }
            }
        }
        for (m : dt.successors(block)) {
            for (sb : m.schedulingBlocks) {
                for (asm : sb.nodes.filter(Assignment).filter[isSSA(PHI)]) {
                    val vo = if (ssaDecl.containsKey(asm.valuedObject)) {
                            asm.valuedObject
                        } else {
                            ssaDecl.inverse.get(asm.valuedObject.declaration)
                        }
                    (asm.assignment as FunctionCall).createParameter(
                        ssaDecl.get(vo).valuedObjects.get(stack.get(vo).peek).reference)
                }
            }
        }
        val bbs = (block.eContainer as SCGraph).basicBlocks
        for (m : dt.children(block).sortBy[bbs.indexOf(it)]) {
            m.recursiveRename(dt, stack, ssaDecl, ssaReferences, sharedVariables, sharedVariableStart,
                incomingVersions, sequntialVersionPropagationJoin)
        }
        // leave version scopes
        for (vo : renamedDefs) {
            stack.get(vo).pop
        }
    }

    private def get(Function<ValuedObject, Deque<Integer>> stackFunc, ValuedObject vo) {
        return stackFunc.apply(vo)
    }

    private def allValuedObjectsOrdered(Collection<Declaration> declarations) {
        val vars = newArrayListWithExpectedSize(declarations.size)
        declarations.forEach [
            vars.addAll(it.valuedObjects)
        ]
        return vars
    }

    private def allSharedVariableAssignments(Fork fork, ValuedObject vo) {
        val list = newLinkedHashSet
        fork.allNext.map[target as Entry].map[allThreadNodes].map[values].forEach [
            forEach[
                list.addAll(it.filter(Assignment).filter[valuedObject == vo])
            ]
        ]
        return list
    }

    def firstNode(BasicBlock block) {
        // Assuming the nodes are ordered correctly
        return block.schedulingBlocks.head.nodes.head
    // TODO otheriwse uncomment
//        var bbHead = block.schedulingBlocks.head.nodes.head
//        var bbHeadPrev = bbHead.allPrevious.map[eContainer as Node].head
//        while (bbHead.allPrevious.size == 1 && bbHeadPrev.basicBlock == m && !bbHeadPrev.hasAnnotation(SSA)) {
//            bbHead = bbHeadPrev
//            bbHeadPrev = bbHead.allPrevious.map[eContainer as Node].head
//        }
//        return bbHead
    }
}
    