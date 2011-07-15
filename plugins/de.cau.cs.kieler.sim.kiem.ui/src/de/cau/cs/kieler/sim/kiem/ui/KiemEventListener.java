/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */

package de.cau.cs.kieler.sim.kiem.ui;

import org.eclipse.swt.widgets.Display;

import de.cau.cs.kieler.sim.kiem.IKiemEventListener;
import de.cau.cs.kieler.sim.kiem.KiemEvent;
import de.cau.cs.kieler.sim.kiem.KiemPlugin;
import de.cau.cs.kieler.sim.kiem.ui.views.KiemView;

/**
 * The Event Listener for the KIELER Execution Manager.
 * 
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 * @kieler.rating 2010-01-15 proposed yellow
 * 
 */
public class KiemEventListener implements IKiemEventListener {

    /**
     * Instantiates a new kiem event listener.
     */
    public KiemEventListener() {
        // nothing
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void notifyEvent(final KiemEvent event) {
        Display.getDefault().asyncExec(new Runnable() {
            public void run() {
                if (KiemView.getInstance() != null) {

                    if (event.isEvent(KiemEvent.VIEW_REFRESH)) {
                        // KiemView.getInstance().refreshEnabledDisabledTextColors();
                        KiemView.getInstance().updateViewAsync();
                        KiemView.getInstance().updateEnabledEnabledDisabledUpDownAddDelete();
                        KiemView.getInstance().getAimedStepDurationTextField().update();
                    } else if (event.isEvent(KiemEvent.SET_DIRTY)) {
                        KiemPlugin.getDefault().setDirty(true);
                    } else if (event.isEvent(KiemEvent.DISABLE_UI)) {
                        KiemView.getInstance().setAllEnabled(false);
                        KiemView.getInstance().updateViewAsync();
                    } else if (event.isEvent(KiemEvent.ENABLE_UI)) {
                        KiemView.getInstance().setAllEnabled(true);
                        KiemView.getInstance().updateViewAsync();
                    } else if (event.isEvent(KiemEvent.SAVE)) {
                        KiemPlugin.getDefault().setDirty(false);
                        KiemView.getInstance().setDirty(false);
                        // // rebuild view toolbar buttons
                        // KiemView.getInstance().buildLocalToolBar();
                    } else if (event.isEvent(KiemEvent.LOAD)) {
                        if (KiemPlugin.DEBUG) {
                            System.out.println("LOAD EVENT");
                        }
                        // KiemView.getInstance().createPartControl();
                        KiemPlugin.getDefault().setDirty(false);
                        KiemView.getInstance().setDirty(false);
                        KiemView.getInstance().updateViewAsync();
                        // // rebuild view toolbar buttons
                        // KiemView.getInstance().buildLocalToolBar();
                    } else if (event.isEvent(KiemEvent.CALL_FOR_SHELL)) {
                        // set the shell for user dialogs
                        KiemPlugin.getDefault().setShell(
                                KiemView.getInstance().getViewSite().getShell());
                    } else if (event.isEvent(KiemEvent.STEP_INFO)) {
                        KiemView.getInstance().updateStepsAsync();
                    } else if (event.isEvent(KiemEvent.ERROR_STOP)) {
                        // KiemView.getInstance().setAllEnabled(true);
                        KiemView.getInstance().updateViewAsync();
                    } else if (event.isEvent(KiemEvent.ERROR_PAUSE)) {
                        // KiemView.getInstance().setAllEnabled(true);
                        KiemView.getInstance().updateViewAsync();
                    }
                }
            }
        });

    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public KiemEvent provideEventOfInterest() {
        int[] events = { KiemEvent.VIEW_REFRESH, KiemEvent.SET_DIRTY, KiemEvent.DISABLE_UI,
                KiemEvent.ENABLE_UI, KiemEvent.SAVE, KiemEvent.LOAD, KiemEvent.CALL_FOR_SHELL,
                KiemEvent.STEP_INFO, KiemEvent.ERROR_STOP, KiemEvent.ERROR_PAUSE };
        return new KiemEvent(events);
    }

}
