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

/**
 * @author aas
 *
 */
class AttributeExtensions {
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
    
    public def void updateConfigurableAttributes(Object object, AttributeMapping... attributeMappings) {
        // Get attributes via reflection
        val attributes = getConfigurableAttributes(object)

        // Set attributes from mapping
        for(attributeMapping : attributeMappings) {
            val attributeName = attributeMapping.name
            val attr = attributes.getAttribute(attributeName)
            if(attr != null) {
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
    
    private def Map<String, Object> toMap(List<AttributeMapping> attributes) {
        val map = newHashMap
        for(attribute : attributes) {
            map.put(attribute.name, attribute.primitiveValue)
        }
        return map
    }
    
    public def ConfigurableAttribute getAttribute(List<ConfigurableAttribute> attributes, String name) {
        return attributes.findFirst[it.name == name]
    }
    
    public def Object getPrimitiveValue(SignedInt value) {
        if(value.sign == Sign.NEGATIVE) {
            return -value.value
        } else {
            return value.value
        }
    }
    
    public def Object getPrimitiveValue(SignedFloat value) {
        if(value.sign == Sign.NEGATIVE) {
            return -value.value
        } else {
            return value.value
        }
    }
    
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
    
    public def Object getPrimitiveValue(EObject value) {
        var EObject valueHolder = value
        if(value instanceof Literal) {
            valueHolder = value.value
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
            return valueHolder.value
        }
        return null
    }
    
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
        } else if (value != null) {
            throw new Exception("Can't convert "+value.toString+" to Double")
        } else {
            throw new NullPointerException("Can't convert null to Double")
        }
        return doubleValue
    }
    
    public def String removeQuotes(String txt) {
        if(txt == null) {
            return null    
        }
        return txt.replaceAll("\"", "")
    }
}