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
import static extension de.cau.cs.kieler.kicool.kitt.tracing.TracingEcoreUtil.*
import de.cau.cs.kieler.kicool.environments.AnnotationModel
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.scg.processors.SimpleGuardExpressions
import de.cau.cs.kieler.scg.extensions.SCGMethodExtensions

import static de.cau.cs.kieler.kicool.compilation.VariableStore.*
import de.cau.cs.kieler.kicool.compilation.VariableStore

/**
 * Persistent State Optimizer
 * ------------------
 *  
 * @author ssm
 * @kieler.design 2018-07-02 proposed 
 * @kieler.rating 2018-07-02 proposed yellow
 *
 */
class PersistentStateOptimizer extends InplaceProcessor<SCGraphs> {
    
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KExpressionsCreateExtensions
    @Inject extension SCGControlFlowExtensions
    @Inject extension SCGMethodExtensions
    
    public static val IProperty<Boolean> PERSISTENT_STATE_OPTIMIZER_ENABLED = 
        new Property<Boolean>("de.cau.cs.kieler.scg.opt.persistentStateOptimizer", false)    
    public static val IProperty<Boolean> PERSISTENT_STATE_OPTIMIZER_RESET_STATE_ENABLED = 
        new Property<Boolean>("de.cau.cs.kieler.scg.opt.persistentStateOptimizer.resetState", true)    
    
    override getId() {
        "de.cau.cs.kieler.scg.processors.persistentStateOptimizer"
    }
    
    override getName() {
        "haltStateOptimizer"
    }
    
    var AnnotationModel<SCGraphs> annotationModel 
    
    override process() {
        if (!environment.getProperty(PERSISTENT_STATE_OPTIMIZER_ENABLED)) return;
        
        val model = getModel
        annotationModel = model.createAnnotationModel
        
        for (scg : model.scgs.ignoreMethods) {
            scg.performPersistentStateOptimization
        }
    }
    
    def performPersistentStateOptimization(SCGraph scg) {
        val nextNodes = <Node> newLinkedList(scg.nodes.head)
        val removeList = <EObject> newLinkedList
        
        val candidates = <ValuedObject> newHashSet
        val resetStateCandidates = <ValuedObject> newHashSet
        val cNodes = <ValuedObject, Node> newHashMap
        val variableStore = VariableStore.getVariableStore(environment)
        
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
            
            if (node instanceof Assignment) {
                val expr = node.expression
                if (expr instanceof OperatorExpression) {
                    if (expr.operator == OperatorType.PRE) {
                        if (node.reference.valuedObject == expr.subExpressions.head.asValuedObjectReference.valuedObject) {
                            candidates += node.reference.valuedObject
                            cNodes.put(node.reference.valuedObject, node)
                        }
                        
                    } else if (expr.operator == OperatorType.LOGICAL_OR && candidates.contains(node.reference.valuedObject)) {
                        if (expr.subExpressions.filter(ValuedObjectReference).exists[ it.valuedObject == node.reference.valuedObject ] &&
                            expr.subExpressions.filter(ValuedObjectReference).exists[ it.valuedObject.name == SimpleGuardExpressions.GO_GUARD_NAME]) {
                                expr.subExpressions.immutableCopy.forEach[ remove ]
                                node.expression.remove
                                node.expression = TRUE
                                if (!resetStateCandidates.contains(node.reference.valuedObject) || 
                                    getProperty(PERSISTENT_STATE_OPTIMIZER_RESET_STATE_ENABLED)
                                ) {
                                    removeList += cNodes.get(node.reference.valuedObject)
                                    candidates -= node.reference.valuedObject
                                    
                                    if (getProperty(PERSISTENT_STATE_OPTIMIZER_RESET_STATE_ENABLED)) {
                                        variableStore.update(node.reference.valuedObject, newArrayList(RESET))
                                    }
                                }
                                annotationModel.addInfo(node, "Persistent State")    
                            }                        
                    } else {
                        for (r : expr.allReferences) {
                            if (candidates.contains(r.valuedObject)) {
                                resetStateCandidates += r.valuedObject
                            }
                        }
                    } 
                    
                }
            } else if (node instanceof Conditional) {
                for (r : node.condition.allReferences) {
                    if (candidates.contains(r.valuedObject)) {
                        resetStateCandidates += r.valuedObject
                    }
                }
            }
            
        }
        
        for (r : removeList) {
            if (r instanceof ControlFlow) r.target = null
            else if (r instanceof Assignment) {
                for (incoming : r.allPrevious.toList) {
                    incoming.target = r.next.target
                }
                r.next.target = null
                r.next.remove
            }
            r.remove
        }        
    }
    
}