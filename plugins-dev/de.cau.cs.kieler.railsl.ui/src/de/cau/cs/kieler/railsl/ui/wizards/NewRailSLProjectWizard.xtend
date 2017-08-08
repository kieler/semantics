/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.railsl.ui.wizards

import org.eclipse.jface.wizard.Wizard
import org.eclipse.ui.INewWizard
import org.eclipse.ui.IWorkbench
import org.eclipse.jface.viewers.IStructuredSelection
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage

/**
 * @author stu121235
 *
 */
class NewRailSLProjectWizard extends Wizard implements INewWizard {
    
    private var WizardNewProjectCreationPage page
    
    private val WINDOW_TITLE = "RailSL Project Wizard" 
    private val PAGE_TITLE = "New RailSL Project"
    private val PAGE_DESCRIPTION = "Create a new RailSL project with everything you need."
    
    public new() {
        setWindowTitle(WINDOW_TITLE);
    }
    
    override performFinish() {
        true
    }
    
    override init(IWorkbench workbench, IStructuredSelection selection) {
    }
    
    public override void addPages() {
        super.addPages
 
        page = new WizardNewProjectCreationPage(WINDOW_TITLE);
        page.setTitle(PAGE_TITLE);
        page.setDescription(PAGE_DESCRIPTION);
 
    addPage(page);
}
    
}