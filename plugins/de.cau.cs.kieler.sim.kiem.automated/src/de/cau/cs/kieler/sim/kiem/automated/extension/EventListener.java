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
package de.cau.cs.kieler.sim.kiem.automated.extension;

import de.cau.cs.kieler.sim.kiem.IKiemEventListener;
import de.cau.cs.kieler.sim.kiem.KiemEvent;
import de.cau.cs.kieler.sim.kiem.automated.execution.ExecutionManager;

/**
 * The event listener listens to events coming from the KIEM that are related to
 * the execution.
 * 
 * @author soh
 * @kieler.rating 2010-01-29 proposed yellow
 */
public class EventListener implements IKiemEventListener {

    /** The events that the listener is interested in. */
    private static final int[] EVENTS = { KiemEvent.CMD_PAUSE,
            KiemEvent.CMD_STOP, KiemEvent.ERROR_PAUSE, KiemEvent.ERROR_STOP,
            KiemEvent.STEP_INFO, KiemEvent.STEP_DONE };

    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void notifyEvent(final KiemEvent event) {
        if (ExecutionManager.getInstance().isRunning()) {
            // don't want to block notifier
            Thread worker = new WorkerThread(event);
            worker.start();
        }
    }

    /**
     * {@inheritDoc}
     */
    public KiemEvent provideEventOfInterest() {
        return new KiemEvent(EVENTS);
    }

    /**
     * The worker thread for relaying the received events to the plug-in without
     * blocking the notifying thread.
     * 
     * @author soh
     * @kieler.rating 2010-02-03 proposed yellow
     */
    private static class WorkerThread extends Thread {

        /** the event that was received. */
        private KiemEvent event;

        /**
         * Creates a new WorkerThread.
         * 
         * @param eventParam
         *            the event that was received
         */
        public WorkerThread(final KiemEvent eventParam) {
            this.event = eventParam;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public void run() {
            if (event.isEvent(KiemEvent.STEP_DONE)) {
                ExecutionManager.getInstance().notifyOnStepFinished();
            }
            if (event.isEvent(KiemEvent.CMD_STOP)) {
                ExecutionManager.getInstance().notifyOnUserStop();
            }
            if (event.isEvent(KiemEvent.CMD_PAUSE)) {
                ExecutionManager.getInstance().notifyOnUserPause();
            }
            if (event.isEvent(KiemEvent.ERROR_STOP)) {
                ExecutionManager.getInstance().notifyOnErrorStop();
            }
            if (event.isEvent(KiemEvent.ERROR_PAUSE)) {
                ExecutionManager.getInstance().notifyOnErrorPause();
            }
        }

    }
}
