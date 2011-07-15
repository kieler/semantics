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
import de.cau.cs.kieler.sim.kiem.ui.KiemUIPlugin;
import de.cau.cs.kieler.sim.kiem.ui.views.KiemView;

/**
 * The class KIEMDelegate implements the launcher behavior when pressed on RUN/DEBUG button in the
 * launch wizard or via the shortcuts.
 * 
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 * @kieler.rating 2011-07-15 proposed yellow
 * 
 */
public class KIEMDelegate implements ILaunchConfigurationDelegate {

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.debug.core.model.ILaunchConfigurationDelegate#launch(org.eclipse.debug.core.
     * ILaunchConfiguration, java.lang.String, org.eclipse.debug.core.ILaunch,
     * org.eclipse.core.runtime.IProgressMonitor)
     */
    public void launch(ILaunchConfiguration configuration, String mode, ILaunch launch,
            IProgressMonitor monitor) throws CoreException {

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

        // in RUN mode, start the execution and run it
        if (mode.equalsIgnoreCase("run")) {
            if (KiemPlugin.getDefault().initExecution()) {
                Execution execution = KiemPlugin.getDefault().getExecution();
                if (execution != null) {
                    execution.runExecutionSync();
                }
            }
        }
        // in DEBUG mode, start the execution and pause it
        else if (mode.equalsIgnoreCase("debug")) {
            if (KiemPlugin.getDefault().initExecution()) {
                Execution execution = KiemPlugin.getDefault().getExecution();
                if (execution != null) {
                    execution.stepExecutionSync();
                }
            }
        }
    }

}
