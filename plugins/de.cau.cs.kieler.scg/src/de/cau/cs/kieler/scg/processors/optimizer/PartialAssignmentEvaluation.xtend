/*
RegularSSATransformation.xtend * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
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
package de.cau.cs.kieler.scg.processors.optimizer

import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.SCGraph

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.scg.Node
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.Value
import de.cau.cs.kieler.kicool.compilation.InplaceProcessor
import de.cau.cs.kieler.scg.SCGraphs
import de.cau.cs.kieler.kexpressions.eval.PartialExpressionEvaluator
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.scg.ControlFlow
import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.properties.Property
import de.cau.cs.kieler.kexpressions.BoolValue
import de.cau.cs.kieler.kexpressions.keffects.AssignOperator

/**
 * @author ssm
 * @kieler.design 2018-07-02 proposed 
 * @kieler.rating 2018-07-02 proposed yellow
 */
class PartialAssignmentEvaluation extends InplaceProcessor<SCGraphs> implements Traceable {

    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension SCGControlFlowExtensions

    public static val IProperty<Boolean> PARTIAL_ASSIGNMENT_EVALUATION_ENABLED = 
        new Property<Boolean>("de.cau.cs.kieler.scg.opt.partialAssignmentEvaluation", false)
    public static val IProperty<Boolean> PAE_REMOVE_SOURCENODE = 
        new Property<Boolean>("de.cau.cs.kieler.scg.processors.partialAssignmentEvaluation.removeSourceNode", true) 
    public static val IProperty<Boolean> PAE_REMOVE_UNUSEDCONDITIONALBRANCHES = 
        new Property<Boolean>("de.cau.cs.kieler.scg.processors.partialAssignmentEvaluation.removeUnusedConditionalBranches", true) 

    override getId() {
        return "de.cau.cs.kieler.scg.processors.partialAssignmentEvaluation"
    }

    override getName() {
        return "Partial Assignment Evaluation"
    }
    
    
    override process() {
        if (!environment.getProperty(PARTIAL_ASSIGNMENT_EVALUATION_ENABLED)) return;
        
        model.scgs.forEach[ transform ]
        model = model
    }

    def SCGraph transform(SCGraph scg) {
        val PartialExpressionEvaluator parEval = new PartialExpressionEvaluator(<ValuedObject, Value> newHashMap) => [ 
            compute = true
            inplace = true
        ]
            
        val nextNodes = <Node> newLinkedList(scg.nodes.head)
        val removeList = <EObject> newLinkedList
        
        val candidates = <ValuedObject, Node> newHashMap 
//        val HashMultimap<Node, Node> cNodes = HashMultimap.create
        
        while (!nextNodes.empty) {
            val node = nextNodes.pop

            if (node instanceof Conditional) {
                nextNodes.add(node.^else.targetNode)
                node.checkTrueBranch(parEval)
            } else {
                val newNodes = node.allNext.map[ targetNode ].filter[ it !== null ].toList
                if (!newNodes.empty && newNodes.head !== nextNodes.peek) {
                    nextNodes.addAll(newNodes)
                } 
            }
            
            if (node instanceof Assignment) {
                if (node.expression !== null) {
                   val references = node.expression.allReferences
                   
            	   node.expression.replace(parEval.evaluate(node.expression))
            	   
            	   val newReferences = node.expression.allReferences
            	   for (r : references) {
            	       if (candidates.keySet.contains(r.valuedObject) && !newReferences.exists[ it.valuedObject == r.valuedObject ]) {
            	           removeList += candidates.get(r.valuedObject)
            	       }
            	   }
            	}
            	
            	if (node.reference !== null) {
            	    parEval.values.remove(node.reference.valuedObject)
            	    if (node.expression instanceof Value) {
            	        parEval.values.put(node.reference.valuedObject, (node.expression as Value).copy)
            	        candidates.put(node.reference.valuedObject, node)
            	    }
            	}
            } else if (node instanceof Conditional) {
                if (node.condition !== null) {
                    var ValuedObjectReference ref = null
                    if (node.condition instanceof ValuedObjectReference) {
                        ref = node.condition as ValuedObjectReference
                    }
                    
                    node.condition.replace(parEval.evaluate(node.condition))
                    
                    if (ref instanceof ValuedObjectReference && node.condition instanceof Value && candidates.keySet.contains(ref.valuedObject)) {
                        if (environment.getProperty(PAE_REMOVE_SOURCENODE)) {
                            removeList += candidates.get(ref.valuedObject)
//                            cNodes.put(candidates.get(ref.valuedObject), node)
                        }
                    }
                    
                    if (node.condition instanceof Value && environment.getProperty(PAE_REMOVE_UNUSEDCONDITIONALBRANCHES)) {
                        removeList += node
                    }
                }
            }
        }
        
        snapshot
        
        for (r : removeList) {
            var abort = false
            if (r instanceof ControlFlow) r.target = null
            else if (r instanceof Assignment) {
                if (r.isIneffective(scg)) {
                    for (incoming : r.allPrevious.toList) {
                        incoming.target = r.next.target
                    }
                    if (r.next !== null) {
                        // This can be null if a schizophrenic assignment does not have a successor.
                        r.next.target = null
                        r.next.remove         
                    }       
                } else {
                    abort = true
                }
            }
            else if (r instanceof Conditional) {
               if (r.condition instanceof BoolValue) {
                   val c = r.condition as BoolValue
                   if (c.value) {
                        for (incoming : r.allPrevious.toList) {
                            incoming.target = r.^then.target
                        }
                   } else {
                        for (incoming : r.allPrevious.toList) {
                            incoming.target = r.^else.target
                        }
                        
                        // Does not work for seq scq with multiple nesting levels.
                        var n = r.then.target as Node
                        while (n != r.^else.target) {
                            val cf = n.allNext.head
                            val nn = cf.target as Node
                            cf.target = null
                            cf.remove
                            n.remove
                            n = nn
                        }
                   }
               }
                r.^else.target = null
                r.^else.remove
                r.^then.target = null
                r.^then.remove
            }
            if (!abort) r.remove
        }         
        return scg
    }
    
    private def checkTrueBranch(Conditional conditional, PartialExpressionEvaluator parEval) {
        var nextNode = conditional.^then.target
        val finalNode = conditional.^else.target
        while (nextNode !== null && nextNode != finalNode) {
            if (nextNode instanceof Assignment) {
                val vo = nextNode.reference.valuedObject
                if (parEval.values.keySet.contains(vo)) {
                    parEval.values.remove(vo)
                }
                
                nextNode = nextNode.next.target
            } else {
                nextNode = (nextNode as Node).allNext.head as Node
            }
        }
    }
    
    // This is a fast prototype implementation. Refactor soon w.r.t. the linear path of the optimization. 
    // Cases not handled: Smart Register Allocation
    //                    Assignments before the deletion
    private def isIneffective(Assignment assignment, SCGraph scg) {
        val valuedObject = assignment.reference.valuedObject
        for (n : scg.nodes) {
            if (n instanceof Assignment) {
                if (n.reference.valuedObject == valuedObject) {
                    if (n.operator != AssignOperator.ASSIGN) return false  
                } 
                if (n.expression.allReferences.exists[ it.valuedObject == valuedObject ]) return false
            } else if (n instanceof Conditional) {
                if (n.condition.allReferences.exists[ it.valuedObject == valuedObject ]) return false    
            }
        }
        return true
    }
} 
   