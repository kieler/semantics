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
import de.cau.cs.kieler.cview.DiagramSynthesis;

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
    private static final int FORM_HEIGHT = 260;

    /** The Constant DIALOG_TITLE. */
    private static final String DIALOG_TITLE = "Filter View Model";

    /** The Constant for the keyboard delete key. */
    private static final int KEYBOARD_DELETE = 127;

    public static final int RETURN_VALUE_OK = 0;
    public static final int RETURN_VALUE_CANCEL = 1;

    // -------------------------------------------------------------------------

    public static String valueTextFilter = "";
    public static boolean valueCheckRegExp = false;
    public static boolean valueCheckCaseSensitive = false;
    public static boolean valueCheckChilds = true;
    public static boolean valueCheckNegative = false;
    public static boolean valueCheckTransitions = false;
    public static int valueLayerStart = 0;
    public static int valueLayerEnd = DiagramSynthesis.MAX_EXPANDED_VALUE + 1;

    Label labelFilter;
    Text textFilter;
    Button btnCheckRegExp;
    Button btnCheckCaseSensitive;
    Button btnCheckChilds;
    Button btnCheckNegative;
    Button btnCheckTransitions;
    Spinner spinnerStart;
    Spinner spinnerEnd;

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
            btnCheckRegExp.setSelection(valueCheckRegExp);
            btnCheckCaseSensitive.setSelection(valueCheckCaseSensitive);
            btnCheckChilds.setSelection(valueCheckChilds);
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

    public void updateValues() {
        PlatformUI.getWorkbench().getDisplay().syncExec(new Runnable() {
            public void run() {
                valueCheckRegExp = btnCheckRegExp.getSelection();
                valueCheckCaseSensitive = btnCheckCaseSensitive.getSelection();
                valueCheckChilds = btnCheckChilds.getSelection();
                valueCheckNegative = btnCheckNegative.getSelection();
                valueCheckTransitions = btnCheckTransitions.getSelection();
                valueTextFilter = textFilter.getText();
                valueLayerStart = spinnerStart.getSelection();
                valueLayerEnd = spinnerEnd.getSelection();
            }
        });
    }

    public static void loadValues() {
        valueCheckRegExp = CViewPlugin.getPrefBool("btnCheckRegExp", false);
        valueCheckCaseSensitive = CViewPlugin.getPrefBool("btnCheckCaseSensitive", true);
        valueCheckChilds = CViewPlugin.getPrefBool("btnCheckChilds", true);
        valueCheckNegative = CViewPlugin.getPrefBool("btnCheckNegative", false);
        valueCheckTransitions = CViewPlugin.getPrefBool("btnCheckTransitions", false);
        valueTextFilter = CViewPlugin.getPrefString("textFilter", "");
        valueLayerStart = CViewPlugin.getPrefInt("spinnerStart", 0);
        valueLayerEnd =
                CViewPlugin.getPrefInt("spinnerEnd", DiagramSynthesis.MAX_EXPANDED_VALUE + 1);
    }

    public void save() {
        updateValues();
        CViewPlugin.setPrefBool("btnCheckRegExp", valueCheckRegExp);
        CViewPlugin.setPrefBool("btnCheckCaseSensitive", valueCheckCaseSensitive);
        CViewPlugin.setPrefBool("btnCheckChilds", valueCheckChilds);
        CViewPlugin.setPrefBool("btnCheckNegative", valueCheckNegative);
        CViewPlugin.setPrefBool("btnCheckTransitions", valueCheckTransitions);
        CViewPlugin.setPrefString("textFilter", valueTextFilter);
        CViewPlugin.setPrefInt("spinnerStart", valueLayerStart);
        CViewPlugin.setPrefInt("spinnerEnd", valueLayerEnd);
    }

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
        
        btnCheckCaseSensitive.setEnabled(!valueCheckRegExp);
        btnCheckChilds.setEnabled(!valueCheckTransitions);
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public int open() {
        // Prework
        load();
        int returnValue = super.open();

        if (returnValue == RETURN_VALUE_OK) {
            // Afterwork (widget already disposed here...)
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

        // table = new Table(composite, SWT.CHECK | SWT.BORDER | SWT.MULTI);
        // table.addSelectionListener(new SelectionListener() {
        // public void widgetDefaultSelected(final SelectionEvent e) {
        // }
        //
        // public void widgetSelected(final SelectionEvent e) {
        // // updateSelectedList();
        // updateTable();
        // refreshTextColorsAndItemName();
        // }
        // });
        // table.addKeyListener(new KeyListener() {
        // public void keyPressed(final KeyEvent e) {
        // // if user pressed delete
        // if (e.keyCode == KEYBOARD_DELETE) {
        // // delete selected signals from inputSignalList and outputSignalList
        // List<String> selectedList = getSelectedList();
        // for (String selectedSignal : selectedList) {
        // if (selectedList.contains(selectedSignal)) {
        // selectedList.remove(selectedSignal);
        // }
        // table.remove(table.getSelectionIndices());
        // }
        //
        // // updateSelectedList();
        // updateTable();
        // refreshTextColorsAndItemName();
        // }
        // }
        //
        // public void keyReleased(final KeyEvent e) {
        // }
        // });
        // table.addMouseListener(new MouseListener() {
        // public void mouseDoubleClick(final MouseEvent e) {
        // // toggle checked status of selected signal
        // TableItem[] tableItems = table.getSelection();
        // for (TableItem tableItem : tableItems) {
        // tableItem.setChecked(!tableItem.getChecked());
        // }
        // // updateSelectedList();
        // updateTable();
        // refreshTextColorsAndItemName();
        // }
        //
        // public void mouseDown(final MouseEvent e) {
        // }
        //
        // public void mouseUp(final MouseEvent e) {
        // // updateSelectedList();
        // updateTable();
        // refreshTextColorsAndItemName();
        // }
        // });
        // updateTable();
        //

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
        
        Label labelSpinnerStart = new Label(compositeInner, SWT.LEFT);
        labelSpinnerStart.setText("Apply filter to hierarchy layers ");
        spinnerStart = new Spinner(compositeInner, SWT.WRAP);
        spinnerStart.setBounds(0, 0, 30, 10);
        spinnerStart.setIncrement(1);
        spinnerStart.setDigits(0);
        labelSpinnerStart
                .setToolTipText("Do not filter any elements on a lower layer than specified here.");
        spinnerStart
                .setToolTipText("Do not filter any elements on a lower layer than specified here.");


        Label labelSpinnerEnd = new Label(compositeInner, SWT.LEFT);
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
        labelSpace.setText(".");

        btnCheckRegExp = new Button(compositeInnerChecks, SWT.CHECK);
        btnCheckRegExp.setText("Regular Expression");
        btnCheckRegExp.setToolTipText(
                "Apply a regular expression filter instead of a simple 'contains' filter.");

        btnCheckCaseSensitive = new Button(compositeInnerChecks, SWT.CHECK);
        btnCheckCaseSensitive.setText("Case sensitive");
        btnCheckCaseSensitive.setToolTipText(
                "Apply the filter by considering the case of each character.");

        btnCheckChilds = new Button(compositeInnerChecks, SWT.CHECK);
        btnCheckChilds.setText("Consider childs");
        btnCheckChilds
                .setToolTipText("If any child applies not to the filter, then also show parent.");

        btnCheckNegative = new Button(compositeInnerChecks, SWT.CHECK);
        btnCheckNegative.setText("Inverse filter    ");
        btnCheckNegative.setToolTipText(
                "Hide/filter matching items. Without selecting this option, non-matching items are hidden/filtered.");

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
        btnCheckNegative.addSelectionListener(btnListener);
        btnCheckTransitions.addSelectionListener(btnListener);

        // btnOk = new Button(composite, SWT.OK);
        // btnAbort = new Button(composite, SWT.ABORT);

        // if (optionList != null) {
        // for (int i = 0; i < optionList.length; i++) {
        // final String option = optionList[i];
        // Button btn = new Button(composite, SWT.CHECK);
        // btn.setData(option);
        // boolean preChecked = option.startsWith("X");
        // btn.setText(option.substring(1));
        // btn.setSelection(preChecked);
        // if (preChecked) {
        // optionListSelected.add(option);
        // }
        // btn.addSelectionListener(new SelectionListener() {
        // @Override
        // public void widgetSelected(SelectionEvent event) {
        // Button button = ((Button) event.widget);
        // String btnOption = (String) button.getData();
        // if (button.getSelection()) {
        // optionListSelected.add(btnOption);
        // } else {
        // optionListSelected.remove(btnOption);
        // }
        // }
        //
        // @Override
        // public void widgetDefaultSelected(SelectionEvent e) {
        // // TODO Auto-generated method stub
        //
        // }
        // });
        // }
        // }
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

}
