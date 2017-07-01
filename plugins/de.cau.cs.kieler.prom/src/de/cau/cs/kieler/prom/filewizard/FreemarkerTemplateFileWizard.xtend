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
package de.cau.cs.kieler.prom.filewizard

import org.eclipse.jface.viewers.IStructuredSelection
import org.eclipse.jface.wizard.Wizard
import org.eclipse.ui.INewWizard
import org.eclipse.ui.IWorkbench

/**
 * Implementation of a newWizard which contains a page to create a ftl file with default content. 
 * 
 * @author aas
 *
 */
class FreemarkerTemplateFileWizard extends Wizard implements INewWizard {

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
    private AdvancedNewFileCreationPage filePage
    
    /**
     * Instantiates and adds the sct file creation page to this wizard.
     */
    override addPages(){
        filePage = new AdvancedNewFileCreationPage("Freemarker Template", selection, false);
        filePage.initialContentsURL = "platform:/plugin/de.cau.cs.kieler.prom/resources/default.ftl"
        filePage.fileName = "NewTemplate.ftl"
        filePage.fileExtension = "ftl"
        filePage.description = "Create a new FTL file."
        
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
        
        windowTitle = "New Freemarker Template File"
        helpAvailable = false
    }
}