/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2019 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.simulation.ide.language.server

import java.util.ArrayList
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * @author sdo
 *
 */
class Category {
    String name
    
    @Accessors(PUBLIC_GETTER)
    ArrayList<String> symbols
    
    new(String name) {
        this.name = name
        this.symbols = newArrayList
    }
    
    
}