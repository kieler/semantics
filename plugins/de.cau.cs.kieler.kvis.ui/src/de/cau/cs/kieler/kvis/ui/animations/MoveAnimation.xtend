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
    public val posX = new AnimationHandlerAttribute("x", 0)
    public val posY = new AnimationHandlerAttribute("y", 0)
    
    new(String svgElementId, Animation animation) {
        super(svgElementId, animation)
        initialize
    }
    
    override getName() {
        return "move"
    }
    
    override doApply(DataPool pool, Element elem) {
        // Compute position
        if(elem instanceof SVGLocatable) {
            // Position and size of the element
//            val SVGLocatable locatable = elem as SVGLocatable
//            val box = locatable.getBBox()
            // Set new transform
            var translation = posX.floatValue + "," + posY.floatValue
            elem.setAttributeFunction("transform", "translate", translation)
        } else {
            throw new Exception("The element '"+svgElementId+"' is not an SVGLocatable.")
        }
    }
}