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

/**
 * @author ssm
 * @kieler.design 2017-11-04 proposed
 * @kieler.rating 2017-11-04 proposed yellow  
 */
class DebugEnvironmentModelsToggle extends AbstractAction {

    private static val DEBUG_ENVIRONMENT_MODELS_TOGGLE_ACTION_DEFAULT = false
    
    @Accessors boolean isChecked

    new(CompilerView view) {
        super(view, 
            "Debug Environment Models", 
            IAction.AS_CHECK_BOX, 
            "debugEnvironmentModelsToggle", 
            "Debug Environment Models", 
            "Adds the environments of the processors to the intermediate model results.", 
            null)
        action.setChecked(DEBUG_ENVIRONMENT_MODELS_TOGGLE_ACTION_DEFAULT)
    }
    
    override void invoke() {
        isChecked = action.isChecked
    }
    
}