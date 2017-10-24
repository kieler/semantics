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
 * Default implementation of a simulator.
 * Handles the naming of models.
 * 
 * @author aas
 *
 */
abstract class DefaultSimulator extends DefaultDataHandler implements Simulator {
    
    /**
     * The desired name for the model
     */
    protected var String baseModelName
    
    /**
     * {@inheritDoc}
     */
    override setBaseModelName(String value) {
        baseModelName = value
    }
    
    /**
     * {@inheritDoc}
     */
    override getBaseModelName() {
        return baseModelName
    }
    
    /**
     * Returns a name for the model that is unique in the given data pool.
     * The base name is preferred. If there is no base name, the default name is used.
     * 
     * @param pool The pool
     * @param defaultName The default name
     * @return a unique name for a model in the data pool
     */
    protected def String getUniqueModelName(DataPool pool, String defaultName) {
        if(baseModelName.isNullOrEmpty) {
            return pool.getUniqueModelName(defaultName, 0)
        } else {
            return pool.getUniqueModelName(baseModelName, 0)
        }
    }
}