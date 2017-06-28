/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
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
package de.cau.cs.kieler.sccharts.text.validation

import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.SCChartsPackage
import de.cau.cs.kieler.sccharts.Scope
import org.eclipse.xtext.validation.Check
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import com.google.inject.Inject

/**
 * @author ssm
 *
 */
class SCTXValidatorX extends SCTXJavaValidator {
    
    @Inject extension AnnotationsExtensions
    
    public static final val DIRECTOR = "director"
    public static final val ENFORCER = "Enforcer"
    
    public static final val CHECK_VIOLATION_STATES_REQUIRE_ENFORCER_DIRECTOR = 
        "Violation states require enforcer director" 
    
    @Check
    def void checkViolationState(de.cau.cs.kieler.sccharts.State state) {
        if (state.violation) {
            val scc = state.getSCCharts
            if (!scc.getStringPragmas(DIRECTOR).last.values.head.equals(ENFORCER)) {
                error(CHECK_VIOLATION_STATES_REQUIRE_ENFORCER_DIRECTOR, state, 
                    SCChartsPackage.eINSTANCE.state_Violation, CHECK_VIOLATION_STATES_REQUIRE_ENFORCER_DIRECTOR
                )
            }
        }
    }    
    
    def static SCCharts getSCCharts(Scope scope) {
        if (scope.eContainer != null) {
            return (scope.eContainer as Scope).getSCCharts as SCCharts
        } else {
            return scope as SCCharts
        }
    }

}