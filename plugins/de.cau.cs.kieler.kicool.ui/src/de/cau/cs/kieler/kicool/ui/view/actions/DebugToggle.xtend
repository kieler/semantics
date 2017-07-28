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
import de.cau.cs.kieler.kicool.ui.view.CompilerView

/**
 * @author ssm
 * @kieler.design 2017-02-24 proposed
 * @kieler.rating 2017-02-24 proposed yellow  
 */
class DebugToggle extends AbstractAction {

    private static val DEBUG_TOGGLE_ACTION_DEFAULT = true

    new(CompilerView view) {  
        super(view, 
            "Debug Mode", 
            IAction.AS_CHECK_BOX,
            "debugToggle",
            "Debug Mode",
            "Sets the system to debug mode meaning that each processor step and each " + 
            "intermediate result will be saved during processing.",
            null)
        action.setChecked(DEBUG_TOGGLE_ACTION_DEFAULT)
    }
    
    override void invoke() {
        // implement me!
    }
}