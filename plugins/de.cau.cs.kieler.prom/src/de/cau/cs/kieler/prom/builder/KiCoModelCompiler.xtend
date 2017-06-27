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
package de.cau.cs.kieler.prom.builder

import com.google.common.base.Strings
import com.google.common.io.Files
import de.cau.cs.kieler.kico.CompilationResult
import de.cau.cs.kieler.kico.KielerCompiler
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.prom.common.ModelImporter
import de.cau.cs.kieler.prom.common.PromPlugin
import de.cau.cs.kieler.prom.launchconfig.WrapperCodeGenerator
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

/**
 * @author aas
 *
 */
class KiCoModelCompiler extends ModelCompiler {
    public var String outputTemplate = ""
    public var String compileChain = ""
    
    private var ModelCompilationResult result
    
    override getName() {
        return "KiCo"
    }
    
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
    override compile(IFile file, EObject model) {
        // Prepare result
        if(result == null) {
            result = new ModelCompilationResult()
        }
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
                // Flush compilation result to target
                val targetResource = KiCoBuilder.computeTargetResource(file.projectRelativePath.toOSString,
                                                                       outputFolder,
                                                                       fileExtension,
                                                                       file.project)
                val targetFile = targetResource as IFile
                saveCompilationResult(file, model, kicoResult, targetFile)
                
                // Add generated file to result
                result.addCreatedFile(targetFile)
                
                // Create simulation code
                if(simulationGenerator != null) {
                    // TODO: use information of variables that has been created as part of compilation
                    // (e.g. guards, and internal variables)
                    simulationGenerator.monitor = monitor
                    result.simulationGenerationResult = simulationGenerator.generate(file, model)
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
        // TODO: ESTERELSIMULATIONVISUALIZATION throws an exception when used (21.07.2015), so we explicitly disable it.
        // TODO: SIMULATIONVISUALIZATION throws an exception when used (28.10.2015), so we explicitly disable it.
        // TODO: ABORTWTO often makes trouble and is not deterministicly choosen, so we explicitly disable it.
        var String chain = "!T_ESTERELSIMULATIONVISUALIZATION, !T_SIMULATIONVISUALIZATION, !T_ABORTWTO"
        if(KiCoBuilder.isCompileChain(compileChain)) {
            chain += ", " + compileChain
        } else {
            // If it is not a complete compile chain, it is assumed to be a transformation, which has to be prefixed with T_
            chain += ", T_"+ compileChain
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
            val resolvedTargetTemplate = PromPlugin.performStringSubstitution(outputTemplate, file.project)
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
        PromPlugin.createResource(targetFile.parent, null)
        
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
}