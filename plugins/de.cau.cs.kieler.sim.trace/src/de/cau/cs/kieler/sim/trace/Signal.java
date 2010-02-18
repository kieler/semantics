/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sim.trace;

/**
 * @author ctr
 * 
 */
public class Signal {
    private String name;
    private Integer value = null;

    public Signal(String theName) {
        name = theName;
    }
    
    public Signal(String theName, int theValue) {
        name = theName;
        value = theValue;
    }

    public Integer getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    
    public boolean isValued(){
        return value!=null;
    }
}
