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

import com.google.common.base.Charsets
import com.google.common.base.Strings
import com.google.common.io.Files
import de.cau.cs.kieler.kico.CompilationResult
import de.cau.cs.kieler.kico.KielerCompiler
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.kico.KielerCompilerException
import de.cau.cs.kieler.prom.common.EnvironmentData
import de.cau.cs.kieler.prom.common.KiCoLaunchData
import de.cau.cs.kieler.prom.common.ModelImporter
import de.cau.cs.kieler.prom.common.PromPlugin
import de.cau.cs.kieler.prom.launchconfig.WrapperCodeAnnotationData
import de.cau.cs.kieler.prom.launchconfig.WrapperCodeGenerator
import java.io.File
import java.io.IOException
import java.util.ArrayList
import java.util.Collections
import java.util.HashMap
import java.util.List
import java.util.Map
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.IResource
import org.eclipse.core.resources.IResourceDelta
import org.eclipse.core.resources.IResourceDeltaVisitor
import org.eclipse.core.resources.IncrementalProjectBuilder
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.Path
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.jdt.core.IClasspathEntry
import org.eclipse.jdt.core.IJavaProject
import org.eclipse.jdt.core.JavaCore

/**
 * @author aas
 * 
 */
class KiCoBuilder extends IncrementalProjectBuilder {
    public static val String BUILDER_ID = "de.cau.cs.kieler.prom.KiCoBuilder"; 
    
    private IProgressMonitor monitor

    private EnvironmentData env
    
    private val HashMap<String, List<WrapperCodeAnnotationData>> annotations = newHashMap()
    private boolean isInitialized
    
    protected override IProject[] build(int kind, Map args, IProgressMonitor monitor) {
        this.monitor = monitor
        
        if (kind == IncrementalProjectBuilder.FULL_BUILD) {
            fullBuild(monitor);
        } else {
            val delta = getDelta(project);
            if (delta == null) {
               fullBuild(monitor);
            } else {
               incrementalBuild(delta, monitor);
            }
        }
        return null;
    }   

    private def void fullBuild(IProgressMonitor monitor) {
        // Find all model files
        val modelFiles = findModelFilesInProject()
        build(modelFiles)
    }
    
    private def void incrementalBuild(IResourceDelta delta, IProgressMonitor monitor) {
        // Find changed files
        val ArrayList<IFile> changedFiles = newArrayList()
        try {
            delta.accept(new IResourceDeltaVisitor() {
                override visit(IResourceDelta delta) throws CoreException {
                    val res = delta.getResource()
                    if(res.type == IResource.FILE) {
                        switch(res.fileExtension.toLowerCase) {
                            case "sct",
                            case "strl",
                            case "ftl" : changedFiles.add(res as IFile)
                        }
                    } else if(res.type == IResource.FOLDER) {
                        // Ignore files that were copied to bin folder by eclipse 
                        if(res.name.toLowerCase == "bin") {
                            return false;
                        }
                    }
                    return true; // Visit children too
                }
            });
        } catch (CoreException e) {
            e.printStackTrace();
        }
        
        build(changedFiles)
    }

    private def void build(List<IFile> resources) {
        // Compile the found resources
        if(!resources.isNullOrEmpty) {
            // Init 
            initialize()
            
            // Compile via KiCo
            for(res : resources) {
                if(!monitor.isCanceled) {
                    switch(res.fileExtension.toLowerCase) {
                        case "sct",
                        case "strl" : compile(res)
                    }
                }
            }
            
            // Generate wrapper code
            if(!monitor.isCanceled) {
                generateWrapperCode()
            }
            
            // Refresh output in workspace
            refreshOutput(resources)
        }
    }

    private def void initialize() {
        val environmentName = project.getPersistentProperty(PromPlugin.ENVIRIONMENT_QUALIFIER);
        env = EnvironmentData.loadInstanceFromPreferenceStore(PromPlugin.^default.preferenceStore, environmentName)
        
        // Set variables (e.g. launched_project_loc, main_name, main_loc, ...)
        PromPlugin.setVariables(project.location.toOSString, launchData.mainFile, computeTargetPath(launchData.mainFile, true))
        
        // Create directory for output        
        createBuildDirectory();
        
        // At first build, search for wrapper code annotations in all model files.
        // These are updated later, if a model file changes.
        if(!isInitialized) {
            isInitialized = true
            val modelFiles = findModelFilesInProject()
            for(f : modelFiles) {
                getWrapperCodeAnnotations(f, false)
            }
        }
    }

    private def List<IFile> findModelFilesInProject() {
        // Search for models in project
        val membersWithoutBinDirectory = project.members.filter[it.name != "bin"]
        return PromPlugin.findFiles(membersWithoutBinDirectory, #["sct", "strl"])
    }
    
    private def KiCoLaunchData getLaunchData() {
        return env.launchData
    }
    
    private def void refreshOutput(IFile... resources) {
        // Refresh target directory
        if(!launchData.targetDirectory.isNullOrEmpty()) {
            project.getFolder(launchData.targetDirectory).refreshLocal(IResource.DEPTH_INFINITE, monitor)
        } else if(resources != null) {
            // Refresh files
            for(r : resources) {
                r.parent.refreshLocal(1, monitor)
            }
        }
    }
    
    private def void compile(IFile res) {
        // Update wrapper code annotations of this file
        getWrapperCodeAnnotations(res, true)
        
        // Load model from file
        val EObject model = ModelImporter.load(res.location.toOSString, true)
        
        if (model != null) {
            // Get compiler context with settings for KiCo
            // TODO: ESTERELSIMULATIONVISUALIZATION throws an exception when used (21.07.2015), so we explicitly disable it.
            // TODO: SIMULATIONVISUALIZATION throws an exception when used (28.10.2015), so we explicitly disable it.
            // TODO: ABORTWTO often makes trouble and is not deterministicly choosen, so we explicitly disable it.
            var String compileChain = "!T_ESTERELSIMULATIONVISUALIZATION, !T_SIMULATIONVISUALIZATION, !T_ABORTWTO"
            if(launchData.isCompileChain) {
                compileChain += ", " + launchData.targetLanguage
            } else {
                // If it is not a complete compile chain, it is assumed to be a transformation, which has to be prefixed with T_
                compileChain += ", T_"+ launchData.targetLanguage
            }
            val context = new KielerCompilerContext(compileChain, model)
            context.inplace = false
            context.advancedSelect = true

            // Compile
            val result = KielerCompiler.compile(context)

            // Flush compilation result to target
            if (result.allErrors.isNullOrEmpty() && result.allWarnings.isNullOrEmpty()) {
                val targetLocation = computeTargetPath(res.projectRelativePath.toOSString, false)
                saveCompilationResult(res, result, targetLocation)
            } else {
                val errorMessage = "Compilation of '" + res.name + "' failed:\n\n" +
                                   Strings.nullToEmpty(result.allErrors) + "\n" +
                                   Strings.nullToEmpty(result.allWarnings)

                // Throw exception
                throw new KielerCompilerException("", "", errorMessage) {
                    // Override toString to have a more readable error message and not twice the same.
                    override toString() {
                        return "KielerCompilerException"
                    }
                }
            }
        }
    }
    
    private def void generateWrapperCode() {
        if(!launchData.wrapperCodeTemplate.isNullOrEmpty) {
            val List<WrapperCodeAnnotationData> allAnnotationDatas = newArrayList()
            for(annotationDatas : annotations.values) {
                allAnnotationDatas.addAll(annotationDatas)
            }
        
            // resolve template path
            val resolvedWrapperCodeTemplate = PromPlugin.variableManager.performStringSubstitution(launchData.wrapperCodeTemplate)
            // Create wrapper code
            val generator = new WrapperCodeGenerator(project, launchData)
            val wrapperCode = generator.generateWrapperCode(resolvedWrapperCodeTemplate, allAnnotationDatas)
            // Save output
            val resolvedWrapperCodeTargetLocation = computeTargetPath(resolvedWrapperCodeTemplate, false)
            Files.write(wrapperCode, new File(resolvedWrapperCodeTargetLocation), Charsets.UTF_8)
    
            // Refresh output in workspace
            val template = project.findMember(resolvedWrapperCodeTemplate)
            refreshOutput(template as IFile)
        }
    }
    
    private def void getWrapperCodeAnnotations(IFile modelFile, boolean overwrite) {
        val location = modelFile.location.toOSString
        if(!annotations.containsKey(location) || overwrite) {
            val List<WrapperCodeAnnotationData> datas = newArrayList()
            WrapperCodeGenerator.getWrapperCodeAnnotationData(modelFile.location, datas)
            annotations.put(location, datas)
        }
    }
    
    /**
     * Creates the folder in which compilation results will be saved. 
     */
    private def void createBuildDirectory() {
        // If the target directory is empty
        // the output will be saved in the same folder as the input files,
        // so we don't need to create them.
        if(!launchData.targetDirectory.isNullOrEmpty()) {
            val folder = project.getFolder(launchData.targetDirectory)
            if(!folder.exists) {
                folder.create(false, true, null)
                // Add folder to java class path if it is a java project
                if (project.hasNature(JavaCore.NATURE_ID)) {
                    val javaProject = JavaCore.create(project);
                    PromPlugin.addFolderToJavaClasspath(javaProject, folder)
                }                
            }
        }
    }
    
    /**
     * Computes the fully qualified target path for a project relative file path.
     * The target path is in the build directory for kico compiled files and in this directory
     * has the same directory structure as the original file in the project.
     * The file extension of the target path is the extension for the current target language.
     * 
     * @param projectRelativePath Project relative path of a file in the project
     * @param projectRelative Flag to specify if the computed path should be projectRelative or not
     * @return the computed path
     */
    public def String computeTargetPath(String projectRelativePath, boolean projectRelative) {
        var String projectRelativeTargetPath;
        if(launchData.targetDirectory.isNullOrEmpty()) {
            // Compute path such that the target file will be in the same file as the source file.
            projectRelativeTargetPath = new Path(projectRelativePath).removeFileExtension.toOSString + launchData.targetLanguageFileExtension
        } else {
            // Compute path in the target directory
            // such that the directory structure of the original file is retained.
            var String projectRelativeRelevantPath = projectRelativePath
            // The source directories of a java project are not part of the relevant target path
            // because output files will be saved to a java source folder as well.
            // So we remove the first segment of the path if it is a java source directory.
            val firstSegment = new Path(projectRelativePath).segment(0);
            if(!firstSegment.isNullOrEmpty() && project.hasNature(JavaCore.NATURE_ID)) {
                val javaProject = JavaCore.create(project)
                if(isJavaSourceDirectory(javaProject, firstSegment)) {
                    projectRelativeRelevantPath = projectRelativePath.substring(firstSegment.length+1)
                }
            }
            
            // Remove extension
            val projectRelativeRelevantPathWithoutExtension = new Path(projectRelativeRelevantPath).removeFileExtension        
         
            // Compute target path
            projectRelativeTargetPath = launchData.targetDirectory + File.separator + projectRelativeRelevantPathWithoutExtension + launchData.targetLanguageFileExtension
        }
        
        // Return either absolute or relative target path
        if(projectRelative)
            return projectRelativeTargetPath
        else
            return project.location + File.separator + projectRelativeTargetPath    
    }

    private def boolean isJavaSourceDirectory(IJavaProject javaProject, String directory) {
        val classPathEntries = javaProject.getRawClasspath();
        for(entry : classPathEntries) {
            if(entry.entryKind == IClasspathEntry.CPE_SOURCE) {
                val sourceFolderName = new Path(entry.path.toOSString).lastSegment
                if(sourceFolderName.equals(directory)) {
                    return true
                }
            } 
        }
        return false
    }

    /**
     * Saves the result to the fully qualified target location.
     * If the result string is not empty, this will be saved possibly using the target template for the output.
     * Otherwise the result's EObject will be serialized to the target location.
     * 
     * @param result The KiCo compilation result to be saved
     * @param targetPath File path where the result should be saved
     */
    private def void saveCompilationResult(IResource res, CompilationResult result, String targetLocation) {
        // Create directory for the output if none yet.
        createDirectories(targetLocation)
        
        // Serialize Eobject
        if(result.string.isNullOrEmpty) {
            saveEObject(result.getEObject(), targetLocation)
        } else {
            // Save generated code to file, possibly using a target template
            val resolvedTargetTemplate = PromPlugin.variableManager.performStringSubstitution(launchData.targetTemplate)
            if (resolvedTargetTemplate.isNullOrEmpty()) {
                // Don't use template
                Files.write(result.string, new File(targetLocation), Charsets.UTF_8)
            } else {
                // Inject compilation result into target template
                val annotationDatas = newArrayList()
                WrapperCodeGenerator.getWrapperCodeAnnotationData(res.location, annotationDatas)
                val generator = new WrapperCodeGenerator(project, launchData)
                val wrapperCode = generator.generateWrapperCode(resolvedTargetTemplate,
                    #{WrapperCodeGenerator.KICO_GENERATED_CODE_VARIABLE -> result.string},
                    annotationDatas)
                // Save output
                Files.write(wrapperCode, new File(targetLocation), Charsets.UTF_8)
            }
        }
    }

    private def void saveEObject(EObject eobject, String targetLocation) {
        val resSet = new ResourceSetImpl();
        
        // create a resource
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
     * Creates the folder structure for a fully qualified file path.
     * 
     * @param path The path to a fully qualified file
     */
    private def void createDirectories(String filePath) {
        new File(filePath).parentFile.mkdirs()
    }
}
