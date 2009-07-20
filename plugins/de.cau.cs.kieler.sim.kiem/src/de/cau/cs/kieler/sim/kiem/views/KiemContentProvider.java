package de.cau.cs.kieler.sim.kiem.views;

import java.util.List;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

import de.cau.cs.kieler.sim.kiem.data.DataComponentEx;
import de.cau.cs.kieler.sim.kiem.data.KiemProperty;
import de.cau.cs.kieler.sim.kiem.extension.DataComponent;

public class KiemContentProvider implements ITreeContentProvider {

	@SuppressWarnings("unchecked")
	public Object[] getElements(Object inputElement) {
		return ((List<DataComponent>)inputElement).toArray();
	}

	public void dispose() {
	}

	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		//only if component
		DataComponentEx dataComponentEx = (DataComponentEx)parentElement;
		return dataComponentEx.getPropertyList().getElements();
	}

	@Override
	public Object getParent(Object element) {
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		//if property -> no children
		if (element instanceof KiemProperty) 
			return false;

		//if component -> count properties
		DataComponentEx dataComponentEx = (DataComponentEx)element;
		return (dataComponentEx.getPropertyList().hasElements());
	}

}
