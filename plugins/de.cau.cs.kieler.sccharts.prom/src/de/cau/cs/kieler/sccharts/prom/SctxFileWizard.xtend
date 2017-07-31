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
import org.eclipse.jface.viewers.IStructuredSelection
import org.eclipse.jface.wizard.Wizard
import org.eclipse.ui.INewWizard
import org.eclipse.ui.IWorkbench

/**
 * Implementation of a newWizard which contains a page to create an sctx file. 
 * 
 * @author aas
 */
class SctxFileWizard extends Wizard implements INewWizard {

    /**
     * The workbench from the init(...) method.
     */
    private var IWorkbench workbench
    
    /**
     * The selection from the init(...) method.
     */
    private var IStructuredSelection selection
    
    /**
     * Page to create a file.
     */
    private AdvancedNewFileCreationPage filePage
    
    /**
     * Instantiates and adds the file creation page to this wizard.
     */
    override addPages(){
        filePage = new AdvancedNewFileCreationPage("SCChart Text File", selection, false);
        filePage.initialContentsURL = "platform:/plugin/de.cau.cs.kieler.sccharts.prom/resources/default.sctx"
        filePage.fileName = "NewModel.sctx"
        filePage.fileExtension = "sctx"
        filePage.description = "Create a new SCTX file."
        
        addPage(filePage);
    }
    
    /**
     * Creates the file with the settings from the file creation page.
     * The method is called when the finish button is clicked.
     */
    override performFinish() {
        return filePage.performFinish()
    }
    
    /**
     * {@inheritDoc}
     */
    override init(IWorkbench workbench, IStructuredSelection selection) {
        this.workbench = workbench
        this.selection = selection
        
        windowTitle = "New SCTX File"
        helpAvailable = false
    }
}