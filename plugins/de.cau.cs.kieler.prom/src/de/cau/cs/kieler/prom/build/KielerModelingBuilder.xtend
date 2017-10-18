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

import de.cau.cs.kieler.prom.KiBuildExtensions
import de.cau.cs.kieler.prom.ModelImporter
import de.cau.cs.kieler.prom.PromPlugin
import de.cau.cs.kieler.prom.build.compilation.ModelCompiler
import de.cau.cs.kieler.prom.build.simulation.SimulationCompiler
import de.cau.cs.kieler.prom.build.templates.SimulationTemplateProcessor
import de.cau.cs.kieler.prom.build.templates.TemplateProcessor
import de.cau.cs.kieler.prom.build.templates.WrapperCodeTemplateProcessor
import de.cau.cs.kieler.prom.configurable.AttributeExtensions
import de.cau.cs.kieler.prom.kibuild.BuildConfiguration
import de.cau.cs.kieler.prom.templates.ModelAnalyzer
import java.util.ArrayList
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
                    if(res.type == IResource.FILE && res.fileExtension != null && res.exists) {
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
    
    /**
     * Starts all registered template processors.
     */
    private def void processAllTemplates() {
        processTemplates(null)
    }
    
    /**
     * Starts the registered template processors that handle the given files,
     * or all template processors if the given list is null.
     * 
     * @param files The template files, which should be processed, or null to build all
     */
    private def void processTemplates(List<IFile> files) {
        // Collection of all created simulation files
        val List<IFile> createdSimulationFiles = newArrayList
        
        monitor.subTask("Processing templates")
        for(templateProcessor : templateProcessors) {
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
     * Build the given files
     * 
     * @param files The list of files to be built
     */
    private def void buildModels(List<IFile> files) {
        if(files.isNullOrEmpty) {
            return
        }
        
        // Load changed models into resource set.
        // But only if this is not a full build because in a full build this is done in the initialization.
        if(kind != FULL_BUILD) {
            for(f : files) {
                if(!monitor.isCanceled) {
                    monitor.subTask("Loading resource "+f.name)
                    val res = ModelImporter.getResource(f, resourceSet)
                    ModelImporter.reload(res, resourceSet)
                }
            }
            // Re-link all models 
            // Not needed since the Xtext nature is not required anymore for SCCharts
//                relink(resourceSet)
        }

        // Compile using the registered model compilers
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
                        for(simFile : result.createdSimulationFiles) {
                            compileSimulationCode(simFile)
                        }
                    }
                }
                
                // Find dependencies
                updateDependencies(model, file)
                
                // Build depending files recursively
                buildDependingFiles(model, file)
            }
        }
    }

    /**
     * Builds the files that reference the given model.
     * 
     * @param model The model that is referenced
     * @param modelFile The file in which the model is saved
     */
    private def void buildDependingFiles(EObject model, IFile modelFile) {
        val node = dependencyGraph.getOrCreate(modelFile)
        val dependingFiles = <IFile> newArrayList
        for(dependingNode : node.depending) {
            val dependingFile = dependingNode.content
            if(dependingFile != null && dependingFile instanceof IFile) {
                dependingFiles.add(dependingFile as IFile)
            }
        }
        if(!dependingFiles.isNullOrEmpty) {
//            System.err.println("Building depending files:"+dependingFiles)
            buildModels(dependingFiles) 
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
    
    /**
     * Configures this instance using the given configuration.
     * Loads the model compiler, template processors and simulation compilers.
     * 
     * @param buildConfig The configuration
     */
    private def void initializeConfiguration(BuildConfiguration buildConfig) {
        // Update attributes
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
        for(simulationCompiler : simulationCompilers) {
            if(simulationCompiler.canCompile(file)) {
                val result = simulationCompiler.compile(file)
                showBuildProblems(result.problems)
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
        
        // Since the Xtext nature is not required anymore for SCCharts,
        // there in no need to collect all models in one resource set and to relink.
//        val modelFiles = findModelFilesInProject()
//        for(f : modelFiles) {
//            monitor.subTask("Loading "+f.name)
//            ModelImporter.getResource(f, resourceSet)
//        }
        // Relink loaded resources, because all potentially referenced models are in the resource set now.
//        relink(resourceSet)

        // Update dependencies
        createDependencyGraph
        // Check dependencies for validation
        checkDependencies
    }

    /**
     * Creates a dependency graph for all models in the current resource set.
     */
    private def void createDependencyGraph() {
        // Create new dependency graph
        dependencyGraph = new DependencyGraph()
        // Print out dependencies
//        for(n : dependencies.nodes) { 
//            for(d : n.dependencies) {
//                println(n.id + " ref " + d.id)
//            }
//        }
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
