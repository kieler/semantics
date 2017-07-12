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
package de.cau.cs.kieler.simulation.validation

import de.cau.cs.kieler.simulation.kisim.DataHandlerConfiguration
import de.cau.cs.kieler.simulation.kisim.SimulationConfiguration
import java.util.Map
import org.eclipse.xtext.validation.Check
import com.google.common.base.Strings

/**
 * @author aas
 *
 */
class KiSimValidator extends KiSimJavaValidator {
    @Check
    public def void checkGreetingStartsWithCapital(SimulationConfiguration config) {
        val Map<String, DataHandlerConfiguration> handlersWithIds = newHashMap
        for(dataHandlerConfig : config.handlers) {
            val fullyQualifiedId = dataHandlerConfig.name + Strings.nullToEmpty(dataHandlerConfig.id)
            val handlerWithThisId = handlersWithIds.getOrDefault(fullyQualifiedId, null)
            if(handlerWithThisId != null) {
                val message = "Duplicated id '" + dataHandlerConfig.id+"' "
                            + "for '" + dataHandlerConfig.name + "' data handler"
                error(message, handlerWithThisId, null)
            } else {
                handlersWithIds.put(fullyQualifiedId, dataHandlerConfig)    
            }
        }
    }
}