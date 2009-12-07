/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse Rich Client
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by + Christian-Albrechts-University of Kiel + Department of Computer Science +
 * Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL). See the file
 * epl-v10.html for the license text.
 */

package de.cau.cs.kieler.xkev.extension.dataobserver;

import de.cau.cs.kieler.sim.kiem.extension.IJSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.extension.JSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.extension.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.extension.KiemInitializationException;
import de.cau.cs.kieler.sim.kiem.json.JSONException;
import de.cau.cs.kieler.sim.kiem.json.JSONObject;
import de.cau.cs.kieler.xkev.mapping.animations.MapAnimations;
import de.cau.cs.kieler.xkev.mapping.animations.SVGLoadingStatusListener;

/**
 * A simple Example the Watertank.svg.
 * 
 * @author Stephan Knauer (skn) - skn[at]informatik.uni-kiel.de
 * 
 */
public class Example_04 extends JSONObjectDataComponent implements IJSONObjectDataComponent {

    private int counter = 0;
    private MapAnimations mapAnimation;

    public Example_04() {
        // TODO Auto-generated method stu
    }


    public JSONObject step(JSONObject JSONobject) throws KiemExecutionException {
        // TODO The new JSON Data must be connected with
        // the old SVG-Graphic and updated afterwards
        try {
           JSONobject.put("water", Integer.toString(counter));
           if (counter <= 29) {
               JSONobject.put("text", Double.toString((29-counter)*10.5));
           } else {
               JSONobject.put("text", Double.toString((counter-29)*10.5));
           }
           
           
           mapAnimation.doAnimations(JSONobject);
            
        } catch (JSONException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        if (counter<58) counter++;
        else counter = 0;

        return null;// Because it's only an Observer right now
    }


    public void initialize() throws KiemInitializationException {
        // TODO Auto-generated method stub
        mapAnimation = new MapAnimations("Watertank.mapping", true);
    }


    public boolean isObserver() {
        // TODO Auto-generated method stub
        return true;
    }


    public boolean isProducer() {
        // TODO Auto-generated method stub
        return false;
    }


    public void wrapup() throws KiemInitializationException {
        // TODO Auto-generated method stub
        counter = 0;

    }

    // @Override
    // public boolean isMaster() {
    // return true;
    // }

}
