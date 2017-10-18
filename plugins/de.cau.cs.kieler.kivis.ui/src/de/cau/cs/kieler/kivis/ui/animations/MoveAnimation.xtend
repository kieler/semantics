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
import org.apache.batik.dom.svg.SVGOMPoint
import org.w3c.dom.Element
import org.w3c.dom.svg.SVGLocatable
import org.w3c.dom.svg.SVGPoint

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
     * Additional translation along the x axis.
     */
    public val offsetX = new ConfigurableAttribute("offsetX", 0)
    /**
     * Additional translation along the y axis.
     */
    public val offsetY = new ConfigurableAttribute("offsetY", 0)
    
    /**
     * Determines if the position is absolute or relative to the element's original position.
     */
    public val isAbsolute = new ConfigurableAttribute("absolute", false)
    
    /**
     * The original position of the element in the document before any animation was applied.
     */
    private var SVGPoint startPosition
    
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
            var x = posX.floatValue
            var y = posY.floatValue
            if(isAbsolute.boolValue)  {
                if(startPosition == null) {
                    startPosition = new SVGOMPoint(elem.BBox.x, elem.BBox.y)
                }
                x = -startPosition.x + posX.floatValue
                y = -startPosition.y + posY.floatValue
            }
            x = x + offsetX.floatValue
            y = y + offsetY.floatValue
            var translation = x + "," + y
            elem.setAttributeFunction("transform", "translate", translation)
        } else {
            throw new Exception("The element '"+svgElementId+"' is not an SVGLocatable.")
        }
    }
}