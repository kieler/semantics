/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse Rich Client
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by + Kiel University + Department of Computer Science +
 * Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL). See the file
 * epl-v10.html for the license text.
 */

package de.cau.cs.kieler.kev.extension.dataobserver;

import de.cau.cs.kieler.sim.kiem.IJSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.JSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * A simple Example the Watertank.svg.
 * 
 * @author Stephan Knauer (skn) - skn[at]informatik.uni-kiel.de
 * @kieler.rating 2010-02-17 proposed yellow
 * @kieler.ignore deprecated project
 */
public class KEVExampleDataProducer extends JSONObjectDataComponent implements
        IJSONObjectDataComponent {

    private int counter = 0;

    
    /**
     * Producer for Example data for KEV.
     */
    public KEVExampleDataProducer() {
        // TODO Auto-generated method stu
    }

    /**
     * Step method, where JSON-Values are created.
     * @param JSONobject the current JSON Object, which will be updated
     * @return jsonObject the object with the current values
     * @throws KiemExecutionException 
     */
    public JSONObject step(final JSONObject JSONobject) throws KiemExecutionException {
        // TODO The new JSON Data must be connected with
        // the old SVG-Graphic and updated afterwards
        JSONObject simulationData = new JSONObject();

        try {
            simulationData.put("Counter_1", Integer.toString(counter));
            simulationData.put("Counter_2", Integer.toString(counter + 50));

            JSONObject jo = new JSONObject();
            jo.append("prensent", "true");

            if (counter <= 50) {
                simulationData.put("textString", Double.toString((50 - counter) * 10.5));
                jo.append("value", "50");
            } else {
                simulationData.put("textString", Double.toString((counter - 50) * 10.5));
                jo.append("value", "10");
            }
            simulationData.put("signal", jo);
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

    /*
     * (non-Javadoc)
     * 
     * @see de.cau.cs.kieler.sim.kiem.extension.IDataComponent#initialize()
     */
    public void initialize() throws KiemInitializationException {
        counter = 0;
    }

    /*
     * (non-Javadoc)
     * 
     * @see de.cau.cs.kieler.sim.kiem.extension.IDataComponent#isObserver()
     */
    public boolean isObserver() {
        // TODO Auto-generated method stub
        return false;
    }

    /*
     * (non-Javadoc)
     * 
     * @see de.cau.cs.kieler.sim.kiem.extension.IDataComponent#isProducer()
     */
    public boolean isProducer() {
        // TODO Auto-generated method stub
        return true;
    }

    /*
     * (non-Javadoc)
     * 
     * @see de.cau.cs.kieler.sim.kiem.extension.IDataComponent#wrapup()
     */
    public void wrapup() throws KiemInitializationException {
        counter = 0;
    }
}
