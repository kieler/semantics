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

import java.util.ArrayList;

/**
 * HttpHeader
 * 
 * @author cmot
 * @kieler.design 2014-06-08 proposed
 * @kieler.rating 2014-06-08 proposed yellow
 */
public class HttpHeader {

    String statusKey = "http/1.1";
    String statusVal = "200 ok";
    String serverKey = "server:";
    String serverVal = "";
    String urlKey = "url";
    String urlVal = "";
    String contentLengthKey = "content-length";
    String contentTypeKey = "content-type";
    String contentLengthVal = "";
    String contentTypeVal = " text/html";
    
    HttpQuery queryString = new HttpQuery();
    
    ArrayList<String> keys = new ArrayList<String>();
    ArrayList<String> vals = new ArrayList<String>();

    //-------------------------------------------------------------------------
    
    public void setStatusOk() {
        statusVal = "200 OK";
    }

    //-------------------------------------------------------------------------
    
    public void setStatusErrorNoContent() {
        statusVal = "204 No Content";
    }

    //-------------------------------------------------------------------------
    
    public void setStatusErrorBadReqyest() {
        statusVal = "400 Bad Request";
    }

    //-------------------------------------------------------------------------
    
    public void setStatusErrorUnauthorized() {
        statusVal = "401 Unauthorized";
    }

    //-------------------------------------------------------------------------
    
    public void setStatusErrorForbidden() {
        statusVal = "403 Forbidden";
    }

    //-------------------------------------------------------------------------
    
    public void setStatusErrorNotFound() {
        statusVal = "404 Not Found";
    }

    //-------------------------------------------------------------------------
    
    public void setStatusErrorInternalServerError() {
        statusVal = "500 Internal Server Error";
    }

    //-------------------------------------------------------------------------
    
    public void setTypeTextHtml() {
        contentTypeVal = "text/html";
    }

    //-------------------------------------------------------------------------
    
    public void setTypeImageJpeg() {
        contentTypeVal = "image/jpeg";
    }

    //-------------------------------------------------------------------------
    
    public void setTypeImagePng() {
        contentTypeVal = "image/png";
    }

    //-------------------------------------------------------------------------

    public void setTypeImageSvg() {
        contentTypeVal = "image/svg";
    }

    //-------------------------------------------------------------------------
    
    public void setTypeImageGif() {
        contentTypeVal = "image/gif";
    }

    //-------------------------------------------------------------------------
    
    public void setTypeTextXML() {
        contentTypeVal = "text/xml";
    }

    //-------------------------------------------------------------------------
    
    public void setTypeTextPlain() {
        contentTypeVal = "text/plain";
    }

    //-------------------------------------------------------------------------
    
    /**
     * Sets the type.
     *
     * @param type the new type
     */
    public void setType(String type) {
        contentTypeVal = type;
    }

    //-------------------------------------------------------------------------
    
    /**
     * Sets the status.
     *
     * @param status the new status
     */
    public void setStatus(String status) {
        statusVal = status;
    }

    //-------------------------------------------------------------------------
    
    /**
     * Sets the server name.
     *
     * @param serverName the new server name
     */
    public void setServerName(String serverName) {
        serverVal = serverName;
    }

    //-------------------------------------------------------------------------

    /**
     * Sets the URL.
     *
     * @param serverName the new server name
     */
    public void setURL(String url) {
        urlVal = url;
        queryString = new HttpQuery(urlVal);
    }


    //-------------------------------------------------------------------------

    /**
     * Gets the URL.
     *
     */
    public String getURL() {
        String encoded = queryString.getEncodedString();
        
        String prior = urlVal;
        int i = prior.indexOf("?");
        if (i >= 0) {
            prior = prior.substring(0, i);
        }
        String after = prior + encoded;
        
        return after;
    }
    
    //-------------------------------------------------------------------------
    
    public HttpQuery getQuery() {
        return queryString;
    }

    //-------------------------------------------------------------------------
    
    
    /**
     * Sets the content length.
     *
     * @param len the new content length
     */
    public void setContentLength(int len) {
        contentLengthVal = len + "";
    }

    //-------------------------------------------------------------------------

    /**
     * Gets the header index for specifc key.
     *
     * @param key the key
     * @return the header index
     */
    private int getHeaderIndex(String key) {
        String key2 = key.toLowerCase();
        if (key2.equals(serverKey)) {
            return -2;
        }
        if (key2.equals(statusKey)) {
            return -2;
        }
        if (key2.equals(contentLengthKey)) {
            return -2;
        }
        if (key2.equals(contentTypeKey)) {
            return -2;
        }
        if (key2.equals(urlKey)) {
            return -2;
        }
        for (int c = 0; c < keys.size(); c++) {
            String searchKey = keys.get(c);
            if (searchKey.equals(key2)) {
                return c;
            }
        }
        return -1;
    }
    
    //-------------------------------------------------------------------------

    /**
     * Gets the header for a specific key.
     *
     * @param key the key
     * @return the header
     */
    public String getHeader(String key) {
        String key2 = key.toLowerCase();
        if (key2.equals(serverKey)) {
            return serverVal;
        }
        if (key2.equals(statusKey)) {
            return statusVal;
        }
        if (key2.equals(contentLengthKey)) {
            return contentLengthVal;
        }
        if (key2.equals(contentTypeKey)) {
            return contentTypeVal;
        }
        if (key2.equals(urlKey)) {
            return urlVal;
        }
        for (int c = 0; c < keys.size(); c++) {
            String searchKey = keys.get(c);
            if (searchKey.equals(key2)) {
                return vals.get(c);
            }
        }
        return null;
    }

    //-------------------------------------------------------------------------
    
    /**
     * Sets the header for a specific key.
     *
     * @param key the key
     * @param value the value
     */
    public void setHeaderField(String key, String value) {
        String key2 = key.toLowerCase();
        int index = getHeaderIndex(key2);
        if (index == -2) {
            if (key2.equals(serverKey)) {
                setServerName(value);
            }
            if (key2.equals(statusKey)) {
                setStatus(value);
            }
            if (key2.equals(contentLengthKey)) {
                int valueInt = 0;
                try {
                    valueInt = Integer.parseInt(value);
                } catch(Exception e) {
                }
                setContentLength(valueInt);
            }
            if (key2.equals(contentTypeKey)) {
                setType(value);
            }
            if (key2.equals(urlKey)) {
                setURL(value);
            }
        } else if (index == -1) {
            // new
            keys.add(key2);
            vals.add(value);
        } else {
            // old - replace
            vals.remove(index);
            vals.add(index, value);
        }
    }
    
    //-------------------------------------------------------------------------
    
    /**
     * {@inheritDoc}
     */
    public String toString() {
        String returnText = "";
        returnText += this.statusKey.toUpperCase() + " " + this.statusVal + "\r\n";
        returnText += this.serverKey + ": " + this.serverVal + "\r\n";
        returnText += this.contentTypeKey + ": " + this.contentTypeVal + "\r\n";
        returnText += this.contentLengthKey + ": " + this.contentLengthVal + "\r\n";
        if (urlVal.length() > 0) {
            returnText += this.urlKey + ": " + this.urlVal + "\r\n";
        }
        for (int c = 0; c < keys.size(); c++) {
            String key = keys.get(c);
            String val = vals.get(c);
            returnText += key + ": " + val + "\r\n";
        }
        returnText += "\r\n";
        return returnText;
    }

    //-------------------------------------------------------------------------

}
