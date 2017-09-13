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
package de.cau.cs.kieler.kivis.ui.views

import de.cau.cs.kieler.kivis.ui.KiVisUiModule
import de.cau.cs.kieler.prom.ui.PromUIPlugin
import org.eclipse.jface.action.Action

/** 
 * Toolbar button either as check box or push button, possibly with an image.
 * 
 * @author aas
 *
 */
class KiVisViewToolbarAction extends Action {
    /**
     * The file name of the image
     */
    String imageName
    
    /**
     * Constructor for an action.
     * 
     * @param title The title of the action
     * @param imageName Optional file name for an icon
     * @param style The style of the toolbar button
     */
    new(String title, String imageName, int style) {
        super(title, style)
        this.imageName = imageName
    }
    
    /**
     * Constructor for a check box styled button.
     * 
     * @param title The title of the action
     * @param imageName Optional file name for an icon
     * @param checked Defines if the button is checked initially or not
     */
    new(String title, String imageName, boolean checked) {
        this(title, imageName, AS_CHECK_BOX)
        setChecked(checked)
    }
    
    /**
     * Constructor for a push button.
     * 
     * @param title The title of the action
     * @param imageName Optional file name for an icon
     */
    new(String title, String imageName) {
        this(title, imageName, AS_PUSH_BUTTON)
    }
    
    /**
     * Returns an image descriptor from the correspoding icon in the icons directory.
     */
    override getImageDescriptor() {
        if(imageName == null) {
            return null
        }
        val path = "icons/" + imageName
        return PromUIPlugin.imageDescriptorFromPlugin(KiVisUiModule.PLUGIN_ID, path);
    }
}