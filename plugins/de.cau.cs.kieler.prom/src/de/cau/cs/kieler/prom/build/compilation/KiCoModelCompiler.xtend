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
package de.cau.cs.kieler.prom.build.compilation

import com.google.common.io.Files
import de.cau.cs.kieler.kicool.System
import de.cau.cs.kieler.kicool.compilation.CodeContainer
import de.cau.cs.kieler.kicool.compilation.CompilationContext
import de.cau.cs.kieler.kicool.compilation.CompilationSystem
import de.cau.cs.kieler.kicool.compilation.Compile
import de.cau.cs.kieler.kicool.environments.Environment
import de.cau.cs.kieler.kicool.environments.MessageObjectReferences
import de.cau.cs.kieler.kicool.registration.KiCoolRegistration
import de.cau.cs.kieler.prom.ModelImporter
import de.cau.cs.kieler.prom.PromPlugin
import de.cau.cs.kieler.prom.build.BuildProblem
import de.cau.cs.kieler.prom.build.DependencyGraph
import de.cau.cs.kieler.prom.configurable.ConfigurableAttribute
import de.cau.cs.kieler.prom.templates.TemplateContext
import de.cau.cs.kieler.prom.templates.TemplateManager
import de.cau.cs.kieler.scg.SCGraphs
import java.io.IOException
import java.io.PrintWriter
import java.io.StringWriter
import java.util.Collections
import java.util.List
import java.util.Map
import org.eclipse.core.resources.IFile
import org.eclipse.core.runtime.IPath
import org.eclipse.core.runtime.Path
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtext.resource.XtextResourceSet
import org.eclipse.xtext.util.StringInputStream

/**
 * Model compiler that uses KiCo.
 * 
 * @author aas
 *
 */
class KiCoModelCompiler extends ModelCompiler {
    
    /**
     * Optional template file in that is used to surround the generated output.
     */
    public val outputTemplate = new ConfigurableAttribute("outputTemplate", "", #[String])
    
    /**
     * The KiCo compilation system to compile the model.
     * This can either be an id of a system or processor, or a file path to a kico file.
     * Further it is possible to provide a list of these, which are compiled one after another.
     * For more complex setups it is also possible to provide a map,
     * where the key is the file extension for models and the value is the compile chain to apply.
     */
    public val compileChain = new ConfigurableAttribute("compileChain", "de.cau.cs.kieler.sccharts.netlist.simple", #[String, List, Map])
    
    /**
     * Optional frontend compile chain that is added before any other compile chain.
     * May contain the same values as compileChain.
     */
    public val frontend = new ConfigurableAttribute("frontend", null, #[String, List, Map])
    
    /**
     * Determines whether register variables should be communicated to the simulation.
     */
    public val communicateRegisterVariables = new ConfigurableAttribute("communicateRegisterVariables", true, #[Boolean])
    
    /**
     * The file in which the compilation result will be saved
     */
    @Accessors
    private var IFile targetFile
    
    /**
     * The result of the compilation
     */
    @Accessors
    private var ModelCompilationResult compilationResult
    
    /** 
     * The context that is used to compile models via kico.
     */
    @Accessors(PUBLIC_GETTER)
    private CompilationContext context
    
    /**
     * The result model of the compilation.
     */
    @Accessors(PUBLIC_GETTER)
    private Object resultModel
    
    /**
     * {@inheritDoc}
     */
    override doCompile(IFile file, EObject model) {
        // Prepare result
        compilationResult = new ModelCompilationResult
        
        // Compile with kico
        compileWithKiCo
        
        if(isCanceled) {
            return compilationResult
        }
        
        // Save result if no errors and warnings
        if(compilationResult.problems.isNullOrEmpty) {
            // Flush compilation result to target
            targetFile = computeTargetFile
            saveCompilationResult(resultModel)
            
            // Create simulation code
            if(simulationProcessor != null) {
                // Compute output file of simulation generation
                var IPath simulationTargetFolder = new Path("")
                if(!outputFolder.stringValue.isNullOrEmpty) {
                    simulationTargetFolder = new Path(outputFolder.stringValue).append("sim").append("code")
                }
                val fileNameWithoutExtension = Files.getNameWithoutExtension(file.name)
                val simulationFileName = "Sim_" + fileNameWithoutExtension + "." + targetFileExtension
                val simulationTarget = simulationTargetFolder.append(simulationFileName)
                // Set model specific variables of simulation template processor
                simulationProcessor.target.value = simulationTarget.toOSString
                simulationProcessor.modelPath.value = file.projectRelativePath.toOSString
                simulationProcessor.compiledModelPath.value = targetFile.projectRelativePath.toOSString
                simulationProcessor.monitor = monitor
                simulationProcessor.project = file.project
                simulationProcessor.model = model
                // Run processor
                compilationResult.simulationGenerationResult = simulationProcessor.process
            }    
        }
        
        return compilationResult
    }
    
    /**
     * {@inheritDoc}
     */
    override updateDependencies(DependencyGraph dependencies, List<IFile> files, ResourceSet resourceSet) {
        
    }
    
    /**
     * Fetches the messages from the given object.
     * 
     * @param messageObjectReferences The message object references
     */
    private def String getMessages(MessageObjectReferences messageObjectReferences) {
        return messageObjectReferences.getMessages(false)
    }
    
    /**
     * Fetches the messages from the given object.
     * 
     * @param messageObjectReferences The message object references
     * @param includeStackTrace Determines whether the stack trace of exceptions should be included, or only their message
     */
    private def String getMessages(MessageObjectReferences messageObjectReferences, boolean includeStackTrace) {
        return messageObjectReferences.get(Environment.REPORT_ROOT).map[messageObject |
             if (messageObject.exception != null) {
                 if(includeStackTrace) {
                     ((new StringWriter) => [messageObject.exception.printStackTrace(new PrintWriter(it))]).toString()
                 } else {
                    messageObject.exception.toString    
                 }
             } else {
                messageObject.message
             }
        ].join("\n- ")
    }
    
    /**
     * Compiles the model.
     * 
     * @param model The model
     */
    private def void compileWithKiCo() {
        // Notify listeners
        for(l : listeners)
            l.beforeCompilation(this)
        // Prepare systems from attribute
        var Iterable<String> systemPathsOrIds = getCompileChain(compileChain.value)
        // Add frontend to compile chain
        if(frontend.isDefined) {
            val frontEndSystemPathsOrIds = getCompileChain(frontend.value)
            systemPathsOrIds = (frontEndSystemPathsOrIds + systemPathsOrIds)
        }
        
        // Compile the model using all given compilation systems.
        resultModel = model
        for(systemPathOrId : systemPathsOrIds) {
            if(isCanceled) {
                return
            }
            // Get the compilation system
            val system = getCompilationSystem(systemPathOrId)
            // Create the compilation context
            context = Compile.createCompilationContext(system, resultModel)
            context.startEnvironment.setProperty(Environment.INPLACE, true)
            // Add observer to update the progress monitor
            if(monitor != null) {
                context.addObserver(new CompilationProgressObserver(monitor, file))
            }
            // Compile the model
            compileContext
        }
        // Notify listeners
        for(l : listeners)
            l.afterCompilation(this)
    }
    
    private def List<String> getCompileChain(Object value) {
        if(value instanceof String) {
            if(value == "") {
                return #[]
            } else {
                return #[value]    
            }
        } else if(value instanceof List) {
            return value.map[it.toString]
        } else if(value instanceof Map) {
            // When providing a map of compile chains,
            // the key is the file extension of models and the value the corresponding compile chain. 
            val mappedValue = compileChain.mapValue.get(file.fileExtension)
            return getCompileChain(mappedValue)
        }
        throw new IllegalArgumentException("Could not determine compile chain from given input: "+value)
    }
    
    /**
     * Compiles the context for kico compilation.
     * 
     * @return The result of the compilation 
     */
    private def void compileContext() {
        // Notify listeners
        for(l : listeners)
            l.beforeIntermediateCompilation(this)
        // Compile and check results
        context.compile
        resultModel = checkResults(context)
        // Notify listeners
        for(l : listeners)
            l.afterIntermediateCompilation(this)
    }
    
    /**
     * Checks the result of the compilation context (after it has been compiled) and adds problems to the result if any.
     * 
     * @param context The context that has been compiled
     * @return the last processor that holds the resulting model
     */
    private def Object checkResults(CompilationContext context) {
        // Check all intermediate results for errors and warnings
        var Object resultModel
        var SCGraphs lastSCGraphs
        for (iResult : context.processorInstancesSequence) {
            // Check errors and warning
            val errors = iResult.environment.errors
            val warnings = iResult.environment.warnings
            // Add build problems to result
            if(!errors.get(Environment.REPORT_ROOT).isNullOrEmpty) {
                var thrownError = errors.messages
                if(thrownError.contains("The SCG is NOT asc-schedulable!")) {
                    thrownError = "The SCG is NOT asc-schedulable!"
                } 
                val errorMessage = "Error in '"+iResult.id+"':\n"+thrownError
                compilationResult.addProblem(BuildProblem.createError(file, errorMessage))
            }
            if(!warnings.get(Environment.REPORT_ROOT).isNullOrEmpty) {
                // Add build problem to result
                val warningMessage = "Warning in '"+iResult.id+"':"+warnings.messages
                compilationResult.addProblem(BuildProblem.createWarning(file, warningMessage))
            }
            
            resultModel = iResult.environment.getProperty(Environment.MODEL)
            if(resultModel instanceof SCGraphs) {
                lastSCGraphs = resultModel
            }
        }
        return resultModel
    }
    
    /**
     * Loads a compilation system from an id or file path.
     * 
     * @param pathOrId The id of the system or a path to a file that contains a compilation system
     * @return the loaded system
     */
    private def System getCompilationSystem(String pathOrId) {
        val trimmedPathOrId = pathOrId.replaceAll("\\s", "")
        var System system
        val file = project?.getFile(pathOrId)
        if(file != null && file.exists) {
            // Load from file
            val systemModel = ModelImporter.load(file)
            if(systemModel != null && systemModel instanceof System) {
                system = systemModel as System
            } else {
                throw new Exception("Compilation system could not be loaded from resource '"+file+"'")
            }
        } else {
            // Load from system id
            try {
                system = KiCoolRegistration.getSystemById(trimmedPathOrId)    
            } catch (Exception e) {
                val processor = KiCoolRegistration.getProcessorClass(trimmedPathOrId)
                if(processor != null) {
                    // The system with this id does not exist, so it is assumed to be the id of a processor
                    system = CompilationSystem.createCompilationSystem(trimmedPathOrId+"."+system, #[trimmedPathOrId])    
                } else { 
                    throw new Exception("Neither a compilation system nor a processor could be created for the path or id '"+trimmedPathOrId+"'")
                }
            }
        }
        return system
    }
    
    /**
     * Saves the result to the fully qualified target location.
     * If the result string is not empty, this will be saved possibly using the target template for the output.
     * Otherwise the result's EObject will be serialized to the target location.
     * 
     * @param result The KiCo compilation result to be saved
     * @param targetPath File path where the result should be saved
     */
    private def void saveCompilationResult(Object result) {
        if(result == null) {
            return;
        } else if(result instanceof CodeContainer) {
            for (fileName : result.files.keySet) {
                val String resultCode = result.get(fileName)
                val codeTargetFile = targetFile.parent.getFile(new Path(fileName))
                saveCode(resultCode, codeTargetFile)
                compilationResult.addCreatedFile(codeTargetFile)
                // Update target file with new file name from compiler output
                if(codeTargetFile.fileExtension == targetFileExtension) {
                    targetFile = codeTargetFile
                }
            }
        } else if(result instanceof EObject) {
            // Serialize EObject
            saveEObject(result, targetFile)
            compilationResult.addCreatedFile(targetFile)
        } else {
            throw new Exception("Cannot save compilation result:"+result)
        }
    }

    /**
     * Saves the code to the given target file possibly using the output file template.
     * 
     * @param code The code
     * @param targetFile The target file
     */
    private def void saveCode(String code, IFile targetFile) {
        // Save generated code to file, possibly using a target template
        val resolvedTargetTemplate = PromPlugin.performStringSubstitution(outputTemplate.stringValue, project)
        if (resolvedTargetTemplate.isNullOrEmpty) {
            // Just save the file
            val inputStream = new StringInputStream(code)
            PromPlugin.createResource(targetFile, inputStream, true)
        } else {
            // Inject compilation result into target template
            var modelName = TemplateManager.getModelName(model)
            if(modelName == null) {
                modelName = Files.getNameWithoutExtension(file.name)
            }
            val templateFile = project.getFile(resolvedTargetTemplate)
            val context = new TemplateContext(templateFile)
            context.additionalMappings = #{TemplateManager.KICO_GENERATED_CODE_VARIABLE -> code,
                                           TemplateManager.MODEL_NAME_VARIABLE -> modelName}
            val wrapperCode = TemplateManager.process(context)
            // Save output
            val inputStream = new StringInputStream(wrapperCode)
            PromPlugin.createResource(targetFile, inputStream, true)
        }
    }

    /**
     * Serializes and saves an EObject in the file system.
     * 
     * @param eobject the EObject
     * @param targetLocation the fully qualified path where it should be saved
     */
    private def void saveEObject(EObject eobject, IFile targetFile) {
        // Create directories
        PromPlugin.createResource(targetFile.parent)
        
        // Remove old resource
        if(targetFile.exists) {
            targetFile.delete(true, null)
        }
        
        // Create new resource
        val resSet = new XtextResourceSet();
        val targetLocation = targetFile.location.toOSString
        val resource = resSet.createResource(URI.createFileURI(targetLocation));
        // Get the first model element and cast it to the right type, in my
        // example everything is hierarchical included in this first node
        resource.getContents().add(eobject);
    
        // now save the content.
        try {
          resource.save(Collections.EMPTY_MAP);
        } catch (IOException e) {
          e.printStackTrace();
        }
    }
    
    /**
     * {@inheritDoc}
     */
    override toString() {
        return "KiCo model compiler"
    }
}