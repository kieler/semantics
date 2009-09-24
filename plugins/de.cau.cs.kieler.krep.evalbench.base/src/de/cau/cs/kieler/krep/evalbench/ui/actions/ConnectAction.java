package de.cau.cs.kieler.krep.evalbench.ui.actions;


import org.eclipse.jface.action.Action;

import de.cau.cs.kieler.krep.evalbench.Activator;

/**
 * Connect to processor
 * @author ctr
 *
 */
public class ConnectAction extends Action {

	/** Identifier string for this action */
	private static final String ACTION_ID = "de.cau.cs.kieler.krep.evalbench.ui.actions.connect";
	/** Relative path to the icon to use for this action */ 
	private static final String ICON_PATH = "icons/connect.gif";
	
	/**
	 * Creates a new Check Connection Action.
	 */
	public ConnectAction() {
		setId(ACTION_ID);
		setText("Connect");
		setToolTipText("Connect to the currently selected target");
		setImageDescriptor(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, ICON_PATH));
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.jface.action.Action#run()
	 */
	@Override
	public void run() {
		Activator.commonLayer.connect();
	}
	
}
