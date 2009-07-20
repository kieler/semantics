package de.cau.cs.kieler.sim.kiem.data;

import java.io.Serializable;

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.swt.widgets.Composite;

public abstract class KiemPropertyType implements Serializable,
										IKiemPropertyType {
	private static final long serialVersionUID = 3312580956244391881L;
	protected CellEditor cellEditor;
	
	public KiemPropertyType() {
		cellEditor = null;
	}
	
	public void setCellEditor(Composite parent) {
		cellEditor = new TextCellEditor(parent);
	}
	
	public CellEditor getCellEditor() {
		return cellEditor;
	}
}
