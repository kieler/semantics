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
package de.cau.cs.kieler.cview.hooks;

import java.util.List;

import de.cau.cs.kieler.cview.model.cViewModel.CViewModel;
import de.cau.cs.kieler.cview.model.cViewModel.Component;
import de.cau.cs.kieler.cview.model.cViewModel.Connection;

/**
 * @author cmot
 *
 */
public interface IExportHook {

    /**
     * Define the name for this export hook.
     * 
     * @return the name
     */
    String getName();

    /**
     * Define an id for this export hook.
     * 
     * @return the name
     */
    String getId();
    
    
    /**
     * Define the file extension for the export dialog.
     * @return
     */
    String getFileExtension();

    /**
     * Export the model or connections to textual output (Model2Text).
     * 
     * @param model
     */
    String export(CViewModel model);

}
