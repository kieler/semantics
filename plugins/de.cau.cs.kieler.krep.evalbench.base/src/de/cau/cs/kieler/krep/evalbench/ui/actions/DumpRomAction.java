/******************************************************************************
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
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
 * Action that reads to current program from the ROM The plugin activator and
 * the common layer are used to access all relevant data.
 * 
 * @author ctr
 */
public class DumpRomAction extends Action {

	/** Identifier string for this action */
	private static final String ACTION_ID = "de.cau.cs.kieler.krep.evalbench.ui.actions.dumpRom";
	/** Relative path to the icon to use for this action */
	private static final String ICON_PATH = "icons/check_con.gif";

	/**
	 * Creates a new Check Connection Action.
	 */
	public DumpRomAction() {
		setId(ACTION_ID);
		setText("Dump ROM");
		setToolTipText("Read current program from rom");
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
		Activator.commonLayer.dumpRom();
	}

}
