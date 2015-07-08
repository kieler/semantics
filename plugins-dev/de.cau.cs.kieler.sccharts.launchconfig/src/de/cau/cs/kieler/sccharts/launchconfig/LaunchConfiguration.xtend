package de.cau.cs.kieler.sccharts.launchconfig

import de.cau.cs.kieler.kico.KielerCompiler
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.sccharts.launchconfig.common.EnvironmentData
import de.cau.cs.kieler.sccharts.launchconfig.common.ModelImporter
import de.cau.cs.kieler.sccharts.launchconfig.common.SCTCompilationData
import freemarker.template.Configuration
import freemarker.template.Template
import freemarker.template.TemplateExceptionHandler
import freemarker.template.Version
import java.io.File
import java.io.FileReader
import java.io.FileWriter
import java.io.PrintWriter
import java.util.List
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.IStatus
import org.eclipse.core.runtime.Path
import org.eclipse.core.runtime.Status
import org.eclipse.core.runtime.jobs.Job
import org.eclipse.core.variables.IStringVariableManager
import org.eclipse.core.variables.VariablesPlugin
import org.eclipse.debug.core.ILaunch
import org.eclipse.debug.core.ILaunchConfiguration
import org.eclipse.debug.core.model.ILaunchConfigurationDelegate
import org.eclipse.emf.ecore.EObject
import org.eclipse.ui.console.ConsolePlugin
import org.eclipse.ui.console.MessageConsole
import org.eclipse.ui.console.MessageConsoleStream

class LaunchConfiguration implements ILaunchConfigurationDelegate {

    // Attribute names
    public static val ATTR_COMPILE_COMMAND = "de.cau.cs.kieler.scchart.launchconfig.execute.command.compile"
    public static val ATTR_DEPLOY_COMMAND = "de.cau.cs.kieler.scchart.launchconfig.execute.command.deploy"
    public static val ATTR_RUN_COMMAND = "de.cau.cs.kieler.scchart.launchconfig.execute.command.run"

    public static val ATTR_SCT_FILES = "de.cau.cs.kieler.scchart.launchconfig.sct.files"

    public static val ATTR_PROJECT = "de.cau.cs.kieler.scchart.launchconfig.main.project"
    public static val ATTR_MAIN_FILE = "de.cau.cs.kieler.scchart.launchconfig.main.file"

    public static val ATTR_USE_ENVIRONMENT = "de.cau.cs.kieler.scchart.launchconfig.main.environment.use"
    public static val ATTR_ENVIRONMENT = "de.cau.cs.kieler.scchart.launchconfig.main.environment"

    public static val ATTR_TARGET_LANGUAGE = "de.cau.cs.kieler.scchart.launchconfig.main.target.language"
    public static val ATTR_TARGET_TEMPLATE = "de.cau.cs.kieler.scchart.launchconfig.main.target.template"
    public static val ATTR_TARGET_LANGUAGE_FILE_EXTENSION = "de.cau.cs.kieler.scchart.launchconfig.main.target.file.extension"

    public static val ATTR_WRAPPER_CODE_TEMPLATE = "de.cau.cs.kieler.scchart.launchconfig.main.wrapper.template"
    public static val ATTR_WRAPPER_CODE_SNIPPETS = "de.cau.cs.kieler.scchart.launchconfig.main.wrapper.snippets"

    public static val BUILD_DIRECTORY = "sct-gen"

    // Variable names
    public static val LAUNCHED_PROJECT_VARIABLE = "launched_project_loc"
    
    public static val MAIN_FILE_NAME_VARIABLE = "main_name"
    public static val MAIN_FILE_PATH_VARIABLE = "main_path"
    public static val MAIN_FILE_LOCATION_VARIABLE = "main_loc"
    public static val MAIN_FILE_NAME_WITHOUT_FILE_EXTENSION_VARIABLE = "main_name_no_ext"

    public static val COMPILED_MAIN_FILE_NAME_VARIABLE = "compiled_main_name"
    public static val COMPILED_MAIN_FILE_PATH_VARIABLE = "compiled_main_path"
    public static val COMPILED_MAIN_FILE_LOCATION_VARIABLE = "compiled_main_loc"
    public static val COMPILED_MAIN_FILE_NAME_WITHOUT_FILE_EXTENSION_VARIABLE = "compiled_main_name_no_ext"

    var IStringVariableManager variableManager

    // Objects from launch
    var ILaunchConfiguration configuration
    var String mode
    var ILaunch launch
    var IProgressMonitor monitor

    // Objects loaded from configuration or environment
    var IProject project
    var String mainFile
    var String targetLanguage
    var String targetTemplate
    var String wrapperCodeTemplate
    var String wrapperCodeSnippetDirectory

    var String compileCommand
    var String deployCommand
    var String runCommand

    var String targetLanguageFileExtension

    // Jobs
    var Job compileJob;
    var Job wrapperCodeJob;

    val CONSOLE_NAME = "SCT Launch"
    var MessageConsole console;
    var MessageConsoleStream consoleStream;

    /**
     * {@inheritDoc}
     */
    override void launch(ILaunchConfiguration configuration, String mode, ILaunch launch,
        IProgressMonitor monitor) throws CoreException {
        this.configuration = configuration
        this.mode = mode
        this.launch = launch
        this.monitor = monitor

        // Init console for errors and messages
        if (console == null || consoleStream == null) {
            console = findConsole(CONSOLE_NAME)
            consoleStream = console.newMessageStream()
        }
        console.clearConsole()

        // Get data from config.
        loadSettingsFromConfiguration()
        
        if (project != null) {
            // Set variables (e.g. launched_project_loc, main_name, main_loc, ...)
            setVariables()
            
            // Create jobs.
            val datas = SCTCompilationData.loadAllFromConfiguration(configuration)
            compileJob = getCompileJob(datas)
            wrapperCodeJob = getWrapperCodeGenerationJob(datas)

            // Start jobs.
            compileJob.schedule()
            wrapperCodeJob.schedule()

            // Wait for the jobs to finish.
            compileJob.join()
            wrapperCodeJob.join()

            // Execute commands only if the other jobs succeded  
            if (compileJob.result.code == IStatus.OK && wrapperCodeJob.result.code == IStatus.OK) {
                getExecuteCommandsJob().schedule()
            }
        } else {
            consoleStream.println("Project of SCT launch configuration '" + configuration.name + "' does not exist.\n");
        }
    }

    /**
     * Creates a job that compiles a list of SCTCompildationData via KiCo.
     * @return the created job.
     */
    private def Job getCompileJob(List<SCTCompilationData> datas) {

        return new Job("SCT Compilation") {
            override protected IStatus run(IProgressMonitor monitor) {

                val startTime = System.currentTimeMillis()

                try {
                    for (data : datas) {
                        compile(data)

                        if (monitor.isCanceled())
                            return Status.CANCEL_STATUS
                    }
                } catch (Exception e) {
                    // Remove this try-catch to notify the user with a popup window.
                    consoleStream.println(e.message + "\n")
                    return Status.CANCEL_STATUS
                }

                System.err.println("Compilation finished after " + (System.currentTimeMillis() - startTime) + "ms")

                return Status.OK_STATUS
            }
        }
    }

    /**
     * Creates a job that generates the wrapper code for a list of SCTCompilationData and saves it.
     * @return the created job. 
     */
    private def Job getWrapperCodeGenerationJob(List<SCTCompilationData> datas) {
        return new Job("SCT Wrapper code generation") {
            override protected IStatus run(IProgressMonitor monitor) {

                val startTime = System.currentTimeMillis()

                try {
                    val generator = new WrapperCodeGenerator(project,
                        variableManager.performStringSubstitution(wrapperCodeTemplate),
                        variableManager.performStringSubstitution(wrapperCodeSnippetDirectory),
                        computeTargetPath(variableManager.performStringSubstitution(wrapperCodeTemplate)))
                        
                    generator.generateWrapperCode(datas)
                    
                } catch (Exception e) {
                    consoleStream.println(e.message + "\n")
                    return Status.CANCEL_STATUS
                }

                System.err.println(
                    "Wrapper Code generation finished after " + (System.currentTimeMillis() - startTime) + "ms")

                return Status.OK_STATUS
            }
        }
    }

    /**
     * Creates a job that executes the commands of the execute tab (compile, deploy and run).
     * @return the created job.
     */
    private def Job getExecuteCommandsJob() {
        return new Job("SCT Execute Commands") {

            override protected run(IProgressMonitor monitor) {

                val commands = #[
                    new Command(compileCommand, "SCT Compile Command"),
                    new Command(deployCommand, "SCT Deploy Command"),
                    new Command(runCommand, "SCT Run Command")
                ]

                try {
                    val executor = new CommandExecutor(project, launch)
                    executor.execute(commands)
                    return Status.OK_STATUS
                } catch (Exception e) {
                    consoleStream.println(e.message + "\n")
                    return Status.CANCEL_STATUS
                }
            }
        }
    }

    /**
     * Compile an sct file via KiCo and save the result.
     */
    private def compile(SCTCompilationData data) {
        // Load model from file
        val EObject model = ModelImporter.get(data.path)

        if (model != null) {
            // Compile sct
            val context = new KielerCompilerContext("T_" + targetLanguage, model)
            context.inplace = false
            context.advancedSelect = true
            val result = KielerCompiler.compile(context)

            // Flush compilation result to target
            if (result.string != null && result.string != "") {
                saveCompilationResult(result.string, computeTargetPath(data.projectRelativePath))
            } else {
                var errorMessage = "Compilation of SCT '" + data.name + "' failed:\n\n" + result.allErrors

                throw new Exception(errorMessage)
            }
        }
    }

    /**
     * Computes the fully qualified target path for a project relative file path.
     * The target path is in the build directory for sct files and in this directory
     * has the same directory structure as the original file in the project.
     * The file extension of the target path is the extension for the current target language.
     */
    private def String computeTargetPath(String projectRelativePath) {
        // The src directory of a typical java project is not part of the relevant target path.
        // (Would be more accurate: if the first directory is a java build source folder, remove it)
        var String projectRelativeRelevantPath;
        if (projectRelativePath.startsWith("src/") || projectRelativePath.startsWith("src\\"))
            projectRelativeRelevantPath = projectRelativePath.substring(4)
        else
            projectRelativeRelevantPath = projectRelativePath

        // Remove extension from path 
        val index = projectRelativeRelevantPath.lastIndexOf(".")
        if (index > -1) {
            projectRelativeRelevantPath = projectRelativeRelevantPath.substring(0, index)
        }

        // Compute fully qualified target path
        return project.location + "/" + BUILD_DIRECTORY + "/" + projectRelativeRelevantPath +
            targetLanguageFileExtension
    }

    /**
     * Saves the result of an SCT compilation to the fully qualified target path
     * possibly using the target template for the output.
     */
    private def saveCompilationResult(String result, String targetPath) {
        // Create directory for the output if none yet.
        createDirectories(targetPath)

        if (targetTemplate != "") {
            // Use template
            val reader = new FileReader(new File(project.location + "/" + variableManager.performStringSubstitution(targetTemplate)))
            val cfg = new Configuration(new Version(2, 3, 0))
            cfg.templateExceptionHandler = TemplateExceptionHandler.RETHROW_HANDLER

            val template = new Template(targetTemplate, reader, cfg)
            val writer = new FileWriter(new File(targetPath))
            template.process(#{"sct_code" -> result}, writer)
            writer.close()

            reader.close()
        } else {
            val writer = new PrintWriter(targetPath, "UTF-8");
            writer.print(result)
            writer.close()
        }
    }

    /**
     * Creates the folder structure for a fully qualified file path.
     * @param path The path to a fully qualified file.
     * @return True if the folder structure for the file exists or could be created. False otherwise.
     */
    private def createDirectories(String path) {
        new File(path).parentFile.mkdirs()
    }

    /**
     * Loads all data needed for compilation from the launch configuration.
     */
    private def loadSettingsFromConfiguration() {
        // Project
        val projectName = configuration.getAttribute(ATTR_PROJECT, "")
        project = findProject(projectName)

        // Main file
        mainFile = configuration.getAttribute(ATTR_MAIN_FILE, "")
        
        // Environment
        val useEnvironment = configuration.getAttribute(ATTR_USE_ENVIRONMENT, false)
        if (useEnvironment) {

            // Load environment data
            val store = LaunchConfigPlugin.^default.preferenceStore
            val environmentName = configuration.getAttribute(ATTR_ENVIRONMENT, "")
            val env = EnvironmentData.loadFromPreferenceStore(store, environmentName)
            if (env != null) {

                // Target
                targetLanguage = env.targetLanguage
                targetTemplate = env.targetTemplate
                targetLanguageFileExtension = env.targetFileExtension

                // Wrapper code
                wrapperCodeTemplate = env.wrapperCodeTemplate
                wrapperCodeSnippetDirectory = env.wrapperCodeSnippetsDirectory

                // Execution
                compileCommand = env.compileCommand
                deployCommand = env.deployCommand
                runCommand = env.runCommand

            } else {
                throw new Exception("Environment " + environmentName + " could not be loaded from preferences.")
            }
        } else {
            // Target
            targetLanguage = configuration.getAttribute(ATTR_TARGET_LANGUAGE, "")
            targetTemplate = configuration.getAttribute(ATTR_TARGET_TEMPLATE, "")
            targetLanguageFileExtension = configuration.getAttribute(ATTR_TARGET_LANGUAGE_FILE_EXTENSION, "")

            // Wrapper code
            wrapperCodeTemplate = configuration.getAttribute(ATTR_WRAPPER_CODE_TEMPLATE, "")
            wrapperCodeSnippetDirectory = configuration.getAttribute(ATTR_WRAPPER_CODE_SNIPPETS, "")

            // Execution
            compileCommand = configuration.getAttribute(ATTR_COMPILE_COMMAND, "")
            deployCommand = configuration.getAttribute(ATTR_DEPLOY_COMMAND, "")
            runCommand = configuration.getAttribute(ATTR_RUN_COMMAND, "")
        }
    }

    /**
     * Sets several string variables for this launch (e.g. ${main_name}, ${compiled_main_name}).
     * The variables can be used for example in the commands and file paths.
     */
    private def setVariables() {
        variableManager = VariablesPlugin.getDefault.stringVariableManager
        
        // Project
        setVariable(LaunchConfiguration.LAUNCHED_PROJECT_VARIABLE, project.location.toOSString,
                "Fully qualified path to the launched SCT application")
        
        // Main file
        val mainFileName = new File(mainFile).name
        val mainFileLocation = if(mainFileName != "") new File(project.location+"/"+mainFile).absolutePath else ""
        val mainFilePath = mainFile
        val mainFileWithoutExtension = stripExtension(new File(mainFile).name)
        setVariable(LaunchConfiguration.MAIN_FILE_NAME_VARIABLE, mainFileName,
                "Name of the main file of the launched SCT application")
        setVariable(LaunchConfiguration.MAIN_FILE_LOCATION_VARIABLE, mainFileLocation,
                "Fully qualified location of the main file of the launched SCT application")
        setVariable(LaunchConfiguration.MAIN_FILE_PATH_VARIABLE, mainFilePath,
                "Project relative path of the main file of the launched SCT application")
        setVariable(LaunchConfiguration.MAIN_FILE_NAME_WITHOUT_FILE_EXTENSION_VARIABLE, mainFileWithoutExtension,
                "Project relative path of the main file of the launched SCT application without file extension")
        
        
        // Compiled main file
        val mainTarget = computeTargetPath(mainFile)
        val mainTargetName = new File(mainTarget).name
        val mainTargetLocation = if(mainTargetName != "") new File(project.location+"/"+mainTarget).absolutePath else ""
        val mainTargetPath = mainTarget
        val mainTargetWithoutExtension = stripExtension(new File(mainTarget).name)
        setVariable(LaunchConfiguration.COMPILED_MAIN_FILE_NAME_VARIABLE, mainTargetName,
                "Name of the compiled main file of the launched SCT application")
        setVariable(LaunchConfiguration.COMPILED_MAIN_FILE_LOCATION_VARIABLE, mainTargetLocation,
                "Fully qualified location of the compiled main file of the launched SCT application")
        setVariable(LaunchConfiguration.COMPILED_MAIN_FILE_PATH_VARIABLE, mainTargetPath,
                "Project relative path of the compiled main file of the launched SCT application")
        setVariable(LaunchConfiguration.COMPILED_MAIN_FILE_NAME_WITHOUT_FILE_EXTENSION_VARIABLE, mainTargetWithoutExtension,
                "Project relative path of the compiled main file of the launched SCT application without file extension")
                
//        setFileVariables("main",
//            #[mainFileName, "Name of the main file of the launched SCT application"],
//            #[mainFileLocation, "Fully qualified location of the main file of the launched SCT application"],
//            #[mainFilePath, "Project relative path of the main file of the launched SCT application"],
//            #[mainFileWithoutExtension, "Project relative path of the main file of the launched SCT application without file extension"]
//        )
    }
    
    /**
     * Creates or modifies the variable with the given name and data. 
     */
    private def setVariable(String name, String value, String description){
        var variable = variableManager.getValueVariable(name)
        if(variable == null){
            variable = variableManager.newValueVariable(name, description, false, value)
            variableManager.addVariables(#[variable])
        }else{
            variable.description = description
            variable.value = value
        }
    }
    
    /**
     * @return The file path without the file extension
     *         or the original path if it does not have an extension. 
     */
    private def stripExtension(String path){
        val index = path.lastIndexOf(".")
        if(index != -1)
            return path.substring(0, index)
        else 
            return path
    }

    /**
     * Returns a project handle if the project name is a valid name for a project
     * and the project exists in the current workspace.
     */
    static def IProject findProject(String name) {
        if (name != null && name != "" && new Path(name).isValidPath(name)) {
            val p = ResourcesPlugin.workspace.root.getProject(name)
            if (p.location != null)
                return p
        }
        return null
    }

    /**
     * Search for a console with a given name in the Console View.
     * If the console can't be found it will be created.
     */
    private def MessageConsole findConsole(String name) {
        val plugin = ConsolePlugin.getDefault();
        val conMan = plugin.getConsoleManager();
        val existing = conMan.getConsoles();
        for (var i = 0; i < existing.length; i++)
            if (name.equals(existing.get(i).getName()))
                return existing.get(i) as MessageConsole;

        // No console found, so create a new one.
        val myConsole = new MessageConsole(name, null);
        conMan.addConsoles(#[myConsole]);
        return myConsole;
    }
}
