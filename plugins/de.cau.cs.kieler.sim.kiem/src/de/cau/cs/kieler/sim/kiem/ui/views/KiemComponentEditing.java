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

package de.cau.cs.kieler.sim.kiem.ui.views;

import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.CheckboxCellEditor;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.swt.SWT;

import de.cau.cs.kieler.sim.kiem.internal.DataComponentWrapper;

/**
 * The Class KiemComponentEditing. It handles the editing support for DataComponentWrappers in the
 * DataComponentWrappers table of the KiemView. It basically only allows the modification of the enabled
 * tag of a DataComponentWrapper.
 * 
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 * @kieler.rating 2009-01-15 proposed yellow
 * 
 */
public class KiemComponentEditing extends EditingSupport {

    /** The cell editor. */
    private CellEditor editor;

    /** The column index. */
    private int columnIndex;

    /** The parent view used to trigger a refresh. */
    private KiemView parent;

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new KiemComponentEditing. This is only used in the third column where the
     * check-box for enabling or disabling a DataComponent exists. For other columns this method
     * generates an error.
     * 
     * @param parentParam
     *            the parent
     * @param viewer
     *            the viewer
     * @param columnIndexParam
     *            the column index
     */
    public KiemComponentEditing(final KiemView parentParam, 
                                final ColumnViewer viewer, 
                                final int columnIndexParam) {
        super(viewer);

        // Create the correct editor based on the column index
        switch (columnIndexParam) {
        case 2:
            // only in the third column, there should be a check box editing
            editor = new CheckboxCellEditor(null, SWT.CHECK | SWT.READ_ONLY);
            break;
        default:
            throw new RuntimeException("Editing not supported");
        }
        this.columnIndex = columnIndexParam;
        this.parent = parentParam;
    }

    // -------------------------------------------------------------------------

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.jface.viewers.EditingSupport#canEdit(java.lang.Object)
     */
    @Override
    protected boolean canEdit(final Object element) {
        // do not allow to modify enabled/disabled status during execution
        if (parent.getKIEMInstance().getExecution() != null) {
            return false;
        }
        return true;
    }

    // -------------------------------------------------------------------------

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.jface.viewers.EditingSupport#getCellEditor(java.lang.Object)
     */
    @Override
    protected CellEditor getCellEditor(final Object element) {
        // return the registered cell editor
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
        if (!(element instanceof DataComponentWrapper)) {
            return null;
        }
        DataComponentWrapper dataComponentWrapper = (DataComponentWrapper) element;

        switch (this.columnIndex) {
        case 2:
            // only for the third column, return whether the component is
            // enabled
            return dataComponentWrapper.isEnabled();
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
        if (!(element instanceof DataComponentWrapper)) {
            return;
        }
        DataComponentWrapper dataComponentWrapper = (DataComponentWrapper) element;
        switch (this.columnIndex) {
        case 2:
            dataComponentWrapper.setEnabled((Boolean) value);
            break;
        default:
            break;
        }
        // update the table view
        parent.updateView(true);
        // modified
        parent.setDirty(true);
        // check for a single enabled master, because we could just have
        // enabled a master where there may be already an enabled one
        parent.checkForSingleEnabledMaster(false, dataComponentWrapper);
    }

}
