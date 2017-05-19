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
import de.cau.cs.kieler.kicool.compilation.AsynchronousCompilation

/**
 * @author ssm
 * @kieler.design 2017-02-19 proposed
 * @kieler.rating 2017-02-19 proposed yellow  
 */
class CompilationAction {

    public static final ImageDescriptor ICON_COMPILE = AbstractUIPlugin.imageDescriptorFromPlugin(
            "de.cau.cs.kieler.kicool.ui", "icons/IMBC_go.png");    
    
    /** The action for compiling systems. */
    @Accessors private Action action
    @Accessors private CompilerView view
    
    new(CompilerView view) {  
        this.view = view  
        action = new Action("Compile", IAction.AS_PUSH_BUTTON) {
            override void run() {
                invokeCompile
            }
        }
        action.setId("compileAction")
        action.setText("Compile")
        action.setToolTipText("Invocates a compilation process.")
        action.imageDescriptor = ICON_COMPILE     
        
    }
    
    def void invokeCompile() {
        val model = CompilationActionSimSalabim.SIM_MODEL
        
        val cc = Compile.createCompilationContext("de.cau.cs.kieler.kicool.identity", model)
        
        val updateObserver = new CompilationUpdate(view)
        cc.addObserver(updateObserver)
        
        cc.compileAsynchronously
    }
}