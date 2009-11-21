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

import org.apache.batik.swing.JSVGCanvas;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.w3c.dom.Element;
import org.w3c.dom.svg.SVGDocument;

import de.cau.cs.kieler.xkev.views.EnvironmentView;

/**
 * This class is only used in Exmaple_01, Example_02;
 * 
 * @author Stephan Knauer (skn) - skn[at]informatik.uni-kiel.de
 * 
 */
public class Animations {

    private SVGDocument svgDocument = null;
    private JSVGCanvas svgCanvas = null;

    public Animations() {
        isReady();
    }

    public boolean isReady() {
        IWorkbenchWindow window = PlatformUI.getWorkbench().getWorkbenchWindows()[0];
        IViewPart view = window.getActivePage().findView(EnvironmentView.ID);
        if (view != null) {
            if (svgCanvas == null) {
                svgCanvas = ((EnvironmentView) view).getSVGCanvas();
                if (svgCanvas != null) {
                    svgDocument = svgCanvas.getSVGDocument();
                }
            } 
            if (svgDocument != null) {
                return true;
            }
        }
        return false;
    }

    public void applyAnimation() {
        svgCanvas.setSVGDocument(svgDocument);
    }

    public JSVGCanvas getSVGCanvas() {
        return svgCanvas;
    }

    public SVGDocument getSVGDocument() {
        return svgDocument;
    }

    // private boolean viewIsStillAlive() {
    // IWorkbenchWindow window = PlatformUI.getWorkbench().getWorkbenchWindows()[0];
    // IViewPart view = window.getActivePage().findView(EnvironmentView.ID);
    // if (view != null) return true;
    // else return false;
    // }

    // ChangeColor Animation
    public void changeColor(String elementid, String value) {
        Element e = svgDocument.getElementById(elementid);
        String oldStr, newStr, s;
        int start, end;

        s = e.getAttribute("style");
        start = s.indexOf("fill:");// +"fill:".length();
        end = s.substring(start).indexOf(";") + 1;
        oldStr = s.substring(start, start + end);
        newStr = "fill:" + value + ";";
        e.setAttribute("style", s.replace(oldStr, newStr));
        //		
        // System.out.println(s);
        // System.out.println(old_string);
        // System.out.println(new_string);
        // System.out.println(s.replace(old_string, new_string));

    }
}
