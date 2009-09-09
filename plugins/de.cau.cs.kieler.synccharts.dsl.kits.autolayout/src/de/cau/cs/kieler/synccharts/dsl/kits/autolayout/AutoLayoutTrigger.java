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
package de.cau.cs.kieler.synccharts.dsl.kits.autolayout;

import org.eclipse.gef.EditPart;
import org.eclipse.ui.IEditorPart;

import de.cau.cs.kieler.viewmanagement.ATrigger;
import de.cau.cs.kieler.viewmanagement.TriggerEventObject;

/**
 * @author oba
 *
 */
public class AutoLayoutTrigger extends ATrigger {
	TriggerEventObject triggerEvent; //the trigger event object 
    /**
     * Called by a client to perform an auto layout 
     * @param editPart The active edit part 
     * @param editorPart The active editor part
     */
    public void triggerAutoLayout(EditPart editPart, IEditorPart editorPart) {
        triggerEvent = new TriggerEventObject();
        triggerEvent.setTriggerActive(true);
        triggerEvent.setAffectedObject( translateToURI(editPart) );
        triggerEvent.setParameters(editorPart );
        //hier muessten die TriggerListener hinzugefuegt sein
        // damit bei notifyTrigger was passiert
        
        notifyTrigger(triggerEvent);
    }

	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.viewmanagement.ATrigger#finalize()
	 */
	@Override
	public void finalize() {
		// TODO Auto-generated method stub

	}

}
