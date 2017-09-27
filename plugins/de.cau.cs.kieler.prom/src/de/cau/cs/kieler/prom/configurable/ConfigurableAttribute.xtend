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
    private var String name
    /**
     * The value of the attribute.
     */
    @Accessors(PUBLIC_GETTER)
    private var Object value
    /**
     * Defines whether the attribute must have a value different than null.
     */
    @Accessors
    private var boolean mandatory
    /**
     * The types that the value can have.
     * This is null to indicate that all values are allowed.
     */
    private var List<Class<?>> supportedTypes
    
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
        if(defaultValue != null) {
            this.supportedTypes = #[defaultValue.class]    
        }
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
     * Constructor
     * 
     * @param name The name
     * @param defaultValue The initial value for the attribute
     * @param supportedTypes Defines the types for values that are suited for the attribute
     */
    new(String name, Object defaultValue, List<Class<?>> supportedTypes) {
        this(name, defaultValue)
        this.supportedTypes = supportedTypes
    }
    
    /**
     * Constructor
     * 
     * @param name The name
     * @param defaultValue The initial value for the attribute
     * @param isMandatory Defines whether the attribute must have a value different than null
     */
    new(String name, Object defaultValue, boolean isMandatory, List<Class<?>> supportedTypes) {
        this(name, defaultValue, isMandatory)
        this.supportedTypes = supportedTypes
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
     * Sets the value of this attribute.
     */
    public def void setValue(Object newValue) {
        if(isSupportedType(newValue)) {
            value = newValue
        } else {
            throw new Exception("Cannot set the attribute '"+name+"' to '"+newValue+"'.\n"
                              + "Supported types for this attribute are: "+supportedTypes.map[it.simpleName].join(", "))
        }
    }
    
    /**
     * Determines if the new value is supported by this attribute.
     * The default implementation checks that the type of the value matches one of the supported types.
     * 
     * @param newValue A potential value for this attribute
     * @return true if the value is OK, false otherwise
     */
    public def boolean isSupportedType(Object newValue) {
        if(name == "whitelist") {
            println("hi")
        }
        if(supportedTypes.isNullOrEmpty) {
            return true
        }
        var isOk = false
        for(supportedType : supportedTypes) {
            if(supportedType.isAssignableFrom(newValue.class)) {
                isOk = true
            }    
        }
        return isOk
    }
    
    /**
     * {@inheritDoc}
     */
    override toString() {
        return name + ":" + value
    }
}