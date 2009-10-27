/*
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
 */
package de.cau.cs.kieler.krep.evalbench.ui.actions;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IStatusLineManager;

import de.cau.cs.kieler.krep.evalbench.Activator;

/**
 * Action that stops the current program. The plugin activator and the common
 * layer are used to access all relevant data.
 * 
 * @author msp
 */
public class StopAction extends Action {

    /** Identifier string for this action. */
    private static final String ACTION_ID = "de.cau.cs.kieler.krep.evalbench.ui.actions.stop";
    /** Relative path to the icon to use for this action. */
    private static final String ICON_PATH = "icons/stop.gif";

    /** The status line manager that can be used to display messages. */
    private IStatusLineManager statusLineManager;

    /**
     * Creates a new Reset Action.
     * 
     * @param manager
     *            status line manager used to display action result
     */
    public StopAction(IStatusLineManager manager) {
        setId(ACTION_ID);
        setText("St&op");
        setToolTipText("Stop the current program");
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
        Activator.getDefault().commonLayer.stopContinuous();
        statusLineManager.setMessage(Activator.getDefault().commonLayer
                .getStatusMessage());
    }

}
