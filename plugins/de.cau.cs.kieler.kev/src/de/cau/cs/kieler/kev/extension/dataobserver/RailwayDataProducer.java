/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.kev.extension.dataobserver;

import org.json.JSONException;
import org.json.JSONObject;

import de.cau.cs.kieler.sim.kiem.IJSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.JSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;

/**
 * @author stu121235
 *
 */
public class RailwayDataProducer extends JSONObjectDataComponent implements IJSONObjectDataComponent {
    
    private static final String OK_TEXT = "E_OK__simulation"; 
    
    private static final String SIGNAL_OFF = "S_OFF__simulation";
    
    private static final String SIGNAL_RED = "S_RED__simulation";
    
    private static final String SIGNAL_YELLOW = "S_YELLOW__simulation";
    
    private static final String SIGNAL_GREEN = "S_GREEN__simulation";
    
    private static final String TRACK_OFF = "M_OFF__simulation";
    
    private static final String TRACK_SLOW = "M_SECONDARY__simulation";
    
    private static final String TRACK_FULL = "M_PRIMARY__simulation";
    
    private static final String POINT_STRAIGHT = "P_STRAIGHT__simulation";
    
    private static final String POINT_BRANCH = "P_TURN__simulation";
    
    /**
     * {@inheritDoc}
     */
    @Override
    public void initialize() throws KiemInitializationException {
        // TODO Auto-generated method stub
        
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void wrapup() throws KiemInitializationException {
        // TODO Auto-generated method stub
        
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isProducer() {
        return true;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isObserver() {
        return true;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JSONObject step(JSONObject jSONObject) throws KiemExecutionException {
        JSONObject simulationData = new JSONObject();
        
        try {
            simulationData.put("text-KH_LN_2", "Backfisch");
        } catch (JSONException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        return simulationData;
    }
    
}
