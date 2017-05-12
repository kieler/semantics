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
package de.cau.cs.kieler.kicool.ui.view.actions

import org.eclipse.jface.action.Action
import org.eclipse.jface.action.IAction
import org.eclipse.xtend.lib.annotations.Accessors
import de.cau.cs.kieler.kicool.ui.view.CompilerView

/**
 * @author ssm
 * @kieler.design 2017-02-24 proposed
 * @kieler.rating 2017-02-24 proposed yellow  
 */
class SmartSystemSelectionToggle extends AbstractAction {

    private static val SMART_SYSTEM_SELECTION_TOGGLE_ACTION_DEFAULT = true

    new(CompilerView view) {  
        super(view, 
            "Smart System Selection", 
            IAction.AS_CHECK_BOX,
            "smartSystemSelectionToggle",
            "Smart System Toggle",
            "Selects the appropriate system automatically depending on " + 
            "the pragma, the filename, and the selected system.",
            null)
        action.setChecked(SMART_SYSTEM_SELECTION_TOGGLE_ACTION_DEFAULT)
    }
    
    override void invoke() {
        // implement me!
    }
}