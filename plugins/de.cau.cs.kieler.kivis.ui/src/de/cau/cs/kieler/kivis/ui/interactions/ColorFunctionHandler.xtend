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
import java.awt.Color
import java.awt.image.BufferedImage
import java.io.IOException
import java.util.List
import org.apache.batik.dom.svg.SVGDOMImplementation
import org.apache.batik.dom.util.DOMUtilities
import org.apache.batik.transcoder.TranscoderException
import org.apache.batik.transcoder.TranscoderInput
import org.apache.batik.transcoder.TranscoderOutput
import org.apache.batik.transcoder.image.ImageTranscoder
import org.w3c.dom.Document
import org.w3c.dom.svg.SVGDocument
import de.cau.cs.kieler.simulation.core.SimulationManager

/**
 * Adds functions to get the color of a given pixel in the svg document.
 * 
 * @author aas
 *
 */
class ColorFunctionHandler extends FunctionHandler {
    /**
     * The rasterized image of the svg document.
     */
    private BufferedImage image
    /**
     * The svg document that was rasterized and of which the color is returned.
     */
    private SVGDocument svgDoc
    
    /**
     * The action index in the simulation when the image has been rasterized.
     */
    private int lastActionIndex
    
    /**
     * Returns the argb value of a pixel.
     */
    private NamedFunction getARGB = new NamedFunction("getColor") {
        override getValue(List<Object> arguments) {
            val argb = getARGB(arguments)
            return argb
        }
    }
    
    /**
     * Returns the alpha value of a pixel.
     */
    private NamedFunction getA = new NamedFunction("getAlpha") {
        override getValue(List<Object> arguments) {
            val argb = getARGB(arguments)
            val color = new Color(argb)
            return color.alpha
        }
    }
    
    /**
     * Returns the red value of a pixel.
     */
    private NamedFunction getR = new NamedFunction("getRed") {
        override getValue(List<Object> arguments) {
            val argb = getARGB(arguments)
            val color = new Color(argb)
            return color.red
        }
    }
    
    /**
     * Returns the green value of a pixel.
     */
    private NamedFunction getG = new NamedFunction("getGreen") {
        override getValue(List<Object> arguments) {
            val argb = getARGB(arguments)
            val color = new Color(argb)
            return color.green
        }
    }
    
    /**
     * Returns the blue value of a pixel.
     */
    private NamedFunction getB = new NamedFunction("getBlue") {
        override getValue(List<Object> arguments) {
            val argb = getARGB(arguments)
            val color = new Color(argb)
            return color.blue
        }
    }
    
    /**
     * {@inheritDoc}
     */
    override getFunctions() {
        return #[getARGB, getA, getR, getG, getB]
    }
    
    /**
     * Returns the color for the given arguments.
     * The first argument must be the x coordinate, whereas the second must the the y coordinate.
     * An optional third argument determines if the image should be rasterized every frame (false per default).
     */
    private def int getARGB(List<Object> arguments) {
        try {
            val x = arguments.get(0) as Integer
            val y = arguments.get(1) as Integer
            var rasterizeEveryFrame = false
            if(arguments.size > 2) {
                rasterizeEveryFrame = arguments.get(2) as Boolean
            }
            return getARGB(x, y, rasterizeEveryFrame)
        } catch(ClassCastException e) {
            throw new Exception("The arguments for the color function handler are erroneous.\n"
                              + "Please provide 2 integers (x,y) and optionally 1 boolean (rasterizeEveryFrame?)", e)
        }
    }
    
    /**
     * Returns the color value for the given coordinates
     */
    private def int getARGB(int x, int y, boolean rasterizeEveryFrame) {
        // Update the pixel graphic to fetch the color value from
        val doc = KiVisView.instance.SVGDocument
        val currentActionIndex = SimulationManager.instance.currentState.actionIndex
        if(doc != svgDoc
            || (rasterizeEveryFrame && lastActionIndex != currentActionIndex)) {
            svgDoc = doc
            // Rasterize the clone of the svg document to a buffered image.
            // If not using the cloned svg, animations do not work anymore for some reason.
            val svgCopy = DOMUtilities.deepCloneDocument(doc, SVGDOMImplementation.DOMImplementation)
            rasterize(svgCopy)
        }
        // Get the color of the pixel
        val argb = image.getRGB(x, y)
        return argb
    }
    
    /**
     * Render the document to a buffered image
     */
    private def void rasterize(Document doc) throws IOException {
        try {
            val input = new TranscoderInput(doc)
            val t = new ImageTranscoder() {
               override createImage(int w, int h) {
                    return new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB)
                }
                override writeImage(BufferedImage img, TranscoderOutput out) throws TranscoderException {
                    image = img
                    lastActionIndex = SimulationManager.instance.currentState.actionIndex
                }
            }
            t.transcode(input, null)
        } catch (TranscoderException ex) {
            ex.printStackTrace
            throw new IOException("Couldn't rasterize the svg document " + doc, ex)
        }
    }
}