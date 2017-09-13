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

import de.cau.cs.kieler.kivis.kivis.Animation
import de.cau.cs.kieler.prom.build.ConfigurableAttribute
import de.cau.cs.kieler.simulation.core.DataPool
import org.w3c.dom.Element

/**
 * Text animation for SVG text elements.
 * The displayed string can be changed as well as the font size and family.
 * 
 * @author aas
 *
 */
class TextAnimation extends AnimationHandler {
    /**
     * The text to be displayed.
     */
    public val text = new ConfigurableAttribute("text")
    /**
     * The font size to be used.
     */
    public val fontSize = new ConfigurableAttribute("fontSize")
    /**
     * The font family to be used
     */
    public val fontFamily = new ConfigurableAttribute("fontFamily")
    
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
        return "text"
    }
    
    /**
     * {@inheritDoc}
     */
    override doApply(DataPool pool, Element elem) {
        if(text.value != null) {
            elem.setText(text.stringValue)
        }
        if(fontSize.value != null && fontSize.floatValue >= 0) {
            elem.setAttributeField("style", "font-size", String.valueOf(fontSize.floatValue))                
        }
        if(fontFamily.value != null) {
            elem.setAttributeField("style", "font-family", fontFamily.stringValue)
        }
    }
}