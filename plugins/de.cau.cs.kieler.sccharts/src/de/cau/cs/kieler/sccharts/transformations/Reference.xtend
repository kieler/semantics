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

import com.google.common.collect.Sets
import com.google.inject.Inject
import de.cau.cs.kieler.core.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.core.kexpressions.TextExpression
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsExtension
import de.cau.cs.kieler.kico.transformation.AbstractExpansionTransformation
import de.cau.cs.kieler.kitt.tracing.Traceable
import de.cau.cs.kieler.sccharts.Binding
import de.cau.cs.kieler.sccharts.CallNode
import de.cau.cs.kieler.sccharts.DataflowRegion
import de.cau.cs.kieler.sccharts.Node
import de.cau.cs.kieler.sccharts.ReferenceNode
import de.cau.cs.kieler.sccharts.SCChartsFactory
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.extensions.SCChartsExtension

import de.cau.cs.kieler.core.kexpressions.Expression
import de.cau.cs.kieler.sccharts.features.SCChartsFeature

import static extension de.cau.cs.kieler.kitt.tracing.TracingEcoreUtil.*
import static extension de.cau.cs.kieler.kitt.tracing.TransformationTracing.*
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.core.kexpressions.keffects.Assignment
import de.cau.cs.kieler.core.kexpressions.keffects.KEffectsFactory

/**
 * SCCharts Reference Transformation.
 * 
 * @author ssm
 * @kieler.design 2014-05-19 proposed 
 * @kieler.rating 2014-05-19 proposed yellow
 */
class Reference extends AbstractExpansionTransformation implements Traceable {

    //-------------------------------------------------------------------------
    //--                 K I C O      C O N F I G U R A T I O N              --
    //-------------------------------------------------------------------------
    override getId() {
        return SCChartsTransformation::REFERENCE_ID
    }

    override getName() {
        return SCChartsTransformation::REFERENCE_NAME
    }

    override getExpandsFeatureId() {
        return SCChartsFeature::REFERENCE_ID
    }

    override getProducesFeatureIds() {

        // TODO: Check
        return Sets.newHashSet()
    }

    override getNotHandlesFeatureIds() {

        // TODO: Check
        return Sets.newHashSet()
    }

    //-------------------------------------------------------------------------
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

    private val propagatedBindings = <String, Binding>newHashMap

    //-------------------------------------------------------------------------
    //--                        R E F E R E N C E                            --
    //-------------------------------------------------------------------------
    // ...
    def State transform(State rootState) {
        val targetRootState = rootState.fixAllPriorities;
        // Transform dataflows first
		targetRootState.transformDataflows
        // Traverse all referenced states
        targetRootState.allContainedStates.filter[referencedState].toList.immutableCopy.forEach [
            transformReference(targetRootState)
        ]
        
        targetRootState;
    }

    def void transformReference(State state, State targetRootState) {        
        state.setDefaultTrace
        // Referenced scopes are always SCCharts
        // Each referenced state must be contained in a region.
        val newState = (state.referencedScope as State).copyState => [
            state.parentRegion.states += it
            id = state.id
            label = state.label
        ]

        var newStateIterator = newState.eAllContents
        while (newStateIterator.hasNext) {
            val eObject = newStateIterator.next
            if (eObject instanceof Assignment || eObject instanceof ValuedObjectReference ||
                eObject instanceof TextExpression || eObject instanceof Binding) {
                for (binding : state.bindings) {
                    if (eObject instanceof Assignment) {
                        val assignment = (eObject as Assignment);
                        val assignmentCopy = assignment.nontracingCopy;
                        if (assignment.valuedObject.name == binding.formal.name) {
                            assignment.valuedObject = binding.actual
                        }
                        assignment.indices.clear
                        for (index : assignmentCopy.indices) {
                            assignment.indices.add(index.nontracingCopy.rtrace(binding));
                        }
                    } else if (eObject instanceof ValuedObjectReference) {
                        val valuedObjectReference = (eObject as ValuedObjectReference);
                        val valuedObjectReferenceCopy = valuedObjectReference.nontracingCopy
                        if (valuedObjectReference.valuedObject.name == binding.formal.name) {
                            valuedObjectReference.valuedObject = binding.actual
                        }
                        valuedObjectReference.indices.clear
                        for (index : valuedObjectReferenceCopy.indices) {
                            valuedObjectReference.indices.add(index.nontracingCopy.rtrace(binding));
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

        state.bindings.forEach [ binding |
            if (binding.hasAnnotation(PROPAGATE_ANNOTATION)) {
                propagatedBindings.put(binding.formal.name, binding)
            }
            newState.declarations.immutableCopy.forEach [
                val bindingName = binding.formal.name
                val objects = valuedObjects.filter[name == bindingName].toList
                objects.immutableCopy.forEach[delete]
            ]
        ]

        newState.declarations.immutableCopy.forEach [ declaration |
            if (declaration.isInput || declaration.isOutput) {
                declaration.valuedObjects.forEach [
                    val newObject = (newState.eContainer as Scope).findValuedObjectByName(name)
                    if (newObject != null) {
                        newState.replaceAllOccurrences(it, newObject)
                    } else {
                        val propagatedName = name.findPropagatedName
                        if (!propagatedName.nullOrEmpty) {
                            val propagatedNewObject = (newState.eContainer as Scope).
                                findValuedObjectByName(propagatedName)
                            newState.replaceAllOccurrences(it, propagatedNewObject)
                        }
                    }
                ]
                declaration.delete
            }
        ]

        state.incomingTransitions.immutableCopy.forEach[targetState = newState]
        state.outgoingTransitions.immutableCopy.forEach[sourceState = newState]

        newState => [
            initial = state.initial
            ^final = state.^final
        ]

        state.remove

        newState.allContainedStates.filter[referencedState].toList.immutableCopy.forEach [
            transformReference(newState)
        ]
    }

    
    def transformDataflows(State state) {
    	val dataflows = <DataflowRegion> newHashSet
    	// traverse all dataflows
    	state.getAllContainedStates.forEach[ dataflows += regions.filter(typeof(DataflowRegion))]
    	val nodeMapping = <Node, State> newHashMap
    	for(dataflow : dataflows.immutableCopy) {
    		val parentState = dataflow.eContainer as State
    		var regionCounter = 0
			var idCounter = 0
			/*
			 * Transform ReferenceNodes first
			 * => create new region and state, copy referenced scope
			 * and bind all valued objects accordingly
			 */
            for(refNode: dataflow.nodes.filter(typeof(ReferenceNode))) {
                val rRegion = parentState.createControlflowRegion("_" + dataflow.id + regionCounter)
                rRegion.label = dataflow.label + regionCounter
                val newState = rRegion.createState("_" + refNode.id + idCounter)
                newState.label = if (refNode.label != null) {refNode.label + idCounter} else {refNode.id + idCounter}
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
                    if (eq.node != null) {
                        if (eq.node.equals(refNode)) {
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
                }
                (newState.referencedScope as State).transform
            }
			// transform all call nodes
			val assignmentMapping = <String, Assignment> newHashMap
			val voMapping = <String, ValuedObject> newHashMap
			val transitionsMapping = <String, Transition> newHashMap
			for(callNode: dataflow.nodes.filter(typeof(CallNode))) {
			    // Get the called DefineNode, create lists for all inputs and outputs
			    val defNode = callNode.callReference
			    val refedInputs = <ValuedObject>newArrayList
                defNode.inputs.forEach[
                    refedInputs += valuedObjects
                ]
			    val refedOutputs = <ValuedObject>newArrayList
                defNode.outputs.forEach[
                    refedOutputs += valuedObjects
                ]
			    
			    if (defNode.states.nullOrEmpty) {
                    // case: dataflow is modelled inside define node
                    // create new region, initial and final state
                    val newRegion = parentState.createControlflowRegion("_" + dataflow.id + regionCounter)
                    newRegion.label = dataflow.label + regionCounter
                    
                    val newState = newRegion.createState("_" + dataflow.ID + idCounter)
                    newState.label = dataflow.label + idCounter + "_start"
                    newState.setInitial
                    
                    val newState2 = newRegion.createState("_" + dataflow.ID + idCounter)
                    newState2.label = dataflow.label + idCounter + "_end"
                    
                    // change comments on next two lines for "old" version
//                    newState2.setFinal
                    createNewTransition(newState2, newState)
                    
                    // create transition between states for effects
                    val transition = createNewTransition(newState, newState2)
                    transition.setImmediate
                    
                    // create an assignment effect for all dataflow equations modelled inside
                    // the defining node
                    var eqCounter = 0
                    for (vo: defNode.valuedObjects) {
                        val newAssignment = createNewAssignment(vo, defNode.expressions.get(eqCounter).copy)
                        transition.effects += newAssignment
                        eqCounter = eqCounter + 1
                        assignmentMapping.put(callNode.id + "." + vo.name, newAssignment)
                    }
                    
                    // replace inputs
                    var exprCounter = 0
                    for (p: callNode.parameters) {
                        val in = (p as ValuedObjectReference).valuedObject
                        newState.replaceAllOccurrences(refedInputs.get(exprCounter), in)
                        exprCounter = exprCounter + 1
                    }
                    
                    // replace outputs: get all dataflow equations which have a reference
                    // to the current call node
                    for (eq: dataflow.equations) {
                        if (eq.node != null) {
                            if (eq.node.equals(callNode)) {
                                val key = callNode.id + "." + (eq.expression as ValuedObjectReference).valuedObject.name
                                val vo = eq.valuedObject
                                // check if output variable is already substituted
                                if (voMapping.containsKey(key)) {
                                    val existingValuedObject = voMapping.get(key)
                                    /*
                                     * if the region has two states (initial+final) then create
                                     * a third state and another immediate transition to the new state.
                                     * Set old final state to normal and the new state to final.
                                     * Put all output variables referring to the same output value
                                     * of the call node as an effect to this transition 
                                     */
                                    if (newRegion.states.size == 2) {
                                            newState2.setFinal(false)
                                            newState2.label = dataflow.label + idCounter + "_mid"
                                        
                                            val newFinalState = newRegion.createState("_" + dataflow.id + idCounter)
                                            newFinalState.label = dataflow.label + idCounter + "_end"
                                            newFinalState.setFinal
                                            
                                            val newTransition = createNewTransition(newState2, newFinalState)
                                            newTransition.setImmediate
                                    }
                                    // if thirs state already exist, just create the assignment
                                    val newAssignment = createNewAssignment(vo, existingValuedObject.reference)
                                    newState2.outgoingTransitions.get(0).effects += newAssignment
                                
                                // if the output variable is not yet substituted (first look at it)
                                // then substitute 
                                } else {
                                    val oldAssignment = assignmentMapping.get(key)
                                    oldAssignment.valuedObject = vo
                                    voMapping.put(key, vo)
                                }
                            }
                        }
                    }
                    // increment counters
                    regionCounter = regionCounter + 1
                    idCounter = idCounter + 1
                    // remember CallNode and its initial state
                    nodeMapping.put(callNode, newState)
			    } else {
                    // second case: controlflow is modeled inside define node
                    // create new region and copy all content of the define node
			        val newRegion = parentState.createControlflowRegion("_" + dataflow.id + regionCounter)
                    newRegion.label = dataflow.label + regionCounter
                    
                    val transitionMapping = <Transition, Transition> newHashMap
                    // copy states
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
                        newRegion.states += newState
                    }
                    /*
                     * remove transitions with no source or target state attached
                     * because they are not visualized
                     * and cannot be transformed to core sccharts
                     * (but has been maybe created when copying transitions from DefineNodes)
                     */
                    newRegion.states.forEach[ s|
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
                    // replace input valued objects
                    defNode.inputs.forEach[ i|
                        i.valuedObjects.forEach[ vo|
                            newRegion.states.forEach[
                                it.replaceAllOccurrences(vo, (callNode.parameters.get(i.valuedObjects.indexOf(vo)) as ValuedObjectReference).valuedObject)
                            ]
                        ]
                    ]
                    // remember callNode and its initial state
                    var State initState
                    for (s: newRegion.states) {
                        if (s.initial) {
                            initState = s
                        }
                    }
                    nodeMapping.put(callNode, initState)
                    // deal with multiple use of outputs
                    // first get all equations which refer to the current call node
                    for (eq: dataflow.equations) {
                        if (eq.node != null) {
                            if (eq.node.equals(callNode)) {
                                val key = callNode.id + "." + (eq.expression as ValuedObjectReference).valuedObject.name
                                val vo = eq.valuedObject
                                val voRef = (eq.expression as ValuedObjectReference).valuedObject
                                /* if the output variable is already substituted traverse all states
                                 * to get the corresponding transitions
                                 * add a new assignment effect to set current output to the already
                                 * substituted value.
                                 */
                                if (voMapping.containsKey(key)) {
                                    for (s: newRegion.states) {
                                        for (t: s.allContainedTransitions) {
                                            if (transitionsMapping.containsKey(key+t.id)) {
                                                val newAssignment = createNewAssignment(vo, voMapping.get(key).reference)
                                                transitionsMapping.get(key+t.id).effects += newAssignment
                                            }
                                        }
                                    }
                                /*  if the output is not already substituted, traverse all states
                                 *  to find all occurence of the value and replace it
                                 */
                                } else {
                                    for (s: newRegion.states) {
                                        for (t: s.allContainedTransitions) {
                                            for (assign: t.allContainedAssignments) {
                                                if (assign.valuedObject.equals(voRef)) {
                                                    assign.valuedObject = vo
                                                    voMapping.put(key, vo)
                                                    transitionsMapping.put(key + t.id, t)
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
			    }
			}
			
			// transform all dataflow equations which do not refer to a node
			val assignmentList = <Assignment> newArrayList			
			for (eq: dataflow.equations) {
			    if (eq.node == null) {
                    // Equation: eq.node == null
                    // and create new assignment as transition effect
                    assignmentList += createNewAssignment(eq.valuedObject, eq.expression)
                }
            }
            /*
             * create just one new region for all dataflow equations
             * and put all assignments as effect to a transition between the initial and final state
             */
            if (!assignmentList.empty) {
                // => create new region with initial and final state for each expression
                val rRegion = parentState.createControlflowRegion("_" + dataflow.id + regionCounter)
                rRegion.label = dataflow.label + regionCounter
                    
                val newState = rRegion.createState("_" + dataflow.ID + idCounter)
                newState.label = dataflow.label + idCounter + "_start"
                newState.setInitial
                    
                val newState2 = rRegion.createState("_" + dataflow.id + idCounter)
                newState2.label = dataflow.label + idCounter + "_end"
                // change comment on next two lines for "old" version
//                newState2.setFinal
                createNewTransition(newState2, newState)
                    
                regionCounter = regionCounter + 1
                idCounter = idCounter + 1
                
                val transition = createNewTransition(newState, newState2)
                transition.setImmediate
                
                for (assign: assignmentList) {
                    transition.effects += assign
                }
            }
            // recursive call, to get all nested dataflows after reference
            parentState.regions.filter(ControlflowRegion).forEach[
                states.forEach[
                    transform
                ]
            ]
			
            // remove (old) dataflow and empty regions
    		dataflow.remove
    		for (r: parentState.regions.filter(ControlflowRegion).toList) {
    		    if (r.states.size == 0) {
    		        r.remove
    		    }
    		}
    	}
    	
    	// remove empty regions
    	for(r : state.regions.filter(ControlflowRegion).toList) {
    		if (r.states.size == 0) {
    		    r.remove
    		}
    	}
   	}
   	
   	// helper methods
   	private def Assignment createNewAssignment(ValuedObject vo, Expression expression) {
   	    val newAssignment = KEffectsFactory.eINSTANCE.createAssignment
   	    newAssignment.valuedObject = vo
   	    newAssignment.expression = expression
   	    return newAssignment
   	}
   	
   	private def Transition createNewTransition(State sourceState, State targetState) {
   	    val newTransition = SCChartsFactory.eINSTANCE.createTransition
   	    newTransition.sourceState = sourceState
   	    newTransition.targetState = targetState
   	    return newTransition
   	}
    
    private def String findPropagatedName(String name) {
        var newName = name

        for (k : propagatedBindings.keySet) {
            if (k == name) {
                newName = propagatedBindings.get(k).actual.name
                return newName.findPropagatedName
            }
        }

        newName
    }
}
