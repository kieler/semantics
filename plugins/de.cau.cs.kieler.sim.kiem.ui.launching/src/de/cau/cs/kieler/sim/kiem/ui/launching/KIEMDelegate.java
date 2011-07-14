package de.cau.cs.kieler.sim.kiem.ui.launching;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
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

public class KIEMDelegate implements ILaunchConfigurationDelegate {

    public void launch(ILaunchConfiguration configuration, String mode, ILaunch launch,
            IProgressMonitor monitor) throws CoreException {

        // Bring KiemView to front (if exists)
        KiemView.bringToFront();
        
        String scheduleDataString = configuration.getAttribute(
                KiemUILaunchPlugin.ATTR_EXECUTION_SCHEDULE, "");
        try {
            ScheduleData scheduleData = ScheduleData.fromString(scheduleDataString);
            String scheduleName = scheduleData.getName();

            ScheduleManager.getInstance().openSchedule(scheduleData);

            System.out.println("LAUNCHING " + scheduleName);
        } catch (ScheduleFileMissingException e) {
            e.printStackTrace();
        } catch (KiemParserException e) {
            e.printStackTrace();
        }
        
        
        if (mode.equalsIgnoreCase("run")) {
            if (KiemPlugin.getDefault().initExecution()) {
                Execution execution = KiemPlugin.getDefault().getExecution();
                if (execution != null) {
                    execution.runExecutionSync();
                }
            }
        }
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
