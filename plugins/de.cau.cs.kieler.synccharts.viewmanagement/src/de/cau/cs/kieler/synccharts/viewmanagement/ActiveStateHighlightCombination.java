package de.cau.cs.kieler.synccharts.viewmanagement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeEditPart;

import de.cau.cs.kieler.viewmanagement.ACombination;
import de.cau.cs.kieler.viewmanagement.ATrigger;
import de.cau.cs.kieler.viewmanagement.RunLogic;
import de.cau.cs.kieler.viewmanagement.TriggerEventObject;
import de.cau.cs.kieler.viewmanagement.effects.HighlightEffect;

public class ActiveStateHighlightCombination extends ACombination {
    /** The root EditPart of the editor. */
    private EditPart rootEditPart;

    /** The single instance of this plug-in. */
    private static ActiveStateHighlightCombination instance;
    
    /**
	 * Instantiates a new StateCombination.
	 */
	public ActiveStateHighlightCombination() {
		ActiveStateHighlightCombination.instance = this;
		//StateCombination.getInstance().setActive(true);
    }

	
	/** 
	 * @return single instance of StateCombination
	 */
	public static ActiveStateHighlightCombination getInstance() {
		return ActiveStateHighlightCombination.instance;
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
	
    StateActivityTrigger trigger;

    Map<EditPart, HighlightEffect> effects = new HashMap<EditPart, HighlightEffect>();

    @Override
    public boolean evaluate(TriggerEventObject triggerEvent) {
        if (rootEditPart != null) {
        	EditPart editPart = this.translateToEditPart(
        							triggerEvent.getAffectedObject(),
        							rootEditPart); 
        	if (editPart instanceof ShapeEditPart) {
                triggerEvent.getAffectedObject();
        		if (triggerEvent.getTriggerState() 
        				&& !effects.containsKey(editPart)) {
        					HighlightEffect effect = new HighlightEffect();
        					effect.setTarget((ShapeEditPart)editPart);
        					effect.setHighlightFigure(3, ColorConstants.red );
        					effects.put(editPart, effect);
        					return true;
       			} else if (!triggerEvent.getTriggerState()) {
        				HighlightEffect effect = effects.get(editPart);
        				if(effect!=null)
        					effect.undo();
        				effects.remove(editPart);
       			}
        	}
        }
//        if ((translateToEditPart(triggerEvent.getAffectedObject(), rootEditPart)) instanceof EditPart) {
//            EditPart editPart = (EditPart) translateToEditPart(triggerEvent
//                    .getAffectedObject(), rootEditPart);
//            if (triggerEvent.getTriggerState() && !effects.containsKey(editPart)) {
//                HighlightEffect effect = new HighlightEffect();
//                effect.setTarget((ShapeEditPart)editPart);
//                effect.execute();
//                effects.put(editPart, effect);
//                return true;
//            } else {
//                HighlightEffect effect = effects.get(editPart);
//                if(effect!=null) {
//                    //effect.undo();
//                }
//                effects.remove(editPart);
//            }
//        }
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
        trigger = (StateActivityTrigger) RunLogic
                .getTrigger("State Activity Trigger");
        triggers.add(trigger);
        return triggers;
    }
    
	@Override
	public void undoLastEffect() {
		//	effect.undo();
	}
	
   
}
