/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2012 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */

package de.cau.cs.kieler.sim.signals.ui;

import java.util.LinkedList;

import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Display;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import de.cau.cs.kieler.sim.kiem.IJSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.JSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;
import de.cau.cs.kieler.sim.kiem.KiemPlugin;
import de.cau.cs.kieler.sim.kiem.properties.KiemProperty;
import de.cau.cs.kieler.sim.signals.JSONSignalValues;
import de.cau.cs.kieler.sim.signals.Signal;
import de.cau.cs.kieler.sim.signals.SignalList;
import de.cau.cs.kieler.sim.signals.ui.views.SignalsView;

/**
 * The class DataComponent implements a Execution Manager observer DataComponent and in each step
 * plots all signals and their histories.
 * 
 * @author cmot
 * @kieler.design 2012-10-08 proposed cmot
 * @kieler.rating 2012-08-08 yellow KI-22
 */
public class DataComponent extends JSONObjectDataComponent implements IJSONObjectDataComponent {

    /**
     * The Constant DEFAULT_ERROR_SIGNAL_KEY defines the default value for the JSON key where
     * erroneous signals can be declared.
     */
    private static final String DEFAULT_ERROR_SIGNAL_KEY = "errorSignal";

    /**
     * The error signal key the actual value for the JSON key where erroneous signals can be
     * declared. .
     */
    private String errorSignalKey;

    /** The Constant MAXIMALTICKS. */
    private static final int MAXIMALTICKS = 1000;

    /** The maximal ticks. */
    private int maximalTicks = MAXIMALTICKS;

    /** The signal list representing the current history. */
    private SignalList signalList = new SignalList(maximalTicks);

    /** An additional signal list to set or append. */
    private SignalList additionalSignalList;

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new data component.
     */
    public DataComponent() {
    }

    // -------------------------------------------------------------------------

    /**
     * Sets an additional signal list. Use cases are the comparison of signals. Note that newer
     * computations may override older signals that may appear in this list if they have the same
     * name. To prevent this, ensure unique signal names.
     * 
     * @param additionalSignalList
     *            the new additional signal list
     */
    public void setAdditionalSignalList(final LinkedList<Signal> additionalSignalList) {
        this.additionalSignalList = new SignalList(additionalSignalList, maximalTicks);
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void initialize() throws KiemInitializationException {
        // bring view to front
        bringToFront();

        // clear signalList
        this.signalList.clear();

        // if there are additional signals then append them now
        if (additionalSignalList != null) {
            this.signalList.appendClonedSignalList(additionalSignalList);
        }

        // consider global variable initializations
        try {
            step(this.getInitialVariables());
        } catch (KiemExecutionException e) {
            throw new KiemInitializationException(
                    "Considering global variable initializations failed", false, e);
        }
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public KiemProperty[] provideProperties() {
        KiemProperty[] properties = new KiemProperty[1];
        properties[0] = new KiemProperty("Error Signal Name", DEFAULT_ERROR_SIGNAL_KEY);
        return properties;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the signal list.
     * 
     * @return the signal list
     */
    public SignalList getSignalList() {
        return signalList;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the setting for the maximal ticks.
     * 
     * @return the maximal ticks
     */
    public int getMaximalTicks() {
        return this.maximalTicks;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void wrapup() throws KiemInitializationException {
        if (SignalsView.getInstance() != null) {
            // Reset error signals
            SignalsView.getInstance().getColors().resetSignalColor();
        }
        signalList.clear();
        if (SignalsView.getInstance() != null) {
            // update signal list
            SignalsView.getInstance().setSignalList(signalList);
            // asynchronous refresh
            Display.getDefault().syncExec(new Runnable() {
                public void run() {
                    SignalsView.getInstance().refresh(getTick());
                }
            });
        }
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public boolean isProducer() {
        // we must be sure not to miss any values
        // due to missing values turned into producer (lgr 7.7.16)
        return true;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public boolean isObserver() {
        return true;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the current KIEM tick.
     * 
     * @return the tick
     */
    public long getTick() {
        long tick = 0;
        if (KiemPlugin.getDefault() != null) {
            if (KiemPlugin.getDefault().getExecution() != null) {
                tick = KiemPlugin.getDefault().getExecution().getSteps();
            }
        }
        return tick;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public JSONObject step(final JSONObject jSONObject) throws KiemExecutionException {
        // get the (currently) defined error signal key
        errorSignalKey = getProperties()[0].getValue();

        // update tick information
        long tick = this.getTick();
        signalList.setCurrentTick(tick);

        // set all signals to absent (signals that are present explicitly will
        // be set to present afterwards
        for (Signal signal : this.signalList) {
            signal.setPresent(tick, false, null);
        }

        try {
            String[] fieldNames = JSONObject.getNames(jSONObject);
            if (fieldNames != null) {
                for (int c = 0; c < fieldNames.length; c++) {
                    // extract key, value from JSONObject
                    Object obj = jSONObject.get(fieldNames[c]);
                    String name = fieldNames[c];
                    boolean isPresent = false; // default
                    boolean isSignal = false;
                    Object  signalValue = null;
                    if (obj instanceof JSONObject) {
                        // can be a signal
                        isPresent = JSONSignalValues.isPresent((JSONObject) obj);
                        // extract signal value if any
                        if (JSONSignalValues.isSignalValue((JSONObject) obj)) {
                            isSignal = true;
                            signalValue = JSONSignalValues.getSignalValue((JSONObject) obj);
                            obj = signalValue;
                        }
                        
                        if (!isSignal) {
                            if (obj instanceof Double) {
                                isPresent = (Double)obj != 0;
                            } else if (obj instanceof Integer) {
                                isPresent = (Integer)obj != 0;
                            } else if (obj instanceof Boolean) {
                                isPresent = (Boolean)obj;
                            }
                        }
                    }

                    // only if this is a synchronous signal
                    if (isSignal) {
                        if (!signalList.containsSignal(name)) {
                            signalList.add(new Signal(name, maximalTicks));
                        }
                        Signal signal = signalList.getSignal(name);
                        signal.setPresent(tick, isPresent, signalValue);
                    }
                }
            }
        } catch (JSONException e) {
            // ignore signals that are not synchronous
        }

        // handle erroneous signals
        if (jSONObject.has(errorSignalKey)) {
            String errorSignalString = "";
            try {
                errorSignalString = jSONObject.getString(errorSignalKey);

                String[] errorSignalArray = errorSignalString.split(",");
                for (String errorSignalName : errorSignalArray) {
                    errorSignalName = errorSignalName.trim();
                    // use normal API to color the signal of this current tick erroneous
                    RGB errorSignalColor = SignalsView.getInstance().getColors()
                            .getSignalColorError();
                    SignalsView.getInstance().getColors()
                            .setSignalColor(errorSignalName, errorSignalColor, tick);
                }

            } catch (JSONException e) {
                KiemPlugin.getDefault().showError(
                        "Error signals (" + errorSignalKey
                                + ") cannot be parsed and do not contain"
                                + " a comma spearated list of signal names.",
                        SignalsUIPlugin.PLUGIN_ID, e, true);
            }

        }

        if (SignalsView.getInstance() == null) {
            bringToFront();
        }
        
        if (SignalsView.getInstance() != null) {
            // update signal list
            SignalsView.getInstance().setSignalList(signalList);
            // synchronous refresh
            try {
                Display.getDefault().asyncExec(new Runnable() {
                    public void run() {
                        SignalsView.getInstance().refresh(getTick());
                    }
                });
            } catch (Exception e) {
                // a refresh is supposed to silently fail
            }
            
        }

        return null;
    }

    // -------------------------------------------------------------------------

    /**
     * This method brings the Signals View to the front, if this is possible. Otherwise it may
     * silently fail to do so.
     */
    public void bringToFront() {
        SignalsView.bringToFront();
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public boolean isDeltaObserver() {
        return true;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public boolean isHistoryObserver() {
        return true;
    }

    // -------------------------------------------------------------------------
    
    /**
     * It should not matter what internals this component provides, only its properties matter so
     * overriding this method enables changes in this component without having to update the
     * .execution files.
     * 
     * (added by lgr 7.7.16)
     * 
     * {@inheritDoc}
     */
    @Override
    public String getDataComponentId() {
        String propertiesId = "";
        if (this.provideProperties() != null) {
            KiemProperty[] propertiesTmp = this.provideProperties();
            for (int c = 0; c < propertiesTmp.length; c++) {
                try {
                    propertiesId = propertiesId + propertiesTmp[c].getKey();
                    propertiesId = propertiesId + propertiesTmp[c].getType().getClass().getName();
                } catch (Exception e) {
                    // ignore properties that a key/type cannot be retrieved for
                }
            }
        }

        return this.getCurrentComponentID() + propertiesId.hashCode();

    }
}
