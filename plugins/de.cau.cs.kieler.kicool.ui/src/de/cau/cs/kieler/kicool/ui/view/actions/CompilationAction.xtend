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

import org.eclipse.jface.resource.ImageDescriptor
import org.eclipse.ui.plugin.AbstractUIPlugin
import org.eclipse.jface.action.IAction
import org.eclipse.jface.action.Action
import org.eclipse.jface.action.IMenuManager
import org.eclipse.jface.action.Separator
import org.eclipse.jface.action.IToolBarManager
import org.eclipse.xtend.lib.annotations.Accessors
import de.cau.cs.kieler.kicool.compilation.Compile

/**
 * @author ssm
 * @kieler.design 2017-02-19 proposed
 * @kieler.rating 2017-02-19 proposed yellow  
 */
class CompilationAction {

    public static final ImageDescriptor ICON_GO = AbstractUIPlugin.imageDescriptorFromPlugin(
            "de.cau.cs.kieler.kicool.ui", "icons/IMBC_go.png");    
    
    /** The action for compiling systems. */
    @Accessors private Action compileAction;

    new() {    
        compileAction = new Action("Compile", IAction.AS_PUSH_BUTTON) {
            override void run() {
                invokeCompile();
            }
        }
        compileAction.setId("compileAction")
        compileAction.setText("Compile")
        compileAction.setToolTipText("Invocates a compilation process.")
        compileAction.imageDescriptor = ICON_GO     
    }
    
    protected def invokeCompile() {
        //TODO: chanche system paths to id!
        val model = "String program! :)"
        
        val cc = Compile.createCompilationContext("system/de.cau.cs.kieler.kicool.identity.kico", model)
        
        cc.compile
    }
}