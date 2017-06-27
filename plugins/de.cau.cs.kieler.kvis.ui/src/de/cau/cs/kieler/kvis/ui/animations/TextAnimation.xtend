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
class TextAnimation extends AnimationHandler {
    new(String svgElementId, Animation animation) {
        super(svgElementId, animation)
        setAttributes("text", "fontSize", "fontFamily", "text")
    }
    
    override getName() {
        return "text"
    }
    
    override doApply(DataPool pool) {
        val elem = findElement()
        // Apply attributes to svg element
        val text = getAttribute("text").stringValue
        if(text != null) {
            elem.setText(text)
        }
        
        val fontSize = getAttribute("fontSize").floatValue
        if(fontSize != null && fontSize >= 0) {
            elem.setAttributeField("style", "font-size", String.valueOf(fontSize))                
        }
        val fontFamily = getAttribute("fontFamily").stringValue
        if(fontFamily != null) {
            elem.setAttributeField("style", "font-family", fontFamily)
        }
    }
}