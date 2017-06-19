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
package de.cau.cs.kieler.simulation.ui.views

import de.cau.cs.kieler.simulation.ui.SimulationUiPlugin
import org.eclipse.jface.action.Action

/**
 * @author aas
 *
 */
class DataPoolViewToolbarAction extends Action {
    String imageName
    
    new(String title, String imageName) {
        super(title)
        this.imageName = imageName
    }
    
    override getImageDescriptor() {
        if(imageName == null) {
            return null
        }
        val path = "icons/" + imageName
        return SimulationUiPlugin.imageDescriptorFromPlugin(SimulationUiPlugin.PLUGIN_ID, path);
    }
}