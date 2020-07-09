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
import org.eclipse.jface.action.IToolBarManager
import org.eclipse.jface.action.IMenuManager
import org.eclipse.jface.action.Separator

/**
 * @author ssm
 * @kieler.design 2017-05-12 proposed
 * @kieler.rating 2017-05-12 proposed yellow  
 */
class OnOffButtonsToggle extends AbstractAction {

    private static val ON_OFF_BUTTONS_TOGGLE_ACTION_DEFAULT = false

    /** The action for toggling debug mode. */
    @Accessors boolean isChecked
    
    new(CompilerView view) {
        super(view, 
            "Show Processors Disabling Buttons", 
            IAction.AS_CHECK_BOX, 
            "onOffButtonsToggle", 
            "Show Processors Disabling Buttons", 
            "Shows buttons to disable individual processors or to terminate compilation at a certain processor.", 
            null)
        action.setChecked(ON_OFF_BUTTONS_TOGGLE_ACTION_DEFAULT)
    }
    
    override void invoke() {
        isChecked = action.isChecked
        view.updateView
    }
    
}