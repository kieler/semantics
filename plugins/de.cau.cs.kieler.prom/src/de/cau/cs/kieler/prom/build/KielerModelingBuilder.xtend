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

import de.cau.cs.kieler.prom.ModelImporter
import de.cau.cs.kieler.prom.PromPlugin
import de.cau.cs.kieler.prom.build.compilation.ModelCompiler
import de.cau.cs.kieler.prom.build.simulation.SimulationCompiler
import de.cau.cs.kieler.prom.build.templates.SimulationTemplateProcessor
import de.cau.cs.kieler.prom.build.templates.TemplateProcessor
import de.cau.cs.kieler.prom.build.templates.WrapperCodeTemplateProcessor
import de.cau.cs.kieler.prom.configurable.AttributeExtensions
import de.cau.cs.kieler.prom.kibuild.BuildConfiguration
import de.cau.cs.kieler.prom.kibuild.extensions.KiBuildExtensions
import de.cau.cs.kieler.prom.templates.ModelAnalyzer
import java.util.ArrayList
import java.util.List
import java.util.Map
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IFolder
import org.eclipse.core.resources.IMarker
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.IResource
import org.eclipse.core.resources.IResourceDelta
import org.eclipse.core.resources.IResourceDeltaVisitor
import org.eclipse.core.resources.IncrementalProjectBuilder
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.Path
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.resource.XtextResourceSet

import static de.cau.cs.kieler.prom.FileExtensions.*

/**
 * The kieler modeling builder has three main tasks:
 *   1. compile model files using ModelCompiler
 *   2. process templates. These are either simple templates, wrapper code templates or simulation code templates
 *   3. compile generated simulation code to executables
 * 
 * @author aas
 * 
 */
class KielerModelingBuilder extends IncrementalProjectBuilder {
    
    /**
     * Id of the builder, which is specified in the plugin.xml
     */
    public static val String BUILDER_ID = "de.cau.cs.kieler.prom.KielerModelingBuilder"; 
    
    /**
     * The id for the markers, which is specified in the plugin.xml
     */
    public static val String PROBLEM_MARKER_TYPE = "kieler.modeling.builder.problem"
    
    /**
     * Extension methods to work with kibuild files
     */
    extension KiBuildExtensions kiBuildExtensions 
    /**
     * Extension methods to work with configurable attributes
     */
    extension AttributeExtensions attributeExtensions 

    /**
     * The file handle from which the build config was loaded
     */
    private var IFile buildConfigFile
    /**
     * The loaded build config
     */
    private var BuildConfiguration buildConfig
    /**
     * The loaded model compilers.
     */
    private var List<ModelCompiler> modelCompilers = newArrayList
    /**
     * The loaded simulation compilers.
     */
    private var List<SimulationCompiler> simulationCompilers = newArrayList
    /**
     * The loaded template processors.
     */
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
    private DependencyGraph dependencyGraph;
    
    /**
     * Flag to indicate that this incremental build should be aborted,
     * because a full build is done instead.
     */
    @Accessors
    private boolean abortIncrementalBuild
    
    /**
     * Creates a marker for a file in the Eclipse workspace.
     * 
     * @param res The resource that gets the marker
     * @param message The message of the marker 
     */
    private static def IMarker createMarker(IResource res, String message) {
        val marker = res.createMarker(PROBLEM_MARKER_TYPE)
        marker.setAttribute(IMarker.LINE_NUMBER, 1);
        marker.setAttribute(IMarker.MESSAGE, message);
        marker.setAttribute(IMarker.LOCATION, res.projectRelativePath.toOSString);
        return marker
    }
    
    /**
     * Creates a warning marker for a file in the Eclipse workspace.
     * 
     * @param res The resource that gets the marker
     * @param message The message of the marker
     */
    public static def IMarker createWarningMarker(IResource res, String message) {
        val marker = createMarker(res, message)
        marker.setAttribute(IMarker.PRIORITY, IMarker.PRIORITY_HIGH);
        marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_WARNING);
        return marker
    }
    
    /**
     * Creates an error marker for a file in the Eclipse workspace.
     * 
     * @param res The resource that gets the marker
     * @param message The message of the marker
     */
    public static def IMarker createErrorMarker(IResource res, String message) {
        val marker = createMarker(res, message)
        marker.setAttribute(IMarker.PRIORITY, IMarker.PRIORITY_HIGH);
        marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_ERROR);
        return marker
    }
    
    /**
     * Shows the given problem using error/warning markers.
     * 
     * @param problems The build problems
     */
    public static def void showBuildProblems(BuildProblem... problems) {
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
     * Constructor
     */
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
        
        try {
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
        } catch(Exception e) {
            // Show any exception as error marker on the project or build configuration
            val res = if(buildConfigFile !== null)
                          buildConfigFile
                      else
                          project
            val problem = BuildProblem.createError(res, e)
            showBuildProblems(problem)
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
    
    /**
     * Perform an incremental build of the given files, which changed since the last build.
     */
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
                    if(res.type == IResource.FILE && res.fileExtension !== null && res.exists) {
                        val file = res as IFile
                        if(isModel(file)) {
                            changedModels.add(file)
                        } else if(isTemplate(file)) {
                            changedTemplates.add(file)
                        } else if(isBuildConfiguration(file)) {
                            // The configuration changed: Do a full build instead of an incremental build
                            abortIncrementalBuild = true
                            fullBuild
                            // No need to check further files, because we do a full build
                            return false
                        }
                    } else if(res.type == IResource.FOLDER) {
                        // Ignore files that were copied to bin folder by eclipse 
                        if(res.name.toLowerCase == "bin") {
                            return false
                        }
                        if(!res.exists && isOutputFolder(res as IFolder)) {
                            // Do a full build if the output folder was deleted
                            abortIncrementalBuild = true
                            fullBuild
                            return false
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
    
    /**
     * Starts all registered template processors.
     */
    private def void processAllTemplates() {
        processTemplates(null)
    }
    
    /**
     * Checks whether the given folder is the output folder of a model compiler.
     * 
     * @return true if the folder is an output folder of a model compiler.
     */
    private def boolean isOutputFolder(IFolder folder) {
        if(buildConfig === null) {
            initialize
        }
        if(buildConfig !== null) {
            for(modelCompiler : modelCompilers) {
                val outputFolder = project.getFolder(new Path(modelCompiler.outputFolder.stringValue))
                if(outputFolder == folder) {
                    return true
                }
            }
        }
        return false
    }
    
    /**
     * Starts the registered template processors that handle the given files,
     * or all template processors if the given list is null.
     * 
     * @param files The template files, which should be processed, or null to build all
     */
    private def void processTemplates(List<IFile> files) {
        monitor.subTask("Processing templates")
        for(templateProcessor : templateProcessors) {
            if(!monitor.isCanceled) {
                val templateFile = project.getFile(templateProcessor.template.stringValue)
                var templateForChangedFile = false
                if(files != null) {
                    // Check if the template of this processor changed
                    for(changedTemplate : files) {
                        // Is this processor for this template?
                        if(templateFile == changedTemplate) {
                            templateForChangedFile = true
                        }
                    }
                }
                // Process the template
                if(files == null || templateForChangedFile) {
                    process(templateProcessor)
                }
            }
        }
    }
    
    /**
     * Process the template of the template processor.
     * 
     * @param templateProcessor the template processor
     */
    private def void process(TemplateProcessor templateProcessor) {
        if(!monitor.isCanceled) {
            monitor.subTask("Processing template '"+templateProcessor.template.stringValue+"'")
            val result = templateProcessor.process
            showBuildProblems(result.problems)
            // Compile created simulation files
            if(templateProcessor instanceof SimulationTemplateProcessor) {
                for(f : result.createdFiles) {
                    compileSimulationCode(f)
                }
            }
        }
    }
    
    /**
     * Build the given files
     * 
     * @param files The list of files to be built
     */
    private def void buildModels(List<IFile> files) {
        if(files.isNullOrEmpty) {
            return
        }
        
        // Remember which file correspods to which model, to load them only once
        val modelForFile = <String, EObject>newHashMap
        
        // Load changed models into resource set and update their dependencies.
        for(file : files) {
            // Reload the model in the resource set
            reload(file)
            // Get the model
            if(!monitor.isCanceled) {
                monitor.subTask("Loading model "+file.name)
                val model = loadModel(file)
                // Remember the model for this file
                modelForFile.put(file.fullPath.toOSString, model)
                // Update the dependencies
                updateDependencies(model, file)
            }
        }
        
        if(!monitor.isCanceled) {
            // Get topological sort of the dependency graph and mark the files that should be built (including depending files)
            monitor.subTask("Calculating dependencies")
            checkDependencies
            val topologicalSort = dependencyGraph.getTopologicalSort(files)
//            System.err.println("topological sort: "+topologicalSort)
            
            // Build the files
            for(node : topologicalSort) {
                if(!monitor.isCanceled) {
                    if(node.shouldBeBuilt) {
                        val file = node.file
                        var model = modelForFile.get(file.fullPath.toOSString)
                        if(model == null) {
                            // The model was not yet loaded,
                            // thus it is a model which is built because it depends on some already built model.
                            reload(file)
                            model = loadModel(file)
                        }
                        buildModel(model, file)
                    }
                }
            }
        }
    }

    /**
     * Reloads the model in the given file into the resource set.
     * 
     * @param file The file
     */
    private def void reload(IFile file) {
        if(!monitor.isCanceled) {
            monitor.subTask("Reloading resource "+ file.name)
            val res = ModelImporter.getResource(file, resourceSet)
            ModelImporter.reload(res, resourceSet)
        }
    }
    
    /**
     * Loads the model from the given file.
     * 
     * @param file The file
     * @return the EObject that is saved in the file
     */
    private def EObject loadModel(IFile file) {
        if(!monitor.isCanceled) {
            monitor.subTask("Loading model "+ file.name)
            val model = ModelImporter.getEObject(file, resourceSet)
            if(model == null) {
                throw new Exception("Couldn't load model "+file.name)
            }
            return model
        }
    }

    /**
     * Builds the model using the loaded model compilers and simulation compilers.
     * 
     * @param model The model
     * @param file The file of the model
     */
    private def void buildModel(EObject model, IFile file) {
        if(!monitor.isCanceled) {
            // Remove all warnings and errors from a previous build.
            deleteMarkers(file)
            // Compile model
            for(modelCompiler : modelCompilers) {
                monitor.subTask("Compiling model '"+file.name+ "' using "+modelCompiler)
                val result = modelCompiler.compile(file, model)
                // Show problems of result
                showBuildProblems(result.problems)
                if(result.simulationGenerationResult != null) {
                    showBuildProblems(result.simulationGenerationResult.problems)
                }
                // Compile simulation code
                for(simFile : result.createdSimulationFiles) {
                    compileSimulationCode(simFile)
                }
            }
        }
    }
    
    /**
     * Updates the dependencies of the model.
     * 
     * @param model The model containing references
     * @param modelFile The file in which the model is saved
     */
    private def void updateDependencies(EObject model, IFile modelFile) {
        val node = dependencyGraph.getOrCreate(modelFile)
        val modelAnalyzer = ModelAnalyzer.analyzers.findFirst[it.isSupported(model)]
        if(modelAnalyzer != null) {
            val dependencies = modelAnalyzer.getDependencies(model)
            if(dependencies != null) {
                // Remove old dependencies of the model
                node.removeAllDependencies
                // Add new dependencies of the model
                for(dependency : dependencies) {
                    val dependencyNode = dependencyGraph.getOrCreate(dependency)
                    node.addDependency(dependencyNode)
                }
            }
        }
        
        // Check consistency of the graph
        checkDependencies
    }

    /**
     * Cleans the project.
     * Removes all markers and re-initialzes this builder.
     */
    private def void clean() {
        initialize
        // Delete all generated files
        for(compiler : modelCompilers) {
            compiler.clean
        }
        for(simCompiler : simulationCompilers) {
            simCompiler.clean
        }
        for(processor : templateProcessors) {
            processor.clean
        }
        // Delete all markers
        deleteMarkers(project)
        // Re-initialize
        isInitialized = false
        createResourceSet
    }

    /**
     * Initialize this builder.
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
                buildConfigFile = project.getFile(configFilePath)
                val model = ModelImporter.load(buildConfigFile)
                if(model !== null && model instanceof BuildConfiguration) {
                        initializeConfiguration(model as BuildConfiguration)
                } else {
                    throw new Exception("Build configuration '" + buildConfigFile.projectRelativePath + "' could not be loaded")
                }
            } catch (Exception e) {
                createErrorMarker(project, e.message)
            }
        }
        
        if(!isInitialized) {
            isInitialized = true
            createResourceSet
        }
    }
    
    /**
     * Configures this instance using the given configuration.
     * Loads the model compiler, template processors and simulation compilers.
     * 
     * @param buildConfig The configuration
     */
    private def void initializeConfiguration(BuildConfiguration buildConfig) {
        // Update attributes
        this.buildConfig = buildConfig
        this.updateConfigurableAttributes(buildConfig.attributes)
        
        // Create model compilers
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
     * 
     * @return the list of model files that can be built
     */ 
    private def List<IFile> findModelFilesInProject() {
        // Search for models in project
        val membersWithoutBinDirectory = project.members.filter[it.name != "bin"]
        return PromPlugin.findFiles(membersWithoutBinDirectory, null as List<String>).filter[isModel(it)].toList
    }
    
    
    
    /**
     * Deletes all kieler modeling builder problems from the given resource and all its contained resources.
     * 
     * @param res The resource
     */
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
    
    /**
     * Lets all simulation compilers process the given file that can handle it.
     * 
     * @param file The file with simulation code that should be compiled
     */
    private def void compileSimulationCode(IFile file) {
        if(!monitor.isCanceled) {
            for(simulationCompiler : simulationCompilers) {
                if(simulationCompiler.canCompile(file)) {
                    monitor.subTask("Compiling simulation code "+file.name)
                    val result = simulationCompiler.compile(file)
                    showBuildProblems(result.problems)
                }
            }
        }
    }
    
    /**
     * Re-link all XtextResources in the resource set to find references. 
     * 
     * @param path The path to a fully qualified file
     * @deprecated since the Xtext nature is not required anymore for SCCharts, there in no need to relink
     */
    private def void relink(ResourceSet resourceSet) {
        for(res : resourceSet.resources) {
            if(!monitor.isCanceled) {
                if(res instanceof XtextResource) {
                    monitor.subTask("Linking resource "+res.URI.lastSegment)
                    res.relink()
                }
            }
        }
    }

    /**
     * Creates a fresh resource set with all models files in the project and updates their dependencies.
     */
    private def void createResourceSet() {
        // Create resource set
        resourceSet = new XtextResourceSet()
        // Load all model files into one resource set.
        
        // Update dependencies
        createDependencyGraph
    }

    /**
     * Creates a dependency graph for all models in the current resource set.
     */
    private def void createDependencyGraph() {
        // Create new dependency graph
        dependencyGraph = new DependencyGraph()
        // Check dependencies (e.g. no cycles)
        checkDependencies
    }

    /**
     * Checks the dependency graph for consistency.
     * Ensures that there are no cyclic dependencies.
     */
    private def void checkDependencies() {
        // Check that there are no loops
        val loop = dependencyGraph.findLoop
        if(loop != null) {
            throw new Exception("There is a loop in the dependencies of the models "+loop)
        }
    }
}
