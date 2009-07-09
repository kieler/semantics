package de.cau.cs.kieler.sim.kiem.views;

import java.util.List;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;

import de.cau.cs.kieler.sim.kiem.extension.DataComponent;

public class KiemContentProvider implements IStructuredContentProvider  {

	public Object[] getElements(Object inputElement) {
		return ((List<DataComponent>)inputElement).toArray();
	}

	public void dispose() {
	}

	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
	}

}
