package de.cau.cs.kieler.synccharts.viewmanagement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeEditPart;

import de.cau.cs.kieler.viewmanagement.ACombination;
import de.cau.cs.kieler.viewmanagement.ATrigger;
import de.cau.cs.kieler.viewmanagement.RunLogic;
import de.cau.cs.kieler.viewmanagement.TriggerEventObject;
import de.cau.cs.kieler.viewmanagement.effects.HighlightEffect;

public class ActiveStateHighlightCombination extends ACombination {

    StateActivityTrigger trigger;

    Map<ShapeEditPart, HighlightEffect> effects = new HashMap<ShapeEditPart, HighlightEffect>();

    @Override
    public boolean evaluate(TriggerEventObject triggerEvent) {
      
        if ((translateToEditPart(triggerEvent.getAffectedObject(), null)) instanceof EditPart) {
            EditPart editPart = (EditPart) translateToEditPart(triggerEvent
                    .getAffectedObject(), null);
            if (triggerEvent.getTriggerState() && !effects.containsKey(editPart)) {
                HighlightEffect effect = new HighlightEffect();
                effect.setTarget((ShapeEditPart)editPart);
                effect.execute();
//                effects.put(editPart, effect);
                
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
        trigger = (StateActivityTrigger) RunLogic
                .getTrigger("State Activity Trigger");
        triggers.add(trigger);
        return triggers;
    }

	@Override
	public void undoLastEffect() {
		// TODO Auto-generated method stub
		
	}

}
