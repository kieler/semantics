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

    IFile sctFile;

    /**
     * @param parentShell
     */
    protected TargetDialog(Shell parentShell, IFile file) {
        super(parentShell);

        assert file != null;
        this.sctFile = file;
    }

    protected Control createDialogArea(Composite parent) {
        Composite composite = (Composite)super.createDialogArea(parent);
        
        // TODO: init with the real data for the sct file 
        
        // Checkbox
        Button chkCompileOnSave = new Button(composite, SWT.CHECK);
        chkCompileOnSave.setText("Compile on saving");
        chkCompileOnSave.setSelection(true);
        
        // Layout
        Composite innerComposite = new Composite(composite, SWT.NONE);
        innerComposite.setLayout(new GridLayout(2, false));
        
        // Language
        Label lblLanguage = new Label(innerComposite, SWT.NONE);
        lblLanguage.setText("Target Language");
        Combo cmbLanguage = new Combo(innerComposite, SWT.NONE);
        cmbLanguage.add("Java");
        cmbLanguage.add("C");
        cmbLanguage.add("Esperanto");
        cmbLanguage.select(0);
        
        // Path
        Label lblPath = new Label(innerComposite, SWT.NONE);
        lblPath.setText("Output file");
        FileChooser fileChooser = new FileChooser(innerComposite);
        
        String defaultTargetFile= sctFile.getLocation()+".target";
        fileChooser.getTextControl().setText(defaultTargetFile);
        
        return composite;
     }

    protected void configureShell(Shell newShell) {
        super.configureShell(newShell);
        newShell.setText("Set SCT Compilation Target");
    }

    protected void okPressed() {
        System.out.println("OK pressed!");
        super.okPressed();
    }
}
