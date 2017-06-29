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
class RotateAnimation extends AnimationHandler {
    var double angle
    var double anchorX = 0.5
    var double anchorY = 0.5
    
    new(String svgElementId, Animation animation) {
        super(svgElementId, animation)
        addAttributes("angle", "anchorX", "anchorY")
    }
    
    override getName() {
        return "rotate"
    }
    
    override doApply(DataPool pool, Element elem) {
        // Get mapped value
        val newAngle = getAttribute("angle").floatValue
        if(newAngle != null) {
            angle = newAngle
        }
        val newAnchorX = getAttribute("anchorX").floatValue
        if(newAnchorX != null) {
            anchorX = newAnchorX
        }
        val newAnchorY = getAttribute("anchorY").floatValue
        if(newAnchorY != null) {
            anchorY = newAnchorY
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