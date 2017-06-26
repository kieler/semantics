/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.prom.builder

import com.google.common.io.Files
import de.cau.cs.kieler.prom.common.PromPlugin
import de.cau.cs.kieler.prom.common.WrapperCodeAnnotationData
import de.cau.cs.kieler.prom.launchconfig.WrapperCodeGenerator
import java.util.List
import java.util.Map
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IFolder
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.IResource
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtext.util.StringInputStream

/**
 * @author aas
 *
 */
class SimulationGenerator {
    
    var IFile template
    var IProject project
    
    @Accessors(PUBLIC_SETTER)
    var String snippetDirectory
    
    @Accessors(PUBLIC_SETTER)
    var String fileExtension
    
    @Accessors(PUBLIC_SETTER)
    var IProgressMonitor monitor
    
    new(IFile template, IProject project) {
        this.template = template
        this.project = project
        this.snippetDirectory = snippetDirectory
    }
    
    /**
     * Generate the code for simulation of a model file
     * 
     */
    public def SimulationGenerationResult generate(IFile file, EObject model) {
        //TODO: Hardcoded stuff
        val fileNameWithoutExtension = Files.getNameWithoutExtension(file.name)
        val simTargetDirectory = computeTargetPath("sim/code") as IFolder
        var simTarget = simTargetDirectory.getFile("Sim_" + fileNameWithoutExtension + fileExtension)
        
        // Get simulation interface from model
        monitor.subTask("Fetching variables in model:" + file.name)
        val datas = newArrayList 
        WrapperCodeGenerator.getSimulationInterfaceData(model, datas)
        
        // Create simulation code
        val compiledModelFile = computeTargetPath(file.projectRelativePath.toOSString)
        monitor.subTask("Processing simulation template for:" + file.name)
        val result = generate(simTarget, datas,
            #{"compiled_model_loc" -> compiledModelFile.location.toOSString} )
            
        return result
    }
    
    public def SimulationGenerationResult generate(IFile target, List<WrapperCodeAnnotationData> datas, Map<String, String> additionalMappings) {
        val result = new SimulationGenerationResult()
        // Remove old target
        KiCoBuilder.deleteMarkers(target)
        if(target.exists())
            target.delete(true, null)
        
        // Create code
        val modelName = datas.get(0).modelName
        val generator = new WrapperCodeGenerator(project, snippetDirectory)
        val mappings = newHashMap 
        mappings.putAll( #{WrapperCodeGenerator.FILE_NAME_VARIABLE -> target.name,
                           WrapperCodeGenerator.MODEL_NAME_VARIABLE -> modelName,
                           WrapperCodeGenerator.MODEL_NAMES_VARIABLE -> #[modelName] } )
        mappings.putAll(additionalMappings)
        
        var String simulationCode = ""
        try {
            simulationCode = generator.generateWrapperCode(template.projectRelativePath.toOSString, datas, mappings)
            // Save result
            result.addCreatedFile(target)
        } catch (Exception e) {
            val problem = BuildProblem.createError(target, e)
            result.addProblem(problem)
        }
        
        PromPlugin.createResource(target, new StringInputStream(simulationCode))
        return result
    }
    
    private def IResource computeTargetPath(String path) {
        return KiCoBuilder.computeTargetResource(path, PromPlugin.BUILD_DIRECTORY, fileExtension, project)
    }
}