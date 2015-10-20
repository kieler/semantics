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
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.sccharts.TransitionType
import de.cau.cs.kieler.sccharts.extensions.SCChartsExtension
import org.eclipse.xtext.validation.Check

/**
 * @author ssm
 *
 */
class SctValidator extends SctJavaValidator {
    
    extension SCChartsExtension = sCChartExtension;
    
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
    
    @Check
    public def void checkFinalStates(de.cau.cs.kieler.sccharts.State state) {
        // Only consider macro states
        if (state.getRegions().size() > 0) {
            val foundTermination = !state.outgoingTransitions.filter[ type == TransitionType.TERMINATION ].empty
            if (foundTermination) {
                // Now test for every region
                for (region : state.regions.filter(ControlflowRegion)) {
                    val foundFinal = !region.states.filter[ isFinal ].empty
                    if (!foundFinal) {
                        warning(REGION_NO_FINAL_STATE, region, null, -1);
                    }
                }
            }
        }
    } 
    
    @Check
    public def void checkConstInitializationInStates(Scope scope) {
        scope.declarations.forEach[ it.checkConstInitialization ]
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

}