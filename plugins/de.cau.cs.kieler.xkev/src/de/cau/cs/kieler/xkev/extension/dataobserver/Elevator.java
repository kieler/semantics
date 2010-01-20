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

package de.cau.cs.kieler.xkev.extension.dataobserver;

import org.json.JSONException;
import org.json.JSONObject;

import de.cau.cs.kieler.sim.kiem.IJSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.JSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.JSONSignalValues;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;

//import de.cau.cs.kieler.xkev.mapping.animations.SVGLoadingStatusListener;

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
            if (jSONObject.has("MoveUp") && (JSONSignalValues.isPresent(jSONObject.get("MoveUp")))) {
                pos += STEP;
                if (pos > MAX)
                    pos = MAX;
            }
            if (jSONObject.has("MoveDown")
                    && (JSONSignalValues.isPresent(jSONObject.get("MoveDown")))) {

                pos -= STEP;
                if (pos < MIN)
                    pos = MIN;
            }
            result.accumulate("elevator", pos);

            if (jSONObject.has("OpenDoor")
                    && (JSONSignalValues.isPresent(jSONObject.get("OpenDoor")))) {
                doorOpen = true;
            }

            if (jSONObject.has("CloseDoor")
                    && (JSONSignalValues.isPresent(jSONObject.get("CloseDoor")))) {
                doorOpen = false;
            }

            result.accumulate("door_left", doorOpen);
            result.accumulate("door_right", doorOpen);

            result.accumulate("signal_alarm", jSONObject.has("AlarmLamp")
                    && (JSONSignalValues.isPresent(jSONObject.get("AlarmLamp"))));

            // visualize inputs
            result.accumulate("button_alarm", jSONObject.has("ButtonAlarm")
                    && JSONSignalValues.isPresent(jSONObject.get("ButtonAlarm")));

            result.accumulate("button_up", jSONObject.has("ButtonUp")
                    && (JSONSignalValues.isPresent(jSONObject.get("ButtonUp"))));

            result.accumulate("button_down", jSONObject.has("ButtonDown")
                    && (JSONSignalValues.isPresent(jSONObject.get("ButtonDown"))));

            result.accumulate("signal_up", jSONObject.has("MoveUp")
                    && (JSONSignalValues.isPresent(jSONObject.get("MoveUp"))));
            result.accumulate("signal_down", jSONObject.has("MoveDown")
                    && (JSONSignalValues.isPresent(jSONObject.get("MoveDown"))));

            // generate inputs
            result.accumulate("IsUp", JSONSignalValues.newValue(pos == MAX));
            result.accumulate("IsDown", JSONSignalValues.newValue(pos == MIN));
            result.accumulate("Second", JSONSignalValues.newValue(sec));
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
            returnObj.accumulate("ButtonUp", JSONSignalValues.newValue(false));
            returnObj.accumulate("ButtonDown", JSONSignalValues.newValue(false));
            returnObj.accumulate("ButtonAlarm", JSONSignalValues.newValue(false));
            returnObj.accumulate("IsUp", JSONSignalValues.newValue(false));
            returnObj.accumulate("IsDown", JSONSignalValues.newValue(false));
            returnObj.accumulate("Second", JSONSignalValues.newValue(false));
            returnObj.accumulate("MoveUp", JSONSignalValues.newValue(false));
            returnObj.accumulate("MoveDown", JSONSignalValues.newValue(false));
            returnObj.accumulate("OpenDoor", JSONSignalValues.newValue(false));
            returnObj.accumulate("AlarmLamp", JSONSignalValues.newValue(false));
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
