/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.server;


/**
 * HttpRequest implements a request or response message that is used in a HttpServer implementation.
 * 
 * @author cmot
 * @kieler.design 2014-06-08 proposed
 * @kieler.rating 2014-06-08 proposed yellow
 * 
 */
public class HttpMessage {

    protected byte[] body;
    protected HttpHeader header;
    
    //-------------------------------------------------------------------------
    
    /**
     * Instantiates a new http message.
     */
    public HttpMessage() {
        header = new HttpHeader();
        body = "".getBytes();
    }

    //-------------------------------------------------------------------------

    /**
     * Body as String text.
     *
     * @return the string
     */
    public String bodyAsText() {
        String str = new String(body);
        return str;
    }

    //-------------------------------------------------------------------------
    
    /**
     * Sets the body as a String.
     *
     * @param text the new body
     */
    public void setBody(String text) {
        body = text.getBytes();
    }
    
    //-------------------------------------------------------------------------

    /**
     * Sets the body as byte Array.
     *
     * @param body the new body
     */
    public void setBody(byte[] body) {
        this.body = body; 
    }

    //-------------------------------------------------------------------------

    /**
     * Body as byte Array.
     *
     * @return the byte[]
     */
    public byte[] body() {
        return body;
    }
    
    //-------------------------------------------------------------------------

    /**
     * Header with all header fields including the URL and query string.
     *
     * @return the http header
     */
    public HttpHeader header() {
        return header;
    }

    //-------------------------------------------------------------------------
    
    /**
     * Sets the header with all header fields.
     *
     * @param header the new header
     */
    public void setHeader(HttpHeader header) {
        this.header = header;
    }
    
    //-------------------------------------------------------------------------
}
