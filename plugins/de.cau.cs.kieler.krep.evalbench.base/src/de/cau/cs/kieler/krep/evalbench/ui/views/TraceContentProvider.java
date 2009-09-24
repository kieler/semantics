package de.cau.cs.kieler.krep.evalbench.ui.views;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;

/**
 * Diplay contents as expected by traces
 * 
 * @author ctr
 * 
 */
public class TraceContentProvider implements IStructuredContentProvider {

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.eclipse.jface.viewers.IStructuredContentProvider#getElements(java
     * .lang.Object)
     */
    public Object[] getElements(Object inputElement) {
	if (inputElement instanceof String[][]) {
	    return (String[][]) inputElement;
	} else {
	    return null;
	}
    }

    public void dispose() {
	// nothing to do

    }

    public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
	// noting to do

    }

}
