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

import org.eclipse.jface.viewers.IStructuredSelection
import org.eclipse.jface.wizard.Wizard
import org.eclipse.ui.INewWizard
import org.eclipse.ui.IWorkbench

/**
 * Implementation of a newWizard which contains a page to create a file with default content. 
 * 
 * @author aas
 *
 */
abstract class AdvancedNewFileWizard extends Wizard implements INewWizard {

    /**
     * The workbench from the init(...) method.
     */
    protected var IWorkbench workbench
    
    /**
     * The selection from the init(...) method.
     */
    protected var IStructuredSelection selection
    
    /**
     * The file creation page
     */
    protected AdvancedNewFileCreationPage filePage
    
    /**
     * Returns the page to configure the file to be created.
     * 
     * @return the page that creates the file
     */
    abstract protected def AdvancedNewFileCreationPage createFileCreationPage()
    
    /**
     * The title of the window
     * 
     * @return the title
     */
    abstract protected def String getTitle()
    
    /**
     * Instantiates and adds the file creation page to this wizard.
     */
    override addPages(){
        filePage = createFileCreationPage
        addPage(filePage);
    }
    
    /**
     * Creates the file with the settings from the file creation page.
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
        
        windowTitle = getTitle
        helpAvailable = false
    }
}