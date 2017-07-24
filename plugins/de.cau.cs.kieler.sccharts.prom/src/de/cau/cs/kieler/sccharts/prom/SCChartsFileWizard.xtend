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

import de.cau.cs.kieler.prom.filewizard.AdvancedNewFileCreationPage
import org.eclipse.jface.viewers.IStructuredSelection
import org.eclipse.jface.wizard.Wizard
import org.eclipse.ui.INewWizard
import org.eclipse.ui.IWorkbench

/**
 * Implementation of a newWizard which contains a page to create an sct file. 
 * 
 * @author aas
 */
class SCChartsFileWizard extends Wizard implements INewWizard {

    /**
     * The workbench from the init(...) method.
     */
    private var IWorkbench workbench
    
    /**
     * The selection from the init(...) method.
     */
    private var IStructuredSelection selection
    
    /**
     * Page to create an sct file.
     */
    private AdvancedNewFileCreationPage sctPage
    
    /**
     * Instantiates and adds the sct file creation page to this wizard.
     */
    override addPages(){
        sctPage = new AdvancedNewFileCreationPage("SCChart Text File", selection, false);
        sctPage.initialContentsURL = "platform:/plugin/de.cau.cs.kieler.sccharts.prom/resources/default.sct"
        sctPage.fileName = "NewModel.sct"
        sctPage.fileExtension = "sct"
        sctPage.description = "Create a new SCT file."
        
        addPage(sctPage);
    }
    
    /**
     * Creates the sct file with the settings from the sct file creation page.
     * The method is called when the finish button is clicked.
     */
    override performFinish() {
        return sctPage.performFinish()
    }
    
    /**
     * {@inheritDoc}
     */
    override init(IWorkbench workbench, IStructuredSelection selection) {
        this.workbench = workbench
        this.selection = selection
        
        windowTitle = "New SCT File"
        helpAvailable = false
    }
}