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
package de.cau.cs.kieler.kvis.ui.animations

import de.cau.cs.kieler.kvis.kvis.Animation
import de.cau.cs.kieler.simulation.core.DataPool
import org.w3c.dom.Element
import org.w3c.dom.svg.SVGLocatable

/**
 * @author aas
 *
 */
class MoveAnimation extends AnimationHandler {
    var double posX
    var double posY
    
    new(String svgElementId, Animation animation) {
        super(svgElementId, animation)
        addAttributes("x", "y")
    }
    
    override getName() {
        return "move"
    }
    
    override doApply(DataPool pool, Element elem) {
        // Get mapped value
        val newX = getAttribute("x").floatValue
        val newY = getAttribute("y").floatValue
        if(newX != null) {
            posX = newX.doubleValue
        }
        if(newY != null) {
            posY = newY.doubleValue
        }

        // Compute position
        if(elem instanceof SVGLocatable) {
            // Position and size of the element
//            val SVGLocatable locatable = elem as SVGLocatable
//            val box = locatable.getBBox()
            // Set new transform
            var translation = posX + "," + posY
            elem.setAttributeFunction("transform", "translate", translation)
        } else {
            throw new Exception("The element '"+svgElementId+"' is not an SVGLocatable.")
        }
    }
}