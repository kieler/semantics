package de.cau.cs.kieler.krep.evalbench.ui.actions;


import org.eclipse.jface.action.Action;

import de.cau.cs.kieler.krep.evalbench.Activator;

/**
 * Connect to processor
 * @author ctr
 *
 */
public class DisconnectAction extends Action {

	/** Identifier string for this action */
	private static final String ACTION_ID = "de.cau.cs.kieler.krep.evalbench.ui.actions.disconnect";
	/** Relative path to the icon to use for this action */ 
	private static final String ICON_PATH = "icons/disconnect.gif";
	
	/**
	 * Creates a new Check Connection Action.
	 */
	public DisconnectAction() {
		setId(ACTION_ID);
		setText("Disconnect");
		setToolTipText("Disconnect from the currently connected target");
		setImageDescriptor(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, ICON_PATH));
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.jface.action.Action#run()
	 */
	@Override
	public void run() {
		Activator.commonLayer.dispose();
	}
	
}
