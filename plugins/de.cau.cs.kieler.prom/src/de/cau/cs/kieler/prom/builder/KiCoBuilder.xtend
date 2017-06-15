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
import java.util.concurrent.TimeUnit
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
import org.eclipse.core.runtime.jobs.Job
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.jdt.core.IClasspathEntry
import org.eclipse.jdt.core.IJavaProject
import org.eclipse.jdt.core.JavaCore
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.resource.XtextResourceSet
import org.eclipse.xtext.util.StringInputStream
import java.io.InputStreamReader
import java.io.BufferedReader
import de.cau.cs.kieler.prom.ui.console.PromConsole
import java.lang.ProcessBuilder.Redirect
import com.google.common.io.CharStreams
import com.google.common.io.ByteStreams
import org.eclipse.core.runtime.Status

/**
 * @author aas
 * 
 */
class KiCoBuilder extends IncrementalProjectBuilder {
    
    /**
     * Id of the builder
     */
    public static val String BUILDER_ID = "de.cau.cs.kieler.prom.KiCoBuilder"; 
    
    public static val String KICO_PROBLEM_MARKER_TYPE = "kico.problem"
    
    /**
     * The monitor of the current build process.
     */
    private IProgressMonitor monitor

    /**
     * The project for which this build is done.
     */
    private IProject project
    
    /**
     * The kind of the build for an IncrementalProjectBuilder. This is one of 
     * FULL_BUILD, CLEAN_BUILD, INCREMENTAL_BUILD
     */
    private int kind
    
    /**
     * The environment data used for the build.
     */
    private EnvironmentData env
    
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
    private ResourceSet resourceSet;
    
    /**
     * Build method for Eclipse Builders.
     * {@inheritDoc}
     */
    protected override IProject[] build(int kind, Map args, IProgressMonitor monitor) {
        this.monitor = monitor
        this.project = getProject()
        this.kind = kind
        
        switch(kind) {
            case FULL_BUILD : fullBuild()
            case CLEAN_BUILD : clean()
            case AUTO_BUILD,
            case INCREMENTAL_BUILD : {
                val delta = getDelta(project);
                if (delta == null) {
                   fullBuild();
                } else {
                   incrementalBuild(delta);
                }
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
                    if(res.type == IResource.FILE && res.fileExtension != null && res.exists) {
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
    private def void build(List<IFile> files) {
        // Compile the found resources
        if(!files.isNullOrEmpty) {
            // Init 
            monitor.subTask("Initializing build")
            initialize()
            
            // Load changed models into resource set
            for(res : files) {
                monitor.subTask("Loading resource "+res.name)
                ModelImporter.getResource(res, resourceSet)
            }
            // Re-link all models 
            relink(resourceSet)
            
            // Compile via KiCo
            var boolean isFirstModel = true
            for(file : files) {
                // Compile, generate simulation code, fetch wrapper code annotations
                if(!monitor.isCanceled) {
                    // Remove all warnings and errors from a previous KiCo build.
                    deleteMarkers(file)
                    // Compile model files
                    switch(file.fileExtension.toLowerCase) {
                        case "sct",
                        case "strl" : {
                            monitor.subTask("Loading model "+file.name)
                            val model = ModelImporter.load(file, resourceSet)
                            if(model == null) {
                                throw new Exception("Couldn't load model "+file.name)
                            }
                            // Compile using KiCo
                            if(!monitor.isCanceled) {
                                monitor.subTask("Compiling model "+file.name)
                                compile(file, model)
                            }
                            // Generate simulation code
                            if(!monitor.isCanceled) {
                                monitor.subTask("Creating simulation for "+file.name)
                                generateSimulationCode(file, model)
                            }
                            // Generate wrapper code for first model in the list
                            if(!monitor.isCanceled) {
                                if(isFirstModel) {
                                    monitor.subTask("Generating wrapper code.")
                                    generateWrapperCode(file, model)
                                }
                            }
                        }
                    }
                }
                isFirstModel = false
            }
            
            // Refresh output in workspace
            monitor.subTask("Refreshing output directory")
            refreshOutput(files)
        }
    }

    /**
     * Clean the project.
     */
    private def void clean() {
        // TODO: Delete generated files
        isInitialized = false
        modelNames.clear
        createResourceSet
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
            if(resourceSet == null) {
                createResourceSet    
            }
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
    private def void compile(IFile file, EObject model) {
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
                val targetLocation = computeTargetPath(file.projectRelativePath.toOSString, false)
                saveCompilationResult(file, model, result, targetLocation)
            } else {
                if(result.allWarnings != null && result.allWarnings.toLowerCase.contains("not asc")) {
                    createWarningMarker(file, "Model is not ASC-Schedulable")
                } else {
                    val errorMessage = "Compilation of '" + file.name + "' failed:\n\n" +
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
        val markers = file.findMarkers(KICO_PROBLEM_MARKER_TYPE, false, IResource.DEPTH_INFINITE)
        if(!markers.isNullOrEmpty) {
            for(m : markers){
                m.delete()
            }    
        }
    }
    
    private def IMarker createMarker(IFile file, String message) {
        val marker = file.createMarker(KICO_PROBLEM_MARKER_TYPE)
        marker.setAttribute(IMarker.LINE_NUMBER, 1);
        marker.setAttribute(IMarker.MESSAGE, message);
        marker.setAttribute(IMarker.LOCATION, file.projectRelativePath.toOSString);
        return marker
    }
    
    private def IMarker createWarningMarker(IFile file, String message) {
        val marker = createMarker(file, message)
        marker.setAttribute(IMarker.PRIORITY, IMarker.PRIORITY_HIGH);
        marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_WARNING);
        return marker
    }
    
    private def IMarker createErrorMarker(IFile file, String message) {
        val marker = createMarker(file, message)
        marker.setAttribute(IMarker.PRIORITY, IMarker.PRIORITY_HIGH);
        marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_ERROR);
        return marker
    }
    
    /**
     * Generates wrapper code using the main file template
     * and all annotation datas that have been found in models.
     */
    private def void generateWrapperCode(IFile file, EObject model) {
        if(!launchData.wrapperCodeTemplate.isNullOrEmpty) {
            // Get annotations in model
            val annotationDatas = newArrayList()
            WrapperCodeGenerator.getWrapperCodeAnnotationData(model, annotationDatas)
            
            // Resolve template path
            val resolvedWrapperCodeTemplate = PromPlugin.performStringSubstitution(launchData.wrapperCodeTemplate, project)
            // Create wrapper code
            val name = Files.getNameWithoutExtension(file.name)
            modelNames.put(file.location.toOSString, name)
            val names = modelNames.values.toList
            val generator = new WrapperCodeGenerator(project, launchData)
            val wrapperCode = generator.generateWrapperCode(resolvedWrapperCodeTemplate,
                #{WrapperCodeGenerator.MODEL_NAME_VARIABLE -> name,
                  WrapperCodeGenerator.MODEL_NAMES_VARIABLE -> names},
                annotationDatas
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
    private def void generateSimulationCode(IFile file, EObject model) {
        //TODO: Hardcoded stuff
        val simTargetPathDirectory = new Path(computeTargetPath("sim/code/", true))
        var simTemplate = "Simulation.ftl";
        var simTargetPath = simTargetPathDirectory + File.separator + "Sim_" + Files.getNameWithoutExtension(file.name)+".c"
        if(project.findMember(simTemplate) == null) {
            simTemplate = "src/JavaSimulation.ftl"
            simTargetPath = simTargetPathDirectory + File.separator + "Sim_" + Files.getNameWithoutExtension(file.name)+".java"
            if(project.findMember(simTemplate) == null) {
                println("No simulation template found.")
                return;                
            }
        }
        
        // Get variables in model
        // TODO: more generic implementation
        monitor.subTask("Fetching variables in model:" + file.name)
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
        monitor.subTask("Processing simulation template for:" + file.name)
        val modelName = Files.getNameWithoutExtension(file.name)
        val generator = new WrapperCodeGenerator(project, launchData)
        val simulationCode = generator.generateWrapperCode(simTemplate,
            #{"compiled_model_loc" -> computeTargetPath(file.projectRelativePath.toOSString, false),
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
        
        val compileJob = new Job("Executable compilation of:" + simPath) {
            override protected run(IProgressMonitor monitor) {
                try {
                    if(isCTarget) {
                        createExecutableFromCCode(simPath)
                    } else if(isJavaTarget) {
                        createExecutableFromJavaCode(simPath)
                    }
                    return Status.OK_STATUS
                } catch (Exception e){
                    e.printStackTrace
                    val s = new Status(Status.ERROR, PromPlugin.ID, "Compilation to executable failed.", e)
                    return s
                }
            }
        }
        compileJob.schedule()
    }
    
    /**
     * Creates a binary using gcc on the simulation file.
     * @param simPath the path to the simulation file
     */
    private def void createExecutableFromCCode(String simTargetPath) {
        monitor.subTask("Compiling simulation via gcc:" + simTargetPath)
        
        val slash = File.separator
        val currentDir = "." + slash
        val isWindows = System.getProperty("os.name").toLowerCase.contains("win")
        // File name of the file to be compiled
        val codeFileName = new Path(simTargetPath).lastSegment
        // File name of the exectuable to be created
        val executableName = Files.getNameWithoutExtension(codeFileName) + if(isWindows) ".exe" else ""
        // The directory in which the code file is saved
        val codeDirectory = new Path(simTargetPath).removeLastSegments(1)
        // The directory for all simulation related files
        val simDirectory = codeDirectory.removeLastSegments(1)
        // The directory in which the executable should be created
        val executableDirectory = simDirectory.append(slash + "bin")
        // Project relative path to the executable 
        val executablePath = executableDirectory.append(slash + executableName)
        
        // Delete old executable
        val executableFile = project.getFile(executablePath.toOSString)
        if(executableFile.exists)
            executableFile.delete(true, null)
        
        // Create bin directory
        PromPlugin.createResource(project.getFolder(executableDirectory), null)
        
        // Run gcc on simulation code
        // Example command to compile simulation code: "gcc -std=c99 SimulationCode.c -o SimulationCode"
        val pBuilder = new ProcessBuilder("gcc", "-std=c99",
                                          currentDir + "code" + slash + codeFileName,
                                          "-o", currentDir + executablePath.makeRelativeTo(simDirectory).toOSString)
        pBuilder.directory(project.location.append(simDirectory).toFile)
        pBuilder.redirectErrorStream(true)
        val p = pBuilder.start()
        // Wait until the process finished
        var Exception exception
        if(!p.waitFor(60, TimeUnit.SECONDS)) {
            exception = new Exception("GCC took to long: (timeout: 60s, command: " + pBuilder.command + ", in directory " + pBuilder.directory + ")\n\n"
                              + "Please check the KIELER Console output.")
        }
        // Check that there was no error
        if(exception == null && p.exitValue != 0) {
            exception = new Exception("GCC has issues:" + p.exitValue + " (" + pBuilder.command + " in " + pBuilder.directory + ")\n\n"
                              + "Please check the KIELER Console output.")
        }
        if(p.inputStream.available > 0) {
            // Print output of process to eclipse console
            PromConsole.print("GCC output for '" + simTargetPath + "'")
            PromConsole.copy(p.inputStream)
            PromConsole.print("\n\n")
        }
        if(exception != null) {
            throw exception
        } else {
            executableFile.refreshLocal(1, null)
        }
    }
    
    /**
     * Creates a Java archive using jar on the simulation file.
     * @param simPath the path to the simulation file
     */
    private def void createExecutableFromJavaCode(String simPath) {
        monitor.subTask("Compiling simulation into jar file")
        
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
        pBuilder.redirectErrorStream(true)
        val p = pBuilder.start()
        // Wait until the process finished
        val errorCode = p.waitFor()
        var Exception exception
        if(errorCode != 0) {
            exception = new Exception("jar has issues:" + errorCode + " (" + pBuilder.command + " in " + pBuilder.directory + ")")
        } else {
            executableFile.refreshLocal(1, null)
        }
        // Print output of process
        if(p.inputStream.available > 0) {
            // Print output of process to eclipse console
            PromConsole.print("JAR output for '" + simPath + "'")
            PromConsole.copy(p.inputStream)
            PromConsole.print("\n\n")
        }
        if(exception != null) {
            throw exception
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
    private def void saveCompilationResult(IFile file, EObject model, CompilationResult result, String targetLocation) {
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
                val modelName = Files.getNameWithoutExtension(file.name)
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
     * Re-link all XtextResources in the resource set to find references. 
     * 
     * @param path The path to a fully qualified file
     */
    private def void relink(ResourceSet resourceSet) {
        for(res : resourceSet.resources) {
            if(res instanceof XtextResource) {
                monitor.subTask("Linking resource "+res.URI.lastSegment)
                res.relink()
            }
        }
    }

    private def void createResourceSet() {
        // Create resource set
        resourceSet = new XtextResourceSet()
        
        // Load all model files into one resource set.
        // But only if this is not a full build,
        // because on a full build all resources are loaded and re-linked later anyway.
        if(kind != FULL_BUILD) {
            val modelFiles = findModelFilesInProject()
            for(f : modelFiles) {
                monitor.subTask("Loading "+f.name)
                val res = ModelImporter.getResource(f, resourceSet)
            }
            // Relink loaded resources, because all potentially referenced models are in the resource set now.
            relink(resourceSet)
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
