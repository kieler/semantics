/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.kivis.interactions

import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * An abstract function with a name.
 * 
 * @author aas
 *
 */
abstract class NamedFunction {
    /**
     * The name of the function.
     */
    @Accessors(PUBLIC_GETTER)
    private var String name
    
    /**
     * Calculates the value of the function for the given arguments
     */
    def Object getValue(List<Object> arguments)
    
    /**
     * Constructor
     */
    new(String name) {
        this.name = name
    }
}