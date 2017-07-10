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
import de.cau.cs.kieler.prom.build.ConfigurableAttribute
import de.cau.cs.kieler.simulation.core.DataPool
import org.w3c.dom.Element

/**
 * @author aas
 *
 */
class TextAnimation extends AnimationHandler {
    public val text = new ConfigurableAttribute("text")
    public val fontSize = new ConfigurableAttribute("fontSize", 0)
    public val fontFamily = new ConfigurableAttribute("fontFamily")
    
    new(String svgElementId, Animation animation) {
        super(svgElementId, animation)
        initialize
    }
    
    override getName() {
        return "text"
    }
    
    override doApply(DataPool pool, Element elem) {
        // Apply attributes to svg element
        if(text != null) {
            elem.setText(text.stringValue)
        }
        if(fontSize != null && fontSize.floatValue >= 0) {
            elem.setAttributeField("style", "font-size", String.valueOf(fontSize.floatValue))                
        }
        if(fontFamily != null) {
            elem.setAttributeField("style", "font-family", fontFamily.stringValue)
        }
    }
}