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
import com.google.common.collect.HashBasedTable
import com.google.common.collect.HashMultimap
import com.google.common.collect.Multimap
import com.google.common.collect.Table
import com.google.inject.Inject
import de.cau.cs.kieler.core.kexpressions.Declaration
import de.cau.cs.kieler.core.kexpressions.Expression
import de.cau.cs.kieler.core.kexpressions.FunctionCall
import de.cau.cs.kieler.core.kexpressions.OperatorExpression
import de.cau.cs.kieler.core.kexpressions.OperatorType
import de.cau.cs.kieler.core.kexpressions.Parameter
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kico.KielerCompiler
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.kitt.tracing.Tracing
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Fork
import de.cau.cs.kieler.scg.Join
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.ScgFactory
import de.cau.cs.kieler.scg.ScgPackage
import de.cau.cs.kieler.scg.Surface
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import de.cau.cs.kieler.scg.extensions.SCGCoreExtensions
import de.cau.cs.kieler.scg.extensions.SCGThreadExtensions
import de.cau.cs.kieler.scg.features.SCGFeatures
import java.util.Collection
import java.util.LinkedList
import java.util.List
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.util.EcoreUtil.Copier
import org.eclipse.xtend.lib.annotations.Data

import static de.cau.cs.kieler.scg.ssc.ssa.SSAFunction.*

import static extension com.google.common.base.Predicates.*
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class MergeExpressionExtension {
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
    extension IOPreserverExtensions
    @Inject
    extension KExpressionsCreateExtensions

    @Inject
    extension SSACoreExtensions
    @Inject
    extension SSACacheExtensions

    // CANNOT HANDLE CYCLES
    val Table<SCGraph, ValuedObject, MergeExpression> cache = HashBasedTable.create
    var KielerCompilerContext context = null

    def createMergeExpression(Node readingNode, List<Node> concurrentNodes, ValuedObject vo, Multimap<Assignment, Parameter> ssaReferences, BiMap<ValuedObject, Declaration> ssaDecl, KielerCompilerContext context) {
        this.context = context
        val scg = readingNode.eContainer as SCGraph
        val scheduled = scg.hasUpdates(vo)
        val expression = if (scheduled) {
            scg.getScheduledExpression(vo, ssaDecl)
        }else{
            scg.getPatternExpression(vo)
        }
        
        // Reduce to context
        val dt = context.getDominatorTree(scg)
        val reachinDefinitions = newHashSet
        val addQueue = newLinkedList
        addQueue.addAll(readingNode)
        var Node idom
        while (!addQueue.isEmpty) {
            val next = addQueue.pop
            for (pred : next.allPrevious.map[eContainer as Node]) {
                if (!reachinDefinitions.contains(pred)) {
                    if (pred instanceof Assignment) {
                        if (pred.valuedObject == vo) {
                            val dom = dt.isDominator(pred.basicBlock, readingNode.basicBlock)
                            if (dom && idom == null) {
                                idom = pred
                                reachinDefinitions.add(pred)
                            } else if (!dom) {
                                reachinDefinitions.add(pred)
                            }
                        }
                    }
                    addQueue.push(pred)
                }
            }
        }
        reachinDefinitions.addAll(concurrentNodes)
        
        for (entry : expression.refs.entries) {
            if (reachinDefinitions.contains(entry.key)) {
                ssaReferences.put(entry.key as Assignment, entry.value as Parameter)
            } else {
                // remove all references to sequentially following nodes
                entry.value.remove
            }
        }

        // TODO reduce non immediate dominators
//        
//        if (allPreceedingNodes.filter(Assignment).filter[valuedObject == vo && !isSSA].exists[
//            !scg.nodes.head.getInstantaneousControlFlows(it).empty && 
//            // dominates all following exits
//            (dt.isDominator(it.basicBlock, scg.nodes.head))
//        ]) {
//            (pattern.exp as FunctionCall).parameters.remove(0)
//        }
        

        if (!scheduled && vo.declaration.input) {
            return SEQ.createFunction => [
                parameters += createParameter => [
                    expression = vo.reference
                ]
                parameters += createParameter => [
                    expression = expression.exp
                ]
            ]
        } else if (!scheduled && scg.isDelayed) {
            return SEQ.createFunction => [
                parameters += createParameter => [
                    expression = createOperatorExpression(OperatorType.PRE) => [
                        subExpressions += ssaDecl.get(vo).valuedObjects.findFirst[isRegister].reference
                    ]
                ]
                parameters += createParameter => [
                    expression = expression.exp
                ]
            ]
        } else {
            return expression.exp
        }
    }
    
    private def hasUpdates(SCGraph scg, ValuedObject vo) {
        return scg.nodes.filter(Assignment).filter[valuedObject == vo].exists[isUpdate]        
    }
    
    def getPatternExpression(SCGraph scg, ValuedObject vo) {
        scg.getPattern(vo)
        // Copy pattern
//        val copier = new Copier();
//        val Expression result = copier.copy(pattern.exp) as Expression
//        copier.copyReferences();
    }

    def getPattern(SCGraph scg, ValuedObject vo) {
//        if (!cache.contains(scg, vo)) {
        val entry = scg.nodes.head as Entry
        val ssaReferences = HashMultimap.<Assignment, Parameter>create
        // No Initial value
//        val exp = SEQ.createFunction => [
//            parameters += createParameter => [
//                expression = vo.reference
//                ssaReferences.put(entry, it)
//            ]
//            entry.createSeqConcFunction(vo, ssaReferences, newHashSet).addTo(parameters)
//        ]
        val exp = entry.createSeqConcFunction(vo, ssaReferences, newHashSet).expression
        return new MergeExpression(exp, ssaReferences)
//            cache.put(scg, vo, new SeqConcPattern(exp, ssaReferences))
//        }
//        return cache.get(scg, vo)
    }

//    private def Parameter createSeqConcFunction(Iterable<Node> nodes, ValuedObject vo, Node stop,
//        Multimap<Node, Parameter> ssaReferences, Collection<Node> marks) {
//        val iter = nodes.iterator
//        if (iter.hasNext) {
//            val first = iter.next
//            if (first != null) {
//                if (iter.hasNext) {
//                    return createParameter => [
//                        expression = SEQ.createFunction => [
//                            first.createSeqConcFunction(vo, stop, ssaReferences, marks).addTo(parameters)
//                            nodes.map[createSeqConcFunction(vo, stop, ssaReferences, marks)].addTo(parameters)
//                        ]
//                    ]
//                } else {
//                    return first.createSeqConcFunction(vo, stop, ssaReferences, marks)
//                }
//            }
//        }
//        return null
//    }
    private def Parameter createSeqConcFunction(Node node, ValuedObject vo, Multimap<Assignment, Parameter> ssaReferences,
        Collection<Node> marks) {
        if (marks.contains(node)) {
            return null
        }
        marks.add(node)
        switch (node) {
            Assignment: {
                if ((node as Assignment).valuedObject == vo) {
                    return createParameter => [
                        expression = SEQ.createFunction => [
                            parameters += createParameter => [
                                expression = vo.reference
                                ssaReferences.put(node, it)
                            ]
                            node.allNext.filter[if (node.allNext.size == 1) {return true} else {it.target?.noLoop(node)}].head?.target?.createSeqConcFunction(vo, ssaReferences, marks).addTo(parameters)
                        ]
                    ]
                }
                return node.allNext.filter[if (node.allNext.size == 1) {return true} else {it.target?.noLoop(node)}].head?.target?.createSeqConcFunction(vo, ssaReferences, marks)
            }
            Fork: {
                return createParameter =>
                    [
                        expression = SEQ.createFunction =>
                            [
                                parameters += createParameter => [
                                    expression = CONC.createFunction => [
                                        node.allNext.map[target].map [
                                            createSeqConcFunction(vo, ssaReferences, marks)
                                        ].addTo(parameters)
                                    ]
                                ]
                                (node as Fork).join.next?.target?.createSeqConcFunction(vo, ssaReferences, marks).addTo(
                                    parameters)
                            ]
                    ]
            }
            Conditional: {
                return createParameter => [
                    val cond = (node as Conditional)
                    // find branch join with dominator tree
                    val dt = context.getDominatorTree(cond.eContainer as SCGraph)
                    var dom = cond.basicBlock
                    var children = dt.children(dom).filter[predecessors.size != 1].toList
                    while (children.empty) {
                        dom = dt.idom(dom)
                        children = dt.children(dom).filter[predecessors.size != 1].toList
                    }
                    var Node join = children.head.schedulingBlocks.head.nodes.head
                    // goto endif to mark nodes
                    val next = join.createSeqConcFunction(vo, ssaReferences, marks)
                    expression = SEQ.createFunction => [
                        parameters += createParameter => [
                            expression = SEQ.createFunction => [
                                if (cond.then?.target?.noLoop(cond) ){cond.then?.target?.createSeqConcFunction(vo, ssaReferences, marks).addTo(parameters)}
                                if (cond.^else?.target?.noLoop(cond)  ){cond.^else?.target?.createSeqConcFunction(vo, ssaReferences, marks).addTo(parameters)}
                            ]
                        ]
                        next.addTo(parameters)
                    ]
                ]
            }
            Join:
                return null
            Surface:
                return node.depth.allNext.head?.target?.createSeqConcFunction(vo, ssaReferences, marks)
            default:
                return node.allNext.head?.target?.createSeqConcFunction(vo, ssaReferences, marks)
        }
    }
    
    private def boolean noLoop(Node t, Node s) {
        val dt = context.getDominatorTree(s.eContainer as SCGraph)
//        return !dt.isStrictDominator(t.basicBlock, s.basicBlock)
        return true
    }

    private def void addTo(Iterable<Parameter> parameters, EList<Parameter> list) {
        parameters.filterNull.forEach[list.add(it)]
    }

    private def void addTo(Parameter parameter, EList<Parameter> list) {
        if (parameter != null) {
            list.add(parameter)
        }
    }

    def Expression reduce(Expression ssaFunction) {
        if (ssaFunction instanceof FunctionCall) {
            var changed = true
            var fcalls = ssaFunction.eAllContents.filter(FunctionCall).toList
            fcalls.add(ssaFunction)
            fcalls = fcalls.reverseView
//            if (fcalls.exists[functionName != SSAFunction.SEQ.symbol && functionName != SSAFunction.CONC.symbol]) {
//                return ssaFunction
//            }
            // reduce function
            while (changed) {
                changed = false
                for (fc : fcalls) {
                    if (fc.functionName == COMBINE.symbol) {
                        
                    } else {
                        if (fc.parameters.size == 0 && fc.eContainer instanceof Parameter) {
                            fc.eContainer.remove
                        } else if (fc.parameters.size == 1) {
                            val container = fc.eContainer
                            if (container instanceof Parameter) {
                                container.expression = fc.parameters.head.expression
                            }
                        }
                    }
                }
                changed = fcalls.removeIf[eContainer == null]
            }
            // reduce nesting
            for (fc : fcalls) {
                if (fc.functionName == COMBINE.symbol) {
                        
                } else {
                    var index = 0;
                    while (index < fc.parameters.size) {
                        val paramExp = fc.parameters.get(index).expression
                        if (paramExp instanceof FunctionCall) {
                            if (paramExp.functionName == fc.functionName) {
                                fc.parameters.remove(index)
                                fc.parameters.addAll(index, paramExp.parameters)
                                paramExp.parameters.clear
                                index-- // do not increment to analyze first inserted parameter next
                            }
                        }
                        index++
                    }
                }
            }
            if (ssaFunction.parameters.size == 1) {
                return ssaFunction.parameters.head.expression
            }
        }
        return ssaFunction
    }
    
    def Expression normalize(Expression ssaFunction) {
        val reduced = ssaFunction.reduce
        if (reduced instanceof FunctionCall) {
            var fcalls = reduced.eAllContents.filter(FunctionCall).toList
            fcalls.add(reduced)
            fcalls = fcalls.reverseView
//            if (fcalls.exists[functionName != SSAFunction.SEQ.symbol && functionName != SSAFunction.CONC.symbol]) {
//                return ssaFunction
//            }
            for (fc : fcalls) {
                if (fc.functionName == COMBINE.symbol) {
                        
                } else {
                    if (fc.parameters.size > 2 ) {
                        val paramsIter = fc.parameters.immutableCopy.iterator
                        var prev = paramsIter.next
                        while (paramsIter.hasNext) {
                            val next = paramsIter.next
                            if (paramsIter.hasNext) {
                                val param0 = prev.copy
                                val param1 = next
                                val func = createFunctionCall => [
                                    functionName = fc.functionName
                                ]
                                (next.eContainer as FunctionCall).parameters.remove(next)
                                func.parameters.addAll(param0, param1)
                                prev.expression = func
                            }
                        }
                    }
                }
            }
        }
        return reduced
    }
    
        
    def getMergeExpressions(SCGraph scg) {
        val map = HashMultimap.create
        for (node : scg.nodes.filter(instanceOf(Assignment).or(instanceOf(Conditional)))) {
            val expr = node.eContents.filter(Expression).head
            if (expr instanceof FunctionCall) {
                map.put(node, expr)
            } else if (expr instanceof OperatorExpression) {
                for (fc : expr.eAllContents.filter(FunctionCall).toIterable) {
                    if (!(fc.eContainer instanceof Parameter)) {
                        map.put(node, fc)
                    }
                }
            }
        }
        return map
    }
    
    static val schedules = <ValuedObject, List<Assignment>>newHashMap
    
    def getScheduledExpression(SCGraph scg, ValuedObject vo, BiMap<ValuedObject, Declaration> ssaDecl) {
        val ssaReferences = HashMultimap.<Assignment, Parameter>create
        val schedule = newLinkedList
        schedule.addAll(schedules.get(vo).reverseView)
        // Prepend inputs and register reads
        if (vo.declaration.input) {
            schedule.add(createAssignment => [
                assignment = vo.reference
            ])
        } else if (scg.isDelayed) {
            schedule.add(createAssignment => [
                assignment = createOperatorExpression(OperatorType.PRE) => [
                    subExpressions += ssaDecl.get(vo).valuedObjects.findFirst[isRegister].reference
                ]
            ])
        }
        val exp = createScheduledExpression(schedule, ssaReferences)
        return new MergeExpression(exp, ssaReferences)
    }
    
    def Expression createScheduledExpression(LinkedList<Assignment> assignments, HashMultimap<Assignment, Parameter> ssaReferences) {
        val head = assignments.pop
        if (assignments.empty) {
            if (head.valuedObject == null) {
                return SEQ.createFunction => [
                    parameters += createParameter => [
                        expression = head.assignment
                    ]
                ]                
            } else {
                return SEQ.createFunction => [
                    parameters += createParameter => [
                        ssaReferences.put(head, it)
                        expression = head.valuedObject.reference
                    ]
                ]
            }
        } else if (head.isUpdate){
             return COMBINE.createFunction => [
                parameters += createParameter => [
                    var op = (head.assignment as OperatorExpression).operator.getName
                    if (op.contains("_")) {
                        op = op.substring(op.indexOf('_')+1)
                    }
                    expression = createStringValue(op)
                ]
                parameters += createParameter => [
                    expression = assignments.createScheduledExpression(ssaReferences)
                ]
                parameters += createParameter => [
                    ssaReferences.put(head, it)
                    expression = head.valuedObject.reference
                ]
            ]
        } else {
            return SEQ.createFunction => [
                parameters += createParameter => [
                    expression = assignments.createScheduledExpression(ssaReferences)
                ]
                parameters += createParameter => [
                    ssaReferences.put(head, it)
                    expression = head.valuedObject.reference
                ]
            ]
        }
    }

    
    def prepareUpdateScheduling(SCGraph scg) {
        schedules.clear
        val updateVOs = scg.nodes.filter(Assignment).filter[isUpdate].map[valuedObject].toSet
        for (vo : updateVOs) {
            val copier = new Copier();
            val SCGraph copy = copier.copy(scg) as SCGraph
            copier.copyReferences();
            // Remove current analysis
            copy.annotations.clear
            copy.basicBlocks.clear
            copy.nodes.forEach[dependencies.clear]
            // Remove independent nodes
            val voCopy = copier.get(vo)      
            val independentNodes = copy.nodes.filter(Assignment).filter[valuedObject != voCopy && !eAllContents.filter(ValuedObjectReference).exists[valuedObject == voCopy]].toList
            for (in : independentNodes) {
                in.incoming.immutableCopy.forEach[ target = in.next.target]
                in.next.target = null
            }
            copy.nodes.removeAll(independentNodes)
            val context = new KielerCompilerContext(SCGFeatures.DEPENDENCY_ID +","+ SCGFeatures.BASICBLOCK_ID +","+ SCGFeatures.SCHEDULING_ID + ",*T_scg.basicblock.sc", copy);
            context.advancedSelect = false;
            context.setProperty(Tracing.ACTIVE_TRACING, true);
            val result = KielerCompiler.compile(context);
            if (!result.postponedErrors.empty) {
                throw new IllegalArgumentException("SCG with ValuedObject "+vo.name+" cannot be scheduled",result.postponedErrors.head)
            }
            val schedSCG = result.object as SCGraph
            val mapping = result.getAuxiliaryData(Tracing).head?.getMapping(schedSCG, copy);
            var ValuedObject findCopyVO = null
            for (d : schedSCG.declarations) {
                for (v : d.valuedObjects) {
                    if (mapping.get(v).filter(ValuedObject).head == voCopy) {
                        findCopyVO = v
                    }
                }
            }
            val schedVO = findCopyVO
            val schedule = <Assignment>newArrayList
            for (sb : schedSCG.schedules.head.scheduleBlocks.map[schedulingBlock]) {
                for (a : sb.nodes.filter(Assignment).filter[valuedObject == schedVO]) {
                    val copyAsm = mapping.get(a).filter(Assignment).head
                    val asm = copier.entrySet.findFirst[value == copyAsm].key
                    schedule.add(asm as Assignment)
                }
            }
            schedules.put(vo, schedule)
        }
    }
    
}

@Data
class MergeExpression {
    Expression exp
    Multimap<Assignment, Parameter> refs
}
