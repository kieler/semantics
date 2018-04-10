/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.simulation.ui.toolbar

import org.eclipse.core.expressions.PropertyTester
import org.eclipse.ui.PlatformUI
import org.eclipse.ui.services.IEvaluationService

/**
 * Property tester to check if the sub tick button is enabled or disabled.
 * 
 * Stepping through the simulation data handler after data handler is useful for debugging.
 * However, it can be confusing for end users because the macro tick is not executed completely.
 * Thus this feature has to be enabled in the data pool view explicity.  
 * 
 * @author aas
 *
 */
class AdvancedControlsEnabledPropertyTester extends PropertyTester {
    /**
     * Determines if the "step sub tick" button and other advanced controls in the toolbar should be visible or not.
     */
    public static var boolean advancedControlsEnabled
    
    /**
     * The namespace of the property.
     */
    private static val PROPERTY_NAMESPACE = "de.cau.cs.kieler.simulation.ui";
    /**
     * The name of the property.
     */
    private static val PROPERTY_NAME = "advancedControlsEnabled";
 
    /**
     * Updates the state of the property.
     */
    public static def void update() {
        val window = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
        val evaluationService = window.getService(typeof(IEvaluationService)) as IEvaluationService
        if (evaluationService !== null) {
            evaluationService.requestEvaluation(fullyQualifiedProperty)
        }
    }
 
    /**
     * Returns the fully qualified name of the property.
     * 
     * @return the fully qualified name of the property.
     */
    private static def String getFullyQualifiedProperty() {
        return PROPERTY_NAMESPACE+"."+PROPERTY_NAME
    }
 
    /**
     * Checks if sub ticks are enabled in the data pool view.
     * 
     * {@inheritDoc}
     */
    override test(Object receiver, String property, Object[] args, Object expectedValue) {
        if (property == PROPERTY_NAME) {
            return advancedControlsEnabled
        }
        return false;
    }
}