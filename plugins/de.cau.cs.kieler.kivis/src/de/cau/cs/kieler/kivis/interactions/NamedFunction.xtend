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
 * @author aas
 *
 */
abstract class NamedFunction {
    @Accessors(PUBLIC_GETTER)
    private var String name
    
    def Object getValue(List<Object> arguments)
    
    new(String name) {
        this.name = name
    }
}