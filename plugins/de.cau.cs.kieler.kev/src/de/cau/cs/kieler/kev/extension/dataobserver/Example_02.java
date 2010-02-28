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

package de.cau.cs.kieler.kev.extension.dataobserver;

import de.cau.cs.kieler.kev.mapping.animations.MapAnimations;
import de.cau.cs.kieler.sim.kiem.IJSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.JSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * A simple Example for changing the color of the Trafficlight.svg.
 * 
 * @author Stephan Knauer (skn) - skn[at]informatik.uni-kiel.de
 * 
 */
public class Example_02 extends JSONObjectDataComponent implements IJSONObjectDataComponent {

    private boolean flag = true;
    private int counter = 0;
    
    public Example_02() {
        // TODO Auto-generated method stu
    }

    public JSONObject step(JSONObject JSONobject) throws KiemExecutionException {
        // TODO The new JSON Data must be connected with
        // the old SVG-Graphic and updated afterwards
        
        try {
            if (!((String) JSONobject.get("Ampelknopf")).equals("") && JSONobject.getBoolean("Ampelknopf")) {
                flag = !flag;
            }
            if (flag) {
                JSONobject.put("pRed", "on");
                JSONobject.put("pGreen", "off");
            } else {
                JSONobject.put("pRed", "off");
                JSONobject.put("pGreen", "on");
            }
            switch (counter) {
            case 0: JSONobject.put("cRed", "on"); 
                    JSONobject.put("cYellow", "off");
                    JSONobject.put("cGreen", "off");
                    break;
            case 1: JSONobject.put("cRed", "on"); 
                    JSONobject.put("cYellow", "on");
                    JSONobject.put("cGreen", "off");
                    break;
            case 2: JSONobject.put("cRed", "off");
                    JSONobject.put("cYellow", "off");
                    JSONobject.put("cGreen", "on");
                    break;
            case 3: JSONobject.put("cRed", "off");
                    JSONobject.put("cGreen", "off");
                    JSONobject.put("cYellow", "on");
                    counter = -1;
                    break;
            }
            counter++;
            MapAnimations.getInstance().doAnimations(JSONobject);

        
        } catch (JSONException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        //Now the SVG graphic needs to be refreshed
        //mapAnimation.getJSVGCanvas().setSVGDocument(mapAnimation.getSVGDocument());
        //mapAnimation.updateSVGGraphik();
        return null;// Because it's only an Observer right now
    }

    public void initialize() throws KiemInitializationException {
        // TODO Auto-generated method stub
        MapAnimations.getInstance().initializeMappingFile("Trafficlight.mapping", true);
    }

    public boolean isObserver() {
        // TODO Auto-generated method stub
        return true;
    }

    public boolean isProducer() {
        // TODO Auto-generated method stub
        return false;
    }

    public JSONObject provideInitialVariables()
    		throws KiemInitializationException {
    	JSONObject initialVars = new JSONObject();
    	try {
			initialVars.put("Ampelknopf", "false");
		} catch (JSONException e) {
			// FIXME: handle exception properly!!
		}
    	return initialVars;
    }
    
    public void wrapup() throws KiemInitializationException {
        // TODO Auto-generated method stub
        counter = 0;
    }

    // public boolean isMaster() {
    // return true;
    // }

}
