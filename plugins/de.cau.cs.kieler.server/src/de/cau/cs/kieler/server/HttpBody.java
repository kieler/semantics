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
 * HttpBody
 * 
 * @author cmot
 * @kieler.design 2014-06-08 proposed
 * @kieler.rating 2014-06-08 proposed yellow
 */
public class HttpBody {

    HttpQuery queryString = new HttpQuery();

    private byte[] data = "".getBytes();

    // -------------------------------------------------------------------------
    
    /**
     * Instantiates a new http body.
     */
    public HttpBody() {
        
    }

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new http body. If isFormData flag is true the data is interpreted and parsed
     * as form data.
     * 
     * @param data
     *            the data
     * @param isFormData
     *            the is form data
     */
    public HttpBody(byte[] data, boolean isFormData) {
        setData(data,isFormData); 
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the form query data if the content type is application/x-www-form-urlencoded.
     * 
     * @return the form query data
     */
    public HttpQuery getFormQueryData() {
        return queryString;
    }

    // application/x-www-form-urlencoded

    // -------------------------------------------------------------------------

    /**
     * Sets the form query data.
     * 
     * @param serverName
     *            the new server name
     */
    private void setFormQueryData(String formQueryData) {
        queryString = new HttpQuery("?" + formQueryData);
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the data as byte array.
     * 
     * @return the data
     */
    public byte[] getData() {
        return data;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the data as byte array.
     * 
     * @return the data
     */
    public String getDataAsString() {
        if (data != null) {
            return new String(data);
        }
        return "";
    }

    // -------------------------------------------------------------------------
    
    /**
     * Parses the body as form query data.
     */
    public void parseBodyAsFormQueryData() {
        setFormQueryData(getDataAsString());
    }
    
    // -------------------------------------------------------------------------

    /**
     * Sets the data. If isFormData flag is true the data is interpreted and parsed
     * as form data.
     *
     * @param data the data
     * @param isFormData the is form data
     */
    public void setData(byte[] data, boolean isMethodPOST) {
        this.data = data;
        if (isMethodPOST) {
            parseBodyAsFormQueryData();
        }
    }
}
