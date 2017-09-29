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
package de.cau.cs.kieler.simulation.ui

import de.cau.cs.kieler.kicool.ui.klighd.KiCoModelUpdateController
import de.cau.cs.kieler.kicool.ui.klighd.KiCoModelViewNotifier
import de.cau.cs.kieler.simulation.SimulationContext
import de.cau.cs.kieler.simulation.backends.SimulationBackend
import de.cau.cs.kieler.simulation.ui.views.DataPoolViewToolbarAction
import org.eclipse.emf.ecore.EObject
import org.eclipse.jface.action.IAction
import org.eclipse.jface.action.IMenuManager
import org.eclipse.jface.action.IToolBarManager

/**
 * @author aas
 *
 */
class SimulateModelInDiagramView extends KiCoModelUpdateController {
    private var IAction simulateAction
    
    /**
     * Constructor
     */
    new() {
        // Register this controller
        KiCoModelViewNotifier.register(this)
        
        simulateAction = new DataPoolViewToolbarAction("Simulate model", "runIcon.png") {
            override run() {
                val model = getModel
                if(model != null && model instanceof EObject) {
                    // Start simulation with the model
                    val context = new SimulationContext
                    context.simulationBackend = SimulationBackend.currentBackend
                    context.model = model as EObject
                    context.start
                }
            }
        }
    }
    
    /**
     * {@inheritDoc}
     */
    override addContributions(IToolBarManager toolBar, IMenuManager menu) {
        toolBar.add(simulateAction);
    }
    
    /**
     * {@inheritDoc}
     */
    override onDispose() {
        KiCoModelViewNotifier.unregister(this);
        super.onDispose();
    }
}