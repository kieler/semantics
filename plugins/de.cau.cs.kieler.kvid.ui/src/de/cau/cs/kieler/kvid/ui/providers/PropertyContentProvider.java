package de.cau.cs.kieler.kvid.ui.providers;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;

public class PropertyContentProvider implements IStructuredContentProvider {

    public void dispose() {
        // TODO Auto-generated method stub

    }

    public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
        // TODO Auto-generated method stub

    }

    public Object[] getElements(Object inputElement) {
        String[] array = {"A", "B", "C"};
        return array;
    }

}
