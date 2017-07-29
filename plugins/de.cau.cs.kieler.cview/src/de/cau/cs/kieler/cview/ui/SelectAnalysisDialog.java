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

import java.util.ArrayList;
import java.util.List;

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
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.ui.plugin.AbstractUIPlugin;

import de.cau.cs.kieler.cview.CViewPlugin;

/**
 * 
 * @author cmot
 * 
 */
public class SelectAnalysisDialog extends Dialog {

    /** The Constant MARGIN_WIDTH_AND_HEIGHT. */
    private static final int MARGIN_WIDTH_AND_HEIGHT = 15;

    /** The Constant FORM_WIDTH. */
    private static final int FORM_WIDTH = 400;

    /** The Constant FORM_HEIGHT. */
    private static final int FORM_HEIGHT = 300;

    private static final String PLUGIN_GIF = "icon/plugin.gif";

    /** The Constant Image/ImageDescriptor INPUT_SIGNAL. */
    private Image pluginIcon;

    /** The Constant DIALOG_TITLE. */
    private static final String DIALOG_TITLE = "Select Analysis";

    /** The temporary table that allows the user to select DataComponents. */
    private Table table;

    public static String[] optionList = null;

    public static List<String> optionListSelected = new ArrayList<String>();

    /** The list that holds the currently selected item list. */
    public static List<String> itemListSelected = new ArrayList<String>();

    /** The list that holds the list of all items. */
    public static List<String> itemListAll = new ArrayList<String>();

    /** The Constant for the keyboard delete key. */
    private static final int KEYBOARD_DELETE = 127;

    public static final int RETURN_VALUE_OK = 0;
    public static final int RETURN_VALUE_CANCEL = 1;

    // -------------------------------------------------------------------------

    /**
     * Instantiates a dialog.
     * 
     * @param parent
     *            the SWT parent of this dialog
     */
    public SelectAnalysisDialog(final Shell parent) {
        super(parent);
        pluginIcon = AbstractUIPlugin.imageDescriptorFromPlugin(CViewPlugin.PLUGIN_ID, PLUGIN_GIF)
                .createImage();
    }

    // -------------------------------------------------------------------------

    /**
     * Dispose the colors.
     */
    public void dispose() {
        pluginIcon.dispose();
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public int open() {
        // Make a copy
        optionListSelected.clear();

        int returnValue = super.open();

        if (returnValue != RETURN_VALUE_OK) {
            itemListSelected.clear();
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

        table = new Table(composite, SWT.CHECK | SWT.BORDER | SWT.MULTI);
        table.addSelectionListener(new SelectionListener() {
            public void widgetDefaultSelected(final SelectionEvent e) {
            }

            public void widgetSelected(final SelectionEvent e) {
                // updateSelectedList();
                updateTable();
                refreshTextColorsAndItemName();
            }
        });
        table.addKeyListener(new KeyListener() {
            public void keyPressed(final KeyEvent e) {
                // if user pressed delete
                if (e.keyCode == KEYBOARD_DELETE) {
                    // delete selected signals from inputSignalList and outputSignalList
                    List<String> selectedList = getSelectedList();
                    for (String selectedSignal : selectedList) {
                        if (selectedList.contains(selectedSignal)) {
                            selectedList.remove(selectedSignal);
                        }
                        table.remove(table.getSelectionIndices());
                    }

                    // updateSelectedList();
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
                // updateSelectedList();
                updateTable();
                refreshTextColorsAndItemName();
            }

            public void mouseDown(final MouseEvent e) {
            }

            public void mouseUp(final MouseEvent e) {
                // updateSelectedList();
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

        if (optionList != null) {
            for (int i = 0; i < optionList.length; i++) {
                final String option = optionList[i];
                Button btn = new Button(composite, SWT.CHECK);
                btn.setData(option);
                boolean preChecked = option.startsWith("X");
                btn.setText(option.substring(1));
                btn.setSelection(preChecked);
                if (preChecked) {
                    optionListSelected.add(option);
                }
                btn.addSelectionListener(new SelectionListener() {
                    @Override
                    public void widgetSelected(SelectionEvent event) {
                        Button button = ((Button) event.widget);
                        String btnOption = (String) button.getData();
                        if (button.getSelection()) {
                            optionListSelected.add(btnOption);
                        } else {
                            optionListSelected.remove(btnOption);
                        }
                    }

                    @Override
                    public void widgetDefaultSelected(SelectionEvent e) {
                        // TODO Auto-generated method stub

                    }
                });
            }
        }

        refreshTextColorsAndItemName();
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

    /**
     * Updates the temporary table.
     * 
     * @param signal
     *            the signal
     * @param isInput
     *            the is input
     */
    private void addToTable(final String item, final boolean isChecked) {
        TableItem tableItem = new TableItem(table, SWT.NULL);
        tableItem.setChecked(isChecked);
        tableItem.setData(item);
    }

    // -------------------------------------------------------------------------

    /**
     * Test if the item is already contained in the table.
     * 
     * @param signal
     *            the signal
     * @return true, if successful
     */
    private boolean tableContains(final String item) {
        TableItem[] allItems = table.getItems();
        for (int c = 0; c < allItems.length; c++) {
            TableItem tableItem = allItems[c];
            String tableItemString = (String) tableItem.getData();
            if (tableItemString == item) {
                return true;
            }
        }
        return false;
    }

    // -------------------------------------------------------------------------

    /**
     * Update table.
     */
    private void updateTable() {
        for (String item : itemListAll) {
            if (!tableContains(item)) {
                this.addToTable(item, (itemListSelected.contains(item)));
            }
        }
        itemListSelected = getCheckedList();
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the currently selected list.
     * 
     * @return the selected list
     */
    private List<String> getSelectedList() {
        List<String> selectedList = new ArrayList<String>();

        TableItem[] allItems = table.getSelection();
        for (int c = 0; c < allItems.length; c++) {
            TableItem tableItem = allItems[c];
            String item = (String) tableItem.getData();
            selectedList.add(item);
        }

        return selectedList;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the currently checked list.
     * 
     * @return the checked list
     */
    private List<String> getCheckedList() {
        List<String> selectedList = new ArrayList<String>();

        TableItem[] allItems = table.getItems();
        for (int c = 0; c < allItems.length; c++) {
            TableItem tableItem = allItems[c];
            if (tableItem.getChecked()) {
                String item = (String) tableItem.getData();
                selectedList.add(item);
            }
        }

        return selectedList;
    }

    // -------------------------------------------------------------------------

    /**
     * Refreshes the text colors of the signal selection list.
     */
    public void refreshTextColorsAndItemName() {
        for (int c = 0; c < table.getItemCount(); c++) {
            String item = (String) table.getItem(c).getData();
            // update text colors
            TableItem tableItem = table.getItem(c);

            tableItem.setText(item);

            // set icon
            tableItem.setImage(pluginIcon);
        }
    }

    // -------------------------------------------------------------------------

    static boolean dialogAborted = true;

    public static boolean showDialog() {
        dialogAborted = true;
        Display.getDefault().syncExec(new Runnable() {
            public void run() {
                final Shell shell = Display.getCurrent().getShells()[0];
                // first ask the user to select input signals
                shell.setBounds(Display.getCurrent().getBounds());
                SelectAnalysisDialog dialog = new SelectAnalysisDialog(shell);
                dialog.open();
                if (dialog.getReturnCode() == SelectAnalysisDialog.OK) {
                    dialogAborted = false;
                }
            }
        });
        return !dialogAborted;
    }

}
