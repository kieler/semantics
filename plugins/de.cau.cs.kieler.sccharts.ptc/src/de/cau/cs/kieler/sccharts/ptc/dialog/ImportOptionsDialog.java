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

package de.cau.cs.kieler.sccharts.ptc.dialog;

import java.util.ArrayList;
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
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.swt.widgets.Button;

import de.cau.cs.kieler.sccharts.ptc.SCChartsPTCPlugin;

/**
 * 
 * @author cmot
 * 
 */
public class ImportOptionsDialog extends Dialog {

    /** The Constant MARGIN_WIDTH_AND_HEIGHT. */
    private static final int MARGIN_WIDTH_AND_HEIGHT = 15;

    /** The Constant FORM_WIDTH. */
    private static final int FORM_WIDTH = 400;

    /** The Constant FORM_HEIGHT. */
    private static final int FORM_HEIGHT = 500;

    /** The color black. */
    private static final RGB COLOR_BLACK = new RGB(0, 0, 0);

    /** The color red. */
    private static final RGB COLOR_RED = new RGB(200, 0, 0);
    
    private static final String STATEMACHINE_PNG = "images/statemachine.png";

    /** The Constant Image/ImageDescriptor INPUT_SIGNAL. */
    private Image statmachineIcon;

    /** The color for output signals. */
    private static Color colorOutput;

    /** The color for input signals. */
    private static Color colorInput;

    /** The Constant DIALOG_TITLE. */
    private static final String DIALOG_TITLE = "Select Import Options";

    /** The temporary table that allows the user to select DataComponents. */
    private Table table;
    
    public static String[] optionList = null;
    public static String[] optionListLabel = null;

    public static List<String> optionListSelected = new ArrayList<String>();

    private List<Button> checkBoxes = new ArrayList<Button>();
    
    /** The list that holds the currently selected input signals. */
    public static List<String> statemachineList = new ArrayList<String>();

    /** The list that holds the currently selected input signals. */
    private static List<String> statemachineAllList = new ArrayList<String>();

    /** The Constant for the keyboard delete key. */
    private static final int KEYBOARD_DELETE = 127;
    
    private static final int RETURN_VALUE_OK = 0;
    private static final int RETURN_VALUE_CANCEL = 1;

    // -------------------------------------------------------------------------

    /**
     * Instantiates a dialog.
     * 
     * @param parent
     *            the SWT parent of this dialog
     */
    public ImportOptionsDialog(final Shell parent) {
        super(parent);
        colorOutput = new Color(null, COLOR_BLACK);
        colorInput = new Color(null, COLOR_RED);
        statmachineIcon = AbstractUIPlugin.imageDescriptorFromPlugin(
                SCChartsPTCPlugin.PLUGIN_ID, STATEMACHINE_PNG).createImage();
    }

    // -------------------------------------------------------------------------

    /**
     * Dispose the colors.
     */
    public void dispose() {
        colorOutput.dispose();
        colorInput.dispose();
        statmachineIcon.dispose();
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public int open() {
        // Make a copy
        statemachineAllList.clear();
        optionListSelected.clear();
        
        for (String sm : statemachineList) {
            statemachineAllList.add(sm);
        }
        
        int returnValue = super.open();
        
        if (returnValue != OK) {
            statemachineList.clear();
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
                //updateSelectedList();
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

                    //updateSelectedList();
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
                //updateSelectedList();
                updateTable();
                refreshTextColorsAndItemName();
            }

            public void mouseDown(final MouseEvent e) {
            }

            public void mouseUp(final MouseEvent e) {
                //updateSelectedList();
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
        
        for (int i = 0; i < optionList.length; i++) {
            final String option = optionList[i];
            final String label = optionListLabel[i];
            Button btn = new Button(composite, SWT.CHECK);
            btn.setData(option);
            btn.setText(label);
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
        for (String item : statemachineAllList) {
            if (!tableContains(item)) {
                this.addToTable(item, false);
            }
        }
        statemachineList =  getCheckedList();
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
            // select color
            Color currentColor = colorOutput;

            // update text colors
            TableItem tableItem = table.getItem(c);
            tableItem.setForeground(currentColor);

            tableItem.setText(item);

            // set icon
            tableItem.setImage(statmachineIcon);

        }
    }

    // -------------------------------------------------------------------------

}
