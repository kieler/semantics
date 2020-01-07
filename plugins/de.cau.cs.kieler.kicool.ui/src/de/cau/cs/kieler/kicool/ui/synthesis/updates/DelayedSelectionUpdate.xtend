/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2018 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.kicool.ui.synthesis.updates

import de.cau.cs.kieler.kicool.ui.klighd.KiCoModelViewNotifier
import java.util.List
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.IStatus
import org.eclipse.core.runtime.Status
import org.eclipse.ui.IEditorPart
import org.eclipse.ui.progress.UIJob
import de.cau.cs.kieler.kicool.ui.synthesis.actions.IntermediateData
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.kicool.ui.synthesis.KNodeProperties
import de.cau.cs.kieler.klighd.internal.util.KlighdInternalProperties

import static extension de.cau.cs.kieler.kicool.ui.synthesis.updates.ProcessorDataManager.*
import de.cau.cs.kieler.kicool.ui.synthesis.ProcessorStyles
import de.cau.cs.kieler.kicool.ui.view.CompilerView

/**
 * Class that runs a selection setting in the UI thread after a short delay. 
 * This is necessary, because Klighd will not recognize the user-set selection on newly created intermediate nodes in 
 * the compiler view. 
 * 
 * @author ssm
 * @kieler.design 2018-04-12 proposed 
 * @kieler.rating 2018-04-12 proposed yellow
 * 
 */
class DelayedSelectionUpdate implements Runnable {

    extension ProcessorStyles = new ProcessorStyles
    static val UPDATE_DELAY = 100

    List<IntermediateData> selectedData
    var IEditorPart editor
    var CompilerView view

    new(CompilerView view, List<IntermediateData> selectedData, IEditorPart editor) {
        this.view = view
        this.selectedData = selectedData
        this.editor = editor
    }

    override run() {
        Thread.sleep(UPDATE_DELAY)
        new UIJob("Updating selection...") {
            override IStatus runInUIThread(IProgressMonitor monitor) {
                val selectedNodes = <KNode>newArrayList
                for (intermediate : selectedData) {
                    if (intermediate.parentNode.getProperty(KNodeProperties.INTERMEDIATE_DATA) == selectedData.head) {
                        intermediate.parentNode.containers.forEach [
                            setProperty(KlighdInternalProperties.SELECTED, true)
                        ]
                        selectedNodes += selectedData.head.parentNode
                    } else {
                        intermediate.parentNode.getProperty(KNodeProperties.PROCESSOR_INTERMEDIATE_CONTAINER).children.
                            filter [
                                getProperty(KNodeProperties.INTERMEDIATE_DATA) == intermediate
                            ].head.selected = true
                    }
                }
                view.viewer.resetSelectionToDiagramElements(selectedNodes)
                if (selectedData.size == 1) {
                    KiCoModelViewNotifier.notifyCompilationChanged(editor, selectedData.map[model].head)
                } else {
                    KiCoModelViewNotifier.notifyCompilationChangedList(editor, selectedData.map[model])
                }
                return Status.OK_STATUS;
            }
        }.schedule
    }

}
