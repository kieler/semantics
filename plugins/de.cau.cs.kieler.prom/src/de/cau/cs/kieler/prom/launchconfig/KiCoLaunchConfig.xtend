/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.prom.launchconfig

import com.google.common.base.Charsets
import com.google.common.base.Strings
import com.google.common.io.Files
import de.cau.cs.kieler.kico.CompilationResult
import de.cau.cs.kieler.kico.KielerCompiler
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.kico.KielerCompilerException
import de.cau.cs.kieler.prom.common.ExtensionLookupUtil
import de.cau.cs.kieler.prom.common.FileData
import de.cau.cs.kieler.prom.common.KiCoLaunchData
import de.cau.cs.kieler.prom.common.ModelImporter
import de.cau.cs.kieler.prom.common.PromPlugin
import java.io.File
import java.io.IOException
import java.util.Collections
import java.util.List
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.IResource
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.IStatus
import org.eclipse.core.runtime.Path
import org.eclipse.core.runtime.Status
import org.eclipse.core.runtime.jobs.Job
import org.eclipse.debug.core.ILaunch
import org.eclipse.debug.core.ILaunchConfiguration
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.jdt.core.IClasspathEntry
import org.eclipse.jdt.core.IJavaProject
import org.eclipse.jdt.core.JavaCore
import org.eclipse.jface.viewers.StructuredSelection
import org.eclipse.swt.widgets.Display
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * Implementation of a launch configuration that uses KiCo.
 * 
 * @author aas
 */
class KiCoLaunchConfig extends PromLaunchConfig {

    /**
     * The extension id of this launch config type.
     * It is set in the plugin.xml.
     */
    public static val LAUNCH_CONFIGURATION_TYPE_ID = "de.cau.cs.kieler.prom.launchconfig.kiCoLaunchConfig"

    /**
     * The id for the wrapper code generator extension point.
     */
    public static val WRAPPER_CODE_GENERATOR_EXTENSION_POINT_ID = "de.cau.cs.kieler.prom.wrapperCodeGenerator"

    /**
     * The directory in which compiled output of this launch will be saved per default.
     */
    public static val BUILD_DIRECTORY = "kieler-gen"
    
    // Attribute names
    public static val ATTR_COMMANDS = "de.cau.cs.kieler.prom.launchconfig.commands"
    public static val ATTR_FILES = "de.cau.cs.kieler.prom.launchconfig.files"
    public static val ATTR_ENVIRONMENT = "de.cau.cs.kieler.prom.launchconfig.main.environment"

    // Jobs
    private Job compileJob;
    private Job wrapperCodeJob;

    // Objects loaded from configuration
    @Accessors
    private IProject project

    @Accessors
    private KiCoLaunchData launchData

    // Result of compilation
    @Accessors
    private val List<IFile> compiledFiles = newArrayList()
    @Accessors
    private val List<CompilationResult> compilationResults = newArrayList()

    /**
     * {@inheritDoc}
     */
    override void launch(ILaunchConfiguration configuration, String mode, ILaunch launch,
        IProgressMonitor monitor) throws CoreException {
        
        super.launch(configuration, mode, launch, monitor)
        // Load data object
        launchData = KiCoLaunchData.loadFromConfiguration(configuration)
        launch(launchData)
    }
    
    public def IStatus launch(KiCoLaunchData launchData) {
        this.launchData = launchData
        this.project = findProject(launchData.projectName)
        
        // Init console for errors and messages
        clearConsole()

        if (project != null) {

            // Set variables (e.g. launched_project_loc, main_name, main_loc, ...)
            PromPlugin.setVariables(project.location.toOSString, launchData.mainFile, computeTargetPath(launchData.mainFile, true))

            // Create directory for output if there is none yet
            createBuildDirectory()

            // Create jobs.
            compileJob = getCompileJob()
            wrapperCodeJob = getWrapperCodeGenerationJob()

            // Start jobs.
            compileJob.schedule()
            wrapperCodeJob.schedule()

            // Wait for the jobs to finish.
            compileJob.join()
            wrapperCodeJob.join()
            
            // Proceed only if the other jobs succeded  
            if (compileJob.result.code == IStatus.OK && wrapperCodeJob.result.code == IStatus.OK) {
                // Refresh output directory
                if(!launchData.targetDirectory.isNullOrEmpty()) {
                    project.getFolder(launchData.targetDirectory).refreshLocal(IResource.DEPTH_INFINITE, monitor)
                } else {
                    // Refresh files
                    for(fileData : launchData.files) {
                        val member = project.findMember(fileData.projectRelativePath)
                        if(member.exists) {
                            member.parent.refreshLocal(1, monitor)
                        }
                    }
                }
                
                // Run associated launch shortcut
                runAssociatedLauchShortcut()
                
                // Execute command list
                val commandsJob = getExecuteCommandsJob()
                commandsJob.schedule()
                // Wait for finish
                commandsJob.join()
                
                // Return error of commands
                if(commandsJob.result.code != Status.OK) {
                    return commandsJob.result
                }
            }
        } else {
            val message = "Project of launch configuration '" + configuration.name +
                "' does not exist.\n"
            writeToConsole(message);
                
            return new Status(Status.ERROR, PromPlugin.ID, message)
        }
        
        return Status.OK_STATUS
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
     * Runs the associated launch shortcut on the compiled main file.
     * E.g. one may want to launch a file as "Java Application" after KiCo compilation finished. 
     */
    private def void runAssociatedLauchShortcut() {
        // Nothing to do
        if(launchData.mainFile.isNullOrEmpty() || launchData.associatedLaunchShortcut.isNullOrEmpty()) {
            return;
        }
        
        // Start associated launch shortcut on compiled main file
        val compiledMainPath = new Path(computeTargetPath(launchData.mainFile, true))
        val compiledMainFile = project.getFile(compiledMainPath)
        val selection = new StructuredSelection(compiledMainFile)
        val shortcut = ExtensionLookupUtil.getLaunchShortcut(launchData.associatedLaunchShortcut);
        
        if(shortcut == null) {
            throw new Exception("The associated launch shortcut "+launchData.associatedLaunchShortcut+
                                " for the launch configuration '"+configuration.name +"' could not be instantiated.")
        }
        
        // There is an "invalid thread access" exception if this asyncExec is not used.
        Display.getDefault().asyncExec(new Runnable() {
           override run() {
              shortcut.launch(selection, mode)
           }
       })
    }

    /**
     * Creates a job that compiles a list of FileCompildationData via KiCo.
     * 
     * @return the created job.
     */
    private def Job getCompileJob() {

        return new Job("KiCo Compilation") {
            override protected IStatus run(IProgressMonitor monitor) {

//                val startTime = System.currentTimeMillis()

                try {
                    for (data : launchData.files) {
                        compile(data)
                        
                        if (monitor.isCanceled())
                            return Status.CANCEL_STATUS
                    }
                } catch (Exception e) {
                    // Remove this try-catch to notify the user with a popup window.
                    writeToConsole(e)
                    return Status.CANCEL_STATUS
                }

                // Debug info about duration
//                System.err.println("Compilation finished after " + (System.currentTimeMillis() - startTime) + "ms")

                return Status.OK_STATUS
            }
        }
    }

    /**
     * Creates a job that generates and saves the wrapper code for a list of FileData.
     * 
     * @return the created job. 
     */
    private def Job getWrapperCodeGenerationJob() {
        val launchConfig = this        
        
        return new Job("Wrapper Code Generation") {
            override protected IStatus run(IProgressMonitor monitor) {

//                val startTime = System.currentTimeMillis()

                try {
                    // resolve template path
                    val resolvedWrapperCodeTemplate = PromPlugin.performStringSubstitution(launchConfig.launchData.wrapperCodeTemplate, project)
                    // Create wrapper code
                    val generator = new WrapperCodeGenerator(project, launchData)
                    val wrapperCode = generator.generateWrapperCode(resolvedWrapperCodeTemplate, launchData.files)
                    // Save output
                    val resolvedWrapperCodeTargetLocation = launchConfig.computeTargetPath(resolvedWrapperCodeTemplate, false)
                    Files.write(wrapperCode, new File(resolvedWrapperCodeTargetLocation), Charsets.UTF_8)
                } catch (Exception e) {
                    writeToConsole(e)
                    return Status.CANCEL_STATUS
                }

                // Debug info about duration
//                System.err.println(
//                    "Wrapper Code generation finished after " + (System.currentTimeMillis() - startTime) + "ms")

                return Status.OK_STATUS
            }
        }
    }
    
    /**
     * Creates a job that executes the commands for this launch config successively.
     * 
     * @return the created job.
     */
    private def Job getExecuteCommandsJob() {
        val launchConfig = this
        
        return new Job("Command Execution") {
            
            override protected run(IProgressMonitor monitor) {
                try {
                    val executor = new CommandExecutor(launchConfig)
                    executor.execute(launchData.commands)
                    return Status.OK_STATUS
                } catch (Exception e) {
                    writeToConsole(e)
                    return Status.CANCEL_STATUS
                }
            }
        }
    }

    /**
     * Compile a file via KiCo and save the result.
     * 
     * @param data The file to be compiled
     */
    private def void compile(FileData data) {
        // Load model from file
        val EObject model = ModelImporter.load(project.location.toOSString + File.separator + data.projectRelativePath, true)

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
//            println (compileChain)

            val context = new KielerCompilerContext(compileChain, model)
            context.inplace = false
            context.advancedSelect = true

            // Compile
            val result = KielerCompiler.compile(context)

            // Flush compilation result to target
            if (result.allErrors.isNullOrEmpty() && result.allWarnings.isNullOrEmpty()) {
                val targetLocation = computeTargetPath(data.projectRelativePath, false)
                saveCompilationResult(data, result, targetLocation)
                
                // Remember compilation result
                val targetPath = computeTargetPath(data.projectRelativePath, true)
                compiledFiles += project.getFile(new Path(targetPath))
                compilationResults += result
            } else {
                val errorMessage = "Compilation of '" + data.name + "' failed:\n\n" +
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
    private def void saveCompilationResult(FileData data, CompilationResult result, String targetLocation) {
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
                // Create wrapper code
                val modelName = Files.getNameWithoutExtension(data.name)
                val annotationDatas = WrapperCodeGenerator.getWrapperCodeAnnotationData(project, data)
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
}