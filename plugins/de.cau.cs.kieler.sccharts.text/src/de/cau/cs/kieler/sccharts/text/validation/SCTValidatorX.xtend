/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.text.validation

import org.eclipse.xtext.validation.Check
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.core.annotations.PragmaStringAnnotation

/**
 * @author ssm
 *
 */
class SCTValidatorX extends SCTJavaValidator {
    
    private static final val DIRECTOR = "director"
    private static final val ENFORCER = "Enforcer"
    
    private static final val CHECK_VIOLATION_STATES_REQUIRE_ENFORCER_DIRECTOR = 
        "Violation states require enforcer director!" 
    
    @Check
    def void checkViolationState(de.cau.cs.kieler.sccharts.State state) {
        if (state.violation) {
            val scc = state.getSCCharts
            if (scc.annotations.filter(PragmaStringAnnotation).
                filter[ name.equals(DIRECTOR) && values.head.equals(ENFORCER)].size == 0
            ) {
                error(CHECK_VIOLATION_STATES_REQUIRE_ENFORCER_DIRECTOR, state, null, -1)
            }
        }
    }    
    
    private def getSCCharts(de.cau.cs.kieler.sccharts.Scope scope) {
        if (scope.eContainer != null) {
            return (scope.eContainer as Scope).getSCCharts as SCCharts
        } else {
            return scope as SCCharts
        }
    }
}