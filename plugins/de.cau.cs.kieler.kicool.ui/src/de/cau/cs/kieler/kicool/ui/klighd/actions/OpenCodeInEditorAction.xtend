/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kicool.ui.klighd.actions

import org.eclipse.ui.IStorageEditorInput
import org.eclipse.ui.IWorkbenchPage
import org.eclipse.ui.IWorkbenchWindow
import org.eclipse.ui.PartInitException
import de.cau.cs.kieler.kicool.ui.klighd.editor.StringBasedEditorInput
import de.cau.cs.kieler.kicool.ui.klighd.models.CodePlaceHolder
import de.cau.cs.kieler.klighd.IAction
import org.eclipse.ui.IFileEditorInput

/** 
 * Action to open a Editor containing content of {@link CodePlaceHolder}.
 * @author als
 * @kieler.design 2014-07-30 proposed
 * @kieler.rating 2014-07-30 proposed yellow
 */
class OpenCodeInEditorAction implements IAction {
    /** 
     * The action ID. 
     */
    public static final String ID = "de.cau.cs.kieler.kicool.ui.klighd.internal.model.action.OpenCodeInEditorAction"

    /** 
     * {@inheritDoc}
     */
    override ActionResult execute(ActionContext context) {
        val Object inputModel = context.getViewContext().getInputModel()
        // get placeholder model
        val CodePlaceHolder codeModel = if (inputModel instanceof CodePlaceHolder) {
            inputModel as CodePlaceHolder
        } else if (context.getKNode() !== null) {
            // if input model is not CodePlaceHolder check if clicked node is associated with it
            var Object domainElement = context.getDomainElement(context.getKNode())
            if (domainElement instanceof CodePlaceHolder) {
                domainElement as CodePlaceHolder
            }
        }
        // open editor
        if (codeModel !== null) {
            // get window for opening editor
            val IWorkbenchWindow window = context.getViewContext().getDiagramWorkbenchPart().getSite().getWorkbenchWindow()
            val IWorkbenchPage page = window.getActivePage()
            var alreadyOpen = false
            if (codeModel.codeFile?.proxy) {
                val editor = page.editors.findFirst[
                    val input = editorInput
                    if (input instanceof IFileEditorInput) {
                        val file = input.file?.location?.toFile
                        return codeModel.codeFile.underlyingFile.equals(file)
                    }
                    return false
                ]
                if (editor !== null) {
                    page.bringToTop(editor)
                    alreadyOpen = true
                }
            }
            
            if (!alreadyOpen) {
                // Create editor input based on string.
                // Currently it is better to set this read only because if normal save is used instead
                // of save as saving has no effect
                val IStorageEditorInput input = new StringBasedEditorInput(codeModel.getName(), "Generated Code",
                    codeModel.getCode(), true, codeModel.getResourceExtension())
                // open editor
                if (page !== null) {
                    try {
                        page.openEditor(input, codeModel.getEditorID())
                    } catch (PartInitException e) {
                        e.printStackTrace()
                    }
    
                }
            }
        }
        return ActionResult.createResult(false)
    }
}
