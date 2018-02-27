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

import de.cau.cs.kieler.prom.ui.PromUIPlugin
import de.cau.cs.kieler.simulation.core.SimulationManager
import de.cau.cs.kieler.simulation.core.events.SimulationAdapter
import de.cau.cs.kieler.simulation.core.events.SimulationControlEvent
import java.util.List
import org.eclipse.swt.SWT
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.Text
import org.eclipse.ui.menus.WorkbenchWindowControlContribution

/**
 * The control to display the current tick count.
 * It contains a text field.
 * 
 * @author aas
 *
 */
class TickInfoContribution extends WorkbenchWindowControlContribution {

    private static val String NO_TICK = "Tick #0000 (-000)"
    private static var String simulationStatusText = NO_TICK
    private static val List<Text> tickInfoLabels = newArrayList

    private static val simulationListener = new SimulationAdapter("Tick Info") {
        override onSimulationControlEvent(SimulationControlEvent e) {
            PromUIPlugin.asyncExecInUI[
                if(e.pool == SimulationManager.instance?.currentPool) {
                    updateTickInfo
                }
            ]
        }
    }
    
    /**
     * Updates the info label with the current tick count.
     */
    private static def void updateTickInfo() {
        simulationStatusText = ""
        val simMan = SimulationManager.instance
        if(!simMan.isStopped) {
            val macroTick = simMan.currentMacroTickNumber
            val subTick = simMan.currentSubTickNumber
            simulationStatusText = "Tick #"+macroTick
            if(subTick > 0) {
                simulationStatusText += "," + subTick
            }
            if(SimulationManager.instance.positionInHistory > 0) {
                simulationStatusText += " (-" + SimulationManager.instance.positionInHistory + ")"
            }
        } else {
            simulationStatusText = NO_TICK
        }
        for(l : tickInfoLabels) {
            l.text = simulationStatusText
        }
    }
    
    
    /**
     * The text field
     */
    var Text label    
    
    /**
     * Constructor
     */
    new() {
        SimulationManager.add(simulationListener)
    }
    
    /**
     * Constructor
     * 
     * @param id The id of this contribution
     */
    new(String id) {
        super(id)
        SimulationManager.add(simulationListener)
    }
    
    /**
     * {@inheritDoc}
     */
    override protected createControl(Composite parent) {
        label = new Text(parent, SWT.READ_ONLY)
        tickInfoLabels.add(label)
        // Provide some text so the text field has some space in the toolbar
        label.text = simulationStatusText
        label.toolTipText = "Last executed macro tick"
        return label
    }
    
    override dispose() {
        super.dispose()
        tickInfoLabels.remove(label)
    }
}