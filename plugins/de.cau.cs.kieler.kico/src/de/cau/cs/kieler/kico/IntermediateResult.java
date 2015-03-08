/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kico;

/**
 * This class holds information about the intermediate results and the transformation leading to
 * this intermediate result together with performance measurements.
 * 
 * @author cmot
 * 
 */
public class IntermediateResult {

    private String transformationID;

    private long duration;

    private Object result;

    // -------------------------------------------------------------------------
    
    public IntermediateResult() {
        
    }

    public IntermediateResult(String transformationID, Object result, long duration) {
        this.transformationID = transformationID;
        this.result = result;
        this.duration = duration;
    }

    // -------------------------------------------------------------------------
    
    public void setTransformationId(String transformationID) {
        this.transformationID = transformationID;
    }
    
    // -------------------------------------------------------------------------
    
    public void setResut(Object result) {
        this.result = result;
    }
    
    // -------------------------------------------------------------------------
    
    public void setDuration(long duration) {
        this.duration = duration;
    }
    
    // -------------------------------------------------------------------------

    public Object getResult() {
        return result;
    }

    // -------------------------------------------------------------------------

    public String getTransformationID() {
        return transformationID;
    }

    // -------------------------------------------------------------------------

    public long getDuration() {
        return duration;
    }

    // -------------------------------------------------------------------------
}
