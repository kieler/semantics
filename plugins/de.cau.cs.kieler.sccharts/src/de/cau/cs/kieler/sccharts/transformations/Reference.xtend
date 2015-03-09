/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.transformations

import com.google.inject.Inject
import de.cau.cs.kieler.core.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.core.kexpressions.TextExpression
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsExtension
import de.cau.cs.kieler.sccharts.Assignment
import de.cau.cs.kieler.sccharts.Binding
import de.cau.cs.kieler.sccharts.CallNode
import de.cau.cs.kieler.sccharts.Dataflow
import de.cau.cs.kieler.sccharts.Node
import de.cau.cs.kieler.sccharts.ReferenceNode
import de.cau.cs.kieler.sccharts.SCChartsFactory
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.extensions.SCChartsExtension

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.core.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.sccharts.Equation

/**
 * SCCharts Reference Transformation.
 * 
 * @author ssm
 * @kieler.design 2014-05-19 proposed 
 * @kieler.rating 2014-05-19 proposed yellow
 */
class Reference {

    @Inject
    extension KExpressionsExtension
    
    @Inject
    extension AnnotationsExtensions    
    
    @Inject
    extension SCChartsExtension

    // This prefix is used for naming of all generated signals, states and regions
    static public final String GENERATED_PREFIX = "_"

    static private final String HOSTCODE_ANNOTATION = "alterHostcode"
    static private final String PROPAGATE_ANNOTATION = "propagate"
        
    private val propagatedBindings = <String, Binding> newHashMap

    //-------------------------------------------------------------------------
    //--                        R E F E R E N C E                            --
    //-------------------------------------------------------------------------
    // ...
    def State transform(State rootState) {
        val targetRootState = rootState.fixAllPriorities;
		
		targetRootState.transformDataflows
        // Traverse all referenced states
        targetRootState.allContainedStates.filter[ referencedState ].toList.immutableCopy.forEach[
            transformReference(targetRootState)
        ]
        
        targetRootState;
    }

    def void transformReference(State state, State targetRootState) {        
        // Referenced scopes are always SCCharts
        // Each referenced state must be contained in a region.
        val newState = (state.referencedScope as State).copyState => [ 
        	state.parentRegion.states += it
        	id = state.id
        	label = state.label
        ]

        var newStateIterator = newState.eAllContents
        while(newStateIterator.hasNext) {
            val eObject = newStateIterator.next
            if (eObject instanceof Assignment 
                || eObject instanceof ValuedObjectReference 
                || eObject instanceof TextExpression
                || eObject instanceof Binding
            ) {
                for(binding : state.bindings) {
                    if (eObject instanceof Assignment) {
                        val assignment = (eObject as Assignment);
                        val assignmentCopy = assignment.copy;
                        if (assignment.valuedObject.name == binding.formal.name) {
                           assignment.valuedObject = binding.actual
                        }
                        assignment.indices.clear
                        for (index : assignmentCopy.indices) {
                            assignment.indices.add(index.copy);
                        }
                    } else if (eObject instanceof ValuedObjectReference) {
                        val valuedObjectReference = (eObject as ValuedObjectReference);
                        val valuedObjectReferenceCopy = valuedObjectReference.copy
                        if (valuedObjectReference.valuedObject.name == binding.formal.name) {
                            valuedObjectReference.valuedObject = binding.actual
                        }
                        valuedObjectReference.indices.clear
                        for (index : valuedObjectReferenceCopy.indices) {
                            valuedObjectReference.indices.add(index.copy);
                        }
                    } else if (eObject instanceof Binding) {
                        val bing = eObject as Binding
                        if (bing.actual.name == binding.formal.name) {
                            bing.actual = binding.actual
                        } 
                    } else if (eObject instanceof TextExpression) {
                        if (binding.hasAnnotation(HOSTCODE_ANNOTATION)) {
                            val texp = (eObject as TextExpression)
                             texp.text = texp.text.replaceAll(binding.formal.name, binding.actual.name)
                        }                        
                    }                    
                }
            }
        }
        
        state.bindings.forEach[ binding |
            if (binding.hasAnnotation(PROPAGATE_ANNOTATION)) {
                propagatedBindings.put(binding.formal.name, binding)
            }
            
            newState.declarations.immutableCopy.forEach[
                val bindingName = binding.formal.name 
                val objects = valuedObjects.filter[ name == bindingName ].toList
                objects.immutableCopy.forEach[ delete ]
            ]
        ]
        
		newState.declarations.immutableCopy.forEach[ declaration |
			if (declaration.isInput || declaration.isOutput) {
				declaration.valuedObjects.forEach [
					val newObject = (newState.eContainer as Scope).findValuedObjectByName(name)
					if (newObject != null) {
						newState.replaceAllOccurrences(it, newObject)
					} else {
					    val propagatedName = name.findPropagatedName
					    if (!propagatedName.nullOrEmpty) {
					       val propagatedNewObject = 
					           (newState.eContainer as Scope).findValuedObjectByName(propagatedName)
                            newState.replaceAllOccurrences(it, propagatedNewObject)
			           } 
					}
				]
				declaration.delete
			}
		]
        
        state.incomingTransitions.immutableCopy.forEach[ targetState = newState ]
        state.outgoingTransitions.immutableCopy.forEach[ sourceState = newState ]
        
        newState => [
            initial = state.initial
            ^final = state.^final
        ]
        
        state.remove   
        
        newState.allContainedStates.filter[ referencedState ].toList.immutableCopy.forEach[
            transformReference(newState)
        ]     
    }
    
    // transform dataflow
    def transformDataflows(State state) {
    	val dataflows = <Dataflow> newHashSet
    	state.getAllContainedStates.forEach[ dataflows += concurrencies.filter(typeof(Dataflow))]
    	
    	val nodeMapping = <Node, State> newHashMap
    	val valuedObjectMapping = <ValuedObject, CallNode> newHashMap
    	
    	for(dataflow : dataflows.immutableCopy) {
    		val parentState = dataflow.eContainer as State
    		
    		var regionCounter = 0
			var idCounter = 0
			
			// NEU:
			/*
			 * Transform ReferenceNodes first
			 * => create new region and state, copy referenced scope
			 * and bind all valued objects accordingly
			 */
            for(refNode: dataflow.nodes.filter(typeof(ReferenceNode))) {
                val rRegion = parentState.createRegion("_" + dataflow.id + regionCounter)
                rRegion.label = dataflow.label + regionCounter
                val newState = rRegion.createState("_" + refNode.ID + idCounter)
                newState.label = refNode.label + idCounter
                regionCounter = regionCounter + 1
                idCounter = idCounter + 1
                newState.setInitial
                newState.referencedScope = refNode.referencedScope
                nodeMapping.put(refNode, newState)
                
                // bind inputs
                var exprCounter = 0
                val refedInputs = <ValuedObject>newArrayList
                refNode.referencedScope.declarations.filter[it.input].forEach[
                    refedInputs += valuedObjects
                ]
                for (expr: refNode.parameters) {
                    val newBinding = SCChartsFactory.eINSTANCE.createBinding
                    newBinding.actual = (expr as ValuedObjectReference).valuedObject
                    newBinding.formal = refedInputs.get(exprCounter)
                    val rState = nodeMapping.get(refNode)
                    rState.bindings += newBinding
                    exprCounter = exprCounter + 1
                }
                // bind outputs
                exprCounter = 0
                val refedOutputs = <ValuedObject>newArrayList
                refNode.referencedScope.declarations.filter[it.output].forEach[
                    refedOutputs += valuedObjects
                ]
                for (eq: dataflow.equations) {
                    if (eq.expression instanceof ValuedObjectReference) {
                        val refedVo = (eq.expression as ValuedObjectReference).valuedObject
                        if (refedOutputs.contains(refedVo)) {
                            val newBinding = SCChartsFactory.eINSTANCE.createBinding
                            newBinding.actual = eq.valuedObject
                            newBinding.formal = refedVo
                            val rState = nodeMapping.get(refNode)
                            rState.bindings += newBinding
                        }
                    }
                }
                // recursive transformation call
                (refNode.referencedScope as State).transformDataflows
            }
			
			/*
			 * Traverse all Equations of current Dataflow
			 * and transform it to already implemented extended sccharts features
			 */
			val effectMapping = <ValuedObject, Assignment> newHashMap
			var tmpCounter = 0
			for (eq: dataflow.equations.immutableCopy) {
			    if (eq.node != null) {
			        // Equation has a valued object which is part of another node
			        if (eq.node instanceof CallNode) {
                        // Equation: eq.node is a CallNode
                        val cn = eq.node as CallNode
                        val defNode = cn.callReference
                        if (defNode.states.nullOrEmpty) {
                            /*
                             * DefineNode contains dataflow
                             * => create new region with initial and final state
                             * for each expression create an assignment as transition effect 
                             */
                            val refedVo = (eq.expression as ValuedObjectReference).valuedObject
                            val exprIndex = defNode.valuedObjects.indexOf(refedVo)
                            val newExpr = defNode.expressions.get(exprIndex).copy
                            val refedOutputs = <ValuedObject>newArrayList
                            defNode.outputs.forEach[
                                refedOutputs += valuedObjects
                            ]
                            
                            // check if CallNode already exists
                            if (nodeMapping.containsKey(cn)) {
                                val startState = nodeMapping.get(cn)
                                val parentRegion = startState.parentRegion
                                if (valuedObjectMapping.containsKey(refedVo)) {
                                    val existingTransition = startState.outgoingTransitions.get(0)
                                    
                                    // check if transition is already immediate
                                    if (existingTransition.immediate) {
                                        // just add new effect for current output
                                        // with already existing temporary valuedObject 
                                        val outputEffectTransition = existingTransition.targetState.outgoingTransitions.get(0)
                                        val existingAssignment = effectMapping.get(refedVo)

                                        val newAssignment = SCChartsFactory.eINSTANCE.createAssignment
                                        newAssignment.valuedObject = eq.valuedObject
                                        newAssignment.expression = existingAssignment.expression.copy
                                        
                                        outputEffectTransition.effects += newAssignment
                                    } else {
                                        // create new final state and transition to it
                                        val oldFinalState = existingTransition.targetState
                                        oldFinalState.setFinal(false)
                                    
                                        val newFinalState = parentRegion.createState("_" + dataflow.ID + (idCounter - 1))
                                        newFinalState.label = dataflow.label + (idCounter - 1) + "_newEnd"
                                        newFinalState.setFinal
                                        
                                        existingTransition.setImmediate
                                        val newTransition = SCChartsFactory.eINSTANCE.createTransition
                                        newTransition.sourceState = oldFinalState
                                        newTransition.targetState = newFinalState
                                        
                                        // switch old effects to temporary valuedObjects
                                        for (e: existingTransition.effects) {
                                            val oldAssignment = e as Assignment
                                            val oldValuedObject = oldAssignment.valuedObject.copy
                                            val tmpValuedObject = KExpressionsFactory.eINSTANCE.createValuedObject
                                            tmpValuedObject.name = "tmp_" + tmpCounter
                                            oldAssignment.valuedObject = tmpValuedObject
                                            tmpCounter = tmpCounter + 1
                                            
                                            val valuedObjectReference = KExpressionsFactory.eINSTANCE.createValuedObjectReference
                                            valuedObjectReference.valuedObject = tmpValuedObject
                                            
                                            var Equation equation 
                                            for (dfEquation: dataflow.equations) {
                                                if (dfEquation.valuedObject.name.equals(oldValuedObject.name)) {
                                                    equation = dfEquation
                                                }
                                            }
                                            val refedExpr = (equation.expression as ValuedObjectReference).valuedObject
                                            
                                            val newAssignment = SCChartsFactory.eINSTANCE.createAssignment
                                            newAssignment.valuedObject = oldValuedObject
                                            newAssignment.expression = valuedObjectReference.copy
                                            newTransition.effects += newAssignment.copy
                                            //remember output valued object of defineNode
                                            if(!effectMapping.containsKey(refedExpr)) {
                                                effectMapping.put(refedExpr, newAssignment)
                                            }
                                        }
                                        // add new effect for current output
                                        val existingAssignment = effectMapping.get(refedVo)
                                        val newAssignment = SCChartsFactory.eINSTANCE.createAssignment
                                        newAssignment.valuedObject = eq.valuedObject
                                        newAssignment.expression = existingAssignment.expression.copy
                                        newTransition.effects += newAssignment
                                    }
                                } else {
                                    // transformation of next equation of define node needed
                                    val existingTransition = startState.outgoingTransitions.get(0)
                                    
                                    if (existingTransition.immediate) {
                                        val tmpValuedObject = KExpressionsFactory.eINSTANCE.createValuedObject
                                        tmpValuedObject.name = "tmp_" + tmpCounter
                                        tmpCounter = tmpCounter + 1
                                        
                                        val newAssignment = SCChartsFactory.eINSTANCE.createAssignment
                                        newAssignment.valuedObject = tmpValuedObject
                                        newAssignment.expression = newExpr
                                        
                                        existingTransition.effects += newAssignment
                                        
                                        val valuedObjectReference = KExpressionsFactory.eINSTANCE.createValuedObjectReference
                                        valuedObjectReference.valuedObject = tmpValuedObject
                                        val newAssignment2 = SCChartsFactory.eINSTANCE.createAssignment
                                        newAssignment2.valuedObject = eq.valuedObject
                                        newAssignment2.expression = valuedObjectReference.copy
                                        
                                        val effectTransition = existingTransition.targetState.outgoingTransitions.get(0)
                                        effectTransition.effects += newAssignment2
                                        effectMapping.put(refedVo, newAssignment2)
                                    } else {
                                        val newAssignment = SCChartsFactory.eINSTANCE.createAssignment
                                        newAssignment.valuedObject = eq.valuedObject
                                        newAssignment.expression = newExpr
                                    
                                        existingTransition.effects += newAssignment
                            
                                        //replace valued objects according to call parameters
                                        val refedInputs = <ValuedObject>newArrayList
                                        defNode.inputs.forEach[
                                            refedInputs += valuedObjects
                                        ]
                                        var exprCounter = 0
                                        for (p: cn.parameters) {
                                            val in = (p as ValuedObjectReference).valuedObject
                                            startState.replaceAllOccurrences(refedInputs.get(exprCounter), in)
                                            exprCounter = exprCounter + 1
                                        }
                                        valuedObjectMapping.put(refedOutputs.findFirst[name.equals(refedVo.name)], cn)
                                    }
                                }
                            } else {
                                // already existing code
                                val newAssignment = SCChartsFactory.eINSTANCE.createAssignment
                                newAssignment.valuedObject = eq.valuedObject
                                newAssignment.expression = newExpr
                                 
                                val rRegion = parentState.createRegion("_" + dataflow.id + regionCounter)
                                rRegion.label = dataflow.label + regionCounter
                    
                                val newState = rRegion.createState("_" + dataflow.ID + idCounter)
                                newState.label = dataflow.label + idCounter + "_start"
                                newState.setInitial
                    
                                val newState2 = rRegion.createState("_" + dataflow.ID + idCounter)
                                newState2.label = dataflow.label + idCounter + "_end"
                                newState2.setFinal
                            
                                regionCounter = regionCounter + 1
                                idCounter = idCounter + 1
                            
                                val transition = SCChartsFactory.eINSTANCE.createTransition
                                transition.sourceState = newState
                                transition.targetState = newState2
                                transition.effects += newAssignment
                            
                                //replace valued objects according to call parameters
                                val refedInputs = <ValuedObject>newArrayList
                                defNode.inputs.forEach[
                                    refedInputs += valuedObjects
                                ]
                                var exprCounter = 0
                                for (p: cn.parameters) {
                                    val in = (p as ValuedObjectReference).valuedObject
                                    newState.replaceAllOccurrences(refedInputs.get(exprCounter), in)
                                    exprCounter = exprCounter + 1
                                }
                                // remember callNode and valuedObject
                                nodeMapping.put(cn, newState)
                                
                                val mappingVo = refedOutputs.findFirst[name.equals(refedVo.name)]
                                valuedObjectMapping.put(mappingVo, cn)
                             }
                        } else {
                            /*
                             * DefineNode contains SCChart:
                             * create a new region for it, copy the content and replace all
                             * valued objects accordingly 
                             */
                             
                            if (nodeMapping.containsKey(cn)) {
                                // get already existing state, region and transition
                                val startState = nodeMapping.get(cn)
                                val parentRegion = startState.parentRegion
                                
                                if (valuedObjectMapping.containsKey((eq.expression as ValuedObjectReference).valuedObject)) {
                                    
                                } else {
                                    val refedVo = (eq.expression as ValuedObjectReference).valuedObject
                                    for (s: parentRegion.states) {
                                        s.replaceAllOccurrences(refedVo, eq.valuedObject)
                                    }
                                    valuedObjectMapping.put((eq.expression as ValuedObjectReference).valuedObject, cn)
                                }
                                
                                
                            } else {
                                val rRegion = parentState.createRegion("_" + dataflow.id + regionCounter)
                                rRegion.label = dataflow.label + regionCounter
                                regionCounter = regionCounter + 1
                            
                                val transitionMapping = <Transition, Transition> newHashMap
                            
                                //copy states
                                for (s: defNode.states) {
                                    val newState = s.copy
                                    // copy transitions
                                    for (t: s.incomingTransitions) {
                                        var newTrans = SCChartsFactory.eINSTANCE.createTransition
                                        if (transitionMapping.containsKey(t)) {
                                            newTrans = transitionMapping.get(t)
                                        } else {
                                            newTrans = t.copy
                                            transitionMapping.put(t, newTrans)
                                        }
                                        newTrans.targetState = newState
                                        newState.incomingTransitions += newTrans
                                    
                                    }
                                    for (t: s.outgoingTransitions) {
                                        var newTrans = SCChartsFactory.eINSTANCE.createTransition
                                        if (transitionMapping.containsKey(t)) {
                                            newTrans = transitionMapping.get(t)
                                        } else {
                                            newTrans = t.copy
                                            transitionMapping.put(t, newTrans)
                                        }
                                        newTrans.sourceState = newState
                                        newState.outgoingTransitions += newTrans
                                    }
                                    rRegion.states += newState
                                }
                                // replace input valued objects
                                defNode.inputs.forEach[ i|
                                    i.valuedObjects.forEach[ vo|
                                        rRegion.states.forEach[
                                            it.replaceAllOccurrences(vo, (cn.parameters.get(i.valuedObjects.indexOf(vo)) as ValuedObjectReference).valuedObject)
                                        ]
                                    ]
                                ]
                                // replace output valued object
                                val refedVo = (eq.expression as ValuedObjectReference).valuedObject
                                for (s: rRegion.states) {
                                    s.replaceAllOccurrences(refedVo, eq.valuedObject)
                                }
                                /*
                                 * remove transitions with no source or target state attached
                                 * because they are not visualized
                                 * and cannot be transformed to core sccharts
                                 * (but has been maybe created when copying transitions from DefineNodes)
                                 */
                                rRegion.states.forEach[ s|
                                    s.incomingTransitions.forEach[
                                        if (it.sourceState == null || it.targetState == null) {
                                            it.remove
                                        }
                                    ]
                                    s.outgoingTransitions.forEach[
                                        if (it.sourceState == null || it.targetState == null) {
                                            it.remove
                                        }
                                    ]
                                ]
                            
                                var State initState
                                for (s: rRegion.states) {
                                    if (s.initial) {
                                        initState = s
                                    }
                                }
                                nodeMapping.put(cn, initState)
                                valuedObjectMapping.put((eq.expression as ValuedObjectReference).valuedObject, cn)
                            }
                        }
			        } else {
			            /*
			             * Equation: eq.node is a ReferenceNode
			             * transformation already done at the beginning
			             * => skip this case at this place
			             */
			        }
			    } else {
			        /*
			         * Equation: eq.node == null
			         * => create new region with initial and final state for each expression
			         * and create new assignment as transition effect
			         */
                    val rRegion = parentState.createRegion("_" + dataflow.id + regionCounter)
                    rRegion.label = dataflow.label + regionCounter
                    
                    val newState = rRegion.createState("_" + dataflow.ID + idCounter)
                    newState.label = dataflow.label + idCounter + "_start"
                    newState.setInitial
                    
                    val newState2 = rRegion.createState("_" + dataflow.id + idCounter)
                    newState2.label = dataflow.label + idCounter + "_end"
                    newState2.setFinal
                    
                    regionCounter = regionCounter + 1
                    idCounter = idCounter + 1
                    
                    val newAssignment = SCChartsFactory.eINSTANCE.createAssignment
                    newAssignment.valuedObject = eq.valuedObject
                    newAssignment.expression = eq.expression
                    
                    val transition = SCChartsFactory.eINSTANCE.createTransition
                    transition.sourceState = newState
                    transition.targetState = newState2
                    transition.effects += newAssignment
			    }
			}

            // remove (old) dataflow and empty regions
    		dataflow.remove
    		for (r: parentState.regions.immutableCopy) {
    		    if (r.states.size == 0) {
    		        r.remove
    		    }
    		}
    	}
    	
    	// remove empty regions
    	for(r : state.regions.immutableCopy) {
    		if (r.states.size == 0) {
    		    r.remove
    		}
    	}
   	}
    
    private def String findPropagatedName(String name) {
        var newName = name
        for(k : propagatedBindings.keySet) {
            if (k == name) {
                newName = propagatedBindings.get(k).actual.name
                return newName.findPropagatedName
            }
        }
        newName
    }
}