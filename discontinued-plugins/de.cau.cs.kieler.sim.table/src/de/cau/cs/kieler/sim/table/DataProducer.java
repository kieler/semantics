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

import de.cau.cs.kieler.sim.kiem.IJSONStringDataComponent;
import de.cau.cs.kieler.sim.signals.JSONSignalValues;
import de.cau.cs.kieler.sim.kiem.JSONStringDataComponent;
import de.cau.cs.kieler.sim.table.views.DataTableView;
import de.cau.cs.kieler.sim.table.views.TableData;
import de.cau.cs.kieler.sim.table.views.TableDataList;

/**
 * The class DataProducer implements the producer DataComponent which should be scheduled before any
 * observer DataComponents. In its {@link #step(String)} method it produces data according to the
 * variables and signals that where modified by the user in the table's ViewPart.
 * 
 * @author cmot
 * @kieler.design 2012-10-08 proposed cmot
 * @kieler.rating 2012-10-08 proposed yellow
 */
public class DataProducer extends JSONStringDataComponent implements IJSONStringDataComponent {

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new producer DataComponent.
     */
    public DataProducer() {
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public String step(final String jSONString) {
        String returnString = "";

        TableDataList tableDataList = TableDataList.getInstance();
        for (int c = 0; c < tableDataList.size(); c++) {
            TableData tableData = tableDataList.get(c);
            if (tableData.isModified()) {
                if (!tableData.isSignal()) {
                    // if NO signal
                    if (!returnString.equals("")) {
                        returnString += ",";
                    }
                    String key = tableData.getKey();
                    String value = tableData.getValue();
                    // only add if there is any value
                    if (!value.equals("")) {
                        returnString += "\"" + key + "\":" + value + "}";
                    }
                } else if (tableData.isPresent()) {
                    // if signal is marked as present
                    if (!returnString.equals("")) {
                        returnString += ",";
                    }
                    String key = tableData.getKey();
                    String value = tableData.getValue();
                    if (value.equals("")) {
                        returnString += "\"" + key + "\":{\"" + JSONSignalValues.PRESENT_KEY
                                + "\":true}";
                    } else {
                        returnString += "\"" + key + "\":{\"" + JSONSignalValues.PRESENT_KEY
                                + "\":true,\"value\":" + value + "}";
                    }
                } else {
                    // if signals is marked as absent
                    if (!returnString.equals("")) {
                        returnString += ",";
                    }
                    String key = tableData.getKey();
                    String value = tableData.getValue();
                    if (value.equals("")) {
                        returnString += "\"" + key + "\":{\"" + JSONSignalValues.PRESENT_KEY
                                + "\":false}";
                    } else {
                        returnString += "\"" + key + "\":{\"" + JSONSignalValues.PRESENT_KEY
                                + "\":false,\"value\":" + value + "}";
                    }
                }
                // we have sent all modified values => reset
                synchronized (tableData) {
                    tableData.setModified(false);
                }
            }
        }

        // update only if not currently edited
        if (!DataTableView.getInstance().isCurrentlyEditing()) {
            TableDataList.getInstance().updateViewAsync();
        }

        returnString = "{" + returnString + "}";

        return returnString;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */

    public void initialize() {
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */

    public boolean isObserver() {
        return false;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */

    public boolean isProducer() {
        return true;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */

    public void wrapup() {
        // clear table
        TableDataList tableDataList = TableDataList.getInstance();
        if (tableDataList != null) {
            for (int c = tableDataList.size() - 1; c >= 0; c--) {
                TableData tableData = tableDataList.get(c);
                TableDataList.getInstance().remove(tableData.getKey());
            }
            TableDataList.getInstance().updateViewAsync();
        }
    }

}
