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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;

import de.cau.cs.kieler.viewmanagement.ACombination;
import de.cau.cs.kieler.viewmanagement.ATrigger;
import de.cau.cs.kieler.viewmanagement.RunLogic;
import de.cau.cs.kieler.viewmanagement.TriggerEventObject;
import de.cau.cs.kieler.viewmanagement.effects.HighlightEffect;

public class StateCombination extends ACombination {

	StateTrigger trigger;

    Map<ShapeNodeEditPart, HighlightEffect> effects = new HashMap<ShapeNodeEditPart, HighlightEffect>();


    @Override
    public boolean evaluate(TriggerEventObject triggerEvent) {
        // TODO: rename Trigger Toggle in
        if (triggerEvent.getAffectedObject() instanceof ShapeNodeEditPart) {
        	ShapeNodeEditPart editPart = (ShapeNodeEditPart) triggerEvent
            .getAffectedObject();
    			if (triggerEvent.getTriggerToggle() && !effects.containsKey(editPart)) {
    					HighlightEffect effect = new HighlightEffect();
    					effect.setTarget(editPart);
    					effects.put(editPart, effect);
    					return true;
    			} else {
    				HighlightEffect effect = effects.get(editPart);
    				if(effect!=null)
    					effect.undo();
    				effects.remove(editPart);
    			}
        }
        return false;
    }

    @Override
    public void execute() {
        for (HighlightEffect effect : effects.values()) {
            effect.execute();
        }
    }

    @Override
    public List<ATrigger> getTriggers() {
        List<ATrigger> triggers = new ArrayList<ATrigger>();
        trigger = (StateTrigger) RunLogic
                .getTrigger("View Management Trigger");
        triggers.add(trigger);
        return triggers;
    }

}
