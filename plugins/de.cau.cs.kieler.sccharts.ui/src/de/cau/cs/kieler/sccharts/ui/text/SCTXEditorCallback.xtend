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

import com.google.inject.Inject
import com.google.inject.Injector
import de.cau.cs.kieler.sccharts.text.SCTXResource
import org.eclipse.core.resources.IFile
import org.eclipse.core.runtime.NullProgressMonitor
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.ui.editor.XtextEditor
import org.eclipse.xtext.ui.editor.validation.ValidatingEditorCallback
import org.eclipse.xtext.ui.validation.IResourceUIValidatorExtension
import org.eclipse.xtext.util.concurrent.IUnitOfWork
import org.eclipse.xtext.validation.CheckMode

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class SCTXEditorCallback extends ValidatingEditorCallback {
    
    @Inject var Injector injector
    
    override afterSave(XtextEditor editor) {
        // Get resource
        val resource = editor.document.readOnly(new IUnitOfWork<XtextResource, XtextResource>() {

            override exec(XtextResource state) throws Exception {
                return state
            }
        })
        
        // Update imports
        if (resource instanceof SCTXResource) {
            resource.reloadImporters
        }
        
        // Validate
        super.afterSave(editor)
        
        // Display error marker on file
        if (editor.resource !== null && injector !== null) {
            val iResource = editor.resource
            val updater = injector.getInstance(IResourceUIValidatorExtension)
            if (iResource instanceof IFile && updater !== null) {
                updater.updateValidationMarkers(iResource as IFile, resource, CheckMode.ALL, new NullProgressMonitor)
            }
        }
    }

}