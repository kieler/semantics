/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2019 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.kicool.ui.klighd

import de.cau.cs.kieler.klighd.ui.view.controllers.EditorUtil
import org.eclipse.emf.edit.domain.IEditingDomainProvider
import org.eclipse.ui.IEditorPart
import org.eclipse.ui.editors.text.TextEditor
import org.eclipse.xtext.ui.editor.XtextEditor
import de.cau.cs.kieler.kicool.compilation.CodeContainer
import org.eclipse.ui.IFileEditorInput
import de.cau.cs.kieler.core.services.KielerServiceLoader

/**
 * @author als
 */
class ModelReaderUtil {

    static val additionalReaders = KielerServiceLoader.load(IModelReader).toList

    static def Object readModelFromEditor(IEditorPart editor) {
        if (editor instanceof XtextEditor) { // Get model from XTextEditor
            return EditorUtil.readModelFromXtextEditor(editor as XtextEditor)
        } else if (editor instanceof IEditingDomainProvider) { // Get model from EMF TreeEditor
            return EditorUtil.readModelFromEMFEditor(editor as IEditingDomainProvider)
        } else {
            for (reader : additionalReaders) {
                val model = reader.readModel(editor)
                if (model !== null) {
                    return model
                }
            }
        }
    
        if (editor instanceof TextEditor) { // Get text and wrap into code container
            val input = editor.getEditorInput()
            val doc = editor.getDocumentProvider().getDocument(input)
            return new CodeContainer() => [
                if (input instanceof IFileEditorInput) {
                    addProxy(input.file.location.toFile, doc.get())
                } else {
                    add("unkown", doc.get())
                }
            ]
        }
        return null
    }

}
