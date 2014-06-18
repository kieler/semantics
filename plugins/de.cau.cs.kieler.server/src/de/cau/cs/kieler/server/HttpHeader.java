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

    String statusKey = "HTTP/1.1 ";
    String statusVal = "200 OK";
    String serverKey = "Server: ";
    String serverVal = "";
    String contentLengthKey = "Content-Length";
    String contentTypeKey = "Content-Length";
    String contentLengthVal = "";
    String contentTypeVal = " text/html";
    
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
        if (key.equals(serverKey)) {
            return -2;
        }
        if (key.equals(statusKey)) {
            return -2;
        }
        if (key.equals(contentLengthKey)) {
            return -2;
        }
        if (key.equals(contentTypeKey)) {
            return -2;
        }
        for (int c = 0; c < keys.size(); c++) {
            String searchKey = keys.get(c);
            if (searchKey.equals(key)) {
                return c;
            }
        }
        return 0;
    }
    
    //-------------------------------------------------------------------------

    /**
     * Gets the header for a specific key.
     *
     * @param key the key
     * @return the header
     */
    public String getHeader(String key) {
        if (key.equals(serverKey)) {
            return serverVal;
        }
        if (key.equals(statusKey)) {
            return statusVal;
        }
        if (key.equals(contentLengthKey)) {
            return contentLengthVal;
        }
        if (key.equals(contentTypeKey)) {
            return contentTypeVal;
        }
        for (int c = 0; c < keys.size(); c++) {
            String searchKey = keys.get(c);
            if (searchKey.equals(key)) {
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
        int index = getHeaderIndex(key);
        if (index == -2) {
            if (key.equals(serverKey)) {
                serverVal = value;
            }
            if (key.equals(statusKey)) {
                statusVal = value;
            }
            if (key.equals(contentLengthKey)) {
                contentLengthVal = value;
            }
            if (key.equals(contentTypeKey)) {
                contentTypeVal = value;
            }
        } else if (index == 0) {
            // new
            keys.add(key);
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
        returnText += this.statusKey + " " + this.statusVal + "\r\n";
        returnText += this.serverKey + " " + this.serverVal + "\r\n";
        returnText += this.contentTypeKey + " " + this.contentTypeVal + "\r\n";
        returnText += this.contentLengthKey + " " + this.contentLengthKey + "\r\n";
        for (int c = 0; c < keys.size(); c++) {
            String key = keys.get(c);
            String val = vals.get(c);
            returnText += key + " " + val + "\r\n";
        }
        returnText += "\r\n";
        returnText += this.statusKey + " " + this.statusVal + "\r\n";
        returnText += this.statusKey + " " + this.statusVal + "\r\n";
        return returnText;
    }

    //-------------------------------------------------------------------------

}
