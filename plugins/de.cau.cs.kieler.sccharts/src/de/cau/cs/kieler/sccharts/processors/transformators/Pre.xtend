/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.processors.transformators

import com.google.inject.Inject
import de.cau.cs.kieler.annotations.extensions.UniqueNameCache
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsComplexCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsActionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsControlflowRegionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsScopeExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsTransformationExtension
import de.cau.cs.kieler.sccharts.extensions.SCChartsTransitionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsUniqueNameExtensions
import de.cau.cs.kieler.sccharts.processors.SCChartsProcessor
import java.util.Stack
import org.eclipse.emf.ecore.EObject
import java.util.HashMap

/**
 * SCCharts Pre Transformation.
 * 
 * @author cmot
 * @kieler.design 2013-09-05 proposed 
 * @kieler.rating 2013-09-05 proposed yellow
 */
class Pre extends SCChartsProcessor implements Traceable {

    //-------------------------------------------------------------------------
    //--                 K I C O      C O N F I G U R A T I O N              --
    //-------------------------------------------------------------------------
    override getId() {
        "de.cau.cs.kieler.sccharts.processors.transformators.pre"
    }
    
    override getName() {
        "Pre"
    }
 
    override process() {
        setModel(model.transform)
    }

    //-------------------------------------------------------------------------

    @Inject extension KExpressionsComplexCreateExtensions
    @Inject extension KExpressionsCreateExtensions
    @Inject extension KEffectsExtensions
    @Inject extension SCChartsScopeExtensions
    @Inject extension SCChartsControlflowRegionExtensions
    @Inject extension SCChartsStateExtensions
    @Inject extension SCChartsActionExtensions
    @Inject extension SCChartsTransitionExtensions
    @Inject extension SCChartsUniqueNameExtensions    
    @Inject extension SCChartsTransformationExtension
    
    private val nameCache = new UniqueNameCache

    // This prefix is used for naming of all generated signals, states and regions
    static public final String GENERATED_PREFIX = "_"

    //-------------------------------------------------------------------------
    //--                        P R E -  O P E R A T O R                     --
    //-------------------------------------------------------------------------
    // Transforming PRE Operator.
    def SCCharts transform(SCCharts sccharts) {
        sccharts => [ rootStates.forEach[ transform ] ]
    }
    
    private def State transform(State rootState) {
        nameCache.clear
                
        val targetRootState = rootState
        val transformedVariables = <ValuedObject, ValuedObject>newHashMap

        // Find all pre statements
        val allPreExpressionsInnerFirst = new Stack<OperatorExpression>
        val iterator = rootState.eAllContents
        while(iterator.hasNext) {
            val obj = iterator.next
            if(obj instanceof OperatorExpression) {
                if(obj.operator == OperatorType::PRE) {
                    allPreExpressionsInnerFirst.add(obj)    
                }    
            }
        }

        // Traverse all pre statements, inner pre statements must be handled first
        for(pre : allPreExpressionsInnerFirst) {
            pre.transform(targetRootState, transformedVariables)
        }

        // Traverse all states
//        for (targetState : targetRootState.getAllStates.toList) {
//            targetState.transformPre(targetRootState);
//        }
        targetRootState
    }
    
    private def transform(OperatorExpression pre, State targetRootState, HashMap<ValuedObject, ValuedObject> transformedVariables) {
        val valuedObjectRef = pre.valuedObjectReference
        if(valuedObjectRef !== null) {
            val valuedObject = valuedObjectRef.valuedObject
            if(valuedObject !== null && !transformedVariables.containsKey(valuedObject)) {
                valuedObject.transform(transformedVariables)
            }
            pre.replaceWithTransformedVariable(valuedObjectRef)
        }
    }
    
    private def transform(ValuedObject valuedObject, HashMap<ValuedObject, ValuedObject> transformedVariables) {
        // TODO: Tracing

        // Create a register variable
        val state = valuedObject.parentState
        val regVariable = state.createPreVariable(valuedObject.registerVariableName, valuedObject)
        regVariable.initialValue = getNeutralElement(valuedObject)
        
        // Create a pre variable
        val preVariable = state.createPreVariable(valuedObject.preVariableName, valuedObject)
        // This initial value is initialized immediately with the initial value of the register variable
        preVariable.initialValue = null
        
        // Create a region in which the pre variable is set to the register variable,
        // and afterwards the register variable is set to the original variable.
        // Thus the pre variable has the value of the original variable from the last tick.
        val preRegion = state.createControlflowRegion(valuedObject.preRegionName)
        val preInit = preRegion.createInitialState(GENERATED_PREFIX + "Init")
        val preWait = preRegion.createState(GENERATED_PREFIX + "Wait")

        // Immediate transition for assignments
        val transInitWait = preInit.createImmediateTransitionTo(preWait)
        // Delayed transition back to init state
        preWait.createTransitionTo(preInit);

        // Create assignments
        // TODO: Add assignments for all array indices if needed
        transInitWait.addEffectBefore(regVariable.createAssignment(valuedObject.reference))
        transInitWait.addEffectBefore(preVariable.createAssignment(regVariable.reference))                    

        // Edge case: make states final.
        // If the state has outgoing terminations, we need to finalize the during
        // actions in case we end the states over these transitions
        val outgoingTerminations = state.outgoingTransitions.filter[ isTermination ]
        val hasOutgoingTerminations = outgoingTerminations.length > 0
        val complexPre = ((hasOutgoingTerminations || state.isRootState) && state.regionsMayTerminate)
        if (complexPre) {
            preWait.setFinal
            preInit.setFinal
        }
        
        // Remember this pre variable for the original valued object
        transformedVariables.put(valuedObject, preVariable)
    }
    
    private def ValuedObject createPreVariable(State state, String name, ValuedObject source) {
        val v = state.createValuedObject(name)
        v.copyAttributes(source)
        v.declaration.copyAttributes(source.declaration)
        v.declaration.input = false
        v.declaration.output = false
        return v
    }
    
    private def Expression getNeutralElement(ValuedObject valuedObject) {
        // TODO: In case of array, set each field to the neutral value (vector notation)
        val type = valuedObject.type
        switch(type) {
            case BOOL : { return createBoolValue(false) }
            case INT, case UNSIGNED : { return createIntValue(0) }
            case FLOAT, case DOUBLE : { return createFloatValue(0) }
            case STRING : { return createStringValue("") }
            default: {
                return null
            }
        }
    }
    
    private def String getRegisterVariableName(ValuedObject valuedObject) {
        return GENERATED_PREFIX+"reg_"+valuedObject.name
    }
    
    private def String getPreVariableName(ValuedObject valuedObject) {
        return GENERATED_PREFIX+"pre_"+valuedObject.name
    }
    
    private def String getPreRegionName(ValuedObject valuedObject) {
        return GENERATED_PREFIX+"update_pre_"+valuedObject.name
    }
    
    private def replaceWithTransformedVariable(OperatorExpression pre, ValuedObjectReference valuedObjectReference) {
        // Replace the pre expression in the parent container with the newly created pre variable for the valued object reference
        System.err.println("PRE USED:"+pre+","+pre.eContainer)
    }
    
    private def State getParentState(EObject obj) {
        val parent = obj.eContainer
        if(parent instanceof State) {
            return parent
        } else {
            return parent.getParentState
        }
    }
    
    private def getValuedObjectReference(OperatorExpression pre) {
        if(pre.operator == OperatorType::PRE) {
            if(pre.subExpressions.size == 1) {
                val subExp = pre.subExpressions.get(0)
                if(subExp instanceof ValuedObjectReference) {
                    return subExp
                }
            }
        }
        return null
    }

//    // Traverse all states that might declare a valuedObject that is used with the PRE operator
//    def void transformPre(State state, State targetRootState) {
//        state.setDefaultTrace
//        
//        // If the state has outgoing terminations, we need to finalize the during
//        // actions in case we end the states over these transitions
//        val outgoingTerminations = state.outgoingTransitions.filter[ isTermination ]
//        val hasOutgoingTerminations = outgoingTerminations.length > 0
//        val complexPre = ((hasOutgoingTerminations || state.isRootState) && state.regionsMayTerminate)        
//
//        // The transition with the assignment of the pre variables
//        var HashMap<String, Transition> transitions = newHashMap();
//        var Transition transInitWait
//        
//        // This list keeps track of the very last auxiliary pre variable of a nested pre
//        // (e.g. some 'int _pre__pre__pre_x') to remove its initialization as optimization.
//        var List<ValuedObject> lastPreVariablesOfNestedPre = newArrayList()
//        // Filter all valuedObjects and retrieve those that are referenced
//        val allActions = state.eAllContents.filter(typeof(Action)).toList
//        var hasPre = allActions.map[ eAllContents ].exists[ filter(OperatorExpression).exists[ operator == OperatorType.PRE ] ]
////        hasPre = true
//        val allValuedObjects = state.declarations.map[valuedObjects].flatten.toList
//        var List<ValuedObject> allPreValuedObjects = null
//        // Repeat the next steps until no pre occurs anymore (in case of nested pre)
//        if (hasPre)
//        do {
////            allPreValuedObjects = allValuedObjects.filter(
////                valuedObject|
////                    allActions.filter(
////                        action|
////                            action.getPreExpression(valuedObject).hasNext ||
////                                action.getPreValExpression(valuedObject).hasNext).size > 0).toList
//
//            // This is a performance workaround.
//            // You should really restructure the whole transformation and get rid of all the lists and eAllContent calls.
//            // However, even this hot fix is twice as fast.
//            allPreValuedObjects = allValuedObjects.filter[ vo |
//                allActions.map[ eAllContents ].exists[ filter(OperatorExpression).filter[ operator == OperatorType.PRE ].
//                map[ eAllContents ].exists[ filter(ValuedObjectReference).exists[ valuedObject == vo ] ] ]
//            ].toList
//    
//            // Remove pre statement
//    		for (preValuedObject : allPreValuedObjects) {
//    		    // Is the valued object a variable that was introduced by the pre trafo itself?
//    		    val name = preValuedObject.name
//                val isValuedObjectOfNestedPre = name.startsWith(GENERATED_PREFIX + "pre")
//                
//                // Tracing
//                preValuedObject.setDefaultTrace
//                
//                // Initialize sccharts elements that are used instead pre
//                if(!isValuedObjectOfNestedPre) {
//                    allPreValuedObjects.setDefaultTrace
//                    
//                    val preRegion = state.createControlflowRegion(GENERATED_PREFIX + "Pre").uniqueName(nameCache)
//                    val preInit = preRegion.createInitialState(GENERATED_PREFIX + "Init").uniqueName(nameCache)
//                    val preWait = preRegion.createState(GENERATED_PREFIX + "Wait").uniqueName(nameCache)
//                    if (complexPre) {
//                        preWait.setFinal
//                        preInit.setFinal
//                    }
//
//                    // Immediate transition for assignments
//                    transInitWait = preInit.createImmediateTransitionTo(preWait)
//                    transitions.put(name, transInitWait);
//                    // Delayed transition back to init state
//                    preWait.createTransitionTo(preInit);
//                } else {
//                    transInitWait = transitions.get(name.replaceAll(GENERATED_PREFIX + "pre" + GENERATED_PREFIX, ""));
//                }
//                
//                // New register variable
//                var ValuedObject newAux
//                if(!isValuedObjectOfNestedPre) {
//                    newAux = state.createVariable(GENERATED_PREFIX + "reg" + GENERATED_PREFIX 
//                        + preValuedObject.name).setType(preValuedObject.getType).uniqueName(nameCache)
//                    newAux.copyAttributes(preValuedObject)
//                    newAux.setDefaultValue()                    
//                }
//                // New pre variable
//                val newPre = state.createVariable(GENERATED_PREFIX + "pre" + GENERATED_PREFIX 
//                    + preValuedObject.name).setType(preValuedObject.getType).uniqueName(nameCache)
//                newPre.copyAttributes(preValuedObject)
//                
//                if(isValuedObjectOfNestedPre) {
//                    transInitWait.addEffectBefore(newPre.createAssignment(preValuedObject.reference))
//                    newPre.initialValue = preValuedObject.reference
//                } else {
//                    transInitWait.addEffectBefore(newAux.createAssignment(preValuedObject.reference))
//                    transInitWait.addEffectBefore(newPre.createAssignment(newAux.reference))                    
//                    newPre.initialValue = newAux.reference
//                }
//
//                // The previous pre was not the last one.
//                lastPreVariablesOfNestedPre.remove(preValuedObject)
//                // This could be the last auxiliary pre variable.
//                lastPreVariablesOfNestedPre.add(newPre)
//    
//                // Replace the ComplexExpression Pre(S) by the ValuedObjectReference PreS in all actions            
//                // Replace the ComplexExpression Pre(?S) by the OperatorExpression ?PreS in all actions            
//                for (action : allActions) {
//                    val preExpressions = action.getPreExpression(preValuedObject);
//                    val preValExpressions = action.getPreValExpression(preValuedObject);
//    
//                    while (preExpressions.hasNext) {
//                        val preExpression = preExpressions.next
//                        val container = preExpression.eContainer;
//    
//                        if (container instanceof OperatorExpression) {
//    
//                            // If nested PRE or PRE inside another complex expression
//                            val i = (container as OperatorExpression).subExpressions.indexOf(preExpression)
//                            (container as OperatorExpression).subExpressions.remove(preExpression);
//                            (container as OperatorExpression).subExpressions.add(i, newPre.reference);
//                        } else if (container instanceof Action) {
//    
//                            // If PRE directly a trigger
//                            (container as Action).setTrigger(newPre.reference)
//                        } else if (container instanceof Assignment) {
//    
//                            // If PRE directly a assigned value
//                            (container as Assignment).expression = newPre.reference
//                        } else if (container instanceof Emission) {
//    
//                            // If PRE directly an emitted value
//                            (container as Emission).newValue = newPre.reference
//                        }
//                    }
//    
//                    while (preValExpressions.hasNext) {
//                        val preValExpression = preValExpressions.next
//                        val container = preValExpression.eContainer;
//    
//                        if ((!preValExpression.subExpressions.nullOrEmpty) &&
//                            preValExpression.subExpressions.get(0) instanceof OperatorExpression &&
//                            (preValExpression.subExpressions.get(0) as OperatorExpression).operator == OperatorType::VAL) {
//    
//                            // Transform pre(?V) --> ?PreV
//                            val valueExpression = preValExpression.subExpressions.get(0);
//                            (valueExpression as OperatorExpression).subExpressions.remove(0);
//                            (valueExpression as OperatorExpression).add(newPre.reference);
//                            if (container instanceof Emission) {
//                                (container as Emission).setNewValue(valueExpression.copy);
//                            } else if (container instanceof OperatorExpression) {
//    
//                                // If nested PRE or PRE inside another complex expression
//                                (container as OperatorExpression).subExpressions.remove(preValExpression);
//                                (container as OperatorExpression).add(valueExpression.copy);
//                            }
//                        }
//    
//                    }
//                }
//    
//            }
//        
//        }while(!allPreValuedObjects.isNullOrEmpty)
//        
//        // Remove initialization of last auxilary pre variable as optimization.
//        // (It will be initialized anyway as part of the transition.)
//        for(valuedObject : lastPreVariablesOfNestedPre) {
//            valuedObject.initialValue = null
//        }
//    }
//    
//    //-------------------------------------------------------------------------
//    
//    // Return a list of Pre Expressions for an action that references the valuedObject
//    def Iterator<OperatorExpression> getPreExpression(Action action, ValuedObject valuedObject) {
//        //val List<OperatorExpression> returnPreExpressions = <OperatorExpression>newLinkedList
//        val preExpressions = action.eAllContents.filter(typeof(OperatorExpression)).filter(
//            e|
//                (e.operator == OperatorType::PRE) && (e.subExpressions.size() == 1) &&
//                    (e.subExpressions.get(0) instanceof ValuedObjectReference) &&
//                    ((e.subExpressions.get(0) as ValuedObjectReference).valuedObject == valuedObject)
//        )
//        preExpressions
//    }
//
//    // Return a list of Pre Expressions for an action that references the value of a valuedObject
//    def Iterator<OperatorExpression> getPreValExpression(Action action, ValuedObject valuedObject) {
//        //val List<OperatorExpression> returnPreValExpressions = <OperatorExpression>newLinkedList
//        val preValExpressions = action.eAllContents.filter(typeof(OperatorExpression)).filter(
//            e|
//                (e.operator == OperatorType::PRE) && (e.subExpressions.size() == 1) &&
//                    (e.subExpressions.get(0) instanceof OperatorExpression) &&
//                    ((e.subExpressions.get(0) as OperatorExpression).operator == OperatorType::VAL) &&
//                    ((e.subExpressions.get(0) as OperatorExpression).subExpressions.size() == 1) &&
//                    ((e.subExpressions.get(0) as OperatorExpression).subExpressions.get(0) instanceof ValuedObjectReference) && (((e.
//                        subExpressions.get(0) as OperatorExpression).subExpressions.get(0) as ValuedObjectReference).
//                        valuedObject == valuedObject)
//        )
//        preValExpressions
//    }

}
