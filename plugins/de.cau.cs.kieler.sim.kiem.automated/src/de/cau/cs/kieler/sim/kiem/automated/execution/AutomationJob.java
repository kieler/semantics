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

package de.cau.cs.kieler.sim.kiem.automated.execution;

import java.util.List;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.progress.IProgressConstants;
import org.eclipse.ui.progress.WorkbenchJob;

import de.cau.cs.kieler.sim.kiem.automated.KiemAutomatedPlugin;
import de.cau.cs.kieler.sim.kiem.automated.data.IterationResult;
import de.cau.cs.kieler.sim.kiem.properties.KiemProperty;

/**
 * This job is responsible for starting the execution in the execution manager.
 * 
 * @author soh
 * @kieler.rating 2010-02-01 proposed yellow
 */
public class AutomationJob extends WorkbenchJob {

    /** The list of execution files for the execution. */
    private IPath[] executionFiles;
    /** The list of model files for the execution. */
    private List<IPath> modelFiles;
    /** The list of properties for the execution. */
    private List<KiemProperty> properties;

    // --------------------------------------------------------------------------

    /**
     * 
     * Creates a new AutomationJob.
     * 
     * @param executionFilesParam
     *            list of execution files
     * @param modelFilesParam
     *            list of model files
     * @param propertiesParam
     *            list of properties
     */
    public AutomationJob(final IPath[] executionFilesParam,
            final List<IPath> modelFilesParam,
            final List<KiemProperty> propertiesParam) {
        super("Automated execution");

        this.executionFiles = executionFilesParam;
        this.modelFiles = modelFilesParam;
        this.properties = propertiesParam;

        setUser(true);
    }

    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public IStatus runInUIThread(final IProgressMonitor monitor) {
        try {
            // activate the KIEM view in order to force eclipse to load its
            // classes
            KiemAutomatedPlugin.getActivePage().showView(
                    "de.cau.cs.kieler.sim.kiem.view");
        } catch (PartInitException e) {
            e.printStackTrace();
        }

        // first attempt to ignore error output, does nothing yet
        super.setProperty(
                IProgressConstants.NO_IMMEDIATE_ERROR_PROMPT_PROPERTY,
                Boolean.TRUE);

        Thread thread = new Thread() {
            /**
             * {@inheritDoc}
             */
            @Override
            public void run() {
                try {
                    List<IterationResult> results = AutomationManager
                            .getInstance().doAutomatedExecution(executionFiles,
                                    modelFiles, properties, monitor);

                    AutomationManager.getInstance().notifyExecutionFinished(
                            results);
                } catch (RuntimeException e0) {
                    e0.printStackTrace();

                    done(new Status(IStatus.ERROR,
                            KiemAutomatedPlugin.PLUGIN_ID, "Execution aborted"));
                }
                done(new Status(IStatus.OK, KiemAutomatedPlugin.PLUGIN_ID,
                        "Execution finished"));
            }
        };
        // start a new thread to prevent blocking the UI
        thread.start();

        return Job.ASYNC_FINISH;
    }
}
