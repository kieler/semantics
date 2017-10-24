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
package de.cau.cs.kieler.kivis.ui.wizards

import de.cau.cs.kieler.prom.ui.wizards.AdvancedNewFileCreationPage
import de.cau.cs.kieler.prom.ui.wizards.AdvancedNewFileWizard

/**
 * Implementation of a newWizard which contains a page to create a kivis file with default content. 
 * 
 * @author aas
 *
 */
class KiVisFileWizard extends AdvancedNewFileWizard {
    /**
     * {@inheritDoc}
     */
    override protected createFileCreationPage() {
        val filePage = new AdvancedNewFileCreationPage("KiVis File", selection, false);
        filePage.initialContentsURL = "platform:/plugin/de.cau.cs.kieler.kivis.ui/resources/default.kivis"
        filePage.fileName = "NewVisualization.kivis"
        filePage.fileExtension = "kivis"
        filePage.description = "Create a new KiVis file to configure simulation visualization."
        
        return filePage
    }
    
    /**
     * {@inheritDoc}
     */
    override protected getTitle() {
        return "New KiVis File"
    }
}