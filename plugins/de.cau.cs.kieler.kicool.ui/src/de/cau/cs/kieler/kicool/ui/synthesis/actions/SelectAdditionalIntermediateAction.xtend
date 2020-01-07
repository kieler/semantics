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

import de.cau.cs.kieler.kicool.ui.synthesis.ProcessorStyles
import de.cau.cs.kieler.klighd.IAction
import de.cau.cs.kieler.klighd.krendering.KRendering

import static de.cau.cs.kieler.kicool.ui.synthesis.KNodeProperties.*
import static extension de.cau.cs.kieler.kicool.ui.view.EditPartSystemManager.*
import static extension de.cau.cs.kieler.kicool.ui.synthesis.updates.ProcessorDataManager.*
import de.cau.cs.kieler.kicool.ui.klighd.KiCoModelViewNotifier

/**
 * Class that handles the intermediate model requests.
 * 
 * @author ssm
 * @kieler.design 2017-06-10 proposed 
 * @kieler.rating 2017-06-10 proposed yellow
 * 
 */
class SelectAdditionalIntermediateAction implements IAction {

    extension ProcessorStyles = new ProcessorStyles

    public static var ActionContext lastContext = null

    public static val ID = "de.cau.cs.kieler.kicool.ui.synthesis.actions.selectAdditionalIntermediateAction"

    override execute(ActionContext context) {
        lastContext = context
        var KRendering rendering = null
        var IntermediateData intermediateData = null
        if (context.KRendering !== null) {
            rendering = context.KRendering
            intermediateData = rendering.getProperty(INTERMEDIATE_DATA)
        }
        if (context.KNode !== null && intermediateData === null) {
            val knode = context.KNode
            if (knode.getProperty(PROCESSOR_INTERMEDIATE_CONTAINER) !== null) {
                rendering = knode.getProperty(PROCESSOR_INTERMEDIATE_CONTAINER).children.head
                intermediateData = rendering?.getProperty(INTERMEDIATE_DATA)
            }
            if (intermediateData === null) {
                rendering = null
                intermediateData = knode.getProperty(INTERMEDIATE_DATA)
            }
        }
        if (intermediateData !== null) {
            if (rendering !== null) {
                rendering.selected = intermediateData.view.editPartSystemManager.intermediateSelection === null ||
                    !intermediateData.view.editPartSystemManager.intermediateSelection.isSelected(
                        intermediateData.processor, intermediateData.intermediateIndex)
            }
            if (intermediateData.view.editPartSystemManager.intermediateSelection === null) {
                intermediateData.view.editPartSystemManager.intermediateSelection = new IntermediateSelection(
                    intermediateData.processor, intermediateData.intermediateIndex)
            } else {
                intermediateData.view.editPartSystemManager.intermediateSelection.toggleSelection(
                    intermediateData.processor, intermediateData.intermediateIndex)
            }
            var node = context.KNode
            while(node.parent !== null){
                node = node.parent
            }
            node.updateSelectedIntermediateModels(intermediateData.view,
                intermediateData.view.editPartSystemManager.intermediateSelection,
                intermediateData.compilationContext.inputEditor)
        }
        ActionResult.createResult(true).dontZoom
    }
}
