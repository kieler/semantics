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

import de.cau.cs.kieler.kicool.ui.view.CompilerView
import org.eclipse.jface.action.IAction
import org.eclipse.jface.action.IToolBarManager
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * @author ssm
 * @kieler.design 2017-06-13 proposed
 * @kieler.rating 2017-06-13 proposed yellow  
 */
class VisualLayoutFeedbackToggle extends AbstractAction {

    private static val VISUAL_LAYOUT_FEEDBACK_TOGGLE_ACTION_DEFAULT = true

    /** The action for toggling debug mode. */
    @Accessors private IToolBarManager toolBar
    
    @Accessors boolean isChecked
    
    new(CompilerView view) {
        super(view, 
            "Visual Layout Feedback", 
            IAction.AS_CHECK_BOX, 
            "visualLayoutFeedbackToggle", 
            "Visual Layout Feedback", 
            "Gives visual feedback about the compilation process and processor metrics.", 
            null)
        action.setChecked(VISUAL_LAYOUT_FEEDBACK_TOGGLE_ACTION_DEFAULT)
        invoke
    }
    
    override void invoke() {
        isChecked = action.checked
    }

    
}