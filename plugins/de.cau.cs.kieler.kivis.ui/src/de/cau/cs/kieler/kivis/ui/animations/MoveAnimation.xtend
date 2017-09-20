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
package de.cau.cs.kieler.kivis.ui.animations

import de.cau.cs.kieler.prom.configurable.ConfigurableAttribute
import de.cau.cs.kieler.simulation.core.DataPool
import org.w3c.dom.Element
import org.w3c.dom.svg.SVGLocatable

/**
 * Move animation for SVG elements.
 * 
 * Performs a translation along the x or y axis relative to the original position of the element.
 * 
 * @author aas
 *
 */
class MoveAnimation extends AnimationHandler {
    /**
     * The translation along the x axis.
     */
    public val posX = new ConfigurableAttribute("x", 0)
    /**
     * The translation along the y axis.
     */
    public val posY = new ConfigurableAttribute("y", 0)
    
    /**
     * {@inheritDoc}
     */
    new() {
        initializeAttributes
    }
    
    /**
     * {@inheritDoc}
     */
    override getName() {
        return "move"
    }
    
    /**
     * {@inheritDoc}
     */
    override doApply(DataPool pool, Element elem) {
        // Compute position
        if(elem instanceof SVGLocatable) {
            // Set new translation
            var translation = posX.floatValue + "," + posY.floatValue
            elem.setAttributeFunction("transform", "translate", translation)
        } else {
            throw new Exception("The element '"+svgElementId+"' is not an SVGLocatable.")
        }
    }
}