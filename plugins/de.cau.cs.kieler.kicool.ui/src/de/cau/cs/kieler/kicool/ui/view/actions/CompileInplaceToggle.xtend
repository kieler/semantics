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
 * @kieler.design 2017-08-02 proposed
 * @kieler.rating 2017-08-02 proposed yellow  
 */
class CompileInplaceToggle extends AbstractAction {

    private static val COMPILE_INPLACE_TOGGLE_ACTION_DEFAULT = false

    /** The action for toggling forward result mode. */
    @Accessors private IToolBarManager toolBar
    
    @Accessors boolean isChecked
    
    new(CompilerView view) {
        super(view, 
            "Inplace Compilation", 
            IAction.AS_CHECK_BOX, 
            "CompileInplaceToggle", 
            "Inplace Compilation", 
            "Do not create intermediate compilation results. Just compile the model in-place.", 
            null)
        action.setChecked(COMPILE_INPLACE_TOGGLE_ACTION_DEFAULT)
        invoke
    }
    
    override void invoke() {
        isChecked = action.isChecked
    }
    
    
}