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
package de.cau.cs.kieler.kvis.ui.animations

import org.eclipse.xtend.lib.annotations.Accessors

/**
 * @author aas
 *
 */
class AnimationHandlerAttribute {
    @Accessors
    private var String name
    @Accessors
    private var Object value
    @Accessors
    private var boolean mandatory
    
    new(String name) {
        this.name = name
    }
    
    new(String name, boolean isMandatory) {
        this.name = name
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
}