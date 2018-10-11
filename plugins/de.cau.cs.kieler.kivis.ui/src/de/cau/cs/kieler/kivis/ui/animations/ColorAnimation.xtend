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

/**
 * Color animation for SVG elements.
 * The fill/stroke color and opacity can be changed separately.
 * Further the overal opacity can be changed and the stroke width.
 * 
 * @author aas
 *
 */
class ColorAnimation extends AnimationHandler {
    
    /**
     * The fill color.
     * This can be the name of a color such as "green", "orange" or "lime".
     */
    public val fillColor = new ConfigurableAttribute("fillColor")
    /**
     * The fill color.
     * This can be the name of a color such as "green", "orange" or "lime".
     */
    public val strokeColor = new ConfigurableAttribute("strokeColor")
    /**
     * The stroke width.
     */
    public val strokeWidth = new ConfigurableAttribute("strokeWidth")
    /**
     * The overall opacity. Ranges from 0 to 1.
     */
    public val opacity = new ConfigurableAttribute("opacity")
    /**
     * The fill opacity.  from 0 to 1.
     */
    public val fillOpacity = new ConfigurableAttribute("fillOpacity")
    /**
     * The stroke opacity. Ranges from 0 to 1.
     */
    public val strokeOpacity = new ConfigurableAttribute("strokeOpacity")
    
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
        return "color"
    }
    
    /**
     * {@inheritDoc}
     */
    override doApply(DataPool pool, Element elem) {
        for(attr : attributes) {
            if(attr.value != null) {
                switch(attr.name) {
                    case "fillColor" : elem.setAttributeField("style", "fill", attr.stringValue)
                    case "strokeColor" : elem.setAttributeField("style", "stroke", attr.stringValue)
                    case "strokeWidth" : elem.setAttributeField("style", "stroke-width", attr.stringValue)
                    case "opacity" : elem.setAttributeField("style", "opacity", attr.stringValue)
                    case "fillOpacity" : elem.setAttributeField("style", "fill-opacity", attr.stringValue)
                    case "strokeOpacity" : elem.setAttributeField("style", "stroke-opacity", attr.stringValue)
                }
            }
        }
    }
}