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
package de.cau.cs.kieler.simulation.ui.view.diagram

import de.cau.cs.kieler.kicool.System
import de.cau.cs.kieler.kicool.registration.KiCoolRegistration
import de.cau.cs.kieler.kicool.ui.klighd.KiCoModelUpdateController
import de.cau.cs.kieler.simulation.ui.SimulationUI
import de.cau.cs.kieler.simulation.ui.SimulationUIPlugin
import de.cau.cs.kieler.simulation.ui.view.pool.DataPoolView
import org.eclipse.jface.action.Action
import org.eclipse.jface.action.ActionContributionItem
import org.eclipse.jface.action.IAction
import org.eclipse.jface.action.IMenuCreator
import org.eclipse.swt.widgets.Control
import org.eclipse.swt.widgets.Menu

import static extension de.cau.cs.kieler.kicool.util.KiCoolUtils.*

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class SimulationAction extends Action implements IMenuCreator {
    
    private static val TEXT = "Start new Simulation"
    private static val ICON = SimulationUIPlugin.imageDescriptorFromPlugin(SimulationUIPlugin.PLUGIN_ID, "icons/launch.png")
    
    private val KiCoModelUpdateController muc
    private val systems = <String, System>newLinkedHashMap
    private var String lastSelectedSystem
    private var Class<?> filter
    private var Menu fMenu
    

    new(KiCoModelUpdateController muc) {
        this.muc = muc
        setText(TEXT)
        setToolTipText(TEXT)
        setImageDescriptor(ICON)
        setMenuCreator(this)
        update(muc.model)
    }
    
    def update(Object model) {
        if ((systems.empty && filter === null) ||
                (model !== null && !model.class.equals(filter)) ||
                (model === null && filter !== null)) {
                
            systems.clear
            if (model === null) {
                filter = null
                systems.putAll(KiCoolRegistration.systemModels.filter[simulation].toMap[id])
            } else {
                filter = model.class
                for (system : KiCoolRegistration.systemModels.filter[simulation && hasInput(filter)]) {
                    systems.put(system.id, system)
                }
            }
            if (lastSelectedSystem === null && !systems.empty) {
                lastSelectedSystem = systems.keySet.head
            }
            
            enabled = !systems.empty
        }
    }

    /* (non-Javadoc)
     * @see IMenuCreator#dispose()
     */
    override void dispose() {
        if (fMenu !== null) {
            fMenu.dispose()
        }
    }

    /* (non-Javadoc)
     * @see IMenuCreator#getMenu(org.eclipse.swt.widgets.Menu)
     */
    override Menu getMenu(Menu parent) {
        return null;
    }

    /* (non-Javadoc)
     * @see IMenuCreator#getMenu(org.eclipse.swt.widgets.Control)
     */
    override Menu getMenu(Control parent) {
        if (fMenu !== null) {
            fMenu.dispose()
        }

        fMenu = new Menu(parent)
        val actions = <Action>newArrayList
        for (entry : systems.entrySet) {
            val Action action = new Action(entry.value.label, IAction.AS_RADIO_BUTTON) {
                override run() {
                    actions.forEach[checked = false]
                    this.checked = true
                    lastSelectedSystem = entry.key
                }
            }
            if (lastSelectedSystem.equals(entry.key)) {
                action.checked = true
            }
            val item = new ActionContributionItem(action)
            item.fill(fMenu, -1)
        }
        
        return fMenu
    }

    /* (non-Javadoc)
     * @see IAction#run()
     */
    override void run() {
        if (!lastSelectedSystem.nullOrEmpty && !systems.empty && muc.model !== null) {
            SimulationUI.compileAndStartSimulation(lastSelectedSystem, muc.model)
            DataPoolView.bringToTopIfOpen
        }
    }

}
