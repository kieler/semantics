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

import de.cau.cs.kieler.sim.kiem.KiemPlugin;
import de.cau.cs.kieler.sim.kiem.config.data.ConfigDataComponent;
import de.cau.cs.kieler.sim.kiem.config.data.KiemPropertyKeyWrapper;
import de.cau.cs.kieler.sim.kiem.config.data.ScheduleData;
import de.cau.cs.kieler.sim.kiem.config.data.Tools;
import de.cau.cs.kieler.sim.kiem.internal.AbstractDataComponent;
import de.cau.cs.kieler.sim.kiem.internal.DataComponentWrapper;
import de.cau.cs.kieler.sim.kiem.properties.KiemProperty;
import de.cau.cs.kieler.sim.kiem.properties.KiemPropertyException;

/**
 * Handles the default and currently running configuration.
 * 
 * @author soh
 * @kieler.rating 2010-01-27 proposed yellow
 */
public final class ConfigurationManager extends AbstractManager {

    /** The list of keys for the properties that have a default value. */
    private static final KiemPropertyKeyWrapper[] DEFAULT_KEYS = {
            Tools.AIMED_STEP_DURATION_KEY, Tools.DEFAULT_EDITOR_KEY,
            Tools.DEFAULT_EDITOR_NAME_KEY, Tools.RECENT_CAPACITY_KEY,
            Tools.DEFAULT_PRIORITY_KEY, Tools.TIMEOUT_KEY };

    /** A default value for the timeout field. */
    private static final int TIMEOUT_DEFAULT = 5000;

    /**
     * The list of default values for the default keys. Must be in same order as
     * the DEFAULT_KEYS list.
     */
    private static final String[] DEFAULT_VALUES = {
            KiemPlugin.AIMED_STEP_DURATION_DEFAULT + "",
            EditorManager.CODED_DEFAULT_EDITOR_ID,
            EditorManager.DEFAULT_EDITOR_NAME,
            ScheduleManager.DEFAULT_RECENT_CAPACITY + "",
            ScheduleData.DEFAULT_PRIORITY + "", TIMEOUT_DEFAULT + "" };

    /** The singleton instance of this manager. */
    private static ConfigurationManager instance = null;

    /** The default configuration. Can be changed through preference page. */
    private ConfigDataComponent defaultConfiguration = null;

    // --------------------------------------------------------------------------

    /** Singleton pattern. */
    private ConfigurationManager() {
        super();
    }

    // --------------------------------------------------------------------------

    /**
     * Returns the singleton instance of this manager.
     * 
     * @return the instance
     */
    public static synchronized ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    // --------------------------------------------------------------------------

    /**
     * Get all keys in the default configuration. Mainly used for building the
     * list selection dialog where the default usage of properties can be set
     * up.
     * 
     * @return the list of all available properties
     */
    public List<KiemPropertyKeyWrapper> getAllKeys() {
        List<KiemPropertyKeyWrapper> result = new LinkedList<KiemPropertyKeyWrapper>();

        for (KiemProperty prop : getDefaultConfig().getProperties()) {
            if (prop.getKey() != null) {
                result.add(new KiemPropertyKeyWrapper(prop.getKey()));
            }
        }
        return result;
    }

    // --------------------------------------------------------------------------

    /**
     * Returns the configuration of the currently running schedule.
     * 
     * @return The currently running configuration.
     */
    public ConfigDataComponent getCurrentConfig() {
        ConfigDataComponent currentConfiguration = null;

        // try to find the component in the data component list
        for (DataComponentWrapper compWrapper : KiemPlugin.getDefault()
                .getDataComponentWrapperList()) {
            AbstractDataComponent comp = compWrapper.getDataComponent();

            if (comp instanceof ConfigDataComponent) {
                currentConfiguration = (ConfigDataComponent) comp;
                currentConfiguration.setProperties(compWrapper.getProperties());
                currentConfiguration.setWrapper(compWrapper);
                break;
            }
        }

        // add the component if the user is not in advanced mode
        if (currentConfiguration == null
                && !ContributionManager.getInstance().isInAdvancedMode()) {

            for (AbstractDataComponent comp : KiemPlugin.getDefault()
                    .getRegisteredDataComponentList()) {

                if (comp instanceof ConfigDataComponent) {
                    currentConfiguration = (ConfigDataComponent) comp;
                    KiemPlugin.getDefault().addTodataComponentWrapperList(
                            currentConfiguration);
                    break;
                }
            }
        }

        return currentConfiguration;
    }

    // --------------------------------------------------------------------------

    /**
     * Get the default configuration. If no default configuration has been
     * loaded yet try to load it from the eclipse preference store through the
     * super class. If there is no configuration available create a new one.
     * 
     * @return the default configuration.
     */
    public ConfigDataComponent getDefaultConfig() {
        load();
        return defaultConfiguration;
    }

    // --------------------------------------------------------------------------

    /**
     * Get all default properties that were created by the user.
     * 
     * @return the array of properties.
     */
    public KiemProperty[] getExternalDefaultProperties() {
        KiemProperty[] properties = getDefaultConfig().getProperties();

        if (properties != null) {
            List<KiemProperty> list = Tools.arrayToList(properties);

            for (KiemProperty property : getInternalDefaultProperties()) {
                list.remove(property);
                list.remove(null);
            }

            try {
                list.remove(getDefaultConfig().findProperty(
                        Tools.DEFAULT_EDITOR_KEY));
                list.remove(getDefaultConfig().findProperty(
                        Tools.DEFAULT_EDITOR_NAME_KEY));
            } catch (KiemPropertyException e0) {
                // do nothing, property keys are present
            }

            // add an example to show the user the concept
            if (list.isEmpty()) {
                list.add(new KiemProperty("EXAMPLE_KEY", "Example values"));
            }

            return Tools.listToKiemPropertyArray(list);
        }
        return properties;
    }

    /**
     * Get all default properties that are used by the KIEM itself and that can
     * be changed through more convenient means than a table.
     * <p>
     * This does not include the default editor name and key as that can be
     * modified through another dialog by selection from list.
     * 
     * @return the array of properties.
     */
    public KiemProperty[] getInternalDefaultProperties() {
        List<KiemProperty> list = new LinkedList<KiemProperty>();
        for (int i = 0; i < DEFAULT_KEYS.length; i++) {
            KiemPropertyKeyWrapper key = DEFAULT_KEYS[i];

            // don't include editor key and name
            if (!(key.equals(Tools.DEFAULT_EDITOR_KEY) || key
                    .equals(Tools.DEFAULT_EDITOR_NAME_KEY))) {

                try {
                    list.add(getDefaultConfig().findProperty(DEFAULT_KEYS[i]));
                } catch (KiemPropertyException e0) {
                    // no value set, update with default value
                    list.add(getDefaultConfig().updateProperty(DEFAULT_KEYS[i],
                            DEFAULT_VALUES[i]));
                }
            }
        }

        return Tools.listToKiemPropertyArray(list);
    }

    // --------------------------------------------------------------------------
    // --------------------------------------------------------------------------

    /**
     * Add a new property to the default configuration.
     * 
     * @param prop
     *            The property to be added.
     */
    public void addProperty(final KiemProperty prop) {
        if (prop == null || prop.getKey() == null) {
            // don't add null properties
            return;
        }
        updateProperty(getDefaultConfig(), new KiemPropertyKeyWrapper(prop
                .getKey()), prop.getValue());

    }

    // --------------------------------------------------------------------------

    /**
     * Try to find a specific property value.
     * <p>
     * This method can be called from another plug-in and is part of the KIEM
     * Configurations API.
     * <p>
     * One place to add values that can be retrieved by this method is the User
     * Defined Properties page in the KIEM preference pages.
     * 
     * @param propertyKey
     *            the key of the property
     * @return the value of the property
     * @throws KiemPropertyException
     *             if the value could not be found
     */
    public String findProperty(final String propertyKey)
            throws KiemPropertyException {
        if (propertyKey == null) {
            throw new KiemPropertyException("Property key can't be null.");
        }
        return findPropertyValue(new KiemPropertyKeyWrapper(propertyKey), null);
    }

    /**
     * Try to find a specific property value.
     * <p>
     * First the method tries to look for the key in the currently loaded
     * configuration unless the key is in the list of keys where the default
     * configuration should be used anyway. If finding the key in the current
     * configuration fails the method continues to look for it in the default
     * configuration. If the property is found it is added to the currently
     * running configuration and returned.
     * <p>
     * If the property is not and a non-null default value is supplied the
     * property is added to the default and currently running configuration. If
     * no default value is supplied an exception is thrown.
     * 
     * @param key
     *            The key to look for.
     * @param defaultValue
     *            the default value to assign if the property is not found, not
     *            used if it is null
     * @return The returned value.
     * @throws KiemPropertyException
     *             if no property could be found. Can not happen if defaultValue
     *             is not null.
     */
    public String findPropertyValue(final KiemPropertyKeyWrapper key,
            final String defaultValue) throws KiemPropertyException {
        String result = null;

        // check if the current configuration should be checked for the key
        if (!PropertyUsageManager.getInstance().getIgnoredKeys().contains(key)) {

            ConfigDataComponent current = getCurrentConfig();
            try {
                if (current != null) {
                    result = current.findPropertyValue(key);
                } else {
                    throw new KiemPropertyException("No current configuration.");
                }
            } catch (KiemPropertyException e0) {
                // key not found in the current configuration
                try {
                    result = getDefaultConfig().findPropertyValue(key);
                } catch (KiemPropertyException e1) {
                    // key not found in the default configuration
                    if (defaultValue != null) {
                        result = defaultValue;
                        updateProperty(getDefaultConfig(), key, result);
                    } else {
                        // no default value, throw exception
                        throw new KiemPropertyException(key + " not found.", e1);
                    }
                }
                // update current config with default value or value in default
                // configuration
                if (current != null) {
                    current.updateProperty(key, result);
                }
            }
        } else {
            // look in default configuration right away
            try {
                result = getDefaultConfig().findPropertyValue(key);
            } catch (KiemPropertyException e0) {
                // value not found in default configuration
                if (defaultValue != null) {
                    updateProperty(getDefaultConfig(), key, defaultValue);

                    result = getDefaultConfig().findPropertyValue(key);
                } else {
                    throw new KiemPropertyException(key + " not found.", e0);
                }
            }
        }
        return result;
    }

    // --------------------------------------------------------------------------

    /**
     * Removes properties with the specified key.
     * 
     * @param key
     *            the key of the properties that will be removed.
     */
    public void removeProperty(final KiemPropertyKeyWrapper key) {
        getDefaultConfig().removeProperty(key);
    }

    // --------------------------------------------------------------------------

    /**
     * Updates the property in the currently loaded configuration.
     * 
     * @param propertyId
     *            the key of the property to change
     * @param value
     *            the new value of the property
     */
    public void updateCurrentProperty(final KiemPropertyKeyWrapper propertyId,
            final String value) {
        ConfigDataComponent current = getCurrentConfig();
        if (current != null) {
            updateProperty(current, propertyId, value);
        }
    }

    /**
     * Update a property in the current configuration.
     * <p>
     * If the key doesn't exist a new property is created. If the key already
     * exists the value in the existing property is updated with the new value.
     * <p>
     * This method can be called from another plug-in and is part of the KIEM
     * Configurations API.
     * <p>
     * These saved properties can be accessed by {@link #findProperty(String)}
     * 
     * @param key
     *            a unique non-null key for the added property
     * @param value
     *            the value for the added property
     */
    public void updateCurrentProperty(final String key, final String value) {
        updateProperty(getCurrentConfig(), new KiemPropertyKeyWrapper(key),
                value);
    }

    /**
     * Update a property in the default configuration.
     * <p>
     * If the key doesn't exist a new property is created. If the key already
     * exists the value in the existing property is updated with the new value.
     * <p>
     * This method can be called from another plug-in and is part of the KIEM
     * Configurations API.
     * <p>
     * These saved properties can be accessed by {@link #findProperty(String)}
     * 
     * @param key
     *            a unique non-null key for the added property
     * @param value
     *            the value for the added property
     */
    public void updateDefaultProperty(final String key, final String value) {
        updateProperty(getDefaultConfig(), new KiemPropertyKeyWrapper(key),
                value);
    }

    /**
     * Update a property and save the configuration to preferences.
     * 
     * @param config
     *            the configuration to save.
     * @param key
     *            the key of the property.
     * @param value
     *            the new value of the property.
     */
    private void updateProperty(final ConfigDataComponent config,
            final KiemPropertyKeyWrapper key, final String value) {
        if (config != null) {
            config.updateProperty(key, value);
            save();
        }

    }

    // --------------------------------------------------------------------------
    // --------------------------------------------------------------------------

    /**
     * Initialize a data component with the default values.
     * 
     * @param dataComponent
     *            the data component
     */
    public void initWithDefaults(final AbstractDataComponent dataComponent) {
        try {
            ConfigDataComponent defaults = getDefaultConfig();
            if (defaults != dataComponent) {
                List<KiemProperty> properties = new LinkedList<KiemProperty>();

                List<KiemPropertyKeyWrapper> ignored = PropertyUsageManager
                        .getInstance().getIgnoredKeys();

                for (KiemProperty prop : defaults.getProperties()) {
                    boolean found = false;
                    for (KiemPropertyKeyWrapper wrapper : ignored) {
                        // don't add values that are taken from default config
                        // anyway
                        if (wrapper.equals(new KiemPropertyKeyWrapper(prop
                                .getKey()))) {
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        properties.add(prop);
                    }
                }

                dataComponent.setProperties(properties
                        .toArray(new KiemProperty[properties.size()]));
            }
        } catch (ClassCircularityError e0) {
            // if the user invoked the method on the default config,
            // do nothing
        }
    }

    // --------------------------------------------------------------------------

    /**
     * Restore the default editor to the coded defaults.
     */
    public void restoreDefaultEditorDefaults() {
        defaultConfiguration.updateProperty(DEFAULT_KEYS[1], DEFAULT_VALUES[1]);
        defaultConfiguration.updateProperty(DEFAULT_KEYS[2], DEFAULT_VALUES[2]);
        save();
    }

    /**
     * Restore the default settings.
     */
    public void restoreDefaults() {
        for (int i = 0; i < DEFAULT_KEYS.length; i++) {
            defaultConfiguration.updateProperty(DEFAULT_KEYS[i],
                    DEFAULT_VALUES[i]);
        }
        save();
    }

    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void load() {
        if (defaultConfiguration == null) {
            String input = super.load(Tools.DEFAULT_CONFIGURATION_KEY, null);
            if (input == null || input.length() < 2) {
                defaultConfiguration = new ConfigDataComponent(false);
                restoreDefaults();
            } else {
                defaultConfiguration = ConfigDataComponent.fromString(input);
            }
        }
    }

    /**
     * Save the default configuration to the eclipse preferences.
     */
    @Override
    public void save() {
        super.save(Tools.DEFAULT_CONFIGURATION_KEY, defaultConfiguration
                .toString());
    }
}
