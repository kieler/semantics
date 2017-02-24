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
class SmartSystemSelectionToggleAction {

    private static val SMART_SYSTEM_SELECTION_TOGGLE_ACTION_DEFAULT = true

    /** The action for toggling the smart system selection. */
    @Accessors private Action smartSystemSelectionToggleAction;
    
    new(CompilerView view) {  
        smartSystemSelectionToggleAction = new Action("Smart System Selection", IAction.AS_CHECK_BOX) {
            override void run() {
                invokeToggleSmartSystemSelection(view)
            }
        }
        smartSystemSelectionToggleAction.setId("smartSystemSelectionToggleAction")
        smartSystemSelectionToggleAction.setText("Smart System Toggle")
        smartSystemSelectionToggleAction.setToolTipText("Selects the appropriate system automatically depending on " + 
            "the pragma, the filename, and the selected system.")
        smartSystemSelectionToggleAction.setChecked(SMART_SYSTEM_SELECTION_TOGGLE_ACTION_DEFAULT)
    }
    
    protected def invokeToggleSmartSystemSelection(CompilerView view) {
        // implement me!
    }
}