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
 * @author als
 * @kieler.design 2017-08-02 proposed
 * @kieler.rating 2017-08-02 proposed yellow  
 */
class CompileTracingToggle extends AbstractAction {

    private static val COMPILE_TRACING_TOGGLE_ACTION_DEFAULT = false

    /** The action for toggling forward result mode. */
    @Accessors private IToolBarManager toolBar
    
    @Accessors boolean isChecked
    
    new(CompilerView view) {
        super(view, 
            "Tracing", 
            IAction.AS_CHECK_BOX, 
            "CompileTracingToggle", 
            "Tracing", 
            "Activates tracing for all compilation systems.", 
            null)
        action.setChecked(COMPILE_TRACING_TOGGLE_ACTION_DEFAULT)
        invoke
    }
    
    override void invoke() {
        isChecked = action.isChecked
    }
    
    
}