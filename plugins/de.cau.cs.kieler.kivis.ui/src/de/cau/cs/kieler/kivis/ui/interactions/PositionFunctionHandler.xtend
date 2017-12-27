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
import org.w3c.dom.Element
import org.w3c.dom.svg.SVGLocatable
import org.w3c.dom.svg.SVGPoint
import de.cau.cs.kieler.kivis.ui.svg.SVGExtensions

/**
 * Adds functions to get the x and y coordinates of svg elements.
 * 
 * @author aas
 *
 */
class PositionFunctionHandler extends FunctionHandler {
    
    static extension SVGExtensions = new SVGExtensions
    
    /**
     * Returns the x coordinate of an SVG element.
     */
    private val getX = new NamedFunction("getX") {
        override getValue(List<Object> arguments) {
            return getPosition(arguments).x
        }
    }
    
    /**
     * Returns the y coordinate of an SVG element.
     */
    private val getY = new NamedFunction("getY") {
        override getValue(List<Object> arguments) {
            return getPosition(arguments).y
        }
    }
    
    /**
     * {@inheritDoc}
     */
    override getFunctions() {
        return #[getX, getY]
    }
    
    /**
     * Returns the x and y position of an svg element.
     * The first argument has to be a String with the id of the element.
     */
    private def SVGPoint getPosition(List<Object> arguments) {
        if(KiVisView.instance === null) {
            return new SVGOMPoint(-1, -1)
        }
        // Find the SVG element
        var String id
        var Element elem
        try {
            id = arguments.get(0) as String
            elem = KiVisView.instance.canvas.svgCanvas.SVGDocument.getElementById(id)
        } catch(Exception e) {
            throw new Exception("Position functions require the id of an SVG element as first agrument\n"
                              + "but got:" + arguments)
        }
        if(elem === null) {
            throw new Exception("Cannot find SVG element with id '" + id + "'")
        }
        
        // Get the position of the element
        if(elem instanceof SVGLocatable) {
            val box = elem.BBox
            val trans = elem.getTranslation 
            val x = box.x + trans.x
            val y = box.y + trans.y
            return new SVGOMPoint(x, y)
        } else {
            throw new Exception("The element '"+id+"' is not an SVGLocatable.")
        }
    }
}