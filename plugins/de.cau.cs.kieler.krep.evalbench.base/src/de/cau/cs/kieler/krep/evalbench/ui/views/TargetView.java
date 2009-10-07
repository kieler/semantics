/******************************************************************************
 * KIELER - Kiel Integrated Environment for Layout for the Eclipse RCP
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright ${year} by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 ******************************************************************************/
package de.cau.cs.kieler.krep.evalbench.ui.views;


import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

import de.cau.cs.kieler.krep.evalbench.ui.actions.*;

/**
 * A View for displaying target information.
 * 
 * @author msp
 */
public class TargetView extends ViewPart {

	/** The identifier string for this view */
	public static final String VIEW_ID = "de.cau.cs.kieler.krep.evalbench.ui.views.target";
	
	/** The viewer used to display target info */
	private TextViewer viewer = null;

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.part.WorkbenchPart#createPartControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createPartControl(Composite parent) {
		// create text viewer
		viewer = new TextViewer(parent);
		// create actions
		IToolBarManager manager = getViewSite().getActionBars().getToolBarManager();
		manager.add(new TargetInfoAction());
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.part.WorkbenchPart#setFocus()
	 */
	@Override
	public void setFocus() {
		viewer.getControl().setFocus();
	}
	
	/**
	 * Gets the text viewer.
	 * 
	 * @return text viewer
	 */
	public TextViewer getViewer() {
		return viewer;
	}
}
