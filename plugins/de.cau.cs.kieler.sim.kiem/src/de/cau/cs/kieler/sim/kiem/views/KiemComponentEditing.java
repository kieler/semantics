package de.cau.cs.kieler.sim.kiem.views;

import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.CheckboxCellEditor;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.swt.SWT;

import de.cau.cs.kieler.sim.kiem.data.DataComponentEx;

public class KiemComponentEditing extends EditingSupport {
	private CellEditor editor;
	private int columnIndex;
	private KiemView parent;

	public KiemComponentEditing(KiemView parent, 
						  ColumnViewer viewer, 
						  int columnIndex) {
		super(viewer);
		
		// Create the correct editor based on the column index
		switch (columnIndex) {
		case 2:
			editor = new CheckboxCellEditor(null, SWT.CHECK | SWT.READ_ONLY);
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
		if (parent.KIEMInstance.execution != null) 
			return false;
		return true;
	}

	@Override
	protected CellEditor getCellEditor(Object element) {
		return editor;
	}

	@Override
	protected Object getValue(Object element) {
		DataComponentEx dataComponentEx = (DataComponentEx)element;

		switch (this.columnIndex) {
		case 2:
			return dataComponentEx.isEnabled();
		default:
			break;
		}
		return null;
	}

	@Override
	protected void setValue(Object element, Object value) {
		DataComponentEx dataComponentEx = (DataComponentEx)element;
		switch (this.columnIndex) {
		case 2:
			dataComponentEx.setEnabled((Boolean)value);
			break;
		default:
			break;
		}

		parent.updateView(true);
		//getViewer().update(element, null);
		//parent.refreshEnabledDisabledTextColors();
		//getViewer().setSelection(null);
		//parent.checkForSingleEnabledMaster(false,dataComponentEx);
	}

}
