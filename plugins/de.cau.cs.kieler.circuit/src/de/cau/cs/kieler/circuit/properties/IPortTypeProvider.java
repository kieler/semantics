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
package de.cau.cs.kieler.circuit.properties;

/**
 * @author fry
 *
 */
public interface IPortTypeProvider {
    
        public static final String IN = "IN";
        
        public static final String OUT = "OUT";
        
        public static final String IN_CONNECTOR = "IN_CONNECTOR";
        
        public static final String OUT_CONNECTOR = "OUT_CONNECTOR";
        
        public static final String SELECTION = "SELECTION";
        
        public static final String TICK = "TICK";
        
        public static final String SEL_TRUE_INPUT = "SEL_TRUE_INPUT";
        
        public static final String SEL_FALSE_INPUT = "SEL_FALSE_INPUT";
        
        public static final String RESET = "RESET";

        public static final String RESET_PRE = "RESET_PRE";

}
