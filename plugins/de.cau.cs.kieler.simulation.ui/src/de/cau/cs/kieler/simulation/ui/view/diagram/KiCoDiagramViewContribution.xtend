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
import de.cau.cs.kieler.simulation.SimulationContext
import de.cau.cs.kieler.simulation.events.SimulationControlEvent
import de.cau.cs.kieler.simulation.events.SimulationEvent
import de.cau.cs.kieler.simulation.events.SimulationListener
import de.cau.cs.kieler.simulation.ui.SimulationUI
import java.util.WeakHashMap
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.URIConverter
import org.eclipse.jface.action.IMenuManager
import org.eclipse.jface.action.IToolBarManager
import org.eclipse.jface.action.Separator

import static de.cau.cs.kieler.simulation.ui.SimulationUI.*

/**
 * @author als
 *
 */
class KiCoDiagramViewContribution implements KiCoModelViewUIContributor, SimulationListener {
    
    private val simulateActions = new WeakHashMap<KiCoModelUpdateController, SimulationAction>()
    private var long simulationResourceTimeStamp = URIConverter.NULL_TIME_STAMP
    
    new() {
        SimulationUI.registerObserver(this)
    }
    
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
            var inputIsShown = false
            if (input !== null) {
                if (muc.showsCompiledModel && muc.compiledModel !== null) {
                    inputIsShown = input == muc.compiledModel
                } else {
                    inputIsShown = input == muc.sourceModel
                    if (inputIsShown) {
                        if (input instanceof EObject) {
                            if (input.eResource !== null) {
                                inputIsShown = simulationResourceTimeStamp == input.eResource.timeStamp
                            }
                        }
                    }
                }
            }
            SimulationUI.canRestartSimulation = inputIsShown
            
        }
        return null
    }
    
    override update(SimulationContext ctx, SimulationEvent e) {
        if (e instanceof SimulationControlEvent) {
            switch (e.operation) {
                case START: {
                    val simCC = ctx.startEnvironment.getProperty(SimulationContext.SOURCE_COMPILATION_CONTEXT)
                    val input = simCC?.originalModel
                    if (input instanceof EObject) {
                        if (input.eResource !== null) {
                            // Timestamp is set by KiCoModelUpdateController
                            simulationResourceTimeStamp = input.eResource.timeStamp
                            return
                        }
                    }
                    simulationResourceTimeStamp = URIConverter.NULL_TIME_STAMP
                }
            }
        }
    }
    
    override getName() {
        "KiCoDiagramViewContribution"
    }
    
    override canBeDisabled() {
        return false
    }
    
}
		