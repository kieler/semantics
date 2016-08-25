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

/**
 * @author ssm
 *
 */
class SctValidator extends SctJavaValidator {
    
    @Inject
    extension SCChartsExtension = sCChartExtension;
    
    @Inject
    extension KExpressionsValuedObjectExtensions
    
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
            if ((parentState.getLocalActions().size() > 0) && (parentState.getRegions().size() == 1)
                    && parentState.getRegions().filter(typeof(ControlflowRegion)).head.getStates().size() == 0
                    && (parentState.getRegions().head.getId() == null
                        || parentState.getRegions().head.id.equals(""))) {
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
        val foundTermination = !state.outgoingTransitions.filter[ type == TransitionType.TERMINATION ].empty
        if (foundTermination) {
            // Assert inner behaviour
            val regions = state.regions.filter(ControlflowRegion)
            if(regions.isEmpty && state.referencedScope == null) {
                error(NO_REGION, state, null, -1);
            }

            // Now test for every region
            if (state.localActions.nullOrEmpty) {
                for (region : regions) {
                    val foundFinal = !region.states.filter[ isFinal ].empty
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
     * Checks if the given valued signal has a combination function.
     * This check can be removed if there is a transformation
     * that handles valued signals without combination function (see KISEMA-1071).   
     */
    // TODO: (KISEMA-1071) Remove this check when there is a transformation that handles valued signals without combination function.
    @Check
    public def void checkValuedSignalHasCombinationFunction(de.cau.cs.kieler.kexpressions.ValuedObject valuedObject) {
        // Check if actually a valued signal
        if(valuedObject.isSignal && !valuedObject.isPureSignal) {
            // Check if there is a combine operator
            if(valuedObject.combineOperator == null || valuedObject.combineOperator.equals(CombineOperator.NONE)) {
                warning(VALUED_SIGNAL_NEED_COMBINE, valuedObject, null)
            }
        }
    } 
    
    /**
     * Checks binding for reference states.
     */
    @Check
    public def void checkReferenceBinding(de.cau.cs.kieler.sccharts.State state) {
    	if(state.referencedState) {
    		val variables = newHashSet()
    		var scope = state as Scope
    		// Collect all accessible variables
    		while (scope != null) {
	    		for ( delc : scope.declarations) {
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
    		for ( delc : state.referencedScope.declarations.filter[input || output]) {
    			for (vo : delc.valuedObjects) {
    				if (!variables.contains(vo.name)) {
    					error(MISSING_BINDING_FOR+vo.name, state, (state.eClass.EPackage as SCChartsPackageImpl).scope_ReferencedScope, -1);
    				}
    			}
    		}
    	}
    } 
}