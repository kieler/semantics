/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */

package de.cau.cs.kieler.sim.table.views;

/**
 * The class TableData implements a single data entry that represents a variable or signal within
 * the data table. If it is a signal, then it can be present or absent. An entry always contains of
 * a key and a value String expression.
 * 
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 */
public class TableData {

    /** The parent TableDataList the entry contains to. */
    private TableDataList tableDataList;

    /** A flag indicating that the entry is a signal. */
    private boolean signal;

    /** A flag indicating that the signal is present. */
    private boolean present;

    /** The key of the entry. */
    private String key;

    /** The value of the entry. */
    private String value;

    /** A flag indicating that the entry was modified. */
    private boolean modified;

    /**
     * A flag indicating that the entry is permanent and hence should be produced in every
     * consecutive step until this flag is cleared.
     */
    private boolean permanent;

    // -------------------------------------------------------------------------

    /**
     * Gets the parent TableDataList.
     * 
     * @return the parent TableDataList
     */
    public TableDataList getParentTableDataList() {
        return tableDataList;
    }

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new TableData entry.
     * 
     * @param parentTableDataList
     *            the parent TableDataList
     */
    public TableData(final TableDataList parentTableDataList) {
        this.tableDataList = parentTableDataList;
        this.present = false;
        this.signal = false;
        this.key = "";
        this.value = "";
        this.modified = false;
        this.permanent = false;
    }

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new TableData entry.
     * 
     * @param parentTableDataList
     *            the parent TableDataList
     * @param keyParam
     *            the key of the entry
     */
    public TableData(final TableDataList parentTableDataList, final String keyParam) {
        this.tableDataList = parentTableDataList;
        this.present = false;
        this.signal = false;
        this.key = keyParam;
        this.value = "";
        this.permanent = false;
    }

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new TableData entry.
     * 
     * @param parentTableDataList
     *            the parent TableDataList
     * @param keyParam
     *            the key of the entry
     * @param valueParam
     *            the value of the entry
     */
    public TableData(final TableDataList parentTableDataList, 
                     final String keyParam, 
                     final String valueParam) {
        this.tableDataList = parentTableDataList;
        this.present = false;
        this.signal = false;
        this.key = keyParam;
        this.value = valueParam;
        this.permanent = false;
    }

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new TableData.
     * 
     * @param parentTableDataList
     *            the parent TableDataList
     * @param presentParam
     *            the present flag of the entry
     * @param keyParam
     *            the key of the entry
     * @param valueParam
     *            the value of the entry
     */
    public TableData(final TableDataList parentTableDataList, 
                     final boolean presentParam, 
                     final String keyParam, 
                     final String valueParam) {
        this.tableDataList = parentTableDataList;
        this.present = presentParam;
        this.key = keyParam;
        this.value = valueParam;
        this.permanent = false;
    }

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new TableData.
     * 
     * @param parentTableDataList
     *            the parent TableDataList
     * @param presentParam
     *            the present flag of the entry
     * @param signalParam
     *            the signal flag of the entry
     * @param keyParam
     *            the key of the entry
     * @param valueParam
     *            the value of the entry
     */
    public TableData(final TableDataList parentTableDataList, 
                     final boolean presentParam, 
                     final boolean signalParam,
                     final String keyParam, 
                     final String valueParam) {
        this.tableDataList = parentTableDataList;
        this.present = presentParam;
        this.signal = signalParam;
        this.key = keyParam;
        this.value = valueParam;
        this.permanent = false;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the value of the entry.
     * 
     * @return the value
     */
    public String getValue() {
        return this.value;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the key of the entry.
     * 
     * @return the key
     */
    public String getKey() {
        return this.key;
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the value of the entry.
     * 
     * @param valueParam
     *            the new value
     */
    public void setValue(final String valueParam) {
        this.value = valueParam;
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the key of the entry.
     * 
     * @param keyParam
     *            the new key
     * 
     * @throws Exception
     *             the exception if the key already exists in the parent TableDataList
     */
    public void setKey(final String keyParam) throws Exception {
        // only set the key if unique
        if (this.tableDataList.containsOther(keyParam, this)) {
            throw new Exception("The key '" + keyParam + "' already exists!");
        }
        this.key = keyParam;
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the present flag (for signal entries only).
     * 
     * @param presentParam
     *            the new present
     */
    public void setPresent(final boolean presentParam) {
        this.present = presentParam;
    }

    // -------------------------------------------------------------------------

    /**
     * Checks whether the signal is present (for signal entries only).
     * 
     * @return true, if signal is present
     */
    public boolean isPresent() {
        // return present flag if signal AND present
        return (this.signal && this.present);
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the signal flag of an entry.
     * 
     * @param signalParam
     *            true, if entry is a signal
     */
    public void setSignal(final boolean signalParam) {
        this.signal = signalParam;
    }

    // -------------------------------------------------------------------------

    /**
     * Checks whether the entry is a signal.
     * 
     * @return true, if entry is a signal
     */
    public boolean isSignal() {
        // return signal
        return this.signal;
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the modified flag of an entry.
     * 
     * @param modifiedParam
     *            true, if entry was modified
     */
    public void setModified(final boolean modifiedParam) {
        this.modified = modifiedParam;
    }

    // -------------------------------------------------------------------------

    /**
     * Checks whether entry is flagged as modified.
     * 
     * @return true, entry is modified
     */
    public boolean isModified() {
        // return modified flag if modified OR permanent
        return (this.modified || this.permanent);
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the permanent flag of an entry.
     * 
     * @param permanentParam
     *            true, if entry is permanent
     */
    public void setPermanent(final boolean permanentParam) {
        this.permanent = permanentParam;
    }

    // -------------------------------------------------------------------------

    /**
     * Checks whether entry is flagged as permanent.
     * 
     * @return true, if entry is permanent
     */
    public boolean isPermanent() {
        return this.permanent;
    }

}
