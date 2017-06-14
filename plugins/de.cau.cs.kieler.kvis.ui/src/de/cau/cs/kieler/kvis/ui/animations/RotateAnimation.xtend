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
import de.cau.cs.kieler.simulation.core.DataPool
import org.w3c.dom.svg.SVGLocatable

/**
 * @author aas
 *
 */
class RotateAnimation extends AnimationHandler {
    var double angle
    var double anchorX
    var double anchorY
    
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
                    case "angle" : angle = literal.primitiveValue.doubleValue
                    case "anchorX" : anchorX = literal.primitiveValue.doubleValue
                    case "anchorY" : anchorY = literal.primitiveValue.doubleValue
                    default: throw new Exception("Attribute '"+attributeName+"' is not handled in "+name+" animation.\n"
                        + "Handled attributes are:\n"
                        + "angle, anchorX, anchorY"
                    )
                }
            }
        }
    }

    override getName() {
        return "rotate"
    }
    
    override apply(DataPool pool) {
        val elem = findElement()
        val value = getVariableValue(pool) as Double
        
        // Get mapped value
        val newAngle = animation.getAttribute("angle").getMappedValue(value)
        if(newAngle != null) {
            angle = newAngle as Double
        }
        
        // Compute position
        if(elem instanceof SVGLocatable) {
            // Position and size of the element
            val SVGLocatable locatable = elem as SVGLocatable
            val box = locatable.getBBox()
            // Set new transform
            var rotation =  angle + "," + (box.x+anchorX*box.width) + "," + (box.y+anchorY*box.width)
            elem.setAttributeFunction("transform", "rotate", rotation)
        } else {
            throw new Exception("The element '"+svgElementId+"' is not an SVGLocatable.")
        }
    }
}