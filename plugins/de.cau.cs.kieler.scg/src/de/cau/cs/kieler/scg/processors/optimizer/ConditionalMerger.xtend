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
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kicool.compilation.InplaceProcessor
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.SCGraphs
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import de.cau.cs.kieler.scg.ControlFlow
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import static extension de.cau.cs.kieler.kicool.kitt.tracing.TracingEcoreUtil.*
import de.cau.cs.kieler.scg.extensions.SCGMethodExtensions

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
    @Inject extension SCGControlFlowExtensions
    @Inject extension SCGMethodExtensions
    
    public static val IProperty<Boolean> CONDITIONAL_MERGER_ENABLED = 
        new Property<Boolean>("de.cau.cs.kieler.scg.opt.conditionalMerger", false)    
    
    override getId() {
        "de.cau.cs.kieler.scg.processors.conditionalMerger"
    }
    
    override getName() {
        "Conditional Merger"
    }
    
    override process() {
        if (!environment.getProperty(CONDITIONAL_MERGER_ENABLED)) return;
        
        val model = getModel
        
        for (scg : model.scgs.ignoreMethods) {
            scg.performConditionalMerge
        }
    }
    
    def performConditionalMerge(SCGraph scg) {
        val nextNodes = <Node> newLinkedList(scg.nodes.head)
        val removeList = <EObject> newLinkedList
        val conditions = <ValuedObject, Conditional> newHashMap
        
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
                if (node.condition instanceof ValuedObjectReference) {
                    val vo = node.condition.asValuedObjectReference.valuedObject
                    if (conditions.keySet.contains(vo)) {
                        val preceedingNodes = node.allPrevious.map[ eContainer ].toList
                        val domConditional = conditions.get(vo)
                        
                        if (preceedingNodes.contains(domConditional)) {
                            var tail = domConditional.^else.targetNode.allPrevious.filter[ eContainer !== domConditional ].head
                            
                            val thenNodes = <Node> newLinkedList(node.^then.targetNode)
                            while (!thenNodes.empty) {
                                val thenNode = thenNodes.pop
                                
                                tail.target = thenNode
                                tail = thenNode.allNext.head
                                if (thenNode instanceof Assignment) {
                                    if (thenNode.reference !== null && thenNode.reference.valuedObject !== null) {
                                        environment.infos.add("CM: " + thenNode.reference.valuedObject.name , thenNode, true)
                                    } else {
                                        environment.infos.add("CM", thenNode, true)
                                    }
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
                            
//                            removeList += node
//                            removeList += node.^then
//                            removeList += node.^else                            
                        } else {
                            conditions.put(vo, node)
                        }
                    } else {
                        conditions.put(vo, node)
                    }
                }
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
    
}