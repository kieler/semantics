/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2018 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.legacy.ui

import de.cau.cs.kieler.kicool.ui.klighd.KiCoModelViewUIContributor
import de.cau.cs.kieler.kicool.ui.klighd.KiCoModelUpdateController
import org.eclipse.jface.action.IToolBarManager
import org.eclipse.jface.action.IMenuManager
import de.cau.cs.kieler.klighd.util.KlighdSynthesisProperties
import de.cau.cs.kieler.sccharts.legacy.sccharts.State
import de.cau.cs.kieler.sccharts.legacy.text.validation.SctValidator
import org.eclipse.ui.IMemento

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class LegacySCTModelViewContributor implements KiCoModelViewUIContributor {
    
    override contributeControls(KiCoModelUpdateController muc, IToolBarManager toolBar, IMenuManager menu) {
        // NO CONTRIBUTION
    }
    
    override contributeDiagramWarnings(KiCoModelUpdateController muc, Object model, KlighdSynthesisProperties properties) {
        if (model instanceof State) {
            return #["Legacy SCCharts diagram.", SctValidator.LEGACY]
        }
        return null
    }
    
    override saveState(KiCoModelUpdateController muc, IMemento memento) {
    }
    
    override loadState(KiCoModelUpdateController muc, IMemento memento) {
    }
    
}