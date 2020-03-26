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
package de.cau.cs.kieler.core.properties;

import java.io.Serializable
import java.util.HashMap
import java.util.Map
import java.util.LinkedHashMap

/**
 * An abstract holder class for properties that uses a hash map. 
 * (Xtend variant)
 *
 * @kieler.design 2011-01-17 reviewed by haf, cmot, soh
 * @kieler.rating proposed yellow 2012-07-10 msp
 * @author msp (original) 
 * @author ssm als
 */
class MapPropertyHolder implements IPropertyHolder, Serializable {

    /** the serial version UID. */
    static val long serialVersionUID = 4507851447415709893L
    
    /** map of property identifiers to their values. */
    protected HashMap<IProperty<?>, Object> propertyMap = new LinkedHashMap<IProperty<?>, Object>()
    
    /**
     * {@inheritDoc}
     */
    override <T> MapPropertyHolder setProperty(IProperty<? super T> property, T value) {
        if (value === null) {
            propertyMap.remove(property);
        } else {
            propertyMap.put(property, value);
        }
        
        return this;
    }
    
    def protected void setPropertyById(String id, Object value) {
        propertyMap.put(new Property(id), value)
    }
    
    /**
     * {@inheritDoc}
     */
    override <T> T getProperty(IProperty<T> property) {
        if (propertyMap !== null) {
            val T value = propertyMap.get(property) as T
            if (value !== null) {
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
    override <T> T getPropertyAndSetIfAbsent(IProperty<T> property, T value) {
        if (propertyMap !== null) {
            val T currValue = propertyMap.get(property) as T
            if (!propertyMap.containsKey(property) || currValue === null) {
                propertyMap.put(property, value)
                return value
            } else {
                return currValue
            }
        }
        return this.getProperty(property)
    }
    
    def protected Object getPropertyById(String id) {
        return propertyMap.get(new Property(id))
    }
    
    /**
     * {@inheritDoc}
     */
    override MapPropertyHolder copyProperties(IPropertyHolder other) {
        if (other === null) {
            return this
        }

        val Map<IProperty<?>, Object> otherMap = other.getAllProperties()
        if (!otherMap.isEmpty()) {
            this.propertyMap.putAll(otherMap)
        }

        return this
    }
    
    /**
     * {@inheritDoc}
     */
    override Map<IProperty<?>, Object> getAllProperties() {
        return propertyMap
    }
    
    /**
     * Check for upper and lower bounds. If a property value does not fit into the bounds,
     * it is reset to the respective bound or to the default value.
     * 
     * @param newProperties the properties that shall be checked
     */
    def void checkProperties(IProperty<?> ... newProperties) {
        for (IProperty<?> property : newProperties) {
            val Object value = propertyMap.get(property);
            if (value !== null) {
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
