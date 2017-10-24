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
package de.cau.cs.kieler.simulation.ui.views

import de.cau.cs.kieler.simulation.ui.SimulationUiPlugin
import org.eclipse.jface.action.Action

/**
 * Base class for data pool toolbar actions.
 * Provides a constructor to set an image for the action from the plugin's icon directory.
 * 
 * @author aas
 *
 */
class DataPoolViewToolbarAction extends Action {
    /**
     * The name of the image file that should be used for this action.
     */
    String imageName
    
    /**
     * Constructor
     * 
     * @param title The action's title
     * @param imageName The name of the image file for this action. The file must be in the icon directory.
     */
    new(String title, String imageName) {
        super(title)
        this.imageName = imageName
    }
    
    /**
     * Returns the image from the icon directory if it is set.
     * 
     * {@inheritDoc}
     */
    override getImageDescriptor() {
        if(imageName == null) {
            return null
        }
        val path = "icons/" + imageName
        return SimulationUiPlugin.imageDescriptorFromPlugin(SimulationUiPlugin.PLUGIN_ID, path);
    }
}