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

import de.cau.cs.kieler.prom.configurable.ConfigurableAttribute
import de.cau.cs.kieler.simulation.core.DataPool
import de.cau.cs.kieler.simulation.core.DataPoolOperation
import java.util.Map

/**
 * Sets variables in models to constant values.
 * This can be useful for example to simply create a test setup.
 * 
 * @author aas
 *
 */
class SetterHandler extends DefaultDataHandler {
    /**
     * Optional name of the model of which the variables should be set.
     * If no model is specified, the first matching variable is used.
     */
    public val variablesMapping = new ConfigurableAttribute("variables", null, #[Map])
    
    /**
     * The operation of this data handler
     */
    private val operation = new DataPoolOperation("write") {
        override apply(DataPool pool) {
            write(pool)
        }
    }
    
    /**
     * {@inheritDoc}
     */
    override getOperations() {
        return #[operation]
    }
    
    /**
     * {@inheritDoc}
     */
    override getName() {
        return "setter"
    }
    
    /**
     * Sets the variables in the pool to the values from the variablesMapping.
     */
    private def void write(DataPool pool) {
        if(variablesMapping.mapValue == null) {
            return
        }
        val entries = variablesMapping.mapValue.entrySet
        for (entry : entries) {
            pool.setVariableValue(entry.key, entry.value, false)
        }
    }
}