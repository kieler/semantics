/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
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
 */
package de.cau.cs.kieler.sim.kiem.config.extension;

import java.util.List;

import org.eclipse.core.runtime.IPath;
import org.eclipse.ui.IEditorSite;

import de.cau.cs.kieler.sim.kiem.IKiemEventListener;
import de.cau.cs.kieler.sim.kiem.KiemEvent;
import de.cau.cs.kieler.sim.kiem.KiemPlugin;
import de.cau.cs.kieler.sim.kiem.config.KiemConfigurationPlugin;
import de.cau.cs.kieler.sim.kiem.config.data.EditorIdWrapper;
import de.cau.cs.kieler.sim.kiem.config.data.ScheduleData;
import de.cau.cs.kieler.sim.kiem.config.exception.ScheduleFileMissingException;
import de.cau.cs.kieler.sim.kiem.config.managers.EditorManager;
import de.cau.cs.kieler.sim.kiem.config.managers.ScheduleManager;
import de.cau.cs.kieler.sim.kiem.config.ui.ExecutionFileMissingDialog;
import de.cau.cs.kieler.sim.kiem.util.KiemUtil;

/**
 * Listens to all events from the main KIEM Plugin and handles file related
 * events.
 * 
 * @author soh
 * @kieler.rating 2010-01-27 proposed yellow
 */
public final class KiemEventListener implements IKiemEventListener {

    /** The list of supported KiemEvent constants for this listener. */
    private static final int[] EVENTS = { KiemEvent.LOAD, KiemEvent.SAVE,
            KiemEvent.VIEW_DONE, KiemEvent.EXECUTION_START, KiemEvent.EXECUTION_STOP };

    /**
     * The last created instance of the event listener.
     * <p>
     * Used to set the load/save imminent variables. This is done to prevent the
     * listener from reporting events that were triggered by the plugin itself.
     */
    private static KiemEventListener instance = new KiemEventListener();

    /** A plugin-triggered load is imminent, don't handle. */
    private boolean loadImminent = false;
    /** A plugin-triggered save is imminent, don't handle. */
    private boolean saveImminent = false;

    // --------------------------------------------------------------------------

    /** Creates a new FileEventListener. */
    public KiemEventListener() {
        setInstance(this);
    }

    // --------------------------------------------------------------------------

    /**
     * Setter for the instance.
     * 
     * @param instanceParam
     *            the new instance.
     */
    private static void setInstance(final KiemEventListener instanceParam) {
        instance = instanceParam;
    }

    /**
     * Returns the instance of the file event listener.
     * 
     * @return the instance
     */
    public static KiemEventListener getInstance() {
        return instance;
    }

    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void notifyEvent(final KiemEvent event) {
    	if (event.isEvent(KiemEvent.EXECUTION_START)) {
    		ScheduleManager.getInstance().setEnabled(false);
    	}
    	if (event.isEvent(KiemEvent.EXECUTION_STOP)) {
    		ScheduleManager.getInstance().setEnabled(true);
    	}
    	
        if (event.isEvent(KiemEvent.LOAD)) {
            handleLoad(event.getInfo());
        }
        if (event.isEvent(KiemEvent.SAVE)) {
            handleSave(event.getInfo());
        }
        if (event.isEvent(KiemEvent.VIEW_DONE)) {
            List<ScheduleData> schedules = ScheduleManager.getInstance()
                    .getRecentSchedules();
            if (schedules == null || schedules.isEmpty()) {
                IEditorSite editor = KiemUtil.getActiveEditor(); 

                EditorIdWrapper editorId = null;
                String editorName = null;

                if (editor != null) {
                    // get the attributes from the editor
                    editorId = new EditorIdWrapper(editor.getId());
                    editorName = editor.getRegisteredName();
                }
                if (editorId == null) {
                    editorId = EditorManager.getInstance().getDefaultEditorId();
                    editorName = EditorManager.getInstance()
                            .getDefaultEditorName();
                }
                if (editorId != null) {
                    schedules = ScheduleManager.getInstance()
                            .getMatchingSchedules(editorId, editorName);
                }
            }

            if (schedules != null && !schedules.isEmpty()) {
                try {
                    ScheduleManager.getInstance()
                            .openSchedule(schedules.get(0));
                } catch (ScheduleFileMissingException e0) {
                    ExecutionFileMissingDialog dialog = new ExecutionFileMissingDialog(
                            KiemConfigurationPlugin.getShell(), schedules
                                    .get(0));
                    dialog.open();
                }
            }
        }
    }

    /**
     * {@inheritDoc}
     */
    public KiemEvent provideEventOfInterest() {
        return new KiemEvent(EVENTS);
    }

    // --------------------------------------------------------------------------

    /**
     * Handles a user-triggered load in the main plugin.
     * 
     * @param info
     *            the event info.
     */
    private void handleLoad(final Object info) {
        if (!loadImminent) {
            ScheduleManager.getInstance().userLoaded((IPath) info);
        } else {
            loadImminent = false;
        }
        KiemPlugin.getDefault().updateViewAsync();
    }

    /**
     * Handles a user-triggered save in the main plugin.
     * 
     * @param info
     *            the event info.
     */
    private void handleSave(final Object info) {
        if (!saveImminent) {
            ScheduleManager.getInstance().userSaved((IPath) info);
        } else {
            saveImminent = false;
        }
    }

    // --------------------------------------------------------------------------

    /**
     * Notify the listener that the plugin will report a load soon but the
     * listener should ignore it as it was plugin-triggered.
     */
    public void setLoadImminent() {
        this.loadImminent = true;
    }

    /**
     * Notify the listener that the load failed and it should not expect it.
     */
    public void resetLoadImminent() {
        this.loadImminent = false;
    }

    /**
     * Notify the listener that the plugin will report a save soon but the
     * listener should ignore it as it was plugin-triggered.
     */
    public void setSaveImminent() {
        this.saveImminent = true;
    }

    /**
     * Notify the listener that the save failed and it should not expect it.
     */
    public void resetSaveImminent() {
        this.saveImminent = false;
    }
}
