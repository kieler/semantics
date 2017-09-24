/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.prom.configurable

import java.util.List
import java.util.Map
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * Named and valued field for classes, that can be configured by end-users at runtime.
 * An attribute must have a unique name within a class.
 * If the attribute is mandatory, a value other than null must be specified.  
 * 
 * @author aas
 *
 */
class ConfigurableAttribute {
    /**
     * The name of the attribute.
     */
    @Accessors
    protected var String name
    /**
     * The value of the attribute.
     */
    @Accessors
    protected var Object value
    /**
     * Defines whether the attribute must have a value different than null.
     */
    @Accessors
    protected var boolean mandatory
    
    /**
     * Constructor
     * 
     * @param name The name
     */
    new(String name) {
        this.name = name
    }
    
    /**
     * Constructor
     * 
     * @param name The name
     * @param defaultValue The initial value for the attribute
     */
    new(String name, Object defaultValue) {
        this(name)
        this.value = defaultValue
    }
    
    /**
     * Constructor
     * 
     * @param name The name
     * @param defaultValue The initial value for the attribute
     * @param isMandatory Defines whether the attribute must have a value different than null
     */
    new(String name, Object defaultValue, boolean isMandatory) {
        this(name, defaultValue)
        this.mandatory = isMandatory
    }
    
    /**
     * Returns a String representation of the value
     */
    public def String stringValue() {
        if(value == null) {
            return null
        }
        return value.toString
    }
    
    /**
     * Returns an Integer representation of the value
     */
    public def Integer intValue() {
        if(value instanceof Float) {
            return value.intValue
        } 
        if(value instanceof Double) {
            return value.intValue
        } 
        return value as Integer
    }
    
    /**
     * Returns a Float representation of the value
     */
    public def Float floatValue() {
        if(value instanceof Integer) {
            return value.floatValue
        } 
        if(value instanceof Double) {
            return value.floatValue
        } 
        return value as Float
    }
    
    /**
     * Returns a Boolean representation of the value
     */
    public def Boolean boolValue() {
        return value as Boolean
    }
    
    /**
     * Returns a List<Object> representation of the value, in case the attribute has a list as value
     */
    public def List<Object> listValue() {
        return value as List<Object>
    }
    
    /**
     * Returns a Map<String, Object> representation of the value, in case the attribute has another attribute mapping as value
     */
    public def Map<String, Object> mapValue() {
        return value as Map<String, Object>
    }
    
    /**
     * Returns true if the value is not null.
     * 
     * @return true if the value is not null, false otherwise
     */
    public def boolean isDefined() {
        return value != null
    }
    
    /**
     * {@inheritDoc}
     */
    override toString() {
        return name + ":" + value
    }
}