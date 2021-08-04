/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2018 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.verification.ui.view

import de.cau.cs.kieler.verification.processors.nuxmv.RunSmvProcessor
import org.eclipse.jface.dialogs.Dialog
import org.eclipse.jface.dialogs.IDialogConstants
import org.eclipse.swt.SWT
import org.eclipse.swt.layout.GridData
import org.eclipse.swt.widgets.Button
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.Label
import org.eclipse.swt.widgets.Shell
import org.eclipse.swt.widgets.Text
import org.eclipse.xtend.lib.annotations.Accessors

/** 
 * @author aas
 */
class EditSmvCommandsDialog extends Dialog {

    @Accessors String ltlValue
    @Accessors String ctlValue
    @Accessors String invarValue

    private Text ltlText
    private Text ctlText
    private Text invarText
    
    private Button okButton
    
    new(Shell parentShell) {
        super(parentShell)

    }

    override createDialogArea(Composite parent) {
        val composite = super.createDialogArea(parent) as Composite
        createMessage(composite)
        
        invarText = createTextField(composite, "Invariants")
        invarText.text = invarValue.nullToEmpty
        
        ltlText = createTextField(composite, "LTL")
        ltlText.text = ltlValue.nullToEmpty
        
        ctlText = createTextField(composite, "CTL")
        ctlText.text = ctlValue.nullToEmpty
        
        applyDialogFont(composite);
        return composite
    }

    private def Text createTextField(Composite parent, String labelText) {
        // Create a label
        val label = new Label(parent, SWT.WRAP);
        label.setText(labelText);
        val gd = new GridData(bitwiseOr(GridData.GRAB_HORIZONTAL, GridData.HORIZONTAL_ALIGN_FILL))
        label.setLayoutData(gd);
        
        // Create the text field
        val text = new Text(parent, bitwiseOr(SWT.MULTI, SWT.BORDER));
        // Add layout to the text field
        val gd2 = new GridData(bitwiseOr(GridData.GRAB_HORIZONTAL, GridData.HORIZONTAL_ALIGN_FILL))
        // The layout does not use the vertical space of its parent somehow, so just set a height explicitly. 
        val rowCount = 5
        gd2.heightHint = convertHeightInCharsToPixels(rowCount);
        text.setLayoutData(gd2)
        return text
    }

    private def Label createMessage(Composite parent) {
        val message =
'''Set custom commands for model checking with NuSMV / nuXmv.
Commands are separated by newline. The 'quit' command is added automatically.
Use «RunSmvProcessor.PROPERTY_NAME_PLACEHOLDER» as placeholder for the property to be checked.
Default commands:
    go
    check_property -P «RunSmvProcessor.PROPERTY_NAME_PLACEHOLDER»'''
        // create message
        val label = new Label(parent, SWT.WRAP);
        label.setText(message);
        val data = new GridData(bitwiseOr(GridData.GRAB_HORIZONTAL,
            GridData.GRAB_VERTICAL,
            GridData.HORIZONTAL_ALIGN_FILL,
            GridData.VERTICAL_ALIGN_CENTER))
        data.widthHint = convertHorizontalDLUsToPixels(IDialogConstants.MINIMUM_MESSAGE_AREA_WIDTH);
        label.setLayoutData(data);
        label.setFont(parent.getFont());
        return label
    }

    override configureShell(Shell shell) {
        super.configureShell(shell);
        // Set the window title
        val title = "Commands for NuSMV / nuXmv"
        shell.setText(title);
    }
    
    private def int bitwiseOr(Integer... ints) {
        var int result = 0
        for(i : ints) {
            result = result.bitwiseOr(i)
        }
        return result
    }
    
    override createButtonsForButtonBar(Composite parent) {
        // create OK and Cancel buttons by default
        okButton = createButton(parent, IDialogConstants.OK_ID,
                IDialogConstants.OK_LABEL, true);
        createButton(parent, IDialogConstants.CANCEL_ID,
                IDialogConstants.CANCEL_LABEL, false);
    }
    
    override getOKButton() {
        return okButton
    }
    
    override buttonPressed(int buttonId) {
        if (buttonId == IDialogConstants.OK_ID) {
            invarValue = invarText.text
            ltlValue = ltlText.text
            ctlValue = ctlText.text
        }
        super.buttonPressed(buttonId);
    }
    
    private def String nullToEmpty(String s) {
        return if(s === null) { "" } else { s }
    }
    
}
