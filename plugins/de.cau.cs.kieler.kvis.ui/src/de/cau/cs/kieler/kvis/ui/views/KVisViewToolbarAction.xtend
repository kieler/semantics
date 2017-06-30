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
package de.cau.cs.kieler.kvis.ui.views

import org.eclipse.jface.action.Action
import de.cau.cs.kieler.kvis.ui.KVisUiModule
import de.cau.cs.kieler.prom.common.PromPlugin

/**
 * @author aas
 *
 */
class KVisViewToolbarAction extends Action {
    String imageName
    
    new(String title, String imageName, int style) {
        super(title, style)
        this.imageName = imageName
    }
    
    new(String title, String imageName, boolean checked) {
        this(title, imageName, AS_CHECK_BOX)
        setChecked(checked)
    }
    
    new(String title, String imageName) {
        this(title, imageName, AS_PUSH_BUTTON)
    }
    
    override getImageDescriptor() {
        if(imageName == null) {
            return null
        }
        val path = "icons/" + imageName
        return PromPlugin.imageDescriptorFromPlugin(KVisUiModule.PLUGIN_ID, path);
    }
}