/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.simulation.core

import org.eclipse.xtend.lib.annotations.Accessors

/**
 * @author aas
 *
 */
class NDimensionalArrayElement implements Cloneable {
    
    @Accessors
    private var Integer[] index;
    
    @Accessors
    private var Object value;
    
    @Accessors
    private var Object userValue;
    
    new(Object value, Integer... index) {
        this.value = value
        this.index = index.clone
    }
    
    public def boolean isDirty() {
        return userValue != null && !userValue.equals(value)
    }
    
    public static def Object getCloneOfValue(Object value) {
        if(value instanceof String) {
            return new String(value)  
        } else if(value instanceof Boolean) {
            return new Boolean(value)
        } else if(value instanceof Integer) {
            return new Integer(value)
        } else if(value instanceof Float) {
            return new Float(value)
        } else if(value instanceof Double) {
            return new Double(value)
        } 
        return null
    }
    
    /**
     * {@inheritDoc}
     */
    override toString() {
        return value.class.name + index.join("[", ",", "]", [it.toString])
    }
    
    /**
     * Two NDimensionalArrayElements are equal if the value they hold are equal.
     * If a user value is set, then this value is taken as the value to be compared.
     */
    override equals(Object other) {
        if(other != null) {
            if(other instanceof NDimensionalArrayElement) {
                val thisVal = if(isDirty) userValue else value
                val otherVal = if(other.isDirty) other.userValue else other.value
                
                if(thisVal != null) {
                    return thisVal.equals(otherVal)
                } else if(otherVal != null) {
                    return otherVal.equals(value)
                } else {
                    // Both are null
                    return true
                }
            }
        }
        return false
    }
}