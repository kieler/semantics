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

/**
 * @author aas
 *
 */
class ColorAnimation extends AnimationHandler {
    
    new(String svgElementId, Animation animation) {
        super(svgElementId, animation)
        setAttributes("fillColor", "strokeColor", "strokeWidth", "opacity")
    }
    
    override getName() {
        return "color"
    }
    
    override doApply(DataPool pool) {
        val elem = findElement(true)
        for(attr : attributes) {
            if(attr.value != null) {
                switch(attr.name) {
                    case "fillColor" : elem.setAttributeField("style", "fill", attr.stringValue)
                    case "strokeColor" : elem.setAttributeField("style", "stroke", attr.stringValue)
                    case "strokeWidth" : elem.setAttributeField("style", "stroke-width", attr.stringValue)
                    case "opacity" : elem.setAttributeField("style", "opacity", attr.stringValue)
                }
            }
        }
    }
}