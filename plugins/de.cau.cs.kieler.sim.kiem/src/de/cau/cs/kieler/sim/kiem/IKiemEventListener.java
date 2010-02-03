/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */

package de.cau.cs.kieler.sim.kiem;

/**
 * <p>
 * Classes implementing this interface can listen to events happening anywhere
 * in KIEM.
 * </p>
 * <p>
 * When an event successfully completes somewhere inside the KIEM plugin, the
 * plugin may choose to notify the listeners of this event.
 * </p>
 * <p>
 * {@link de.cau.cs.kieler.sim.kiem.KiemEvent}
 * </p>
 * 
 * @author soh
 * @kieler.rating 2010-02-03 proposed yellow
 */
public interface IKiemEventListener {

    /**
     * This is the basic notify method that is called by KIEM whenever an event
     * occurs for which this EventListener is registered (see
     * {@link #provideEventOfInterest()}).
     * 
     * @param event
     *            the KiemEvent with additional attached information, depending
     *            on the specific event
     */
    void notifyEvent(final KiemEvent event);

    /**
     * <p>
     * Return a KiemEvent type (integer value) that represents a number of
     * events this component wants to listen to.
     * </p>
     * <p>
     * A KiemEvent can be a combination of several events. The simplest way to
     * register for two events that e.g., indicate a step-command and the
     * removal of the component is to have the following code:
     * </p>
     * <p>
     * public KiemEvent provideEventOfInterest() {<BR>
     * int[] events = {CMD_STEP, DELETED}<BR>
     * return new KiemEvent(events);<BR>
     * }
     * </p>
     * 
     * @return the KiemEvent type indicating the events of interest
     */
    KiemEvent provideEventOfInterest();
}
