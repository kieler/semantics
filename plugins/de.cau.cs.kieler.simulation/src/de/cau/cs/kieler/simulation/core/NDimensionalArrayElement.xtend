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
class NDimensionalArrayElement implements Cloneable {
    
    @Accessors
    private var Integer[] index;
    
    @Accessors
    private var Object value;
    
    new(Object value, Integer... index) {
        this.value = value
        this.index = index.clone
    }
    
    public def Object getCloneOfValue() {
        if(value instanceof String) {
            return new String(value)  
        } else if(value instanceof Boolean) {
            return new Boolean(value)
        } else if(value instanceof Integer) {
            return new Integer(value)
        } else if(value instanceof Float) {
            return new Float(value)
        } else if(value instanceof Double) {
            return new Double(value)
        } 
        return null
    }
}