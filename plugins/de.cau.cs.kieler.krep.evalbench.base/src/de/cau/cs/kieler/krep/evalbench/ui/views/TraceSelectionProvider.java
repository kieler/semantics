package de.cau.cs.kieler.krep.evalbench.ui.views;


import org.eclipse.jface.viewers.ISelection;

import de.cau.cs.kieler.krep.evalbench.Activator;

/**
 * @author ctr
 * Selection Provider for table in view.
 */
public class TraceSelectionProvider implements ISelection {

    public boolean isEmpty() {
	return !(Activator.getTraces().hasNext());
    }
    
    

}
