/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse Rich Client
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by + Christian-Albrechts-University of Kiel + Department of Computer Science +
 * Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL). See the file
 * epl-v10.html for the license text.
 */

package de.cau.cs.kieler.kev.views;

import java.util.Iterator;

import org.apache.batik.swing.JSVGCanvas;
import org.apache.batik.swing.svg.SVGDocumentLoader;
import org.apache.batik.swing.svg.SVGDocumentLoaderListener;
import org.apache.batik.swing.svg.SVGUserAgent;
import org.apache.batik.util.ParsedURL;
import de.cau.cs.kieler.kev.mapping.animations.SVGLoadingStatusListener;

/**
 * Modifies the regular JSVGCanvas in such a way that the EclipseDocumentLoader class gets used
 * instead of the standard DocumentLoader.
 * 
 * @author Stephan Knauer (skn) - skn[at]informatik.uni-kiel.de
 * @kieler.rating 2010-02-17 proposed yellow
 */
public final class EclipseJSVGCanvas extends JSVGCanvas {

    /**
     * Generated serialVersionID.
     */
    private static final long serialVersionUID = -3324506235308202723L;

    /**
     * The single instace of the EclipseJSVGCanvas.
     */
    private static EclipseJSVGCanvas INSTANCE = null;

    /**
     * This one is a single loadingStatusListener so we can keep an eye on the svg document loading
     * status.
     */
    private final SVGLoadingStatusListener loadingStatusListener = new SVGLoadingStatusListener();
    
//    private final SVGUpdateManagerListener updateManagerListener = new SVGUpdateManagerListener();
    

    /**
     * This method needs to be private in order to create only one single instance.
     * 
     * @param userAgent
     * @param b1
     * @param b2
     */
    private EclipseJSVGCanvas(SVGUserAgent userAgent, boolean b1, boolean b2) {
        super(userAgent, b1, b2);
        // Add the loadingStatusListener to the single instance
        this.addSVGDocumentLoaderListener(loadingStatusListener);

        //this.addUpdateManagerListener(updateManagerListener);
    }

    /**
     * This method creates a single Instance of the EclipseJSVGCanvas.
     * 
     * @param userAgent
     *            see the EclipseJSVGCanvas constructor
     * @param b1
     *            see the EclipseJSVGCanvas constructor
     * @param b2
     *            see the EclipseJSVGCanvas constructor
     * @return true if the instance hasn't already been created, false otherwise.
     */
    public static synchronized boolean createSingleInstance(final SVGUserAgent userAgent,
            final boolean b1, final boolean b2) {
        if (INSTANCE == null) {
            INSTANCE = new EclipseJSVGCanvas(userAgent, b1, b2);
            System.out.println("Single instance of JSVGCanvas was successfully created!");
            return true;
        }
        System.out.println("The single instance of JSVGCanvas already exists!");
        return false;
    }

    /**
     * Returns the single instance of the EclipseJSVGCanvas.
     * 
     * @return INSTANCE
     */
    public static EclipseJSVGCanvas getInstance() {
        return INSTANCE;
    }

    /**
     * Returns the SVGLoadingStatusLister for the single svgCanvas instance. So we only need one for
     * whole xKEV.
     * 
     * @return loadingStatusListener
     */
    public SVGLoadingStatusListener getSVGLoadingStatusListener() {
        return loadingStatusListener;
    }
    
//    /**
//     * Returns the SVGUpdateManagerListener for the single svgCanvas instance. So we only need one for
//     * whole xKEV.
//     * 
//     * @return loadingStatusListener
//     */
//    public SVGUpdateManagerListener getSVGUpdateManagerListener() {
//        return updateManagerListener;
//    }

    // Should not be called, because the simulation can't continue otherwise
    // public void dispose() {
    // //Remove the loadingStatuslisterener before disposing
    // this.removeSVGDocumentLoaderListener(loadingStatusListener);
    // INSTANCE = null;
    // super.dispose();
    // }

    /**
     * Loads the SVGDoument from the given url.
     * 
     * @param url
     *            The path and filename which should be loaded.
     */
    public void loadSVGDocument(final String url) {
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

        Iterator<?> it = svgDocumentLoaderListeners.iterator();
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
