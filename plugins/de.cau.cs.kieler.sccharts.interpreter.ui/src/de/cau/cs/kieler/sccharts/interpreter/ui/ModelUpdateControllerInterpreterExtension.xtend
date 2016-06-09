/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.interpreter.ui

import de.cau.cs.kieler.kico.klighd.IKiCoModelUpdateControllerExtension
import de.cau.cs.kieler.kico.klighd.KiCoKlighdPlugin
import de.cau.cs.kieler.klighd.util.KlighdSynthesisProperties
import org.eclipse.jface.action.Action
import org.eclipse.jface.action.IAction
import org.eclipse.jface.action.IMenuManager
import org.eclipse.jface.action.IToolBarManager
import org.eclipse.jface.resource.ImageDescriptor

/**
 * @author ssm
 * 
 */
class ModelUpdateControllerInterpreterExtension implements IKiCoModelUpdateControllerExtension {

    /** The action for toggling simulation. */
    private Action simulateToggleAction;
    private static final boolean SIMULATE_TOGGLE_ACTION_DEFAULT_STATE = false;
    
    /** The icon for toggling compile mode button. */
    private static final ImageDescriptor SIMULATE_ICON =
            KiCoKlighdPlugin.getImageDescriptor("icons/full/etool16/compile.png");    
    
    new() {
        // Simulation button
        simulateToggleAction = new Action("Show compiled model", IAction.AS_CHECK_BOX) {
            override run() {
                update()
            }
        };
        simulateToggleAction.setId("simulationToggleAction");
        simulateToggleAction.setToolTipText("Show simulated model");
        simulateToggleAction.setImageDescriptor(SIMULATE_ICON);
        simulateToggleAction.setChecked(SIMULATE_TOGGLE_ACTION_DEFAULT_STATE);            
    }

    override addContributions(IToolBarManager toolBar, IMenuManager menu) {
        toolBar.add(simulateToggleAction);
    }

    override onDiagramUpdate(Object model, KlighdSynthesisProperties properties) {
    }

    synchronized def void update() {
        
    }
}
