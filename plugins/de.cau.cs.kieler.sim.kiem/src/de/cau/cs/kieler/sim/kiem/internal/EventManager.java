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

package de.cau.cs.kieler.sim.kiem.internal;

import java.util.HashMap;
import java.util.LinkedList;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;

import de.cau.cs.kieler.sim.kiem.IKiemEventListener;
import de.cau.cs.kieler.sim.kiem.KiemEvent;

/**
 * The event manager holds several listener-lists for each available event.
 * These listeners can be easily notified with optionally attached information.
 * 
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 * 
 */
public class EventManager {

    /** The lists for each (used) event one. */
    private HashMap<Double, LinkedList<DataComponentWrapper>> lists;

    /** The Event Listener lists for each (used) event . */
    private HashMap<Double, LinkedList<IKiemEventListener>> listenerLists;

    // ------------------------------------------------------------------------

    /**
     * Instantiates a new EventManager.
     */
    public EventManager() {
        // create a new list hashmap for easy access to a list for a specific
        // event type
        lists = new HashMap<Double, LinkedList<DataComponentWrapper>>();
        listenerLists = new HashMap<Double, LinkedList<IKiemEventListener>>();
        addEventListeners();
    }

    private void addEventListeners() {
        IConfigurationElement[] contributors = Platform.getExtensionRegistry()
                .getConfigurationElementsFor(
                        "de.cau.cs.kieler.sim.kiem.eventListener");

        for (IConfigurationElement element : contributors) {
            try {
                IKiemEventListener contributor = (IKiemEventListener) (element
                        .createExecutableExtension("class"));
                add(contributor);
            } catch (CoreException e0) {
                // TODO Auto-generated catch block
                e0.printStackTrace();
            }
        }
    }

    /**
     * Adds the IKiemEventListener to one or more event lists. Event lists are
     * only instantiated if they are needed, i.e., at least one listener
     * registers for an event.
     * 
     * @param listener
     *            the listener
     */
    public void add(final IKiemEventListener listener) {
        KiemEvent events = listener.provideEventOfInterest();
        for (double event : events.getEventCodesAsList()) {
            if (!listenerLists.containsKey(event)) {
                // create new event list
                LinkedList<IKiemEventListener> eventList = new LinkedList<IKiemEventListener>();
                listenerLists.put(event, eventList);
            }
            // retrieve the list of IKiemEventListener that registered for this
            // event
            LinkedList<IKiemEventListener> eventList = (LinkedList<IKiemEventListener>) listenerLists
                    .get(event);
            // add the new IKiemEventListener to this list
            eventList.add(listener);
        }
    }

    // ------------------------------------------------------------------------

    /**
     * Adds the DataComponentWrapper to one or more event lists. Event lists are
     * only instantiated if they are needed, i.e., at least one component
     * registers for an event.
     * 
     * @param dataComponentWrapper
     *            the data component wrapper
     */
    public void add(final DataComponentWrapper dataComponentWrapper) {
        AbstractDataComponent dataComponent = dataComponentWrapper
                .getDataComponent();
        KiemEvent events = dataComponent.provideEventOfInterest();
        for (double event : events.getEventCodesAsList()) {
            if (!lists.containsKey(event)) {
                // create new event list
                LinkedList<DataComponentWrapper> eventList = new LinkedList<DataComponentWrapper>();
                lists.put(event, eventList);
            }
            // retrieve the list of DataComponents that registered for this
            // event
            LinkedList<DataComponentWrapper> eventList = (LinkedList<DataComponentWrapper>) lists
                    .get(event);
            // add the new DataComponentWrapper to this list
            eventList.add(dataComponentWrapper);
        }
    }

    // ------------------------------------------------------------------------

    /**
     * Removes the DataComponentWrapper from all event list it has registered.
     * Will remove event lists if they do not contain any DataComponents any
     * more.
     * 
     * @param dataComponentWrapper
     *            the data component wrapper
     */
    public void remove(final DataComponentWrapper dataComponentWrapper) {
        AbstractDataComponent dataComponent = dataComponentWrapper
                .getDataComponent();
        KiemEvent events = dataComponent.provideEventOfInterest();
        for (double event : events.getEventCodesAsList()) {
            if (!lists.containsKey(event)) {
                // this should not happen because a component should
                // be registered first
                continue;
            }
            // retrieve the list of DataComponents that registered for this
            // event
            LinkedList<DataComponentWrapper> eventList = (LinkedList<DataComponentWrapper>) lists
                    .get(event);
            if (eventList.contains(dataComponentWrapper)) {
                // remove the new DataComponentWrapper to this list
                eventList.remove(dataComponentWrapper);
                // check if list is now empty
                if (eventList.size() == 0) {
                    lists.remove(event);
                }
            }
        }
    }

    // ------------------------------------------------------------------------

    /**
     * Notify all registered DataComponents via the KiemEvent mechanism. This
     * helper method wraps the creation of a KiemEvent object.
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
        LinkedList<DataComponentWrapper> doneList = new LinkedList<DataComponentWrapper>();
        LinkedList<IKiemEventListener> doneList2 = new LinkedList<IKiemEventListener>();

        // for all notification events
        for (double event : events.getEventCodesAsList()) {

            if (lists.containsKey(event)) {
                // retrieve the list of DataComponents that registered for this
                // event
                LinkedList<DataComponentWrapper> eventList = (LinkedList<DataComponentWrapper>) lists
                        .get(event);

                // notify all dataComponents
                for (DataComponentWrapper dataComponentWrapper : eventList) {
                    if (!doneList.contains(dataComponentWrapper)) {
                        dataComponentWrapper.getDataComponent().notifyEvent(
                                events);
                        // prevent double invocations for multiple events at the
                        // same time
                        doneList.add(dataComponentWrapper);
                    }
                }
            }

            if (listenerLists.containsKey(event)) {
                // retrieve the list of DataComponents that registered for this
                // event
                LinkedList<IKiemEventListener> eventList2 = listenerLists
                        .get(event);

                // notify all dataComponents
                for (IKiemEventListener eventListener : eventList2) {
                    if (!doneList.contains(eventListener)) {
                        eventListener.notifyEvent(events);
                        // prevent double invocations for multiple events at the
                        // same time
                        doneList2.add(eventListener);
                    }
                }
            }
        }
    }
}
