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
import org.eclipse.jface.viewers.IStructuredSelection
import org.eclipse.jface.wizard.Wizard
import org.eclipse.ui.INewWizard
import org.eclipse.ui.IWorkbench

/**
 * @author aas
 *
 */
class KiSimFileWizard extends Wizard implements INewWizard {

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
        filePage = new AdvancedNewFileCreationPage("KiSim File", selection, false);
        filePage.initialContentsURL = "platform:/plugin/de.cau.cs.kieler.simulation/resources/default.kisim"
        filePage.fileName = "NewSimulation.kisim"
        filePage.fileExtension = "kisim"
        filePage.description = "Create a new simulation configuration."
        
        addPage(filePage);
    }
    
    /**
     * Creates the file with the settings from the wizard page.
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
        
        windowTitle = "New KiSim File"
        helpAvailable = false
    }
}