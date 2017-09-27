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
package de.cau.cs.kieler.kicool.ui.view

import de.cau.cs.kieler.kicool.System
import de.cau.cs.kieler.kicool.registration.KiCoolRegistration
import de.cau.cs.kieler.kicool.ui.DefaultSystemAssociation
import java.util.ArrayList
import java.util.Map
import org.eclipse.jface.action.ControlContribution
import org.eclipse.swt.SWT
import org.eclipse.swt.events.SelectionEvent
import org.eclipse.swt.events.SelectionListener
import org.eclipse.swt.widgets.Combo
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.Control
import org.eclipse.xtend.lib.annotations.Accessors

import static extension de.cau.cs.kieler.kicool.ui.view.actions.CompilationAction.retrieveModel
import static extension de.cau.cs.kieler.kicool.util.KiCoolUtils.*

/**
 * The SystemSelectionManager keeps track of available systems and reacts to user input regarding selected systems. 
 * 
 * @author ssm, als
 * @kieler.design 2017-02-24 proposed
 * @kieler.rating 2017-02-24 proposed yellow 
 */
class SystemSelectionManager implements SelectionListener {
    
    @Accessors private Map<String, System> temporarySystem = 
        <String, System> newHashMap
    
    private val index = new ArrayList<String>(KiCoolRegistration.getSystemModels.size + 10)
    private var CompilerView view
    private var Class<?> modelClassFilter
    private var Combo combo;
    private val ControlContribution comboContrib = new ControlContribution("Systems") {
        
        override protected createControl(Composite parent) {
            combo = new Combo(parent, SWT.DROP_DOWN.bitwiseOr(SWT.READ_ONLY))
            combo.addSelectionListener(SystemSelectionManager.this)
            return combo
        }
        
        override protected int computeWidth(Control control) {
            // This is only performed once
            updateSystemList(false)
            val width = super.computeWidth(control)
            updateSystemList(true)
            return width
        }

    }
    
    new(CompilerView view) {
        this.view = view
    }
    
    def getContribution() {
        updateSystemList()
        return comboContrib
    }

    def updateSystemList() {  
        updateSystemList(true)
    }
    
    private def updateSystemList(boolean filter) {
        if (combo == null || combo.disposed) return;
        combo.removeAll
        index.clear
        
        val model = if(filter) view.editPartSystemManager.activeEditor?.retrieveModel
        if (model !== null && model.class !== modelClassFilter) {
            modelClassFilter = model.class
        }
        val systems = newLinkedList
        systems.addAll(temporarySystem.values)
        systems.addAll(KiCoolRegistration.getSystemModels.filter(System))
        
        for(system : systems.filter[!filter || hasInput(modelClassFilter)]) {
            var name = system.label
            if (name.nullOrEmpty) name = system.id
            if (temporarySystem.containsValue(system)) name = "TMP " + name
            combo.add(name)
            index.add(system.id)
        }
        
        // Base default
        var defaultIndex = 0
        
        // Default via extension point
        val defaultSystemID = DefaultSystemAssociation.getDefaultSystem(view.editPartSystemManager.activeEditor?.editorSite?.id)
        if (defaultSystemID !== null) {
            val idx = index.indexOf(defaultSystemID)
            if (idx >= 0) {
                defaultIndex = idx
            }
        }
        
        // Previously selected
        val activeSystem = view.editPartSystemManager.activeSystem
        if (activeSystem !== null && index.contains(activeSystem.id)) {
            defaultIndex = index.indexOf(activeSystem.id)
        } else {
            view.editPartSystemManager.activeSystem = KiCoolRegistration.getSystemById(index.get(defaultIndex))
        }

        combo.setTextLimit(36)
        combo.select(defaultIndex)
        combo.pack()
        view.updateToolbar()
    }
    
    private def hasInput(System sys, Class<?> modelClass) {
        val input = sys.findInputClass
        if (modelClass !== null && input !== null) {
            return input.isAssignableFrom(modelClass)
        }
        return true
    }
   
    def System getSelectedSystem() {
        if (!combo.isDisposed && combo.selectionIndex != -1) {
            val systemId = index.get(combo.selectionIndex)
            if (systemId != null) {
                if (temporarySystem.containsKey(systemId)) {
                    return temporarySystem.get(systemId)
                } else {
                    return KiCoolRegistration.getSystemById(systemId)
                }
            }
        }
        return null
    }
    
    def setTemporarySystem(System system) {
//        val systemKeyBase = "TMP " + system.id
//        var systemKey = systemKeyBase + " 1"
//        var i = 1
//        while (view.combo.items.contains(systemKey)) {
//            i++
//            systemKey = systemKeyBase + " " + i 
//        }
        temporarySystem.put("TMP " + system.id, system)
//        view.combo.items.add(0, systemKey)
//        view.combo.selectedIndex = 0
//        view.combo.update(0)
        updateSystemList
        view.updateToolbar
    }
    
    override widgetDefaultSelected(SelectionEvent e) {
    }
    
    override widgetSelected(SelectionEvent e) {
        if (combo.selectionIndex != -1) {
            val id = index.get(combo.selectionIndex)
            if (!id.nullOrEmpty) {
                view.editPartSystemManager.setActiveSystem(KiCoolRegistration.getSystemById(id))
                view.updateView
            }
        }
    }
    
}