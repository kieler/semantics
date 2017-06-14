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
import de.cau.cs.kieler.simulation.core.DataPool

/**
 * @author aas
 *
 */
class TextAnimation extends AnimationHandler {
    var double fontSize = -1
    var String fontFamily
    var String text
    
    new(String svgElementId, Animation animation) {
        super(svgElementId, animation)
        initialize()
    }
    
    private def void initialize() {
        // Read attribute values
        for(attributeMapping : animation.attributeMappings) {
            val literal = attributeMapping.literal
            if(literal != null) {
                val attributeName = attributeMapping.attribute
                switch(attributeName) {
                    case "fontSize" : fontSize = literal.primitiveValue.doubleValue
                    case "fontFamily" : fontFamily = literal.primitiveValue.toString
                    case "text" : text = literal.primitiveValue.toString
                    default: throw new Exception("Attribute '"+attributeName+"' is not handled in "+name+" animation.\n"
                        + "Handled attributes are:\n"
                        + "text, fontSize, fontFamily"
                    )
                }
            }
        }
    }

    override getName() {
        return "text"
    }
    
    override apply(DataPool pool) {
        val elem = findElement()
        val value = getVariableValue(pool)
        
        // Get mapped value
        val newText = animation.getAttribute("text").getMappedValue(value)
        if(newText != null) {
            text = newText.toString
        }
        
        // Apply attributes to svg element
        if(fontSize >= 0) {
            elem.setAttributeField("style", "font-size", String.valueOf(fontSize))                
        }
        if(fontFamily != null) {
            elem.setAttributeField("style", "font-family", fontFamily)
        }
        if(text != null) {
            elem.setText(text)
        }
        println(elem.getAttribute("style"))
    }
}