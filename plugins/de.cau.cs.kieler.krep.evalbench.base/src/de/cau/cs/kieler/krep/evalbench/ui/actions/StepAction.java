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
import org.eclipse.jface.action.IStatusLineManager;

import de.cau.cs.kieler.krep.evalbench.Activator;
import de.cau.cs.kieler.krep.evalbench.trace.Tick;
import de.cau.cs.kieler.krep.evalbench.ui.editors.AssemblerEditor;

/**
 * Action that performs a single step in the current program. The plugin
 * activator and the common layer are used to access all relevant data.
 * 
 * @author msp, ctr
 */
public class StepAction extends Action {

	/** Identifier string for this action */
	private static final String ACTION_ID = "de.cau.cs.kieler.krep.evalbench.ui.actions.step";
	/** Relative path to the icon to use for this action */
	private static final String ICON_PATH = "icons/step.gif";

	/** The status line manager that can be used to display messages */
	private IStatusLineManager statusLineManager;

	/**
	 * Creates a new Step Action.
	 * 
	 * @param manager
	 *            status line manager used to display action result
	 * @param trace
	 *            trace from which the inputs are read If trace is null or all
	 *            ticks are executed, the inputs are read from the input view
	 */
	public StepAction(IStatusLineManager manager) {
		setId(ACTION_ID);
		setText("&Step");
		setToolTipText("Perform a single step in the current program");
		setImageDescriptor(Activator.imageDescriptorFromPlugin(
				Activator.PLUGIN_ID, ICON_PATH));
		this.statusLineManager = manager;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.action.Action#run()
	 */
	@Override
	public void run() {
		AssemblerEditor editor = Activator.commonLayer
				.getActiveAssemblerEditor();
		Tick tick = new Tick(editor.getInputs(), editor.getOutputs());

		Activator.commonLayer.step(tick);
		statusLineManager.setMessage(Activator.commonLayer.getStatusMessage());
	}

}
