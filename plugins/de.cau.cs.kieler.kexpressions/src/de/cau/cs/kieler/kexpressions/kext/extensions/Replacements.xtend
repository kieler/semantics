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
package de.cau.cs.kieler.kexpressions.kext.extensions

import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.ValuedObject
import java.util.HashMap
import java.util.Stack

/**
 * Class for handling valued object replacements in referenced SCCharts and bindings.
 * Basically, it is a replacement stack that keeps track of the actual valued object names and their
 * corresponding expressions.
 * 
 * @author ssm
 * @kieler.design 2017-07-18 proposed
 * @kieler.rating 2017-07-18 proposed yellow  
 */
class Replacements {
    
    /** 
     * Nested replacement for generic types.
     * Static parameters that are not types will appear in normal replacements!
     */
    public val HashMap<String, Expression> typeReplacements = newHashMap
    
    private val HashMap<String, Stack<Expression>> stackMap = newHashMap
    
    new () {
        super()
    }
    
    new (Replacements replacements) {
        super()
        
        if (replacements !== null) {
            for (k : replacements.stackMap.keySet) {
                val st = replacements.stackMap.get(k)
                // The iterator method on java.util.Stack iterates through a Stack from the bottom up. ;-)
                for (s : st) {
                    this.push(k, s)
                }
            }
        }
    }
    
    
    /** Push the replacement expression of a valued object onto the stack. */
    def push(ValuedObject valuedObject, Expression expression) {
        push(valuedObject.name, expression)
    }
    
    /** Push the replacement expression to a given name onto the stack. */
    def push(String valuedObjectName, Expression expression) {
        val stack = stackMap.get(valuedObjectName)
        if (stack === null) {
            stackMap.put(valuedObjectName, new Stack => [ push(expression) ])
        } else {
            stack.push(expression)
        }
    }

    /** Peek the expression of a valued object. */
    def Expression peek(ValuedObject valuedObject) {
        peek(valuedObject.name)
    }
    
    /** Peek the expression of a given name. */
    def Expression peek(String valuedObjectName) {
        val stack = stackMap.get(valuedObjectName)
        if (stack === null || stack.length == 0) {
            return null
        } else {
            return stack.peek
        }
    }
    
    /** Pop the replacement expression of a valued object from the stack. */
    def Expression pop(ValuedObject valuedObject) {
        pop(valuedObject.name)
    }

    /** Pop the replacement expression of a name from the stack. */
    def Expression pop(String valuedObjectName) {
        val stack = stackMap.get(valuedObjectName)
        if (stack === null) {
            return null
        } else {
            return stack.pop
        }
    }
    
    /** Returns true if there is a entry for a VO with the same name */
    def boolean containsKey(ValuedObject valuedObject) {
        return stackMap.containsKey(valuedObject.name)
    }
    
    def allNames() {
        return stackMap.keySet
    }
    
    // Delegates
    
    def boolean containsKey(String valuedObjectName) {
        return stackMap.containsKey(valuedObjectName)
    }
    
    def boolean isEmpty() {
        return stackMap.empty
    }
    
}