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
import de.cau.cs.kieler.kicool.compilation.CompilationContext
import de.cau.cs.kieler.kicool.compilation.Processor
import de.cau.cs.kieler.kicool.environments.MessageObjectReferences
import de.cau.cs.kieler.kicool.ide.klighd.models.CodePlaceHolder
import de.cau.cs.kieler.kicool.ui.klighd.KiCoModelViewNotifier
import de.cau.cs.kieler.kicool.ui.synthesis.Container
import de.cau.cs.kieler.kicool.ui.view.CompilerView
import de.cau.cs.kieler.klighd.IAction
import de.cau.cs.kieler.klighd.kgraph.KIdentifier
import de.cau.cs.kieler.klighd.kgraph.KNode
import org.eclipse.ui.IEditorPart
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
    
    public static val ID = "de.cau.cs.kieler.kicool.ui.synthesis.actions.selectIntermediateAction"
    
    override execute(ActionContext context) {
        // Since there are sometimes not identifiable knodes in the multi select, we're only looking for
        // nodes with an identifier.
        val selection = context.activeViewer.selection
        val selectedNodes = selection.diagramElementsIterator.toIterable.filter(KNode).
            filter[ !data.filter(KIdentifier).empty ].toList
        
        if (selectedNodes.size < 2) {
            val kNode = context.KNode
            val modelData = new ModelDataFromKNode(kNode)
            
            KiCoModelViewNotifier.notifyCompilationChanged(modelData.editor, modelData.model)
            
            modelData.view.editPartSystemManager.intermediateSelection = 
                new IntermediateSelection(modelData.intermediateData.processor, modelData.intermediateData.intermediateIndex)
        } else {
            val modelDataList = <ModelDataFromKNode> newArrayList
            val models = <Object> newArrayList
            val processorIndexPairs = <Pair<Processor<?,?>,Integer>> newArrayList 
            for (s : selectedNodes) {
                val modelData = new ModelDataFromKNode(s)
                modelDataList += modelData
                models += modelData.model   
                processorIndexPairs += 
                    new Pair<Processor<?,?>, Integer>(modelData.intermediateData.processor, modelData.intermediateData.intermediateIndex)
            }
            KiCoModelViewNotifier.notifyCompilationChangedList(modelDataList.last.editor, models)
            
            modelDataList.last.view.editPartSystemManager.intermediateSelection = 
                new IntermediateSelection(processorIndexPairs)
        }
        
        ActionResult.createResult(false).dontAnimateLayout()
    }
    
    private static class ModelDataFromKNode {
        
        @Accessors var IntermediateData intermediateData
        @Accessors var CompilationContext compilationContext
        @Accessors var IEditorPart editor
        @Accessors var CompilerView view
        @Accessors var Object model
        
        new(KNode kNode) {
            intermediateData = kNode.getProperty(INTERMEDIATE_DATA)
            compilationContext = intermediateData.compilationContext
            editor = compilationContext.inputEditor
            view = intermediateData.view
            model = intermediateData.model
            if (model instanceof String) {
                model = new CodePlaceHolder(editor.title + ".c", model)
            } else if (model instanceof CodeContainer) {
            } else if (model instanceof MessageObjectReferences) {
                if (model.get(null) !== null) {
                    model = new Container<String>(model.get(null).join("\n"))
                }
            }
        }
    }
        
}
