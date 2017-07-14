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

import de.cau.cs.kieler.sccharts.SCChartsPackage
import org.eclipse.xtext.validation.Check
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import com.google.inject.Inject
import de.cau.cs.kieler.sccharts.extensions.SCChartsScopeExtensions
import de.cau.cs.kieler.sccharts.ScopeCall
import de.cau.cs.kieler.sccharts.extensions.SCChartsReferenceExtensions
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.sccharts.extensions.SCChartsCoreExtensions
import de.cau.cs.kieler.sccharts.extensions.BindingType

/**
 * @author ssm
 *
 */
class SCTXValidatorX extends SCTXJavaValidator {
    
    @Inject extension AnnotationsExtensions
    @Inject extension SCChartsCoreExtensions
    @Inject extension SCChartsScopeExtensions
    @Inject extension SCChartsReferenceExtensions
    
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
    
    @Check
    def void checkScopeCall(ScopeCall scopeCall) {
        if (scopeCall.eContainer instanceof Scope) {
            val bindings = scopeCall.eContainer.asScope.createBindings
            var errorMessage = ""
            var implicitMessage = ""
            for (binding : bindings) {
                if (binding.errors > 0) {
                    errorMessage += binding.errorMessages.join("\n")
                }
                if (binding.type == BindingType.IMPLICIT) {
                    implicitMessage += binding.targetValuedObject.name + ", "
                }
            }
            
            if (errorMessage != "") {
                error("The referencing binding is erroneous!\n" + errorMessage,
                    scopeCall, 
                    SCChartsPackage.eINSTANCE.scopeCall_Scope, 
                    "The referencing binding is erroneous!\n" + errorMessage);
            } else if (implicitMessage != "") {
                warning("Valued Objects are bound implicitly!\n" + implicitMessage,
                    scopeCall, 
                    SCChartsPackage.eINSTANCE.scopeCall_Scope, 
                    "Valued Objects are bound implicitly!\n" + implicitMessage);
            }
        }
    } 
    
}