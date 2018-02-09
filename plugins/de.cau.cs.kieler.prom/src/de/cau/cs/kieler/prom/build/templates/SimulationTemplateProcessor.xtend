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
import de.cau.cs.kieler.prom.build.FileGenerationResult
import de.cau.cs.kieler.prom.configurable.ConfigurableAttribute
import de.cau.cs.kieler.prom.configurable.ResourceSubstitution
import de.cau.cs.kieler.prom.templates.MacroCallData
import de.cau.cs.kieler.prom.templates.TemplateContext
import de.cau.cs.kieler.prom.templates.TemplateManager
import java.util.List
import java.util.Map
import java.util.Map.Entry
import java.util.regex.Pattern
import org.eclipse.core.resources.IFile
import org.eclipse.core.runtime.Assert
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtend.lib.annotations.Accessors
import de.cau.cs.kieler.prom.templates.VariableInterfaceType

/**
 * Template processor that injects additional macro calls into the template before it is processed.
 * The macro calls are created from the variables in a model file to have these available in the simulation.
 * 
 * @author aas
 *
 */
class SimulationTemplateProcessor extends TemplateProcessor {
    /**
     * The default variable type for additional variables.
     */
    public val DEFAULT_VARIABLE_TYPE = "bool"
    
    /**
     * The model file with the simulation interface.
     */
    public val modelPath = new ConfigurableAttribute("modelFile", null, #[String])
    
    /**
     * The location of the compiled model.
     * It is used for additional variable replacements in the template.
     */
    public val compiledModelPath = new ConfigurableAttribute("compiledModelFile", "", #[String])
    
    /**
     * Additional variables that should be included in the simulation generation.
     * Example for this field:
     * 
     *  variables {
     *    input: myVar1
     *    output: {
     *      bool: myVar2
     *      bool: myVar4[2][3]
     *    }
     *  }
     */
    public val additionalVariables = new ConfigurableAttribute("variables", null, #[Map])
    
     /**
      * The interface types that should be included in the simulation generation.
      * Examples for interface types are input/output/internal.
      * 
      * If this is not set, then all interface types are included.
      */
    public val interfaceTypes = new ConfigurableAttribute("interfaceTypes", null, #[String, List])
    
    /**
     * The model of which the simulation interface is used.
     */
    @Accessors
    private var EObject model
    
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
        Assert.isNotNull(template.stringValue)
        Assert.isNotNull(target.stringValue)
        if(monitor != null) {
            monitor.subTask("Processing simulation template '"+template.stringValue+"'")
        }
        val result = new FileGenerationResult
        // Notify listeners
        for(l : listeners)
            l.beforeProcessing(this)
            
        // Get file handles
        val templateFile = project.getFile(template.stringValue)
        val targetFile = project.getFile(target.stringValue)
        
        // Prepare the macro calls to be injected in the template
        var List<MacroCallData> macroCallDatas = newArrayList()
        
        // Get simulation interface from model
        if(isCanceled) {
            return result
        }
        var IFile modelFile
        if(!modelPath.stringValue.isNullOrEmpty) {
            modelFile = project.getFile(modelPath.stringValue)
        }
        if(model == null && modelFile.exists) {
            model = ModelImporter.load(modelFile)
        }
        if(model != null) {
            macroCallDatas = TemplateManager.getSimulationInterface(model)
        }
        
        // Get additional annotations from configuration
        if(isCanceled) {
            return result
        }
        if(additionalVariables.value != null && additionalVariables.value instanceof Map) {
            val variablesMap = additionalVariables.mapValue
            for(entry : variablesMap.entrySet) {
                val datas = createDataFromVariablesMapping(entry)
                if(!datas.isNullOrEmpty) {
                    macroCallDatas.addAll(datas)
                }
            }
        }
        
        // Set additional placeholder variables
        if(isCanceled) {
            return result
        }
        var String compiledModelFileLocation = ""
        if(!compiledModelPath.stringValue.isNullOrEmpty) {
            val compiledModelFile = project.getFile(compiledModelPath.stringValue)
            compiledModelFileLocation = compiledModelFile.location.toOSString
        }
        
        // Filter annotation datas based on the interface types that should be included (e.g. input/output/internal)
        if(isCanceled) {
            return result
        }
        if(interfaceTypes.value != null) {
            if(interfaceTypes.value instanceof List) {
                macroCallDatas = macroCallDatas.filter[it.matches(interfaceTypes.value as List)].toList
            } else {
                macroCallDatas = macroCallDatas.filter[it.matches(interfaceTypes.stringValue)].toList
            }
        }
        
        // Create additional mappings for the template
        if(isCanceled) {
            return result
        }
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
        additionalMappings.put("compiled_model_loc", compiledModelFileLocation)
        additionalMappings.put(TemplateManager.MODEL_NAME_VARIABLE, Strings.nullToEmpty(modelName))
        additionalMappings.putAll(targetFileSubstitution.variableMappings)
        
        // Create simulation code
        context = new TemplateContext(templateFile)
        context.additionalMappings = additionalMappings
        context.macroCallDatas = macroCallDatas
        // Process
        val problem = super.processContext()
        if(problem !== null) {
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
    
    /**
     * Creates macro call datas from an entry of the configurable additional variables.
     * 
     * @param entry An entry of the map of the additional variables
     * @return The list of macro call datas to simulate the additional variables in the entry
     */
    private def List<MacroCallData> createDataFromVariablesMapping(Entry<String, Object> entry) {
        if(entry.value instanceof String) {
            // The value is a simple string (e.g. input: I)
            return #[createData(entry.key, entry.value as String, DEFAULT_VARIABLE_TYPE)]
        } else if(entry.value instanceof List) {
            // The value is a list (e.g. output: O, out, x)
            val List<MacroCallData> datas = newArrayList
            for(v : entry.value as List) {
                if(v instanceof String) {
                    datas.add(createData(entry.key, v as String, DEFAULT_VARIABLE_TYPE))    
                } else {
                    throw new Exception("Could not create additional variable for the value "+v)
                }
            }
            return datas
        } else if(entry.value instanceof Map) {
            // If the value is a map, then we assume that the key of the map is the variable type
            // and the value of the map are the variable names (and array declarations).
            val interfaceType = entry.key
            val List<MacroCallData> datas = newArrayList
            val typeAndNamesMap = entry.value as Map<String, Object>
            for(typeAndNames : typeAndNamesMap.entrySet) {
                val type = typeAndNames.key
                val names = typeAndNames.value
                if(names instanceof String) {
                    // Add only one variable with this interface type and variable type
                    datas.add(createData(interfaceType, names, type))
                } else if(names instanceof List) {
                    // Add a list of variables with this interface type and variable type
                    for(name : names) {
                        datas.add(createData(interfaceType, name as String, type))
                    }
                }
            }
            return datas
        } else {
            throw new Exception("Could not create additional variable for the value "+entry.value)
        }
    }
    
    /**
     * Creates a macro call data for simulation generation.
     * 
     * @param variableInterface The interfaceType
     * @param varName The name of the variable
     * @param varType The type of the variable
     * @return the created macro call data
     */
    private def MacroCallData createData(String variableInterface, String varName, String varType) {
        val isInput = (variableInterface == "input")
        val isOutput = (variableInterface == "output")
        val isInternal = (variableInterface == "internal")
        val data = new MacroCallData 
        data.initializeForSimulationGeneration(varName, varType, isInput, isOutput, isInternal)
        
        // Add (optional) array sizes.
        // The format would be VAR_NAME[SIZE_0][SIZE_1]...[SIZE_N]
        val index = varName.indexOf("[")
        if(index >= 0) {
            data.varName = varName.substring(0,index)
            val arrayIndexPart = varName.substring(index+1) 
            val numberPattern = Pattern.compile("\\d+")
            val matcher = numberPattern.matcher(arrayIndexPart)
            while (matcher.find()) {
                data.arguments.add(matcher.group())
            }
        }
        
        return data
    }
    
    /**
     * Checks whether the data should be used given the interface types.
     * 
     * @param data The macro call data
     * @param allowedInterfaceTypes List of the allowed interface types
     * @return true if the interface type of the data occurs in the list of allowed interface types.
     */
    private def boolean matches(MacroCallData data, List<String> allowedInterfaceTypes) {
        for(interfaceType : allowedInterfaceTypes) {
            if(data.matches(interfaceType)) {
                return true
            }
        }
        return false
    }
    
    /**
     * Checks whether the data should be used given the interface types.
     * 
     * @param data The macro call data
     * @param allowedInterfaceType The allowed interface type
     * @return true if the interface type of the data contains the allowed interface type.
     */
    private def boolean matches(MacroCallData data, String allowedInterfaceTypeName) {
        val allowedInterfaceType = VariableInterfaceType.getInterfaceType(allowedInterfaceTypeName)
        if(allowedInterfaceType === null) {
            throw new Exception("Undefined interface type '"+allowedInterfaceTypeName+"' in simulation template processor.\n"
                              + "Possible types are: "+VariableInterfaceType.ALL_INTERFACE_TYPES.map[it.name].join(","))
        }
        for(interfaceType : data.interfaceTypes) {
            if(interfaceType == allowedInterfaceType) {
                return true
            }
        }
        return false
    }
    
    /**
     * Adds variables to the simulation interface.
     */
     public def void putAdditionalVariables(String interfaceType, List<String>  variables) {
         if(additionalVariables.value == null) {
            additionalVariables.value = newHashMap
        }
        additionalVariables.mapValue.put(interfaceType, variables)
     }
     
     /**
     * Adds a variable to the simulation interface.
     */
     public def void putAdditionalVariable(String interfaceType, String variable) {
        val variables = newArrayList(variable)
        putAdditionalVariables(interfaceType, variables)
     }
     
     /**
     * Adds variables to the simulation interface.
     */
     public def void putAdditionalVariables(String interfaceType, String type, List<String> variables) {
         if(additionalVariables.value == null) {
            additionalVariables.value = newHashMap
        }
        val map = newHashMap
        map.put(type, variables)
        additionalVariables.mapValue.put(interfaceType, map)
     }
     
     /**
     * Adds a variable to the simulation interface.
     */
     public def void putAdditionalVariable(String interfaceType, String type, String variable) {
        val variables = newArrayList(variable)
        putAdditionalVariables(interfaceType, type, variables)
     }
}