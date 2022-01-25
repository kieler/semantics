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
 * File wizard to create a new build configuration.
 * 
 * @author aas
 *
 */
class KiBuildFileWizard extends AdvancedNewFileWizard {
    /**
     * {@inheritDoc}
     */
    override protected createFileCreationPage() {
        val filePage = new KiBuildFileCreationPage("KiBuild File", selection, false);
        filePage.fileName = "NewBuildConfig.kibuild"
        filePage.fileExtension = "kibuild"
        filePage.description = "Create a new build configuration."
        
        return filePage
    }
    
    /**
     * {@inheritDoc}
     */
    override protected getTitle() {
        return "New KiBuild File"
    }
    
}