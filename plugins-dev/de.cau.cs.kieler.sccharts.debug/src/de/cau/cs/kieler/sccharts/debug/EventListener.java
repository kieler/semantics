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

import org.eclipse.core.runtime.IPath;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;
import de.cau.cs.kieler.sccharts.debug.ui.ViewDebugContributor;
import de.cau.cs.kieler.sim.kiem.IKiemEventListener;
import de.cau.cs.kieler.sim.kiem.KiemEvent;
import de.cau.cs.kieler.sim.kiem.KiemPlugin;
import de.cau.cs.kieler.sim.kiem.config.exception.ScheduleFileMissingException;

/**
 * The event listener for KIEM events so it can be reacted accordingly.
 * 
 * @author lgr
 *
 */
public class EventListener implements IKiemEventListener {

    /**
     * On Load Event: Check if a debug schedule is chosen, if not update the recent non debug
     * schedule and additionally schedule debug again, if the debug mode is enabled.
     * 
     * On Execution Event: Disable the debug mode button.
     * 
     * On Execution Stop Event: Enable the debug mode button.
     * 
     * On Step Event: Update the breakpoints map if needed.
     * 
     * {@inheritDoc}
     */
    @Override
    public void notifyEvent(KiemEvent event) {
        SCChartsDebugPlugin plugin = SCChartsDebugPlugin.getDefault();

        // --------------------------------- SCHEDULE LOADED --------------------------------------
        if (event.isEvent(KiemEvent.LOAD)) {

            IPath path = (IPath) event.getInfo();
            boolean debug = !DataComponent.DEBUG_MODE;

            debug = SCChartsDebugPlugin.getDefault().updateDebugScheduleData(path);

            // If these two variables don't fit, the schedule wasn't chosen correctly.
            if (debug ^ DataComponent.DEBUG_MODE
                    || DataComponent.DEBUG_MODE && plugin.debugSchedule == null) {
                plugin.scheduleExecution();
            }
        }

        // --------------------------------- EXECUTION STARTED ------------------------------------
        else if (event.isEvent(KiemEvent.EXECUTION_START)) {

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
        else if (event.isEvent(KiemEvent.EXECUTION_STOP)) {

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
        }

        // --------------------------------- STEP -------------------------------------------------
        else if (event.isEvent(KiemEvent.STEP_INFO)) {
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