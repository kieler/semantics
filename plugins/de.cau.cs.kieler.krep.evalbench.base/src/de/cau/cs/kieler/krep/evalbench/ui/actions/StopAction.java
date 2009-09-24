package de.cau.cs.kieler.krep.evalbench.ui.actions;


import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IStatusLineManager;

import de.cau.cs.kieler.krep.evalbench.Activator;

/**
 * Action that stops the current program.
 * The plugin activator and the common layer are used to access
 * all relevant data.
 * 
 * @author msp
 */
public class StopAction extends Action {
	
	/** Identifier string for this action */
	private static final String ACTION_ID = "de.cau.cs.kieler.krep.evalbench.ui.actions.stop";
	/** Relative path to the icon to use for this action */ 
	private static final String ICON_PATH = "icons/stop.gif";

	/** The status line manager that can be used to display messages */
	private IStatusLineManager statusLineManager;
	
	/**
	 * Creates a new Reset Action.
	 * 
	 * @param manager status line manager used to display action result
	 */
	public StopAction(IStatusLineManager manager) {
		setId(ACTION_ID);
		setText("St&op");
		setToolTipText("Stop the current program");
		setImageDescriptor(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, ICON_PATH));
		this.statusLineManager = manager;
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.jface.action.Action#run()
	 */
	@Override
	public void run() {
		Activator.commonLayer.stopContinuous();
		statusLineManager.setMessage(Activator.commonLayer.getStatusMessage());
	}

}
