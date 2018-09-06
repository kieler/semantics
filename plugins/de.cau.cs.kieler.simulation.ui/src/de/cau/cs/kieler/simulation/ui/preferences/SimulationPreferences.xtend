/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2018 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.simulation.ui.preferences

import de.cau.cs.kieler.core.model.properties.MapPropertyHolder
import de.cau.cs.kieler.simulation.SimulationContext
import de.cau.cs.kieler.simulation.ui.SimulationUIPlugin
import org.eclipse.jface.preference.IPreferenceStore

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class SimulationPreferences extends MapPropertyHolder {

    private val IPreferenceStore store = SimulationUIPlugin.instance.preferenceStore

    new() {
        store.setDefault(SimulationContext.REACTION_TIMEOUT_IN_SECONDS.id, SimulationContext.REACTION_TIMEOUT_IN_SECONDS.^default)
        setProperty(SimulationContext.REACTION_TIMEOUT_IN_SECONDS, getIntValue(SimulationContext.REACTION_TIMEOUT_IN_SECONDS.id))
        
        store.setDefault(SimulationContext.MAX_HISTORY_LENGTH.id, SimulationContext.MAX_HISTORY_LENGTH.^default)
        setProperty(SimulationContext.MAX_HISTORY_LENGTH, getIntValue(SimulationContext.MAX_HISTORY_LENGTH.id))
    }
    
    def resetToDefault() {
        propertyMap.clear
        
        store.setValue(SimulationContext.REACTION_TIMEOUT_IN_SECONDS.id, SimulationContext.REACTION_TIMEOUT_IN_SECONDS.^default)
        store.setValue(SimulationContext.MAX_HISTORY_LENGTH.id, SimulationContext.MAX_HISTORY_LENGTH.^default)
    }
    
    def int getIntValue(String id) {
        if (store.isDefault(id)) {
            store.getDefaultInt(id)
        } else {
            store.getInt(id)
        }
    }
    
    
    def setValue(String id, int value) {
        store.setDefault(id, value)
        setPropertyById(id, value)
    }
    
}