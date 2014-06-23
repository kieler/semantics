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

import java.util.Hashtable;

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
    
    public HttpMessage() {
        header = new HttpHeader();
        body = "".getBytes();
    }

    public String bodyAsText() {
        String str = new String(body);
        return str;
    }

    public void setBody(String text) {
        body = text.getBytes();
    }
    
    public void setBody(byte[] body) {
        this.body = body; 
    }

    public byte[] body() {
        return body;
    }
    
    public HttpHeader header() {
        return header;
    }
    
    public void setHeader(HttpHeader header) {
        this.header = header;
    }
    
}
