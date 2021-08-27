/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2018 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.scg.processors.optimizer

import com.google.inject.Inject
import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.properties.Property
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCompareExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kicool.compilation.InplaceProcessor
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.ControlFlow
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.SCGraphs
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import de.cau.cs.kieler.scg.extensions.SCGCoreExtensions
import de.cau.cs.kieler.scg.extensions.SCGMethodExtensions
import java.util.Set
import org.eclipse.emf.ecore.EObject

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

/**
 * Conditional Merger
 * ------------------
 *  
 * @author ssm
 * @kieler.design 2018-01-17 proposed 
 * @kieler.rating 2018-01-17 proposed yellow
 *
 */
class ConditionalMerger extends InplaceProcessor<SCGraphs> {
    
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KExpressionsCompareExtensions
    @Inject extension SCGCoreExtensions
    @Inject extension SCGControlFlowExtensions
    @Inject extension SCGMethodExtensions
    
    public static val IProperty<Boolean> CONDITIONAL_MERGER_ENABLED = 
        new Property<Boolean>("de.cau.cs.kieler.scg.opt.conditionalMerger", false)    
    public static val IProperty<Boolean> CONDITIONAL_MERGER_WIDESPAN_ENABLED = 
        new Property<Boolean>("de.cau.cs.kieler.scg.opt.conditionalMerger.widespan", true)    
    
    override getId() {
        "de.cau.cs.kieler.scg.processors.conditionalMerger"
    }
    
    override getName() {
        "Conditional Merger"
    }
    
    override process() {
        if (!environment.getProperty(CONDITIONAL_MERGER_ENABLED)) return;
        
        val model = getModel
        applyAnnotations
        
        for (scg : model.scgs.ignoreMethods) {
            scg.performConditionalMerge
        }
        
    }
    
    def performConditionalMerge(SCGraph scg) {
        val nextNodes = <Node> newLinkedList(scg.nodes.head)
        val removeList = <EObject> newLinkedList
        val conditions = <Expression, Conditional> newLinkedHashMap
        val usedVariables = <ValuedObject> newHashSet
        val assignedVariables = <ValuedObject> newHashSet
        
        while (!nextNodes.empty) {
            val node = nextNodes.pop

            if (node instanceof Conditional) {
                nextNodes.add(node.^else.targetNode)
            } else {
                val newNodes = node.allNext.map[ targetNode ].filter[ it !== null ].toList
                if (!newNodes.empty && newNodes.head !== nextNodes.peek) {
                    nextNodes.addAll(newNodes)
                } 
            }
            
            if (node instanceof Conditional) {
                val preceedingNodes = node.allPrevious.map[ eContainer ].toList
                
                val equalCondition = conditions.keySet.findLast[ it.equals2(node.condition) ]
                if (equalCondition !== null) {
                    val domConditional = conditions.get(equalCondition)
                    
                    val merge = preceedingNodes.contains(domConditional) || 
                        (getProperty(CONDITIONAL_MERGER_WIDESPAN_ENABLED) && 
                            node.ineffectiveVariables(assignedVariables, usedVariables)
                        )
                    
                    if (merge) {
                        node.mergeConditionals(domConditional)
                    } else {
                        conditions.put(node.condition, node)
                    }
                } else {
                    conditions.put(node.condition, node)
                }
                
                if (node.then !== null) {
                    val nodes = <Node> newLinkedList => [ push(node.then.target.asNode) ]
                    while (!nodes.empty) {
                        val node2 = nodes.pop
                        
                        if (node2 instanceof Assignment) {
                            assignedVariables += node2.reference.valuedObject
                            node2.expression.allReferences.forEach[ usedVariables += it.valuedObject ]
                        }
                        
                        val next = node2.allNext.map[ target ].head.asNode
                        if (next.incomingLinks.size == 1)
                            nodes.push(next)
                    }
                }
            }
            
            else if (node instanceof Assignment) {
                assignedVariables += node.reference.valuedObject
                node.expression.allReferences.forEach[ usedVariables += it.valuedObject ]    
            }
            
        }
        
        for (r : removeList) {
            if (r instanceof ControlFlow) r.target = null
            else if (r instanceof Conditional) {
                for (incoming : r.allPrevious.toList) {
                    incoming.target = r.^else.target
                }
            }
            r.remove
        }        
    }
    
    private def void mergeConditionals(Conditional node, Conditional domConditional) {
        var tail = domConditional.^else.targetNode.allPrevious.filter[ eContainer !== domConditional ].head
        
        val thenNodes = <Node> newLinkedList(node.^then.targetNode)
        while (!thenNodes.empty) {
            val thenNode = thenNodes.pop
            
            tail.target = thenNode
            tail = thenNode.allNext.head
            if (thenNode instanceof Assignment) {
                annotationModel.addInfo(thenNode, "Conditional Merger")
            }
            
            thenNodes += thenNode.allNext.filter[ target !== node.^else.targetNode ].map[ targetNode ] 
        }
        tail.target = domConditional.^else.target
        
        for (incoming : node.allPrevious.toList) {
            incoming.target = node.^else.target
        }
        node.^then.target = null
        node.^else.target = null
        node.^then.remove
        node.^else.remove
        node.remove        
    }
    
    private def boolean ineffectiveVariables(Conditional conditional, Set<ValuedObject> assignedVariables, 
        Set<ValuedObject> usedVariables
    ) {
        val myVariables = newHashSet
        
        if (!(conditional.condition instanceof ValuedObjectReference)) return false;
        if (assignedVariables.contains(conditional.condition.asValuedObjectReference.valuedObject)) return false
        
        val nodes = <Node> newLinkedList => [ push(conditional.then.target.asNode) ]
        while (!nodes.empty) {
            val node = nodes.pop
            
            if (node instanceof Assignment) {
                myVariables += node.reference.valuedObject
                node.expression.allReferences.forEach[ myVariables += it.valuedObject ]
            }
            
            val next = node.allNext.map[ target ].head.asNode
            if (next.incomingLinks.size == 1)
                nodes.push(next)
        }
        
        for (v : myVariables) {
            if (usedVariables.contains(v) || assignedVariables.contains(v)) 
                return false
        }
        
        return true
    }
    
}