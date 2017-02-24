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
class DebugToggleAction {

    private static val DEBUG_TOGGLE_ACTION_DEFAULT = true

    /** The action for toggling debug mode. */
    @Accessors private Action debugToggleAction;
    
    new(CompilerView view) {  
        debugToggleAction = new Action("Debug Mode", IAction.AS_CHECK_BOX) {
            override void run() {
                invokeToggleDebug(view);
            }
        }
        debugToggleAction.setId("debugToggleAction")
        debugToggleAction.setText("Debug Mode")
        debugToggleAction.setToolTipText("Sets the system to debug mode meaning that each processor step and each " + 
            "intermediate result will be saved during processing.")
        debugToggleAction.setChecked(DEBUG_TOGGLE_ACTION_DEFAULT)
    }
    
    protected def invokeToggleDebug(CompilerView view) {
        // implement me!
    }
}