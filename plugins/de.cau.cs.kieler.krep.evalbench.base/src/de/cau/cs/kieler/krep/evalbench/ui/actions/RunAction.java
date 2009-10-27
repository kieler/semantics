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

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IStatusLineManager;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.preference.IPreferenceStore;

import de.cau.cs.kieler.krep.evalbench.Activator;
import de.cau.cs.kieler.krep.evalbench.exceptions.CommunicationException;
import de.cau.cs.kieler.krep.evalbench.helpers.Tools;
import de.cau.cs.kieler.krep.evalbench.trace.TraceList;
import de.cau.cs.kieler.krep.evalbench.ui.VerifyPreferencePage;

/**
 * Action that runs the current program. The plugin activator and the common
 * layer are used to access all relevant data.
 * 
 * @author msp
 */
public class RunAction extends Action {

    /** Identifier string for this action. */
    private static final String ACTION_ID = "de.cau.cs.kieler.krep.evalbench.ui.actions.run";

    /** Relative path to the icon to use for this action. */
    private static final String ICON_PATH = "icons/run.gif";

    /** The status line manager that can be used to display messages. */
    private IStatusLineManager statusLineManager;

    private TraceList traces;

    /**
     * Creates a new Run Action.
     * 
     * @param manager
     *            status line manager used to display action result
     * @param traces
     *            trace from which the inputs are read. If this is null,
     *            external inputs are assumed
     */
    public RunAction(final IStatusLineManager manager, final TraceList traces) {
        setId(ACTION_ID);
        setText("R&un");
        setToolTipText("Run the current program");
        setImageDescriptor(Activator.imageDescriptorFromPlugin(
                Activator.PLUGIN_ID, ICON_PATH));
        this.statusLineManager = manager;
        this.traces = traces;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.jface.action.Action#run()
     */
    @Override
    public void run() {
        if (traces == null) {
            Activator.getDefault().commonLayer.continuousRun();
            statusLineManager.setMessage(Activator.getDefault().commonLayer
                    .getStatusMessage());
        } else {
            Tools.runWithProgress(new IRunnableWithProgress() {
                public void run(IProgressMonitor monitor) {
                    monitor.beginTask("Execute Trace", traces.size()
                            - traces.getTablePos());

                    IPreferenceStore preferenceStore = Activator.getDefault()
                            .getPreferenceStore();
                    boolean ignoreInvalid = preferenceStore
                            .getBoolean(VerifyPreferencePage.IGNORE_INVALID);

                    while (traces.hasNext()
                            && (ignoreInvalid || traces.isValid())) {
                        try {
                            traces.executeStep(statusLineManager);
                            monitor.worked(1);
                        } catch (CommunicationException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                    }
                    monitor.done();
                }
            });
        }
    }
}
