/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.core.model.properties;

import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * An abstract holder class for properties that uses a hash map. 
 * (Xtend variant)
 *
 * @kieler.design 2011-01-17 reviewed by haf, cmot, soh
 * @kieler.rating proposed yellow 2012-07-10 msp
 * @author msp
 */
public class MapPropertyHolder implements IPropertyHolder, Serializable {

    /** the serial version UID. */
    private static val long serialVersionUID = 4507851447415709893L
    
    /** map of property identifiers to their values. */
    protected HashMap<IProperty<?>, Object> propertyMap
    
    /**
     * {@inheritDoc}
     */
    override <T> MapPropertyHolder setProperty(IProperty<? super T> property, T value) {
        if (propertyMap == null) {
            propertyMap = new HashMap<IProperty<?>, Object>();
        }
        if (value == null) {
            propertyMap.remove(property);
        } else {
            propertyMap.put(property, value);
        }
        
        return this;
    }
    
    def protected void setPropertyById(String id, Object value) {
        for (property : propertyMap.keySet) {
            if (property.id.equals(id)) {
                propertyMap.put(property, value)
                return
            } 
        }
    }
    
    /**
     * {@inheritDoc}
     */
    override <T> T getProperty(IProperty<T> property) {
        if (propertyMap != null) {
            val T value = propertyMap.get(property) as T
            if (value != null) {
                return value
            }
        }
        
        // Retrieve the default value and memorize it for our property
        val T defaultValue = property.getDefault()
        if (defaultValue instanceof Cloneable) {
            setProperty(property, defaultValue)
        }
        return defaultValue
    }
    
    /**
     * {@inheritDoc}
     */
    override MapPropertyHolder copyProperties(IPropertyHolder other) {
        if (other == null) {
            return this
        }

        val Map<IProperty<?>, Object> otherMap = other.getAllProperties()
        if (!otherMap.isEmpty()) {
            if (this.propertyMap == null) {
                propertyMap = new HashMap<IProperty<?>, Object>(otherMap)
            } else {
                this.propertyMap.putAll(otherMap)
            }
        }

        return this
    }
    
    /**
     * {@inheritDoc}
     */
    override Map<IProperty<?>, Object> getAllProperties() {
        if (propertyMap == null) {
            return Collections.emptyMap()
        } else {
            return propertyMap
        }
    }
    
    /**
     * Check for upper and lower bounds. If a property value does not fit into the bounds,
     * it is reset to the respective bound or to the default value.
     * 
     * @param newProperties the properties that shall be checked
     */
    def void checkProperties(IProperty<?> ... newProperties) {
        if (propertyMap == null) {
            return;
        }
        for (IProperty<?> property : newProperties) {
            val Object value = propertyMap.get(property);
            if (value != null) {
                val lowbo = property.getLowerBound() as Comparable<Object>
                val uppbo = property.getUpperBound() as Comparable<Object>
                if (lowbo.compareTo(value) > 0) {
                    if (value.getClass().isAssignableFrom(lowbo.getClass())) {
                        propertyMap.put(property, lowbo);
                    } else {
                        propertyMap.remove(property);
                    }
                } else if (uppbo.compareTo(value) < 0) {
                    if (value.getClass().isAssignableFrom(uppbo.getClass())) {
                        propertyMap.put(property, uppbo);
                    } else {
                        propertyMap.remove(property);
                    }
                }
            }
        }
    }
    
}
