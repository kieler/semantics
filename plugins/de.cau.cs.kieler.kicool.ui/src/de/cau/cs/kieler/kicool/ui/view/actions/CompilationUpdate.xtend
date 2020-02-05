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

import de.cau.cs.kieler.kicool.compilation.CodeContainer
import de.cau.cs.kieler.kicool.compilation.observer.AbstractContextNotification
import de.cau.cs.kieler.kicool.compilation.observer.CompilationFinished
import de.cau.cs.kieler.kicool.compilation.observer.CompilationStart
import de.cau.cs.kieler.kicool.compilation.observer.ProcessorFinished
import de.cau.cs.kieler.kicool.compilation.observer.ProcessorProgress
import de.cau.cs.kieler.kicool.compilation.observer.ProcessorStart
import de.cau.cs.kieler.kicool.environments.Environment
import de.cau.cs.kieler.kicool.ui.KiCoolUIObserver
import de.cau.cs.kieler.kicool.ui.klighd.KiCoModelViewNotifier
import de.cau.cs.kieler.kicool.ui.klighd.models.CodePlaceHolder
import de.cau.cs.kieler.kicool.ui.view.CompilerView
import org.eclipse.xtend.lib.annotations.Accessors

import static extension de.cau.cs.kieler.kicool.ui.synthesis.updates.ProcessorDataManager.postUpdateProcessors
import static extension de.cau.cs.kieler.kicool.ui.synthesis.updates.ProcessorDataManager.resetProcessor
import static extension de.cau.cs.kieler.kicool.ui.synthesis.updates.ProcessorDataManager.resetSystem
import static extension de.cau.cs.kieler.kicool.ui.synthesis.updates.ProcessorDataManager.updateProcessor
import static extension de.cau.cs.kieler.kicool.ui.synthesis.updates.ProcessorDataManager.addNewProcessor
import static extension de.cau.cs.kieler.kicool.ui.synthesis.updates.ProcessorDataManager.retrieveIntermediateModel
import static extension de.cau.cs.kieler.kicool.ui.view.EditPartSystemManager.*
import de.cau.cs.kieler.kicool.compilation.observer.CompilationChanged
import de.cau.cs.kieler.kicool.compilation.observer.AbstractProcessorNotification
import de.cau.cs.kieler.kicool.ui.synthesis.updates.ProcessorDataManager
import org.eclipse.swt.widgets.Display

/**
 * @author ssm
 * @kieler.design 2017-02-24 proposed
 * @kieler.rating 2017-02-24 proposed yellow 
 */
class CompilationUpdate extends KiCoolUIObserver {
    
    @Accessors private CompilerView view
    
    new(CompilerView view) {
        this.view = view
    }
    
    override runInUIThread() {
        true
    }
    
    override void update(AbstractContextNotification notification) {
        Display.getDefault().asyncExec(new Runnable() {
            override run() {
                switch notification {
                    ProcessorProgress:
                        notification.updateProcessor(view.viewContext.viewModel, view)
                    ProcessorStart:
                        notification.resetProcessor(view.viewContext.viewModel)
                    ProcessorFinished:
                        notification.updateProcessor(view.viewContext.viewModel, view)
                    CompilationStart:
                        notification.resetSystem(view.viewContext.viewModel, view)
                    CompilationFinished: {
                        CompilationActionSimSalabim.simSalabim(notification)

                        if (view.forwardResultToggle.checked) {
                            val editor = notification.compilationContext.inputEditor
                            var model = notification.environment.getProperty(Environment.MODEL)
                            view.editPartSystemManager.attachCompilationContextToEditorPart(editor,
                                notification.compilationContext)

                            if (model instanceof String) {
                                model = new CodePlaceHolder(editor.title + ".c", model)
                            } else if (model instanceof CodeContainer) {
//                            model = new CodePlaceHolder(editor.title + ".c", model.head)
                            }

                            if (view.editPartSystemManager.intermediateSelection !== null) {
                                ProcessorDataManager.updateSelectedIntermediateModels(view.viewContext.viewModel, view,
                                    view.editPartSystemManager.intermediateSelection, editor)
                            } else {
                                KiCoModelViewNotifier.notifyCompilationChanged(editor, model)
                            }
                        }

                        if (view.visualLayoutFeedbackToggle.checked) {
                            notification.postUpdateProcessors(view.viewContext.viewModel, view)
                        }

                        notification.applyNotifications
                        view.doLayout(false)
                    }
                    CompilationChanged: {
                        notification.addNewProcessor(view.viewContext.viewModel, view)
                        view.doLayout(true)
                        return
                    }
                }
            }
        })
    }
    
    private def void reinitializeSynthesis(CompilationChanged compilationChanged) {
        view.reinitializeDiagram(compilationChanged.system)
    }
    
    private def void applyNotifications(CompilationFinished compilationFinished) {
        if (!compilationFinished.compilationContext.startEnvironment.getProperty(Environment.DYNAMIC_PROCESSOR_SYSTEM)) return;
        for (notification : compilationFinished.compilationContext.notifications) {
            if (notification instanceof AbstractProcessorNotification) {
                notification.update
            }
        }
        
    }
}