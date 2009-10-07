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
package de.cau.cs.kieler.krep.evalbench.ui.actions;

import org.eclipse.jface.action.Action;

import de.cau.cs.kieler.krep.evalbench.Activator;

/**
 * Action that fetches information about the current target. The plugin
 * activator and the common layer are used to access all relevant data.
 * 
 * @author msp
 */
public class TargetInfoAction extends Action {

	/** Identifier string for this action */
	private static final String ACTION_ID = "de.cau.cs.kieler.krep.evalbench.ui.actions.targetInfo";
	/** Relative path to the icon to use for this action */
	private static final String ICON_PATH = "icons/information.gif";

	/**
	 * Creates a new Target Info Action.
	 */
	public TargetInfoAction() {
		setId(ACTION_ID);
		setText("Target Information");
		setToolTipText("Fetch information about the current target");
		setImageDescriptor(Activator.imageDescriptorFromPlugin(
				Activator.PLUGIN_ID, ICON_PATH));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.action.Action#run()
	 */
	@Override
	public void run() {
		Activator.commonLayer.getTargetInfo();
	}

}
