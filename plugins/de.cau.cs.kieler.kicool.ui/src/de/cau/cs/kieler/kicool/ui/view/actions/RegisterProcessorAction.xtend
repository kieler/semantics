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
import org.eclipse.jface.action.Action
import org.eclipse.jface.action.IAction
import org.eclipse.jface.resource.ImageDescriptor
import org.eclipse.ui.plugin.AbstractUIPlugin
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtext.xbase.ui.editor.XbaseEditor
import org.eclipse.core.resources.IFile
import de.cau.cs.kieler.kicool.registration.Register

/**
 * @author ssm
 * @kieler.design 2017-05-12 proposed
 * @kieler.rating 2017-05-12 proposed yellow  
 */
class RegisterProcessorAction {

    public static final ImageDescriptor ICON_REGISTER_PROCESSOR = AbstractUIPlugin.imageDescriptorFromPlugin(
            "de.cau.cs.kieler.kicool.ui", "icons/IMBC_page_key.png");    
    
    /** The action for compiling systems. */
    @Accessors private Action action
    @Accessors private CompilerView view
    
    new(CompilerView view) {
        this.view = view  
        action = new Action("RegisterProcessor", IAction.AS_PUSH_BUTTON) {
            override void run() {
                invokeRegisterProcessor
            }
        }
        action.setId("registerProcessorAction")
        action.setText("Register Processor Action")
        action.setToolTipText("Registers the actual processor in the runtime so that it can be used in systems.")
        action.imageDescriptor = ICON_REGISTER_PROCESSOR
        action.disabledImageDescriptor = null
    }
    
    def void invokeRegisterProcessor() {
        val editor = CompilerView.getActiveEditor
        if (editor instanceof XbaseEditor) {
            registerProcessor(editor);
        }
    }
    
    private def registerProcessor(XbaseEditor editor) {
        val file = editor.editorInput.getAdapter(typeof(IFile))
        if (file != null) {
            Register.registerRuntimeClass(file)
        }
    }
}