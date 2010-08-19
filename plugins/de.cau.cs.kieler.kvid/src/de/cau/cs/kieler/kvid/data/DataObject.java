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

import java.util.LinkedList;
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
    
    /** Set true to save values in a history list. */
    private boolean savesHistory = false; 
    
    /** List that stores values as history if desired. */
    private List<String> history = new LinkedList<String>();
    
    /** If animation is desired, give the paths to follow here. */
    private List<List<Point>> paths;
    
    /**
     * Constructor for a DataObject, knowing the URI and the data.
     * 
     * @param theURI The URI to identify the referred model element
     * @param thedata The data to associate with the referred model element
     */
    public DataObject(final String theURI, final String thedata) {
        this.uri = theURI;
        this.data = thedata;
        this.type = parseDataType(thedata);
    }
    
    /**
     * Constructor for a DataObject, knowing the URI and the data, additionally
     * enables or disables history save mode.
     * 
     * @param theURI The URI to identify the referred model element
     * @param thedata The data to associate with the referred model element
     * @param doSaveHistory Whether history should be saved (true) or not (false)
     */
    public DataObject(final String theURI, final String thedata, final boolean doSaveHistory) {
        this(theURI, thedata);
        this.savesHistory = doSaveHistory;
        if (this.savesHistory) {
            history.add(thedata);
        }
    }
    
    /**
     * Constructor for a DataObject, knowing the URI and the data, additionally
     * sets one or more animation and display paths.
     * 
     * @param theURI The URI to identify the referred model element
     * @param thedata The data to associate with the referred model element
     * @param thepaths List of paths (represented by a list of draw2d {@link Point}s) which
     *          the data animation should follow or use for positioning
     */
    public DataObject(final String theURI, final String thedata, final List<List<Point>> thepaths) {
        this(theURI, thedata);
        this.paths = thepaths;
    }
    
    /**
     * Constructor for a DataObject, knowing the URI and the data, additionally
     * setting the data type manually instead of autodetecting it.
     * 
     * @param theURI The URI to identify the referred model element
     * @param thedata The data to associate with the referred model element
     * @param thetype The {@link DataType} of which the given data is
     */
    public DataObject(final String theURI, final String thedata,
            final DataType thetype) {
        this.uri = theURI;
        this.data = thedata;
        this.type = thetype;
    }
    
    /**
     * Constructor for a DataObject, knowing the URI and the data, additionally
     * setting the data type manually instead of autodetecting it. Also gives
     * one or more animation and display paths.
     * 
     * @param theURI The URI to identify the referred model element
     * @param thedata The data to associate with the referred model element
     * @param thepaths List of paths (represented by a list of draw2d {@link Point}s) which
     *          the data animation should follow or use for positioning
     * @param thetype The {@link DataType} of which the given data is
     */
    public DataObject(final String theURI, final String thedata, final List<List<Point>> thepaths,
            final DataType thetype) {
        this(theURI, thedata);
        this.paths = thepaths;
    }
    
    /**
     * Method to receive the data of this DataObject.
     * Returns as object, but is already converted in the right data type.
     * Use instanceof to find out the type.
     * 
     * @return An {@link Object} converted in the right data type, representing the
     *          data of this DataObject
     */
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
    
    /**
     * Method to use when new data available for the referred model element.
     * 
     * @param thedata The new data, which is of the same type as the old
     */
    public void updateData(final String thedata) {
        if (!parseDataType(thedata).equals(this.type)) {
            throw new RuntimeException("Tried to update with a different data type!");
        }
        this.data = thedata;
        if (savesHistory) {
            this.history.add(thedata);
        }
    }
    
    /**
     * Method to get the URI of the referred model element.
     * 
     * @return The referred model element's URI
     */
    public String getUri() {
        return uri;
    }
    
    /**
     * Method to get the paths which this DataObject's visual representation will
     * follow during animation.
     * 
     * @return A list of paths (which are lists of {@link Point}s)
     */
    public List<List<Point>> getPaths() {
        return paths;
    }
    
    /**
     * Method to update the paths which this DataObject's visual representation will
     * follow during animation. Use when paths were recalculated, e.g. after layout.
     * 
     * @param thepaths A list of paths (which are lists of {@link Point}s)
     */
    public void updatePaths(final List<List<Point>> thepaths) {
        this.paths = thepaths;
    }
    
    /**
     * Internal method to determine the data type of the given data.
     * 
     * @param thedata The data of this DataObject
     * @return The type determined. String when no proper data type was found. 
     */
    private DataType parseDataType(final String thedata) {
        if (data.matches("[+-]?[0-9]+")) {
            return DataType.INT;
        }
        if (data.matches("[+-]?[0-9]+.[0-9]+[E[0-9]+]?[f]?")) {
            return DataType.FLOAT;
        }
        if (data.equalsIgnoreCase("true") || data.equalsIgnoreCase("false")) {
            return DataType.BOOLEAN;
        }
        return DataType.STRING;
    }
    
    /**
     * Enables or disables history save functionality.
     * 
     * @param doSaveHistory Whether to enable (true) or disable (false) history saving
     */
    public void setSaveHistory(final boolean doSaveHistory) {
        this.savesHistory = doSaveHistory;
    }
    
    /**
     * Checks the number of currently saved history values.
     * 
     * @return The number of currently saved history values
     */
    public int getHistoryLength() {
        return history.size();
    }
    
    /**
     * Method to get a certain history value.
     * Make sure that the value exists, use the getHistoryLength() method for this.
     * 
     * @param which Index of the history value to get
     * @return The history value converted in the right data type as Object
     */
    public Object getHistoryValue(final int which) {
        if (which < 0 || history.size() <= which) {
            throw new RuntimeException("Tried to receive a non existing history value");
        }
        switch (type) {
        case INT:
            return Integer.parseInt(history.get(which));
        case FLOAT:
            return Float.parseFloat(history.get(which));
        case STRING:
            return history.get(which);
        case BOOLEAN:
            return Boolean.parseBoolean(history.get(which));
        default:
            throw new RuntimeException("Data Type not supported: " + type.name());
        }
    }
    
    /**
     * Clears the history.
     */
    public void clearHistory() {
        this.history.clear();
    }

}
