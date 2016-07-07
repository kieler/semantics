/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.debug;

import java.util.List;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;
import de.cau.cs.kieler.sccharts.debug.ui.ViewDebugContributor;
import de.cau.cs.kieler.sim.kiem.IKiemEventListener;
import de.cau.cs.kieler.sim.kiem.KiemEvent;
import de.cau.cs.kieler.sim.kiem.config.data.ScheduleData;
import de.cau.cs.kieler.sim.kiem.config.managers.ScheduleManager;

/**
 * @author lgr
 *
 */
public class EventListener implements IKiemEventListener {

    /**
     * On Load Event: Check if a debug schedule is choosen, if not update the recent non debug
     * schedule and additionally schedule debug again, if the debug mode is enabled.
     * 
     * On Execution Event: Disable the debug mode button.
     * 
     * On Execution Stop Event: Enable the debug mode button.
     * 
     * On Step Event: Update the breakpoints map if needed. {@inheritDoc}
     */
    @Override
    public void notifyEvent(KiemEvent event) {
        SCChartsDebugPlugin plugin = SCChartsDebugPlugin.getDefault();

        // --------------------------------- SCHEDULE LOADED --------------------------------------
        if (event.isEvent(KiemEvent.LOAD)) {

            IPath path = (IPath) event.getInfo();
            boolean debug = SCChartsDebugPlugin.getDefault().updateDebugScheduleData(path);
            
//            Path defaultPath = new Path("/execution/" + SCChartsDebugPlugin.DEFAULT_DEBUG_SCHEDULE + ".execution");
            
            if (debug ^ DataComponent.DEBUG_MODE) {
                plugin.scheduleExecution();                
            }
            
//            // A schedule is chosen that is no debug schedule.
//            if (!path.equals(defaultPath)) {
//
//                // Save the previously known non-debug schedule.
//                String scheduleName = plugin.getDefaultNonDebugSchedule();
//                if (plugin.getPreviousNonDebugSchedule() != null) {
//                    scheduleName = plugin.getPreviousNonDebugSchedule().getName();
//                }
//
//                // Chosen schedule is not the last known default non-debug schedule, so update.
//                if (!path.toString().contains(scheduleName)) {
//                    ScheduleManager scheduleManager = ScheduleManager.getInstance();
//
//                    List<ScheduleData> scheduledata = scheduleManager.getAllSchedules();
//                    for (ScheduleData schedule : scheduledata) {
//                        // A schedule is found that corresponds to the given path for a schedule
//                        if (path.toString().contains(schedule.getName())) {
//                            plugin.setPreviousNonDebugSchedule(schedule);
//                            break;
//                        }
//                    }
//                }
//
//                // If we are in debug mode and the plugin is loaded properly, we want to deactivate
//                // the debug mode.
//                if (DataComponent.DEBUG_MODE && plugin.isLoaded()) {
//                    DataComponent.DEBUG_MODE = false;
//                    if (Display.getDefault() == null) {
//                        PlatformUI.createDisplay();
//                    }
//                    Display.getDefault().asyncExec(new Runnable() {
//                        public void run() {
//                            ViewDebugContributor.setButtonDebugSelection();
//                        }
//                    });
//                }
//            } else {
//                // A debug-schedule was chosen, so update all relevant values.
//                DataComponent.DEBUG_MODE = true;
//                if (Display.getDefault() == null) {
//                    PlatformUI.createDisplay();
//                }
//                Display.getDefault().syncExec(new Runnable() {
//                    public void run() {
//                        ViewDebugContributor.setButtonDebugSelection();
//                    }
//                });
//                plugin.setLoaded();
//            }
//            return;
        }

        // --------------------------------- EXECUTION STARTED ------------------------------------
        if (event.isEvent(KiemEvent.EXECUTION_START)) {

            if (event.isEvent(KiemEvent.EXECUTION_START)) {
                if (Display.getDefault() == null) {
                    PlatformUI.createDisplay();
                }
                Display.getDefault().asyncExec(new Runnable() {
                    public void run() {
                        ViewDebugContributor.setButtonDebugEnable(false);
                    }
                });
            }
        }

        // --------------------------------- EXECUTION STOPPED ------------------------------------
        if (event.isEvent(KiemEvent.EXECUTION_STOP)) {

            if (event.isEvent(KiemEvent.EXECUTION_STOP)) {
                if (Display.getDefault() == null) {
                    PlatformUI.createDisplay();
                }
                Display.getDefault().syncExec(new Runnable() {
                    public void run() {
                        ViewDebugContributor.setButtonDebugEnable(true);
                    }
                });

            }
            return;
        }

        // --------------------------------- STEP -------------------------------------------------
        if (event.isEvent(KiemEvent.STEP_INFO)) {
            plugin.updateBreakpointLines();
        }

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KiemEvent provideEventOfInterest() {
        int[] events = { KiemEvent.EXECUTION_START, KiemEvent.EXECUTION_STOP, KiemEvent.LOAD,
                KiemEvent.STEP_INFO };
        return new KiemEvent(events);
    }
}
