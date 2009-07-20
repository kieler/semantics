package de.cau.cs.kieler.sim.kiem.views;

import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Composite;

import de.cau.cs.kieler.sim.kiem.data.KiemProperty;

public class KiemPropertyEditing extends EditingSupport {
	private KiemView parent;
	private Composite tree;
	
	public KiemPropertyEditing(KiemView parent, 
						  ColumnViewer viewer, 
						  int columnIndex) {
		super(viewer);
		
		// Create the correct editor based on the column index
		switch (columnIndex) {
		case 1:
			this.tree = ((TreeViewer)viewer).getTree();
			break;
		default:
			throw new RuntimeException("Editing not supported");
		}
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
		KiemProperty property = (KiemProperty)element;
		property.getType().setCellEditor(tree);
		return property.getType().getCellEditor();
	}

	@Override
	protected Object getValue(Object element) {
		KiemProperty property = (KiemProperty)element;
		return property.getType().getValue(element);
	}

	@Override
	protected void setValue(Object element, Object value) {
		KiemProperty property = (KiemProperty)element;
		property.getType().setValue(element, value);
		getViewer().update(element, null);
	}

}
