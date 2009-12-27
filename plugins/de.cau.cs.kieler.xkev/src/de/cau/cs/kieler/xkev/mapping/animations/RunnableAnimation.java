/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse Rich Client
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */

package de.cau.cs.kieler.xkev.mapping.animations;

import org.w3c.dom.Element;
import org.w3c.dom.svg.SVGDocument;

import de.cau.cs.kieler.sim.kiem.json.JSONObject;
import de.cau.cs.kieler.xkev.views.EclipseJSVGCanvas;

/**
 * @author Stephan Knauer (skn) - skn[at]informatik.uni-kiel.de
 *
 */
public class RunnableAnimation implements Runnable {

    private final JSONObject jsonObject;
    private final String svgElementID;
  
    
    /**
     * 
     */
    public RunnableAnimation(JSONObject jsonObject, String svgElementID) {
        this.jsonObject = jsonObject;
        this.svgElementID = svgElementID;
    }

    public String getSVGElementID() {
        return svgElementID;
    }
    
    public JSONObject getJSONObject() {
        return jsonObject;
    }
    
    public Element getSVGElement() {
        SVGDocument doc = EclipseJSVGCanvas.getInstance().getSVGDocument();
        if (doc != null) {
            return doc.getElementById(svgElementID);
        } else {
            return null;
        }
    }
    
    public void run() {
        
    }

}
