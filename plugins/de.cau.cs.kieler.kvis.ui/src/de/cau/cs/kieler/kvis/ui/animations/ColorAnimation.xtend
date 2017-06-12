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
import de.cau.cs.kieler.kvis.kvis.AttributeMapping
import de.cau.cs.kieler.kvis.ui.svg.EclipseJSVGCanvas
import de.cau.cs.kieler.simulation.core.DataPool

/**
 * @author aas
 *
 */
class ColorAnimation extends AnimationHandler {
    
    new(String svgElementId, Animation animation) {
        super(svgElementId, animation)
    }
    
    override getName() {
        return "color"
    }
    
    override apply(DataPool pool) {
        val value = getVariableValue(pool)
        for(attributeMapping : animation.attributeMappings) {
            apply(value, attributeMapping)
        }
    }
    
    private def void apply(Object value, AttributeMapping attributeMapping) {
        val attributeName = attributeMapping.attribute
        val svgDoc = EclipseJSVGCanvas.getInstance()?.getSVGDocument();
        val elem = svgDoc?.getElementById(svgElementId);
        if(elem != null) {
            val newValue = getMappedValue(value, attributeMapping)
            if(newValue != null) {
                if(attributeName.equals("fillColor")) {
                    elem.setAttributeField("style", "fill", newValue)
                } else if(attributeName.equals("strokeColor")) {
                    elem.setAttributeField("style", "stroke", newValue)
                } else if(attributeName.equals("strokeWidth")) {
                    elem.setAttributeField("style", "stroke-width", newValue)
                } else if(attributeName.equals("opacity")) {
                    elem.setAttributeField("style", "opacity", newValue)
                } else {
                    throw new Exception("Attribute '"+attributeName+"' is not handled in color visualization.\n"
                        + "Handled attributes are:\n"
                        + "fillColor, strokeColor, strokeWidth, opacity."
                    )
                }
            }
        }
    }
}