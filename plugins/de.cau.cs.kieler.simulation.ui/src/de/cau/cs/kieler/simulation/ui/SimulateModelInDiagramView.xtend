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
import de.cau.cs.kieler.kicool.ui.klighd.KiCoModelViewUIContributor
import de.cau.cs.kieler.prom.PromPlugin
import de.cau.cs.kieler.simulation.SimulationUtil
import de.cau.cs.kieler.simulation.ui.views.DataPoolViewToolbarAction
import org.eclipse.core.runtime.SubMonitor
import org.eclipse.emf.ecore.EObject
import org.eclipse.jface.action.IAction
import org.eclipse.jface.action.IMenuManager
import org.eclipse.jface.action.IToolBarManager
import de.cau.cs.kieler.simulation.SimulationParticipant

/**
 * @author aas
 *
 */
class SimulateModelInDiagramView implements KiCoModelViewUIContributor, SimulationParticipant {
    private var IAction simulateAction
    
    private var KiCoModelUpdateController muc
    
    /**
     * Constructor
     */
    new() {
        // Register this controller
        KiCoModelUpdateController.addExternalUIContributor(this)
        
        simulateAction = new DataPoolViewToolbarAction("Simulate model", "runIcon.png") {
            override run() {
                PromPlugin.execInJob("Starting simulation",
                                     [SubMonitor monitor |
                                         val model = muc.model
                                         if(model != null && model instanceof EObject) {
                                             SimulationUtil.startSimulation(model as EObject, monitor)
                                         }
                                     ])
            }
        }
    }
    
    override contribute(KiCoModelUpdateController muc, IToolBarManager toolBar, IMenuManager menu) {
        this.muc = muc
        toolBar.add(simulateAction);
    }
    
    override setEnabled(boolean value) {
        // This participant cannot be disabled
    }
    
    override isEnabled() {
        true
    }
    
    override getName() {
        return ""
    }
}