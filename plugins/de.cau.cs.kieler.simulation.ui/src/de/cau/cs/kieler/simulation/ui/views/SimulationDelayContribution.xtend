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
import org.eclipse.swt.events.SelectionAdapter
import org.eclipse.swt.events.SelectionEvent
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.Spinner
import org.eclipse.xtend.lib.annotations.Accessors

import static de.cau.cs.kieler.simulation.core.SimulationManager.*

/**
 * The control in the data pool view to set the desired simulation pause in play mode.
 * It contains a spinner.
 * 
 * @author aas
 *
 */
class SimulationDelayContribution extends ControlContribution {
    /**
     * The spinner
     */
    @Accessors
    var Spinner spinner
    
    /**
     * Constructor
     * 
     * @param id The id of this contribution
     */
    new(String id) {
        super(id)
    }
    
    /**
     * {@inheritDoc}
     */
    override createControl(Composite parent) {
        spinner = new Spinner(parent, SWT.BORDER)
        spinner.toolTipText = "Simulation delay in play mode (milliseconds)"
        spinner.minimum = SimulationManager.MIN_PAUSE
        spinner.maximum = SimulationManager.MAX_PAUSE
        spinner.increment = 50
        spinner.pageIncrement = 50
        spinner.selection = SimulationManager.desiredTickPause
        
        spinner.addSelectionListener(new SelectionAdapter() {
            override widgetSelected(SelectionEvent e) {
                val value = spinner.selection
                if(value >= SimulationManager.MIN_PAUSE && value <= SimulationManager.MAX_PAUSE) {
                    SimulationManager.desiredTickPause = value
                }
            }
        })
        
        return spinner
    }
}