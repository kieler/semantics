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
 * Implementation of a HTTP Query String decoded into keys and values.
 * 
 * @author cmot
 * @kieler.design 2014-06-08 proposed
 * @kieler.rating 2014-06-08 proposed yellow
 * 
 */
public class HttpQuery {

    ArrayList<String> keys = new ArrayList<String>();
    ArrayList<String> vals = new ArrayList<String>();

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new http query string.
     */
    public HttpQuery() {
    }

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new http query string and parses a given URL encoded query string.
     * 
     * @param encodedQueryString
     *            the encoded query string
     */
    public HttpQuery(String encodedQueryString) {
        parse(encodedQueryString, this);
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the encoded query string where values are URL encoded.
     * 
     * @return the encoded string
     */
    public String getEncodedString() {
        return getEncodedString(true);
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the unencoded query string where values are NOT URL encoded.
     * 
     * @return the string
     */
    public String getString() {
        return getEncodedString(false);
    }

    // -------------------------------------------------------------------------

    /**
     * Inertanlly used to get the encoded query string.
     * 
     * @param encode
     *            the encode
     * @return the encoded string
     */
    private String getEncodedString(boolean encode) {
        String returnText = "";
        for (int c = 0; c < keys.size(); c++) {
            String key = keys.get(c);
            String val = vals.get(c);
            if (!returnText.equals("")) {
                returnText += "&";
            }
            if (encode) {
                val = HttpUtils.encodeURL(val);
            }
            returnText += key + "=" + val;
        }
        returnText = "?" + returnText;
        return returnText;
    }

    // -------------------------------------------------------------------------

    /**
     * Parses the encoded query string and decodes it, returning a new HttpQueryString object.
     * 
     * @param encodedQueryString
     *            the encoded query string
     * @return the http query string
     */
    public static HttpQuery parse(String encodedQueryString) {
        return parse(encodedQueryString, new HttpQuery());
    }

    // -------------------------------------------------------------------------

    /**
     * Parses the encoded query string and decodes it into the given HttpQueryString object.
     * 
     * @param encodedQueryString
     *            the encoded query string
     * @param httpQueryString
     *            the http query string
     * @return the http query string
     */
    public static HttpQuery parse(String encodedQueryString, HttpQuery httpQueryString) {
        int i = encodedQueryString.indexOf("?");
        if (i >= 0) {
            String encodedQueryString2 = encodedQueryString.substring(i + 1);
            String[] keyVals = encodedQueryString2.split("&");
            for (String keyVal : keyVals) {
                String[] keyValPair = keyVal.split("=");
                if (keyValPair.length > 1) {
                    String key = keyValPair[0];
                    String val = HttpUtils.decodeURL(keyValPair[1]);
                    httpQueryString.keys.add(key);
                    httpQueryString.vals.add(val);
                }
            }
        }
        return httpQueryString;
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
        for (int c = 0; c < keys.size(); c++) {
            String searchKey = keys.get(c);
            if (searchKey.equals(key)) {
                return c;
            }
        }
        return -1;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the value of a specific query string key.
     * 
     * @param key
     *            the key
     * @return the value
     */
    public String getValue(String key) {
        int i = getHeaderIndex(key);
        if (i >= 0) {
            return vals.get(i);
        } else {
            return "";
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the value for a specific query string key.
     * 
     * @param key
     *            the key
     * @param value
     *            the value
     */
    public void setHeaderField(String key, String value) {
        int index = getHeaderIndex(key);
        if (index == -1) {
            // new
            keys.add(key);
            vals.add(value);
        } else {
            // old - replace
            vals.remove(index);
            vals.add(index, value);
        }
    }

    // -------------------------------------------------------------------------

}
