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
package de.cau.cs.kieler.sccharts.targetman


import org.eclipse.core.resources.IFile
import org.eclipse.core.runtime.CoreException
import org.eclipse.jface.dialogs.Dialog
import org.eclipse.swt.SWT
import org.eclipse.swt.layout.GridLayout
import org.eclipse.swt.widgets.Button
import org.eclipse.swt.widgets.Combo
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.Control
import org.eclipse.swt.widgets.Label
import org.eclipse.swt.widgets.Shell

import static de.cau.cs.kieler.sccharts.targetman.PropertyIds.*

/**
 * @author aas
 *
 */
class TargetDialog extends Dialog {
    var IFile sctFile

    

    // ////////////////////////////////////////////////////////////////
    // GUI
    var Button chkCompileOnSave
    var Combo cmbLanguage
    var FileChooser fileChooser
    var FileChooser templateFileChooser

    /**
     * @param parentShell
     */
    new(Shell parentShell, IFile file) {
        super(parentShell)
        this.sctFile = file
    }

    override Control createDialogArea(Composite parent) {
        var composite = super.createDialogArea(parent) as Composite

        var isCompileOnSave = true
        var targetLanguage = "Java"
        var targetPath = sctFile.getLocation() + ".target"
        var templatePath = ""
        
        try {
            var s = ""
            s = sctFile.getPersistentProperty(COMPILE_ON_SAVE_PROPERTY_ID)
            if(s != null)
                isCompileOnSave = Boolean.parseBoolean(s)
            
            s = sctFile.getPersistentProperty(TARGET_LANGUAGE_PROPERTY_ID)
            if(s != null)
                targetLanguage = s
            
            s = sctFile.getPersistentProperty(TARGET_PATH_PROPERTY_ID)
            if(s != null)
                targetPath = s
                
            s = sctFile.getPersistentProperty(TEMPLATE_PATH_PROPERTY_ID)
            if(s != null)
                templatePath = s
        } catch (CoreException e) {
            e.printStackTrace()
        }

        // Compile on save
        chkCompileOnSave = new Button(composite, SWT.CHECK)
        chkCompileOnSave.setText("Compile on saving")
        chkCompileOnSave.setSelection(isCompileOnSave)

        // Layout
        val innerComposite = new Composite(composite, SWT.NONE)
        innerComposite.setLayout(new GridLayout(2, false))

        // Language
        val lblLanguage = new Label(innerComposite, SWT.NONE)
        lblLanguage.setText("Target Language")
        cmbLanguage = new Combo(innerComposite, SWT.NONE)
        
        val languages= #["Java", "C", "Esperanto", "Babel"]
        languages.forEach[cmbLanguage.add(it)]
        val index = cmbLanguage.indexOf(targetLanguage)
        if(index != -1)
            cmbLanguage.select(index)
        else
            cmbLanguage.select(0)        
        
        // Path
        val lblPath = new Label(innerComposite, SWT.NONE)
        lblPath.setText("Output file")
        fileChooser = new FileChooser(innerComposite)
        fileChooser.getTextControl().setText(targetPath)
        
        // Template
        val lblTemplatePath = new Label(innerComposite, SWT.NONE)
        lblTemplatePath.setText("Template file")
        templateFileChooser = new FileChooser(innerComposite)
        templateFileChooser.getTextControl().setText(templatePath)
        
        return composite
    }
    
    override void configureShell(Shell newShell) {
        super.configureShell(newShell);
        newShell.setText("Set SCT Compilation Target");
    }

    override void okPressed() {
        try {
            sctFile.setPersistentProperty(COMPILE_ON_SAVE_PROPERTY_ID,
                    Boolean.toString(chkCompileOnSave.getSelection()));
            sctFile.setPersistentProperty(TARGET_LANGUAGE_PROPERTY_ID, cmbLanguage.getText());
            sctFile.setPersistentProperty(TARGET_PATH_PROPERTY_ID, fileChooser.getText());
            sctFile.setPersistentProperty(TEMPLATE_PATH_PROPERTY_ID, templateFileChooser.getText());
        } catch (CoreException e) {
            e.printStackTrace();
        }
        super.okPressed();
    }
}