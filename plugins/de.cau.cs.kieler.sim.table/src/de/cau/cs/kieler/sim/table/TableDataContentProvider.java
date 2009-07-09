package de.cau.cs.kieler.sim.table;


import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;


public class TableDataContentProvider implements IStructuredContentProvider  {

	@Override
	public Object[] getElements(Object inputElement) {
		return ((TableDataList)inputElement).getArray();
	}

	@Override
	public void dispose() {
	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
	}

}
