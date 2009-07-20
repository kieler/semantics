package de.cau.cs.kieler.sim.kiem.views;

import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;

public class KiemTableViewer extends TreeViewer {

	public KiemTableViewer(Table table) {
		super(table);
	}

	public KiemTableViewer(Composite parent, int style) {
		super(parent, style);
	}

	public KiemTableViewer(Composite parent) {
		super(parent);
	}

}
