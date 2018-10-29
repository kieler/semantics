/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.kicool.ui.klighd

import de.cau.cs.kieler.klighd.ui.view.controllers.EcoreXtextSaveUpdateController
import de.cau.cs.kieler.klighd.ui.view.controllers.EditorUtil
import org.eclipse.ui.IEditorPart
import org.eclipse.emf.edit.domain.IEditingDomainProvider
import org.eclipse.xtext.ui.editor.XtextEditor
import org.eclipse.ui.editors.text.TextEditor

/**
 * Work around layer to teach the KiCoModelUpdateController about generic TextEditors.
 * The readObject is, hence, an Object instead of an EObject.
 * 
 * @author ssm
 * @kieler.design 2018-10-12 proposed
 * @kieler.rating 2018-10-12 proposed yellow 
 */
class EcoreXtextTextSaveUpdateController extends EcoreXtextSaveUpdateController {

    override void onActivate(IEditorPart editor) {
        updateModel(readObject(editor));
        saveAdapter.activate(editor);
    }

    override void onEditorSaved(IEditorPart editor) {
        if (getDiagramView().isLinkedWithActiveEditor()) {
            updateModel(readObject(editor));
        }
    }

    override void refresh() {
        updateModel(readObject(getEditor()));
    }
    
    protected def Object readObject(IEditorPart editor) {
        if (editor instanceof XtextEditor) { // Get model from XTextEditor
            return EditorUtil.readModelFromXtextEditor(editor as XtextEditor);
        } else if (editor instanceof IEditingDomainProvider) { // Get model from EMF TreeEditor
            return EditorUtil.readModelFromEMFEditor(editor as IEditingDomainProvider);
        } else if (editor instanceof TextEditor) {
            val doc = editor.getDocumentProvider().getDocument(editor.getEditorInput());
            return doc.get();
        } 
        return null;
    }    
    
}