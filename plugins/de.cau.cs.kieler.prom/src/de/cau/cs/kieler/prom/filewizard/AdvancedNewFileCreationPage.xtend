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
package de.cau.cs.kieler.prom.filewizard

import de.cau.cs.kieler.prom.common.PromPlugin
import de.cau.cs.kieler.prom.common.ui.UIUtil
import org.apache.commons.io.FilenameUtils
import org.eclipse.core.resources.IFile
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
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * Implementation of an IWizardPage
 * that contains controls to specify whether and where a file should be created.
 * When created, the file is initialized with the contents of a URL (e.g. a file in the plugin).<br>
 * It is possible to make the file creation optional
 * such that the user can decide if the file should be created or not.<br>
 * 
 * This class also provides a recreate() method which can be used to refresh the resource tree.
 * 
 * @author aas
 */
class AdvancedNewFileCreationPage extends WizardNewFileCreationPage {

    /**
     * A URL to a file which contains initial content for the newly created file.
     */
    @Accessors
    protected String initialContentsURL = ""

    /**
     * A flag that specifies if the created file should be opened with an editor within Eclipse.
     */
    @Accessors
    protected boolean openOnCreation = true

    /**
     * A flag that specifies
     * if this page might be skipped although the input to create a file is not valid.
     */
    @Accessors
    protected boolean fileCreationIsOptional = false

    /**
     * File handle of the file which has been created by this page.
     */
    @Accessors
    protected IFile newFile



    /**
     * The parent composite of the controls of this class.
     * The value is set in createControl(...) and used to recreate the controls using the same parent.
     */
    protected Composite parent

    /**
     * The checkbox to specify if the file should actually be created.
     * The checkbox is only created if file creation is optional.
     */
    protected Button createFileCheckbox
    
    
    
    /**
     * Creates a new instance of this class with the given page name and selection.
     * 
     * @param pageName The title of the page
     * @param selection The selection
     * @param fileCreationIsOptional Specifies
     * if this page might be skipped although the input to create a file is not valid.
     */
    new(String pageName, IStructuredSelection selection, boolean fileCreationIsOptional) {
        super(pageName, selection)
         
        this.fileCreationIsOptional = fileCreationIsOptional
        title = pageName
    }

    /**
     * Creates the controls of this wizard page and sets the reference to the parent composite.
     * 
     * @param parent The parent composite for the controls
     */
    override createControl(Composite parent) {
        this.parent = parent

        if (fileCreationIsOptional) {
            // Create composite to contain contents from super class as well as from this class.
            val comp = UIUtil.createComposite(parent, 1)

            // Create contents of super class
            super.createControl(comp)

            // Horizontal line to separate new controls of this class
            val separator = new Label(comp, SWT.HORIZONTAL.bitwiseOr(SWT.SEPARATOR));
            separator.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

            // Create checkbox to check if file should be created or not
            createFileCheckbox = SWTFactory.createCheckButton(comp, "Create file", null, true, 1)
            createFileCheckbox.addSelectionListener(new SelectionAdapter() {
                override void widgetSelected(SelectionEvent e) {
                    // Update whether page is complete
                    if(fileCreationIsOptional && !createFileCheckbox.selection)
                        pageComplete = true
                    else
                        pageComplete = validatePage()
                }
            })
            createFileCheckbox.toolTipText = "The file is only created if this checkbox is checked."

            // The controls for this wizard is the composite for this class as well as for the super class.
            // Therefore setControl(...) has to be called after super.createControl(...)
            setControl(comp)
        } else {
            super.createControl(parent)
        }
    }

    /**
     * Recreates the controls of this wizard page.
     * This method can be used to refresh all controls, notably the resource tree.
     * Note that user modifications to the old controls are lost when calling this method. 
     */
    public def void recreate() {
        // Remove old
        control.dispose()

        // Create new
        createControl(parent)

        // Update visuals
        parent.layout()
        parent.redraw()
        parent.update()
    }

    /**
     * @return true if the user input is valid.<br />
     *         false otherwise.
     */
    public def boolean isOk() {
        // isOk is basically only a public wrapper for validatePage
        // such that it can be accessed from anywhere. 
        return validatePage()
    }

    /**
     * Creates the file if the input is valid and fills it with the default contents from the url.
     * After creation the file may be opened in an editor.
     * 
     * @return true if the process ended sucessfully. false otherwise.
     */
    public def boolean performFinish() {
        if ((fileCreationIsOptional && createFileCheckbox.selection) || !fileCreationIsOptional) {
            // Create the file if input is valid 
            if (validatePage()) {
                // Create file
                newFile = createNewFile()

                // Open file in editor
                if (openOnCreation)
                    UIUtil.openFileInEditor(newFile)

                return true
            } else {
                return false
            }
        } else {
            // File creation is optional and no file should be created
            // => we are done immediately.
            return true
        }
    }

    /**
     * Sets the error message and updates this wizard's container buttons
     * because the buttons may be enabled/disabled when the error message changes.
     * 
     * @param message The new error message 
     */
    override setErrorMessage(String message){
        super.setErrorMessage(message)
        
        // If the error message changes we might be able to finish the dialog.
        getWizard().getContainer().updateButtons()
    }

    /**
     * Returns an input stream with the initial contents from the initialContentsURL
     * where the ${name} placeholder is replaced with the name of the newly created file.
     * 
     * @return an input stream with initial contents for the new file
     */
    protected override getInitialContents() {
        val fileNameWithoutExtension = FilenameUtils.removeExtension(fileName)
        val placeholderMap = #{"${name}" -> fileNameWithoutExtension}
        return PromPlugin.getInputStream(initialContentsURL, placeholderMap)
    }
}