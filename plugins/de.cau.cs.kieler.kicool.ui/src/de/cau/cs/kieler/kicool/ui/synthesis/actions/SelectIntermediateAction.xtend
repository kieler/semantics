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

import de.cau.cs.kieler.kicool.compilation.CodeContainer
import de.cau.cs.kieler.kicool.environments.MessageObjectReferences
import de.cau.cs.kieler.kicool.ui.klighd.KiCoModelViewNotifier
import de.cau.cs.kieler.kicool.ui.klighd.models.CodePlaceHolder
import de.cau.cs.kieler.kicool.ui.synthesis.Container
import de.cau.cs.kieler.klighd.IAction

import static de.cau.cs.kieler.kicool.ui.synthesis.KNodeProperties.*

import static extension de.cau.cs.kieler.kicool.ui.view.EditPartSystemManager.*

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
        val editor = compilationContext.getRootContext.inputEditor
        val view = intermediateData.view
        var model = intermediateData.model
        if (model instanceof String) {
//            model = new Container<String>(model)
            model = new CodePlaceHolder(editor.title + ".c", model)
        } else if (model instanceof CodeContainer) {
//            model = new CodePlaceHolder(editor.title + ".c", model.head) 
        } else if (model instanceof MessageObjectReferences) {
            model = new Container<String>(model.get(null).join("\n"))
        }
        KiCoModelViewNotifier.notifyCompilationChanged(editor, model)
        view.editPartSystemManager.intermediateSelection = 
            new IntermediateSelection(intermediateData.processor, intermediateData.intermediateIndex)
        
        ActionResult.createResult(false).dontAnimateLayout()
    }
        
}