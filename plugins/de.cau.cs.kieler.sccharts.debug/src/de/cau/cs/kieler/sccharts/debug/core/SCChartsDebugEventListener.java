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
package de.cau.cs.kieler.sccharts.debug.core;

import de.cau.cs.kieler.sim.kiem.IKiemEventListener;
import de.cau.cs.kieler.sim.kiem.KiemEvent;

/**
 * @author lgr
 *
 */
public class SCChartsDebugEventListener implements IKiemEventListener {

    /**
     * {@inheritDoc}
     */
    @Override
    public void notifyEvent(KiemEvent event) {
        // TODO: implement nice simulation stopping
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KiemEvent provideEventOfInterest() {
        int[] events = {KiemEvent.CMD_RUN, KiemEvent.EXECUTION_START};
        return new KiemEvent(events);
    }

    
}
