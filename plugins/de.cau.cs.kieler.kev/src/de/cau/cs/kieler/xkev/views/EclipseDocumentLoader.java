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

/*
 * $Log: EclipseDocumentLoader.java,v $
 * Revision 1.1  2005/04/05 08:27:11  dlemmermann
 * Fixed the XML parser problem on Java 1.5.
 *
 **/

import org.apache.batik.bridge.DocumentLoader;
import org.apache.batik.bridge.UserAgent;

/**
 * By using this document loader we can finally modify the Batik/Eclipse class loading behaviour and
 * plug in different XML parsers than just crimson.
 *
 * @author sschwieb
 */
public class EclipseDocumentLoader extends DocumentLoader {

    /**
     * The extended EclipseDocumentLoader constructor.
     * @param userAgent the useragent
     */
    public EclipseDocumentLoader(final UserAgent userAgent) {
        super(userAgent);
        documentFactory = new EclipseSAXSVGDocumentFactory(userAgent.getXMLParserClassName(), true);
        documentFactory.setValidating(userAgent.isXMLParserValidating());
    }
}