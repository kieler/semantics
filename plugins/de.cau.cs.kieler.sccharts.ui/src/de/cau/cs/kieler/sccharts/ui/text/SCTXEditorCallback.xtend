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
package de.cau.cs.kieler.sccharts.ui.text

import org.eclipse.xtext.ui.editor.IXtextEditorCallback
import org.eclipse.xtext.ui.editor.XtextEditor
import de.cau.cs.kieler.sccharts.text.SCTXResource
import org.eclipse.xtext.util.concurrent.IUnitOfWork
import org.eclipse.xtext.resource.XtextResource

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class SCTXEditorCallback extends IXtextEditorCallback.NullImpl {
    
    override afterSave(XtextEditor editor) {
        val res = editor.document.readOnly(new IUnitOfWork<XtextResource, XtextResource>() {

            override exec(XtextResource state) throws Exception {
                return state
            }
        })
        
        if (res instanceof SCTXResource) {
            res.updateImporters
        }
    }

}