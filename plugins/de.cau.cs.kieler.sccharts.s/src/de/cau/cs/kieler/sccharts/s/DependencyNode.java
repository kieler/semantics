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
 * This class holds a dependency representation of an SCCharts State. 
 * 
 * @author cmot
 * @kieler.design 2013-10-10 proposed 
 * @kieler.rating 2013-10-10 proposed yellow
 *
 */
public class DependencyNode {
    
    private State state;
    private boolean isJoin;
    private int priority;
    
    public DependencyNode() {
    }
    
    public DependencyNode(State state) {
        this.state = state;
    }
    
    public State getState() {
        return state;
    }
    
    public void setState(State state) {
        this.state = state;
    }
    
    public void setIsJoin(boolean isJoin) {
        this.isJoin = isJoin;
    }

    public boolean getIsJoin() {
       return this.isJoin;
    }
    
    public int getPriority() {
        return priority;
    }
    
    public void setPriority(int priority) {
        this.priority = priority;
    }
}
