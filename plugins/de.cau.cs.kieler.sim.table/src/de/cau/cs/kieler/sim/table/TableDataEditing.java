/******************************************************************************
 * KIELER - Kiel Integrated Environment for Layout for the Eclipse RCP
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright ${year} by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 ******************************************************************************/

package de.cau.cs.kieler.sim.table;

import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.CheckboxCellEditor;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.swt.SWT;

public class TableDataEditing extends EditingSupport {
	private CellEditor editor;
	private int columnIndex;
	DataTableViewer viewer;

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

	@Override
	protected boolean canEdit(Object element) {
		TableData tableData = (TableData) element;
		//only *NOT* permanent entries are editable
		return (!tableData.isPermanent());
	}

	@Override
	protected CellEditor getCellEditor(Object element) {
		return editor;
	}

	@Override
	protected Object getValue(Object element) {
		TableData tableData = (TableData) element;

		switch (this.columnIndex) {
		case 1:
			return tableData.isPresent();
		case 2:
			return tableData.getKey();
		case 3:
			return tableData.getValue();
		default:
			break;
		}
		return null;
	}

	@Override
	protected void setValue(Object element, Object value) {
		TableData tableData = (TableData) element;

		switch (this.columnIndex) {
		case 1:
			if (tableData.isPresent() != (Boolean)value)
				tableData.setModified(true); {
					tableData.setPresent((Boolean)value);
				}
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

		getViewer().update(element, null);
		viewer.setSelection(null);
	}

}
