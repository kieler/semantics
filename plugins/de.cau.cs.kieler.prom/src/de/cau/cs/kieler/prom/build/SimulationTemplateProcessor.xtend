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
import de.cau.cs.kieler.prom.data.WrapperCodeAnnotationData
import de.cau.cs.kieler.prom.launch.WrapperCodeGenerator
import java.util.List
import java.util.Map
import java.util.Map.Entry
import org.eclipse.core.resources.IFile
import org.eclipse.core.runtime.Assert
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * @author aas
 *
 */
class SimulationTemplateProcessor extends TemplateProcessor {
    public val modelPath = new ConfigurableAttribute("modelFile")
    public val snippetFolder = new ConfigurableAttribute("snippetFolder", "snippets")
    public val compiledModelPath = new ConfigurableAttribute("compiledModelFile", "")
    public val additionalVariables = new ConfigurableAttribute("variables")
    public val interfaceTypes = new ConfigurableAttribute("interfaceTypes")
    
    @Accessors
    private var EObject model
    
    new() {
        super()
    }
    
    override process() {
        Assert.isNotNull(template.stringValue)
        Assert.isNotNull(target.stringValue)
        
        if(monitor != null) {
            monitor.subTask("Processing simulation template '"+template.stringValue+"'")
        }
        val templateFile = project.getFile(template.stringValue)
        val targetFile = project.getFile(target.stringValue)
        // Get annotations in model
        var List<WrapperCodeAnnotationData> annotationDatas = newArrayList()
        var IFile modelFile
        if(model == null && !modelPath.stringValue.isNullOrEmpty) {
            modelFile = project.getFile(modelPath.stringValue)
            model = ModelImporter.load(modelFile)
        }
        if(model != null) {
            WrapperCodeGenerator.getSimulationInterfaceData(model, annotationDatas)
        }
        // Get additional annotations from configuration
        if(additionalVariables.value != null) {
            val variablesMap = additionalVariables.value as Map<String, Object>
            for(entry : variablesMap.entrySet) {
                val datas = createDataFromVariablesMapping(entry)
                if(!datas.isNullOrEmpty) {
                    annotationDatas.addAll(datas)
                }
            }
        }
        // Set additional placeholder variables
        val targetName = Files.getNameWithoutExtension(targetFile.name)
        var String compiledModelFileLocation = ""
        if(!compiledModelPath.stringValue.isNullOrEmpty) {
            val compiledModelFile = project.getFile(compiledModelPath.stringValue)
            compiledModelFileLocation = compiledModelFile.location.toOSString
        }
        var String modelName = ""
        if(modelFile != null) {
            Files.getNameWithoutExtension(modelFile.name)
        }
        
        // Filter annotation datas based on the interface types that should be inclueded (input/output/internal)
        if(interfaceTypes.value != null) {
            if(interfaceTypes.value instanceof List) {
                annotationDatas = annotationDatas.filter[it.matches(interfaceTypes.value as List)].toList
            } else {
                annotationDatas = annotationDatas.filter[it.matches(interfaceTypes.stringValue)].toList
            }
        }
        
        // Create simulation code
        val generator = new WrapperCodeGenerator(project, snippetFolder.stringValue)
        val wrapperCode = generator.generateWrapperCode(templateFile.projectRelativePath.toOSString, annotationDatas,
            #{WrapperCodeGenerator.MODEL_NAME_VARIABLE -> modelName,
              WrapperCodeGenerator.FILE_NAME_VARIABLE -> targetName, 
              "compiled_model_loc" -> compiledModelFileLocation} )
        
        // Save output
        val result = new FileGenerationResult
        PromPlugin.createResource(targetFile, wrapperCode, true)
        result.addCreatedFile(targetFile)
        return result
    }
    
    private def List<WrapperCodeAnnotationData> createDataFromVariablesMapping(Entry<String, Object> entry) {
        if(entry.value instanceof List) {
            val List<WrapperCodeAnnotationData> datas = newArrayList
            for(v : entry.value as List) {
                datas.add(createData(entry.key, v as String, "int"))
            }
            return datas
        } else {
            return #[createData(entry.key, entry.value as String, "int")]
        }
    }
    
    private def WrapperCodeAnnotationData createData(String variableInterface, String varName, String varType) {
        val data = new WrapperCodeAnnotationData();
        val isInput = (variableInterface == "input")
        val isOutput = (variableInterface == "output")
        data.arguments.add(String.valueOf(isInput))
        data.arguments.add(String.valueOf(isOutput))
        
        data.interfaceTypes.add(variableInterface)
        data.input = true
        data.output = true
        data.name = "Simulate"
        data.varType = varType
        data.varName = varName
        return data
    }
    
    private def boolean matches(WrapperCodeAnnotationData data, List<String> interfaceTypes) {
        for(interfaceType : interfaceTypes) {
            if(data.matches(interfaceType)) {
                return true
            }
        }
        return false
    }
    
    private def boolean matches(WrapperCodeAnnotationData data, String interfaceType) {
        println(data.varName+" is "+interfaceType+":"+data.interfaceTypes.contains(interfaceType))
        return (data.interfaceTypes.contains(interfaceType))
    }
}