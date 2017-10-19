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

import de.cau.cs.kieler.kexpressions.BoolValue
import de.cau.cs.kieler.kexpressions.FloatValue
import de.cau.cs.kieler.kexpressions.IntValue
import de.cau.cs.kieler.kexpressions.StringValue
import de.cau.cs.kieler.prom.kibuild.AttributeMapping
import de.cau.cs.kieler.prom.kibuild.Literal
import de.cau.cs.kieler.prom.kibuild.Sign
import de.cau.cs.kieler.prom.kibuild.SignedFloat
import de.cau.cs.kieler.prom.kibuild.SignedInt
import de.cau.cs.kieler.prom.kibuild.TextValue
import java.util.List
import java.util.Map
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.prom.kibuild.ArrayIndex

/**
 * Extension methods for attributes from the kibuild grammar and classes that use these for configuration.
 * 
 * @author aas
 *
 */
class AttributeExtensions {
    /**
     * Uses reflection to get the configurable attributes of the object.
     * 
     * @param object The object
     * @return a list with all configurable attributes that the object has.
     */
    public def List<ConfigurableAttribute> getConfigurableAttributes(Object object) {
        val List<ConfigurableAttribute> attributes = newArrayList
        for(f : object.class.fields) {
            if(f.type == typeof(ConfigurableAttribute)) {
                val attr = f.get(object) as ConfigurableAttribute
                if(attr != null) {
                    attributes.add(attr)
                }
            }
        }
        return attributes
    }
    
    /**
     * Updates the configurable attributes of the object with the configuration from the attribute mappings.
     * 
     * @param object The object
     * @param attributeMappings The attribute mappings with the new values for the attributes
     */
    public def void updateConfigurableAttributes(Object object, AttributeMapping... attributeMappings) {
        // Get attributes via reflection
        val attributes = getConfigurableAttributes(object)

        // Set attributes from mapping
        for(attributeMapping : attributeMappings) {
            val attributeName = attributeMapping.name
            val attr = attributes.getAttribute(attributeName)
            if(attr != null) {
                // Create an object with the value from the attribute mapping.
                // This could be e.g. an Integer, Boolean, String, List or Map
                val newValue = attributeMapping.primitiveValue
                 if(newValue != null) {
                    attr.value = newValue
                 }
            } else {
                throw new Exception("Attribute '"+attributeName+"' is not handled in "+object+".\n"
                                  + "Handled attributes are:\n"
                                  +  attributes.map[it.name].toList())
            }
        }
        
        // Check if all mandatory attributes have been set
        for(attr : attributes.filter[it.isMandatory]) {
            if(attr.value == null) {
                throw new Exception("The attribute '" + attr.name+ "' "
                                  + "of '" + object + "' must be set.")                                 
            }
        }
    }
    
    /**
     * Creates a map from the attribute mappings.
     * The keys in the map are the names of the attributes.
     * The values in the map are the corresponding values of the attributes. 
     * 
     * @param attributes The attribute mapping
     * @return a map representing the attribute mapping
     */
    private def Map<String, Object> toMap(List<AttributeMapping> attributes) {
        val map = newHashMap
        for(attribute : attributes) {
            map.put(attribute.name, attribute.primitiveValue)
        }
        return map
    }
    
    /**
     * Returns the attribute with the given name.
     * 
     * @param attributes The attributes to be filtered
     * @param name The name of the desired attribute
     * @return the attribute with the given name or null if none 
     */
    public def ConfigurableAttribute getAttribute(List<ConfigurableAttribute> attributes, String name) {
        return attributes.findFirst[it.name == name]
    }
    
    /**
     * Returns an Integer corresponding to the value of the SignedInt.
     * 
     * @param value The value
     * @return an Integer with the corresponding value
     */
    public def Object getPrimitiveValue(SignedInt value) {
        if(value.sign == Sign.NEGATIVE) {
            return -value.value
        } else {
            return value.value
        }
    }
    
    /**
     * Returns a Float corresponding to the value of the SignedFloat.
     * 
     * @param value The value
     * @return a Float with the corresponding value
     */
    public def Object getPrimitiveValue(SignedFloat value) {
        if(value.sign == Sign.NEGATIVE) {
            return -value.value
        } else {
            return value.value
        }
    }
    
    /**
     * Returns a Java object that represents the value of the given attribute.
     * This could be for example an Integer, Boolean, Double, String, List or Map 
     * 
     * @param attribute The attribute
     * @return an object that corresponds to the attribute value in the Java world, or null if none.
     */
    public def Object getPrimitiveValue(AttributeMapping attribute) {
        if(attribute.value != null) {
            return attribute.value.primitiveValue
        } else if(!attribute.values.isNullOrEmpty) {
            return attribute.values.map[it.primitiveValue]
        } else if(!attribute.attributes.isNullOrEmpty) {
            return attribute.attributes.toMap
        }
        return null
    }
    
    /**
     * Returns a Java object that represents the value of the given EObject.
     * This could be for example an Integer, Boolean, Double, String, List or Map 
     * 
     * @param value The EObject of type Literal, SignedFloat, SignedInt, StringValue, FloatValue, IntValue, BoolValue or TextValue
     * @return an object that corresponds to the EObject in the Java world, or null if none.
     */
    public def Object getPrimitiveValue(EObject value) {
        var EObject valueHolder = value
        var ArrayIndex arrayIndex
        if(value instanceof Literal) {
            valueHolder = value.value
            arrayIndex = value.arrayIndex 
        }
        if(valueHolder instanceof SignedFloat) {
            return valueHolder.primitiveValue
        } if(valueHolder instanceof SignedInt) {
            return valueHolder.primitiveValue
        } else if(valueHolder instanceof StringValue) {
            return valueHolder.value
        } else if(valueHolder instanceof FloatValue) {
            return valueHolder.value
        } else if(valueHolder instanceof IntValue) {
            return valueHolder.value
        } else if(valueHolder instanceof BoolValue) {
            return valueHolder.value
        } else if(valueHolder instanceof TextValue) {
            if(arrayIndex == null) {
                return valueHolder.value
            } else {
                // Return the text and array indices
                val indices = arrayIndex.indices.map["["+it.toString+"]"]
                return valueHolder.value + indices.join("")
            } 
        }
        return null
    }
    
    /**
     * Returns a Double that represents the value of the given object. Throws an exception if no conversion exists.
     * Can be used to unify and compare numbers in Integer, Float, Double or String format.
     * 
     * @param value The value
     * @return a double representation for the value
     */
    public def double getDoubleValue(Object value) {
        var double doubleValue
        if(value instanceof Double){
            doubleValue = value as Double
        } else if(value instanceof Float) {
            doubleValue = value as Float
        } else if(value instanceof Integer) {
            doubleValue = value as Integer
        } else if(value instanceof String) {
            doubleValue = Double.valueOf((value as String).removeQuotes)
        } else {
            throw new NullPointerException("Can't convert "+value+" to Double")
        }
        return doubleValue
    }
    
    /**
     * Removes all quotes from the string.
     * 
     * @param txt The string
     * @return the text without quotes
     */
    public def String removeQuotes(String txt) {
        if(txt == null) {
            return null    
        }
        return txt.replaceAll("\"", "")
    }
}