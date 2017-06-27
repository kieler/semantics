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
package de.cau.cs.kieler.simulation.ui.views

import de.cau.cs.kieler.simulation.core.SimulationManager
import org.eclipse.jface.action.ControlContribution
import org.eclipse.swt.SWT
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.Spinner
import org.eclipse.swt.events.SelectionAdapter
import org.eclipse.swt.events.SelectionEvent

/**
 * @author aas
 *
 */
class SimulationDelayContribution extends ControlContribution {
    
    var Spinner spinner
        
    protected new(String id) {
        super(id)
    }
    
    override createControl(Composite parent) {
        spinner = new Spinner(parent, SWT.BORDER)
        spinner.toolTipText = "Simulation delay in play mode (milliseconds)"
        spinner.minimum = SimulationManager.MIN_DELAY
        spinner.maximum = SimulationManager.MAX_DELAY
        spinner.increment = 100
        spinner.pageIncrement = 100
        spinner.selection = SimulationManager.playDelay
        
        spinner.addSelectionListener(new SelectionAdapter() {
            override widgetSelected(SelectionEvent e) {
                SimulationManager.playDelay = spinner.selection
            }
        })
        
        return spinner
    }
}