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

/**
 * @author ssm
 * @kieler.design 2017-02-24 proposed
 * @kieler.rating 2017-02-24 proposed yellow 
 */
class SystemSelectionManager {
    
    private var IMBCompilerView view
    
    new(IMBCompilerView view) {
        this.view = view
        
        view.combo.items.clear
        KiCoolRegistration.getSystemModels.filter(System).forEach[
            val name = if (label.nullOrEmpty) id else label
            view.combo.items.add(name)
        ]
        view.combo.update(0)
    }
    
}