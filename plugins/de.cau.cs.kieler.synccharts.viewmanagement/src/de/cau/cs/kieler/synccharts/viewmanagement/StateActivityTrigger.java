package de.cau.cs.kieler.synccharts.viewmanagement;

import de.cau.cs.kieler.viewmanagement.ATrigger;
import de.cau.cs.kieler.viewmanagement.TriggerEventObject;

public class StateActivityTrigger extends ATrigger {

    static StateActivityTrigger instance;
    
    public StateActivityTrigger() {
        instance = this;
    }

    @Override
    public void finalize() {
       instance = null;
    }
    
    /**
     * Notify the viewmanagement about an event that has
     * been detected by this trigger.
     * Overriding the protected superclass method in order to
     * make it public.
     */
    public synchronized void notifyTrigger2(TriggerEventObject triggerEvent) {
        super.notifyTrigger(triggerEvent);
    }
}
