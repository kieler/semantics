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
package de.cau.cs.kieler.simulation

import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors
import org.osgi.service.prefs.Preferences

/**
 * @author aas
 *
 */
class SimulationFrontend {
    
    private static val FRONTEND_IDENTIFIERS_ATTR = "simulation.frontends"
    
    /**
     * The unique name.
     * It is used to unambiguously store this instance. 
     */
    @Accessors
    protected String name = ""
    
    @Accessors
    protected String compileChain = ""
    
    /**
     * Constructor
     * 
     * @param name The name
     * @param compileChain The compileChain
     */
    new(String name, String compileChain) {
        this.name = name
        this.compileChain = compileChain
    }
    
    /**
     * Saves the objects in the list to the preferences.
     * They can be retrieved by using loadAllFromPreferences(...)
     */
    public static def void saveAllToPreferences(Preferences prefs, List<SimulationFrontend> frontends){
        val frontendIdCSV = frontends.map[it.name].join(",")
        prefs.put(FRONTEND_IDENTIFIERS_ATTR, frontendIdCSV)
        for(frontend : frontends) {
            prefs.put(getStoreId(frontend.name), frontend.compileChain)
        }
    }
    
    /**
     * Loads all instances from the preference store
     * which have been saved using saveAllToPreferenceStore(...).
     * @return list with the loaded instances in the preferences.
     */
    public static def List<SimulationFrontend> loadAllFromPreferences(Preferences prefs){
        val frontends = <SimulationFrontend> newArrayList
        val frontendIdCSV = prefs.get(FRONTEND_IDENTIFIERS_ATTR, null)
        if(!frontendIdCSV.isNullOrEmpty) {
            val frontendIds = frontendIdCSV.split(",")
            for(frontendId : frontendIds) {
                val frontendCompileChain = prefs.get(getStoreId(frontendId), null)
                if(frontendCompileChain.isNullOrEmpty) {
                    val frontend = new SimulationFrontend(frontendId, frontendCompileChain)
                    frontends.add(frontend)
                }
            }
        }
        return frontends
    }
    
    /**
     * Returns the attribute id to store / load the frontend with the given id.
     * 
     * @param frontendId The id of the frontend
     * @return the attribute in the preference store to save / load the frontend
     */
    private static def String getStoreId(String frontendId) {
        return FRONTEND_IDENTIFIERS_ATTR+"."+frontendId
    }
}