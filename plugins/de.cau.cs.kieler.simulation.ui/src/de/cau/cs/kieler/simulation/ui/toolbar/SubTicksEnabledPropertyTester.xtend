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
import de.cau.cs.kieler.simulation.ui.views.DataPoolView
import org.eclipse.ui.PlatformUI
import org.eclipse.ui.services.IEvaluationService

/**
 * @author aas
 *
 */
class SubTicksEnabledPropertyTester extends PropertyTester {
    private static val PROPERTY_NAMESPACE = "de.cau.cs.kieler.simulation.ui";
    private static val PROPERTY_NAME = "subTicksEnabled";
 
    public static def void update() {
        val window = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
        val evaluationService = window.getService(typeof(IEvaluationService)) as IEvaluationService
        if (evaluationService != null) {
            evaluationService.requestEvaluation(fullyQualifiedProperty)
        }
    }
 
    private static def String getFullyQualifiedProperty() {
        return PROPERTY_NAMESPACE+"."+PROPERTY_NAME
    }
 
    override test(Object receiver, String property, Object[] args, Object expectedValue) {
        if (property == PROPERTY_NAME) {
            return DataPoolView.subTicksEnabled
        }
        return false;
    }
}