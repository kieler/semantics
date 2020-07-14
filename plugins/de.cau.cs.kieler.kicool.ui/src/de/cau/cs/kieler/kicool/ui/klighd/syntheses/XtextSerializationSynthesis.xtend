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
package de.cau.cs.kieler.kicool.ui.klighd.syntheses

import com.google.inject.Inject
import de.cau.cs.kieler.kicool.registration.ModelInformation
import de.cau.cs.kieler.kicool.ui.klighd.models.CodePlaceHolder
import de.cau.cs.kieler.klighd.LightDiagramServices
import de.cau.cs.kieler.klighd.ide.model.MessageModel
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import java.io.ByteArrayOutputStream
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.resource.IResourceServiceProvider
import org.eclipse.xtext.resource.XtextResourceSet

/**
 * Diagram synthesis for Ecore models based on a XText grammar.
 * 
 * @author als
 * @kieler.design 2015-10-13 proposed
 * @kieler.rating 2015-10-13 proposed yellow
 * 
 */
class XtextSerializationSynthesis extends AbstractDiagramSynthesis<EObject> {
    
    @Inject
    IResourceServiceProvider.Registry xtextRegistry;

    // -------------------------------------------------------------------------
    // Constants
    public static val String ID = "de.cau.cs.kieler.kicool.ui.klighd.syntheses.XtextSerializationSynthesis";

    // -------------------------------------------------------------------------
    // Synthesis
    override KNode transform(EObject model) {
        // TODO adapt to kicool
        // btw, kicoUtil.serialize is too unstructured. Redo for this purpose.
        var String serialized = null
        
        if (model.eResource !== null) {
            val outputStream = new ByteArrayOutputStream
            model.eResource?.save(outputStream, emptyMap)
            serialized = outputStream.toString
        } else if (ModelInformation.getResourceExtension(model) !== null){
            val outputStream = new ByteArrayOutputStream
            val ext = ModelInformation.getResourceExtension(model)
            val uri = URI.createURI(#["inmemory:/", model.hashCode, ".", ext].join)
            val provider = xtextRegistry.getResourceServiceProvider(uri)
            val rset = provider.get(XtextResourceSet)
            var res = rset.createResource(uri)
            if (res !== null) {
                res.contents += model
                res.save(outputStream, emptyMap)
                serialized = outputStream.toString
            }
        }
        
        
        if (serialized.nullOrEmpty) {
            return LightDiagramServices::translateModel(
                new MessageModel("Xtext Serialization Synthesis",
                    "No serialization available. Maybe the model is not based on a XText grammar"), usedContext);
        } else {
            var title = "Unknown Resource";
            if (usedContext.sourceWorkbenchPart != null) {
                title = usedContext.sourceWorkbenchPart.title;
            } else if (model.eResource != null && model.eResource.getURI != null) {
                title = model.eResource.getURI.lastSegment;
            }
            val resourceExtension = ModelInformation.getResourceExtension(model);
            var fileExtension = "txt";
            if (resourceExtension !== null) {
                fileExtension = resourceExtension;
            }
            // TODO Cannot open xtext editor because it fails to create a resource for
            // the special StringEditorInput because it has no path
            var String editorID = null;
//            if (resourceExtension !== null) {
//                editorID = resourceExtension.getEditorID();
//            }
            return LightDiagramServices::translateModel(new CodePlaceHolder(title, serialized, editorID, fileExtension),
                usedContext);
        }
    }
}
