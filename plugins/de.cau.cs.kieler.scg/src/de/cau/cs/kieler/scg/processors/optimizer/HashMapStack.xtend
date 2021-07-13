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
package de.cau.cs.kieler.scg.processors.optimizer

import de.cau.cs.kieler.kexpressions.ValuedObject
import java.util.HashMap
import java.util.Stack

/**
 * Class for handling valued object replacements in referenced SCCharts and bindings.
 * Basically, it is a stack that keeps track of the actual valued object names and their
 * corresponding expressions.
 * 
 * @author ssm
 * @kieler.design 2017-07-18 proposed
 * @kieler.rating 2017-07-18 proposed yellow  
 */
class HashMapStack<V> extends HashMap<String, Stack<V>> {
    
    /** Pushes the value of a valued object onto the stack. */
    def push(ValuedObject valuedObject, V value) {
        push(valuedObject.name, value)
    }
    
    /** Pushes the value to a given name onto the stack. */
    def push(String valuedObjectName, V value) {
        val stack = get(valuedObjectName)
        if (stack === null) {
            put(valuedObjectName, new Stack => [ push(value) ])
        } else {
            stack.push(value)
        }
    }

    /** Peeks the value of a valued object. */
    def V peek(ValuedObject valuedObject) {
        peek(valuedObject.name)
    }
    
    /** Peek the value of a given name. */
    def V peek(String valuedObjectName) {
        val stack = get(valuedObjectName)
        if (stack === null) {
            return null
        } else {
            return stack.peek
        }
    }
    
    /** Pops the value of a valued object from the stack. */
    def V pop(ValuedObject valuedObject) {
        pop(valuedObject.name)
    }

    /** Pops the value of a name from the stack. */
    def V pop(String valuedObjectName) {
        val stack = get(valuedObjectName)
        if (stack === null) {
            return null
        } else {
            val item = stack.pop
            if (stack.size == 0) {
                remove(valuedObjectName)
            }
            return item
        }
    }
    
    /** Deletes the value of a valued object in the stack. */
    def boolean del(ValuedObject valuedObject, V v) {
        del(valuedObject.name, v)
    }
    
    
    /** Deletes the value of a name from the stack. */
    def boolean del(String valuedObjectName, V v) {
        val stack = get(valuedObjectName)
        if (stack === null) {
            return false
        } else {
            return stack.remove(v)
        }
    }
    
}