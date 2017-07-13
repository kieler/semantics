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
package de.cau.cs.kieler.simulation.handlers

import de.cau.cs.kieler.simulation.core.DataPool
import de.cau.cs.kieler.simulation.core.Simulator

/**
 * @author aas
 *
 */
abstract class DefaultSimulator extends DefaultDataHandler implements Simulator {
    
    protected var String baseModelName
    
    protected def String getUniqueModelName(DataPool pool, String defaultName) {
        if(baseModelName.isNullOrEmpty) {
            return pool.getUniqueModelName(defaultName, 0)
        } else {
            return pool.getUniqueModelName(baseModelName, 0)
        }
    }
    
    override setBaseModelName(String value) {
        baseModelName = value
    }
    
    override getBaseModelName() {
        return baseModelName
    }
    
    override getName() {
        throw new UnsupportedOperationException("TODO: auto-generated method stub")
    }
    
}