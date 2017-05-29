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
import de.cau.cs.kieler.kexpressions.IntValue
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kico.CompilationResult
import de.cau.cs.kieler.kico.KielerCompiler
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.kico.KielerCompilerException
import de.cau.cs.kieler.prom.common.EnvironmentData
import de.cau.cs.kieler.prom.common.KiCoLaunchData
import de.cau.cs.kieler.prom.common.ModelImporter
import de.cau.cs.kieler.prom.common.PromPlugin
import de.cau.cs.kieler.prom.common.WrapperCodeAnnotationData
import de.cau.cs.kieler.prom.launchconfig.WrapperCodeGenerator
import de.cau.cs.kieler.sccharts.State
import java.io.File
import java.io.IOException
import java.util.ArrayList
import java.util.Collections
import java.util.HashMap
import java.util.List
import java.util.Map
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IMarker
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
import org.eclipse.xtext.resource.XtextResourceSet
import org.eclipse.xtext.util.StringInputStream

/**
 * @author aas
 * 
 */
class KiCoBuilder extends IncrementalProjectBuilder {
    
    /**
     * Id of the builder
     */
    public static val String BUILDER_ID = "de.cau.cs.kieler.prom.KiCoBuilder"; 
    
    public static val String KICO_ERROR_MARKER_TYPE = "kico.error"
    
    /**
     * The monitor of the current build process.
     */
    private IProgressMonitor monitor

    /**
     * The environment data used for the build.
     */
    private EnvironmentData env
    
    /**
     * All annotations in the project.
     * The key is the location of the file.
     */
    private val HashMap<String, List<WrapperCodeAnnotationData>> annotationsOfFile = newHashMap()
    /**
     * The names of all models in the project
     */
    private val HashMap<String, String> modelNames = newHashMap()
    
    /**
     * Flag to remember if the builder has been initialized before
     */
    private boolean isInitialized
   
    /**
     * Cache of all loaded models of a project.
     */
    private XtextResourceSet resourceSet;
    
    /**
     * {@inheritDoc}
     */
    protected override IProject[] build(int kind, Map args, IProgressMonitor monitor) {
        this.monitor = monitor
        
        if (kind == IncrementalProjectBuilder.FULL_BUILD || kind == IncrementalProjectBuilder.CLEAN_BUILD) {
            fullBuild();
        } else {
            val delta = getDelta(project);
            if (delta == null) {
               fullBuild();
            } else {
               incrementalBuild(delta);
            }
        }
        return null;
    }   

    /**
     * Perform a full build of all files.
     */
    private def void fullBuild() {
        // Re-initialize
        isInitialized = false
        // Find all model files
        val modelFiles = findModelFilesInProject()
        build(modelFiles)
    }
    
    private def void incrementalBuild(IResourceDelta delta) {
        // Find changed files
        monitor.subTask("Searching files")
        
        val ArrayList<IFile> changedFiles = newArrayList()
        try {
            delta.accept(new IResourceDeltaVisitor() {
                override visit(IResourceDelta delta) throws CoreException {
                    val res = delta.getResource()
                    if(res.type == IResource.FILE && res.fileExtension != null) {
                        // Only take care of files with the following extensions
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

        // Build the changed files
        monitor.subTask("Building files")
        build(changedFiles)
    }
    
    /**
     * Build a list of files
     * @param resources The list of files to build 
     */
    private def void build(List<IFile> resources) {
        // Compile the found resources
        if(!resources.isNullOrEmpty) {
            // Init 
            monitor.subTask("Initializing build")
            initialize()
            
            // Compile via KiCo
            for(res : resources) {
                // Remove markers from old build
                deleteMarkers(res)
                
                // Compile, generate simulation code, fetch wrapper code annotations
                if(!monitor.isCanceled) {
                    switch(res.fileExtension.toLowerCase) {
                        case "sct",
                        case "strl" : {
                            monitor.subTask("Loading resource "+res.name)
                            val EObject model = ModelImporter.load(res, resourceSet)
                            if(model == null) {
                                throw new Exception("Couldn't load model "+res.name)
                            }
                            // Compile using KiCo
                            if(!monitor.isCanceled) {
                                monitor.subTask("Compiling model "+res.name)
                                compile(res, model)
                            }
                            // Generate simulation code
                            if(!monitor.isCanceled) {
                                monitor.subTask("Creating simulation for "+res.name)
                                generateSimulationCode(res, model)
                            }
                            // Update wrapper code annotations of this file
                            if(!monitor.isCanceled) {
                                getWrapperCodeAnnotations(res, model)
                            }
                        }
                    }
                }
            }
            
            // Generate wrapper code
            if(!monitor.isCanceled) {
                monitor.subTask("Generating wrapper code.")
                generateWrapperCode()
            }
            
            // Refresh output in workspace
            monitor.subTask("Refreshing output directory")
            refreshOutput(resources)
        }
    }

    /**
     * Initialize this builder
     */
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
            annotationsOfFile.clear()
            modelNames.clear()
            resourceSet = new XtextResourceSet()
//            val modelFiles = findModelFilesInProject()
//            for(f : modelFiles) {
//                val model = ModelImporter.load(f, resourceSet)
//                getWrapperCodeAnnotations(f, model)
//            }
        }
    }

    /**
     * Returns a list with all model files in the project that can be built.
     * @return the list of model files that can be built
     */ 
    private def List<IFile> findModelFilesInProject() {
        // Search for models in project
        val membersWithoutBinDirectory = project.members.filter[it.name != "bin"]
        return PromPlugin.findFiles(membersWithoutBinDirectory, #["sct", "strl"])
    }
    
    /**
     * Return the launch data of the used environment
     * @return the launch data
     */
    private def KiCoLaunchData getLaunchData() {
        return env.launchData
    }
    
    /**
     * Refreshes the folders of the resources or the general output folder for generated files.
     * This depends of the configuration of the output behaviour.
     */
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
    
    /**
     * Compile a model file via KiCo. 
     * 
     * @param res the resource to build
     */
    private def void compile(IFile res, EObject model) {
        // Load model from file        
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
            context.progressMonitor = monitor
            
            // Compile
            var CompilationResult result
            result = KielerCompiler.compile(context)

            // Handle errors and warnings
            if (result.allErrors.isNullOrEmpty() && result.allWarnings.isNullOrEmpty()) {
                // Flush compilation result to target
                val targetLocation = computeTargetPath(res.projectRelativePath.toOSString, false)
                saveCompilationResult(res, model, result, targetLocation)
            } else {
                if(result.allErrors != null && result.allErrors.toLowerCase.contains("not asc")) {
                    createErrorMarker(res, "Model is not ASC-Schedulable")
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
    }
    
    private def void deleteMarkers(IFile file) {
        val markers = file.findMarkers(KICO_ERROR_MARKER_TYPE, false, IResource.DEPTH_INFINITE)
        if(!markers.isNullOrEmpty) {
            for(m : markers){
                m.delete()
            }    
        }
    }
    
    private def IMarker createErrorMarker(IFile file, String message) {
        val marker = file.createMarker(KICO_ERROR_MARKER_TYPE)
        marker.setAttribute(IMarker.PRIORITY, IMarker.PRIORITY_HIGH);
        marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_ERROR);
        marker.setAttribute(IMarker.LINE_NUMBER, 1);
        marker.setAttribute(IMarker.MESSAGE, message);
        marker.setAttribute(IMarker.LOCATION, file.projectRelativePath.toOSString);
        return marker
    }
    
    /**
     * Generates wrapper code using the main file template
     * and all annotation datas that have been found in models.
     */
    private def void generateWrapperCode() {
        if(!launchData.wrapperCodeTemplate.isNullOrEmpty) {
            val List<WrapperCodeAnnotationData> allAnnotationDatas = newArrayList()
            for(annotationDatas : annotationsOfFile.values) {
                allAnnotationDatas.addAll(annotationDatas)
            }
            
            // resolve template path
            val resolvedWrapperCodeTemplate = PromPlugin.performStringSubstitution(launchData.wrapperCodeTemplate, project)
            // Create wrapper code
            val names = modelNames.values.toList
            val name = names.get(0)
            val generator = new WrapperCodeGenerator(project, launchData)
            val wrapperCode = generator.generateWrapperCode(resolvedWrapperCodeTemplate,
                #{WrapperCodeGenerator.MODEL_NAME_VARIABLE -> name,
                  WrapperCodeGenerator.MODEL_NAMES_VARIABLE -> names},
                allAnnotationDatas
            )
            // Save output
            val resolvedWrapperCodeTargetLocation = computeTargetPath(resolvedWrapperCodeTemplate, false)
            Files.write(wrapperCode, new File(resolvedWrapperCodeTargetLocation), Charsets.UTF_8)
    
            // Refresh output in workspace
            val template = project.findMember(resolvedWrapperCodeTemplate)
            refreshOutput(template as IFile)
        }
    }
    
    /**
     * Generate the code for simulation of a model file
     * 
     * @param res the model file for which simulation code should be created
     */
    private def void generateSimulationCode(IFile res, EObject model) {
        //TODO: Hardcoded stuff
        val simTargetPathDirectory = new Path(computeTargetPath("sim/code/", true))
        var simTemplate = "Simulation.ftl";
        var simTargetPath = simTargetPathDirectory + File.separator + "Sim_" + Files.getNameWithoutExtension(res.name)+".c"
        if(project.findMember(simTemplate) == null) {
            simTemplate = "src/JavaSimulation.ftl"
            simTargetPath = simTargetPathDirectory + File.separator + "Sim_" + Files.getNameWithoutExtension(res.name)+".java"
            if(project.findMember(simTemplate) == null) {
                println("No simulation template found.")
                return;                
            }
        }
        
        // Get variables in model
        // TODO: more generic implementation
        val List<WrapperCodeAnnotationData> variables = newArrayList()
        if (model instanceof State) {
            for(decl : model.declarations) {
                for(valuedObject : decl.valuedObjects) {
                    // At the moment, send only inputs and outputs
                    if(decl.input || decl.output) {
                        val data = new WrapperCodeAnnotationData();
                        data.arguments.add(String.valueOf(decl.input))
                        data.arguments.add(String.valueOf(decl.output))
                        // add array sizes if any
                        if(!valuedObject.cardinalities.nullOrEmpty) {
                            for(card : valuedObject.cardinalities) {
                                var IntValue intValue = null;
                                if(card instanceof IntValue) {
                                    intValue = card as IntValue
                                } else if(card instanceof ValuedObjectReference) {
                                    if(card.valuedObject.initialValue instanceof IntValue) {
                                        intValue = card.valuedObject.initialValue as IntValue
                                    } else {
                                        throw new Exception("Array sizes must have an integer or integer constant as initial value")
                                    }
                                }
                                if(intValue != null) {
                                    data.arguments.add(intValue.value.toString)
                                }
                            }
                        }
                        
                        data.modelName = model.id
                        data.input = true
                        data.output = true
                        data.name = "Simulate"
                        data.varType = decl.type.literal
                        data.varName = valuedObject.name
                        
                        variables.add(data)
                    }
                }
            }
        }
        
        // Get simulation code
        val modelName = Files.getNameWithoutExtension(res.name)
        val generator = new WrapperCodeGenerator(project, launchData)
        val simulationCode = generator.generateWrapperCode(simTemplate,
            #{"compiled_model_loc" -> computeTargetPath(res.projectRelativePath.toOSString, false),
              WrapperCodeGenerator.FILE_NAME_VARIABLE -> Files.getNameWithoutExtension(simTargetPath),
              WrapperCodeGenerator.MODEL_NAME_VARIABLE -> modelName,
              WrapperCodeGenerator.MODEL_NAMES_VARIABLE -> #[modelName] },
            variables)
        
        // Save the result as simulation for this model
//        System.err.println(simulationCode)
        val targetFile = project.getFile(simTargetPath)
        if(targetFile.exists())
            targetFile.delete(true, null)
        PromPlugin.createResource(targetFile, new StringInputStream(simulationCode))
        
        // Copy cJSON.c and cJSON.h to output directory of simulation
        if(isCTarget)
            createCJsonLibrary(simTargetPathDirectory)
        else if(isJavaTarget)
            createJavaJsonLibrary(simTargetPathDirectory)
            
        // Compile to executable
        compileSimulationCode(simTargetPath);
    }
    
    /**
     * Copies the cJSON.c and cJSON.h files from the plugin to the directory.
     * @param projectRelativeDirectory the directory to copy the files into
     */
    private def void createCJsonLibrary(Path simTargetPath) {
        val libPath = simTargetPath.removeLastSegments(1).append("lib")
        
        PromPlugin.initializeFolder(project, libPath.toOSString, "platform:/plugin/de.cau.cs.kieler.prom/resources/sim/c/cJSON")
    }
    
    /**
     * Copies the cJSON.c and cJSON.h files from the plugin to the directory.
     * @param projectRelativeDirectory the directory to copy the files into
     */
    private def void createJavaJsonLibrary(Path simTargetPath) {
        val libPath = simTargetPath.removeLastSegments(2).append("org/json")
        
        PromPlugin.initializeFolder(project, libPath.toOSString, "platform:/plugin/de.cau.cs.kieler.prom/resources/sim/java/json")
    }
    
    /**
     * Creates an executable from the code in the project relative path.
     * The executable is either a binary in case the simulation file is a c file.
     * Or it is a Java archive (jar file) in case the simulation is a Java file.
     * @param simPath the path to the simulation file
     */
    private def void compileSimulationCode(String simPath) {
        if(!project.getFile(simPath).exists) {
            System.err.println("Simulation file '" + simPath + "'does not exist in project "+project.name)
            return   
        }
        
        if(isCTarget)
            createExecutableFromCCode(simPath)
        else if(isJavaTarget)
            createExecutableFromJavaCode(simPath)
    }
    
    /**
     * Creates a binary using gcc on the simulation file.
     * @param simPath the path to the simulation file
     */
    private def void createExecutableFromCCode(String simTargetPath) {
         // Command to compile simulation code: "gcc SimulationCode.c -o SimulationCode"
        val isWindows = System.getProperty("os.name").toLowerCase.contains("win")
        val fileName = new Path(simTargetPath).lastSegment
        val executableName = Files.getNameWithoutExtension(fileName) + if(isWindows) ".exe" else ""
        val directory = new Path(simTargetPath).removeLastSegments(1)
        val parentDir = ".." + File.separator
        
        // Delete old executable
        val executableFile = project.getFile(directory.toOSString + File.separator + executableName)
        if(executableFile.exists)
            executableFile.delete(true, null)
        
        // Run gcc on simulation code
        val pBuilder = new ProcessBuilder("gcc","-std=c99",fileName,"-o", parentDir + executableName)
        pBuilder.directory(project.location.append(directory).toFile)
        val p = pBuilder.start()
        // Wait until the process finished
        val errorCode = p.waitFor()
        if(errorCode != 0) {
            throw new Exception("GCC has issues:" + errorCode + " (" + pBuilder.command + " in " + pBuilder.directory + ")")
        } else {
            executableFile.refreshLocal(1, null)
        }
    }
    
    /**
     * Creates a Java archive using jar on the simulation file.
     * @param simPath the path to the simulation file
     */
    private def void createExecutableFromJavaCode(String simPath) {
        // Create jar file
        // Example command: jar cvfe ../output.jar JavaSimulationJSimple *.class
        val filePath = new Path(simPath)
        val fileName = filePath.lastSegment
        val fileNameNoExtension = Files.getNameWithoutExtension(fileName)
        val executableName = fileNameNoExtension + ".jar"
        val directory = filePath.removeLastSegments(1)
        val parentDir = ".." + File.separator
        
        // Delete old executable
        val executableFile = project.getFile(directory.removeLastSegments(1).toOSString + File.separator + executableName)
        if(executableFile.exists)
            executableFile.delete(true, null)
        
        // Search for all class files in the bin directory
        val classFiles = PromPlugin.findFiles(project.getFolder("bin").members, "class")
        val classFilePaths = classFiles.map[it.projectRelativePath.removeFirstSegments(1).toOSString]
        
        // Create process builder to compile jar
        val mainClassWithoutSourceDirectoryAndFileExtension = filePath.removeFirstSegments(1).removeFileExtension.toOSString
        val pBuilder = new ProcessBuilder(#["jar", "cvfe", parentDir+executableFile.projectRelativePath.toOSString, mainClassWithoutSourceDirectoryAndFileExtension] + classFilePaths)
        pBuilder.directory(project.location.append(new Path(File.separator + "bin")).toFile)
        pBuilder.redirectError(project.location.append(new Path("log.txt")).toFile)
        
        val p = pBuilder.start()
        // Wait until the process finished
        val errorCode = p.waitFor()
        if(errorCode != 0) {
            throw new Exception("jar has issues:" + errorCode + " (" + pBuilder.command + " in " + pBuilder.directory + ")")
        } else {
            executableFile.refreshLocal(1, null)
        }
    }
    
    /**
     * Adds the wrapper code annotations that are found in the model file to the map of annotations.
     * @param modelFile the model file
     * @param overwrite determines if old annotation data should be replaced
     */
    private def void getWrapperCodeAnnotations(IFile file, EObject model) {
        val List<WrapperCodeAnnotationData> datas = newArrayList()
        WrapperCodeGenerator.getWrapperCodeAnnotationData(model, datas)
        val location = file.location.toOSString
        annotationsOfFile.put(location, datas)
        modelNames.put(location, Files.getNameWithoutExtension(file.name))
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
        val projectRelativePathObject = new Path(projectRelativePath)
        // Only append file extension if the input path does have one
        val newFileExtension = if(projectRelativePathObject.fileExtension.isNullOrEmpty)
                                   ""
                               else
                                   launchData.targetLanguageFileExtension
        if(launchData.targetDirectory.isNullOrEmpty()) {
            // Compute path such that the target file will be in the same file as the source file.
            projectRelativeTargetPath = projectRelativePathObject.removeFileExtension.toOSString + newFileExtension
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
            projectRelativeTargetPath = launchData.targetDirectory + File.separator + projectRelativeRelevantPathWithoutExtension + newFileExtension
        }
        
        // Return either absolute or relative target path
        if(projectRelative)
            return projectRelativeTargetPath
        else
            return project.location + File.separator + projectRelativeTargetPath    
    }

    /**
     * Checks if the directory in the java project is configured as source directory.
     * 
     * @param javaProject A project with the java nature
     * @param directory The directory
     * @return true if the directory is a source directory. false otherwise.
     */
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
    private def void saveCompilationResult(IFile res, EObject model, CompilationResult result, String targetLocation) {
        // Create directory for the output if none yet.
        createDirectories(targetLocation)
        
        // Serialize Eobject
        if(result.string.isNullOrEmpty) {
            saveEObject(result.getEObject(), targetLocation)
        } else {
            // Save generated code to file, possibly using a target template
            val resolvedTargetTemplate = PromPlugin.performStringSubstitution(launchData.targetTemplate, project)
            if (resolvedTargetTemplate.isNullOrEmpty()) {
                // Don't use template
                Files.write(result.string, new File(targetLocation), Charsets.UTF_8)
            } else {
                // Inject compilation result into target template
                val modelName = Files.getNameWithoutExtension(res.name)
                val annotationDatas = newArrayList()
                
                WrapperCodeGenerator.getWrapperCodeAnnotationData(model, annotationDatas)
                val generator = new WrapperCodeGenerator(project, launchData)
                val wrapperCode = generator.generateWrapperCode(resolvedTargetTemplate,
                    #{WrapperCodeGenerator.KICO_GENERATED_CODE_VARIABLE -> result.string,
                      WrapperCodeGenerator.MODEL_NAME_VARIABLE -> modelName,
                      WrapperCodeGenerator.MODEL_NAMES_VARIABLE -> #[modelName]},
                    annotationDatas)
                // Save output
                Files.write(wrapperCode, new File(targetLocation), Charsets.UTF_8)
            }
        }
    }

    /**
     * Serializes and saves an EObject in the file system.
     * 
     * @param eobject the EObject
     * @param targetLocation the fully qualified path where it should be saved
     */
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
    
    private def boolean isCTarget() {
        return launchData.targetLanguage.contains("s.c")
    }
    
    private def boolean isJavaTarget() {
        return launchData.targetLanguage.contains("s.java")
    }
}
