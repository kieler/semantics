package de.cau.cs.kieler.sim.kiem.ui;

import de.cau.cs.kieler.sim.kiem.IKiemEventListener;
import de.cau.cs.kieler.sim.kiem.KiemEvent;
import de.cau.cs.kieler.sim.kiem.KiemPlugin;
import de.cau.cs.kieler.sim.kiem.ui.views.KiemView;

public class KiemEventListener implements IKiemEventListener {

    public KiemEventListener() {
        // TODO Auto-generated constructor stub
    }

    public void notifyEvent(KiemEvent event) {
        if (event.isEvent(KiemEvent.VIEW_REFRESH)) {
            //KiemView.getInstance().refreshEnabledDisabledTextColors();
            KiemView.getInstance().updateViewAsync();
            KiemView.getInstance().updateEnabledEnabledDisabledUpDownAddDelete();
            KiemView.getInstance().getAimedStepDurationTextField().update();
        }
        else if (event.isEvent(KiemEvent.SET_DIRTY)) {
            KiemPlugin.getDefault().setDirty(true);
        }
        else if (event.isEvent(KiemEvent.DISABLE_UI)) {
            KiemView.getInstance().setAllEnabled(false);
            
        }
        else if (event.isEvent(KiemEvent.ENABLE_UI)) {
            KiemView.getInstance().setAllEnabled(true);
            
        }
        else if (event.isEvent(KiemEvent.SAVE)) {
            KiemPlugin.getDefault().setDirty(false);
//            // rebuild view toolbar buttons
//            KiemView.getInstance().buildLocalToolBar();
        }
        else if (event.isEvent(KiemEvent.LOAD)) {
            KiemPlugin.getDefault().setDirty(false);
//            // rebuild view toolbar buttons
//            KiemView.getInstance().buildLocalToolBar();
        }
        else if (event.isEvent(KiemEvent.CALL_FOR_SHELL)) {
            // set the shell for user dialogs
            KiemPlugin.getDefault().setShell(KiemView.getInstance().getViewSite().getShell());
        }
        else if (event.isEvent(KiemEvent.STEP_INFO)) {
            KiemView.getInstance().updateStepsAsync();
        }
    }

    public KiemEvent provideEventOfInterest() {
        int[] events = {KiemEvent.VIEW_REFRESH,
                        KiemEvent.SET_DIRTY,
                        KiemEvent.DISABLE_UI,
                        KiemEvent.ENABLE_UI,
                        KiemEvent.SAVE,
                        KiemEvent.LOAD,
                        KiemEvent.CALL_FOR_SHELL,
                        KiemEvent.STEP_INFO};
        return new KiemEvent(events);
    }

}
