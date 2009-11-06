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

package de.cau.cs.kieler.xkev.views;

import java.util.Iterator;

import org.apache.batik.swing.JSVGCanvas;
import org.apache.batik.swing.svg.SVGDocumentLoader;
import org.apache.batik.swing.svg.SVGDocumentLoaderListener;
import org.apache.batik.swing.svg.SVGUserAgent;
import org.apache.batik.util.ParsedURL;

import de.cau.cs.kieler.xkev.helpers.Tools;

/**
 * Modifies the regular JSVGCanvas in such a way that the EclipseDocumentLoader class gets used
 * instead of the standard DocumentLoader.
 * 
 */
public class EclipseJSVGCanvas extends JSVGCanvas {

    public EclipseJSVGCanvas(SVGUserAgent userAgent, boolean b1, boolean b2) {
        super(userAgent, b1, b2);
    }

    public void loadSVGDocument(String url) {
        String oldURI = null;
        if (svgDocument != null) {
            oldURI = svgDocument.getURL();
        }
        final ParsedURL newURI = new ParsedURL(oldURI, url);
        String url2 = newURI.toString();
        fragmentIdentifier = newURI.getRef();

        loader = new EclipseDocumentLoader(userAgent);
        nextDocumentLoader = new SVGDocumentLoader(url2, loader);
        nextDocumentLoader.setPriority(Thread.MIN_PRIORITY);

        Iterator it = svgDocumentLoaderListeners.iterator();
        while (it.hasNext()) {
            nextDocumentLoader.addSVGDocumentLoaderListener((SVGDocumentLoaderListener) it.next());
        }
        startDocumentLoader();
    }

    /**
     * Starts a loading thread.
     */
    private void startDocumentLoader() {
        documentLoader = nextDocumentLoader;
        nextDocumentLoader = null;
        documentLoader.start();
    }
}
