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

import de.cau.cs.kieler.kicool.ui.klighd.KiCoModelViewNotifier
import de.cau.cs.kieler.kicool.ui.synthesis.ProcessorStyles
import de.cau.cs.kieler.klighd.IAction
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.KRendering
import org.eclipse.xtend.lib.annotations.Accessors

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

    extension ProcessorStyles = new ProcessorStyles

    public static val ID = "de.cau.cs.kieler.kicool.ui.synthesis.actions.selectIntermediateAction"
    @Accessors static val SelectedModels = <KRendering>newArrayList

    override execute(ActionContext context) {
        if (SelectAdditionalIntermediateAction.lastContext != context) {
            var IntermediateData intermediateData = null
            var KRendering rendering = null
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
                var node = context.KNode
                while (node.parent !== null) {
                    node = node.parent
                }
                node.eAllContents.filter(KNode).forEach[
                    getProperty(PROCESSOR_INTERMEDIATE_CONTAINER)?.children?.forEach[selected = false]
                ]
                intermediateData.view.editPartSystemManager.intermediateSelection?.clearSelection
                if (rendering !== null) {
                    rendering.selected = true
                }
                KiCoModelViewNotifier.notifyCompilationChanged(intermediateData.compilationContext.inputEditor,
                    intermediateData.model)
                intermediateData.view.editPartSystemManager.intermediateSelection = new IntermediateSelection(
                    intermediateData.processor, intermediateData.intermediateIndex)
            }
            ActionResult.createResult(true).dontZoom
        }
        ActionResult.createResult(false)
    }
}
