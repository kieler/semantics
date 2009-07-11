package de.cau.cs.kieler.kev.views;
import java.util.Iterator;

import org.apache.batik.swing.JSVGCanvas;
import org.apache.batik.swing.svg.SVGDocumentLoader;
import org.apache.batik.swing.svg.SVGDocumentLoaderListener;
import org.apache.batik.swing.svg.SVGUserAgent;
import org.apache.batik.util.ParsedURL;


/**
 * Modifies the regular JSVGCanvas in such a way that the EclipseDocumentLoader
 * class gets used instead of the standard DocumentLoader.
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
            nextDocumentLoader.addSVGDocumentLoaderListener
                ((SVGDocumentLoaderListener)it.next());
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
