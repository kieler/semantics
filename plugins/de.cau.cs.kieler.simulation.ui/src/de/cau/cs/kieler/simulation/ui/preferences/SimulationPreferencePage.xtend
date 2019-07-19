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
package de.cau.cs.kieler.simulation.ui.preferences

import de.cau.cs.kieler.simulation.SimulationContext
import de.cau.cs.kieler.simulation.ui.SimulationUI
import org.eclipse.debug.internal.ui.SWTFactory
import org.eclipse.jface.preference.PreferencePage
import org.eclipse.swt.SWT
import org.eclipse.swt.events.SelectionAdapter
import org.eclipse.swt.events.SelectionEvent
import org.eclipse.swt.layout.GridData
import org.eclipse.swt.layout.GridLayout
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.Spinner
import org.eclipse.ui.IWorkbench
import org.eclipse.ui.IWorkbenchPreferencePage
import de.cau.cs.kieler.simulation.ide.preferences.SimulationPreferences

/**
 * @author aas
 *
 */
class SimulationPreferencePage extends PreferencePage implements IWorkbenchPreferencePage {
    
    extension SimulationPreferences = SimulationUI.environmentDefaults
    
    /**
     * The workbench from the init(...) method.
     */
    private var IWorkbench workbench

    /**
     * The control to set the maximum history length
     */
    private var Spinner simulatableTimeoutControl
    
    /**
     * The control to set the maximum history length
     */
    private var Spinner historyLengthControl
    
    /**
     * Implementation of IWorkbenchPreferencePage.
     * Saves the reference to the workbench and the used preference store.
     * 
     * @param workbench The workbench
     */
    override void init(IWorkbench workbench) {
        this.workbench = workbench
    }
    
    /**
     * {@inheritDoc}
     */
    override protected createContents(Composite parent) {
        val comp = new Composite(parent, SWT.NONE)

        comp.setLayoutData(new GridData(GridData.FILL_HORIZONTAL))
        comp.setLayout(new GridLayout())

        // Create the control to define the maximum simulation history length
        var group = SWTFactory.createGroup(parent, "Simulation Timeout", 2, 1, GridData.FILL_HORIZONTAL)
        SWTFactory.createLabel(group, "Process timeout in seconds", 1)
        simulatableTimeoutControl = new Spinner(group, SWT.BORDER)
        simulatableTimeoutControl.minimum = 0
        simulatableTimeoutControl.increment = 1
        simulatableTimeoutControl.pageIncrement = 1
        simulatableTimeoutControl.selection = getIntValue(SimulationContext.REACTION_TIMEOUT_IN_SECONDS.id)
        simulatableTimeoutControl.addSelectionListener(new SelectionAdapter() {
            override widgetSelected(SelectionEvent e) {
                setValue(SimulationContext.REACTION_TIMEOUT_IN_SECONDS.id, simulatableTimeoutControl.selection)
            }
        })

        // Create the control to define the maximum simulation history length
        group = SWTFactory.createGroup(parent, "Simulation History", 2, 1, GridData.FILL_HORIZONTAL)
        SWTFactory.createLabel(group, "Maxium length", 1)
        historyLengthControl = new Spinner(group, SWT.BORDER)
        historyLengthControl.minimum = 1
        historyLengthControl.increment = 1
        historyLengthControl.pageIncrement = 1
        historyLengthControl.selection = getIntValue(SimulationContext.MAX_HISTORY_LENGTH.id)
        historyLengthControl.addSelectionListener(new SelectionAdapter() {
            override widgetSelected(SelectionEvent e) {
                setValue(SimulationContext.MAX_HISTORY_LENGTH.id, historyLengthControl.selection)
            }
        })

        return comp
    }
    
    /**
     * Restore the default values. 
     */
    override performDefaults() {
        resetToDefault()
        simulatableTimeoutControl.selection = getIntValue(SimulationContext.REACTION_TIMEOUT_IN_SECONDS.id)
        historyLengthControl.selection = getIntValue(SimulationContext.MAX_HISTORY_LENGTH.id)
        
        super.performDefaults
    }

}