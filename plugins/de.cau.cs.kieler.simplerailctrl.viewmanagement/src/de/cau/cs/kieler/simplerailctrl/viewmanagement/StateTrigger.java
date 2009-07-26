/******************************************************************************
 * KIELER - Kiel Integrated Environment for Layout for the Eclipse RCP
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
 * 
 *****************************************************************************/

package de.cau.cs.kieler.simplerailctrl.viewmanagement;

import de.cau.cs.kieler.viewmanagement.ATrigger;
import de.cau.cs.kieler.viewmanagement.TriggerEventObject;

public class StateTrigger extends ATrigger {

	static StateTrigger instance;
	
	public static StateTrigger getInstance() {
		return instance;
	}
	
	public StateTrigger() {
		// TODO Auto-generated constructor stub
		instance = this;
	}

	@Override
	public void finalize() {
		// TODO Auto-generated method stub
	    instance = null;
	}
	
    /**
     * Notify the viewmanagement about an event that has
     * been detected by this trigger.
     * Overriding the protected superclass method in order to
     * make it public.
     */
    @Override
    public synchronized void notifyTrigger(TriggerEventObject triggerEvent) {
        super.notifyTrigger(triggerEvent);
    }
	

}
