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
package de.cau.cs.kieler.simulation.internal

import com.google.gson.JsonObject
import de.cau.cs.kieler.kicool.compilation.VariableInformation
import de.cau.cs.kieler.kicool.compilation.VariableStore

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class SimulationVariableStore extends VariableStore {
    
    public static val INTERFACE_KEY = "#interface"
    
    new(JsonObject json) {
        this(json, null)
    }    
    new(VariableStore store) {
        this(null, store)
    }
    new(JsonObject json, VariableStore store) {
        var jsonInit = false
        if (json !== null) {
            val interface = json.get(INTERFACE_KEY)
            if (interface instanceof JsonObject) {
                for (entry : interface.entrySet) {
                    val content = entry.value
                    if (content instanceof JsonObject) {
                        val info = new VariableInformation
                        val type = content.get("type")
                        val properties = content.get("properties")
                        if (type.jsonPrimitive && type.asJsonPrimitive.isString) {
                            info.typeName = type.asJsonPrimitive.asString
                        }
                        if (properties.isJsonArray) {
                            info.properties += properties.asJsonArray.iterator.filter[isJsonPrimitive].map[asJsonPrimitive].filter[isString].map[asString].toIterable
                        }
                        variables.put(entry.key, info)                      
                    }
                    jsonInit = true
                }
            }
        }
        if (store !== null) {
            if (jsonInit) {
                // Extend by VarStore
                for (entry : variables.entries) {
                    val info = entry.value
                    val additionalInfo = store.variables.get(entry.key).head
                    if (additionalInfo !== null && !additionalInfo.encapsulated) {
                        if (info.inferType?.equals(additionalInfo.type)) {
                            info.type = additionalInfo.type
                            info.valuedObject = additionalInfo.valuedObject
                        }
                        info.properties.addAll(additionalInfo.properties)
                    }
                }
            } else {
                // Take all from VarStore
                val interfaceStore = if (store.variables.values.exists[properties.contains(INTERFACE_KEY)]) { // was processed by simulation template
                    store.getFilteredCopy(INTERFACE_KEY)
                } else { // fallback: take all
                    store
                }
                if (interfaceStore.ambiguous) {
                    throw new IllegalArgumentException("Cannot initialize using an ambiguous VariableStore.")
                } else {
                    this.copyFrom(interfaceStore)
                }
            }
        }
    }
    
}