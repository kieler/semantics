/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.scg.ssa

import com.google.common.base.Function
import com.google.common.collect.BiMap
import com.google.common.collect.HashMultimap
import com.google.inject.Inject
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.kexpressions.Declaration
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.FunctionCall
import de.cau.cs.kieler.kexpressions.Parameter
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.kicool.compilation.Processor
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.BasicBlock
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Join
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.ScgFactory
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import de.cau.cs.kieler.scg.extensions.SCGCoreExtensions
import de.cau.cs.kieler.scg.ssa.domtree.DominatorTree
import java.util.Collection
import java.util.Deque
import java.util.LinkedList
import java.util.Map
import org.eclipse.xtext.xbase.lib.Functions.Function2

import static com.google.common.collect.Lists.*
import static com.google.common.collect.Maps.*
import static de.cau.cs.kieler.scg.ssa.SSAFunction.*

import static extension de.cau.cs.kieler.kicool.kitt.tracing.TracingEcoreUtil.*
import org.eclipse.xtend.lib.annotations.Accessors
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.OperatorType
import com.google.common.collect.Multimap
import com.google.common.collect.HashBiMap
import de.cau.cs.kieler.kexpressions.keffects.AssignOperator
import org.eclipse.xtext.xbase.lib.Functions.Function1
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.scg.Surface

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class SSATransformationExtensions {
    
    @Inject extension SCGCoreExtensions
    @Inject extension SCGControlFlowExtensions
    @Inject extension IOPreserverExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KExpressionsCreateExtensions
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension AnnotationsExtensions
    @Inject extension SSACoreExtensions
    @Inject extension KEffectsExtensions
    static val sCGFactory = ScgFactory.eINSTANCE
    
    public static val ANNOTATION_UPDATE = "de.cau.cs.kieler.scg.ssa.former.update"
    
    @Accessors var boolean SSATransformationExtensions_IGNORE_INPUTS_IN_RENAMING = false
    
    // -----------------
    // SCG Validation
    // -----------------
    
    def validateStructure(Processor<?,?> processor, SCGraph scg) {
        // It is expected that this node is an entry node.
        val entryNode = scg.nodes.head
        try {
            if (!(entryNode instanceof Entry) || scg.basicBlocks.head.schedulingBlocks.head.nodes.head != entryNode) {
                processor.environment.errors.add("The SSA analysis expects an entry node as first node in the first basic block!", entryNode)
            }
        } catch (NullPointerException npe) {
            processor.environment.errors.add("The SSA analysis expects an entry node as first node in the first basic block!", entryNode)
        }
    }
    
    def validateExpressions(Processor<?,?> processor, SCGraph scg) {
        // Check for side effects
//        val entryNode = scg.nodes.head
//        if (scg.nodes.exists[eAllContents.filter(OperatorExpression).exists[operator == OperatorType.POSTFIX_ADD || operator == OperatorType.POSTFIX_SUB]]) {
//            processor.environment.errors.add("The SSA analysis cannot handle expressions with side-effects. (v++/v--)", entryNode)
//        }
    }            

    // -----------------
    // SCG Preparation
    // -----------------
    def prepareUpdates(SCGraph scg) {
        for (asm : scg.nodes.filter(Assignment).filter[operator != AssignOperator.ASSIGN]) {
            val OperatorType op = switch (asm.operator) {
                case ASSIGNADD: OperatorType.ADD
                case ASSIGNAND: OperatorType.BITWISE_AND
                case ASSIGNDIV: OperatorType.DIV
                case ASSIGNMOD: OperatorType.MOD
                case ASSIGNMUL: OperatorType.MULT
                case ASSIGNOR: OperatorType.BITWISE_OR
                case ASSIGNSHIFTLEFT: OperatorType.SHIFT_LEFT
                case ASSIGNSHIFTRIGHT: OperatorType.SHIFT_RIGHT
                case ASSIGNSHIFTRIGHTUNSIGNED: OperatorType.SHIFT_RIGHT_UNSIGNED
                case ASSIGNSUB: OperatorType.SUB
                case ASSIGNXOR: OperatorType.BITWISE_XOR
                case POSTFIXADD: OperatorType.ADD
                case POSTFIXSUB: OperatorType.SUB
                default: throw new UnsupportedOperationException("Cannot handle assign operator: " + asm.operator)
            }
            if (asm.operator == AssignOperator.POSTFIXADD || asm.operator == AssignOperator.POSTFIXSUB) {
                asm.expression = createOperatorExpression(op) => [
                    subExpressions += asm.reference.copy
                    subExpressions += createIntValue(1)           
                ]
            } else {
                asm.expression = createOperatorExpression(op) => [
                    subExpressions += asm.reference.copy
                    subExpressions += asm.expression           
                ]
            }
            asm.annotations += createStringAnnotation(ANNOTATION_UPDATE, asm.operator.getName())
            asm.operator = AssignOperator.ASSIGN
        }
    }
    
    def isTransformedUpdate(Assignment asm) {
        return asm.hasAnnotation(ANNOTATION_UPDATE)
    }
    
    def restoreUpdates(SCGraph scg) {
        for (asm : scg.nodes.filter(Assignment).filter[isTransformedUpdate]) {
            val AssignOperator op = AssignOperator.getByName(asm.getStringAnnotationValue(ANNOTATION_UPDATE))
            if (op !== null) {
                val exp = asm.expression
                if (exp instanceof OperatorExpression) {
                    if (exp.subExpressions.size == 2 && exp.subExpressions.head instanceof ValuedObjectReference) {
                        if (op == AssignOperator.POSTFIXADD || op == AssignOperator.POSTFIXSUB) {
                            asm.expression = exp.subExpressions.head
                        } else {
                            asm.expression = exp.subExpressions.get(1)
                        }
                        asm.removeAnnotations(ANNOTATION_UPDATE)
                        asm.operator = op
                    }
                }
            }
        }
    }
    
    
    // -----------------
    // General PHI placement
    // -----------------
    def getPhiPlacer() {
        return [ ValuedObject vo, Node bbHead |
            // Create Phi assignment
            val asm = sCGFactory.createAssignment
            val scg = bbHead.eContainer as SCGraph
            val bbHeadSB = bbHead.schedulingBlock
            asm.valuedObject = vo
            asm.markSSA(PHI)
            asm.expression = PHI.createFunction
            if (bbHead instanceof Join) {
                // Insert after
                val cf = bbHead.allNext.head
                asm.createControlFlow.target = cf.target
                cf.target = asm

                scg.nodes.add(scg.nodes.indexOf(bbHead) + 1, asm)
                bbHeadSB.nodes.add(bbHeadSB.nodes.indexOf(bbHead) + 1, asm)
            } else {
                // Insert before
                bbHead.allPrevious.toList.forEach[target = asm]
                asm.createControlFlow.target = bbHead
                
                scg.nodes.add(scg.nodes.indexOf(bbHead), asm)
                bbHeadSB.nodes.add(bbHeadSB.nodes.indexOf(bbHead), asm)
            }
            
            return asm
        ]
    }
    
    /**
     * Places phi nodes.
     */
    def Collection<Assignment> placePhi(DominatorTree dt) {
        return dt.place(phiPlacer)
    }
    
    /**
     * Places nodes.
     */
    def Collection<Assignment> place(DominatorTree dt, Function2<ValuedObject, Node, Assignment> placer) {
        val scg = dt.scg
        val placedAssignment = newLinkedHashSet
        val hasPhi = HashMultimap.create
        val work = newLinkedList
        val defsite = scg.defSite

        for (vo : scg.variableDeclarations.filter[!hasAnnotation(SSACoreExtensions.ANNOTATION_IGNORE_DECLARATION)].map[valuedObjects].flatten.toList.reverseView) {
            work.addAll(defsite.get(vo))
            while (!work.empty) {
                val workBlock = work.pop
                for (frontierBlock : dt.getDominanceFrontiers(workBlock)) {
                    // insert phi
                    if (!hasPhi.containsEntry(vo, frontierBlock) && !frontierBlock.deadBlock) {
                        var bbHead = frontierBlock.firstNode
                        
                        val asm = placer.apply(vo, bbHead)
                        placedAssignment.add(asm)
                        
                        // Add to work
                        hasPhi.put(vo, frontierBlock)
                        if (!defsite.get(vo).contains(frontierBlock)) {
                            work.add(frontierBlock)
                        }
                    }
                }
            }
        }

        return placedAssignment
    }

    // -----------------
    // General Renaming
    // -----------------
    def rename(DominatorTree dt, BasicBlock start, BiMap<ValuedObject, VariableDeclaration> ssaDecl, Function1<Assignment, Boolean> ssaPredicate) {
        val placedParameter = <Parameter, BasicBlock>newHashMap
        val versionStack = <ValuedObject, LinkedList<Integer>>newHashMap
        val versionStackFunc = [ ValuedObject vo |
            var voStack = versionStack.get(vo)
            if (voStack === null) {
                voStack = newLinkedList(0)
                versionStack.put(vo, voStack)
            }
            return voStack
        ]
        recursiveRename(start, dt, versionStackFunc, ssaPredicate, ssaDecl, placedParameter)
        
        return placedParameter
    }
    
    protected def void recursiveRename(BasicBlock block, DominatorTree dt, Function<ValuedObject, Deque<Integer>> stack, Function1<Assignment, Boolean> ssaPredicate, BiMap<ValuedObject, VariableDeclaration> ssaDecl, Map<Parameter, BasicBlock> parameter) {
        val renamedDefs = <ValuedObject>newLinkedList
        for (sb : block.schedulingBlocks) {
            for (n : sb.nodes) {
                if (!n.isSSA && (n instanceof Assignment || n instanceof Conditional) && !n.isInputPreserver) {
                    val expr = if (n instanceof Assignment) n.asAssignment.expression else n.asConditional.condition
                    for (ref : expr.allReferences.filter[(!valuedObject.variableDeclaration.input || !SSATransformationExtensions_IGNORE_INPUTS_IN_RENAMING) && !valuedObject.declaration.hasAnnotation(SSACoreExtensions.ANNOTATION_IGNORE_DECLARATION)]) {//FIXME ignored input
                        val vo = ref.valuedObject
                        ref.valuedObject = ssaDecl.get(vo).valuedObjects.get(stack.get(vo).peek)
                    }
                }
                if (n instanceof Assignment) {
                    // create new version
                    var vo = n.valuedObject
                    if (vo !== null && !vo.declaration.hasAnnotation(SSACoreExtensions.ANNOTATION_IGNORE_DECLARATION)) {
                        val version = ssaDecl.get(vo).valuedObjects.size
                        val newVO = vo.copy
                        ssaDecl.get(vo).valuedObjects.add(newVO)
                        stack.get(vo).push(version)
                        n.valuedObject = newVO
                        renamedDefs.add(vo)
                    }
                }
            }
        }
        for (m : dt.successors(block)) {
            for (sb : m.schedulingBlocks) {
                for (asm : sb.nodes.filter(Assignment).filter(ssaPredicate)) {
                    val vo = if (ssaDecl.containsKey(asm.valuedObject)) {
                        asm.valuedObject
                    } else {
                        ssaDecl.inverse.get(asm.valuedObject.declaration)
                    }
                    (asm.expression as FunctionCall).parameters += createParameter => [
                        expression = ssaDecl.get(vo).valuedObjects.get(stack.get(vo).peek).reference
                        parameter.put(it, block)
                    ]
                }
            }
        }
        val bbs = (block.eContainer as SCGraph).basicBlocks
        for (m : dt.children(block).sortBy[bbs.indexOf(it)]) {
            m.recursiveRename(dt, stack, ssaPredicate, ssaDecl, parameter)
        }
        // leave version scopes
        for (vo : renamedDefs) {
            stack.get(vo).pop
        }
    }
    
    protected def get(Function<ValuedObject, Deque<Integer>> stackFunc, ValuedObject vo) {
        return stackFunc.apply(vo)
    }

    protected def allValuedObjectsOrdered(Collection<Declaration> declarations) {
        val vars = newArrayListWithExpectedSize(declarations.size)
        declarations.forEach [
            vars.addAll(it.valuedObjects)
        ]
        return vars
    }

    def firstNode(BasicBlock block) {
        // Assuming the nodes are ordered correctly
        return block.schedulingBlocks.head.nodes.head
// FIXME otherwise uncomment
//        var bbHead = block.schedulingBlocks.head.nodes.head
//        var bbHeadPrev = bbHead.allPrevious.map[eContainer as Node].head
//        while (bbHead.allPrevious.size == 1 && bbHeadPrev.basicBlock == m && !bbHeadPrev.hasAnnotation(SSA)) {
//            bbHead = bbHeadPrev
//            bbHeadPrev = bbHead.allPrevious.map[eContainer as Node].head
//        }
//        return bbHead
    }
    
    def defSite(SCGraph scg) {
        val defsite = HashMultimap.<ValuedObject, BasicBlock>create
        for (asm : scg.nodes.filter(Assignment).filter[valuedObject !== null]) {
            defsite.put(asm.valuedObject, asm.basicBlock)
        }
        return defsite
    }
    
    // -----------------
    // Transformation for PHI nodes
    // -----------------
    def Multimap<Assignment, Assignment> placeMoveInstructions(SCGraph scg, Map<Parameter, BasicBlock> parameterMapping) {
        val placed = HashMultimap.create
        for (node : scg.nodes.filter(Assignment).filter[isSSA(PHI)].toList) {
            val bb = node.basicBlock
            val parameter = node.expression.eContents.filter(Parameter).toList
            for (entry : (bb.firstNode.incoming.groupBy[(it.eContainer as Node).basicBlock] => [entrySet.removeIf[!parameterMapping.containsKey(key)]]).entrySet) {
                val link = entry.value.head
                val linkBB = entry.key
                val linkNode = (link.eContainer as Node)
                val linkSB = linkNode.schedulingBlock
                scg.nodes += ScgFactory.eINSTANCE.createAssignment => [
                    markSSA(PHI_ASM)
                    valuedObject = node.valuedObject
                    expression = parameter.findFirst[parameterMapping.get(it) == linkBB].expression.copy
                    
                    // Add new asm to SB
                    if (linkSB !== null) {
                        linkSB.nodes.add(linkSB.nodes.indexOf(linkNode), it)
                    }
                    
                    // Fix CF
                    link.target = it
                    next = createControlFlow => [
                        target = node.next.target
                    ]
                    
                    placed.put(node, it)
                ]
            }
        }
        return placed
    }
    
    
    // -----------------
    // Helper
    // -----------------
    def boolean onlyImmediatePathsTo(Node n1, Node n2) {
        // TODO properly implement
        // For now very conservative assumption
        return (n1.eContainer as SCGraph).nodes.forall[!(it instanceof Surface)]
    }
}