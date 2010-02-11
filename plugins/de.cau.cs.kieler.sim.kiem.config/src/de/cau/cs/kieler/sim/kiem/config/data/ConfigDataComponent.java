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

package de.cau.cs.kieler.sim.kiem.config.data;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.json.JSONObject;

import de.cau.cs.kieler.sim.kiem.JSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;
import de.cau.cs.kieler.sim.kiem.config.managers.ConfigurationManager;
import de.cau.cs.kieler.sim.kiem.config.managers.ContributionManager;
import de.cau.cs.kieler.sim.kiem.internal.DataComponentWrapper;
import de.cau.cs.kieler.sim.kiem.properties.KiemProperty;
import de.cau.cs.kieler.sim.kiem.properties.KiemPropertyException;

/**
 * Holds all information needed for the currently running schedule.<BR>
 * For example:<BR>
 * Aimed Step Duration<BR>
 * Timeouts<BR>
 * ...and user defined variables<BR>
 * 
 * @author soh
 * @kieler.rating 2010-01-27 proposed yellow
 * 
 */
public class ConfigDataComponent extends JSONObjectDataComponent {

    /** The key for the config component. */
    public static final String CONFIG_ID = ".config";

    /** The wrapper for this component. */
    private DataComponentWrapper wrapper;

    // --------------------------------------------------------------------------

    /**
     * Creates a new ConfigDataComponent. That should be initialized with values
     * from the default configuration.
     * 
     */
    public ConfigDataComponent() {
        this(true);
    }

    /**
     * 
     * Creates a new ConfigDataComponent.
     * 
     * @param initWithDefaults
     *            true if the component should initialize from defaults
     */
    public ConfigDataComponent(final boolean initWithDefaults) {
        super();
        if (initWithDefaults) {
            if (super.getProperties() == null
                    || super.getProperties().length == 0) {
                // properties were not set by super class
                ConfigurationManager.getInstance().initWithDefaults(this);
            }
        }
    }

    // --------------------------------------------------------------------------

    /**
     * Try to find the property in this configuration.
     * 
     * @param key
     *            the key to look for.
     * @return the found property.
     * @throws KiemPropertyException
     *             if no property was found.
     */
    public KiemProperty findProperty(final KiemPropertyKeyWrapper key)
            throws KiemPropertyException {
        KiemProperty result = null;
        if (key != null) {
            KiemProperty[] array = getPropertyArray();
            // properties do exist
            if (array != null && array.length > 0) {

                for (KiemProperty prop : getPropertyArray()) {
                    if (prop != null) {
                        if (key
                                .equals(new KiemPropertyKeyWrapper(prop
                                        .getKey()))) {
                            // keys are unique, return first found
                            result = prop;
                            break;
                        }
                    }
                }
            }
        }

        if (result == null) {
            throw new KiemPropertyException(key + " not found.");
        }

        return result;
    }

    // --------------------------------------------------------------------------

    /**
     * Try to find the value of a property in this configuration.
     * 
     * @param key
     *            the key to look for.
     * @return the found value.
     * @throws KiemPropertyException
     *             if no value was found.
     */
    public final String findPropertyValue(final KiemPropertyKeyWrapper key)
            throws KiemPropertyException {
        return findProperty(key).getValue();
    }

    /**
     * Remove properties with a specified key.
     * 
     * @param key
     *            the key to look for.
     */
    public final void removeProperty(final KiemPropertyKeyWrapper key) {
        KiemProperty[] oldProperties = getPropertyArray();

        if (oldProperties != null) {
            List<KiemProperty> properties = Arrays.asList(oldProperties);

            Iterator<KiemProperty> iterator = properties.iterator();

            while (iterator.hasNext()) {
                KiemProperty property = iterator.next();
                if (key.equals(new KiemPropertyKeyWrapper(property.getKey()))) {
                    iterator.remove();
                }
            }

            setPropertyArray(Tools.listToKiemPropertyArray(properties));
        }
    }

    /**
     * Update the property with a new value.
     * <p>
     * If the property doesn't exist yet it will be created and initialized with
     * the new value.
     * </p>
     * 
     * @param key
     *            the key of the property to look for.
     * @param value
     *            the new value of the property.
     * @return the KiemProperty that was updated.
     */
    public final KiemProperty updateProperty(final KiemPropertyKeyWrapper key,
            final String value) {
        KiemProperty prop = null;
        try {
            prop = findProperty(key);
            prop.setValue(value);
        } catch (KiemPropertyException e0) {
            prop = new KiemProperty(key.getString(), value);
            // get the array of properties from super class and convert to list
            List<KiemProperty> properties = Arrays.asList(getPropertyArray());
            // add the new property
            properties.add(prop);
            // convert back to array and set
            setPropertyArray(Tools.listToKiemPropertyArray(properties));
        }
        return prop;
    }

    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void initialize() throws KiemInitializationException {
        // no need to do anything
    }

    /**
     * @return ".config"
     */
    @Override
    public final String getDataComponentId() {
        return CONFIG_ID;
    }

    /**
     * {@inheritDoc}
     */
    public final boolean isObserver() {
        return false;
    }

    /**
     * {@inheritDoc}
     */
    public final boolean isProducer() {
        return false;
    }

    /**
     * {@inheritDoc}
     */
    public void wrapup() throws KiemInitializationException {
        // no need to do anything
    }

    /**
     * {@inheritDoc}
     */
    public JSONObject step(final JSONObject jSONObject)
            throws KiemExecutionException {
        // does nothing
        return null;
    }

    // --------------------------------------------------------------------------

    /**
     * Creates a new data component from a String.
     * 
     * @param input
     *            the input string.
     * @return the created component.
     */
    public static ConfigDataComponent fromString(final String input) {
        ConfigDataComponent result = new ConfigDataComponent(false);
        String[] outer = Tools.getValueList(Tools.PROPERTY_NAME, input);

        List<KiemProperty> list = new LinkedList<KiemProperty>();
        if (outer != null) {
            for (String inner : outer) {
                if (inner != null) {
                    KiemProperty prop = Tools.getKiemProperty(inner);
                    if (prop != null) {
                        list.add(prop);
                    }
                }
            }
        }
        result.setPropertyArray(Tools.listToKiemPropertyArray(list));
        return result;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        if (getPropertyArray().length > 0) {
            for (KiemProperty property : getPropertyArray()) {

                if (property != null) {

                    builder.append(Tools.putProperty(property));
                }
            }
        }
        return builder.toString();
    }

    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isInvisible() {
        return !ContributionManager.getInstance().isInAdvancedMode();
    }

    // --------------------------------------------------------------------------

    /**
     * Getter for this components properties or from the wrapper.
     * 
     * @return the property array.
     */
    private KiemProperty[] getPropertyArray() {
        if (wrapper == null || wrapper.getProperties() == null) {
            return super.getProperties();
        }
        return wrapper.getProperties();
    }

    /**
     * Setter for this components properties.
     * 
     * @param properties
     *            the new array of properties
     */
    private void setPropertyArray(final KiemProperty[] properties) {
        if (wrapper == null) {
            super.setProperties(properties);
        } else {
            wrapper.setProperties(properties);
        }
    }

    // --------------------------------------------------------------------------

    /**
     * Getter for the wrapper.
     * 
     * @return the wrapper
     */
    public DataComponentWrapper getWrapper() {
        return this.wrapper;
    }

    /**
     * Setter for the wrapper.
     * 
     * @param wrapperParam
     *            the wrapper to set
     */
    public void setWrapper(final DataComponentWrapper wrapperParam) {
        this.wrapper = wrapperParam;
    }

    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public KiemProperty[] provideProperties() {
        KiemProperty[] result = getPropertyArray();
        if (result == null) {
            result = new KiemProperty[0];
        }
        return result;
    }
}
