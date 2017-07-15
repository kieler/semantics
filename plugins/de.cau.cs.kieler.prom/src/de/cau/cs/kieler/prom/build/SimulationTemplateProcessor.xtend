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
package de.cau.cs.kieler.prom.build

import com.google.common.io.Files
import de.cau.cs.kieler.prom.ModelImporter
import de.cau.cs.kieler.prom.PromPlugin
import de.cau.cs.kieler.prom.launch.WrapperCodeGenerator
import org.eclipse.core.runtime.Assert
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.emf.ecore.EObject

/**
 * @author aas
 *
 */
class SimulationTemplateProcessor extends TemplateProcessor {
    public val modelPath = new ConfigurableAttribute("modelFile")
    public val snippetFolder = new ConfigurableAttribute("snippetFolder", "snippets")
    public val compiledModelPath = new ConfigurableAttribute("compiledModelFile", "")
    
    @Accessors
    private var EObject model
    
    new() {
        super()
    }
    
    override process() {
        Assert.isNotNull(template.stringValue)
        Assert.isNotNull(target.stringValue)
        Assert.isNotNull(modelPath.stringValue)
        Assert.isNotNull(compiledModelPath.stringValue)
        
        if(monitor != null) {
            monitor.subTask("Processing simulation template '"+template.stringValue+"'")
        }
        val templateFile = project.getFile(template.stringValue)
        val targetFile = project.getFile(target.stringValue)
        val modelFile = project.getFile(modelPath.stringValue)
        val compiledModelFile = project.getFile(compiledModelPath.stringValue)
        // Get annotations in model
        val annotationDatas = newArrayList()
        if(model == null) {
            model = ModelImporter.load(modelFile)
        }
        WrapperCodeGenerator.getSimulationInterfaceData(model, annotationDatas)
        
        // Create wrapper code
        val targetName = Files.getNameWithoutExtension(targetFile.name)
        val modelName = Files.getNameWithoutExtension(modelFile.name)
        val generator = new WrapperCodeGenerator(project, snippetFolder.stringValue)
        val wrapperCode = generator.generateWrapperCode(templateFile.projectRelativePath.toOSString, annotationDatas,
            #{WrapperCodeGenerator.MODEL_NAME_VARIABLE -> modelName,
              WrapperCodeGenerator.FILE_NAME_VARIABLE -> targetName, 
              "compiled_model_loc" -> compiledModelFile.location} )
        
        // Save output
        val result = new FileGenerationResult
        PromPlugin.createResource(targetFile, wrapperCode, true)
        result.addCreatedFile(targetFile)
        return result
    }
}