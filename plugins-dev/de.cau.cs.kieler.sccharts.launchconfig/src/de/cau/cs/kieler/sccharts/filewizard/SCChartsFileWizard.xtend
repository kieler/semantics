/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.filewizard

import org.eclipse.jface.wizard.Wizard
import org.eclipse.ui.IWorkbenchWizard
import org.eclipse.ui.IWorkbench
import org.eclipse.jface.viewers.IStructuredSelection
import org.eclipse.jface.viewers.StructuredSelection

/**
 * @author aas
 *
 */
class SCChartsFileWizard extends Wizard implements IWorkbenchWizard {
    
    private var IWorkbench workbench
    private var IStructuredSelection selection
    
    private SCTFileCreationPage sctPage
    
    override addPages(){
        sctPage = new SCTFileCreationPage("SCChart Text File", selection);
        addPage(sctPage);
    }
    
    override performFinish() {
        return sctPage.performFinish()
    }
    
    override init(IWorkbench workbench, IStructuredSelection selection) {
        this.workbench = workbench
        this.selection = selection
        
        windowTitle = "New SCT File"
        helpAvailable = false
    }
}