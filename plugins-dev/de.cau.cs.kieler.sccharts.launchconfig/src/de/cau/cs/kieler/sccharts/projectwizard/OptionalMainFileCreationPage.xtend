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
import org.eclipse.ui.dialogs.WizardNewFileCreationPage

/**
 * A WizardPage with controls to specify a file to be created
 * and a checkbox to specify if the file should actually be created. 
 * 
 * @author aas
 *
 */
class OptionalMainFileCreationPage extends WizardNewFileCreationPage{

    /**
     * The parent composite of the controls of this class.
     * The value is set in createControl(...) and used to recreate the controls using the same parent.
     */
    private var Composite parent
    
    /**
     * The checkbox to specify if the file should actually be created.
     */
    private var Button createFileCheckbox
    
    
    
    new(String pageName, IStructuredSelection selection) {
        super(pageName, selection)
        
        title = pageName
        fileName = "Main"
        description = "Set the main file of the project to be created and initialized."
    }
    
    /**
     * Creates the controls of this wizard page and sets the reference to the parent composite.
     */
    public override createControl(Composite parent){
        val comp = UIUtil.createComposite(parent, 1)
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
    
    /**
     * Recreates the controls of this wizard page.
     * This method can be used to refresh the resource tree.
     * Note that user modifications to the old controls are lost when calling this method. 
     */
    public def recreate(){
        control.dispose()
        
        createControl(parent)
        
        parent.layout()
        parent.redraw()
        parent.update()
    }
    
    /**
     * @return true if the user input is valid.<br />
     *         false otherwise.
     */
    public def boolean isOk(){
        return validatePage()
    }
    
    /**
     * Creates the file if the input is valid and the file should actually be created.
     * After creation the file is opened in an editor.
     */
    public def boolean performFinish(){
        if(createFileCheckbox.selection){
            val createdFile = createNewFile()
            UIUtil.openFileInEditor(createdFile)
        }
        return true
    }
    
    /**
     * Creates the file if it should acutally be created.
     * @return the created file or null if it was not created.
     */
    public override createNewFile(){
        if(createFileCheckbox.selection)
            return super.createNewFile()
        else
            return null
    }
    
    /**
     * Sets the error message and updates this wizard's container buttons
     * because the buttons may be enabled/disabled when the error message changes. 
     */
    override setErrorMessage(String message){
        super.setErrorMessage(message)
        
        // If the error message changes we might be able to finish the dialog.
        getWizard().getContainer().updateButtons()
    }
    
    /**
     * @return true if the file should not be created<br />
     *         or it should be created and the other input is valid.<br />
     *         false otherwise.
     */
    override boolean isPageComplete(){
        if(!createFileCheckbox.selection)
            return true
        else
            return super.isPageComplete()
    }
}