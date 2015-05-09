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
package de.cau.cs.kieler.sccharts.targetman.ui;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

/**
 * @author aas
 *
 */
public class TargetDialog extends Dialog {

    private IFile sctFile;

    // ////////////////////////////////////////////////////////////////
    // Property IDs
    private static QualifiedName COMPILE_ON_SAVE_PROPERTY_ID = new QualifiedName(
            TargetManagementPlugin.PLUGIN_ID, "compileOnSave");
    private static QualifiedName TARGET_LANGUAGE_PROPERTY_ID = new QualifiedName(
            TargetManagementPlugin.PLUGIN_ID, "targetLanguage");
    private static QualifiedName TARGET_PATH_PROPERTY_ID = new QualifiedName(
            TargetManagementPlugin.PLUGIN_ID, "targetPath");

    // ////////////////////////////////////////////////////////////////
    // GUI
    private Button chkCompileOnSave;
    private Combo cmbLanguage;
    private FileChooser fileChooser;

    /**
     * @param parentShell
     */
    protected TargetDialog(Shell parentShell, IFile file) {
        super(parentShell);

        assert file != null;
        this.sctFile = file;
    }

    protected Control createDialogArea(Composite parent) {
        Composite composite = (Composite) super.createDialogArea(parent);

        boolean isCompileOnSave = true;
        String targetLanguage = "Java";
        String targetPath = sctFile.getLocation() + ".target";;

        try {
            String s;
            s = sctFile.getPersistentProperty(COMPILE_ON_SAVE_PROPERTY_ID);
            if(s != null)
                isCompileOnSave = Boolean.parseBoolean(s);
            
            s = sctFile.getPersistentProperty(TARGET_LANGUAGE_PROPERTY_ID);
            if(s != null)
                targetLanguage = s;
            
            s = sctFile.getPersistentProperty(TARGET_PATH_PROPERTY_ID);
            if(s != null)
                targetPath = s;
        } catch (CoreException e) {
            e.printStackTrace();
        }

        // Checkbox
        chkCompileOnSave = new Button(composite, SWT.CHECK);
        chkCompileOnSave.setText("Compile on saving");
        chkCompileOnSave.setSelection(isCompileOnSave);

        // Layout
        Composite innerComposite = new Composite(composite, SWT.NONE);
        innerComposite.setLayout(new GridLayout(2, false));

        // Language
        Label lblLanguage = new Label(innerComposite, SWT.NONE);
        lblLanguage.setText("Target Language");
        cmbLanguage = new Combo(innerComposite, SWT.NONE);
        cmbLanguage.add("Java");
        cmbLanguage.add("C");
        cmbLanguage.add("Esperanto");
        if(targetLanguage.equals("Java")){
            cmbLanguage.select(0);
        } else if(targetLanguage.equals("C")){
            cmbLanguage.select(1);
        } if(targetLanguage.equals("Esperanto")){
            cmbLanguage.select(2);
        } else{
            cmbLanguage.select(0);
        }
        // Path
        Label lblPath = new Label(innerComposite, SWT.NONE);
        lblPath.setText("Output file");
        fileChooser = new FileChooser(innerComposite);
        fileChooser.getTextControl().setText(targetPath);

        return composite;
    }

    protected void configureShell(Shell newShell) {
        super.configureShell(newShell);
        newShell.setText("Set SCT Compilation Target");
    }

    protected void okPressed() {
        try {
            sctFile.setPersistentProperty(COMPILE_ON_SAVE_PROPERTY_ID,
                    Boolean.toString(chkCompileOnSave.getSelection()));
            sctFile.setPersistentProperty(TARGET_LANGUAGE_PROPERTY_ID, cmbLanguage.getText());
            sctFile.setPersistentProperty(TARGET_PATH_PROPERTY_ID, fileChooser.getText());
        } catch (CoreException e) {
            e.printStackTrace();
        }
        super.okPressed();
    }
}
