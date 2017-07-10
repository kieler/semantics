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

import com.google.common.base.Strings
import com.google.common.io.Files
import de.cau.cs.kieler.kico.CompilationResult
import de.cau.cs.kieler.kico.KielerCompiler
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.prom.ModelImporter
import de.cau.cs.kieler.prom.PromPlugin
import de.cau.cs.kieler.prom.launch.WrapperCodeGenerator
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.iterators.StateIterator
import java.io.IOException
import java.util.Collections
import java.util.List
import org.eclipse.core.resources.IFile
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.resource.XtextResourceSet
import org.eclipse.xtext.util.StringInputStream
import org.eclipse.core.runtime.Path
import org.eclipse.core.runtime.IPath

/**
 * @author aas
 *
 */
class KiCoModelCompiler extends ModelCompiler {
    public val outputTemplate = new ConfigurableAttribute("outputTemplate", "")
    public val compileChain = new ConfigurableAttribute("compileChain", "")
    public val fileExtension = new ConfigurableAttribute("fileExtension", ".c")
    
    private var ModelCompilationResult result
    
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
                        if(s.referencedScope != null) {
                            val refResource = s.referencedScope.eResource
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
     * Compile a model file via KiCo. 
     * 
     * @param file the file of the model to be built
     * @param model model to be built
     */
    override doCompile(IFile file, EObject model) {
        // Prepare result
        result = new ModelCompilationResult()
        
        // Compile model
        if (model != null) {
            // Skip compilation of models
            // TODO: Remove this if the black- and whitelist compilation configuration works
            var ignore = false
            if(model instanceof State) {
                for(ann : model.annotations) {
                    if(ann.name == "SkipCompilation") {
                        ignore = true
                    }
                }
            }
            // Don't compiles files that should be ignored
            if(ignore) {
                return result
            }
            
            // Compile
            val kicoResult = compileWithKiCo(model)
            
            // Save result if no errors and warnings
            if (kicoResult.allErrors.isNullOrEmpty() && kicoResult.allWarnings.isNullOrEmpty()) {
                // If fileExtension starts with a letter, add a dot as prefix
                var String fileExt = fileExtension.stringValue
                if(fileExt.matches("^\\w.*")) {
                    fileExt = "."+fileExt
                }
                // Flush compilation result to target
                val targetResource = KiCoBuilder.computeTargetResource(file.projectRelativePath.toOSString,
                                                                       outputFolder,
                                                                       fileExt,
                                                                       file.project)
                val targetFile = targetResource as IFile
                saveCompilationResult(file, model, kicoResult, targetFile)
                
                // Add generated file to result
                result.addCreatedFile(targetFile)
                
                // Create simulation code
                if(simulationProcessor != null) {
                    // TODO: use information of variables that has been created as part of compilation
                    // (e.g. guards, and internal variables)
                    
                    // Compute output file of simulation generation
                    var IPath simulationTargetFolder = new Path("")
                    if(!outputFolder.isNullOrEmpty) {
                        simulationTargetFolder = new Path(outputFolder).append("sim").append("code")
                    }
                    val fileNameWithoutExtension = Files.getNameWithoutExtension(file.name)
                    val simulationTarget = simulationTargetFolder.append(fileNameWithoutExtension + fileExt)
                    // Set model specific variables of simulation template processor
                    simulationProcessor.target.value = simulationTarget.toOSString
                    simulationProcessor.modelPath.value = file.projectRelativePath.toOSString
                    simulationProcessor.compiledModelPath.value = targetFile.projectRelativePath.toOSString
                    simulationProcessor.monitor = monitor
                    simulationProcessor.project = file.project
                    // Run processor
                    result.simulationGenerationResult = simulationProcessor.process
                } 
            } else {
                // Add build problem to result
                if(kicoResult.allWarnings != null && kicoResult.allWarnings.toLowerCase.contains("not asc")) {
                    result.addProblem(BuildProblem.createWarning(file, "Model is not ASC-Schedulable"))
                } else {
                    val errorMessage = Strings.nullToEmpty(kicoResult.allErrors) + "\n" +
                                       Strings.nullToEmpty(kicoResult.allWarnings)
                    val exception = new Exception(errorMessage)
                    result.addProblem(BuildProblem.createError(file, "Compilation failed. Please, check the Error Log", exception))
                }
            }
        }
        
        return result
    }
    
    private def CompilationResult compileWithKiCo(EObject model) {
        // Get compiler context with settings for KiCo
        // TODO: There are several transformations that do not work correctly or throw exceptions, so we explicitly disable them.
        // TODO: ESTERELSIMULATIONVISUALIZATION throws an exception when used (21.07.2015)
        // TODO: SIMULATIONVISUALIZATION throws an exception when used (28.10.2015)
        // TODO: ABORTWTO often makes trouble and is not deterministicly choosen
        // TODO: scg.guards.ft and scg.scheduling.dc are experimental transformations and have issues (KISEMA-1188)
        var String chain = "!T_ESTERELSIMULATIONVISUALIZATION, !T_SIMULATIONVISUALIZATION, !T_ABORTWTO, !T_scg.guards.ft, !T_scg.scheduling.dc"
        if(KiCoBuilder.isCompileChain(compileChain.stringValue)) {
            chain += ", " + compileChain.stringValue
        } else {
            // If it is not a complete compile chain, it is assumed to be a transformation, which has to be prefixed with T_
            chain += ", T_"+ compileChain.stringValue
        }
        val context = new KielerCompilerContext(chain, model)
        context.inplace = false
        context.advancedSelect = true
        context.progressMonitor = monitor
        
        var CompilationResult result = KielerCompiler.compile(context)
        return result
    }
    
    /**
     * Saves the result to the fully qualified target location.
     * If the result string is not empty, this will be saved possibly using the target template for the output.
     * Otherwise the result's EObject will be serialized to the target location.
     * 
     * @param result The KiCo compilation result to be saved
     * @param targetPath File path where the result should be saved
     */
    private def void saveCompilationResult(IFile file, EObject model, CompilationResult result, IFile targetFile) {
        // Serialize Eobject
        if(result.string.isNullOrEmpty) {
            saveEObject(result.getEObject(), targetFile)
        } else {
            // Save generated code to file, possibly using a target template
            val resolvedTargetTemplate = PromPlugin.performStringSubstitution(outputTemplate.stringValue, file.project)
            if (resolvedTargetTemplate.isNullOrEmpty) {
                val inputStream = new StringInputStream(result.string)
                PromPlugin.createResource(targetFile, inputStream, true)
            } else {
                // Inject compilation result into target template
                val modelName = Files.getNameWithoutExtension(file.name)
                val annotationDatas = newArrayList()
                
                WrapperCodeGenerator.getWrapperCodeAnnotationData(model, annotationDatas)
                val generator = new WrapperCodeGenerator(file.project, null)
                val wrapperCode = generator.generateWrapperCode(resolvedTargetTemplate, annotationDatas, 
                    #{WrapperCodeGenerator.KICO_GENERATED_CODE_VARIABLE -> result.string,
                      WrapperCodeGenerator.MODEL_NAME_VARIABLE -> modelName,
                      WrapperCodeGenerator.MODEL_NAMES_VARIABLE -> #[modelName]})
                // Save output
                val inputStream = new StringInputStream(wrapperCode)
                PromPlugin.createResource(targetFile.parent, inputStream, true)
            }
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
    
    override toString() {
        return "KiCo model compiler"
    }
}