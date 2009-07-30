/******************************************************************************
 * KIELER - Kiel Integrated Environment for Layout for the Eclipse RCP
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
 ******************************************************************************/

package de.cau.cs.kieler.sim.kiem.views;

import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.CheckboxCellEditor;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.swt.SWT;

import de.cau.cs.kieler.sim.kiem.data.DataComponentEx;

/**
 * The Class KiemComponentEditing. It handles the editing support for
 * DataComponentExs in the DataComponentExs table of the KiemView. It 
 * basically only allows the modification of the enabled tag of a 
 * DataComponentEx.
 */
public class KiemComponentEditing extends EditingSupport {
	
	/** The cell editor. */
	private CellEditor editor;
	
	/** The column index. */
	private int columnIndex;
	
	/** The parent view used to trigger a refresh. */
	private KiemView parent;

	//-------------------------------------------------------------------------
	
	/**
	 * Instantiates a new kiem component editing. This is only used in the
	 * third column where the check-box for enabling or disabling a
	 * DataComponent exists. For other columns this method generates an error.
	 * 
	 * @param parent the parent
	 * @param viewer the viewer
	 * @param columnIndex the column index
	 */
	public KiemComponentEditing(KiemView parent, 
						  ColumnViewer viewer, 
						  int columnIndex) {
		super(viewer);
		
		// Create the correct editor based on the column index
		switch (columnIndex) {
		case 2:
			//only in the third column, there should be a check box editing
			editor = new CheckboxCellEditor(null, SWT.CHECK | SWT.READ_ONLY);
			break;
		default:
			throw new RuntimeException("Editing not supported");
		}
		this.columnIndex = columnIndex;
		this.parent = parent;
	}

	//-------------------------------------------------------------------------

	@Override
	protected boolean canEdit(Object element) {
		//do not allow to modify enabled/disabled status during execution
		if (parent.KIEMInstance.execution != null) 
			return false;
		return true;
	}

	//-------------------------------------------------------------------------

	@Override
	protected CellEditor getCellEditor(Object element) {
		//return the registered cell editor 
		return editor;
	}
	
	//-------------------------------------------------------------------------

	@Override
	protected Object getValue(Object element) {
		if (!(element instanceof DataComponentEx)) return null;
		DataComponentEx dataComponentEx = (DataComponentEx)element;

		switch (this.columnIndex) {
		case 2:
			//only for the third column, return whether the component is 
			//enabled
			return dataComponentEx.isEnabled();
		default:
			break;
		}
		return null;
	}
	
	//-------------------------------------------------------------------------

	@Override
	protected void setValue(Object element, Object value) {
		if (!(element instanceof DataComponentEx)) return;
		DataComponentEx dataComponentEx = (DataComponentEx)element;
		switch (this.columnIndex) {
		case 2:
			dataComponentEx.setEnabled((Boolean)value);
			break;
		default:
			break;
		}
		//update the table view
		parent.updateView(true);
		//check for a single enabled master, because we could just have
		//enabled a master where there may be already an enabled one
		parent.checkForSingleEnabledMaster(false,dataComponentEx);
	}

}
