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

import de.cau.cs.kieler.kico.KielerCompiler
import de.cau.cs.kieler.kico.features.Feature
import de.cau.cs.kieler.kico.internal.Transformation
import de.cau.cs.kieler.prom.KiBuildExtensions
import de.cau.cs.kieler.prom.ModelImporter
import de.cau.cs.kieler.prom.PromPlugin
import de.cau.cs.kieler.prom.kibuild.BuildConfiguration
import de.cau.cs.kieler.scg.s.features.CodeGenerationFeatures
import java.util.ArrayList
import java.util.HashMap
import java.util.List
import java.util.Map
import java.util.Set
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
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.jdt.core.IClasspathEntry
import org.eclipse.jdt.core.IJavaProject
import org.eclipse.jdt.core.JavaCore
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.resource.XtextResourceSet
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * @author aas
 * 
 */
class KielerModelingBuilder extends IncrementalProjectBuilder {
    
    /**
     * Id of the builder
     */
    public static val String BUILDER_ID = "de.cau.cs.kieler.prom.KielerModelingBuilder"; 
    
    public static val String PROBLEM_MARKER_TYPE = "kieler.modeling.builder.problem"
    
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

    extension KiBuildExtensions kiBuildExtensions 
    extension AttributeExtensions attributeExtensions 

    private var List<SimulationCompiler> simulationCompilers = newArrayList
    private var List<ModelCompiler> modelCompilers = newArrayList
    private var List<TemplateProcessor> templateProcessors = newArrayList
    
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
    
    @Accessors
    private boolean abortIncrementalBuild
    
    /**
     * Creates a marker for a file in the Eclipse workspace.
     */
    private static def IMarker createMarker(IResource res, String message) {
        val marker = res.createMarker(PROBLEM_MARKER_TYPE)
        marker.setAttribute(IMarker.LINE_NUMBER, 1);
        marker.setAttribute(IMarker.MESSAGE, message);
        marker.setAttribute(IMarker.LOCATION, res.projectRelativePath.toOSString);
        return marker
    }
    
    /**
     * Creates a warnin marker for a file in the Eclipse workspace.
     */
    public static def IMarker createWarningMarker(IResource res, String message) {
        val marker = createMarker(res, message)
        marker.setAttribute(IMarker.PRIORITY, IMarker.PRIORITY_HIGH);
        marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_WARNING);
        return marker
    }
    
    /**
     * Creates an error marker for a file in the Eclipse workspace.
     */
    public static def IMarker createErrorMarker(IResource res, String message) {
        val marker = createMarker(res, message)
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
    
    new() {
        super()
        attributeExtensions = new AttributeExtensions
        kiBuildExtensions = new KiBuildExtensions
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
                   fullBuild;
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
        initialize
        // Build all model files
        val modelFiles = findModelFilesInProject
        buildModels(modelFiles)
        // Process all templates
        processAllTemplates
    }
    
    private def void incrementalBuild(IResourceDelta delta) {
        // Initialize
        abortIncrementalBuild = false
        initialize
        // Find changed files
        monitor.subTask("Searching changed files")
        val ArrayList<IFile> changedModels = newArrayList()
        val ArrayList<IFile> changedTemplates = newArrayList()
        try {
            delta.accept(new IResourceDeltaVisitor() {
                override visit(IResourceDelta delta) throws CoreException {
                    val res = delta.getResource()
                    if(res.type == IResource.FILE && res.fileExtension != null && res.exists) {
                        val file = res as IFile
                        // Only take care of files with the following extensions
                        switch(file.fileExtension.toLowerCase) {
//                            case "sct",
                            case "sctx",
                            case "strl": {
                                changedModels.add(file)    
                            }
                            case "ftl": {
                                changedTemplates.add(file)
                            }
                            case "kibuild": {
                                // The configuration changed: Do a full build instead of an incremental build
                                abortIncrementalBuild = true
                                fullBuild
                                // No need to check further files, because we do a full build
                                return false
                            }
                            default : {
                                // Ignore other files
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
        // If a full build is started, there is no need to continue the incremental build
        if(!abortIncrementalBuild) {
            // Build the changed models
            buildModels(changedModels)
            // Process templates
            changedTemplates.addAll(getTemplatesThatNeedRebuild(changedModels))
            processTemplates(changedTemplates)            
        }
    }
    
    /**
     * Iterates over the template processors and returns their templates,
     * if it needs to be rebuild because the given model files have changed.
     */
    private def List<IFile> getTemplatesThatNeedRebuild(List<IFile> modelFiles) {
        val templateFiles = <IFile> newArrayList
        for(processor : templateProcessors) {
            var String modelPath
            if(processor instanceof SimulationTemplateProcessor) {
                modelPath = processor.modelPath.stringValue
            } else if(processor instanceof WrapperCodeTemplateProcessor) {
                modelPath = processor.modelPath.stringValue
            }
            if(modelPath != null) {
                val modelFile = project.getFile(modelPath)
                if(modelFiles.contains(modelFile)) {
                    val templatePath = processor.template.stringValue
                    val templateFile = project.getFile(templatePath)
                    templateFiles.add(templateFile)                    
                }
            }
        }
        return templateFiles
    }
    
    private def void processAllTemplates() {
        processTemplates(null, false)
    }
    
    private def void processTemplates(List<IFile> files) {
        processTemplates(files, true)
    }
    
    private def void processTemplates(List<IFile> files, boolean onlyBuildChangedFiles) {
        // Collection of all created simulation files
        val List<IFile> createdSimulationFiles = newArrayList
        
        monitor.subTask("Processing templates")
        for(templateProcessor : templateProcessors) {
            val templateFile = project.getFile(templateProcessor.template.stringValue)
            var templateForChangedFile = false
            if(onlyBuildChangedFiles) {
                // Check if the template of this processor changed
                for(changedTemplate : files) {
                    // Is this processor for this template?
                    if(templateFile == changedTemplate) {
                        templateForChangedFile = true
                    }
                }
            }
            // Process the template
            if(!onlyBuildChangedFiles || templateForChangedFile) {
                monitor.subTask("Processing template '"+templateProcessor.template.stringValue+"'")
                val result = templateProcessor.process
                showBuildProblems(result.problems)
                // Remember to compile simulation code
                if(templateProcessor instanceof SimulationTemplateProcessor) {
                    createdSimulationFiles.addAll(result.createdFiles)
                }
            }
        }
        
        // Compile created simulation files
        for(f : createdSimulationFiles) {
            compileSimulationCode(f)
        }
    }
    
    /**
     * Build a list of files
     * @param resources The list of files to build 
     */
    private def void buildModels(List<IFile> files) {
        // Collection of all created simulation files
        val List<IFile> createdSimulationFiles = newArrayList
        
        // Compile the model files
        if(!files.isNullOrEmpty) {
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

            // Compile via KiCo
            for(file : files) {
                // Compile, generate simulation code, fetch wrapper code annotations
                if(!monitor.isCanceled) {
                    // Remove all warnings and errors from a previous build.
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
                            monitor.subTask("Compiling model '"+file.name+ "' using "+modelCompiler)
                            val result = modelCompiler.compile(file, model)
                            // Show problems of result
                            showBuildProblems(result.problems)
                            if(result.simulationGenerationResult != null) {
                                showBuildProblems(result.simulationGenerationResult.problems)
                            }
                            // Remember to compile simulation code
                            createdSimulationFiles.addAll(result.createdSimulationFiles)
                        }
                    }
                }
            }
        }
        
        // Compile created simulation files
        for(f : createdSimulationFiles) {
            compileSimulationCode(f)
        }
    }

    /**
     * Clean the project.
     */
    private def void clean() {
        // TODO: Delete generated files
        // Delete all markers
        deleteMarkers(project)
        // Re-initialize
        isInitialized = false
        modelNames.clear
        createResourceSet
    }

    /**
     * Initialize this builder
     */
    private def void initialize() {
        monitor.subTask("Initializing build")
        // Clear last configuration
        modelCompilers.clear
        simulationCompilers.clear
        templateProcessors.clear
        // Load configuration file
        deleteMarkers(project)
        val configFilePath = project.getPersistentProperty(PromPlugin.BUILD_CONFIGURATION_QUALIFIER)
        if (configFilePath.isNullOrEmpty) {
            // Add warning marker because no build configuration was found
            createErrorMarker(project, "No kibuild file has been set in the project properties.\n"
                                       + "Use a kibuild file "
                                       + "to define how model files are compiled.")
        } else {
            try {
                val file = project.getFile(configFilePath)
                val model = ModelImporter.load(file)
                if(model != null && model instanceof BuildConfiguration) {
                        initializeConfiguration(model as BuildConfiguration)
                } else {
                    throw new Exception("Build configuration '" + file.projectRelativePath + "' could not be loaded")
                }
            } catch (Exception e) {
                createErrorMarker(project, e.message)
            }
        }
        
        // At first build, search for wrapper code annotations in all model files.
        // These are updated later, if a model file changes.
        if(!isInitialized) {
            isInitialized = true
            createResourceSet    
        }
    }
    
    private def void initializeConfiguration(BuildConfiguration buildConfig) {
        // Update attributes
        this.updateConfigurableAttributes(buildConfig.attributes)
        
        // Create model compilers
//            buildConfig.createModelCompilers
        modelCompilers = buildConfig.createModelCompilers
        for(modelCompiler : modelCompilers) {
            modelCompiler.monitor = monitor
        }
        // Create simulation compilers
        simulationCompilers = buildConfig.createSimulationCompilers
        for(simulationCompiler : simulationCompilers) {
            simulationCompiler.monitor = monitor
        }
        // Create template processors
        templateProcessors = buildConfig.createTemplateProcessors
        for(processor : templateProcessors) {
            processor.monitor = monitor
            processor.project = project
        }
    }

    /**
     * Returns a list with all model files in the project that can be built.
     * @return the list of model files that can be built
     */ 
    private def List<IFile> findModelFilesInProject() {
        // Search for models in project
        val membersWithoutBinDirectory = project.members.filter[it.name != "bin"]
        return PromPlugin.findFiles(membersWithoutBinDirectory, #[//"sct",
                                                                  "sctx",
                                                                  "strl"])
    }
    
    public static def void deleteMarkers(IResource res) {
        if(res != null && res.exists) {
            val markers = res.findMarkers(PROBLEM_MARKER_TYPE, false, IResource.DEPTH_INFINITE)
            if(!markers.isNullOrEmpty) {
                for(m : markers){
                    m.delete()
                }    
            }
        }
    }
    
    public static def void showBuildProblems(List<BuildProblem> problems) {
        for(problem : problems) {
            if(problem.res != null) {
                var IMarker marker
                if(problem.isWarning) {
                    marker = createWarningMarker(problem.res, problem.message)
                } else {
                    marker = createErrorMarker(problem.res, problem.message)
                }
                if(marker != null && problem.line > 0) {
                    marker.setAttribute(IMarker.LINE_NUMBER, problem.line)
                }
            }
        }
    }
    
    /**
     * Lets all simulation compilers process the given file that can handle it.
     * @param file The file with simulation code that should be compiled
     */
    private def void compileSimulationCode(IFile file) {
        for(simulationCompiler : simulationCompilers) {
            if(simulationCompiler.canCompile(file)) {
                val result = simulationCompiler.compile(file)
                showBuildProblems(result.problems)
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
        for(m : modelCompilers) {
            m.updateDependencies(dependencies, files, resourceSet)
        }
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
//        for(n : dependencies.nodes) { 
//            for(d : n.dependencies) {
//                println(n.id + " ref " + d.id)
//            }
//        }
    }

    private def void checkDependencies() {
        // Check that there are no loops
        val loop = dependencies.findLoop
        if(loop != null) {
            throw new Exception("There is a loop in the dependencies of the models "+loop)
        }
    }
}