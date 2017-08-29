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
package de.cau.cs.kieler.prom

import de.cau.cs.kieler.prom.build.ModelCompiler
import de.cau.cs.kieler.prom.kibuild.BuildConfiguration
import java.util.List
import org.eclipse.core.runtime.IConfigurationElement
import de.cau.cs.kieler.prom.build.SimulationCompiler
import de.cau.cs.kieler.prom.build.SimpleTemplateProcessor
import de.cau.cs.kieler.prom.build.WrapperCodeTemplateProcessor
import de.cau.cs.kieler.prom.build.SimulationTemplateProcessor
import de.cau.cs.kieler.prom.build.TemplateProcessor

/**
 * @author aas
 *
 */
class KiBuildExtensions {
    
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
    
    public def List<TemplateProcessor> createTemplateProcessors(BuildConfiguration buildConfig) {
        val List<TemplateProcessor> templateProcessors = newArrayList
        for(config : buildConfig.templateProcessors) {
            var TemplateProcessor processor
            if(config instanceof de.cau.cs.kieler.prom.kibuild.NormalTemplateProcessor) {
                processor = new SimpleTemplateProcessor
            } else if(config instanceof de.cau.cs.kieler.prom.kibuild.WrapperCodeTemplateProcessor) {
                processor = new WrapperCodeTemplateProcessor
            } else if(config instanceof de.cau.cs.kieler.prom.kibuild.SimulationTemplateProcessor) {
                processor = new SimulationTemplateProcessor
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