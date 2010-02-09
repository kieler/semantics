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

import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.CheckboxCellEditor;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.swt.SWT;

/**
 * The class TableDataEditing implements the editing support for DataTable entries of the table.
 * Specifically it provides a check box CellEditor for the first (present) column and String
 * CellEditors for the second (key) and the third (value) column. <BR>
 * <BR>
 * It also sets a flag that the table is currently edited to prevent disturbing updates during an
 * ongoing editing action. Therefore it needs access to the DataTableViewer.
 * 
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 */
public class TableDataEditing extends EditingSupport {

    /** The editor of this specific column. */
    private CellEditor editor;

    /** The column index. */
    private int columnIndex;

    /** The Constant COLUMN_0. */
    // private static final int COLUMN_0 = 0;

    /** The Constant COLUMN_1. */
    private static final int COLUMN_1 = 1;

    /** The Constant COLUMN_2. */
    private static final int COLUMN_2 = 2;

    /** The Constant COLUMN_3. */
    private static final int COLUMN_3 = 3;

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new table data editing.
     * 
     * @param viewerParam
     *            the viewerParam
     * @param columnIndexParam
     *            the column index
     */
    public TableDataEditing(final DataTableViewer viewerParam, final int columnIndexParam) {
        super(viewerParam);

        // Create the correct editor based on the column index
        switch (columnIndexParam) {
        case COLUMN_1:
            editor = new CheckboxCellEditor(null, SWT.CHECK | SWT.READ_ONLY);
            break;
        case COLUMN_2:
            editor = new TextCellEditor(((DataTableViewer) viewerParam).getTree());
            break;
        case COLUMN_3:
            editor = new TextCellEditor(((DataTableViewer) viewerParam).getTree());
            break;
        default:
            throw new RuntimeException("columnIndex out of bounds (4)");
        }
        this.columnIndex = columnIndexParam;
    }

    // -------------------------------------------------------------------------

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.jface.viewers.EditingSupport#canEdit(java.lang.Object)
     */
    @Override
    protected boolean canEdit(final Object element) {
        boolean allowed = false;

        TableData tableData = (TableData) element;

        // allow to edit the present status any time
        if (this.columnIndex == COLUMN_1) {
            allowed = true;
        }
        if (!allowed) {
            allowed = !tableData.isPermanent();
        }

        if (allowed) {
            DataTableView.getInstance().setCurrentlyEditing(true);
        }

        // otherwise only allow changes if NOT permanent!
        return allowed;
    }

    // -------------------------------------------------------------------------

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.jface.viewers.EditingSupport#getCellEditor(java.lang.Object)
     */
    @Override
    protected CellEditor getCellEditor(final Object element) {
        return editor;
    }

    // -------------------------------------------------------------------------

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.jface.viewers.EditingSupport#getValue(java.lang.Object)
     */
    @Override
    protected Object getValue(final Object element) {
        TableData tableData = (TableData) element;

        // table data is being edited and should not be updated by observer
        switch (this.columnIndex) {
        case COLUMN_1:
            if (tableData.isSignal()) {
                tableData.setModified(true);
                if (tableData.isPresent()) {
                    tableData.setPresent(false);
                } else {
                    tableData.setPresent(true);
                }
            }
            return true;
        case COLUMN_2:
            return tableData.getKey();
        case COLUMN_3:
            return tableData.getValue();
        default:
            break;
        }
        return null;
    }

    // -------------------------------------------------------------------------

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.jface.viewers.EditingSupport#setValue(java.lang.Object, java.lang.Object)
     */
    @Override
    protected void setValue(final Object element, final Object value) {
        TableData tableData = (TableData) element;

        // only allow to modify present status of permanent entries (for convenience)
        if (!tableData.isPermanent()) {
            switch (this.columnIndex) {
            case COLUMN_1:
                // noop
                break;
            case COLUMN_2:
                try {
                    String newValue = String.valueOf(value);
                    if (!tableData.getKey().equals(newValue)) {
                        tableData.setModified(true);
                    }
                    tableData.setKey(newValue);
                } catch (Exception e) {
                    e.printStackTrace();
                    // do not set the key//
                }
                break;
            case COLUMN_3:
                String newValue = String.valueOf(value);
                if (!tableData.getValue().equals(newValue)) {
                    tableData.setModified(true);
                }
                tableData.setValue(newValue);
                break;
            default:
                break;
            }
        }

        // table data is not being edited any more and can be
        // updated by observer again
        DataTableView.getInstance().setCurrentlyEditing(false);

        // updates the table
        getViewer().update(element, null);
        getViewer().refresh();
    }

}
