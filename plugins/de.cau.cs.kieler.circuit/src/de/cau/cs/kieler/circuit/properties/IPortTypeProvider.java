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
        
        /**
         * Port types for simple gates like AND, OR and registers etc.
         */
    
        /** Input port for gates. */
        public static final String IN = "IN";
        
        /** Output port for gates. */
        public static final String OUT = "OUT";
        
        /** Negates input signal for gates. Creates a circle as port. */
        public static final String NOT = "NOT";

        /** Global tick signal. Creates triangular input port at gates or regions. */
        public static final String TICK = "TICK";
        
        
        /** Different reset types. Use RESET_PRE for all registers in logic region.  
         * @see IActorTypeProvider.LOGIC_REGION
         * Use RESET for all registers in initialization region.
         * @see IActorTypeProvider.INIT_REGION
         * Use RESET_LOCAL to create the RESET_PRE signal for logic region.
         * 
         * All reset input ports will be placed at bottom of registers.
         */
        
        public static final String RESET_PRE_IN = "RESET_PRE_IN";
        
        public static final String RESET_PRE_OUT = "RESET_PRE_OUT";
        
        public static final String RESET_OUT = "RESET_OUT";
        
        public static final String RESET_IN = "RESET_IN";
        
        public static final String RESET_LOCAL_IN = "RESET_LOCAL_IN";
        
        public static final String RESET_LOCAL_OUT = "RESET_LOCAL_OUT";
        
        
        /**
         * Port types for 2-1 multiplexer.
         */
        
        /** Input port for signal which is emitted if selection signal is true. */
        public static final String SEL_TRUE_IN = "SEL_TRUE_INPUT";
        
        /** Input port for signal which is emitted if selection signal is false. */
        public static final String SEL_FALSE_IN = "SEL_FALSE_INPUT";
        
        /** Input port for selection entry on multiplexer. */
        public static final String MUX_SELECTION = "MUX_SELECTION";
        
        
        /**
         * Connector port types for regions.
         */
        
        /** Input connector ports for initialization region. All of these ports get signals from environment.*/
        public static final String IN_CONNECTOR_INIT = "IN_CONNECTOR_INIT";
        
        /** Output connector ports for initialization region. 
         * All of these ports are connected to input connector ports from logic region. */
        public static final String OUT_CONNECTOR_INIT = "OUT_CONNECTOR_INIT";
        
        /** Input connector ports for logic region. 
         * All of these ports are connected to output connector ports from initialization region. */
        public static final String IN_CONNECTOR_LOGIC = "IN_CONNECTOR_LOGIC";
        
        /** Output connector ports for logic region. All of these ports emit signals to environment. */
        public static final String OUT_CONNECTOR_LOGIC = "OUT_CONNECTOR_LOGIC";
        
        
        
        /**
         * Go Signals
         */


        /** Go input signal for gates. */
        public static final String GO_IN = "GO_IN";
        
        public static final String GO_OUT_INIT = "GO_OUT_INIT";
        
        public static final String GO_OUT = "GO_OUT";
        
        public static final String GO_IN_LOGIC = "GO_IN_LOGIC";

}
