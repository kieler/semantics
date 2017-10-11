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

import org.eclipse.xtext.resource.IResourceDescription
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.ui.editor.DirtyStateEditorSupport
import de.cau.cs.kieler.sccharts.text.SCTXResource

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class SCTXDirtyStateEditorSupport extends DirtyStateEditorSupport {
    
    override collectAffectedResources(XtextResource resource, IResourceDescription.Event event) {
        val res = super.collectAffectedResources(resource, event)
        // Do not unload imported resources
        res.removeIf[if (it instanceof SCTXResource) it.imported else false]
        return res
    }
}