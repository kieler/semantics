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
public interface IActorTypeProvider {
    
    public static final String AND = "AND";
    
    public static final String OR = "OR";
    
    public static final String MUX = "MUX";
    
    public static final String REG = "REG";
    
    public static final String NOT = "NOT";
    
    public static final String VCC = "VCC";
    
    public static final String GND = "GND";
    
    public static final String GUARD_REGION = "GUARD_REGION";
    
    public static final String CIRCUIT_REGION = "CIRCUIT_REGION";

}
