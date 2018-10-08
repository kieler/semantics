/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2018 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.simulation.util

import com.google.gson.JsonArray
import com.google.gson.JsonElement
import com.google.gson.JsonNull
import com.google.gson.JsonPrimitive
import de.cau.cs.kieler.kexpressions.BoolValue
import de.cau.cs.kieler.kexpressions.DoubleValue
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.FloatValue
import de.cau.cs.kieler.kexpressions.IntValue
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.kexpressions.StringValue
import de.cau.cs.kieler.kexpressions.Value
import de.cau.cs.kieler.kexpressions.VectorValue
import com.google.gson.JsonObject

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class JsonUtil {
    
    static def boolean isFalsy(JsonElement elem) {
        return switch (elem) {
            JsonNull: true
            JsonObject: elem.size == 0
            JsonArray: elem.size == 0
            JsonPrimitive: {
                switch (elem) {
                    case elem.isBoolean: !elem.asBoolean.booleanValue
                    case elem.isString: elem.asString.toString.empty
                    case elem.isNumber: elem.asNumber.doubleValue == 0.0
                    default: false
                }
            }
            default: false
        }
    }
    
    static def boolean isTruthy(JsonElement elem) {
        return !elem.isFalsy
    }
        
    static def JsonElement cloneJson(JsonElement elem) {
        try {
            // Beware reflection ;)
            val copier = JsonElement.declaredMethods.findFirst["deepCopy".equals(name)]
            if (copier !== null) {
                copier.accessible = true
                val clone = copier.invoke(elem)
                if (clone instanceof JsonElement) {
                    return clone
                }
            }
        } catch(Exception e) {
            //just fail
        }
        return null
    }
    
    static def JsonElement toJsonValue(Expression e) {
        if (e === null) {
            return JsonNull.INSTANCE
        } else if (e instanceof Value) {
            switch(e) {
                BoolValue: return new JsonPrimitive(e.value)
                IntValue: return new JsonPrimitive(e.value)
                FloatValue: return new JsonPrimitive(e.value)
                DoubleValue: return new JsonPrimitive(e.value)
                StringValue: return new JsonPrimitive(e.value)
                VectorValue: {
                    return new JsonArray => [
                        for (v : e.values) {
                            add(v.toJsonValue)
                        }
                    ]
                }
            }
        } else if (e instanceof OperatorExpression){
            if (e.operator == OperatorType.SUB && e.subExpressions.size == 1) {
                val value = e.subExpressions.head.toJsonValue
                if (value instanceof JsonPrimitive && value.asJsonPrimitive.isNumber) {
                    switch (value.asNumber) {
                        Integer: return new JsonPrimitive(-value.asInt)
                        Float: return new JsonPrimitive(-value.asFloat)
                        Double: return new JsonPrimitive(-value.asDouble)
                        default: throw new UnsupportedOperationException("Cannot negate non number value.")
                    }
                } else {
                     throw new UnsupportedOperationException("Cannot negate non number value.")
                }
            } else {
                throw new UnsupportedOperationException("Not yet supported.")
            }
        } else {
            throw new UnsupportedOperationException("Not yet supported.")
        }
    }
    
}