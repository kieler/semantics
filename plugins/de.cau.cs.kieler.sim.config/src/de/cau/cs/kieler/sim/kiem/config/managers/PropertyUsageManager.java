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

import de.cau.cs.kieler.sim.kiem.config.data.KiemPropertyKeyWrapper;

/**
 * Manages a list of keys for the properties where the default property should
 * be used rather than the property value in the currently loaded configuration.
 * 
 * @author soh
 * @kieler.rating 2010-01-27 proposed yellow
 */
public final class PropertyUsageManager extends Manager {

    /** The singleton instance of the manager. */
    private static PropertyUsageManager instance = null;

    /** The list of keys where the default value should always be used. */
    private List<KiemPropertyKeyWrapper> ignoredKeys = null;

    // --------------------------------------------------------------------------

    /** Singleton pattern. */
    private PropertyUsageManager() {
        super();
    }

    // --------------------------------------------------------------------------

    /**
     * Returns the singleton instance of this manager.
     * 
     * @return the singleton instance
     */
    public static synchronized PropertyUsageManager getInstance() {
        if (instance == null) {
            instance = new PropertyUsageManager();
        }
        return instance;
    }

    // --------------------------------------------------------------------------

    /**
     * Getter for the list of ignored keys.
     * 
     * @return the list of ignored keys.
     */
    public List<KiemPropertyKeyWrapper> getIgnoredKeys() {
        load();
        return ignoredKeys;
    }

    /**
     * Setter for the list of ignored keys.
     * 
     * @param keysParam
     *            the new list of ignored keys
     */
    public void setIgnoredKeys(final List<KiemPropertyKeyWrapper> keysParam) {
        if (keysParam != null) {
            this.ignoredKeys = keysParam;
        } else {
            // delete all keys
            this.ignoredKeys = new LinkedList<KiemPropertyKeyWrapper>();
        }
    }

    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void load() {
        if (ignoredKeys == null) {

            String keys = super.load(Tools.IGNORED_KEYS_KEY, null);

            if (keys != null) {
                String[] result = Tools.getValueList(Tools.PROPERTY_KEY_NAME,
                        keys);

                if (result != null) {
                    ignoredKeys = new LinkedList<KiemPropertyKeyWrapper>();
                    for (String s : result) {
                        if (s != null) {
                            ignoredKeys.add(new KiemPropertyKeyWrapper(s));
                        }
                    }
                }
            }

            if (ignoredKeys == null
                    && !ContributionManager.getInstance().isInAdvancedMode()) {
                ignoredKeys = new LinkedList<KiemPropertyKeyWrapper>();
                ignoredKeys.add(Tools.DEFAULT_EDITOR_KEY);
                ignoredKeys.add(Tools.DEFAULT_EDITOR_NAME_KEY);
                ignoredKeys.add(Tools.DEFAULT_PRIORITY_KEY);
                ignoredKeys.add(Tools.RECENT_CAPACITY_KEY);
            }
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void save() {
        if (!(getIgnoredKeys().isEmpty())) {

            StringBuilder builder = new StringBuilder();
            for (KiemPropertyKeyWrapper key : ignoredKeys) {
                if (key != null) {
                    builder.append(Tools.putValue(Tools.PROPERTY_KEY_NAME, key
                            .toString()));
                }
            }

            super.save(Tools.IGNORED_KEYS_KEY, builder.toString());
        } else {
            super.remove(Tools.IGNORED_KEYS_KEY);
        }
    }

    // --------------------------------------------------------------------------

}
