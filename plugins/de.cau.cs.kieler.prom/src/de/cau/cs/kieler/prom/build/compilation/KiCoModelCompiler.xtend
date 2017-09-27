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
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kicool.System
import de.cau.cs.kieler.kicool.compilation.CodeContainer
import de.cau.cs.kieler.kicool.compilation.CompilationContext
import de.cau.cs.kieler.kicool.compilation.Compile
import de.cau.cs.kieler.kicool.compilation.Processor
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
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.iterators.StateIterator
import de.cau.cs.kieler.sccharts.processors.transformators.TakenTransitionSignaling
import java.io.IOException
import java.io.PrintWriter
import java.io.StringWriter
import java.util.Collections
import java.util.List
import org.eclipse.core.resources.IFile
import org.eclipse.core.runtime.Assert
import org.eclipse.core.runtime.IPath
import org.eclipse.core.runtime.Path
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.ResourceSet
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
     * This can either be an id of a system, or a file path to a kico file. 
     */
    public val compilationSystem = new ConfigurableAttribute("compilationSystem", "de.cau.cs.kieler.sccharts.netlist.simple")
    
    /**
     * The model that is compiled
     */
    private var EObject model
    
    /**
     * {@inheritDoc}
     */
    override doCompile(IFile file, EObject model) {
        Assert.isNotNull(file)
        Assert.isNotNull(model)
        this.model = model
        
        // Prepare result
        val result = new ModelCompilationResult()
        // Compile with kico
        val context = compileWithKiCo(model)
        
        // Check all intermediate results for errors and warnings
        var boolean noIssues = true
        var Processor<?,?> lastResult
        var takenTransitionArraySize = 0
        for (iResult : context.processorInstancesSequence) {
            // For diagram highlighting:
            // In case the taken transition signaling was used,
            // the created array has to be added to the simulation interface as additional variable
            if(takenTransitionArraySize <= 0) {
                takenTransitionArraySize = iResult.environment.getProperty(TakenTransitionSignaling.ARRAY_SIZE)
            }
            
            lastResult = iResult
            val errors = iResult.environment.errors
            val warnings = iResult.environment.warnings
            // Add build problems to result
            if(!errors.get(Environment.REPORT_ROOT).isNullOrEmpty) {
                noIssues = false
                var thrownError = errors.messages
                if(thrownError.contains("The SCG is NOT asc-schedulable!")) {
                    thrownError = "The SCG is NOT asc-schedulable!"
                } 
                val errorMessage = "Error in '"+iResult.id+"':\n"+thrownError
                result.addProblem(BuildProblem.createError(file, errorMessage))
            }
            if(!warnings.get(Environment.REPORT_ROOT).isNullOrEmpty) {
                noIssues = false
                // Add build problem to result
                val warningMessage = "Warning in '"+iResult.id+"':"+warnings.messages
                result.addProblem(BuildProblem.createWarning(file, warningMessage))
            }
        }
        // Get final result of compilation
        val resultModel = lastResult.environment.getProperty(Environment.MODEL)
        
        // Save result if no errors and warnings
        if(noIssues) {
            // Flush compilation result to target
            val targetFile = getTargetFile
            saveCompilationResult(resultModel, targetFile)
            
            // Add generated file to result
            result.addCreatedFile(targetFile)
            
            // Create simulation code
            if(simulationProcessor != null) {
                // Create additional variables for the simulation code generation
                val additionalVariables = newHashMap
                // For diagram highlighting:
                // Add the taken transition array to the simulation interface
                if(takenTransitionArraySize > 0) {
                    additionalVariables.put("other", "_taken_transitions["+takenTransitionArraySize+"]")
                }
                // Get all variables that make up the current state of the model
                // to add them to the simulation data pool.
                // These are the variables in the model, as well as the PRE_XXX variables
                val interfaceTypes = (simulationProcessor.interfaceTypes.value as List)
                if(!interfaceTypes.isNullOrEmpty && interfaceTypes.contains("other")) {
                    val registerVariables = context.getRegisterVariables
                    additionalVariables.put("other", registerVariables.map[it.name])
                }
                simulationProcessor.additionalVariables.value = additionalVariables
                
                // Compute output file of simulation generation
                var IPath simulationTargetFolder = new Path("")
                if(!outputFolder.stringValue.isNullOrEmpty) {
                    simulationTargetFolder = new Path(outputFolder.stringValue).append("sim").append("code")
                }
                val fileNameWithoutExtension = Files.getNameWithoutExtension(file.name)
                val simulationFileName = "Sim_" + fileNameWithoutExtension + targetFileExtension
                val simulationTarget = simulationTargetFolder.append(simulationFileName)
                // Set model specific variables of simulation template processor
                simulationProcessor.target.value = simulationTarget.toOSString
                simulationProcessor.modelPath.value = file.projectRelativePath.toOSString
                simulationProcessor.compiledModelPath.value = targetFile.projectRelativePath.toOSString
                simulationProcessor.monitor = monitor
                simulationProcessor.project = file.project
                simulationProcessor.model = model
                // Run processor
                result.simulationGenerationResult = simulationProcessor.process
            }    
        }
        
        return result
    }
    
    /**
     * {@inheritDoc}
     */
    override updateDependencies(DependencyGraph dependencies, List<IFile> files, ResourceSet resourceSet) {
        for(f : files) {
            if(f.fileExtension.equalsIgnoreCase("sct")) {
                val node = dependencies.getOrCreate(f)
                // Remove old dependencies
                node.removeAllDependencies()
                // Add new dependencies
                val model = ModelImporter.getEObject(f, resourceSet)
                if(model instanceof State && model != null) {
                    val state = model as State
                    val iter = StateIterator.sccAllStates(state)
                    while(iter.hasNext) {
                        val s = iter.next
                        if(s.reference != null && s.reference.scope != null) {
                            val refResource = s.reference.scope.eResource
                            val refFile = ModelImporter.toPlatformResource(refResource)
                            val refNode = dependencies.getOrCreate(refFile)
                            node.addDependency(refNode)
                        }
                    }
                }
            }
        }
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
     * Returns the variables that have been generated as part of the compilation
     * and save the current state of the model.
     * 
     * @param context The compilation context
     */
    private def List<ValuedObject> getRegisterVariables(CompilationContext context) {
        // TODO: Search SCG for pre(GUARD) calls and add them to the returned list
        return newArrayList
    }
    
    /**
     * Compiles the model.
     * 
     * @param model The model
     */
    private def CompilationContext compileWithKiCo(EObject model) {
        // Get the compilation system
        val compilationSystemFile = project?.getFile(compilationSystem.stringValue)
        var System system
        if(compilationSystemFile != null && compilationSystemFile.exists) {
            // Load from file
            val systemModel = ModelImporter.load(compilationSystemFile)
            if(systemModel != null && systemModel instanceof System) {
                system = systemModel as System
            } else {
                throw new Exception("Compilation system could not be loaded from resource '"+compilationSystemFile+"'")
            }
        } else {
            // Load from system id
            val compilationSystemID = compilationSystem.stringValue
            system = KiCoolRegistration.getSystemById(compilationSystemID)
        }
        // Create the compilation context
        val context = Compile.createCompilationContext(system, model)
        context.startEnvironment.setProperty(Environment.INPLACE, true)
        // Add observer to update the progress monitor
        if(monitor != null) {
            context.addObserver(new CompilationProgressObserver(monitor, compiledFile))
        }
        // Compile the model
        context.compile

        return context
    }
    
    /**
     * Saves the result to the fully qualified target location.
     * If the result string is not empty, this will be saved possibly using the target template for the output.
     * Otherwise the result's EObject will be serialized to the target location.
     * 
     * @param result The KiCo compilation result to be saved
     * @param targetPath File path where the result should be saved
     */
    private def void saveCompilationResult(Object result, IFile targetFile) {
        if(result == null) {
            return;
        } else if(result instanceof CodeContainer) {
            val String resultCode = result?.get(0)
            saveCode(resultCode, targetFile)
        } else if(result instanceof EObject) {
            // Serialize EObject
            saveEObject(result, targetFile)
        } else {
            throw new Exception("Cannot save compilation result:"+result)
        }
    }

    /**
     * Saves the code to the given target file possibly using the output file template.
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
                modelName = Files.getNameWithoutExtension(compiledFile.name)
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