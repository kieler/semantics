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
 ******************************************************************************/

package de.cau.cs.kieler.simplerailctrl.viewmanagement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;

import de.cau.cs.kieler.viewmanagement.ACombination;
import de.cau.cs.kieler.viewmanagement.ATrigger;
import de.cau.cs.kieler.viewmanagement.RunLogic;
import de.cau.cs.kieler.viewmanagement.TriggerEventObject;
import de.cau.cs.kieler.viewmanagement.effects.HighlightEffect;

/**
 * The class StateCombination implements a combination for the KIELER
 * view management that is a trigger and an effect for the state
 * highlighting in the SimpleRailCtrl editor.
 * 
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 */
public class StateCombination extends ACombination {

    /** The root EditPart of the editor. */
    private EditPart rootEditPart;

    /** The trigger. */
	StateTrigger trigger;

    /** The effects. */
    Map<EditPart, HighlightEffect> effects = 
    				new HashMap<EditPart, HighlightEffect>();

    /** The single instance of this plug-in. */
    private static StateCombination instance;
    
	//-------------------------------------------------------------------------
    
    /**
	 * Instantiates a new StateCombination.
	 */
	public StateCombination() {
		StateCombination.instance = this;
    }

	//-------------------------------------------------------------------------
	
	/**
	 * Gets the single instance of StateCombination.
	 * 
	 * @return single instance of StateCombination
	 */
	public static StateCombination getInstance() {
		return StateCombination.instance;
	}

	//-------------------------------------------------------------------------
    
	/**
	 * Sets a new root EditPart.
	 * 
	 * @param rootEditPart the new root EditPart
	 */
	public void setRootEditPart(EditPart rootEditPart) {
    	this.rootEditPart = rootEditPart;
    }

    //-------------------------------------------------------------------------

    /* (non-Javadoc)
	 * @see de.cau.cs.kieler.viewmanagement.ACombination#evaluate(de.cau.cs.kieler.viewmanagement.TriggerEventObject)
	 */
	@Override
    public boolean evaluate(TriggerEventObject triggerEvent) {
		//rootEditPart must be set before!
        if (rootEditPart != null) {
        	EditPart editPart = this.translateToEditPart(
        							triggerEvent.toString(),
        							rootEditPart); 
            triggerEvent.getAffectedObject();
    		if (triggerEvent.getTriggerState() 
    				&& !effects.containsKey(editPart)) {
    					HighlightEffect effect = new HighlightEffect();
    					effect.setTarget((ShapeEditPart)editPart);
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

	//-------------------------------------------------------------------------

    /* (non-Javadoc)
	 * @see de.cau.cs.kieler.viewmanagement.ACombination#execute()
	 */
	@Override
    public void execute() {
        for (HighlightEffect effect : effects.values()) {
            effect.execute();
        }
    }

	//-------------------------------------------------------------------------
    
    /* (non-Javadoc)
	 * @see de.cau.cs.kieler.viewmanagement.ACombination#getTriggers()
	 */
	@Override
    public List<ATrigger> getTriggers() {
        List<ATrigger> triggers = new ArrayList<ATrigger>();
        trigger = (StateTrigger) RunLogic
                .getTrigger("View Management Trigger");
        triggers.add(trigger);
        return triggers;
    }

	//-------------------------------------------------------------------------

    /* (non-Javadoc)
	 * @see de.cau.cs.kieler.viewmanagement.ACombination#undoLastEffect()
	 */
	@Override
	public void undoLastEffect() {
		
    	//not supported
	}

}
