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
class MoveAnimation extends AnimationHandler {
    var float posX
    var float posY
    
    new(String svgElementId, Animation animation) {
        super(svgElementId, animation)
        initialize()
    }
    
    private def void initialize() {
        // Read attribute values
//        for(attributeMapping : animation.attributeMappings) {
//            val literal = attributeMapping.literal.removeQuotes
//            val attributeName = attributeMapping.attribute
//            switch(attributeName) {
//                case "x" : posX = Float.valueOf(literal)
//                case "y" : posY = Float.valueOf(literal)
//                default: throw new Exception("Attribute '"+attributeName+"' is not handled in "+name+" animation.\n"
//                    + "Handled attributes are:\n"
//                    + "x, y"
//                )
//            }
//        }
    }
    
    override getName() {
        return "move"
    }
    
    override apply(DataPool pool) {
        val elem = findElement()
        val value = getVariableValue(pool) as Double
        
        // Get mapped value
        val posXString = animation.getAttribute("x").getMappedValue(value)
        val posYString = animation.getAttribute("y").getMappedValue(value)
        if(posXString != null) {
            posX = Float.valueOf(posXString)
        }
        if(posYString != null) {
            posY = Float.valueOf(posYString)
        }

        // Compute position
        if(elem instanceof SVGLocatable) {
            // Position and size of the element
//            val SVGLocatable locatable = elem as SVGLocatable
//            val box = locatable.getBBox()
            // Set new transform
            var translation = posX + "," + posY
            elem.setAttributeFunction("transform", "translate", translation)
            println(elem.getAttribute("transform"))
        } else {
            throw new Exception("The element '"+svgElementId+"' is not an SVGLocatable.")
        }
    }
}