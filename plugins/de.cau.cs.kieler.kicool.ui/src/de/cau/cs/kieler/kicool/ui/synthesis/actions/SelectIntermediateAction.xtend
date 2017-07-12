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
import de.cau.cs.kieler.kico.klighd.KiCoModelViewNotifier
import de.cau.cs.kieler.kicool.ui.synthesis.Container
import static extension de.cau.cs.kieler.kicool.ui.synthesis.KNodeProperties.INTERMEDIATE_DATA
import de.cau.cs.kieler.kico.klighd.internal.model.CodePlaceHolder
import de.cau.cs.kieler.kicool.environments.Warnings
import de.cau.cs.kieler.kicool.environments.MessageObjectReferences

/**
 * Class that handles the intermediate model requests.
 * 
 * @author ssm
 * @kieler.design 2017-06-10 proposed 
 * @kieler.rating 2017-06-10 proposed yellow
 *
 */
class SelectIntermediateAction implements IAction {
    
    public static val ID = "de.cau.cs.kieler.kicool.ui.synthesis.actions.selectIntermediateAction"
    
    override execute(ActionContext context) {
        val kNode = context.KNode
        
        val intermediateData = kNode.getProperty(INTERMEDIATE_DATA)
        val compilationContext = intermediateData.compilationContext
        val editor = intermediateData.view.editPartSystemManager.findEditorForSystem(compilationContext.getRootContext.system)
        var model = intermediateData.model
        if (model instanceof String) {
//            model = new Container<String>(model)
            model = new CodePlaceHolder(editor.title + ".c", model)
        } else if (model instanceof MessageObjectReferences) {
            model = new Container<String>(model.join("\n"))
        }
        KiCoModelViewNotifier.notifyCompilationChanged(editor, model)        
        
        ActionResult.createResult(false).dontAnimateLayout()
    }
    
}