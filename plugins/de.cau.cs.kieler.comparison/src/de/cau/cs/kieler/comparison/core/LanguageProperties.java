/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2016 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.comparison.core;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author nfl
 */
public abstract class LanguageProperties {
    
    public static final String CYCLIC = "CYCLIC";
    public static final String ACYCLIC = "ACYCLIC";
    public static final String REACTIVE = "REACTIVE";
    public static final String DETERMINISTIC = "DETERMINISTIC";
    public static final String LOGICALLY_CORRECT = "LOGICAL-CORRECT";
    public static final String CONSTRUCTIVE = "CONSTRUCTIVE";
    public static final String NON_CONSTRUCTIVE = "NON-CONSTRUCTIVE";
    public static final String SEQUENTIALLY_CONSTRUCTIVE = "SEQUENTIAL-CONSTRUCTIVE";
    public static final String PURE = "PURE";
    public static final String VALUED = "VALUED";
    
    public static Collection<String> getAllProperties(){
        ArrayList<String> ret = new ArrayList<String>();
        ret.add(CYCLIC);
        ret.add(ACYCLIC);
        ret.add(REACTIVE);
        ret.add(DETERMINISTIC);
        ret.add(LOGICALLY_CORRECT);
        ret.add(CONSTRUCTIVE);
        ret.add(SEQUENTIALLY_CONSTRUCTIVE);
        ret.add(PURE);
        ret.add(VALUED);
        
        // TODO maybe add extension point?
        
        return ret;
    }
}
