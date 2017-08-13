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
package de.cau.cs.kieler.prom.build

import java.util.List
import java.util.Map
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * @author aas
 *
 */
class ConfigurableAttribute {
    @Accessors
    protected var String name
    @Accessors
    protected var Object value
    @Accessors
    protected var boolean mandatory
    
    new(String name) {
        this.name = name
    }
    
    new(String name, Object defaultValue) {
        this(name)
        this.value = defaultValue
    }
    
    new(String name, Object defaultValue, boolean isMandatory) {
        this(name, defaultValue)
        this.mandatory = isMandatory
    }
    
    public def String stringValue() {
        if(value == null) {
            return null
        }
        return value.toString
    }
    
    public def Integer intValue() {
        if(value instanceof Float) {
            return value.intValue
        } 
        if(value instanceof Double) {
            return value.intValue
        } 
        return value as Integer
    }
    
    public def Float floatValue() {
        if(value instanceof Integer) {
            return value.floatValue
        } 
        if(value instanceof Double) {
            return value.floatValue
        } 
        return value as Float
    }
    
    public def Boolean boolValue() {
        return value as Boolean
    }
    
    public def List<Object> listValue() {
        return value as List<Object>
    }
    
    public def Map<String, Object> mapValue() {
        return value as Map<String, Object>
    }
    
    override toString() {
        return name + ":" + value
    }
}