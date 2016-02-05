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
package de.cau.cs.kieler.kico.klighd.internal.model

import de.cau.cs.kieler.core.kgraph.KNode
import de.cau.cs.kieler.kico.KiCoPlugin
import de.cau.cs.kieler.kico.internal.KiCoUtil
import de.cau.cs.kieler.klighd.LightDiagramServices
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import de.cau.cs.kieler.klighd.ui.view.model.MessageModel
import org.eclipse.emf.ecore.EObject

/**
 * Diagram synthesis for Ecore models based on a XText grammar.
 * 
 * @author als
 * @kieler.design 2015-10-13 proposed
 * @kieler.rating 2015-10-13 proposed yellow
 * 
 */
class XtextSerializationSynthesis extends AbstractDiagramSynthesis<EObject> {

    // -------------------------------------------------------------------------
    // Constants
    public static val String ID = "de.cau.cs.kieler.kico.klighd.internal.model.XtextSerializationSynthesis";

    // -------------------------------------------------------------------------
    // Synthesis
    override KNode transform(EObject model) {
        val serialized = KiCoUtil.serialize(model, null, false);
        if (serialized.nullOrEmpty) {
            return LightDiagramServices::translateModel(
                new MessageModel("Xtext Serialization Synthesis",
                    "No serialization available. Maybe the model is not based on a XText grammar"), usedContext);
        } else {
            var title = "Unknown Resource";
            if (usedContext.sourceWorkbenchPart != null) {
                title = usedContext.sourceWorkbenchPart.title;
            } else if (model.eResource != null && model.eResource.URI != null) {
                title = model.eResource.URI.lastSegment;
            }
            val resourceExtension = KiCoPlugin.getInstance().getResourceExtension(model);
            var fileExtension = "txt";
            if (resourceExtension != null) {
                fileExtension = resourceExtension.getExtension();
            }
            // TODO Cannot open xtext editor because it fails to create a resource for
            // the special StringEditorInput because it has no path
            var String editorID = null;
            if (resourceExtension != null) {
                editorID = resourceExtension.getEditorID();
            }
            return LightDiagramServices::translateModel(new CodePlaceHolder(title, serialized, editorID, fileExtension),
                usedContext);
        }
    }
}
