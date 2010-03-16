package de.cau.cs.kieler.synccharts.viewmanagement;

import de.cau.cs.kieler.viewmanagement.ATrigger;
import de.cau.cs.kieler.viewmanagement.TriggerEventObject;

/**
 * Trigger for tracking state activity.
 * 
 */
public class StateActivityTrigger extends ATrigger {

    /** instance of the trigger. */
    static StateActivityTrigger instance;

    /**
     * 
     * Creates a new StateActivityTrigger.
     * 
     */
    public StateActivityTrigger() {
        instance = this;
    }

    @Override
    public void finalize() {
        // instance = null;
    }

    /**
     * Notify the viewmanagement about an event that has been detected by this
     * trigger. Overriding the protected superclass method in order to make it
     * public.
     * 
     * @param triggerEvent
     *            the event
     */
    public synchronized void notifyTrigger2(
            final TriggerEventObject triggerEvent) {
        super.notifyTrigger(triggerEvent);
    }
}
