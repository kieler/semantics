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
package de.cau.cs.kieler.kivis.ui.interactions

import de.cau.cs.kieler.kivis.interactions.FunctionHandler
import de.cau.cs.kieler.kivis.interactions.NamedFunction
import de.cau.cs.kieler.kivis.ui.views.KiVisView
import java.util.List
import org.apache.batik.dom.svg.SVGOMPoint
import org.w3c.dom.svg.SVGPoint

/**
 * Adds functions to get the width and height of the svg document.
 * 
 * @author aas
 *
 */
class DimensionFunctionHandler extends FunctionHandler {
    /**
     * Returns the width of the svg document.
     */
    private val getWidth = new NamedFunction("getWidth") {
        override getValue(List<Object> arguments) {
            val w = getSize.x
            return w
        }
    }
    
    /**
     * Returns the height of the svg document.
     */
    private val getHeight = new NamedFunction("getHeight") {
        override getValue(List<Object> arguments) {
            val h = getSize.y
            return h
        }
    }
    
    /**
     * {@inheritDoc}
     */
    override getFunctions() {
        return #[getWidth, getHeight]
    }
    
    /**
     * Returns the width and height of the svg document.
     */
    private def SVGPoint getSize() {
        val svg = KiVisView.instance?.canvas.svgCanvas.SVGDocument.documentElement
        if(svg !== null) {
            val wText = svg.getAttribute("width")
            val hText = svg.getAttribute("height")    
            if(wText.isNullOrEmpty || hText.isNullOrEmpty) {
                throw new Exception("Could not determine SVG document size")
            }
            val w = Integer.valueOf(wText)
            val h = Integer.valueOf(hText)
            return new SVGOMPoint(w, h)
        }
    }
}