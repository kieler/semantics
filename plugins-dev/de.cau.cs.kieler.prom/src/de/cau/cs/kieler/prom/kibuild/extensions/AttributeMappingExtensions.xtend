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
package de.cau.cs.kieler.prom.kibuild.extensions

import de.cau.cs.kieler.prom.kibuild.AttributeMapping
import de.cau.cs.kieler.prom.kibuild.Literal
import java.util.List

/**
 * @author aas
 *
 */
class AttributeMappingExtensions {
    
    extension static val KiBuildCreateExtensions kiBuildCreateExtensions = new KiBuildCreateExtensions
    
    /////////////////////////////////////// SET FROM LITERAL
    
    public def setAttribute(List<AttributeMapping> attributes, String attributeName, String value) {
        attributes.setAttributeFromLiteral(attributeName, value)
    }
    
    public def setAttribute(List<AttributeMapping> attributes, String attributeName, int value) {
        attributes.setAttributeFromLiteral(attributeName, value)
    }
    
    public def setAttribute(List<AttributeMapping> attributes, String attributeName, float value) {
        attributes.setAttributeFromLiteral(attributeName, value)
    }
    
    public def setAttribute(List<AttributeMapping> attributes, String attributeName, boolean value) {
        attributes.setAttributeFromLiteral(attributeName, value)
    }
    
    private def setAttributeFromLiteral(List<AttributeMapping> attributes, String attributeName, Object value) {
        for(attr : attributes) {
            if(attr.name == attributeName) {
                // Remove old attribute value
                attr.value = null
                attr.values.clear
                attr.attributes.clear
                // Set new attribute value
                var Literal l
                switch(value) {
                    Integer : l = createLiteral(value)
                    Float : l = createLiteral(value)
                    String : l = createLiteral(value)
                    Boolean : l = createLiteral(value)
                }
            }
        }
    }
    
    /////////////////////////////////////// SET FROM LIST
    
    public def setAttributeToStringList(List<AttributeMapping> attributes, String attributeName, List<String> values) {
        attributes.setAttributeFromList(attributeName, values)
    }
    
    public def setAttributeToIntegerList(List<AttributeMapping> attributes, String attributeName, List<Integer> values) {
        attributes.setAttributeFromList(attributeName, values)
    }
    
    public def setAttributeToFloatList(List<AttributeMapping> attributes, String attributeName, List<Float> values) {
        attributes.setAttributeFromList(attributeName, values)
    }
    
    public def setAttributeToBooleanList(List<AttributeMapping> attributes, String attributeName, List<Boolean> values) {
        attributes.setAttributeFromList(attributeName, values)
    }
    
    private def setAttributeFromList(List<AttributeMapping> attributes, String attributeName, List<?> values) {
        for(attr : attributes) {
            if(attr.name == attributeName) {
                // Remove old attribute value
                attr.value = null
                attr.values.clear
                attr.attributes.clear
                // Set new attribute value
                for(value : values) {
                    var Literal l
                    switch(value) {
                        Integer : l = createLiteral(value)
                        Float : l = createLiteral(value)
                        String : l = createLiteral(value)
                        Boolean : l = createLiteral(value)
                    }
                    if(l !== null) {
                        attr.values.add(l)    
                    }
                }
            }
        }
    }
}