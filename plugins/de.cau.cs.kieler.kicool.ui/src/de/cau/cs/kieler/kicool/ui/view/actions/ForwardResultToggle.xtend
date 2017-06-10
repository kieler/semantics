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
import org.eclipse.jface.action.IToolBarManager
import org.eclipse.jface.action.IMenuManager
import org.eclipse.jface.action.Separator

/**
 * @author ssm
 * @kieler.design 2017-05-12 proposed
 * @kieler.rating 2017-05-12 proposed yellow  
 */
class ForwardResultToggle extends AbstractAction {

    private static val FORWARD_RESULT_TOGGLE_ACTION_DEFAULT = true

    /** The action for toggling forward result mode. */
    @Accessors private IToolBarManager toolBar
    
    @Accessors boolean isChecked
    
    new(CompilerView view) {
        super(view, 
            "Forward Results Automatically", 
            IAction.AS_CHECK_BOX, 
            "forwardResultToggle", 
            "Forward Results Automatically", 
            "Automatically forwards the final results to linked views.", 
            null)
        action.setChecked(FORWARD_RESULT_TOGGLE_ACTION_DEFAULT)
        invoke
    }
    
    override void invoke() {
        isChecked = action.isChecked
    }
    
    
}