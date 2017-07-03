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

import com.google.common.base.Charsets
import com.google.common.io.Files
import de.cau.cs.kieler.kico.KielerCompiler
import de.cau.cs.kieler.kico.features.Feature
import de.cau.cs.kieler.kico.internal.Transformation
import de.cau.cs.kieler.prom.common.EnvironmentData
import de.cau.cs.kieler.prom.common.KiCoLaunchData
import de.cau.cs.kieler.prom.common.ModelImporter
import de.cau.cs.kieler.prom.common.PromPlugin
import de.cau.cs.kieler.prom.launchconfig.WrapperCodeGenerator
import de.cau.cs.kieler.scg.s.features.CodeGenerationFeatures
import java.io.File
import java.util.ArrayList
import java.util.HashMap
import java.util.List
import java.util.Map
import java.util.Set
import org.eclipse.core.resources.IContainer
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IMarker
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.IResource
import org.eclipse.core.resources.IResourceDelta
import org.eclipse.core.resources.IResourceDeltaVisitor
import org.eclipse.core.resources.IncrementalProjectBuilder
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.IPath
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.Path
import org.eclipse.core.runtime.Status
import org.eclipse.core.runtime.jobs.Job
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.jdt.core.IClasspathEntry
import org.eclipse.jdt.core.IJavaProject
import org.eclipse.jdt.core.JavaCore
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.resource.XtextResourceSet

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
     * The features of the KIELER Compiler that produces finished code.
     * The field is used to cache the features.
     */
    private static var Feature codeGenerationFeatures
    /**
     * The trasnformations of the KIELER Compiler that produces finished code.
     * The field is used to cache the transformations.
     */
     
    private static var Set<Transformation> codeGenerationTransformations
    
    private val List<SimulationCompiler> simulationCompilers = newArrayList
    private val List<ModelCompiler> modelCompilers = newArrayList
    
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
     * Graph representing the dependencies of the resources.
     */
    private DependencyGraph dependencies;
    
    /**
     * Creates a marker for a file in the Eclipse workspace.
     */
    private static def IMarker createMarker(IFile file, String message) {
        val marker = file.createMarker(KICO_PROBLEM_MARKER_TYPE)
        marker.setAttribute(IMarker.LINE_NUMBER, 1);
        marker.setAttribute(IMarker.MESSAGE, message);
        marker.setAttribute(IMarker.LOCATION, file.projectRelativePath.toOSString);
        return marker
    }
    
    /**
     * Creates a warnin marker for a file in the Eclipse workspace.
     */
    public static def IMarker createWarningMarker(IFile file, String message) {
        val marker = createMarker(file, message)
        marker.setAttribute(IMarker.PRIORITY, IMarker.PRIORITY_HIGH);
        marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_WARNING);
        return marker
    }
    
    /**
     * Creates an error marker for a file in the Eclipse workspace.
     */
    public static def IMarker createErrorMarker(IFile file, String message) {
        val marker = createMarker(file, message)
        marker.setAttribute(IMarker.PRIORITY, IMarker.PRIORITY_HIGH);
        marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_ERROR);
        return marker
    }
    
    /**
     * Flag that is infered from the target language and determines
     * if the target is a single transformation for code generation (e.g. "s.java")
     * or a complex compile chain (e.g. "*T_ABORTWTO, T_EXIT").
     */
    public static def boolean isCompileChain(String targetLanguage) {
        var isCompileChain = false
        // Get code transformations of KiCo
        if(codeGenerationFeatures == null) {
            codeGenerationFeatures = KielerCompiler.getFeature(CodeGenerationFeatures.TARGET_ID)
            if(codeGenerationFeatures != null) {
                codeGenerationTransformations = codeGenerationFeatures.expandingTransformations
            }
        }
        // Check if target matches a transformation
        if(codeGenerationTransformations != null && !codeGenerationTransformations.isEmpty) {            
            // There is no transformation with the given id
            // => the target is a compile chain and not a transformation.
            isCompileChain = codeGenerationTransformations.filter[it.id == targetLanguage].isEmpty    
        }
        return isCompileChain
    }
    
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
        // Find all templates that should be built
        val templateFiles = findTemplateFilesInProject()
        processTemplates(templateFiles)
        // Find all model files
        val modelFiles = findModelFilesInProject()
        build(modelFiles)
    }
    
    private def void incrementalBuild(IResourceDelta delta) {
        // Find changed files
        monitor.subTask("Searching files")
        
        val List<IFile> templatesToBeProcessed = newArrayList
        val ArrayList<IFile> modelsToBeBuilt = newArrayList()
        
        try {
            delta.accept(new IResourceDeltaVisitor() {
                override visit(IResourceDelta delta) throws CoreException {
                    val res = delta.getResource()
                    if(res.type == IResource.FILE && res.fileExtension != null && res.exists) {
                        val file = res as IFile
                        // Only take care of files with the following extensions
                        switch(file.fileExtension.toLowerCase) {
                            case "sct",
                            case "strl": modelsToBeBuilt.add(file)
                            case "ftl": {
                                // TODO: Hard coded stuff. Make this configurable
                                if(file.name.startsWith("TemplateFor")) {
                                    templatesToBeProcessed.add(file)
                                }
                            }
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

        // Process templates
        processTemplates(templatesToBeProcessed)

        // Build the changed models
        monitor.subTask("Building files")
        build(modelsToBeBuilt)
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
            
            // Load changed models into resource set.
            // But only if this is not a full build because in a full build this is done in the initialization.
            if(kind != FULL_BUILD) {
                for(f : files) {
                    monitor.subTask("Loading resource "+f.name)
                    val res = ModelImporter.getResource(f, resourceSet)
                    ModelImporter.reload(res, resourceSet)
                }
                // Re-link all models 
                relink(resourceSet)
                
                // Update dependencies
                updateDependencies(files)
                checkDependencies()
            } 

            // TODO: hard coded stuff
            modelCompilers.clear()
            
            // Simulation generator
            var simTemplate = project.getFile("Simulation.ftl")
            if(!simTemplate.exists) {
                simTemplate = project.getFile("src/JavaSimulation.ftl")
                if(!simTemplate.exists) {
                    println("No simulation template found.")
                }
            }
            var SimulationGenerator simGen
            if(simTemplate != null) {
                simGen = new SimulationGenerator(simTemplate, project)
                simGen.snippetDirectory =  launchData.wrapperCodeSnippetDirectory
                simGen.fileExtension = launchData.targetLanguageFileExtension
            }
            
            // KiCo model compiler
            val kicoModelCompiler = new KiCoModelCompiler()
            modelCompilers.add(kicoModelCompiler)
            kicoModelCompiler.fileExtension = launchData.targetLanguageFileExtension
            kicoModelCompiler.outputFolder = launchData.targetDirectory
            kicoModelCompiler.outputTemplate = launchData.targetTemplate
            kicoModelCompiler.compileChain = launchData.targetLanguage
            kicoModelCompiler.monitor = monitor
            kicoModelCompiler.simulationGenerator = simGen
            
            // Compile via KiCo
            var boolean isFirstModel = true
            for(file : files) {
                // Compile, generate simulation code, fetch wrapper code annotations
                if(!monitor.isCanceled) {
                    // Remove all warnings and errors from a previous KiCo build.
                    deleteMarkers(file)
                    // Compile models
                    monitor.subTask("Loading model "+file.name)
                    val model = ModelImporter.getEObject(file, resourceSet)
                    if(model == null) {
                        throw new Exception("Couldn't load model "+file.name)
                    }
                    // Compile model
                    if(!monitor.isCanceled) {
                        for(modelCompiler : modelCompilers) {
                            monitor.subTask("Compiling model '"+file.name+ "' using "+modelCompiler.name)
                            val result = modelCompiler.compile(file, model)
                            // Show problems of result
                            showBuildProblems(result.problems)
                            if(result.simulationGenerationResult != null) {
                                showBuildProblems(result.simulationGenerationResult.problems)
                            }
                            // Compile generated simulation code
                            for(f : result.createdSimulationFiles) {
                                compileSimulationCode(f)
                            }
                        }
                    }
                    // Generate wrapper code for first model in the list
                    if(!monitor.isCanceled) {
                        if(isFirstModel) {
                            monitor.subTask("Generating wrapper code.")
                            generateWrapperCode(file, model)
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
        // Delete all markers
        val files = PromPlugin.findFiles(project.members, (null as String[]))
        for(f : files) {
            deleteMarkers(f)
        }
        // Re-initialize
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
        if(launchData.mainFile.isNullOrEmpty) {
            PromPlugin.setVariables(project.location.toOSString, "", "")
        } else {
            val targetPath = computeTargetPath(launchData.mainFile).projectRelativePath.toOSString
            PromPlugin.setVariables(project.location.toOSString, launchData.mainFile, targetPath)
        }
        
        // Create directory for output        
        createBuildDirectory();
        
        // Create simulation compilers
        // TODO: Hard coded stuff
        simulationCompilers.clear()
        val cCompiler = new CSimulationCompiler(monitor)
        val javaCompiler = new JavaSimulationCompiler(monitor)
        simulationCompilers.add(cCompiler)
        simulationCompilers.add(javaCompiler)
        
        // At first build, search for wrapper code annotations in all model files.
        // These are updated later, if a model file changes.
        if(!isInitialized) {
            isInitialized = true
            createResourceSet    
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
     * Returns a list with all template files in the project that should be processed.
     * @return the list of template files that should be processed
     */ 
    private def List<IFile> findTemplateFilesInProject() {
        val membersWithoutBinDirectory = project.members.filter[it.name != "bin"]
        val allTemplates = PromPlugin.findFiles(membersWithoutBinDirectory, #["ftl"])
        // TODO: Make this configurable
        return allTemplates.filter[it.name.startsWith("TemplateFor")].toList
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
    
    public static def void deleteMarkers(IFile file) {
        if(file != null && file.exists) {
            val markers = file.findMarkers(KICO_PROBLEM_MARKER_TYPE, false, IResource.DEPTH_INFINITE)
            if(!markers.isNullOrEmpty) {
                for(m : markers){
                    m.delete()
                }    
            }
        }
    }
    
    private def void showBuildProblems(List<BuildProblem> problems) {
        for(problem : problems) {
            if(problem.file != null) {
                var IMarker marker
                if(problem.isWarning) {
                    marker = createWarningMarker(problem.file, problem.message)
                } else {
                    marker = createErrorMarker(problem.file, problem.message)
                }
                if(marker != null && problem.line > 0) {
                    marker.setAttribute(IMarker.LINE_NUMBER, problem.line)
                }
            }
        }
    }
    
    private def void processTemplates(List<IFile> templates) {
        for(file : templates) {
            val name = Files.getNameWithoutExtension(file.name)
            val generator = new WrapperCodeGenerator(project, null)
            val generatedCode = generator.processTemplate(file.projectRelativePath.toOSString, 
                    #{WrapperCodeGenerator.FILE_NAME_VARIABLE -> name} )
            
            // Save output
            if(!generatedCode.isNullOrEmpty) {
                val folder = file.parent as IContainer
                // TODO: Hard coded stuff. Make this configurable
                val outputName = file.name.replace("TemplateFor","").replace(".ftl", "")
                val outputFile = folder.getFile(new Path(outputName))
                PromPlugin.createResource(outputFile, generatedCode, true)
            }
        }
    }
    
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
            val generator = new WrapperCodeGenerator(project, launchData.wrapperCodeSnippetDirectory)
            val wrapperCode = generator.generateWrapperCode(resolvedWrapperCodeTemplate, annotationDatas,
                #{WrapperCodeGenerator.MODEL_NAME_VARIABLE -> name,
                  WrapperCodeGenerator.MODEL_NAMES_VARIABLE -> names} )
                  
            // Save output
            val resolvedWrapperCodeTargetLocation = computeTargetPath(resolvedWrapperCodeTemplate).location.toOSString
            Files.write(wrapperCode, new File(resolvedWrapperCodeTargetLocation), Charsets.UTF_8)
    
            // Refresh output in workspace
            val template = project.findMember(resolvedWrapperCodeTemplate)
            refreshOutput(template as IFile)
        }
    }
    
    /**
     * Creates an executable from the code in the project relative path.
     * The executable is either a binary in case the simulation file is a c file.
     * Or it is a Java archive (jar file) in case the simulation is a Java file.
     * @param simPath the path to the simulation file
     */
    private def void compileSimulationCode(IFile file) {
        if(!file.exists) {
            System.err.println("Simulation file '" + file.projectRelativePath + "'does not exist in project "+project.name)
            return   
        }
        
        val compileJob = new Job("Executable compilation of:" + file.name) {
            override protected run(IProgressMonitor monitor) {
                try {
                    for(simulationCompiler : simulationCompilers) {
                        if(simulationCompiler.canCompile(file)) {
                            val result = simulationCompiler.compile(file)
                            showBuildProblems(result.problems)
                        }
                    }
                    return Status.OK_STATUS
                } catch (Exception e){
                    e.printStackTrace
                    val s = new Status(Status.ERROR, PromPlugin.PLUGIN_ID, "Compilation to executable failed.", e)
                    return s
                }
            }
        }
        compileJob.schedule()
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
     * The target path will be in the target directory and in this directory
     * has the same directory structure as the original file in the project.
     * 
     * @return the computed path
     */
    public static def IResource computeTargetResource(String projectRelativePath,
        String targetDirectory, String targetFileExtension, IProject project) {
        
        var IPath projectRelativeTargetPath;
        val projectRelativePathObject = new Path(projectRelativePath)
        // Only append file extension if the input path does have one
        val newFileExtension = if(projectRelativePathObject.fileExtension.isNullOrEmpty)
                                   ""
                               else
                                   targetFileExtension?.replace(".", "")
        if(targetDirectory.isNullOrEmpty()) {
            // Compute path such that the target file will be in the same file as the source file.
            projectRelativeTargetPath = projectRelativePathObject.removeFileExtension
        } else {
            // Compute path in the target directory
            // such that the directory structure of the original file is retained.
            var IPath projectRelativeRelevantPath = new Path(projectRelativePath)
            // The source directories of a java project are not part of the relevant target path
            // because output files will be saved to a java source folder as well.
            // So we remove the first segment of the path if it is a java source directory.
            val firstSegment = new Path(projectRelativePath).segment(0);
            if(!firstSegment.isNullOrEmpty() && project.hasNature(JavaCore.NATURE_ID)) {
                val javaProject = JavaCore.create(project)
                if(isJavaSourceDirectory(javaProject, firstSegment)) {
                    projectRelativeRelevantPath = projectRelativeRelevantPath.removeFirstSegments(1)
                }
            }
            
            // Remove extension
            val projectRelativeRelevantPathWithoutExtension = projectRelativeRelevantPath.removeFileExtension        
         
            // Compute target path
            projectRelativeTargetPath = new Path(targetDirectory).append(projectRelativeRelevantPathWithoutExtension)
        }
        // Add file extension
        if(!newFileExtension.isNullOrEmpty) {
           projectRelativeTargetPath = projectRelativeTargetPath.addFileExtension(newFileExtension)
        }
        // Create resource handle in project
        if(projectRelativeTargetPath.fileExtension != null) {
            return project.getFile(projectRelativeTargetPath)    
        } else {
            return project.getFolder(projectRelativeTargetPath)
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
    public def IResource computeTargetPath(String projectRelativePath) {
        return computeTargetResource(projectRelativePath, launchData.targetDirectory, launchData.targetLanguageFileExtension, project)
    }
    
    /**
     * Checks if the directory in the java project is configured as source directory.
     * 
     * @param javaProject A project with the java nature
     * @param directory The directory
     * @return true if the directory is a source directory. false otherwise.
     */
    private static def boolean isJavaSourceDirectory(IJavaProject javaProject, String directory) {
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
        val modelFiles = findModelFilesInProject()
        for(f : modelFiles) {
            monitor.subTask("Loading "+f.name)
            ModelImporter.getResource(f, resourceSet)
        }
        // Relink loaded resources, because all potentially referenced models are in the resource set now.
        relink(resourceSet)
        // Update dependencies
        createDependencyGraph
        // Check dependencies for validation
        checkDependencies
    }

    private def void updateDependencies(IFile... files) {
        // TODO: all model compilers should update the dependencies 
    }

    private def void createDependencyGraph() {
        // Create new dependency graph
        dependencies = new DependencyGraph()
        // Find files in resource set
        val List<IFile> files = newArrayList
        for(r : resourceSet.resources) {
            val file = ModelImporter.toPlatformResource(r)
            if(file != null) {
                files.add(file)
            }
        }
        // Update dependencies
        updateDependencies(files)
        // Print out dependencies
        for(n : dependencies.nodes) { 
            for(d : n.dependencies) {
                println(n.id + " ref " + d.id)
            }
        }
    }

    private def void checkDependencies() {
        // Check that there are no loops
        val loop = dependencies.findLoop
        if(loop != null) {
            throw new Exception("There is a loop in the dependencies of the models "+loop)
        }
    }
    
    private def boolean isCTarget() {
        return launchData.targetLanguage.contains("s.c")
    }
    
    private def boolean isJavaTarget() {
        return launchData.targetLanguage.contains("s.java")
    }
}
