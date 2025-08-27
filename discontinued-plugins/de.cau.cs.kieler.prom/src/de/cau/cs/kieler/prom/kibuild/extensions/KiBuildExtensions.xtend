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
package de.cau.cs.kieler.prom.kibuild.extensions

import de.cau.cs.kieler.prom.ExtensionLookupUtil
import de.cau.cs.kieler.prom.build.compilation.ModelCompiler
import de.cau.cs.kieler.prom.build.simulation.SimulationCompiler
import de.cau.cs.kieler.prom.build.templates.SimpleTemplateProcessor
import de.cau.cs.kieler.prom.build.templates.TemplateProcessor
import de.cau.cs.kieler.prom.kibuild.BuildConfiguration
import de.cau.cs.kieler.prom.kibuild.NormalTemplateProcessor
import de.cau.cs.kieler.prom.kibuild.SimulationTemplateProcessor
import de.cau.cs.kieler.prom.kibuild.WrapperCodeTemplateProcessor
import java.util.List
import org.eclipse.core.runtime.IConfigurationElement

/**
 * Extension methods to work with KiBuild files.
 * 
 * @author aas
 *
 */
class KiBuildExtensions {
    
    extension static val AttributeMappingExtensions attributeMappingExtensions = new AttributeMappingExtensions
    extension static val KiBuildCreateExtensions kiBuildCreateExtensions = new KiBuildCreateExtensions
    
    /**
     * Sets an attribute for all model compilers.
     */
    public def void setModelCompilerAttribute(BuildConfiguration config, String attributeName, String value) {
        for(m : config.modelCompilers) {
            m.attributes.setAttribute(attributeName, value)
        }
    }
    
    /**
     * Sets an attribute for all model compilers.
     */
    public def void setModelCompilerAttributeToStringList(BuildConfiguration config, String attributeName, List<String> values) {
        for(m : config.modelCompilers) {
            m.attributes.setAttributeToStringList(attributeName, values)
        }
    }
    
    /**
     * Sets an attribute for all simulation compilers.
     */
    public def void setSimulationCompilerAttribute(BuildConfiguration config, String attributeName, String value) {
        for(s : config.simulationCompilers) {
            s.attributes.setAttribute(attributeName, value)
        }
    }
    
    /**
     * Sets an attribute for all template processors.
     */
    public def void setTemplateProcessorAttribute(BuildConfiguration config, String attributeName, String value) {
        for(t : config.templateProcessors) {
            t.attributes.setAttribute(attributeName, value)
        }
    }
    
    /**
     * Creates the model compilers that are configured in the build configuration.
     * 
     * @param buildConfig The build configuration
     * @return a list of the instantiated model compilers
     */
    public def List<ModelCompiler> createModelCompilers(BuildConfiguration buildConfig) {
        val List<ModelCompiler> modelCompilers = newArrayList
        for(config : buildConfig.modelCompilers) {
            val name = config.name
            val requiredConfig = [IConfigurationElement elem | elem.getAttribute("name") == name]
            val configurations = ExtensionLookupUtil.getConfigurationElements("de.cau.cs.kieler.prom.modelCompiler",
                                                                              requiredConfig)
            if(!configurations.isNullOrEmpty) {
                val element = configurations.get(0)
                val modelCompiler = ExtensionLookupUtil.instantiateClassFromConfiguration(element) as ModelCompiler
                modelCompilers.add(modelCompiler)
                modelCompiler.initialize(config)
            } else {
                throw new Exception("Model compiler with name '"+name+"' could not be instantiated.")
            }
        }
        return modelCompilers
    }
    
    /**
     * Creates the simulation compilers that are configured in the build configuration.
     * 
     * @param buildConfig The build configuration
     * @return a list of the instantiated simulation compilers 
     */
    public def List<SimulationCompiler> createSimulationCompilers(BuildConfiguration buildConfig) {
        val List<SimulationCompiler> simulationCompilers = newArrayList
        for(config : buildConfig.simulationCompilers) {
                val name = config.name
                val requiredConfig = [IConfigurationElement elem | elem.getAttribute("name") == name]
                val configurations = ExtensionLookupUtil.getConfigurationElements("de.cau.cs.kieler.prom.simulationCompiler",
                                                                                  requiredConfig)
                if(!configurations.isNullOrEmpty) {
                    val element = configurations.get(0)
                    val simulationCompiler = ExtensionLookupUtil.instantiateClassFromConfiguration(element) as SimulationCompiler
                    simulationCompilers.add(simulationCompiler)
                    simulationCompiler.initialize(config)
                } else {
                    throw new Exception("Simulation compiler with name '"+name+"' could not be instantiated.")
                }
            }
        return simulationCompilers
    }
    
    /**
     * Creates the template processors that are configured in the build configuration.
     * 
     * @param buildConfig The build configuration
     * @return a list of the instantiated template processors 
     */
    public def List<TemplateProcessor> createTemplateProcessors(BuildConfiguration buildConfig) {
        val List<TemplateProcessor> templateProcessors = newArrayList
        for(config : buildConfig.templateProcessors) {
            var TemplateProcessor processor
            if(config instanceof NormalTemplateProcessor) {
                processor = new SimpleTemplateProcessor
            } else if(config instanceof WrapperCodeTemplateProcessor) {
                processor = new de.cau.cs.kieler.prom.build.templates.WrapperCodeTemplateProcessor
            } else if(config instanceof SimulationTemplateProcessor) {
                processor = new de.cau.cs.kieler.prom.build.templates.SimulationTemplateProcessor
            }
            if(processor != null) {
                if(!templateProcessors.contains(processor)) {
                    templateProcessors.add(processor)
                }
                processor.initialize(config)
            }
        }
        return templateProcessors
    }
}