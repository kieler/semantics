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
package de.cau.cs.kieler.sccharts.transformations

import com.google.common.collect.Sets
import com.google.inject.Inject
import de.cau.cs.kieler.core.kexpressions.OperatorExpression
import de.cau.cs.kieler.core.kexpressions.OperatorType
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsExtension
import de.cau.cs.kieler.kico.transformation.AbstractExpansionTransformation
import de.cau.cs.kieler.kitt.tracing.Traceable
import de.cau.cs.kieler.sccharts.Action
import de.cau.cs.kieler.sccharts.Emission
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsExtension
import de.cau.cs.kieler.sccharts.featuregroups.SCChartsFeatureGroup
import de.cau.cs.kieler.sccharts.features.SCChartsFeature

import static extension de.cau.cs.kieler.kitt.tracing.TransformationTracing.*
import static extension de.cau.cs.kieler.kitt.tracing.TracingEcoreUtil.*
import de.cau.cs.kieler.core.kexpressions.ValueType
import de.cau.cs.kieler.core.kexpressions.CombineOperator

/**
 * SCCharts Signal Transformation.
 * 
 * @author cmot
 * @kieler.design 2013-09-05 proposed 
 * @kieler.rating 2013-09-05 proposed yellow
 */
class Signal extends AbstractExpansionTransformation implements Traceable {

    //-------------------------------------------------------------------------
    //--                 K I C O      C O N F I G U R A T I O N              --
    //-------------------------------------------------------------------------
    override getId() {
        return SCChartsTransformation::SIGNAL_ID
    }

    override getName() {
        return SCChartsTransformation::SIGNAL_NAME
    }

    override getExpandsFeatureId() {
        return SCChartsFeature::SIGNAL_ID
    }

    override getProducesFeatureIds() {
        return Sets.newHashSet(SCChartsFeature::DURING_ID)
    }

    override getNotHandlesFeatureIds() {
        return Sets.newHashSet(SCChartsFeatureGroup::EXPANSION_ID);
    }

    //-------------------------------------------------------------------------
    @Inject
    extension KExpressionsExtension

    @Inject
    extension SCChartsExtension

    // This prefix is used for naming of all generated signals, states and regions
    static public final String GENERATED_PREFIX = "_"

    //-------------------------------------------------------------------------
    //--                             S I G N A L S                           --
    //-------------------------------------------------------------------------
    // TODO: for inputs no during action!
    // TODO: relative writes!!
    private static val String variableValueExtension = GENERATED_PREFIX + "val";
    private static val String variableCurrentValueExtension = GENERATED_PREFIX + "curval";

    // @requires: during actions
    // For all states do the following:
    // If the state has a specification, then convert all signals
    // (a) simple signal S to boolean variable S (variablePresent)
    // (b) valued signal S to two boolean variables S and S_val (variableValue)
    //input signal S; --> input boolean S;
    //input signal S:bool; --> input boolean S; input boolean S_val;
    //input signal S:integer; --> input boolean S; input integer S_val;
    // Transforming a signal to a variable. 
    def State transform(State rootState) {
        val targetRootState = rootState.fixAllPriorities;

        // Traverse all states
        targetRootState.getAllStates.forEach [ targetState |
            targetState.transformSignal(targetRootState);
        ]
        targetRootState.fixAllTextualOrdersByPriorities;
    }

    // Traverse all states and transform outgoing normal termination transitions into weak aborts
    def void transformSignal(State state, State targetRootState) {
        val allSignals = state.signals

        // Go thru all signals
        for (ValuedObject signal : allSignals) {
            signal.setDefaultTrace;
            
            val isValuedSignal = !signal.pureSignal

            val presentVariable = signal

            // If this is a valued signal we need a second signal for the value
            if (isValuedSignal) {
                val valueVariable = state.createVariable(signal.name + variableValueExtension)
                val currentValueVariable = state.createVariable(signal.name + variableCurrentValueExtension)
                
                // Add an immediate during action that updates the value (in case of an emission)
                // to the current value
                val updateDuringAction = state.createImmediateDuringAction
                updateDuringAction.createAssignment(valueVariable, currentValueVariable.reference)
                updateDuringAction.setTrigger(presentVariable.reference)
                // Add an immediate during action that resets the current value
                // in each tick to the neutral element of the type w.r.t. combination function
                val resetDuringAction = state.createImmediateDuringAction
                resetDuringAction.createAssignment(currentValueVariable, signal.neutralElement)
                resetDuringAction.setImmediate(true)

                // Copy type and input/output attributes from the original signal
                currentValueVariable.applyAttributes(signal)
                val allActions = state.eAllContents.filter(typeof(Action)).toList
                for (Action action : allActions) {

                    // Wherever an emission is, create a new assignment right behind
                    val allSignalEmissions = action.getAllContainedEmissions.filter[e|e.valuedObject == signal].toList
                    for (Emission signalEmission : allSignalEmissions.immutableCopy) {
                        if (signalEmission.newValue != null) {

                            // Assign the emitted valued and combine!
                            val variableAssignment = currentValueVariable.assingCombined(signalEmission.newValue)

                            // Put it in right order
                            val index = action.effects.indexOf(signalEmission);
                            action.effects.add(index, variableAssignment);
                        }
                    }

                    // Wherever an val test is, put the valueVariable there instead
                    val allSignalValTests = action.eAllContents.filter(typeof(OperatorExpression)).filter(
                        e|
                            e.operator == OperatorType::VAL && e.subExpressions.get(0) instanceof ValuedObjectReference &&
                                (e.subExpressions.get(0) as ValuedObjectReference).valuedObject == signal).toList
                    for (OperatorExpression signalTest : allSignalValTests.immutableCopy) {
                        // Remove signal reference from operator and replace val-operator with reference
                        val signalRef = signalTest.subExpressions.remove(0) as ValuedObjectReference;
                        signalRef.setValuedObject(valueVariable);
                        signalTest.replace(signalRef);
                    }
                    if (action.trigger != null) {
                        action.setTrigger(action.trigger.trim)
                    }
                }
            }

            // Change signal to variable
            presentVariable.setIsNotSignal
            presentVariable.setTypeBool

            // Reset initial value and combine operator because we want to reset
            // the signal manually in every
            presentVariable.setInitialValue(null)
            presentVariable.setCombineOperator(null)

            // Modify signal emission & presence test
            val allActions = state.eAllContents.filter(typeof(Action)).toList
            for (Action action : allActions) {

                // Wherever an emission is, modify it to be an assignment of the presentVariable
                val allSignalEmissions = action.getAllContainedEmissions.filter[e|e.valuedObject == signal].toList
                for (Emission signalEmission : allSignalEmissions.immutableCopy) {

                    // Assign the emitted valued
                    val variableAssignment = presentVariable.assignRelative(TRUE)
                    variableAssignment.trace(signalEmission)

                    // Remove the signal emission value (because it will be the presentValue emission)
                    // Put it in right order
                    val index = action.effects.indexOf(signalEmission)
                    action.effects.add(index, variableAssignment)

                    // Remove emission
                    action.effects.remove(signalEmission)
                }

                // Wherever a present test is, put an Operator Expression (presentVariable == TRUE) there instead
                val allSignalTests = action.eAllContents.filter(typeof(ValuedObjectReference)).filter(
                    e|e.valuedObject == signal).toList
                for (ValuedObjectReference signalTest : allSignalTests.immutableCopy) {
                    val presentVariableTest = signalTest.valuedObject.reference //.isEqual(TRUE);
                    action.replace(signalTest, presentVariableTest)
                }
            }

            // Add a during reset action for the presentVariable if it is an output or local variable.
            // Do not do this for only-input-variables.
            if (!presentVariable.isInput) {
                val duringAction = state.createDuringAction

                //duringAction.setTrigger(TRUE) (implicit true)
                duringAction.createAssignment(presentVariable, FALSE)
                duringAction.setImmediate(true)
            }
        }
    }


   // ------------------------------------
   
  // Gets the correct neutral element as an Expression 
  def public neutralElement(ValuedObject signal) {
        if (signal.type == ValueType::BOOL) {
           if (signal.combineOperator == CombineOperator::OR) {
               // OR
               return FALSE;
           }
           // AND
           return TRUE; 
        }
        if (signal.type == ValueType::INT) {
           if (signal.combineOperator == CombineOperator::ADD) {
               // ADD
               return  createIntValue(0);
           }
           if (signal.combineOperator == CombineOperator::MAX) {
               // MAX
               return  createIntValue(Integer.MIN_VALUE);
           }
           if (signal.combineOperator == CombineOperator::MIN) {
               // MIN
               return  createIntValue(Integer.MAX_VALUE);
           }
           if (signal.combineOperator == CombineOperator::MULT) {
               // MULT
               return  createIntValue(1);
           }
           // UNDEFINED
           return  createIntValue(0);
        }
  }


}
