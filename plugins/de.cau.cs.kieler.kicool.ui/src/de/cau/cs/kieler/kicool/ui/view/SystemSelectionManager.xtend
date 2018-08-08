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
package de.cau.cs.kieler.kicool.ui.view

import de.cau.cs.kieler.kicool.System
import de.cau.cs.kieler.kicool.registration.KiCoolRegistration
import java.util.ArrayList
import org.eclipse.jface.action.ControlContribution
import org.eclipse.swt.SWT
import org.eclipse.swt.events.SelectionEvent
import org.eclipse.swt.events.SelectionListener
import org.eclipse.swt.widgets.Combo
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.Control

import static extension de.cau.cs.kieler.kicool.ui.view.actions.CompilationAction.retrieveModel
import static extension de.cau.cs.kieler.kicool.util.KiCoolUtils.*
import de.cau.cs.kieler.prom.ui.PromUIPlugin
import de.cau.cs.kieler.kicool.ide.CompilerViewUtil

/**
 * The SystemSelectionManager keeps track of available systems and reacts to user input regarding selected systems. 
 * 
 * @author ssm, als
 * @kieler.design 2017-02-24 proposed
 * @kieler.rating 2017-02-24 proposed yellow 
 */
class SystemSelectionManager implements SelectionListener {
    
    public static val TEMPORARY_SYSTEM_PREFIX = "TMP "
    
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
            updateSystemList(false, false)
            val width = super.computeWidth(control)
            updateSystemList(true, false)
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
        updateSystemList(true, false)
    }
    
    private def updateSystemList(boolean filter, boolean updateView) {
        if (combo === null || combo.disposed) return;
        combo.removeAll
        index.clear
        
        val model = if(filter) view.editPartSystemManager.activeEditor?.retrieveModel
        if (model !== null && model.class !== modelClassFilter) {
            modelClassFilter = model.class
        }
        val systems = CompilerViewUtil.getSystemModels(filter, modelClassFilter)
        
        for(system : systems.
            filter[ public || (view !== null && view.showPrivateSystemsToggle !== null && view.showPrivateSystemsToggle.checked) ].
            filter[ !developer || (view !== null && view.developerToggle !== null && view.developerToggle.checked) ]
        ) {
            val id = system.id
            var name = system.label
            if (name.nullOrEmpty) name = id
            if (KiCoolRegistration.isTemporarySystem(id)) name = TEMPORARY_SYSTEM_PREFIX + name
            combo.add(name)
            index.add(system.id)
        }
        
        // Base default
        var defaultIndex = 0
        
        // Default via extension point
        val defaultSystemID = CompilerViewUtil.getDefaultSystem(view.editPartSystemManager.activeEditor?.editorSite?.id)
        if (defaultSystemID !== null) {
            val idx = index.indexOf(defaultSystemID)
            if (idx >= 0) {
                defaultIndex = idx
            }
        }
        
        // Previously selected
        val activeSystem = view.editPartSystemManager.activeSystemId
        if (activeSystem !== null && index.contains(activeSystem)) {
            defaultIndex = index.indexOf(activeSystem)
        } else {
            view.editPartSystemManager.activeSystem = index.get(defaultIndex)
        }

        combo.setTextLimit(36)
        combo.select(defaultIndex)
        combo.pack()
        if (updateView) view.updateToolbar() // Prevent infinite invocation loops
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
            val systemId = getSelectedSystemId
            if (systemId !== null) {
                return KiCoolRegistration.getSystemById(systemId)
            }
        }
        return null
    }
    
    def String getSelectedSystemId() {
        if(combo.selectionIndex < 0) {
            return null
        }
        return index.get(combo.selectionIndex)
    }
    
    def setTemporarySystem(System system) {
        try {
            CompilerViewUtil.temporarySystem = system   
        } catch (Exception e) {
            PromUIPlugin.showError(e)
        }
        updateSystemList
        view.updateToolbar
    }
    
    override widgetDefaultSelected(SelectionEvent e) {
    }
    
    override widgetSelected(SelectionEvent e) {
        if (combo.selectionIndex != -1) {
            val id = index.get(combo.selectionIndex)
            if (!id.nullOrEmpty) {
                view.editPartSystemManager.setActiveSystem(id)
                view.editPartSystemManager.intermediateSelection = null
                view.updateView
            }
        }
    }
    
    def widgetSelectFirst(boolean updateView) {
        val id = index.get(0)
        if (!id.nullOrEmpty) {
            // Workaround: show always the identity system.
            view.editPartSystemManager.setActiveSystem("de.cau.cs.kieler.kicool.identity")
            view.editPartSystemManager.intermediateSelection = null
            if (updateView) view.updateView
        }
    }
    
}