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
import org.eclipse.jface.action.IToolBarManager
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * @author ssm
 * @kieler.design 2017-05-12 proposed
 * @kieler.rating 2017-05-12 proposed yellow  
 */
class AutoCompileToggle extends AbstractAction {

    private static val AUTO_COMPILE_TOGGLE_ACTION_DEFAULT = false

    /** The action for toggling forward result mode. */
    @Accessors private IToolBarManager toolBar
    
    @Accessors boolean isChecked
    
    new(CompilerView view) {
        super(view, 
            "Compile on Save", 
            IAction.AS_CHECK_BOX, 
            "autoCompileToggle", 
            "Compile on Save", 
            "Automatically invoke a compilation when the active editor is saved.", 
            null)
        action.setChecked(AUTO_COMPILE_TOGGLE_ACTION_DEFAULT)
        invoke
    }
    
    override void invoke() {
        isChecked = action.isChecked
    }
    
    
}