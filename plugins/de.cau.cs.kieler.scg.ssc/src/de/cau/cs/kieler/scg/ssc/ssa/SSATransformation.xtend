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
import de.cau.cs.kieler.core.annotations.Annotatable
import de.cau.cs.kieler.core.annotations.StringAnnotation
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
import de.cau.cs.kieler.scg.DataDependency
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

import static extension com.google.common.base.Predicates.*
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.scg.ssc.ssa.processors.SSAOptimizer
import static de.cau.cs.kieler.scg.ssc.ssa.SSAHelperExtensions.*
import de.cau.cs.kieler.scg.ssc.ssa.processors.SeqConcTransformer

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
    

    public static val PHI_SYMBOL = "\u03A6"
    public static val PSI_SYMBOL = "\u03A8"
    public static val PI_SYMBOL = "\u03A0"
    public static val PROTECTED = "scg.ssa.renaming.protected"

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
    extension SSAHelperExtensions

    @Inject
    extension SSAOptimizer ssaOptimizer
    
    @Inject
    extension SeqConcTransformer seqConc

    
    // -------------------------------------------------------------------------

    def SCGraph transform(SCGraph scg, KielerCompilerContext context) {
        // It is expected that this node is an entry node.
        val entryNode = scg.nodes.head
        if (!(entryNode instanceof Entry) || scg.basicBlocks.head.schedulingBlocks.head.nodes.head != entryNode) {
            throw new UnsupportedSCGException(
                "The SSA analysis expects an entry node as first node in the first basic block!")
        }
        val entryBB = scg.basicBlocks.head

//TODO        scg.preserveOutput

        // ---------------
        // 1. Placing Phi
        // ---------------
        // Build dominator tree
        val dt = context.getDominatorTree(scg)
        // Find shared variables
        val sharedVariables = context.getsharedVariables(scg)
        val sharedVariableStart = context.getsharedVariableStart(scg)
        // Find definitions
        val defsite = context.getDefsite(scg)
        // map for saving parameter references
        val ssaReferences = HashMultimap.<Assignment, Parameter>create

        val seqDef = scg.placePhi(dt, defsite, sharedVariables)
        context.storeSeqDef(scg, seqDef)
        val joinDef = scg.placeSharedJoin(ssaReferences, sharedVariables, sharedVariableStart)
        context.storeJoinDef(scg, joinDef)
        val readDef = scg.placeSharedRead(dt, ssaReferences, sharedVariables, sharedVariableStart)
        context.storeReadDef(scg, readDef)

        // ---------------
        // 2. Renaming
        // ---------------
        val ssaDeclarations = HashBiMap.create(scg.declarations.size)
        for (decl : scg.declarations) {
            for (vo : decl.valuedObjects) {
                ssaDeclarations.put(vo, createDeclaration => [
                    markSSA
                    type = decl.type
                    valuedObjects += vo.copy
                ])
            }
        }
        scg.declarations.addAll(ssaDeclarations.values)

        // rename
        entryBB.rename(dt, ssaDeclarations, ssaReferences, sharedVariables, sharedVariableStart)
//TODO         scg.preserveInputValues
//TODO         scg.preservePreValues

        // rename VOs
        for (decl : ssaDeclarations.values) {
            for (vo : decl.valuedObjects.indexed) {
                // TODO handle variable names which contain numbers
                vo.value.name = vo.value.name.replaceAll("[0-9]*$", "") + vo.key
            }
        }

        // TODO remove unused declarations maybe fix rename vo initalization ecpression
        // TODO dont if scg has pause
//        for (declPair : ssaDeclarations.entrySet) {
//            if (declPair.value.valuedObjects.size > 1) {
//                val decl = declPair.key.eContainer as Declaration
//                decl.valuedObjects.remove(declPair.key)
//                if (decl.valuedObjects.empty) {
//                    scg.declarations.remove(decl)
//                }
//            } else {
//                declPair.value.valuedObjects.head.name = declPair.key.name
//                val decl = declPair.key.eContainer as Declaration
//                decl.valuedObjects.remove(declPair.key)
//                if (decl.valuedObjects.empty) {
//                    scg.declarations.remove(decl)
//                }
//            }
//        }

        // FIXME Post Processors
//        ssaOptimizer.process(scg, context)
//        seqConc.process(scg, context)
        
        scg.createStringAnnotation(SSAFeature.ID, SSAFeature.ID)
        return scg
    }

    // -------------------------------------------------------------------------
    
    private def Collection<Assignment> placePhi(SCGraph scg, DominatorTree dt, Multimap<ValuedObject, BasicBlock> defsite,
        Multimap<Fork, ValuedObject> sharedVariables) {
        val placedAssignment = newLinkedHashSet
        val hasPhi = newHashMap
        val work = newHashMap
        // Init with bb and 0
        hasPhi.putAll(scg.basicBlocks.toInvertedMap[0])
        work.putAll(hasPhi)

        var iterCount = 0
        val w = <BasicBlock>newLinkedList
        for (vo : scg.declarations.allValuedObjectsOrdered.reverseView) {
            iterCount++
            for (n : defsite.get(vo)) {
                work.put(n, iterCount)
                w.push(n)
                while (!w.empty) {
                    w.pop
                    for (m : dt.getDominanceFrontiers(n)) {
                        // insert phi
                        if (hasPhi.get(m) < iterCount) {
                            // Find first node in BB
                            var bbHead = m.firstNode
                            if (!(bbHead instanceof Join) && !sharedVariables.get(bbHead.ancestorFork).contains(vo)) {
                                // Create Phi assignment
                                val asm = createAssignment
                                val bbHeadSB = bbHead.schedulingBlock
                                bbHeadSB.nodes.add(bbHeadSB.nodes.indexOf(bbHead), asm)
                                scg.nodes.add(scg.nodes.indexOf(bbHead), asm)
                                placedAssignment.add(asm)
                                asm.valuedObject = vo
                                asm.markSSA(PHI)
                                asm.assignment = createFunctionCall => [
                                    functionName = PHI_SYMBOL
                                // handled in renameing
                                // m.predecessors.forEach[fc.createParameter(vo.reference)]
                                ]

                                // Insert before
                                bbHead.allPrevious.toList.forEach[target = asm]
                                asm.createControlFlow.target = bbHead
                                hasPhi.put(m, iterCount)
                                if (work.get(m) < iterCount) {
                                    work.put(m, iterCount)
                                    w.add(m)
                                }
                            }
                        }
                    }
                }
            }
        }
        return placedAssignment
    }

    private def Collection<Assignment> placeSharedJoin(SCGraph scg, Multimap<Assignment, Parameter> ssaReferences,
        Multimap<Fork, ValuedObject> sharedVariables, Multimap<ValuedObject, Fork> sharedVariableStart) {
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
                    val fc = createFunctionCall
                    fc.functionName = PHI_SYMBOL
                    // This is the sequential reaching def
                    fc.createParameter(vo.reference)
                    // IU parameter
                    val ifc = createFunctionCall
                    ifc.functionName = PI_SYMBOL
                    val ufc = createFunctionCall
                    ufc.functionName = PSI_SYMBOL
                    for (sharedAssignment : join.fork.allSharedVariableAssignments(vo).filter[!isSSA].
                        sortBy[scg.nodes.indexOf(it)]) {
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

    private def Collection<Assignment> placeSharedRead(SCGraph scg, DominatorTree dt, Multimap<Assignment, Parameter> ssaReferences,
        Multimap<Fork, ValuedObject> sharedVariables, Multimap<ValuedObject, Fork> sharedVariableStart) {
        val voOrder = scg.declarations.allValuedObjectsOrdered
        val placedNodes = LinkedHashMultimap.create
        for (node : scg.nodes.filter(instanceOf(Assignment).or(instanceOf(Conditional))).filter[!isSSA]) {
            for (vo : sharedVariables.get(node.ancestorFork).sortBy[voOrder.indexOf(it)]) {
                val expr = node.eContents.filter(Expression).head
                if (expr.allReferences.exists[valuedObject == vo]) {
                    val sharedVariableStartFork = node.ancestorForks.findFirst[sharedVariableStart.get(vo).contains(it)]
                    val sharedDefs = sharedVariableStartFork.allSharedVariableAssignments(vo).filter [!isSSA].sortBy[scg.nodes.indexOf(it)]
                    sharedDefs.remove(node)
                    if (!sharedDefs.empty) {
                        // Create Pi assignment
                        val asm = createAssignment
                        placedNodes.put(node, asm)
                        node.schedulingBlock.nodes.add(node.schedulingBlock.nodes.indexOf(node), asm)
                        asm.valuedObject = vo
                        asm.markSSA(READ)
                        val fc = createFunctionCall
                        fc.functionName = PHI_SYMBOL
                        // This is the sequential reaching def
                        fc.createParameter(vo.reference)
                        // IU Parameter
                        val ifc = createFunctionCall
                        ifc.functionName = PI_SYMBOL
                        val ufc = createFunctionCall
                        ufc.functionName = PSI_SYMBOL
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

    private def void rename(BasicBlock start, DominatorTree dt, BiMap<ValuedObject, Declaration> ssaDecl,
        Multimap<Assignment, Parameter> ssaReferences, Multimap<Fork, ValuedObject> sharedVariables,
        Multimap<ValuedObject, Fork> sharedVariableStart) {
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
    // TODO otheriwse cuncomment
//        var bbHead = block.schedulingBlocks.head.nodes.head
//        var bbHeadPrev = bbHead.allPrevious.map[eContainer as Node].head
//        while (bbHead.allPrevious.size == 1 && bbHeadPrev.basicBlock == m && !bbHeadPrev.hasAnnotation(SSA)) {
//            bbHead = bbHeadPrev
//            bbHeadPrev = bbHead.allPrevious.map[eContainer as Node].head
//        }
//        return bbHead
    }
}
    