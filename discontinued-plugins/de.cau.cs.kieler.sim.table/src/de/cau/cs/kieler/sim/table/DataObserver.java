/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */

package de.cau.cs.kieler.sim.table;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchWindow;

import de.cau.cs.kieler.sim.kiem.IJSONStringDataComponent;
import de.cau.cs.kieler.sim.signals.JSONSignalValues;
import de.cau.cs.kieler.sim.kiem.JSONStringDataComponent;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import de.cau.cs.kieler.sim.table.views.DataTableView;
import de.cau.cs.kieler.sim.table.views.TableData;
import de.cau.cs.kieler.sim.table.views.TableDataList;

/**
 * The class DataObserver implements the observer DataComponent which should be scheduled behind any
 * producer DataComponents. It updates the table's ViewPart according to the variables and signals
 * it gets in its {@link #step(String)} method from the execution manager.
 * 
 * @author cmot
 * @kieler.design 2012-10-08 proposed cmot
 * @kieler.rating 2012-10-08 proposed yellow
 */
public class DataObserver extends JSONStringDataComponent implements IJSONStringDataComponent {

    /**
     * A temporary list that is used to remember updated values to set all not updated signals to
     * absent within history steps.
     */
    private List<TableData> tableDataTmp;

    /** The id of the view for KIEM. */
    private static final String TABLEVIEWID = "de.cau.cs.kieler.sim.table.view";

    /**
     * The Constant EYE_CATCH_DELAY. Let the user eye-catch the table entries and delay the update
     * 80ms.
     */
    private static final int EYE_CATCH_DELAY = 80;

    /** The delay to sleep while blocked waiting for the UI thread to bring to front the DataTable. */
    private static final int BRING_TO_FRONT_DELAY = 100;

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new observer DataComponent.
     */
    public DataObserver() {
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public String step(final String jSONString) {
        // create a new temporary list
        tableDataTmp = new LinkedList<TableData>();

        try {
            JSONObject allData = new JSONObject(jSONString);
            String[] fieldNames = JSONObject.getNames(allData);
            if (fieldNames != null) {
                for (int c = 0; c < fieldNames.length; c++) {
                    // extract key, value from JSONObject
                    Object obj = allData.get(fieldNames[c]);
                    String key = fieldNames[c];
                    String value;
                    boolean isPresent = false; // default
                    boolean isSignal = false;
                    if (obj instanceof JSONObject) {
                        // can be a signal
                        isPresent = JSONSignalValues.isPresent((JSONObject) obj);
                        // extract signal value if any
                        if (JSONSignalValues.isSignalValue((JSONObject) obj)) {
                            isSignal = true;
                            obj = JSONSignalValues.getSignalValue((JSONObject) obj);
                        }
                    }

                    // set value according to the object instance
                    if (obj == null) {
                        value = "";
                    } else if (obj instanceof Double) {
                        value = ((Double) obj) + "";
                        if (!isSignal) {
                            isPresent = (Double)obj != 0;
                        }
                    } else if (obj instanceof Integer) {
                        value = ((Integer) obj) + "";
                        if (!isSignal) {
                            isPresent = (Integer)obj != 0;
                        }
                    } else if (obj instanceof Boolean) {
                        value = ((Boolean) obj).toString();
                        if (!isSignal) {
                            isPresent = (Boolean)obj;
                        }
                    } else if (obj instanceof JSONObject) {
                        value = ((JSONObject) obj).toString();
                    } else if (obj instanceof JSONArray) {
                        value = ((JSONArray) obj).toString();
                    } else {
                        value = "\"" + (String) obj + "\"";
                    }

                    // add to table or update table
                    if (TableDataList.getInstance().contains(key)) {
                        // update
                        TableData tableData = TableDataList.getInstance().get(key);
                        synchronized (tableData) {
                            tableData.setSignal(isSignal);
                            tableData.setValue(value);
                            tableData.setPresent(isPresent);
                            tableData.setModified(false);
                        }
                        tableDataTmp.add(tableData);
                    } else {
                        // add
                        TableData tableData = new TableData(TableDataList.getInstance(), isPresent,
                                isSignal, key, value);
                        tableDataTmp.add(tableData);
                        TableDataList.getInstance().add(tableData);
                    }
                }

                if (this.isHistoryStep()) {
                    // set all NOT updated entries to absent per default
                    int tableSize = TableDataList.getInstance().size();
                    for (int c = 0; c < tableSize; c++) {
                        TableData tableData = TableDataList.getInstance().get(c);
                        if (tableData.isPresent() && (!tableData.isModified())) {
                            if (!tableDataTmp.contains(tableData)) {
                                tableData.setPresent(false);
                            }
                        }
                        if (tableData.isModified()) {
                            tableData.setModified(false);
                        }
                    }
                }

            }
        } catch (JSONException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // update only if not currently edited
        if (!DataTableView.getInstance().isCurrentlyEditing()) {
            TableDataList.getInstance().updateViewAsync();
        }

        // Slow down so that user can eye-catch all changes!
        try {
            Thread.sleep(EYE_CATCH_DELAY);
        } catch (Exception e) {
            // does not matter if we update a little faster
        }

        return null;
    }

    // -------------------------------------------------------------------------

    private boolean broughtToFront;

    /**
     * This method brings the Table view to the front.
     */
    public void bringToFront() {
        broughtToFront = false;
        Display.getDefault().syncExec(new Runnable() {
            public void run() {
                // bring TABLE view to the front (lazy loading)
                try {
                    IWorkbenchWindow window = TablePlugin.getDefault().getWorkbench()
                            .getActiveWorkbenchWindow();
                    IViewPart vP = window.getActivePage().showView(TABLEVIEWID);
                    vP.setFocus();
                    // set done flag
                    broughtToFront = true;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        while (!broughtToFront) {
            try {
                Thread.sleep(BRING_TO_FRONT_DELAY);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void initialize() {
        // bring Table view to front
        bringToFront();

        // DEPRECATED CODE FOLLOWING
        // // make an entry of all global interface variables/signals
        // String[] variableKeys = this.getInitialVariables()
        // .getInterfaceKeys();
        // for (int c = 0; c < variableKeys.length; c++) {
        // String key = variableKeys[c];
        // String value = "";
        // // add to list
        // TableDataList.getInstance().add(
        // new TableData(TableDataList.getInstance(), false, key, value));
        // }

        // consider global variable initializations
        step(this.getInitialVariables());

        // update the table
        TableDataList.getInstance().updateViewAsync();
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public boolean isObserver() {
        return true;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public boolean isProducer() {
        return false;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public boolean isDeltaObserver() {
        return true;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public boolean isHistoryObserver() {
        return true;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void wrapup() {
    }

}
