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
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.kext.extensions.KExtDeclarationExtensions
import de.cau.cs.kieler.kicool.compilation.InplaceProcessor
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.SCGraphs
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import de.cau.cs.kieler.scg.transformations.basicblocks.BasicBlockTransformation
import de.cau.cs.kieler.scg.ControlFlow
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import static extension de.cau.cs.kieler.kicool.kitt.tracing.TracingEcoreUtil.*
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.kicool.compilation.VariableStore

/**
 * Halt State Remover
 * ------------------
 *  
 * @author ssm
 * @kieler.design 2018-01-22 proposed 
 * @kieler.rating 2018-01-22 proposed yellow
 *
 */
class HaltStateRemover extends InplaceProcessor<SCGraphs> {
    
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KExtDeclarationExtensions
    @Inject extension SCGControlFlowExtensions
    
    override getId() {
        "de.cau.cs.kieler.scg.processors.haltStateRemover"
    }
    
    override getName() {
        "Halt State Remover"
    }
    
    override process() {
        val model = getModel
        
        for (scg : model.scgs) {
            scg.performHaltStateRemove
        }
        VariableStore.get(environment).removeAllUncontainedVO(model, environment)
    }
    
    def performHaltStateRemove(SCGraph scg) {
        val nextNodes = <Node> newLinkedList(scg.nodes.head)
        val removeList = <EObject> newLinkedList
        
        // A halt state in the netlist is represented by two assignments. 
        // The first one is of the form _gX = pre(_gY).   (1)
        // the second one is similar to _gY = _gZ || _gX. (2)
        // As long as X and Y are not referenced in further assignments, this resembles a halt state.
        // One may notice that Z is arbitrary.
        val haltStates = <Assignment, Assignment> newHashMap // Halt State representation as (1) (2)
        val valuedObjectMap = <ValuedObject, Assignment> newHashMap 
        val preBlacklist = <ValuedObject, Integer> newHashMap
        
        while (!nextNodes.empty) {
            val node = nextNodes.pop

            if (node instanceof Conditional) {
                nextNodes.add(node.^else.target)
            } else {
                val newNodes = node.allNext.map[ target ].filter[ it !== null ].toList
                if (!newNodes.empty && newNodes.head !== nextNodes.peek) {
                    nextNodes.addAll(newNodes)
                } 
            }
            
            if (node instanceof Assignment) {
                if (node.expression instanceof OperatorExpression) {
                    val OE = node.expression.asOperatorExpression
                    if (OE.operator == OperatorType.PRE) {
                        haltStates.put(node, null)
                        valuedObjectMap.put(node.reference.valuedObject, node)
                        
                        // Remember pre-d value
                        val v = OE.subExpressions.head as ValuedObjectReference
                        val count = preBlacklist.get(v.valuedObject)
                        if (count === null) {
                            preBlacklist.put(v.valuedObject, 1)
                        } else {
                            preBlacklist.put(v.valuedObject, preBlacklist.get(v.valuedObject) + 1)
                        }                        
                    } else if (OE.operator == OperatorType.LOGICAL_OR &&
                        OE.subExpressions.size == 2
                    ) {
                        for (vo : OE.subExpressions.filter(ValuedObjectReference).map[valuedObject]) {
                            val corrAssignment = valuedObjectMap.get(vo)
                            if (corrAssignment !== null && 
                                corrAssignment.expression.asOperatorExpression.subExpressions.head.asValuedObjectReference.valuedObject ==
                                node.reference.valuedObject
                            ) {
                                val haltAssignment = haltStates.get(corrAssignment)
                                if (haltAssignment === null) {
                                    haltStates.put(corrAssignment, node)
                                    valuedObjectMap.put(node.reference.valuedObject, corrAssignment)
                                } else {
                                    // Another reference! It's not a halt state.
                                    haltStates.remove(corrAssignment)
                                }
                            }
                        }
                    } else {
                        for (ref : node.expression.allReferences.toList) {
                            if (valuedObjectMap.containsKey(ref.valuedObject)) {
                                haltStates.remove(valuedObjectMap.get(ref.valuedObject))
                                valuedObjectMap.remove(ref.valuedObject)
                            }
                        }
                    }
                }
            } 
            
            else if (node instanceof Conditional) {
                for (ref : node.condition.allReferences.toList) {
                    if (valuedObjectMap.containsKey(ref.valuedObject)) {
                        haltStates.remove(valuedObjectMap.get(ref.valuedObject))
                        valuedObjectMap.remove(ref.valuedObject)
                    }
                }                
            }
        }
        
        for (hs : haltStates.keySet) {
            val s = haltStates.get(hs)
            if (s !== null) {
                val hsbl = preBlacklist.get(hs.reference.valuedObject)
                val sbl = preBlacklist.get(s.reference.valuedObject)
                if ((hsbl === null) && sbl < 2) {                 
                    removeList += hs
                    removeList += hs.next
                    removeList += s
                    removeList += s.next
                }
            }
        }
        
        for (r : removeList) {
            if (r instanceof ControlFlow) r.target = null
            else if (r instanceof Assignment) {
                for (incoming : r.allPrevious.toList) {
                    incoming.target = r.next.target
                }
            }
            r.remove
        }        
    }
    
}