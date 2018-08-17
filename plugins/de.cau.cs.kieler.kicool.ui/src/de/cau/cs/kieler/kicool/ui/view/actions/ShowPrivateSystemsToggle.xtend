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

import org.eclipse.jface.action.IAction
import org.eclipse.xtend.lib.annotations.Accessors
import de.cau.cs.kieler.kicool.ui.view.CompilerView
import de.cau.cs.kieler.kicool.ide.CompilerViewUtil

/**
 * @author ssm
 * @kieler.design 2017-12-19 proposed
 * @kieler.rating 2017-12-19 proposed yellow  
 */
class ShowPrivateSystemsToggle extends AbstractAction {

    private static val SHOW_PRIVATE_SYSTEMS_TOGGLE_ACTION_DEFAULT = false
    
    new(CompilerView view) {
        super(view, 
            "Show Private Systems", 
            IAction.AS_CHECK_BOX, 
            "showPrivateSystemsToggle", 
            "Show Private Systems", 
            "Also show all private systems in the systems selection.", 
            null)
        action.setChecked(SHOW_PRIVATE_SYSTEMS_TOGGLE_ACTION_DEFAULT)
    }
    
    override void invoke() {
        CompilerViewUtil.isCheckedShowPrivateSystemsToggle = action.isChecked
        if (view !== null && view.systemSelectionManager !== null)
            view.systemSelectionManager.updateSystemList
    }
    
}