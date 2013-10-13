/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.s;

import de.cau.cs.kieler.sccharts.State;

/**
 * This class holds a dependency between an SCCharts State and another SCCharts State. 
 * 
 * @author cmot
 * @kieler.design 2013-10-10 proposed 
 * @kieler.rating 2013-10-10 proposed yellow
 *
 */
public class Dependency {
    
    private State stateDependeing;
    private State stateToDependOn;
    
    public Dependency() {
    }
    
    public Dependency(State stateDependeing, State stateToDependOn) {
        this.stateDependeing = stateDependeing;
        this.stateToDependOn = stateToDependOn;
    }
    
    public State getStateDepending() {
        return stateDependeing;
    }
    
    public State getStateToDependOn() {
        return stateToDependOn;
    }
    
    public void setStateDepending(State stateDependeing) {
        this.stateDependeing = stateDependeing;
    }
    
    public void setStateToDependOn(State stateToDependOn) {
        this.stateToDependOn = stateToDependOn;
    }

}
