package de.cau.cs.kieler.synccharts.viewmanagement;

import java.util.LinkedList;
import java.util.List;

import de.cau.cs.kieler.viewmanagement.ACombination;
import de.cau.cs.kieler.viewmanagement.ATrigger;
import de.cau.cs.kieler.viewmanagement.TriggerEventObject;
import de.cau.cs.kieler.viewmanagement.effects.LayoutEffect;
import de.cau.cs.kieler.viewmanagement.effects.ZoomEffect;

public class SizeChangedLayoutCombination extends ACombination {

    @Override
    public boolean evaluate(TriggerEventObject triggerEvent) {
        // always execute
        return true;
    }

    @Override
    public void execute() {
        new LayoutEffect().execute();
        new ZoomEffect().execute();
    }

    @Override
    protected List<ATrigger> getTriggers() {
        List<ATrigger> list = new LinkedList<ATrigger>();
        list.add(new LabelSizeChangedTrigger.ViewManagementTrigger());
        return list;
    }

}
