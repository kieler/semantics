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
package de.cau.cs.kieler.prom.ui.wizards

/**
 * Implementation of a newWizard which contains a page to create a ftl. 
 * 
 * @author aas
 *
 */
class FreemarkerTemplateFileWizard extends AdvancedNewFileWizard {
    /**
     * {@inheritDoc}
     */
    override protected createFileCreationPage() {
        val filePage = new AdvancedNewFileCreationPage("Freemarker Template", selection, false);
        filePage.initialContentsURL = "platform:/plugin/de.cau.cs.kieler.prom/resources/default.ftl"
        filePage.fileName = "NewTemplate.ftl"
        filePage.fileExtension = "ftl"
        filePage.description = "Create a new FTL file."
        return filePage
    }
    
    /**
     * {@inheritDoc}
     */
    override protected getTitle() {
        return "New Freemarker Template File"
    }
}