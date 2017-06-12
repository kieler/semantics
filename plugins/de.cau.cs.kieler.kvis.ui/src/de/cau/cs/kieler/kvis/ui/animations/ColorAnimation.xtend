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
import de.cau.cs.kieler.kvis.ui.views.KVisView
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
        val elem = findElement()
        val attributeName = attributeMapping.attribute
        val newValue = getMappedValue(value, attributeMapping)
        if(newValue != null) {
            switch(attributeName) {
                case "fillColor" : elem.setAttributeField("style", "fill", newValue)
                case "strokeColor" : elem.setAttributeField("style", "stroke", newValue)
                case "strokeWidth" : elem.setAttributeField("style", "stroke-width", newValue)
                case "opacity" : elem.setAttributeField("style", "opacity", newValue)
                default :
                    throw new Exception("Attribute '"+attributeName+"' is not handled in "+name+" animation.\n"
                                      + "Handled attributes are:\n"
                                      + "fillColor, strokeColor, strokeWidth, opacity.")
            }
        }
    }
}