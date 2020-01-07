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

import de.cau.cs.kieler.kicool.compilation.CompilationContext
import de.cau.cs.kieler.kicool.compilation.Compile
import de.cau.cs.kieler.kicool.deploy.processor.AbstractSystemCompilerProcessor
import de.cau.cs.kieler.kicool.environments.Environment
import de.cau.cs.kieler.kicool.kitt.tracing.Tracing
import de.cau.cs.kieler.kicool.ui.klighd.ModelReaderUtil
import de.cau.cs.kieler.kicool.ui.synthesis.actions.ToggleProcessorOnOffAction
import de.cau.cs.kieler.kicool.ui.view.CompilerView
import org.eclipse.jface.action.Action
import org.eclipse.jface.action.IAction
import org.eclipse.jface.resource.ImageDescriptor
import org.eclipse.ui.plugin.AbstractUIPlugin
import org.eclipse.xtend.lib.annotations.Accessors

import static extension de.cau.cs.kieler.kicool.ui.view.EditPartSystemManager.*

/**
 * @author ssm
 * @kieler.design 2017-02-19 proposed
 * @kieler.rating 2017-02-19 proposed yellow  
 */
class CompilationAction {

    public static final ImageDescriptor ICON_COMPILE = AbstractUIPlugin.imageDescriptorFromPlugin(
            "de.cau.cs.kieler.kicool.ui", "icons/compile.png");    
    
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
        val editor = view.editPartSystemManager.activeEditor
        var Object model = ModelReaderUtil.readModelFromEditor(editor)
        if (model === null) {
            model = CompilationActionSimSalabim.SIM_MODEL
        }
        
        val system = view.editPartSystemManager.activeSystem
        val cc = Compile.createCompilationContext(system, model)
        cc.inputEditor = editor
        
        if (view.compileInplaceToggle.checked) {
            cc.startEnvironment.setProperty(Environment.INPLACE, true)
        }
        if (view.compileTracingToggle.checked) {
            cc.startEnvironment.setProperty(Tracing.ACTIVE_TRACING, true)
        }
        if (view.debugEnvironmentModelsToggle.checked) {
            cc.startEnvironment.setProperty(Environment.DEBUG_ENVIRONMENT_MODELS, true)
            cc.startEnvironment.setProperty(Environment.DYNAMIC_PROCESSOR_SYSTEM, true)
        }
        if (view.developerToggle.checked) {
            cc.startEnvironment.setProperty(Environment.DEVELOPER_MODE, true)
            cc.startEnvironment.setProperty(AbstractSystemCompilerProcessor.VERBOSE, true)
        }
        cc.stopOnError = !view.developerToggle.checked
        cc.deactiveDisabledProcessors
        
        val updateObserver = new CompilationUpdate(view)
        cc.addObserver(updateObserver)
        
        cc.compileAsynchronously
    }
    
    protected def void deactiveDisabledProcessors(CompilationContext cc) {
        for (proc : ToggleProcessorOnOffAction.deactivatedProcessors.keySet) {
            val unit = cc.processorMap.get(cc.systemMap.entrySet.filter[value == proc].head.key)
            if (unit !== null) {
                val toggle = ToggleProcessorOnOffAction.deactivatedProcessors.get(proc)
                switch(toggle) {
                    case ON: {}
                    case OFF: unit.sourceEnvironment.setProperty(Environment.ENABLED, false)
                    case HALT: unit.environment.setProperty(Environment.CANCEL_COMPILATION, true) 
                }
            }
        }
    }

}