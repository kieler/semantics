package de.cau.cs.kieler.sim.kiem.views;

import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;

import de.cau.cs.kieler.sim.kiem.data.DataComponentEx;
import de.cau.cs.kieler.sim.kiem.data.KiemProperty;

public class KiemPropertyEditing extends EditingSupport {
	private CellEditor editor;
	private int columnIndex;
	private KiemView parent;

	public KiemPropertyEditing(KiemView parent, 
						  ColumnViewer viewer, 
						  int columnIndex) {
		super(viewer);
		
		// Create the correct editor based on the column index
		switch (columnIndex) {
		case 1:
			editor = new TextCellEditor(((TreeViewer) viewer).getTree());
			//editor = new CheckboxCellEditor(null, SWT.CHECK | SWT.READ_ONLY);
			break;
		//case 1:
			//editor = new TextCellEditor(((TableViewer) viewer).getTable());
		//	break;
		default:
			throw new RuntimeException("Editing not supported");
		}
		this.columnIndex = columnIndex;
		this.parent = parent;
	}

	@Override
	protected boolean canEdit(Object element) {
		//do not allow to modify enabled/disabled status during execution
		if (parent.KIEM.execution != null) 
			return false;
		return true;
	}

	@Override
	protected CellEditor getCellEditor(Object element) {
		return editor;
	}

	@Override
	protected Object getValue(Object element) {
		KiemProperty property = (KiemProperty)element;

		switch (this.columnIndex) {
		case 1:
			return property.getValue();
		default:
			break;
		}
		return null;
	}

	@Override
	protected void setValue(Object element, Object value) {
		KiemProperty property = (KiemProperty)element;

		switch (this.columnIndex) {
		case 1:
			property.setValue((String)value);
			break;
		default:
			break;
		}
		getViewer().update(element, null);
	}

}
