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
class DeveloperToggle extends AbstractAction {

    private static val DEVELOPER_TOGGLE_ACTION_DEFAULT = false

    /** The action for toggling debug mode. */
    @Accessors private IToolBarManager toolBar
    @Accessors boolean isChecked
    
    private var Separator separator
    private var OpenSystemAction openSystemAction
    
    new(CompilerView view) {
        super(view, 
            "Developer Mode", 
            IAction.AS_CHECK_BOX, 
            "developerToggle", 
            "Developer Mode", 
            "Sets the view to developer mode unlocking developer specific options.", 
            null)
        action.setChecked(DEVELOPER_TOGGLE_ACTION_DEFAULT)
    }
    
    override void invoke() {
        isChecked = action.isChecked
        separator.visible = action.isChecked
        toolBar.find(openSystemAction.action.id).visible = action.isChecked
        view.viewSite.actionBars.updateActionBars
    }
    
    
    def void addContributions(IToolBarManager toolBar, IMenuManager menu) {
        this.toolBar = toolBar
        separator = new Separator
        openSystemAction = new OpenSystemAction(view)
        
        toolBar.add(separator)
        toolBar.add(openSystemAction.action)
        
        invoke
    }
    
}