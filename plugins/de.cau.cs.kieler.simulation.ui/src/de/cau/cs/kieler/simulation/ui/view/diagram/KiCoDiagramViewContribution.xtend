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
package de.cau.cs.kieler.simulation.ui.view.diagram

import de.cau.cs.kieler.kicool.ui.klighd.KiCoModelUpdateController
import de.cau.cs.kieler.kicool.ui.klighd.KiCoModelViewUIContributor
import de.cau.cs.kieler.klighd.util.KlighdSynthesisProperties
import java.util.WeakHashMap
import org.eclipse.jface.action.IMenuManager
import org.eclipse.jface.action.IToolBarManager
import org.eclipse.jface.action.Separator
import de.cau.cs.kieler.simulation.ui.SimulationUI
import de.cau.cs.kieler.simulation.SimulationContext

/**
 * @author als
 *
 */
class KiCoDiagramViewContribution implements KiCoModelViewUIContributor {
    
    private val simulateActions = new WeakHashMap<KiCoModelUpdateController, SimulationAction>()
    
    override contributeControls(KiCoModelUpdateController muc, IToolBarManager toolBar, IMenuManager menu) {
        // Create
        val action = new SimulationAction(muc)
        simulateActions.put(muc, action)
        
        // Add
        toolBar.add(new Separator)
        toolBar.add(action)
    }
    
    override contributeDiagramWarnings(KiCoModelUpdateController muc, Object model, KlighdSynthesisProperties properties) {
        simulateActions.get(muc)?.update(model)
        
        if (SimulationUI.currentSimulation !== null) {
            val simCC = SimulationUI.currentSimulation.startEnvironment.getProperty(SimulationContext.SOURCE_COMPILATION_CONTEXT)
            val input = simCC?.originalModel
            if (input !== null) {
                val inputIsShown = if (muc.showsCompiledModel && muc.compiledModel !== null) input == muc.compiledModel else input == muc.sourceModel
                SimulationUI.canRestartSimulation = inputIsShown
            } else {
                SimulationUI.canRestartSimulation = false
            }
        }
        return null
    }
    
}
		