/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.text.sct.validation

import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.TransitionType
import de.cau.cs.kieler.sccharts.extensions.SCChartsExtension
import org.eclipse.xtext.validation.Check
import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.CombineOperator
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.sccharts.impl.SCChartsPackageImpl
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.keffects.Assignment
import de.cau.cs.kieler.kexpressions.keffects.AssignOperator
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.EntryAction
import de.cau.cs.kieler.sccharts.DuringAction
import de.cau.cs.kieler.sccharts.ExitAction

/**
 * @author ssm, cmot
 * 
 */
class SctValidator extends SctJavaValidator {

    @Inject
    extension SCChartsExtension = sCChartExtension;

    @Inject
    extension KExpressionsValuedObjectExtensions

    // Conservatively only check if directly assigning a value here
    // TODO: Possibly extend this to check rederencing other
    // valued objects and test if they are set... but that would 
    // complicate things.
    def boolean isAbsoluteAssignment(Assignment assignment) {
        return (assignment.operator == AssignOperator::ASSIGN)
    }

    /**
     * Check whether variables that are non-inputs are initialized either by
     * - initial values
     * - entry or transition actions (absolute values) that can be reached initially, e.g.,
     * in the initial tick
     * 
     * @param valuedObject the valuedObject
     */
    @Check
    public def void checkVariableInitialization(de.cau.cs.kieler.kexpressions.ValuedObject valuedObject) {
        var foundAtLeastPotentialInitialization = false;
        // Check if actually a valued signal
        if (!valuedObject.isSignal && !valuedObject.isInput) {
            // Do the check only for non-input variables
            //
            if (valuedObject.initialValue != null) {
                // If we found an initial value we are done
                return;
            } else {
                // If we did not find an initial value, we will look at ALL (absolute)
                // assignment actions of the variable and then test these whether
                // they are reachable initially. If there is such one, then
                // this is OK, otherwise we raise a warning
                val scope = valuedObject.declaration.eContainer as Scope;
                if (scope != null) {
                    val rootState = scope.rootState
                    for (action : rootState.allContainedActions.toList) {
                        for (assignment : action.allContainedAssignments) {
                            if (assignment.valuedObject == valuedObject) {
                                if (assignment.absoluteAssignment) {
                                    // This is an absolute assignment to the variable
                                    // that we search, so now lets see if it can
                                    // be reached initially
                                    val container = action.eContainer
                                    if (action instanceof Transition) {
                                        // Case transition
                                        val transition = action as Transition
                                        // Now see if we can reach the source state
                                        // initially
                                        if (transition.isImmediate2) {
                                            if (transition.type != TransitionType::TERMINATION &&
                                                transition.trigger == null &&
                                                (transition.sourceState.outgoingTransitions.indexOf(transition) == 0) &&
                                                (transition.sourceState.isStateReachable(true, true, true))) {
                                                return;
                                            }
                                            if (transition.sourceState.isStateReachable(true, false, true)) {
                                                foundAtLeastPotentialInitialization = true;
                                            }
                                        }
                                    } else if (container instanceof de.cau.cs.kieler.sccharts.State) {
                                        if (action.immediate || action instanceof EntryAction ||
                                            action instanceof ExitAction) {
                                            val state = (action.eContainer) as de.cau.cs.kieler.sccharts.State;
                                            if (action instanceof EntryAction || action instanceof DuringAction) {
                                                if (state.isStateReachable(true, true, true)) {
                                                    return;
                                                }
                                            }
                                            if (state.isStateReachable(true, false, true)) {
                                                foundAtLeastPotentialInitialization = true;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (foundAtLeastPotentialInitialization) {
                warning(POTENTIALINITIALIZATION, valuedObject, null)
            } else {
                error(NOINITIALIZATION, valuedObject, null)
            }
        }
    }

    /**
     * Check if valued signal is unique
     * 
     * @param valuedObject the valuedObject
     */
    @Check
    public def void checkValuedObjectUnique(de.cau.cs.kieler.kexpressions.ValuedObject valuedObject) {
        // Check if actually a valued signal
        val scope = valuedObject.declaration.eContainer as Scope;
        if (scope != null) {
            for (otherValuedObject : scope.valuedObjects) {
                if (otherValuedObject != valuedObject) {
                    if (otherValuedObject.name == valuedObject.name) {
                        warning(NOTUNIQUE, valuedObject, null)
                    }
                }
            }
        }
    }

    /**
     * Check if valued signal has a combine functions
     * 
     * @param valuedObject the valuedObject
     */
    @Check
    public def void checkCombineFunction(de.cau.cs.kieler.kexpressions.ValuedObject valuedObject) {
        // Check if actually a valued signal
        if (valuedObject.isSignal && !valuedObject.isPureSignal) {
            // Check if there is a combine operator
            if (valuedObject.combineOperator == null) {
                warning(NOCOMBINE, valuedObject, null)
            }
        }
    }

    /**
     * Check if max or min is used which is currently not supported
     * 
     * @param valuedObject the valuedObject
     */
    @Check
    public def void checkMinMaxUsedCombinationFunction(de.cau.cs.kieler.kexpressions.ValuedObject valuedObject) {
        // Check if actually a valued signal
        if (valuedObject.isSignal && !valuedObject.isPureSignal) {
            // Check if there is a combine operator
            if (valuedObject.combineOperator != null) {
                if (valuedObject.combineOperator.equals(CombineOperator.MIN) ||
                    valuedObject.combineOperator.equals(CombineOperator.MAX))
                    warning(MINMAX_COMBINE, valuedObject, null)
            }
        }
    }

    /**
     * Check if there is exactly ONE initial state per region.
     * 
     * @param region the region
     */
    @Check
    public def void checkInitialState(ControlflowRegion region) {
        // Do not consider the root region == SCChart
        if (region.getParentState() != null) {
            // check if parent state has declared any REAL region not only a
            // dummy region for entry/during/exit actions or suspends
            val parentState = region.getParentState
            var int foundInitial = 0;
            if ((parentState.getLocalActions().size() > 0) && (parentState.getRegions().size() == 1) &&
                parentState.getRegions().filter(typeof(ControlflowRegion)).head.getStates().size() == 0 &&
                (parentState.getRegions().head.getId() == null || parentState.getRegions().head.id.equals(""))) {
                foundInitial = 1;
            }
            for (de.cau.cs.kieler.sccharts.State state : region.getStates()) {
                if (state.isInitial()) {
                    foundInitial = foundInitial + 1;
                }
            }
            if (foundInitial == 0) {
                error(REGION_NO_INITIAL_STATE, region, null, -1);
            } else if (foundInitial > 1) {
                error(REGION_TWO_MANY_INITIAL_STATES, region, null, -1);
            }
        }
    }

    /**
     * A state with a termination transition should have final states in all its
     * inner regions. 
     * A simple state with a termination transition must have inner behaviour or no termination transition at all.
     * 
     * @param state the state
     */
    @Check
    public def void checkFinalStates(de.cau.cs.kieler.sccharts.State state) {
        // Check if state has termination transition
        val foundTermination = !state.outgoingTransitions.filter[type == TransitionType.TERMINATION].empty
        if (foundTermination) {
            // Assert inner behaviour
            val regions = state.regions.filter(ControlflowRegion)
            if (regions.isEmpty && state.referencedScope == null) {
                error(NO_REGION, state, null, -1);
            }

            // Now test for every region
            if (state.localActions.nullOrEmpty) {
                for (region : regions) {
                    val foundFinal = !region.states.filter[isFinal].empty
                    if (!foundFinal) {
                        warning(REGION_NO_FINAL_STATE, region, null, -1);
                    }
                }
            }
        }
    }

    /**
     * Checks if the given state has any strong abort transitions with lower priority than non-strong-abort transitions-
     */
    @Check
    public def void checkLowPriorityStrongAbort(de.cau.cs.kieler.sccharts.State state) {
        var onlyStrongAbortsBefore = true;
        // Checking priority by order
        for (transition : state.outgoingTransitions) {
            if (onlyStrongAbortsBefore && transition.type != TransitionType.STRONGABORT) {
                onlyStrongAbortsBefore = false;
            } else if (!onlyStrongAbortsBefore && transition.type == TransitionType.STRONGABORT) {
                error(STRONG_ABORT_WITH_LOW_PRIORITY, transition, null, -1);
            }
        }
    }

    /**
     * Checks if the given state has abort transitions without trigger and adds a warning.
     * In most cases an abort without trigger is meant to be a termination transition.
     */
    @Check
    public def void checkAbortHasTrigger(de.cau.cs.kieler.sccharts.State state) {
        if (state.isHierarchical) {
            for (transition : state.outgoingTransitions) {
                if ((transition.type == TransitionType.STRONGABORT || transition.type == TransitionType.WEAKABORT) &&
                    transition.trigger == null) {
                    warning(ABORT_WITHOUT_TRIGGER, transition, null, -1);
                }
            }
        }
    }

    /**
     * Checks if the given valued signal has a combination function.
     * This check can be removed if there is a transformation
     * that handles valued signals without combination function (see KISEMA-1071).   
     */
    // TODO: (KISEMA-1071) Remove this check when there is a transformation that handles valued signals without combination function.
    @Check
    public def void checkValuedSignalHasCombinationFunction(de.cau.cs.kieler.kexpressions.ValuedObject valuedObject) {
        // Check if actually a valued signal
        if (valuedObject.isSignal && !valuedObject.isPureSignal) {
            // Check if there is a combine operator
            if (valuedObject.combineOperator == null || valuedObject.combineOperator.equals(CombineOperator.NONE)) {
                warning(VALUED_SIGNAL_NEED_COMBINE, valuedObject, null)
            }
        }
    }

    /**
     * Checks that static variables are initialized.
     * If it is not initialized the static modifier is useless from a modeling perspective.   
     */
    @Check
    public def void checkStaticVariableIsInitialized(de.cau.cs.kieler.kexpressions.ValuedObject valuedObject) {
        if (valuedObject.isStatic && valuedObject.initialValue == null) {
            warning(STATIC_VARIABLE_WITHOUT_INITIALIZATION, valuedObject, null)
        }
    }

    /**
     * Checks binding for reference states.
     */
    @Check
    public def void checkReferenceBinding(de.cau.cs.kieler.sccharts.State state) {
        if (state.referencedState) {
            val variables = newHashSet()
            var scope = state as Scope
            // Collect all accessible variables
            while (scope != null) {
                for (delc : scope.declarations) {
                    for (vo : delc.valuedObjects) {
                        variables.add(vo.name)
                    }
                }
                scope = scope.eContainer as Scope
            }
            // Added binding to accessable variables
            for (bind : state.bindings) {
                variables.add(bind.formal.name)
            }
            for (delc : state.referencedScope.declarations.filter[input || output]) {
                for (vo : delc.valuedObjects) {
                    if (!variables.contains(vo.name)) {
                        error(MISSING_BINDING_FOR + vo.name, state,
                            (state.eClass.EPackage as SCChartsPackageImpl).scope_ReferencedScope, -1);
                    }
                }
            }
        }
    }

    /**
     * Checks scope of valued objects of transition triggers are correct.
     */
    @Check
    public def void checkScopeOfOutgoingTransitionVarRefs(de.cau.cs.kieler.kexpressions.ValuedObject testValuedObject) {
        val stateOrRegion = testValuedObject.eContainer.eContainer
        var de.cau.cs.kieler.sccharts.State state
        if (stateOrRegion instanceof de.cau.cs.kieler.sccharts.State) {
            state = (stateOrRegion as de.cau.cs.kieler.sccharts.State)
        } else {
            val region = (stateOrRegion as Region)
            state = region.parentState
        }

        for (transition : state.outgoingTransitions) {
            val valuedObjectRefs = transition.eAllContents.filter(typeof(ValuedObjectReference))
            if (valuedObjectRefs.filter[valuedObject == testValuedObject].size > 0) {
                error(VALUEDOBJECT_TRANSITION_SCOPE_WRONG, testValuedObject, null, -1);
            }
        }
    }

    /**
     * Checks currently unsupported INPUT OUTPUT variables and displays a warning.
     */
    @Check
    public def void checkNoInputOutput(de.cau.cs.kieler.kexpressions.ValuedObject valuedObject) {
        if (valuedObject.isInput && valuedObject.isOutput) {
            warning(INPUT_OUTPUT_CURRENTLY_NOTSUPPORTEDBYSIMULATOR, valuedObject, null);
        }
    }
}
