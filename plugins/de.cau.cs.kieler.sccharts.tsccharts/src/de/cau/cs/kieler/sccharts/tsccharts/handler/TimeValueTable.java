/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2011 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */

package de.cau.cs.kieler.sccharts.tsccharts.handler;

import java.util.HashMap;

/**
 * This class represents a mapping of all possible time value types to the timing domains of the model 
 * elements represented by the analyzed code sequences.
 * 
 * @author: ima
 * @kieler.design
 * @kieler.rating  
 */
public class TimeValueTable {
    private HashMap<String, Integer> LWCETMap;
    private HashMap<String, Integer> LBCETMap;
    private HashMap<String, Integer> FWCETMap;
    private HashMap<String, Integer> FBCETMap;
    
    public TimeValueTable(){
        this.LWCETMap = new HashMap<String, Integer>();
        this.LBCETMap = new HashMap<String, Integer>();
        this.FWCETMap = new HashMap<String, Integer>();
        this.FBCETMap = new HashMap<String, Integer>();
    }
    
    public HashMap<String, Integer> getLWCETMap() {
        return LWCETMap;
    }
    public void setLWCETMap(HashMap<String, Integer> lWCETMap) {
        LWCETMap = lWCETMap;
    }
    public HashMap<String, Integer> getLBCETMap() {
        return LBCETMap;
    }
    public void setLBCETMap(HashMap<String, Integer> lBCETMap) {
        LBCETMap = lBCETMap;
    }
    public HashMap<String, Integer> getFWCETMap() {
        return FWCETMap;
    }
    public void setFWCETMap(HashMap<String, Integer> fWCETMap) {
        FWCETMap = fWCETMap;
    }
    public HashMap<String, Integer> getFBCETMap() {
        return FBCETMap;
    }
    public void setFBCETMap(HashMap<String, Integer> fBCETMap) {
        FBCETMap = fBCETMap;
    }
    

}
