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
    var float angle
    var float anchorX
    var float anchorY
    
    new(String svgElementId, Animation animation) {
        super(svgElementId, animation)
        initialize()
    }
    
    private def void initialize() {
        // Read attribute values
        for(attributeMapping : animation.attributeMappings) {
            val literal = attributeMapping.literal.removeQuotes
            if(literal != null) {
                val attributeName = attributeMapping.attribute
                switch(attributeName) {
                    case "angle" : angle = Float.valueOf(literal)
                    case "anchorX" : anchorX = Float.valueOf(literal)
                    case "anchorY" : anchorY = Float.valueOf(literal)
                    default: throw new Exception("Attribute '"+attributeName+"' is not handled in "+name+" animation.\n"
                        + "Handled attributes are:\n"
                        + "anchorX, anchorY"
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
        val angleString = animation.getAttribute("angle").getMappedValue(value)
        if(angleString != null) {
            angle = Float.valueOf(angleString)
        }
        
        // Compute position
        if(elem instanceof SVGLocatable) {
            // Position and size of the element
            val SVGLocatable locatable = elem as SVGLocatable
            val box = locatable.getBBox()
            // Set new transform
            var rotation =  angle + "," + (box.x+anchorX*box.width) + "," + (box.y+anchorY*box.width)
            elem.setAttributeFunction("transform", "rotate", rotation)
            println(elem.getAttribute("transform"))
        } else {
            throw new Exception("The element '"+svgElementId+"' is not an SVGLocatable.")
        }
    }
}