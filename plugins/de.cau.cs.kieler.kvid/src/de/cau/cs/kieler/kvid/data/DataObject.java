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

import java.util.Collections;
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
    private KvidUri uri;
    
    /** The data itself in a string representation. */
    private String data;
    
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
    public DataObject(final KvidUri theURI, final String thedata) {
        this.uri = theURI;
        this.data = thedata;
    }
    
    /**
     * Constructor for a DataObject, knowing the URI and the data, additionally
     * enables or disables history save mode.
     * 
     * @param theURI The URI to identify the referred model element
     * @param thedata The data to associate with the referred model element
     * @param doSaveHistory Whether history should be saved (true) or not (false)
     */
    public DataObject(final KvidUri theURI, final String thedata, final boolean doSaveHistory) {
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
    public DataObject(final KvidUri theURI, final String thedata, final List<List<Point>> thepaths) {
        this(theURI, thedata);
        this.paths = thepaths;
    }
    
    /**
     * Method to receive the data of this DataObject.
     * The data will be returned in it's string representation, but could be any 
     * parseable object.
     * It is up to the using client to try parsing for their known data types.
     * One could use try/catch to try parsing and ignoring values that aren't of a known 
     * data type. 
     * 
     * @return An {@link String} representing the data of this DataObject
     */
    public String getData() {
        return data;
    }
    
    /**
     * Method to use when new data available for the referred model element.
     * 
     * @param thedata The new data
     */
    public void updateData(final String thedata) {
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
    public KvidUri getUri() {
        return uri;
    }
    
    /**
     * Method to get the paths which this DataObject's visual representation will
     * follow during animation.
     * 
     * @return A list of paths (which are lists of {@link Point}s)
     */
    public List<List<Point>> getPaths() {
        return Collections.unmodifiableList(paths);
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
        if (which < 0 || which >= history.size()) {
            throw new RuntimeException("Tried to receive a non existing history value");
        }
        return history.get(which);
    }
    
    /**
     * Clears the history.
     */
    public void clearHistory() {
        this.history.clear();
    }

}
