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
package de.cau.cs.kieler.sccharts.processors.transformators

import java.util.HashMap
import de.cau.cs.kieler.kexpressions.ValuedObject
import java.util.Stack
import de.cau.cs.kieler.kexpressions.Expression

/**
 * @author ssm
 * @kieler.design 2017-07-18 proposed
 * @kieler.rating 2017-07-18 proposed yellow  
 */
class Replacements extends HashMap<String, Stack<Expression>> {
    
    def push(ValuedObject valuedObject, Expression expression) {
        push(valuedObject.name, expression)
    }
    
    def push(String valuedObjectName, Expression expression) {
        val stack = get(valuedObjectName)
        if (stack == null) {
            put(valuedObjectName, new Stack => [ push(expression) ])
        } else {
            stack.push(expression)
        }
    }

    def Expression peek(ValuedObject valuedObject) {
        peek(valuedObject.name)
    }
    
    def Expression peek(String valuedObjectName) {
        val stack = get(valuedObjectName)
        if (stack == null) {
            return null
        } else {
            return stack.peek
        }
    }
    
    def Expression pop(ValuedObject valuedObject) {
        pop(valuedObject.name)
    }

    def Expression pop(String valuedObjectName) {
        val stack = get(valuedObjectName)
        if (stack == null) {
            return null
        } else {
            return stack.pop
        }
    }
}