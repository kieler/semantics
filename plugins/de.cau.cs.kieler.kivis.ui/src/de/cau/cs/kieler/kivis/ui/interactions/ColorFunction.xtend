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
import de.cau.cs.kieler.kivis.ui.views.KiVisView
import java.awt.Color
import java.awt.image.BufferedImage
import java.io.IOException
import java.util.List
import org.apache.batik.dom.svg.SVGDOMImplementation
import org.apache.batik.transcoder.TranscoderException
import org.apache.batik.transcoder.TranscoderInput
import org.apache.batik.transcoder.TranscoderOutput
import org.apache.batik.transcoder.TranscodingHints
import org.apache.batik.transcoder.image.ImageTranscoder
import org.apache.batik.util.SVGConstants
import org.w3c.dom.Document
import org.w3c.dom.svg.SVGDocument

/**
 * @author aas
 *
 */
class ColorFunction extends FunctionHandler {
    private BufferedImage image
    private SVGDocument svgDoc
    
    override getName() {
        "getColor"
    }
    
    override getValue(List<Object> arguments) {
        if(!arguments.isSupported) {
            throw new Exception(name+" is expecting 2 arguments, but got "+arguments.size)
        }
        val x = arguments.get(0) as Integer
        val y = arguments.get(1) as Integer
        
        // Update the pixel graphic to fetch the color value from
        val doc = KiVisView.instance.SVGDocument
        if(doc != svgDoc) {
            rasterize(doc)    
        }
        // Get the color of the pixel
        val argb = image.getRGB(x, y)
        val color = new Color(argb)
        val a = color.alpha
        val r = color.red
        val g = color.green
        val b = color.blue
//        println("rgb:"+Integer.toHexString(argb))
//        println("a:"+Integer.toHexString(a)+", r:"+Integer.toHexString(r)+", g:"+Integer.toHexString(g)+", b:"+Integer.toHexString(b))
        return argb
    }
    
    override getSupportedArgumentCounts() {
        return #[2]
    }
    
    /**
     * Render the document to a buffered image
     */
    private def void rasterize(Document doc) throws IOException {
        val transcoderHints = new TranscodingHints()
        transcoderHints.put(ImageTranscoder.KEY_XML_PARSER_VALIDATING, Boolean.FALSE)
        transcoderHints.put(ImageTranscoder.KEY_DOM_IMPLEMENTATION,
                SVGDOMImplementation.getDOMImplementation())
        transcoderHints.put(ImageTranscoder.KEY_DOCUMENT_ELEMENT_NAMESPACE_URI,
                SVGConstants.SVG_NAMESPACE_URI)
        transcoderHints.put(ImageTranscoder.KEY_DOCUMENT_ELEMENT, "svg")
    
        try {
            // Rasterize the svg document to the buffer
            val input = new TranscoderInput(doc)
            val t = new ImageTranscoder() {
               override createImage(int w, int h) {
                    return new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB)
                }
                override writeImage(BufferedImage img, TranscoderOutput out) throws TranscoderException {
                    image = img
                }
            }
            t.setTranscodingHints(transcoderHints)
            t.transcode(input, null)
        } catch (TranscoderException ex) {
            ex.printStackTrace
            throw new IOException("Couldn't rasterize the svg document " + doc, ex)
        }
    }
}