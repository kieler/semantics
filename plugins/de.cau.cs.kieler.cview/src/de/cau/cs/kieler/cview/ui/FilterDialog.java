/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2012 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */

package de.cau.cs.kieler.cview.ui;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.resource.impl.BinaryResourceImpl.EObjectOutputStream.Check;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.plugin.AbstractUIPlugin;

import de.cau.cs.kieler.cview.CViewPlugin;
import de.cau.cs.kieler.cview.klighd.DiagramSynthesis;

/**
 * 
 * @author cmot
 * 
 */
public class FilterDialog extends Dialog {

    /** The Constant MARGIN_WIDTH_AND_HEIGHT. */
    private static final int MARGIN_WIDTH_AND_HEIGHT = 15;

    /** The Constant FORM_WIDTH. */
    private static final int FORM_WIDTH = 400;

    /** The Constant FORM_HEIGHT. */
    private static final int FORM_HEIGHT = 300;

    /** The Constant DIALOG_TITLE. */
    private static final String DIALOG_TITLE = "Filter View Model";

    /** The Constant for the keyboard delete key. */
    private static final int KEYBOARD_DELETE = 127;

    public static final int RETURN_VALUE_OK = 0;
    public static final int RETURN_VALUE_CANCEL = 1;

    // -------------------------------------------------------------------------

    public static String valueTextFilter = "";
    public static boolean valueCheckDisabled = false;
    public static boolean valueCheckRegExp = false;
    public static boolean valueCheckCaseSensitive = false;
    public static boolean valueCheckChilds = true;
    public static boolean valueCheckConnected = true;
    public static boolean valueCheckNegative = false;
    public static boolean valueCheckTransitions = false;
    public static int valueLayerStart = 0;
    public static int valueLayerEnd = DiagramSynthesis.MAX_EXPANDED_VALUE + 1;

    Label labelFilter;
    Text textFilter;
    Button btnCheckDisabled;
    Button btnCheckRegExp;
    Button btnCheckCaseSensitive;
    Button btnCheckChilds;
    Button btnCheckConnected;
    Button btnCheckNegative;
    Button btnCheckTransitions;
    Spinner spinnerStart;
    Spinner spinnerEnd;
    Label labelSpinnerStart;
    Label labelSpinnerEnd;

    // -------------------------------------------------------------------------

    /**
     * Instantiates a dialog.
     * 
     * @param parent
     *            the SWT parent of this dialog
     */
    public FilterDialog(final Shell parent) {
        super(parent);
    }

    // -------------------------------------------------------------------------
    @Override
    protected void okPressed() {
        // Afterwork
        save();
        super.okPressed();
    }

    // -------------------------------------------------------------------------

    /**
     * Dispose the colors.
     */
    public void dispose() {
    }

    // -------------------------------------------------------------------------

    public void load() {
        loadValues();
        try {
            btnCheckDisabled.setSelection(valueCheckDisabled);
            btnCheckRegExp.setSelection(valueCheckRegExp);
            btnCheckCaseSensitive.setSelection(valueCheckCaseSensitive);
            btnCheckChilds.setSelection(valueCheckChilds);
            btnCheckConnected.setSelection(valueCheckConnected);
            btnCheckNegative.setSelection(valueCheckNegative);
            btnCheckTransitions.setSelection(valueCheckTransitions);
            textFilter.setText(valueTextFilter);
            spinnerStart.setMinimum(0);
            spinnerStart.setMaximum(DiagramSynthesis.MAX_EXPANDED_VALUE + 1);
            spinnerStart.setSelection(valueLayerStart);
            spinnerEnd.setMinimum(0);
            spinnerEnd.setMaximum(DiagramSynthesis.MAX_EXPANDED_VALUE + 1);
            spinnerEnd.setSelection(valueLayerEnd);
        } catch (Exception e) {
        }
    }

    // -------------------------------------------------------------------------

    public void updateValues() {
        PlatformUI.getWorkbench().getDisplay().syncExec(new Runnable() {
            public void run() {
                valueCheckDisabled = btnCheckDisabled.getSelection();
                valueCheckRegExp = btnCheckRegExp.getSelection();
                valueCheckCaseSensitive = btnCheckCaseSensitive.getSelection();
                valueCheckChilds = btnCheckChilds.getSelection();
                valueCheckConnected = btnCheckConnected.getSelection();
                valueCheckNegative = btnCheckNegative.getSelection();
                valueCheckTransitions = btnCheckTransitions.getSelection();
                valueTextFilter = textFilter.getText();
                valueLayerStart = spinnerStart.getSelection();
                valueLayerEnd = spinnerEnd.getSelection();
            }
        });
    }

    // -------------------------------------------------------------------------

    public static void loadValues() {
        valueCheckDisabled = CViewPlugin.getPrefBool("btnCheckDisabled", false);
        valueCheckRegExp = CViewPlugin.getPrefBool("btnCheckRegExp", false);
        valueCheckCaseSensitive = CViewPlugin.getPrefBool("btnCheckCaseSensitive", true);
        valueCheckChilds = CViewPlugin.getPrefBool("btnCheckChilds", true);
        valueCheckConnected = CViewPlugin.getPrefBool("btnCheckConnected", false);
        valueCheckNegative = CViewPlugin.getPrefBool("btnCheckNegative", false);
        valueCheckTransitions = CViewPlugin.getPrefBool("btnCheckTransitions", false);
        valueTextFilter = CViewPlugin.getPrefString("textFilter", "");
        valueLayerStart = CViewPlugin.getPrefInt("spinnerStart", 0);
        valueLayerEnd =
                CViewPlugin.getPrefInt("spinnerEnd", DiagramSynthesis.MAX_EXPANDED_VALUE + 1);
    }

    // -------------------------------------------------------------------------

    public void save() {
        updateValues();
        CViewPlugin.setPrefBool("btnCheckDisabled", valueCheckDisabled);
        CViewPlugin.setPrefBool("btnCheckRegExp", valueCheckRegExp);
        CViewPlugin.setPrefBool("btnCheckCaseSensitive", valueCheckCaseSensitive);
        CViewPlugin.setPrefBool("btnCheckChilds", valueCheckChilds);
        CViewPlugin.setPrefBool("btnCheckConnected", valueCheckConnected);
        CViewPlugin.setPrefBool("btnCheckNegative", valueCheckNegative);
        CViewPlugin.setPrefBool("btnCheckTransitions", valueCheckTransitions);
        CViewPlugin.setPrefString("textFilter", valueTextFilter);
        CViewPlugin.setPrefInt("spinnerStart", valueLayerStart);
        CViewPlugin.setPrefInt("spinnerEnd", valueLayerEnd);
    }

    // -------------------------------------------------------------------------

    public void updateLabelTitle() {
        String updateText = "Only show ";

        String components = "components";
        if (valueCheckTransitions) {
            components = "transitions";
        }
        updateText += components;

        String dont = "";
        if (valueCheckNegative) {
            dont = "do not ";
        }
        String contain = " that " + dont + "contain the following string";
        if (valueCheckRegExp) {
            contain = " that " + dont + "match the regular expression";
        }
        updateText += contain;
        updateText += ":";

        labelFilter.setText(updateText);

        boolean disabled = btnCheckDisabled.getSelection();
        labelFilter.setEnabled(!disabled);
        textFilter.setEnabled(!disabled);
        btnCheckRegExp.setEnabled(!disabled);
        btnCheckCaseSensitive.setEnabled(!disabled);
        btnCheckChilds.setEnabled(!disabled);
        btnCheckConnected.setEnabled(!disabled);
        btnCheckNegative.setEnabled(!disabled);
        btnCheckTransitions.setEnabled(!disabled);
        spinnerStart.setEnabled(!disabled);
        spinnerEnd.setEnabled(!disabled);
        labelSpinnerStart.setEnabled(!disabled);
        labelSpinnerEnd.setEnabled(!disabled);

        // btnCheckCaseSensitive.setEnabled(!valueCheckRegExp);
        //btnCheckChilds.setEnabled(!valueCheckTransitions);
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public int open() {
        // Pre work
        load();
        int returnValue = super.open();

        if (returnValue == RETURN_VALUE_OK) {
            // Afte rwork (widget already disposed here...)
        }

        dispose();
        return returnValue;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    protected void configureShell(final Shell newShell) {
        super.configureShell(newShell);
        // set the title of this dialog
        newShell.setText(DIALOG_TITLE);
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    protected Control createDialogArea(final Composite parent) {
        Composite composite = (Composite) super.createDialogArea(parent);

        GridLayout gridLayout = new GridLayout();
        gridLayout.numColumns = 1;
        composite.setLayout(gridLayout);
        gridLayout.marginHeight = MARGIN_WIDTH_AND_HEIGHT;
        gridLayout.marginWidth = MARGIN_WIDTH_AND_HEIGHT;

        GridData gridData = new GridData();
        gridData.grabExcessHorizontalSpace = true;
        gridData.grabExcessVerticalSpace = true;
        gridData.horizontalAlignment = GridData.FILL;
        gridData.verticalAlignment = GridData.FILL;
        // table.setLayoutData(gridData);

        GridData gridDataText = new GridData();
        gridDataText.grabExcessHorizontalSpace = true;
        gridDataText.grabExcessVerticalSpace = true;
        gridDataText.horizontalAlignment = GridData.FILL;
        // gridDataText.verticalAlignment = GridData.FILL;

        btnCheckDisabled = new Button(composite, SWT.CHECK);
        btnCheckDisabled.setText("Disabled");
        btnCheckDisabled.setToolTipText(
                "Disable the filter");
        Label labelSpaceDisabled = new Label(composite, SWT.LEFT);
        labelSpaceDisabled.setText(" ");
        
        
        labelFilter = new Label(composite, SWT.LEFT);
        labelFilter.setLayoutData(gridDataText);
        textFilter = new Text(composite, SWT.LEFT);
        textFilter.setBounds(0, 0, FORM_WIDTH, 10);
        textFilter.setLayoutData(gridDataText);

        GridLayout innerLayoutChecks = new GridLayout(2, true);
        Composite compositeInnerChecks = new Composite(composite, SWT.NONE);
        compositeInnerChecks.setLayout(innerLayoutChecks);

        GridLayout innerLayout = new GridLayout(6, false);
        Composite compositeInner = new Composite(composite, SWT.NONE);
        compositeInner.setLayout(innerLayout);

        labelSpinnerStart = new Label(compositeInner, SWT.LEFT);
        labelSpinnerStart.setText("Apply filter between hierarchy layers ");
        spinnerStart = new Spinner(compositeInner, SWT.WRAP);
        spinnerStart.setBounds(0, 0, 30, 10);
        spinnerStart.setIncrement(1);
        spinnerStart.setDigits(0);
        labelSpinnerStart
                .setToolTipText("Do not filter any elements on a lower layer than specified here.");
        spinnerStart
                .setToolTipText("Do not filter any elements on a lower layer than specified here.");

        labelSpinnerEnd = new Label(compositeInner, SWT.LEFT);
        labelSpinnerEnd.setText(" and ");
        spinnerEnd = new Spinner(compositeInner, SWT.WRAP);
        spinnerEnd.setBounds(0, 0, 30, 10);
        spinnerEnd.setIncrement(1);
        spinnerEnd.setDigits(0);
        labelSpinnerEnd.setToolTipText(
                "Do not filter any elements on a deeper layer than specified here.");
        spinnerEnd.setToolTipText(
                "Do not filter any elements on a deeper layer than specified here.");
        // sponnerEnd.setLayout

        Label labelSpace = new Label(compositeInner, SWT.LEFT);
        labelSpace.setText(" ");

        btnCheckRegExp = new Button(compositeInnerChecks, SWT.CHECK);
        btnCheckRegExp.setText("Regular expression");
        btnCheckRegExp.setToolTipText(
                "Apply a regular expression filter instead of a simple 'contains' filter.");

        btnCheckCaseSensitive = new Button(compositeInnerChecks, SWT.CHECK);
        btnCheckCaseSensitive.setText("Case sensitive");
        btnCheckCaseSensitive
                .setToolTipText("Apply the filter by considering the case of each character.");

        btnCheckChilds = new Button(compositeInnerChecks, SWT.CHECK);
        btnCheckChilds.setText("Consider children");
        btnCheckChilds
                .setToolTipText("If any child is allowed by the filter, then also show parent.");

        btnCheckNegative = new Button(compositeInnerChecks, SWT.CHECK);
        btnCheckNegative.setText("Inverse filter    ");
        btnCheckNegative.setToolTipText(
                "Hide/filter matching items. Without selecting this option, non-matching items are hidden/filtered.");

        btnCheckConnected = new Button(compositeInnerChecks, SWT.CHECK);
        btnCheckConnected.setText("Consider connected");
        btnCheckConnected
                .setToolTipText("If any component is allowed by the filter, then also show connected.");


        btnCheckTransitions = new Button(compositeInnerChecks, SWT.CHECK);
        btnCheckTransitions.setText("Apply to transitions");
        btnCheckTransitions.setToolTipText(
                "Apply filter to transitions. Without selecting this option, the filter is applied to components.");

        SelectionListener btnListener = new SelectionListener() {
            @Override
            public void widgetSelected(SelectionEvent event) {
                updateValues();
                updateLabelTitle();
            }

            @Override
            public void widgetDefaultSelected(SelectionEvent e) {
            }
        };
        btnCheckRegExp.addSelectionListener(btnListener);
        btnCheckChilds.addSelectionListener(btnListener);
        btnCheckConnected.addSelectionListener(btnListener);
        btnCheckNegative.addSelectionListener(btnListener);
        btnCheckTransitions.addSelectionListener(btnListener);
        btnCheckDisabled.addSelectionListener(btnListener);

        load();
        updateLabelTitle();

        
        return composite;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    protected Point getInitialSize() {
        // set the dimensions of the dialog
        return new Point(FORM_WIDTH, FORM_HEIGHT);
    }

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------

    static boolean dialogAborted = true;

    public static boolean showDialog() {
        dialogAborted = true;
        Display.getDefault().syncExec(new Runnable() {
            public void run() {
                final Shell shell = Display.getCurrent().getShells()[0];
                shell.setBounds(Display.getCurrent().getBounds());
                // first ask the user to select input signals
                FilterDialog dialog = new FilterDialog(shell);
                dialog.open();
                if (dialog.getReturnCode() == FilterDialog.OK) {
                    dialogAborted = false;
                }
            }
        });
        return !dialogAborted;
    }

    // -------------------------------------------------------------------------
}
