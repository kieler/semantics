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
package de.cau.cs.kieler.kicool.ui.view.actions

import de.cau.cs.kieler.kicool.ui.view.CompilerView
import org.eclipse.jface.action.IAction
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * @author ssm
 * @kieler.design 2017-12-19 proposed
 * @kieler.rating 2017-12-19 proposed yellow  
 */
class ShowPrivateSystemsToggle extends AbstractAction {

    private static val SHOW_PRIVATE_SYSTEMS_TOGGLE_ACTION_DEFAULT = false

    @Accessors boolean isChecked

    new(CompilerView view) {
        super(view, 
            "Show Internal Compilation Systems", 
            IAction.AS_CHECK_BOX, 
            "showPrivateSystemsToggle", 
            "Show Internal Compilation Systems", 
            "Also show all private (internal) systems in the systems selection.", 
            null)
        action.setChecked(SHOW_PRIVATE_SYSTEMS_TOGGLE_ACTION_DEFAULT)
    }
    
    override void invoke() {
        isChecked = action.isChecked
        if (view !== null && view.systemSelectionManager !== null)
            view.systemSelectionManager.updateSystemList
    }
    
}