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
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Fork
import de.cau.cs.kieler.scg.Join
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.Surface
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import de.cau.cs.kieler.scg.extensions.SCGCoreExtensions
import de.cau.cs.kieler.scg.extensions.SCGThreadExtensions
import java.util.Collection
import java.util.List
import org.eclipse.emf.common.util.EList
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
    val Table<SCGraph, ValuedObject, SeqConcPattern> cache = HashBasedTable.create
    var KielerCompilerContext context = null

    def createMergeExpression(Node node, ValuedObject vo, Multimap<Assignment, Parameter> ssaReferences, BiMap<ValuedObject, Declaration> ssaDecl, KielerCompilerContext context) {
        return newLinkedList(node).createMergeExpression(vo, ssaReferences, ssaDecl, context)
    }

    def createMergeExpression(List<Node> nodes, ValuedObject vo, Multimap<Assignment, Parameter> ssaReferences, BiMap<ValuedObject, Declaration> ssaDecl, KielerCompilerContext context) {
        this.context = context
        val scg = nodes.head.eContainer as SCGraph
        val expression = if (scg.hasUpdates(vo)) {
            null
        }else{
            scg.getPatternExpression(vo)
        }
        
        // Reduce to context
        val allPreceedingNodes = newHashSet
        allPreceedingNodes.addAll(nodes)
        val addQueue = newLinkedList
        addQueue.addAll(nodes)
        while (!addQueue.isEmpty) {
            val next = addQueue.pop
            for (pred : next.allPrevious.map[eContainer as Node]) {
                if (!allPreceedingNodes.contains(pred)) {
                    allPreceedingNodes.add(pred)
                    addQueue.push(pred)
                }
            }
        }
        for (entry : expression.refs.entries) {
            if (allPreceedingNodes.contains(entry.key)) {
                ssaReferences.put(entry.key as Assignment, entry.value as Parameter)
            } else {
                // remove all references to sequentially following nodes
                entry.value.remove
            }
        }

        // TODO reduce non immediate dominators
//        val dt = context.getDominatorTree(scg)
//        if (allPreceedingNodes.filter(Assignment).filter[valuedObject == vo && !isSSA].exists[
//            !scg.nodes.head.getInstantaneousControlFlows(it).empty && 
//            // dominates all following exits
//            (dt.isDominator(it.basicBlock, scg.nodes.head))
//        ]) {
//            (pattern.exp as FunctionCall).parameters.remove(0)
//        }
        
        if (vo.declaration.input) {
            return SEQ.createFunction => [
                parameters += createParameter => [
                    expression = vo.reference
                ]
                parameters += createParameter => [
                    expression = expression.exp
                ]
            ]
        } else if (scg.isDelayed) {
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
        return false        
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
        return new SeqConcPattern(exp, ssaReferences)
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
                    if (fc.parameters.size == 0 && fc.eContainer instanceof Parameter) {
                        fc.eContainer.remove
                    } else if (fc.parameters.size == 1) {
                        val container = fc.eContainer
                        if (container instanceof Parameter) {
                            container.expression = fc.parameters.head.expression
                        }
                    }
                }
                changed = fcalls.removeIf[eContainer == null]
            }
            // reduce nesting
            for (fc : fcalls) {
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
}

@Data
class SeqConcPattern {
    Expression exp
    Multimap<Assignment, Parameter> refs
}
