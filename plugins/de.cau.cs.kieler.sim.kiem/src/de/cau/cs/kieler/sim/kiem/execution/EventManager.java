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

package de.cau.cs.kieler.sim.kiem.execution;

import java.util.HashMap;
import java.util.LinkedList;

import de.cau.cs.kieler.sim.kiem.data.DataComponentEx;
import de.cau.cs.kieler.sim.kiem.extension.DataComponent;
import de.cau.cs.kieler.sim.kiem.extension.KiemEvent;

/**
 * The event manager holds several listener-lists for each available event. These listeners can be
 * easily notified with optionally attached information.
 * 
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 * 
 */
public class EventManager {

    /** The lists for each (used) event one. */
    private HashMap<Integer, LinkedList<DataComponentEx>> lists;

    // ------------------------------------------------------------------------

    /**
     * Instantiates a new EventManager.
     */
    public EventManager() {
        // create a new list hashmap for easy access to a list for a specific
        // event type
        lists = new HashMap<Integer, LinkedList<DataComponentEx>>();
    }

    // ------------------------------------------------------------------------

    /**
     * Adds the DataComponentEx to one or more event lists. Event lists are only instantiated if
     * they are needed, i.e., at least one component registers for an event.
     * 
     * @param dataComponentEx
     *            the DataComponentEx
     */
    public void add(final DataComponentEx dataComponentEx) {
        DataComponent dataComponent = dataComponentEx.getDataComponent();
        KiemEvent events = dataComponent.provideEventOfInterest();
        for (int event : events.getEventsAsList()) {
            if (!lists.containsKey(event)) {
                // create new event list
                LinkedList<DataComponentEx> eventList = new LinkedList<DataComponentEx>();
                lists.put(event, eventList);
            }
            // retrieve the list of DataComponents that registered for this event
            LinkedList<DataComponentEx> eventList = (LinkedList<DataComponentEx>) lists.get(event);
            // add the new DataComponentEx to this list
            eventList.add(dataComponentEx);
        }
    }

    // ------------------------------------------------------------------------

    /**
     * Removes the DataComponentEx from all event list it has registered. Will remove event lists if
     * they do not contain any DataComponents any more.
     * 
     * @param dataComponentEx
     *            the DataComponentEx
     */
    public void remove(final DataComponentEx dataComponentEx) {
        DataComponent dataComponent = dataComponentEx.getDataComponent();
        KiemEvent events = dataComponent.provideEventOfInterest();
        for (int event : events.getEventsAsList()) {
            if (!lists.containsKey(event)) {
                // this should not happen because a component should
                // be registered first
                continue;
            }
            // retrieve the list of DataComponents that registered for this event
            LinkedList<DataComponentEx> eventList = (LinkedList<DataComponentEx>) lists.get(event);
            if (eventList.contains(dataComponentEx)) {
                // remove the new DataComponentEx to this list
                eventList.remove(dataComponentEx);
                // check if list is now empty
                if (eventList.size() == 0) {
                    lists.remove(event);
                }
            }
        }
    }

    // ------------------------------------------------------------------------

    /**
     * Notify all registered DataComponents via the KiemEvent mechanism. This helper method wraps
     * the creation of a KiemEvent object.
     * 
     * @param event
     *            the event as an KiemEvent (integer) constant
     */
    public void notify(final int event) {
        notify(new KiemEvent(event));
    }

    // ------------------------------------------------------------------------

    /**
     * Notify all registered DataComponents via the KiemEvent mechanism.
     * 
     * @param events
     *            the event containing optional additional information
     */
    public void notify(final KiemEvent events) {
        LinkedList<DataComponentEx> doneList = new LinkedList<DataComponentEx>();

        // for all notification events
        for (int event : events.getEventsAsList()) {
            if (!lists.containsKey(event)) {
                // if no DataComponent registered for this event, no one needs to
                // be notified --> simply return!
                continue;
            }
            // retrieve the list of DataComponents that registered for this event
            LinkedList<DataComponentEx> eventList = (LinkedList<DataComponentEx>) lists.get(event);

            // notify all dataComponents
            for (DataComponentEx dataComponentEx : eventList) {
                if (!doneList.contains(dataComponentEx)) {
                    dataComponentEx.getDataComponent().notifyEvent(events);
                    // prevent double invocations for multiple events at the same time
                    doneList.add(dataComponentEx);
                }
            }
        }
    }

}
