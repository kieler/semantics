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
package de.cau.cs.kieler.kicool.ui.synthesis.actions

import de.cau.cs.kieler.klighd.IAction
import de.cau.cs.kieler.klighd.IAction.ActionContext
import de.cau.cs.kieler.klighd.IAction.ActionResult
import de.cau.cs.kieler.kicool.ui.synthesis.ProcessorDataManager
import de.cau.cs.kieler.kico.klighd.KiCoModelViewNotifier
import de.cau.cs.kieler.kicool.ui.synthesis.Container
import static extension de.cau.cs.kieler.kicool.ui.synthesis.ProcessorDataManager.getId
import de.cau.cs.kieler.kicool.compilation.internal.EnvironmentManager

/**
 * @author ssm
 * @kieler.design 2017-06-10 proposed 
 * @kieler.rating 2017-06-10 proposed yellow
 *
 */
class SelectIntermediateAction implements IAction {
    
    public static val ID = "de.cau.cs.kieler.kicool.ui.synthesis.actions.selectIntermediateAction"
    
    override execute(ActionContext context) {
        val kNode = context.KNode
        val processor = ProcessorDataManager.getProcessorFromKNode(kNode)
        if (processor != null) {
            val view = ProcessorDataManager.getViewFromProcessor(processor)
            if (view != null) {
                val compilationContext = processor.environment.compilationContext
                val editor = view.editPartSystemManager.findEditorForSystem(compilationContext.system)
                                
                var model = processor.environment.model
                if (kNode.getId.equals("sourcebody")) {
                    model = processor.environment.getData(EnvironmentManager.ENVIRONMENT_SOURCEMODEL, null)    
                }
                if (model instanceof String) {
                    model = new Container<String>(model)
                }
                KiCoModelViewNotifier.notifyCompilationChanged(editor, model)
            }     
        }   
        
        ActionResult.createResult(true).dontAnimateLayout()
    }
    
}