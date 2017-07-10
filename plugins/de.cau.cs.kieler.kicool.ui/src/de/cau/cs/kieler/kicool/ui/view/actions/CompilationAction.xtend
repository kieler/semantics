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
import org.eclipse.xtext.ui.editor.XtextEditor
import org.eclipse.xtext.util.concurrent.IUnitOfWork
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.resource.XtextResource
import de.cau.cs.kieler.kicool.compilation.CompilationContext
import de.cau.cs.kieler.kicool.ui.synthesis.actions.ToggleProcessorOnOffAction
import de.cau.cs.kieler.kicool.compilation.Environment

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
        var model = getEditorModel
        if (model == null) {
            model = CompilationActionSimSalabim.SIM_MODEL
        }
        
        val cc = Compile.createCompilationContext(view.activeSystem, model)
        
        cc.deactiveDisabledProcessors
        
        val updateObserver = new CompilationUpdate(view)
        cc.addObserver(updateObserver)
        
        cc.compileAsynchronously
    }
    
    protected def void deactiveDisabledProcessors(CompilationContext cc) {
        for (proc : ToggleProcessorOnOffAction.deactivatedProcessors) {
            val unit = cc.processorMap.get(proc)
            if (unit != null) {
                unit.sourceEnvironment.setProperty(Environment.ENABLED, false)
            }
        }
    }
    
    protected def Object getEditorModel() {
        val editor = CompilerView.getActiveEditor
        
        if (editor instanceof XtextEditor) {
            return editor.retrieveModelFromXtextEditor
        }        
    }
    
    static def retrieveModelFromXtextEditor(XtextEditor editor) {
        val doc = editor.getDocument
        var EObject m = doc.readOnly(new IUnitOfWork<EObject, XtextResource>() {
            override exec(XtextResource state) throws Exception {
                state.contents.head
            }
        });   
        return m     
    }
}