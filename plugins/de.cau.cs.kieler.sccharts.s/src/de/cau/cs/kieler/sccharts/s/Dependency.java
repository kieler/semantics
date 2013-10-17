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


/**
 * This class holds a dependency between an SCCharts State and another SCCharts State. 
 * 
 * @author cmot
 * @kieler.design 2013-10-10 proposed 
 * @kieler.rating 2013-10-10 proposed yellow
 *
 */
public abstract class Dependency {
    
    private DependencyNode stateDependeing;
    private DependencyNode stateToDependOn;
    
    public Dependency() {
    }
    
    public Dependency(DependencyNode stateDependeing, DependencyNode stateToDependOn) {
        this.stateDependeing = stateDependeing;
        this.stateToDependOn = stateToDependOn;
    }
    
    public DependencyNode getStateDepending() {
        return stateDependeing;
    }
    
    public DependencyNode getStateToDependOn() {
        return stateToDependOn;
    }
    
    public void setStateDepending(DependencyNode stateDependeing) {
        this.stateDependeing = stateDependeing;
    }
    
    public void setStateToDependOn(DependencyNode stateToDependOn) {
        this.stateToDependOn = stateToDependOn;
    }
    
    
}
