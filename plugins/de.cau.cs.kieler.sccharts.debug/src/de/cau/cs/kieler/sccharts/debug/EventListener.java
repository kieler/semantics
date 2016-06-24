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
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.model.IBreakpoint;
import org.eclipse.debug.core.model.LineBreakpoint;

import de.cau.cs.kieler.sccharts.debug.ui.SCChartsDebugModelPresentation;
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
     * {@inheritDoc}
     */
    @Override
    public void notifyEvent(KiemEvent event) {
        if (event.isEvent(KiemEvent.EXECUTION_START)) {
            SCChartsDebugPlugin.getDefault().updateBreakpointLines();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KiemEvent provideEventOfInterest() {
        int[] events = { KiemEvent.ACTIVATED, KiemEvent.EXECUTION_START };
        return new KiemEvent(events);
    }
}
