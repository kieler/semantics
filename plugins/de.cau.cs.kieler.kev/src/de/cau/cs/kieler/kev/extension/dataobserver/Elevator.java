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

package de.cau.cs.kieler.kev.extension.dataobserver;

import org.json.JSONException;
import org.json.JSONObject;

import de.cau.cs.kieler.sim.kiem.IJSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.JSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.JSONSignalValues;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;

//import de.cau.cs.kieler.kev.mapping.animations.SVGLoadingStatusListener;

/**
 * A small simulation for the elevator example, computing the position and the lamps based on signal
 * inputs. Should be obsolete as soos as, we can simulate dataflow and xkev understands pure signals
 * directly.
 * 
 * @author ctr
 * 
 */
public class Elevator extends JSONObjectDataComponent implements IJSONObjectDataComponent {

    private int pos = 0;
    private boolean doorOpen;

    private boolean sec;

    private final static String BUTTON_UP = "BUTTON_UP"; 
    private final static String BUTTON_DOWN = "BUTTON_DOWN"; 
    private final static String BUTTON_ALARM = "BUTTON_ALARM"; 
    private final static String IS_UP = "IS_UP"; 
    private final static String IS_DOWN = "IS_DOWN"; 
    private final static String SECOND = "SECOND"; 
    private final static String MOVE_UP = "MOVE_UP"; 
    private final static String MOVE_DOWN = "MOVE_DOWN"; 
    private final static String OPEN_DOOR = "OPEN_DOOR"; 
    private final static String CLOSE_DOOR = "CLOSE_DOOR"; 
    private final static String ALARM_LAMP = "ALARM_LAMP"; 
    

    
    private static final int MAX = 100;
    private static final int MIN = 0;
    private static final int STEP = 5;

    public Elevator() {
        // TODO Auto-generated constructor stub
    }

    public JSONObject step(JSONObject jSONObject) throws KiemExecutionException {
        JSONObject result = new JSONObject();

        try {
            // Handle outputs
            if (jSONObject.has(MOVE_UP) && (JSONSignalValues.isPresent(jSONObject.get(MOVE_UP)))) {
                pos += STEP;
                if (pos > MAX)
                    pos = MAX;
            }
            if (jSONObject.has(MOVE_DOWN)
                    && (JSONSignalValues.isPresent(jSONObject.get(MOVE_DOWN)))) {

                pos -= STEP;
                if (pos < MIN)
                    pos = MIN;
            }
            result.accumulate("elevator", pos);

            if (jSONObject.has(OPEN_DOOR)
                    && (JSONSignalValues.isPresent(jSONObject.get(OPEN_DOOR)))) {
                doorOpen = true;
            }

            if (jSONObject.has(CLOSE_DOOR)
                    && (JSONSignalValues.isPresent(jSONObject.get(CLOSE_DOOR)))) {
                doorOpen = false;
            }

            result.accumulate("door_left", doorOpen);
            result.accumulate("door_right", doorOpen);

            result.accumulate("signal_alarm", jSONObject.has(ALARM_LAMP)
                    && (JSONSignalValues.isPresent(jSONObject.get(ALARM_LAMP))));

            // visualize inputs
            result.accumulate("button_alarm", jSONObject.has(BUTTON_ALARM)
                    && JSONSignalValues.isPresent(jSONObject.get(BUTTON_ALARM)));

            result.accumulate("button_up", jSONObject.has(BUTTON_UP)
                    && (JSONSignalValues.isPresent(jSONObject.get(BUTTON_UP))));

            result.accumulate("button_down", jSONObject.has(BUTTON_DOWN)
                    && (JSONSignalValues.isPresent(jSONObject.get(BUTTON_DOWN))));

            result.accumulate("signal_up", jSONObject.has(MOVE_UP)
                    && (JSONSignalValues.isPresent(jSONObject.get(MOVE_UP))));
            result.accumulate("signal_down", jSONObject.has(MOVE_DOWN)
                    && (JSONSignalValues.isPresent(jSONObject.get(MOVE_DOWN))));

            // generate inputs
            result.accumulate(IS_UP, JSONSignalValues.newValue(pos == MAX));
            result.accumulate(IS_DOWN, JSONSignalValues.newValue(pos == MIN));
            result.accumulate(SECOND, JSONSignalValues.newValue(sec));
            sec = !sec;

        } catch (JSONException e) {
            e.printStackTrace();
        }
        return result;
    }

    public boolean isObserver() {
        return true;
    }

    public boolean isProducer() {
        return true;
    }

    @Override
    public JSONObject provideInitialVariables() {
        JSONObject returnObj = new JSONObject();
        try {
            returnObj.accumulate(BUTTON_UP, JSONSignalValues.newValue(false));
            returnObj.accumulate(BUTTON_DOWN, JSONSignalValues.newValue(false));
            returnObj.accumulate(BUTTON_ALARM, JSONSignalValues.newValue(false));
            returnObj.accumulate(IS_UP, JSONSignalValues.newValue(false));
            returnObj.accumulate(IS_DOWN, JSONSignalValues.newValue(false));
            returnObj.accumulate(SECOND, JSONSignalValues.newValue(false));
            returnObj.accumulate(MOVE_UP, JSONSignalValues.newValue(false));
            returnObj.accumulate(MOVE_DOWN, JSONSignalValues.newValue(false));
            returnObj.accumulate(OPEN_DOOR, JSONSignalValues.newValue(false));
            returnObj.accumulate(CLOSE_DOOR, JSONSignalValues.newValue(false));
            returnObj.accumulate(ALARM_LAMP, JSONSignalValues.newValue(false));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return returnObj;
    }

    public void wrapup() throws KiemInitializationException {

    }

    /**
     * {@inheritDoc}
     */
    public void initialize() throws KiemInitializationException {
        pos = 0;
        doorOpen = false;
    }

}
