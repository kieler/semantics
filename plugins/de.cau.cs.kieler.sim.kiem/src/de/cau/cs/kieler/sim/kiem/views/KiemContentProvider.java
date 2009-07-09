package de.cau.cs.kieler.sim.kiem.views;

import java.util.List;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;

import de.cau.cs.kieler.sim.kiem.extension.DataProducerConsumer;

public class KiemContentProvider implements IStructuredContentProvider  {

	public Object[] getElements(Object inputElement) {
		return ((List<DataProducerConsumer>)inputElement).toArray();
	}

	public void dispose() {
	}

	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
	}

}
