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

import de.cau.cs.kieler.kicool.registration.KiCoolRegistration
import java.util.HashMap
import org.eclipse.xtend.lib.annotations.Accessors
import java.util.Map

/**
 * @author ssm
 * @kieler.design 2017-02-24 proposed
 * @kieler.rating 2017-02-24 proposed yellow 
 */
class SystemSelectionManager {
    
    @Accessors private Map<String, de.cau.cs.kieler.kicool.System> temporarySystem = 
        <String, de.cau.cs.kieler.kicool.System> newHashMap
    
    private val indexMap = new HashMap<String, String>
    
    private var CompilerView view
    
    new(CompilerView view) {
        this.view = view
    }
    
    def createSystemComboList() {
        view.combo.items.clear
        indexMap.clear
        var int i = 0
        for(system : KiCoolRegistration.getSystemModels.filter(de.cau.cs.kieler.kicool.System)) {
            val name = if (system.label.nullOrEmpty) system.id else system.label
            view.combo.items.add(name)
            indexMap.put(name, system.id)
        }
        view.combo.update(0)
    }
   
    def de.cau.cs.kieler.kicool.System getSelectedSystem() {
        val selection = view.combo.selectedText
        val systemId = indexMap.get(selection)
        if (systemId == null) {
            val tempSystem = temporarySystem.get(selection)
            if (tempSystem != null) {
                return tempSystem
            } else {
                System.err.println("KiCool.UI: A non-existent system was selected! This should not be possible.")
                return null
            }
        } else {
            return KiCoolRegistration.getSystemById(systemId)
        }
    }
    
    def setTemporarySystem(de.cau.cs.kieler.kicool.System system) {
        val systemKeyBase = "TMP " + system.id
        var systemKey = systemKeyBase + " 1"
        var i = 1
        while (view.combo.items.contains(systemKey)) {
            i++
            systemKey = systemKeyBase + " " + i 
        }
        temporarySystem.put(systemKey, system)
        
        view.combo.items.add(0, systemKey)
        view.combo.selectedIndex = 0
        view.combo.update(0)
        view.updateToolbar
    }
    
    def onSystemChange() {
        val editorReference = CompilerView.getActiveEditorReference
        val editor = editorReference.getEditor(false)
        if (editorReference != null && editor != null) {
            view.editPartSystemManager.removeSystem(editor)
            view.partListener.updateCompilerView(editorReference)
        }
    }
}