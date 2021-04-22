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
package de.cau.cs.kieler.simulation.ui.view.pool

import de.cau.cs.kieler.simulation.SimulationContext
import de.cau.cs.kieler.simulation.events.SimulationControlEvent
import de.cau.cs.kieler.simulation.events.SimulationControlEvent.SimulationOperation
import de.cau.cs.kieler.simulation.events.SimulationEvent
import de.cau.cs.kieler.simulation.mode.DynamicTickMode
import de.cau.cs.kieler.simulation.mode.PeriodicMode
import de.cau.cs.kieler.simulation.mode.SimulationMode
import de.cau.cs.kieler.simulation.mode.SimulationModes
import de.cau.cs.kieler.simulation.mode.TimedSimulationModeCountDown
import de.cau.cs.kieler.simulation.ui.SimulationUI
import org.eclipse.jface.action.ControlContribution
import org.eclipse.jface.action.IToolBarManager
import org.eclipse.swt.SWT
import org.eclipse.swt.events.SelectionAdapter
import org.eclipse.swt.events.SelectionEvent
import org.eclipse.swt.events.SelectionListener
import org.eclipse.swt.widgets.Combo
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.Spinner
import org.eclipse.swt.widgets.Text
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class SimulationModeMenu implements SelectionListener {
    
    @Accessors(PUBLIC_GETTER)
    static var Class<? extends SimulationMode> currentMode = SimulationModes.PERIODIC
    static val MODES = SimulationModes.allModesMap.entrySet.toList
    
    private var IToolBarManager manager
    private var Combo combo
    private val ControlContribution comboContrib = new ControlContribution("Mode") {
        
        override protected createControl(Composite parent) {
            combo = new Combo(parent, SWT.DROP_DOWN.bitwiseOr(SWT.READ_ONLY))
            combo.addSelectionListener(SimulationModeMenu.this)
            for (mode : MODES) {
                combo.add(mode.key)
            }
            combo.select(MODES.indexed.findFirst[value.value == currentMode].key)
            return combo
        }
    }
    private var int period = PeriodicMode.DEFAULT
    private val ControlContribution periodicContrib = new ControlContribution("Periodic") {
        
        override protected createControl(Composite parent) {
            val spinner = new Spinner(parent, SWT.BORDER)
            spinner.toolTipText = "Simulation delay in play mode (milliseconds)"
            spinner.minimum = PeriodicMode.MINIMUM
            spinner.maximum = PeriodicMode.MAXIMUM
            spinner.increment = 50
            spinner.pageIncrement = 50
            spinner.selection = period
            
            spinner.addSelectionListener(new SelectionAdapter() {
                override widgetSelected(SelectionEvent e) {
                    period = spinner.selection
                    if (SimulationUI.currentSimulation !== null) {
                        val mode = SimulationUI.currentSimulation.mode
                        if (mode instanceof PeriodicMode) {
                            mode.period = period
                        }
                    }
                }
            })
            
            return spinner
        }
    }
    private var Text dynamicInfoLabel = null
    private var DynamicInfoLabelUpdater dynamicInfoLabelUpdater = null
    private val ControlContribution dynamicContrib = new ControlContribution("DynamicTicks") {
        
        override protected createControl(Composite parent) {
            dynamicInfoLabel = new Text(parent, SWT.READ_ONLY)
            // Provide some text so the text field has some space in the toolbar
            updateDynamicInfoLabel(true)
            return dynamicInfoLabel
        }
    }
    
    def addControls(IToolBarManager manager) {
        this.manager = manager
        manager.add(periodicContrib)
        manager.add(dynamicContrib)
        manager.add(comboContrib)
        updateToolbarVisibility
    }
    
    def update(SimulationContext ctx, SimulationEvent e) {
        if (ctx !== null) {
            if (e instanceof SimulationControlEvent) {
                if (e.operation == SimulationOperation.MODE) {
                    val mode = ctx.mode
                    
                    if (mode instanceof DynamicTickMode) {
                        if (dynamicInfoLabelUpdater === null) {
                            dynamicInfoLabelUpdater = new DynamicInfoLabelUpdater(this)
                            dynamicInfoLabelUpdater.start
                        }
                    } else {
                        dynamicInfoLabelUpdater?.interrupt
                        dynamicInfoLabelUpdater = null
                    }
                    
                    if (mode instanceof PeriodicMode) {
                        mode.period = period
                    }
                } else if (e.operation == SimulationOperation.STOP) {
                    dynamicInfoLabelUpdater?.interrupt
                    dynamicInfoLabelUpdater = null
                }
            }
        }
    }
    
    override widgetDefaultSelected(SelectionEvent e) {
    }
    
    override widgetSelected(SelectionEvent e) {
        if (combo.selectionIndex != -1 && !combo.isDisposed) {
            val newMode = MODES.get(combo.selectionIndex).value
            if (newMode !== currentMode) {
                currentMode = newMode
                if (SimulationUI.currentSimulation !== null) {
                    SimulationUI.currentSimulation.mode = currentMode
                }
                updateToolbarVisibility()
                DataPoolView.instance?.updateToolbar
            }
        }
    }
    
    def updateToolbarVisibility() {
        periodicContrib.visible = false
        dynamicContrib.visible = false
        // This update is impoertant
        DataPoolView.instance?.updateToolbar
        
        switch(currentMode) {
            case SimulationModes.PERIODIC: {
                periodicContrib.visible = true
            }
            case SimulationModes.DYNAMIC: {
                dynamicContrib.visible = true
            }
            default: {}//Nothing
        }
        manager.markDirty
    }
    
    def updateDynamicInfoLabel(boolean isUI) {
        var deltaT = 0.0
        var sleepT = 0.0
        if (SimulationUI.currentSimulation !== null) {
            val mode = SimulationUI.currentSimulation.mode
            if (mode instanceof DynamicTickMode) {
                deltaT = mode.deltaT
                sleepT = mode.sleepT
            }
        }
        val newLabel = String.format("deltaT: %.4f sec; sleepT: %.4f sec", deltaT, sleepT)
        if (isUI) {
            dynamicInfoLabel.text = newLabel
        } else {
            SimulationUI.updateUI[dynamicInfoLabel.text = newLabel]
        }
    }
    
}

class DynamicInfoLabelUpdater extends Thread {
    
    static val long SLEEP = TimedSimulationModeCountDown.SLEEP_MSEC
    val SimulationModeMenu menu
    
    new(SimulationModeMenu menu) {
        this.menu = menu
    }
    
    override run() {
        name = this.class.simpleName
        while (SimulationUI.currentSimulation !== null) {
            // work, sleep and loop
            try {
                menu.updateDynamicInfoLabel(false)
                Thread.sleep(SLEEP)
            } catch (InterruptedException ie) {
                // stop
                return
            }
        }
    }
}