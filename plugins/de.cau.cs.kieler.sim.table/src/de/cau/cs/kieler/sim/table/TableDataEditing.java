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

	public TableDataEditing(ColumnViewer viewer, int columnIndex) {
		super(viewer);
		
		// Create the correct editor based on the column index
		switch (columnIndex) {
		case 0:
			editor = new CheckboxCellEditor(null, SWT.CHECK | SWT.READ_ONLY);
			break;
		case 1:
			editor = new TextCellEditor(((TableViewer) viewer).getTable());
			break;
		case 2:
			editor = new TextCellEditor(((TableViewer) viewer).getTable());
			break;
		default:
			throw new RuntimeException("columnIndex out of bounds (3)");
		}
		this.columnIndex = columnIndex;
	}

	@Override
	protected boolean canEdit(Object element) {
		return true;
	}

	@Override
	protected CellEditor getCellEditor(Object element) {
		return editor;
	}

	@Override
	protected Object getValue(Object element) {
		TableData tableData = (TableData) element;

		switch (this.columnIndex) {
		case 0:
			return tableData.isPresent();
		case 1:
			return tableData.getKey();
		case 2:
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
		case 0:
			tableData.setPresent((Boolean)value);
			break;
		case 1:
			try {
				tableData.setKey(String.valueOf(value));
			}
			catch(Exception e) {
				e.printStackTrace();
				//do not set the key//
			}
			break;
		case 2:
			tableData.setValue(String.valueOf(value));
			break;
		default:
			break;
		}

		getViewer().update(element, null);
	}

}
