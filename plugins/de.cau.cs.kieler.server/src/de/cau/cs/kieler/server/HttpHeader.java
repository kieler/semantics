/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Kiel University
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

    public static final String STATUS_KEY = "http/1.0";
    public static final String SERVER_KEY = "server";
    public static final String CONTENT_LENGTH_KEY = "content-length";
    public static final String CONTENT_TYPE_KEY = "content-type";
    public static final String URL_KEY = "url";
    public static final String METHOD_KEY = "method";
    public static final String METHOD_POST = "post";
    public static final String METHOD_GET = "get";

    private String statusVal = "200 ok";
    private String serverVal = "";
    private String urlVal = "";
    private String contentLengthVal = "";
    private String contentTypeVal = " text/html";

    HttpQuery queryString = new HttpQuery();

    ArrayList<String> keys = new ArrayList<String>();
    ArrayList<String> vals = new ArrayList<String>();

    // -------------------------------------------------------------------------

    public void setStatusOk() {
        statusVal = "200 OK";
    }

    // -------------------------------------------------------------------------

    public void setStatusErrorNoContent() {
        statusVal = "204 No Content";
    }

    // -------------------------------------------------------------------------

    public void setStatusErrorBadReqyest() {
        statusVal = "400 Bad Request";
    }

    // -------------------------------------------------------------------------

    public void setStatusErrorUnauthorized() {
        statusVal = "401 Unauthorized";
    }

    // -------------------------------------------------------------------------

    public void setStatusErrorForbidden() {
        statusVal = "403 Forbidden";
    }

    // -------------------------------------------------------------------------

    public void setStatusErrorNotFound() {
        statusVal = "404 Not Found";
    }

    // -------------------------------------------------------------------------

    public void setStatusErrorInternalServerError() {
        statusVal = "500 Internal Server Error";
    }

    // -------------------------------------------------------------------------

    public void setTypeTextHtml() {
        contentTypeVal = "text/html";
    }

    // -------------------------------------------------------------------------

    public void setTypeImageJpeg() {
        contentTypeVal = "image/jpeg";
    }

    // -------------------------------------------------------------------------

    public void setTypeImagePng() {
        contentTypeVal = "image/png";
    }

    // -------------------------------------------------------------------------

    public void setTypeImageSvg() {
        contentTypeVal = "image/svg+xml";
    }

    // -------------------------------------------------------------------------

    public void setTypeImageGif() {
        contentTypeVal = "image/gif";
    }

    // -------------------------------------------------------------------------

    public void setTypeTextXML() {
        contentTypeVal = "text/xml";
    }

    // -------------------------------------------------------------------------

    public void setTypeTextPlain() {
        contentTypeVal = "text/plain";
    }

    // -------------------------------------------------------------------------

    public void setTypeForm() {
        contentTypeVal = "application/x-www-form-urlencoded";
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the method post.
     */
    public void setMethodPOST() {
        this.setHeaderField(HttpHeader.METHOD_KEY, HttpHeader.METHOD_POST);
    }

    // -------------------------------------------------------------------------


    /**
     * Sets the method get.
     */
    public void setMethodGET() {
        this.setHeaderField(HttpHeader.METHOD_KEY, HttpHeader.METHOD_GET);
    }

    // -------------------------------------------------------------------------
    
    public boolean isMethodPOST() {
        return this.getHeader(HttpHeader.METHOD_KEY).toLowerCase().equals(HttpHeader.METHOD_POST);
    }

    // -------------------------------------------------------------------------
    
    public boolean isMethodGET() {
        return (!isMethodPOST());
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the type.
     * 
     * @param type
     *            the new type
     */
    public void setType(String type) {
        contentTypeVal = type;
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the status.
     * 
     * @param status
     *            the new status
     */
    public void setStatus(String status) {
        statusVal = status;
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the server name.
     * 
     * @param serverName
     *            the new server name
     */
    public void setServerName(String serverName) {
        serverVal = serverName;
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the URL.
     * 
     * @param serverName
     *            the new server name
     */
    public void setURL(String url) {
        urlVal = url;
        queryString = new HttpQuery(urlVal);
    }

    // -------------------------------------------------------------------------

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

    // -------------------------------------------------------------------------

    public HttpQuery getQuery() {
        return queryString;
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the content length.
     * 
     * @param len
     *            the new content length
     */
    public void setContentLength(int len) {
        contentLengthVal = len + "";
    }

    // -------------------------------------------------------------------------

    /**
     * Checks if the data is form query data.
     * 
     * @return true, if is form query data
     */
    public boolean isFormQueryData() {
        boolean isFormData =
                getHeader(HttpHeader.CONTENT_TYPE_KEY).startsWith("application/x-www-form-urlencoded");
        return isFormData;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the header index for specifc key.
     * 
     * @param key
     *            the key
     * @return the header index
     */
    private int getHeaderIndex(String key) {
        String key2 = key.toLowerCase();
        if (key2.equals(SERVER_KEY)) {
            return -2;
        }
        if (key2.equals(STATUS_KEY)) {
            return -2;
        }
        if (key2.equals(CONTENT_LENGTH_KEY)) {
            return -2;
        }
        if (key2.equals(CONTENT_TYPE_KEY)) {
            return -2;
        }
        if (key2.equals(URL_KEY)) {
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

    // -------------------------------------------------------------------------

    /**
     * Gets the header for a specific key.
     * 
     * @param key
     *            the key
     * @return the header
     */
    public String getHeader(String key) {
        String key2 = key.toLowerCase();
        if (key2.equals(SERVER_KEY)) {
            return serverVal;
        }
        if (key2.equals(STATUS_KEY)) {
            return statusVal;
        }
        if (key2.equals(CONTENT_LENGTH_KEY)) {
            return contentLengthVal;
        }
        if (key2.equals(CONTENT_TYPE_KEY)) {
            return contentTypeVal;
        }
        if (key2.equals(URL_KEY)) {
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

    // -------------------------------------------------------------------------

    /**
     * Sets the header for a specific key.
     * 
     * @param key
     *            the key
     * @param value
     *            the value
     */
    public void setHeaderField(String key, String value) {
        String key2 = key.toLowerCase();
        int index = getHeaderIndex(key2);
        if (index == -2) {
            if (key2.equals(SERVER_KEY)) {
                setServerName(value);
            }
            if (key2.equals(STATUS_KEY)) {
                setStatus(value);
            }
            if (key2.equals(CONTENT_LENGTH_KEY)) {
                int valueInt = 0;
                try {
                    valueInt = Integer.parseInt(value);
                } catch (Exception e) {
                }
                setContentLength(valueInt);
            }
            if (key2.equals(CONTENT_TYPE_KEY)) {
                setType(value);
            }
            if (key2.equals(URL_KEY)) {
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

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public String toString() {
        String returnText = "";
        returnText += this.STATUS_KEY.toUpperCase() + " " + this.statusVal + "\r\n";
        returnText += this.SERVER_KEY + ": " + this.serverVal + "\r\n";
        returnText += this.CONTENT_TYPE_KEY + ": " + this.contentTypeVal + "\r\n";
        returnText += this.CONTENT_LENGTH_KEY + ": " + this.contentLengthVal + "\r\n";
        if (urlVal.length() > 0) {
            returnText += this.URL_KEY + ": " + this.urlVal + "\r\n";
        }
        for (int c = 0; c < keys.size(); c++) {
            String key = keys.get(c);
            String val = vals.get(c);
            returnText += key + ": " + val + "\r\n";
        }
        returnText += "\r\n";
        return returnText;
    }

    // -------------------------------------------------------------------------

}
