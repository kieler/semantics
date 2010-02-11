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

package de.cau.cs.kieler.sim.kiem.config.managers;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.InstanceScope;

import de.cau.cs.kieler.sim.kiem.config.KiemConfigurationPlugin;
import de.cau.cs.kieler.sim.kiem.config.data.KiemConfigEvent;

/**
 * Abstract super class for all manager classes in this package.
 * <p>
 * It provides methods for other classes to register as listeners to any
 * manager. The implementing subclasses can dispatch events and inform listeners
 * of events occurring.
 * <p>
 * It also provides a means for the subclasses to load and save Strings in the
 * Eclipse Preference Store.
 * 
 * 
 * @author soh
 * @kieler.rating 2010-01-27 proposed yellow
 */
public abstract class AbstractManager {

    /** The list of listeners on this manager. */
    private List<IKiemConfigEventListener> listeners;

    // --------------------------------------------------------------------------

    /** Creates a new AbstractManager. */
    public AbstractManager() {

    }

    // --------------------------------------------------------------------------
    // --------------------------------------------------------------------------

    /**
     * Adds a new listener to this manager.
     * 
     * @param listener
     *            the new listener.
     */
    public void addEventListener(final IKiemConfigEventListener listener) {
        if (listener != null) {
            if (listeners == null) {
                listeners = new LinkedList<IKiemConfigEventListener>();
            }
            if (!listeners.contains(listener)) {
                listeners.add(listener);
            }
        }
    }

    /**
     * Remove a listener from the list of listeners.
     * 
     * @param listener
     *            the listener to be removed.
     */
    public void removeEventListener(final IKiemConfigEventListener listener) {
        if (listeners != null) {
            listeners.remove(listener);
        }
    }

    // --------------------------------------------------------------------------

    /**
     * Notify all listeners of an event in the manager.
     * 
     * @param event
     *            the event
     */
    protected void notifyListeners(final KiemConfigEvent event) {
        if (listeners != null) {

            for (IKiemConfigEventListener listener : listeners) {
                if (listener != null) {
                    listener.eventDispatched(event);
                }
            }
        }
    }

    // --------------------------------------------------------------------------
    // --------------------------------------------------------------------------

    /**
     * Load a value from the Eclipse Preference Store.
     * 
     * @param key
     *            the key of the value to load
     * @param defaultValue
     *            the default value for the property
     * @return the value loaded value if any
     */
    protected String load(final String key, final String defaultValue) {
        IEclipsePreferences pref = new InstanceScope()
                .getNode(KiemConfigurationPlugin.PLUGIN_ID);

        String result = pref.get(key, defaultValue);

        return result;
    }

    /**
     * Remove everything saved under this node.
     * 
     * @param key
     *            the key to remove
     */
    protected void remove(final String key) {
        IEclipsePreferences pref = new InstanceScope()
                .getNode(KiemConfigurationPlugin.PLUGIN_ID);

        pref.remove(key);

        notifyListeners(new KiemConfigEvent(KiemConfigEvent.PREFERENCES_SAVED,
                this));
    }

    /**
     * Save a key,value pair to the Eclipse Preference Store.
     * 
     * @param key
     *            the key under which to save
     * @param value
     *            the value to save
     */
    protected void save(final String key, final String value) {
        IEclipsePreferences pref = new InstanceScope()
                .getNode(KiemConfigurationPlugin.PLUGIN_ID);

        if (value != null) {
            pref.put(key, value);
        } else {
            pref.remove(key);
        }

        notifyListeners(new KiemConfigEvent(KiemConfigEvent.PREFERENCES_SAVED,
                this));
    }

    // --------------------------------------------------------------------------

    /**
     * Load the saved data from the plugin's preference store. Usually not
     * necessary as data is loaded on demand.
     */
    public abstract void load();

    /**
     * Saves the data inside the manager into the plugin's preference store.
     */
    public abstract void save();

    // --------------------------------------------------------------------------

}
