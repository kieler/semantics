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
        
        public static final String NOT = "NOT";
        
        public static final String IN_CONNECTOR = "IN_CONNECTOR";
        
        public static final String OUT_CONNECTOR = "OUT_CONNECTOR";
        
        public static final String SELECTION = "SELECTION";
        
        public static final String TICK_IN = "TICK_IN";
        
        public static final String TICK_OUT = "TICK_OUT";
        
        public static final String SEL_TRUE_INPUT = "SEL_TRUE_INPUT";
        
        public static final String SEL_FALSE_INPUT = "SEL_FALSE_INPUT";
        
        public static final String RESET_IN = "RESET_IN";
        
        public static final String RESET_OUT = "RESET_OUT";
        
        public static final String RESET_LOCAL_IN = "RESET_LOCAL_IN";
        
        public static final String RESET_LOCAL_OUT = "RESET_LOCAL_OUT";

        public static final String RESET_PRE_IN = "RESET_PRE_IN";
        
        public static final String RESET_PRE_OUT = "RESET_PRE_OUT";
        
        public static final String GO_IN = "GO_IN";
        
        public static final String GO_OUT = "GO_OUT";
        

}
