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
package de.cau.cs.kieler.sccharts.projectwizard

import de.cau.cs.kieler.sccharts.filewizard.SCTFileCreationPage
import de.cau.cs.kieler.sccharts.launchconfig.common.ui.UIUtil
import org.eclipse.debug.internal.ui.SWTFactory
import org.eclipse.jface.viewers.IStructuredSelection
import org.eclipse.swt.SWT
import org.eclipse.swt.events.SelectionAdapter
import org.eclipse.swt.events.SelectionEvent
import org.eclipse.swt.layout.GridData
import org.eclipse.swt.widgets.Button
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.Label

/**
 * @author aas
 *
 */
class OptionalSCTFileCreationPage extends SCTFileCreationPage{
    
    var Button createFileCheckbox
    
    new(String pageName, IStructuredSelection selection) {
        super(pageName, selection)
    }
    
    public override createControl(Composite parent){
        val comp = UIUtil.createComposite(parent,1)
        super.createControl(comp)
        
        // Horizontal line to separate new controls
        val separator = new Label(comp, SWT.HORIZONTAL.bitwiseOr(SWT.SEPARATOR));
        separator.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        
        // Create checkbox to check if file should be created or not
        createFileCheckbox = SWTFactory.createCheckButton(comp, "Create file", null, false, 1)
        createFileCheckbox.addSelectionListener(new SelectionAdapter(){
            override void widgetSelected(SelectionEvent e) {
                // Check if we are able to finish the dialog
                getWizard().getContainer().updateButtons()
            }
        })
        
        setControl(comp)
        this.parent = parent
    }
    
    override boolean performFinish(){
        if(createFileCheckbox.selection){
            return super.performFinish()
        }
        return true    
    }
    
    override setErrorMessage(String message){
        super.setErrorMessage(message)
        
        // If the error message changes we might be able to finish the dialog.
        getWizard().getContainer().updateButtons()
    }
    
    override boolean isPageComplete(){
        if(!createFileCheckbox.selection)
            return true
        else
            return super.isPageComplete()
    }
}