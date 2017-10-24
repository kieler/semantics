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
import de.cau.cs.kieler.prom.drafts.ProjectDraftData
import de.cau.cs.kieler.prom.kibuild.BuildConfiguration
import java.util.List
import org.eclipse.core.runtime.CoreException

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
    /**
     * The id of the extension point to register simulation backends
     */
    private static val SIMULATION_BACKEND_EXTENSION_POINT_ID = "de.cau.cs.kieler.simulation.simulationBackend"
    
    /**
     * The registered simulation backends.
     */
    private static var List<SimulationBackend> backends 
    
    /**
     * The name of this backend.
     */
    public def String getName()
    /**
     * The build config for this backend.
     */
    public def BuildConfiguration getBuildConfig()
    /**
     * The project draft for this backend.
     */
    public def ProjectDraftData getProjectDraft()
    /**
     * The processors that create code which can be simulated using this backend.
     */
    public def List<String> getSupportedProcessors()
    
    /**
     * Returns all registered backends.
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
            for (e : config) {
                val o = e.createExecutableExtension("class");
                if (o instanceof SimulationBackend) {
                    backends.add(o)
                }
            }
        } catch (CoreException ex) {
            ex.printStackTrace
        }
    }
    
    /**
     * Checks if this simulation backend can be used with the result of the given processor.
     * 
     * @param processorId The id of a processor
     * @return true if this simulation backend can be used with the result of the given processor, false otherwise.
     */
    public def boolean isSupported(String processorId) {
        val supportedProcessors = getSupportedProcessors
        return supportedProcessors.isNullOrEmpty || supportedProcessors.contains(processorId)
    }
}