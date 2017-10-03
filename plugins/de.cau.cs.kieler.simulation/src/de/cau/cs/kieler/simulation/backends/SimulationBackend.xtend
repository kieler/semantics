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
package de.cau.cs.kieler.simulation.backends

import de.cau.cs.kieler.prom.ExtensionLookupUtil
import de.cau.cs.kieler.prom.PromPlugin
import de.cau.cs.kieler.prom.drafts.ProjectDraftData
import de.cau.cs.kieler.prom.kibuild.BuildConfiguration
import java.util.List
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.IConfigurationElement
import org.eclipse.core.runtime.preferences.InstanceScope
import org.osgi.service.prefs.Preferences

/**
 * Container for information about the backend compilation and simulation compilation for a target language.
 * For instance there could be a simulation backend that describes how to compile SCGraphs to C or Java
 * and how to create a simulation for these.
 * All models that can be compiled to SCGraphs can then be simulated using the C or Java backend.
 * 
 * A simulation backend requires that there is a kicool system or processor that compiles to the desired target language.
 * Further there must be a simulation compiler for the target language, such that the created code can be compiled to an executable.
 * 
 * The information of a simulation target is provided by specifying a build config,
 * which in turn holds a suited model compiler (possibly with a simulation template processor)
 * and simulation compiler for the target language.
 * 
 * @author aas
 *
 */
abstract class SimulationBackend {
    private static val SIMULATION_BACKEND_EXTENSION_POINT_ID = "de.cau.cs.kieler.simulation.simulationBackend"
    
    /**
     * The attribute to store this analyzer's frontend in the preferences.
     */
    private static val CURRENT_BACKEND_ATTR = "currentSimulationBackend"
    
    private static val DEFAULT_BACKEND = new CSimulationBackend
    
    private static var List<SimulationBackend> backends 
    
    public def String getName()
    public def BuildConfiguration getBuildConfig()
    public def ProjectDraftData getProjectDraft()
    
    public static def void setCurrentBackend(SimulationBackend value) {
        preferences.put(CURRENT_BACKEND_ATTR, value.name)
    }
    
    public static def SimulationBackend getCurrentBackend() {
        val currentBackendName = preferences.get(CURRENT_BACKEND_ATTR, DEFAULT_BACKEND.name)
        return getBackends().findFirst[it.name == currentBackendName]
    }
    
    /**
     * Returns all registered model analyzers.
     */
    public static def List<SimulationBackend> getBackends() {
        // Initialize if not done yet
        if(backends == null) { 
            initBackends
        }
        return backends
    }
    
    /**
     * Instantiate the backends from all registered extensions.
     */
    private static def void initBackends() {
        backends = newArrayList
        val config = ExtensionLookupUtil.getConfigurationElements(SIMULATION_BACKEND_EXTENSION_POINT_ID)
        try {
            for (IConfigurationElement e : config) {
                val o = e.createExecutableExtension("class");
                if (o instanceof SimulationBackend) {
                    backends.add(o)
                }
            }
        } catch (CoreException ex) {
            System.err.println(ex.getMessage());
        }
    }
    
    /**
     * Returns the preferences in which the attributes for model analyzers (such as the simulation frontend) are saved.
     */
    private static def Preferences getPreferences() {
        return InstanceScope.INSTANCE.getNode(PromPlugin.PLUGIN_ID)
    }
}