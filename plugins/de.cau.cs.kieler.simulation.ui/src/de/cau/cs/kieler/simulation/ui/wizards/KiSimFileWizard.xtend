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
package de.cau.cs.kieler.simulation.ui.wizards

import de.cau.cs.kieler.prom.ui.wizards.AdvancedNewFileCreationPage
import de.cau.cs.kieler.prom.ui.wizards.AdvancedNewFileWizard

/**
 * Wizard to create a new simulation configuration.
 * 
 * @author aas
 *
 */
class KiSimFileWizard extends AdvancedNewFileWizard {
    /**
     * {@inheritDoc}
     */
    override protected createFileCreationPage() {
        val filePage = new AdvancedNewFileCreationPage("KiSim File", selection, false);
        filePage.initialContentsURL = "platform:/plugin/de.cau.cs.kieler.simulation/resources/default.kisim"
        filePage.fileName = "NewSimulation.kisim"
        filePage.fileExtension = "kisim"
        filePage.description = "Create a new simulation configuration."
        
        return filePage
    }
    
    /**
     * {@inheritDoc}
     */
    override protected getTitle() {
        "New KiSim File"
    }
    
}