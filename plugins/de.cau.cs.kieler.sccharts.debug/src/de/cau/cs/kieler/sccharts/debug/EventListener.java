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

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.model.IBreakpoint;
import org.eclipse.debug.core.model.LineBreakpoint;
import org.eclipse.jface.action.ControlContribution;
import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.swt.SWTException;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.internal.editors.text.PreviousPulldownActionDelegate;

import de.cau.cs.kieler.sccharts.debug.ui.SCChartsDebugModelPresentation;
import de.cau.cs.kieler.sccharts.debug.ui.ViewDebugContributor;
import de.cau.cs.kieler.sim.kiem.IKiemEventListener;
import de.cau.cs.kieler.sim.kiem.KiemEvent;
import de.cau.cs.kieler.sim.kiem.KiemPlugin;
import de.cau.cs.kieler.sim.kiem.config.data.KiemConfigEvent;
import de.cau.cs.kieler.sim.kiem.config.data.ScheduleData;
import de.cau.cs.kieler.sim.kiem.config.managers.ScheduleManager;
import de.cau.cs.kieler.sim.kiem.ui.views.KiemView;

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
     * On Step Event: Update the breakpoints map if needed. 
     * {@inheritDoc}
     */
    @Override
    public void notifyEvent(KiemEvent event) {
        SCChartsDebugPlugin plugin = SCChartsDebugPlugin.getDefault();

        if (event.isEvent(KiemEvent.LOAD)) {

            IPath path = (IPath) event.getInfo();
            Path defaultPath = new Path(
                    "/execution/" + SCChartsDebugPlugin.DEFAULT_DEBUG_SCHEDULE + ".execution");
            if (!path.equals(defaultPath)) {

                String scheduleName;
                if (plugin.getPreviousNonDebugSchedule() != null) {
                    scheduleName = plugin.getPreviousNonDebugSchedule().getName();
                } else {
                    scheduleName = plugin.getDefaultNonDebugSchedule();
                }

                // choosen schedule is not the last known default schedule
                if (!path.toString().contains(scheduleName)) {
                    ScheduleManager scheduleManager = ScheduleManager.getInstance();

                    List<ScheduleData> scheduledata = scheduleManager.getAllSchedules();
                    for (ScheduleData schedule : scheduledata) {
                        if (path.toString().contains(schedule.getName())) {
                            plugin.setPreviousNonDebugSchedule(schedule);
                            break;
                        }
                    }
                }

                if (DataComponent.DEBUG_MODE) {
                    if (plugin.getLoaded()) {
                        DataComponent.DEBUG_MODE = false;
                        PlatformUI.createDisplay();
                        Display.getDefault().asyncExec(new Runnable() {
                            public void run() {
                                ViewDebugContributor.buttonDebug
                                        .setSelection(DataComponent.DEBUG_MODE);
                            }
                        });
                    }

                }
            } else {
                DataComponent.DEBUG_MODE = true;
                PlatformUI.createDisplay();
                Display.getDefault().asyncExec(new Runnable() {
                    public void run() {
                        ViewDebugContributor.buttonDebug.setSelection(DataComponent.DEBUG_MODE);
                    }
                });
                plugin.setLoaded();
            }
            return;
        }

        if (event.isEvent(KiemEvent.EXECUTION_START)) {

            if (event.isEvent(KiemEvent.EXECUTION_START)) {
                PlatformUI.createDisplay();
                Display.getDefault().asyncExec(new Runnable() {
                    public void run() {
                        ViewDebugContributor.buttonDebug.setEnabled(false);
                    }
                });
            }
        }

        if (event.isEvent(KiemEvent.EXECUTION_STOP)) {

            if (event.isEvent(KiemEvent.EXECUTION_STOP)) {
                PlatformUI.createDisplay();
                Display.getDefault().syncExec(new Runnable() {
                    public void run() {
                        ViewDebugContributor.buttonDebug.setEnabled(true);
                    }
                });
            }
            return;
        }

        if (event.isEvent(KiemEvent.STEP_INFO)) {
            plugin.updateBreakpointLines();
        }

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KiemEvent provideEventOfInterest() {
        int[] events = { KiemEvent.EXECUTION_START, KiemEvent.EXECUTION_STOP, KiemEvent.LOAD, KiemEvent.STEP_INFO };
        return new KiemEvent(events);
    }
}
