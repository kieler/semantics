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
import de.cau.cs.kieler.simulation.DataPool
import org.w3c.dom.Element
import org.w3c.dom.svg.SVGLocatable

/**
 * Rotates an SVG element.
 * The rotation is performed around an anchor position that is relative to the SVG element's bounding box.
 * 
 * For instance an anchor point of (0.5, 0.5) would rotate around the center of the element,
 * whereas an anchor point of (1, 0) would rotate around the upper right corner of the element.
 * 
 * @author aas
 *
 */
class RotateAnimation extends AnimationHandler {
    /**
     * Rotation in degrees.
     */
    public val angle = new ConfigurableAttribute("angle", 0)
    /**
     * Offset that is added to the angle
     */
    public val offsetAngle = new ConfigurableAttribute("offset", 0)
    /** 
     * The relative anchor point along the x axis. Default is centered. 
     */
    public val anchorX = new ConfigurableAttribute("anchorX", 0.5)
    /**
     * The relative anchor point along the y axis. Default is centered.
     */
    public val anchorY = new ConfigurableAttribute("anchorY", 0.5)
    
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
        return "rotate"
    }
    
    /**
     * {@inheritDoc}
     */
    override doApply(DataPool pool, Element elem) {
        // Compute position
        if(elem instanceof SVGLocatable) {
            // Position and size of the element
            val SVGLocatable locatable = elem as SVGLocatable
            val box = locatable.getBBox()
            // Set new transform
            val rotationCenterX = box.x + anchorX.floatValue * box.width
            val rotationCenterY = box.y + anchorY.floatValue * box.height
            val angle = angle.floatValue + offsetAngle.floatValue
            var rotation =  angle + "," + rotationCenterX + "," + rotationCenterY
            elem.setAttributeFunction("transform", "rotate", rotation)
        } else {
            throw new Exception("The element '"+svgElementId+"' is not an SVGLocatable.")
        }
    }
}