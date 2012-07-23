/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2011 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */

package de.cau.cs.kieler.sim.kiem.ui.launching;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.ILaunchConfigurationDelegate;

import de.cau.cs.kieler.sim.kiem.KiemPlugin;
import de.cau.cs.kieler.sim.kiem.config.data.ScheduleData;
import de.cau.cs.kieler.sim.kiem.config.exception.KiemParserException;
import de.cau.cs.kieler.sim.kiem.config.exception.ScheduleFileMissingException;
import de.cau.cs.kieler.sim.kiem.config.managers.ScheduleManager;
import de.cau.cs.kieler.sim.kiem.execution.Execution;
import de.cau.cs.kieler.sim.kiem.ui.views.KiemView;

/**
 * The class KIEMDelegate implements the launcher behavior when pressed on RUN/DEBUG button in the
 * launch wizard or via the shortcuts.
 * 
 * @author cmot
 * @kieler.rating 2011-07-15 proposed yellow
 * 
 */
public class KiemDelegate implements ILaunchConfigurationDelegate {

    // --------------------------------------------------------------------------
    
    /**
     * {@inheritDoc}
     */
    public void launch(final ILaunchConfiguration configuration, final String mode,
            final ILaunch launch, final IProgressMonitor monitor) throws CoreException {

        // bring KiemView to front
        KiemView.bringToFront();

        // test whether KIEM Execution is already running, if this is true stop here!
        if (KiemPlugin.getDefault().isInitializingExecution()
                || KiemPlugin.getDefault().getExecution() != null) {
            throw new CoreException(new Status(Status.ERROR, KiemUILaunchPlugin.PLUGIN_ID,
                    "Execution is already running!"));
        }

        // load configuration
        String scheduleDataString = configuration.getAttribute(
                KiemUILaunchPlugin.ATTR_EXECUTION_SCHEDULE, "");

        try {
            // parse ScheduleData
            ScheduleData scheduleData = ScheduleData.fromString(scheduleDataString);
            // open execution file
            ScheduleManager.getInstance().openSchedule(scheduleData);
        } catch (ScheduleFileMissingException e) {
            e.printStackTrace();
        } catch (KiemParserException e) {
            e.printStackTrace();
        }

        if (mode.equalsIgnoreCase("run")) {
            // in RUN mode, start the execution and run it
            if (KiemPlugin.getDefault().initExecution()) {
                Execution execution = KiemPlugin.getDefault().getExecution();
                if (execution != null) {
                    execution.runExecutionSync();
                }
            }
        } else if (mode.equalsIgnoreCase("debug")) {
            // in DEBUG mode, start the execution and pause it
            if (KiemPlugin.getDefault().initExecution()) {
                Execution execution = KiemPlugin.getDefault().getExecution();
                if (execution != null) {
                    execution.stepExecutionSync();
                }
            }
        }
    }

    // --------------------------------------------------------------------------
}
