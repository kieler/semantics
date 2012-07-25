/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2012 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */

package de.cau.cs.kieler.sim.signals.ui;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableItem;

import de.cau.cs.kieler.sim.signals.Signal;

/**
 * The Class SelectInputOutputSignalDialog.
 * 
 * @kieler.rating proposed 2012-08-08 yellow KI-22\
 * 
 * @author cmot
 * 
 */
public class SelectInputOutputSignalDialog extends Dialog {

    /** The Constant MARGIN_WIDTH_AND_HEIGHT. */
    private static final int MARGIN_WIDTH_AND_HEIGHT = 15;

    /** The Constant FORM_WIDTH. */
    private static final int FORM_WIDTH = 400;

    /** The Constant FORM_HEIGHT. */
    private static final int FORM_HEIGHT = 300;

    /** The Constant COLOR_OUTPUT. */
    private static final Color COLOR_OUTPUT = new Color(null, new RGB(0, 0, 0));

    /** The Constant COLOR_INPUT. */
    private static final Color COLOR_INPUT = new Color(null, new RGB(200, 0, 0));

    /** The Constant DIALOG_TITLE. */
    private static final String DIALOG_TITLE = "Select Input Signals";

    /** The temporary table that allows the user to select DataComponents. */
    private Table table;

    /** The list that holds the currently selected input signals. */
    private List<Signal> inputSignalList;

    /** The list that holds the currently selected output signals. */
    private List<Signal> outputSignalList;

    /** The Constant KEYBOARD_DELETE. */
    private static final int KEYBOARD_DELETE = 127;

    // -------------------------------------------------------------------------

    /**
     * Instantiates a dialog.
     * 
     * @param parent
     *            the SWT parent of this dialog
     */
    public SelectInputOutputSignalDialog(final Shell parent) {
        super(parent);
    }

    // -------------------------------------------------------------------------

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.jface.window.Window#configureShell(org.eclipse.swt.widgets.Shell)
     */
    @Override
    protected void configureShell(final Shell newShell) {
        super.configureShell(newShell);
        // set the title of this dialog
        newShell.setText(DIALOG_TITLE);
    }

    // -------------------------------------------------------------------------

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.jface.dialogs.Dialog#createDialogArea(org.eclipse.swt.widgets.Composite)
     */
    @Override
    protected Control createDialogArea(final Composite parent) {
        Composite composite = (Composite) super.createDialogArea(parent);

        GridLayout gridLayout = new GridLayout();
        gridLayout.numColumns = 1;
        composite.setLayout(gridLayout);
        gridLayout.marginHeight = MARGIN_WIDTH_AND_HEIGHT;
        gridLayout.marginWidth = MARGIN_WIDTH_AND_HEIGHT;

        table = new Table(composite, SWT.CHECK | SWT.BORDER | SWT.MULTI);
        table.addSelectionListener(new SelectionListener() {
            public void widgetDefaultSelected(final SelectionEvent e) {
            }

            public void widgetSelected(final SelectionEvent e) {
                updateSelectedList();
                updateTable();
                refreshTextColorsAndItemName();
            }
        });
        table.addKeyListener(new KeyListener() {
            public void keyPressed(final KeyEvent e) {
                // if user pressed delete
                if (e.keyCode == KEYBOARD_DELETE) {
                    // delete selected signals from inputSignalList and outputSignalList
                    List<Signal> selectedSignalList = getSelectedSignalList();
                    for (Signal selectedSignal : selectedSignalList) {
                        if (inputSignalList.contains(selectedSignal)) {
                            inputSignalList.remove(selectedSignal);
                        }
                        if (outputSignalList.contains(selectedSignal)) {
                            outputSignalList.remove(selectedSignal);
                        }
                        table.remove(table.getSelectionIndices());
                    }

                    updateSelectedList();
                    updateTable();
                    refreshTextColorsAndItemName();
                }
            }

            public void keyReleased(final KeyEvent e) {
            }
        });
        table.addMouseListener(new MouseListener() {
            public void mouseDoubleClick(final MouseEvent e) {
                // toggle checked status of selected signal
                TableItem[] tableItems = table.getSelection();
                for (TableItem tableItem : tableItems) {
                    tableItem.setChecked(!tableItem.getChecked());
                }
                updateSelectedList();
                updateTable();
                refreshTextColorsAndItemName();
            }

            public void mouseDown(final MouseEvent e) {
            }

            public void mouseUp(final MouseEvent e) {
                updateSelectedList();
                updateTable();
                refreshTextColorsAndItemName();
            }
        });
        updateTable();

        GridData gridData = new GridData();
        gridData.grabExcessHorizontalSpace = true;
        gridData.grabExcessVerticalSpace = true;
        gridData.horizontalAlignment = GridData.FILL;
        gridData.verticalAlignment = GridData.FILL;
        table.setLayoutData(gridData);

        refreshTextColorsAndItemName();
        return composite;
    }

    // -------------------------------------------------------------------------

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.jface.dialogs.Dialog#getInitialSize()
     */
    @Override
    protected Point getInitialSize() {
        // set the dimensions of the dialog
        return new Point(FORM_WIDTH, FORM_HEIGHT);
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the signal list. The signal list should hold all available signals and is used to update
     * the table. This should be provided by the calling instance.
     * 
     * @param signalList
     *            the new signal list
     */
    public void setSignalList(final List<Signal> signalList) {
        // clear input signal list and fill output signal list by default
        inputSignalList = new LinkedList<Signal>();
        outputSignalList = new LinkedList<Signal>();

        // select signals that start with I or i to be probably input signals
        for (Signal signal : signalList) {
            if (signal.getName().toLowerCase().startsWith("i")) {
                inputSignalList.add(signal);
            } else {
                outputSignalList.add(signal);
            }
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Updates the temporary table from which the user can select or delete signals that he/she
     * wishes to export or select as input signals. The type of the signal (input output) is shown
     * in brackets, and the icon is also personalized for each type of signal.
     * 
     * @param signal
     *            the signal
     * @param isInput
     *            the is input
     */
    private void addToTable(final Signal signal, final boolean isInput) {
        TableItem item = new TableItem(table, SWT.NULL);
        item.setChecked(isInput);
        item.setData(signal);
    }

    private boolean tableContains(final Signal signal) {
        TableItem[] allItems = table.getItems();
        for (int c = 0; c < allItems.length; c++) {
            TableItem tableItem = allItems[c];
            Signal tableSignal = (Signal) tableItem.getData();
            if (tableSignal == signal) {
                return true;
            }
        }
        return false;
    }

    /**
     * Update table.
     */
    private void updateTable() {
        for (Signal signal : inputSignalList) {
            if (!tableContains(signal)) {
                this.addToTable(signal, true);
            }
        } // next signal
        for (Signal signal : outputSignalList) {
            if (!tableContains(signal)) {
                this.addToTable(signal, false);
            }
        } // next signal
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the currently selected signal list.
     * 
     * @return the selected signal list
     */
    private List<Signal> getSelectedSignalList() {
        List<Signal> selectedSignalList = new LinkedList<Signal>();

        TableItem[] allItems = table.getSelection();
        for (int c = 0; c < allItems.length; c++) {
            TableItem tableItem = allItems[c];
            Signal signal = (Signal) tableItem.getData();
            selectedSignalList.add(signal);
        }

        return selectedSignalList;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the currently checked signal list.
     * 
     * @return the checked signal list
     */
    private List<Signal> getCheckedSignalList() {
        List<Signal> selectedSignalList = new LinkedList<Signal>();

        TableItem[] allItems = table.getItems();
        for (int c = 0; c < allItems.length; c++) {
            TableItem tableItem = allItems[c];
            if (tableItem.getChecked()) {
                Signal signal = (Signal) tableItem.getData();
                selectedSignalList.add(signal);
            }
        }

        return selectedSignalList;
    }

    // -------------------------------------------------------------------------

    /**
     * Updates the selected list. This is done immediately when the user selects input signals in
     * the list. The selected lists can be obtained by calling {@link #getInputSignals()} and
     * {@link #getOutputSignals()}.
     */
    private void updateSelectedList() {
        List<Signal> newInputSignalList = getCheckedSignalList();

        for (Signal newInputSignal : newInputSignalList) {
            if (!inputSignalList.contains(newInputSignal)) {
                inputSignalList.add(newInputSignal);
            }
            if (outputSignalList.contains(newInputSignal)) {
                outputSignalList.remove(newInputSignal);
            }
        }

        // go thru inputSignalList and move all signals that are NOT selected (any more) to
        // the outputSignalList
        for (Signal oldInputSignal : inputSignalList) {
            if (!newInputSignalList.contains(oldInputSignal)) {
                outputSignalList.add(oldInputSignal);
            }
        }
        inputSignalList = newInputSignalList;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the selected input signals. This is normally called after the user has selected and
     * chosen signals and already closed the dialog.
     * 
     * @return the selected input signals to be exported
     */
    public List<Signal> getInputSignals() {
        return inputSignalList;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the selected output signals. This is normally called after the user has selected and
     * chosen signals and already closed the dialog.
     * 
     * @return the selected output signals to be exported
     */
    public List<Signal> getOutputSignals() {
        return outputSignalList;
    }

    // -------------------------------------------------------------------------

    /**
     * Refreshes the text colors of the signal selection list.
     */
    public void refreshTextColorsAndItemName() {
        for (int c = 0; c < table.getItemCount(); c++) {
            Signal signal = (Signal) table.getItem(c).getData();
            boolean isInput = inputSignalList.contains(signal);
            // select color
            Color currentColor = COLOR_OUTPUT;
            if (isInput) {
                currentColor = COLOR_INPUT;
            }
            // update text colors
            TableItem tableItem = table.getItem(c);
            tableItem.setForeground(currentColor);

            // set item name
            String type = "output";
            if (isInput) {
                type = "input";
            }
            tableItem.setText(signal.getName() + " (" + type + ")");

            // set icon
            if (isInput) {
                tableItem.setImage(SignalIcons.INPUT_SIGNAL);
            } else {
                tableItem.setImage(SignalIcons.OUTPUT_SIGNAL);
            }

        }
    }

    // -------------------------------------------------------------------------

}
