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
import de.cau.cs.kieler.kicool.System
import java.util.HashMap

/**
 * @author ssm
 * @kieler.design 2017-02-24 proposed
 * @kieler.rating 2017-02-24 proposed yellow 
 */
class SystemSelectionManager {
    
    private val indexMap = new HashMap<Integer, String>
    
    private var CompilerView view
    
    new(CompilerView view) {
        this.view = view
        
        createSystemComboList()        
    }
    
    def createSystemComboList() {
        view.combo.items.clear
        indexMap.clear
        var int i = 0
        for(system : KiCoolRegistration.getSystemModels.filter(System)) {
            val name = if (system.label.nullOrEmpty) system.id else system.label
            view.combo.items.add(name)
            indexMap.put(i++, system.id)
        }
        view.combo.update(0)
    }
    
    def String getSelectedSystemId() {
        indexMap.get(view.combo.selectedIndex)
    }
    
}