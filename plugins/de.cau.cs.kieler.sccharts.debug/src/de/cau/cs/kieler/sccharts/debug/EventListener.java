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

//    private int oldStepDuration = KiemPlugin.AIMED_STEP_DURATION_DEFAULT;

    /**
     * {@inheritDoc}
     */
    @Override
    public void notifyEvent(KiemEvent event) {

        if (event.isEvent(KiemEvent.LOAD)) {
            IPath path = (IPath) event.getInfo();
            if (!path.equals(new Path("/execution/sccharts_c_debug.execution"))) {
                if (DataComponent.DEBUG_MODE) {
                    SCChartsDebugPlugin.getDefault().scheduleDefaultDebugExecution();
                }
            }
            return;
        }

        if (event.isEvent(KiemEvent.EXECUTION_START) || event.isEvent(KiemEvent.CMD_RUN)) {

            if (event.isEvent(KiemEvent.EXECUTION_START)) {
                PlatformUI.createDisplay();
                Display.getDefault().asyncExec(new Runnable() {
                    public void run() {
                        ViewDebugContributor.buttonDebug.setEnabled(false);
                    }
                });
            }

            SCChartsDebugPlugin.getDefault().updateBreakpointLines();
//            if (DataComponent.FAST_FORWARD) {
//                oldStepDuration = KiemPlugin.getDefault().getAimedStepDuration();
//                KiemPlugin.getDefault().setAimedStepDuration(0);
//            } else {
//                KiemPlugin.getDefault().setAimedStepDuration(oldStepDuration);
//            }
        }

        if (event.isEvent(KiemEvent.EXECUTION_STOP) || event.isEvent(KiemEvent.CMD_PAUSE)) {
            
//            if (DataComponent.FAST_FORWARD) {
//                KiemPlugin.getDefault().setAimedStepDuration(oldStepDuration);
//            }
            
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

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KiemEvent provideEventOfInterest() {
        int[] events = { KiemEvent.EXECUTION_START, KiemEvent.EXECUTION_STOP, KiemEvent.CMD_PAUSE,
                KiemEvent.CMD_RUN, KiemEvent.LOAD };
        return new KiemEvent(events);
    }
}
