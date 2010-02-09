/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */

package de.cau.cs.kieler.sim.kiem.config.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Dialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

/**
 * An abstract dialog that creates a number of text fields with custom labels
 * and Ok/Cancel option.
 * 
 * @author soh
 * @kieler.rating 2010-01-27 proposed yellow
 * 
 * @param <T>
 *            the type of object returned by the open() method
 */
public abstract class AbstractPropertiesDialog<T> extends Dialog {

    /** The offset where the dialog is put relative to the preference page. */
    private static final int OFFSET = 100;

    /** The title of this component. */
    private String title;

    /** The list of labels for the text fields in the dialog. */
    private String[] labels;
    /** the list of tooltips for the text fields. */
    private String[] tooltips;
    /** The list of text fields. same length as labels. */
    private Text[] textFields;
    /** The list of results. same length as labels */
    private String[] results;

    // --------------------------------------------------------------------------

    /**
     * Creates a new AbstractPropertiesDialog.
     * 
     * @param parent
     *            the parent component
     * @param newLabel
     *            a single label
     * @param tooltipParam
     *            a tooltip
     * @param newTitle
     *            the title of the dialog
     */
    public AbstractPropertiesDialog(final Shell parent, final String newLabel,
            final String tooltipParam, final String newTitle) {
        super(parent, SWT.BORDER & SWT.DIALOG_TRIM & SWT.ICON_QUESTION);
        this.labels = new String[1];
        labels[0] = newLabel;
        this.title = newTitle;
        this.tooltips = new String[1];
        tooltips[0] = tooltipParam;
        results = new String[labels.length];
        textFields = new Text[labels.length];
    }

    /**
     * 
     * Creates a new AbstractPropertiesDialog.
     * 
     * @param parent
     *            the parent component
     * @param newLabels
     *            the list of labels for the input fields
     * @param toolTipsParam
     *            the list of tooltip for the input fields has to be same length
     *            as labels or null
     * @param newTitle
     *            the title for the dialog
     */
    public AbstractPropertiesDialog(final Shell parent,
            final String[] newLabels, final String[] toolTipsParam,
            final String newTitle) {
        super(parent, SWT.BORDER | SWT.DIALOG_TRIM | SWT.ICON_QUESTION);
        this.labels = newLabels;
        this.title = newTitle;
        this.tooltips = toolTipsParam;
        results = new String[labels.length];
        textFields = new Text[labels.length];
    }

    // --------------------------------------------------------------------------

    /**
     * Creates the dialog's contents.
     * 
     * @param shell
     *            the dialog window
     */
    private void createContents(final Shell shell) {
        shell.setLayout(new GridLayout(2, true));
        shell.setLayoutData(new GridData(SWT.BEGINNING, SWT.BEGINNING, true,
                true));
        Rectangle parent = shell.getParent().getBounds();
        shell.setBounds(parent.x + OFFSET, parent.y + OFFSET, parent.width / 2,
                parent.height / 2);

        for (int i = 0; i < labels.length; i++) {
            // Show the message
            Label label = new Label(shell, SWT.NONE);
            label.setText(labels[i]);
            GridData data = new GridData();
            data.horizontalSpan = 2;
            label.setLayoutData(data);

            // Display the input box
            Text text = new Text(shell, SWT.BORDER);
            data = new GridData(GridData.FILL_HORIZONTAL);
            data.horizontalSpan = 2;
            text.setLayoutData(data);
            if (tooltips != null) {
                text.setToolTipText(tooltips[i]);
            }
            textFields[i] = text;
        }

        // Create the OK button and add a handler
        // so that pressing it will set input
        // to the entered value
        Button ok = new Button(shell, SWT.PUSH);
        ok.setText("OK");
        GridData data = new GridData(GridData.FILL_HORIZONTAL);
        ok.setLayoutData(data);
        ok.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(final SelectionEvent event) {
                for (int i = 0; i < labels.length; i++) {
                    results[i] = textFields[i].getText();
                }
                shell.close();
            }
        });

        // Create the cancel button and add a handler
        // so that pressing it will set input to null
        Button cancel = new Button(shell, SWT.PUSH);
        cancel.setText("Cancel");
        data = new GridData(GridData.FILL_HORIZONTAL);
        cancel.setLayoutData(data);
        cancel.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(final SelectionEvent event) {
                results = null;
                shell.close();
            }
        });

        // Set the OK button as the default, so
        // user can type input and press Enter
        // to dismiss
        shell.setDefaultButton(ok);
    }

    // --------------------------------------------------------------------------

    /**
     * Opens the dialog and returns the input.
     * 
     * @return The entered input
     */
    public String[] openDialog() {
        // Create the dialog window
        Shell shell = new Shell(getParent(), getStyle());
        shell.setText(title);
        createContents(shell);
        shell.pack();
        shell.open();

        Display display = getParent().getDisplay();
        while (!shell.isDisposed()) {
            if (!display.readAndDispatch()) {
                display.sleep();
            }
        }
        // Return the entered value, or null
        return results;
    }

    /**
     * Open the dialog and return a specific object.
     * 
     * @return some object.
     */
    public abstract T open();
}
