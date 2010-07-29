/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
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
package de.cau.cs.kieler.kvid.data;

import java.util.List;

import org.eclipse.draw2d.geometry.Point;

/**
 * 
 * Class for storing all important data for KViD to visualize.
 * 
 * @author jjc
 *
 */
public class DataObject {
    
    /** URI of the model element providing the data. */
    private String uri;
    
    /** The data itself in a string representation. */
    private String data;
    
    /** The type of the data, given in data types known by KViD. */
    private DataType type;
    
    /** If animation is desired, give the path to follow here. */
    private List<Point> path;
    
    public DataObject(final String theURI, final String thedata) {
        this.uri = theURI;
        this.data = thedata;
        this.type = parseDataType(thedata);
    }
    
    public DataObject(final String theURI, final String thedata, final List<Point> thepath) {
        this.uri = theURI;
        this.data = thedata;
        this.type = parseDataType(thedata);
        this.path = thepath;
    }
    
    public DataObject(final String theURI, final String thedata,
            final DataType thetype) {
        this.uri = theURI;
        this.data = thedata;
        this.type = thetype;
    }
    
    public Object getData() {
        switch (type) {
        case INT:
            return Integer.parseInt(data);
        case FLOAT:
            return Float.parseFloat(data);
        case STRING:
            return data;
        case BOOLEAN:
            return Boolean.parseBoolean(data);
        default:
            throw new RuntimeException("Data Type not supported: " + type.name());
        }
    }
    
    public String getURI() {
        return uri;
    }
    
    public List<Point> getPath() {
        return path;
    }
    
    private DataType parseDataType(String data) {
        if (data.matches("[+-]?[0-9]+")) {
            return DataType.INT;
        }
        if (data.matches("floatblabla")) {
            //TODO richtigen regex!
            return DataType.FLOAT;
        }
        if (data.equalsIgnoreCase("true") || data.equalsIgnoreCase("false")) {
            return DataType.BOOLEAN;
        }
        return DataType.STRING;
    }

}
