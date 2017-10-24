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
package de.cau.cs.kieler.sccharts.prom

import de.cau.cs.kieler.prom.ui.wizards.AdvancedNewFileCreationPage
import de.cau.cs.kieler.prom.ui.wizards.AdvancedNewFileWizard

/**
 * Implementation of a newWizard which contains a page to create an sctx file. 
 * 
 * @author aas
 */
class SctxFileWizard extends AdvancedNewFileWizard {
    /**
     * {@inheritDoc}
     */
    override protected createFileCreationPage() {
        val filePage = new AdvancedNewFileCreationPage("SCChart Text File", selection, false);
        filePage.initialContentsURL = "platform:/plugin/de.cau.cs.kieler.sccharts.prom/resources/default.sctx"
        filePage.fileName = "NewModel.sctx"
        filePage.fileExtension = "sctx"
        filePage.description = "Create a new SCTX file."
        return filePage
    }
    
    /**
     * {@inheritDoc}
     */
    override protected getTitle() {
        return "New SCTX File"
    }
}