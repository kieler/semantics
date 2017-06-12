/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.kvis.ui.animations

import de.cau.cs.kieler.kvis.kvis.Animation
import de.cau.cs.kieler.kvis.kvis.AttributeMapping
import de.cau.cs.kieler.kvis.kvis.Domain
import de.cau.cs.kieler.kvis.kvis.Mapping
import de.cau.cs.kieler.kvis.ui.views.KVisView
import de.cau.cs.kieler.simulation.core.DataPool
import de.cau.cs.kieler.simulation.core.NDimensionalArray
import org.eclipse.xtend.lib.annotations.Accessors
import org.w3c.dom.Element
import org.w3c.dom.svg.SVGDocument

/**
 * @author aas
 *
 */
abstract class AnimationHandler {
    abstract def String getName()
    abstract def void apply(DataPool pool)
    
    protected var String svgElementId
    protected var Animation animation
    
    public new(String svgElementId, Animation animation) {
        this.svgElementId = svgElementId
        this.animation = animation
    }
    
    private def SVGDocument getSVGDocument() {
         return KVisView.instance?.canvas?.svgCanvas?.getSVGDocument();
    }
    
    protected def Element getElementById(String id) {
        return SVGDocument.getElementById(id);
    }
    
    protected def Element findElement() {
        return getElementById(svgElementId)
    }
    
    protected def Object getVariableValue(DataPool pool) {
        val variableReference = animation.variable
        val modelName = variableReference.model?.name
        val variableName = variableReference?.name
        if(variableName != null) {
            val variable = pool.getVariable(modelName, variableName);
            if(variable.value instanceof NDimensionalArray) {
                val array = variable.value as NDimensionalArray
                return array.get(variableReference.indices)
            } else {
                return variable.value
            }
        }
        return null
    }
    
    protected def String removeQuotes(String txt) {
        return txt.replaceAll("\"", "")
    }
    
    protected def void setAttributeField(Element elem, String attributeName, String fieldName, String fieldValue) {
        val oldAttribute = elem.getAttribute(attributeName)
        val newAttribute = changeField(oldAttribute, fieldName, fieldValue)
        elem.setAttribute(attributeName, newAttribute)
    }
    
    protected def String changeField(String attribute, String fieldName, String fieldValue) {
        val newField = (fieldName + ":" + fieldValue + ";")
        // Replace the current field from the attribute. That is, replace everything from 'FIELD_NAME:' to ';'
//        println("old:"+attribute)
        var newAttribute = attribute.replaceAll(fieldName+":[^;]*[;]?", "");
        if(!newAttribute.isNullOrEmpty && !newAttribute.endsWith(";")) {
            newAttribute += ";"    
        }
        newAttribute += newField
//        println("new:"+newAttribute)
        return newAttribute
    }
    
    protected def String getMappedValue(Object value, AttributeMapping attributeMapping) {
        if(attributeMapping.literal != null) {
            return attributeMapping.literal.removeQuotes
        } else {
            for(mapping : attributeMapping.mappings) {
                if(mapping.variableDomain.matches(value)) {
                    return mapping.apply(value)
                } else {
//                    if(mapping.variableDomain.range != null) {
//                        System.err.println(value + " does not match with "
//                            + mapping.variableDomain.range.from
//                            + "-"
//                            + mapping.variableDomain.range.to)
//                    } else {
//                        System.err.println(value + " does not match with "+ mapping.variableDomain.value)
//                    } 
                }
            }
            return null
        }
    }
    
    protected def boolean matches(Domain domain, Object value) {
        if(domain.value != null) {
            if(value instanceof Number) {
                try {
                    return getDoubleValue(value).equals(Double.valueOf(domain.value))
                } catch (NumberFormatException e) {
                    return false
                }
            } else {
                return domain.value.removeQuotes.equals(value.toString)
            }
        } else if(domain.range != null) {
            try {
                val doubleValue = getDoubleValue(value)
                return (domain.range.from <= doubleValue) && (doubleValue <= domain.range.to)
            } catch(IllegalArgumentException e) {
                return false
            }
        } else {
            return false
        }
    }
    
    protected def String apply(Mapping mapping, Object value) {
        if(mapping.attributeDomain.value != null) {
            return mapping.attributeDomain.value.removeQuotes
        } else if(mapping.attributeDomain.range != null && mapping.variableDomain.range != null) {
            val doubleValue = getDoubleValue(value)
            val fromLow = mapping.variableDomain.range.from
            val fromHigh = mapping.variableDomain.range.to
            val toLow = mapping.attributeDomain.range.from
            val toHigh = mapping.attributeDomain.range.to
            // Vector calculation v = pos + percent*length
            val mappedValue = scale(doubleValue, fromLow, fromHigh, toLow, toHigh)
            println("mappedValue:"+mappedValue)
            return mappedValue.toString
        }
    }
    
    protected def double scale(double value, double fromLow, double fromHigh, double toLow, double toHigh) {
        val double percent = Math.abs(value - fromLow) / Math.abs(fromHigh - fromLow)
        val mappedValue = (toLow + percent * Math.abs(toHigh-toLow))
        return mappedValue
    }
    
    protected def getDoubleValue(Object value) {
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
            throw new IllegalArgumentException("Can't convert "+value.toString+" to Double")
        }
        return doubleValue
    }
}