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
package de.cau.cs.kieler.simulation.core

import org.eclipse.xtend.lib.annotations.Accessors

/**
 * @author aas
 *
 */
class Variable {
    public enum VariableType {
        INT, BOOL, FLOAT, STRING
    }
    
    @Accessors
    private String name
    
    @Accessors
    private VariableType type
    
    @Accessors
    private Object value
    
    @Accessors
    private boolean isInput
    
    @Accessors
    private boolean isOutput
 
    @Accessors
    private boolean isSignal
}