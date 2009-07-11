/*
 * @author sschwieb
 * @version $Revision: 1.1 $
 * @created 04.04.2005
 *
 * $Log: EclipseDocumentLoader.java,v $
 * Revision 1.1  2005/04/05 08:27:11  dlemmermann
 * Fixed the XML parser problem on Java 1.5.
 *
**/

package de.cau.cs.kieler.kev.views;

import org.apache.batik.bridge.DocumentLoader;
import org.apache.batik.bridge.UserAgent;


/**
 * By using this document loader we can finally modify the
 * Batik/Eclipse class loading behaviour and plug in different
 * XML parsers than just crimson.
 * 
 */
public class EclipseDocumentLoader extends DocumentLoader {
    
    public EclipseDocumentLoader(UserAgent userAgent) {
        super(userAgent);
        documentFactory = new EclipseSAXSVGDocumentFactory(userAgent.getXMLParserClassName(), true);
    	documentFactory.setValidating(userAgent.isXMLParserValidating());
    }

}
