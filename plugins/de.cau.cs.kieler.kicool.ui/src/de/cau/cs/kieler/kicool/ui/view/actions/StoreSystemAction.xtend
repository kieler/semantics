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

import de.cau.cs.kieler.kicool.compilation.Compile
import org.eclipse.jface.action.Action
import org.eclipse.jface.action.IAction
import org.eclipse.jface.resource.ImageDescriptor
import org.eclipse.ui.plugin.AbstractUIPlugin
import org.eclipse.xtend.lib.annotations.Accessors
import de.cau.cs.kieler.kicool.ui.view.CompilerView

/**
 * @author ssm
 * @kieler.design 2017-05-12 proposed
 * @kieler.rating 2017-05-12 proposed yellow  
 */
class StoreSystemAction {

    public static final ImageDescriptor ICON_GO = AbstractUIPlugin.imageDescriptorFromPlugin(
            "de.cau.cs.kieler.kicool.ui", "icons/IMBC_go.png");    
    
    /** The action for compiling systems. */
    @Accessors private Action action
    @Accessors private CompilerView view
    
    new(CompilerView view) {
        this.view = view  
        action = new Action("OpenSystem", IAction.AS_PUSH_BUTTON) {
            override void run() {
                invokeStoreSystem
            }
        }
        action.setId("openSystemAction")
        action.setText("Open active system")
        action.setToolTipText("Opens the actual active system inside a seperate editor to enable modifications.")
        action.imageDescriptor = ICON_GO    
        action.disabledImageDescriptor = null
    }
    
    def void invokeStoreSystem() {
        // implement me!
    }
}