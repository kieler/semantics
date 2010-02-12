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

import org.eclipse.core.runtime.IPath;

import de.cau.cs.kieler.sim.kiem.IKiemEventListener;
import de.cau.cs.kieler.sim.kiem.KiemEvent;
import de.cau.cs.kieler.sim.kiem.config.managers.ScheduleManager;

/**
 * Listens to all events from the main KIEM Plugin and handles file related
 * events.
 * 
 * @author soh
 * @kieler.rating 2010-01-27 proposed yellow
 */
public final class KiemEventListener implements IKiemEventListener {

    /** The list of supported KiemEvent constants for this listener. */
    private static final int[] EVENTS = { KiemEvent.LOAD, KiemEvent.SAVE };

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
        if (event.isEvent(KiemEvent.LOAD)) {
            handleLoad(event.getInfo());
        }
        if (event.isEvent(KiemEvent.SAVE)) {
            handleSave(event.getInfo());
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
