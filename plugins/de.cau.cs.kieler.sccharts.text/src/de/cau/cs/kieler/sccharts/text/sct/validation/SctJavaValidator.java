/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 *
 * Copyright 2010 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 *
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.text.sct.validation;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.xtext.validation.Check;

import de.cau.cs.kieler.core.model.validation.CustomEValidator;
import de.cau.cs.kieler.kexpressions.BoolValue;
import de.cau.cs.kieler.kexpressions.Declaration;
import de.cau.cs.kieler.kexpressions.DoubleValue;
import de.cau.cs.kieler.kexpressions.Expression;
import de.cau.cs.kieler.kexpressions.FloatValue;
import de.cau.cs.kieler.kexpressions.IntValue;
import de.cau.cs.kieler.kexpressions.TextExpression;
import de.cau.cs.kieler.kexpressions.ValuedObject;
import de.cau.cs.kieler.sccharts.SCChartsPackage;
import de.cau.cs.kieler.sccharts.Transition;
import de.cau.cs.kieler.sccharts.extensions.SCChartsExtension;

/**
 * SCCharts Validation Rules
 * 
 * @author cmot ssm
 * @kieler.design 2014-01-20 proposed 
 * @kieler.rating 2014-01-20 proposed yellow
 */
// Don't add new checks to this class. Use the xtend file instead!
public class SctJavaValidator extends AbstractSctJavaValidator implements
        CustomEValidator {

    public static final String BAD_ID = "bad_id";

    public static final String MISSING_PRIO = "missing_prio";
    public static final String NON_UNIQUE_PRIO = "non_unique_prio";

    public static final String NON_SUCCEEDING_PRIOS = "non_succeeding_prios";
    public static final String NO_PRIO_1_TRANSITION = "no_prio_1_transition";
    public static final String UNSORTED_PRIOS = "unsorted_prios";
    
    public static final String REGION_NO_INITIAL_STATE = "Every region must have an initial state";
    public static final String REGION_TWO_MANY_INITIAL_STATES = "Every region must not have more than one initial state";
    public static final String REGION_NO_FINAL_STATE = "Every region should have a final state whenever its parent state has a termination transition";
    public static final String STATE_NOT_REACHABLE = "The state is not reachable";
    public static final String NO_REGION = "A state with a termination transition must have inner behaviour";
    
    public static final String NON_SIGNAL_EMISSION = "Non-signals cannot be used in an emission";
    public static final String NON_VARIABLE_ASSIGNMENT = "Non-variables cannot be used in an assignment";
    public static final String STATIC_VARIABLE_WITHOUT_INITIALIZATION = "Static variables should be initialized";
    //TODO (KISEMA-1071) Remove this message when there is a transformation that handles valued signals without combine operator.
    public static final String VALUED_SIGNAL_NEED_COMBINE = "Valued signals must have a combine function";
    public static final String MINMAX_COMBINE = "Min or max combine operators are currently not supported";
    public static final String NOCOMBINE = "A valued signal should have a combine function, otherwise any emits cannot be scheduled.";
    
    public static final String ASSIGNMENT_TO_CONST = "You cannot assign a value to a const object";
    public static final String NO_CONST_LITERAL = "Const objects must be bound to literals";
    
    public static final String STRONG_ABORT_WITH_LOW_PRIORITY = "Causality problem! Strong abort transitions must have a higher priority than weak abort or termination transitions.";
    public static final String ABORT_WITHOUT_TRIGGER = "Abort transitions should have a trigger";
    
    public static final String MISSING_BINDING_FOR = "Missing binding for variable: ";

    //TODO: fix this or move this check to the simulation component only
    public static final String INPUT_OUTPUT_CURRENTLY_NOTSUPPORTEDBYSIMULATOR = "Variables that war input AND output at the same time are currently not supported by the simulator";

    public static final String VALUEDOBJECT_TRANSITION_SCOPE_WRONG = "Variable or signal used out of its scope. Declare it one hierarchy layer up!";
    
    public static final SCChartsExtension sCChartExtension = new SCChartsExtension();


    // -------------------------------------------------------------------------

    /**
     * Forbid emissions of non-signals
     *
     * @param state the state
     */
    @Check
    public void checkNoBooleanEmissions(final de.cau.cs.kieler.kexpressions.keffects.Emission emission) {
        if (emission.getValuedObject() != null && emission.getValuedObject().eContainer() != null && emission.getValuedObject().eContainer() instanceof Declaration) {
            Declaration declaration = (Declaration) emission.getValuedObject().eContainer();
            if (!declaration.isSignal()) {
                error(NON_SIGNAL_EMISSION, emission, null, -1);
            }
        } 
    }

    // -------------------------------------------------------------------------    

    /**
     * Forbid assignments of non-variables
     *
     * @param state the state
     */
    @Check
    public void checkNoBooleanEmissions(final de.cau.cs.kieler.kexpressions.keffects.Assignment assignment) {
        if (assignment.getValuedObject() != null && assignment.getValuedObject().eContainer() != null && assignment.getValuedObject().eContainer() instanceof Declaration) {
            Declaration declaration = (Declaration) assignment.getValuedObject().eContainer();
            if (declaration.isSignal()) {
                error(NON_VARIABLE_ASSIGNMENT, assignment, null, -1);
            }
        } 
    }

    // -------------------------------------------------------------------------

    /**
     * A state should be reachable from an initial state.
     *
     * @param state the state
     */
    @Check
    public void checkReachableStates(final de.cau.cs.kieler.sccharts.State state) {
        if (!sCChartExtension.isStateReachable(state)) {
           warning(STATE_NOT_REACHABLE, state, null, -1);
        }
    }

    // -------------------------------------------------------------------------
    // @Check
    public void checkTypeNameStartsWithCapital(
            final de.cau.cs.kieler.sccharts.State s) {
        if (!Character.isUpperCase(s.getId().charAt(0))) {
            warning("Name should start with a capital", SCChartsPackage.eINSTANCE.getScope_Id(),
                    SCChartsPackage.SCOPE__ID, BAD_ID);
        }
    }

//    @Check
    public void checkTransitionPriorities(
            final de.cau.cs.kieler.sccharts.State s) {

        if (s.getOutgoingTransitions().isEmpty()
                || s.getOutgoingTransitions().size() == 1) {
            return;
        }

        Set<Integer> prios = new HashSet<Integer>();
        int count = s.getOutgoingTransitions().size();
        boolean subsequent = true;
        boolean startsWithOne = false;
        boolean sorted = true;

        Transition highestPrioTransition = s.getOutgoingTransitions().get(0);

        for (Transition t : s.getOutgoingTransitions()) {
            if (t.getPriority() == 1) {
                startsWithOne = true;
            }
            if (t.getPriority() == 0) {
                error("Priority must be assigned.",
                        SCChartsPackage.eINSTANCE.getTransition_Priority(),
                        SCChartsPackage.TRANSITION__PRIORITY, MISSING_PRIO);
            } else {
                if (t.getPriority() < highestPrioTransition.getPriority()) {
                    highestPrioTransition = t;
                }
                if (prios.contains(Integer.valueOf(t.getPriority()))) {
                    error("Priority is not unique.",
                            SCChartsPackage.eINSTANCE.getTransition_Priority(),
                            SCChartsPackage.TRANSITION__PRIORITY,
                            NON_UNIQUE_PRIO);
                } else {
                    if (t.getPriority() > count) {
                        subsequent = false;
                    }
                    if (s.getOutgoingTransitions().indexOf(t) + 1 != t
                            .getPriority()) {
                        sorted = false;
                    }
                }
                prios.add(Integer.valueOf(t.getPriority()));
            }
        }

        if (!startsWithOne) {
            warning("Transition priorities should start with value 1",
                    SCChartsPackage.eINSTANCE.getTransition_Priority(),
                    SCChartsPackage.STATE__OUTGOING_TRANSITIONS,
                    NO_PRIO_1_TRANSITION);
        } else {
            if (!subsequent) {
                warning("Priorities are not subsequent.",
                        SCChartsPackage.eINSTANCE.getTransition_Priority(),
                        SCChartsPackage.STATE__OUTGOING_TRANSITIONS,
                        NON_SUCCEEDING_PRIOS);
            } else {
                if (!sorted) {
                    warning("Transition are not sorted according to their priorities.",
                            SCChartsPackage.eINSTANCE.getTransition_Priority(),
                            SCChartsPackage.STATE__OUTGOING_TRANSITIONS,
                            UNSORTED_PRIOS);
                }
            }
        }
    }
    
    
    /**
     *
     * @param state the state
     */
    @Check
    public void checkAssignmentToConst(final de.cau.cs.kieler.kexpressions.keffects.Assignment assignment) {
    	if (assignment.getValuedObject() != null) {
    		Declaration declaration = (Declaration) assignment.getValuedObject().eContainer();	
    		if (declaration.isConst()) {
    			error(ASSIGNMENT_TO_CONST, assignment, null, -1);
    		}
    	}
    }
    
    /**
    *
    * @param state the state
    */
   @Check
   public void checkConstBinding(final de.cau.cs.kieler.sccharts.State state) {
	   for(Declaration declaration : state.getDeclarations()) {
		   if (declaration.isConst()) {
			   for (ValuedObject valuedObject : declaration.getValuedObjects()) {
				   Expression initialValue = valuedObject.getInitialValue();
				   if (initialValue != null && 
						   !(initialValue instanceof BoolValue
						   || initialValue instanceof IntValue
						   || initialValue instanceof FloatValue
						   || initialValue instanceof DoubleValue
						   || initialValue instanceof TextExpression
						   )) {
					   error(NO_CONST_LITERAL, valuedObject, null, -1);
				   }
			   }
		   }
	   }
   }    
}
