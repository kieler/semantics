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

import de.cau.cs.kieler.kvis.animations.AnimationHandler
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
        if(attributeMapping.literal != null) {
            val svgDoc = EclipseJSVGCanvas.getInstance()?.getSVGDocument();
            val elem = svgDoc?.getElementById(svgElementId);
            if(elem != null) {
                var styleAttribute = elem.getAttribute("style");
                if(attributeName.equals("fillColor")) {
                    val fillColor = attributeMapping.literal.replaceQuotes
                    println("changing fill color:" + fillColor)
                    styleAttribute = styleAttribute.replaceAll("fill:[^;]*[;]?", "");
                    styleAttribute = "fill:" + fillColor + ";" + styleAttribute;
                }
                println("new style:"+styleAttribute)
                elem.setAttributeNS(null, "style", styleAttribute);
            }
        }
    }
    
    private def String replaceQuotes(String txt) {
        return txt.replaceAll("\"", "")
    }
}