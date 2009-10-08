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

package de.cau.cs.kieler.sim.table.views;

import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.CheckboxCellEditor;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.swt.SWT;

/**
 * The class TableDataEditing implements the editing support for DataTable
 * entries of the table. Specifically it provides a check box CellEditor
 * for the first (present) column and String CellEditors for the second
 * (key) and the third (value) column.
 * <BR><BR>
 * It also sets a flag that the table is currently edited to prevent
 * disturbing updates during an ongoing editing action. Therefore it needs
 * access to the DataTableViewer.
 * 
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 */
public class TableDataEditing extends EditingSupport {
	
	/** The editor of this specific column. */
	private CellEditor editor;
	
	/** The column index. */
	private int columnIndex;
	
	/** The DataTableViewer to set the currently editing flag. */
	DataTableViewer viewer;

	//-------------------------------------------------------------------------

	/**
	 * Instantiates a new table data editing.
	 * 
	 * @param viewer the viewer
	 * @param columnIndex the column index
	 */
	public TableDataEditing(DataTableViewer viewer, 
							int columnIndex) {
		super(viewer);
		
		this.viewer = viewer; 
		
		// Create the correct editor based on the column index
		switch (columnIndex) {
		case 1:
			editor = new CheckboxCellEditor(null, SWT.CHECK | SWT.READ_ONLY);
			break;
		case 2:
			editor = new TextCellEditor(((DataTableViewer) viewer).getTree());
			break;
		case 3:
			editor = new TextCellEditor(((DataTableViewer) viewer).getTree());
			break;
		default:
			throw new RuntimeException("columnIndex out of bounds (4)");
		}
		this.columnIndex = columnIndex;
	}

	//-------------------------------------------------------------------------

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.EditingSupport#canEdit(java.lang.Object)
	 */
	@Override
	protected boolean canEdit(Object element) {
		TableData tableData = (TableData) element;
		//only *NOT* permanent entries are editable
		return (!tableData.isPermanent());
	}

	//-------------------------------------------------------------------------

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.EditingSupport#getCellEditor(java.lang.Object)
	 */
	@Override
	protected CellEditor getCellEditor(Object element) {
		return editor;
	}

	//-------------------------------------------------------------------------

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.EditingSupport#getValue(java.lang.Object)
	 */
	@Override
	protected Object getValue(Object element) {
		TableData tableData = (TableData) element;

		//table data is being edited and should not be updated by observer
		if (!tableData.isPermanent()) {
			DataTableView.getInstance().setCurrentlyEditing(true);
		}
		else {
			DataTableView.getInstance().setCurrentlyEditing(false);
		}
		

		switch (this.columnIndex) {
		case 1:
			if (tableData.isSignal()) {
				tableData.setModified(true);
				if (tableData.isPresent()) { 
					tableData.setPresent(false);
				}
				else {
					tableData.setPresent(true);
				}
			}
			return true;  
		case 2:
			return tableData.getKey();
		case 3:
			return tableData.getValue();
		default:
			break;
		}
		return null;
	}

	//-------------------------------------------------------------------------

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.EditingSupport#setValue(java.lang.Object, java.lang.Object)
	 */
	@Override
	protected void setValue(Object element, Object value) {
		TableData tableData = (TableData) element;

		switch (this.columnIndex) {
		case 1:
			//noop
			break;
		case 2:
			try {
				String newValue = String.valueOf(value);
				if (!tableData.getKey().equals(newValue)) {
					tableData.setModified(true);
				}
				tableData.setKey(newValue);
			}
			catch(Exception e) {
				e.printStackTrace();
				//do not set the key//
			}
			break;
		case 3:
			String newValue = String.valueOf(value);
			if (!tableData.getValue().equals(newValue)) {
				tableData.setModified(true);
			}
			tableData.setValue(newValue);
			break;
		default:
			break;
		}
		
		//updates the table
		getViewer().update(element, null);

		//table data is not being edited any more and can be
		//updated by observer again
		DataTableView.getInstance().setCurrentlyEditing(false);
	}

}
