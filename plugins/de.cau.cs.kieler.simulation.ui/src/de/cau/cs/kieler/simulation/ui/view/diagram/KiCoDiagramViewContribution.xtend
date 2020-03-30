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
import de.cau.cs.kieler.kicool.ui.klighd.models.ModelChain
import de.cau.cs.kieler.klighd.util.KlighdSynthesisProperties
import de.cau.cs.kieler.simulation.SimulationContext
import de.cau.cs.kieler.simulation.events.SimulationControlEvent
import de.cau.cs.kieler.simulation.events.SimulationEvent
import de.cau.cs.kieler.simulation.ide.CentralSimulation
import de.cau.cs.kieler.simulation.ui.SimulationUI
import java.util.WeakHashMap
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.URIConverter
import org.eclipse.jface.action.IMenuManager
import org.eclipse.jface.action.IToolBarManager
import org.eclipse.jface.action.Separator
import org.eclipse.ui.IMemento

import static de.cau.cs.kieler.simulation.ui.SimulationUI.*
import static de.cau.cs.kieler.simulation.ui.view.diagram.SimulationAction.*
import de.cau.cs.kieler.simulation.events.ISimulationListener

/**
 * @author als
 *
 */
class KiCoDiagramViewContribution implements KiCoModelViewUIContributor, ISimulationListener {
    
    private val simulateActions = new WeakHashMap<KiCoModelUpdateController, SimulationAction>()
    private var long simulationResourceTimeStamp = URIConverter.NULL_TIME_STAMP
    
    new() {
        CentralSimulation.addListener(this)
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
            val simCC = SimulationUI.currentSimulation.getSourceCompilationContext
            val input = simCC?.originalModel
            var inputIsShown = false
            if (input !== null) {
                if (muc.showsCompiledModel && !muc.compiledModel.empty) {
                    inputIsShown = input == muc.compiledModel.head ||
                        (muc.compiledModel instanceof ModelChain && (muc.compiledModel as ModelChain).models.head == input)
                } else {
                    inputIsShown = input == muc.sourceModel ||
                        (muc.sourceModel instanceof ModelChain && (muc.sourceModel as ModelChain).models.head == input)
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
    
    override saveState(KiCoModelUpdateController muc, IMemento memento) {
        if (!SimulationAction.LAST_SELECTED_SYSTEM.nullOrEmpty) {
            memento.putString("SimulationAction.LAST_SELECTED_SYSTEM", SimulationAction.LAST_SELECTED_SYSTEM)
        }
    }
    
    override loadState(KiCoModelUpdateController muc, IMemento memento) {
        val system = memento.getString("SimulationAction.LAST_SELECTED_SYSTEM")
        if (!system.nullOrEmpty) {
            SimulationAction.LAST_SELECTED_SYSTEM = system
        }
    }
    
    override update(SimulationContext ctx, SimulationEvent e) {
        if (e instanceof SimulationControlEvent) {
            switch (e.operation) {
                case START: {
                    val simCC = ctx.getSourceCompilationContext
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
		