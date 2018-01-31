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

import de.cau.cs.kieler.kicool.ProcessorEntry
import de.cau.cs.kieler.kicool.ProcessorGroup
import de.cau.cs.kieler.kicool.ProcessorReference
import de.cau.cs.kieler.kicool.ProcessorSystem
import de.cau.cs.kieler.kicool.registration.KiCoolRegistration
import de.cau.cs.kieler.prom.ExtensionLookupUtil
import de.cau.cs.kieler.prom.build.compilation.KiCoModelCompiler
import de.cau.cs.kieler.prom.drafts.ProjectDraftData
import de.cau.cs.kieler.prom.kibuild.BuildConfiguration
import java.util.List
import org.eclipse.core.resources.IFile
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
     * Searches for a suited simulation backend for the given file.
     * 
     * @param file The file handle
     * @return A simulation backend that supports the given file
     * @throws Exception if no suited simulation backend is found.
     */
    public static def SimulationBackend findSimulationBackend(IFile file) {
        val simBack = SimulationBackend.backends.findFirst[it.isSupported(file)]
        if(simBack === null) {
            throw new Exception("No simulation backend was found for the file '"+file.name+"'") 
        }
        return simBack
    }
    
    /**
     * Searches for a suited simulation backend for the given compile chain.
     * Relevant for the simulation backend is the last processor that creates the target code for the models.
     * 
     * @param compileChain The compileChain
     * @return A simulation backend for the given compile chain
     * @throws Exception if no suited simulation backend is found.
     */
    public static def SimulationBackend findSimulationBackend(String compileChain) {
        val lastProcessorOrSystemId = KiCoModelCompiler.splitCompileChain(compileChain).last
        var String lastProcessorId
        try {
            val system = KiCoolRegistration.getSystemById(lastProcessorOrSystemId)
            // If there was no exception, then this is a system
            lastProcessorId = system.processors.getLastProcessorId    
        } catch (Exception ex) {
            try {
                val processor = KiCoolRegistration.getProcessorClass(lastProcessorOrSystemId)
                // If there was no exception, then this is a processor
                lastProcessorId = lastProcessorOrSystemId
            } catch(Exception e) {
            }
        }
        // Find a suited simulation backend for the processor id
        if(lastProcessorId.isNullOrEmpty) {
            throw new Exception("Cannot resolve compile chain '"+compileChain+"'")
        } else {
            for(backend : SimulationBackend.backends) {
                if(backend.isProcessorOutputSupported(lastProcessorId)) {
                    return backend
                }
            }
            throw new Exception("No simulation backend was found for the result of the last processor '"+lastProcessorId+"'")    
        }
    }
    
    /**
     * Returns the last processor id of the given processor entry.
     * The entry may also be a group of processors. The id of the last processor in this group is returned in this case.
     */
    private static def String getLastProcessorId(ProcessorEntry processors) {
        if(processors instanceof ProcessorGroup) { 
            return processors.processors.last.lastProcessorId
        } else if (processors instanceof ProcessorReference) {
            return processors.id
        } else if (processors instanceof ProcessorSystem) {
            return processors.id
        }
    } 
    
    /**
     * Returns the supported file extensions of programming languages that can be simulated using this backend.
     */
    abstract def List<String> getSupportedFileExtensions()
    
    /**
     * Returns true if the given file has a file extension that is supported by this simulation backend.
     */
    public def boolean isSupported(IFile file) {
        return isSupported(file.fileExtension)
    }
    
    /**
     * Returns true if the given file extension corresponds to a programming language that can be simulated using this backend.
     */
    public def boolean isSupported(String fileExtension) {
        if(fileExtension === null) {
            return false
        }
        return supportedFileExtensions.contains(fileExtension.toLowerCase)
    }
    
    /**
     * Checks if this simulation backend can be used with the result of the given processor.
     * 
     * @param processorId The id of a processor
     * @return true if this simulation backend can be used with the result of the given processor, false otherwise.
     */
    public def boolean isProcessorOutputSupported(String processorId) {
        val supportedProcessors = getSupportedProcessors
        return supportedProcessors.isNullOrEmpty || supportedProcessors.contains(processorId)
    }
}