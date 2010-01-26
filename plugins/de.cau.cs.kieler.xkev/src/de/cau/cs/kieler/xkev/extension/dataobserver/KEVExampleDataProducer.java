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
import org.json.JSONException;
import org.json.JSONObject;
import de.cau.cs.kieler.xkev.mapping.animations.MapAnimations;


/**
 * A simple Example the Watertank.svg.
 * 
 * @author Stephan Knauer (skn) - skn[at]informatik.uni-kiel.de
 * 
 */
public class KEVExampleDataProducer extends JSONObjectDataComponent implements
        IJSONObjectDataComponent {

    private int counter;
    private MapAnimations mapAnimation;

    public KEVExampleDataProducer() {
        // TODO Auto-generated method stu
    }

    public JSONObject step(JSONObject JSONobject) throws KiemExecutionException {
        // TODO The new JSON Data must be connected with
        // the old SVG-Graphic and updated afterwards
        JSONObject simulationData = new JSONObject();

        try {
            simulationData.put("water", Integer.toString(counter));
            if (counter <= 50) {
                simulationData.put("textString", Double.toString((50 - counter) * 10.5));
            } else {
                simulationData.put("textString", Double.toString((counter - 50) * 10.5));
            }
        } catch (JSONException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        if (counter < 360) {
            counter++;
        } else {
            counter = 0;
        }
        return simulationData;
    }

    /* (non-Javadoc)
     * @see de.cau.cs.kieler.sim.kiem.extension.IDataComponent#initialize()
     */
    public void initialize() throws KiemInitializationException {
        counter = 0;
    }

    /* (non-Javadoc)
     * @see de.cau.cs.kieler.sim.kiem.extension.IDataComponent#isObserver()
     */
    public boolean isObserver() {
        // TODO Auto-generated method stub
        return false;
    }

    /* (non-Javadoc)
     * @see de.cau.cs.kieler.sim.kiem.extension.IDataComponent#isProducer()
     */
    public boolean isProducer() {
        // TODO Auto-generated method stub
        return true;
    }

    /* (non-Javadoc)
     * @see de.cau.cs.kieler.sim.kiem.extension.IDataComponent#wrapup()
     */
    public void wrapup() throws KiemInitializationException {
        counter = 0;
    }
}
