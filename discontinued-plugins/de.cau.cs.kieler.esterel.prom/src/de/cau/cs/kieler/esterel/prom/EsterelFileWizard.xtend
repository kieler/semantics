/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.esterel.prom

import de.cau.cs.kieler.prom.ui.wizards.AdvancedNewFileCreationPage
import de.cau.cs.kieler.prom.ui.wizards.AdvancedNewFileWizard

/**
 * Implementation of a newWizard which contains a page to create an esterel (strl) file. 
 * 
 * @author aas
 */
class EsterelFileWizard extends AdvancedNewFileWizard {
    /**
     * {@inheritDoc}
     */
    override protected createFileCreationPage() {
        val page = new AdvancedNewFileCreationPage("Esterel Text File", selection, false);
        page.initialContentsURL = "platform:/plugin/de.cau.cs.kieler.esterel.prom/resources/default.strl"
        page.fileName = "NewModel.strl"
        page.fileExtension = "strl"
        page.description = "Create a new Esterel file."
        
        return page
    }
    
    /**
     * {@inheritDoc}
     */
    override protected getTitle() {
        return "New Esterel File"
    }
}