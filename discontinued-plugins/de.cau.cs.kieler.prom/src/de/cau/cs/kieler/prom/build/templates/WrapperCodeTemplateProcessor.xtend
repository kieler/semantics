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
package de.cau.cs.kieler.prom.build.templates

import com.google.common.base.Strings
import com.google.common.io.Files
import de.cau.cs.kieler.prom.ModelImporter
import de.cau.cs.kieler.prom.PromPlugin
import de.cau.cs.kieler.prom.build.BuildProblem
import de.cau.cs.kieler.prom.build.FileGenerationResult
import de.cau.cs.kieler.prom.configurable.ConfigurableAttribute
import de.cau.cs.kieler.prom.templates.TemplateContext
import de.cau.cs.kieler.prom.templates.TemplateManager
import de.cau.cs.kieler.prom.configurable.ResourceSubstitution
import org.eclipse.core.runtime.Path

/**
 * Template processor that injects additional macro calls into the template before it is processed.
 * The macro calls are created from annotations in a model file.
 * 
 * @author aas
 *
 */
class WrapperCodeTemplateProcessor extends TemplateProcessor {
    /**
     * The model path with annotations to create wrapper code.
     */
    public val modelPath = new ConfigurableAttribute("modelFile", null, #[String])
    
    /**
     * Constructor
     */
    new() {
        super()
    }
    
    /**
     * {@inheritDoc}
     */
    override process() {
        if(monitor != null) {
            monitor.subTask("Processing wrapper code template '"+template.stringValue+"'")
        }
        // Notify listeners
        for(l : listeners)
            l.beforeProcessing(this)
        // Prepare result
        val result = new FileGenerationResult
        // Get file handles
        val templateFile = project.getFile(template.stringValue)
        val targetFile = project.getFile(target.stringValue)
        val modelFile = project.getFile(modelPath.stringValue)
        // Get annotations in model
        if(isCanceled) {
            return result
        }
        val model = ModelImporter.load(modelFile)
        if(model == null) {
            val problem = BuildProblem.createError(modelFile.project, "Model file '"+modelFile.projectRelativePath+"' "
                                                                    + "could not be loaded.")
            result.addProblem(problem)
        }
        val macroCallDatas = TemplateManager.getAnnotationInterface(model)
        
        // Create wrapper code
        if(isCanceled) {
            return result
        }
        // Create additional mappings for the template
        var modelName = TemplateManager.getModelName(model)
        if(modelName == null) {
            modelName = Files.getNameWithoutExtension(modelFile.name)
        }
        val targetFileSubstitution = new ResourceSubstitution("file") {
            override getValue() {
                return targetFile
            }
        }
        val additionalMappings = <String, Object> newHashMap
        additionalMappings.put(TemplateManager.MODEL_NAME_VARIABLE, Strings.nullToEmpty(modelName))
        additionalMappings.putAll(targetFileSubstitution.variableMappings)
        
        // Create the code
        context = new TemplateContext(templateFile)
        context.additionalMappings = additionalMappings
        context.macroCallDatas = macroCallDatas
        // Process the context and notify listeners
        val problem = super.processContext()
        if(problem !== null) {
            problem.issueSource = modelFile
            result.addProblem(problem)
            return result
        }
        // Notify listeners
        for(l : listeners)
            l.afterProcessing(this)
        
        // Save output
        if(isCanceled) {
            return result
        }
        PromPlugin.createResource(targetFile, generatedCode, true)
        result.addCreatedFile(targetFile)
        return result
    }
}