package de.cau.cs.kieler.sccharts.launchconfig

import de.cau.cs.kieler.kico.KielerCompiler
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.sccharts.text.sct.SctStandaloneSetup
import freemarker.template.Configuration
import freemarker.template.Template
import freemarker.template.TemplateException
import freemarker.template.TemplateExceptionHandler
import freemarker.template.Version
import java.io.File
import java.io.FileReader
import java.io.FileWriter
import java.io.IOException
import java.io.PrintWriter
import java.util.ArrayList
import java.util.List
import java.util.regex.Pattern
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.IStatus
import org.eclipse.core.runtime.Path
import org.eclipse.core.runtime.Status
import org.eclipse.core.runtime.jobs.Job
import org.eclipse.core.variables.VariablesPlugin
import org.eclipse.debug.core.DebugPlugin
import org.eclipse.debug.core.ILaunch
import org.eclipse.debug.core.ILaunchConfiguration
import org.eclipse.debug.core.model.ILaunchConfigurationDelegate
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl

class LaunchConfiguration implements ILaunchConfigurationDelegate {

    public static val ATTR_COMPILE_COMMAND = "de.cau.cs.kieler.scchart.launchconfig.execute.command.compile"
    public static val ATTR_DEPLOY_COMMAND = "de.cau.cs.kieler.scchart.launchconfig.execute.command.deploy"
    public static val ATTR_RUN_COMMAND = "de.cau.cs.kieler.scchart.launchconfig.execute.command.run"

    public static val ATTR_SCT_FILES = "de.cau.cs.kieler.scchart.launchconfig.sct.files"

    public static val ATTR_PROJECT = "de.cau.cs.kieler.scchart.launchconfig.main.project"
    public static val ATTR_TARGET_LANGUAGE = "de.cau.cs.kieler.scchart.launchconfig.main.target.language"
    public static val ATTR_TARGET_TEMPLATE = "de.cau.cs.kieler.scchart.launchconfig.main.target.template"

    public static val ATTR_WRAPPER_CODE_TEMPLATE = "de.cau.cs.kieler.scchart.launchconfig.main.wrapper.template"
    public static val ATTR_WRAPPER_CODE_OUTPUT = "de.cau.cs.kieler.scchart.launchconfig.main.wrapper.output"
    public static val ATTR_WRAPPER_CODE_SNIPPETS = "de.cau.cs.kieler.scchart.launchconfig.main.wrapper.snippets"

    public static val BUILD_DIRECTORY = "sct-gen"

    // Objects from launch
    var ILaunchConfiguration configuration
    var String mode
    var ILaunch launch
    var IProgressMonitor monitor

    // Objects loaded from configuration
    var IProject project
    var String targetLanguage
    var String targetTemplate
    var String wrapperCodeTemplate
    var String wrapperCodeTarget
    var String wrapperCodeSnippetDirectory

    // Variables to check if the compilation and code generation ended successfully
    var compilationHadError = false
    var compilationCompletedSuccessful = false
    
    var wrapperCodeGenerationHadError = false
    var wrapperCodeGenerationCompletedSuccessful = false

    /**
     * {@inheritDoc}
     */
    override void launch(ILaunchConfiguration configuration, String mode, ILaunch launch,
        IProgressMonitor monitor) throws CoreException {
        this.configuration = configuration
        this.mode = mode
        this.launch = launch
        this.monitor = monitor

        // Get data from config
        loadSettingsFromConfiguration()
        if (project == null) {
            println("Project of SCT launch configuration '" + configuration.name + "' does not exist.")
        }

        // Compile SCT files
        val datas = SCTCompilationData.loadAllFromConfiguration(configuration)
        compile(datas)
        generateWrapperCode(datas)
    }

    /**
     * Loads all data needed for compilation from the launch configuration.
     */
    private def loadSettingsFromConfiguration() {
        // Project
        val projectName = configuration.getAttribute(ATTR_PROJECT, "")
        project = findProject(projectName)

        // Target
        targetLanguage = configuration.getAttribute(ATTR_TARGET_LANGUAGE, "")
        targetTemplate = configuration.getAttribute(ATTR_TARGET_TEMPLATE, "")

        // Wrapper code
        wrapperCodeTarget = configuration.getAttribute(ATTR_WRAPPER_CODE_OUTPUT, "")
        wrapperCodeTemplate = configuration.getAttribute(ATTR_WRAPPER_CODE_TEMPLATE, "")
        wrapperCodeSnippetDirectory = configuration.getAttribute(ATTR_WRAPPER_CODE_SNIPPETS, "")
    }

    /**
     * Compiles a list of SCTCompildationData.
     * The compilation is done in a new job.
     */
    private def void compile(List<SCTCompilationData> datas) {
        val job = new Job("SCT Compilation") {
            override protected IStatus run(IProgressMonitor monitor) {
                for (data : datas) {
                    compile(data)

                    if (monitor.isCanceled())
                        return Status.CANCEL_STATUS
                }
                
                // Execute commands if both jobs completed successful
                if(!compilationHadError){
                    compilationCompletedSuccessful = true
                    executeCommands()
                }
                
                return Status.OK_STATUS
            }
        }
        job.schedule()
    }

    /**
     * Compile an sct file via KiCo and save result.
     */
    private def compile(SCTCompilationData data) throws IllegalArgumentException{
        // Load model from file
        val EObject model = loadModelFromFile(data.path)

        if (model != null) {
            // Compile sct
            val context = new KielerCompilerContext("T_" + targetLanguage, model)
            val result = KielerCompiler.compile(context)

            // Flush compilation result to target
            if (result != null && result.string != null) {
                saveCompilationResult(result.string, computeTargetPath(data.projectRelativePath))
            } else {
                println("Compilation of SCT '" + data.name + "' failed:\n" + result.allErrors)
                compilationHadError = true
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
        // Remove extension from path 
        var projectRelativePathWithoutExtension = projectRelativePath
        val index = projectRelativePath.lastIndexOf(".")
        if (index > -1) {
            projectRelativePathWithoutExtension = projectRelativePath.substring(0, index)
        }
        
        // Compute fully qualified target path
        return project.location + "/" + BUILD_DIRECTORY + "/" + projectRelativePathWithoutExtension +
            getTargetLanguageExtension()
    }

    /**
     * Get the file extension for the specified target language (e.g. ".java" for Java Code).
     */
    private def String getTargetLanguageExtension() {
        // The target code feature of KiCo has the scheme s.java or s.c
        // Thus we return everything after and including the dot.
        val index = targetLanguage.lastIndexOf(".")
        if (index > -1) {
            return targetLanguage.substring(index)
        }
        return targetLanguage
    }

    /**
     * Saves the result of an SCT compilation to the fully qualified target path.
     */
    private def saveCompilationResult(String result, String targetPath) {
        // Create directory for the output if none yet.
        // If the directory can't be created we can't go on.
        if (createDirectories(targetPath) == false)
            return;

        if (targetTemplate != null && targetTemplate != "") {
            // Use template
            try {
                val reader = new FileReader(new File(project.location + "/" + targetTemplate))
                val cfg = new Configuration(new Version(2, 3, 0))
                cfg.templateExceptionHandler = TemplateExceptionHandler.RETHROW_HANDLER

                val template = new Template("tmp", reader, cfg)
                val writer = new FileWriter(new File(targetPath))
                try {
                    template.process(#{"sct_code" -> result}, writer)
                } catch (TemplateException e) {
                    e.printStackTrace()
                }
                reader.close()
                writer.close()
            } catch (Exception e) {
                println("Error while saving compilation result with template.")
                e.printStackTrace()
            }
        } else {
            try {
                // Write directly to file
                val writer = new PrintWriter(targetPath, "UTF-8");
                writer.print(result)
                writer.close()
            } catch (Exception e) {
                println("Error while saving compilation.")
                e.printStackTrace()
            }
        }
    }

    /**
     * Creates the folder structure for a fully qualified file path.
     * @param path The path to a fully qualified file.
     * @return True if the folder structure for the file exists or could be created. False otherwise.
     */
    private def boolean createDirectories(String path) {
        try {
            new File(path).parentFile.mkdirs()
            return true
        } catch (Exception e) {
            println("Could not create directories for path '" + path + "'.")
            e.printStackTrace()
            return false
        }
    }

    /**
     * Loads an EObject from a file path.
     * @param fullPath The fully qualified path to the file.
     */
    private def EObject loadModelFromFile(String fullPath) {
        try {
            val input = URI.createFileURI(fullPath);

            val rInjector = new SctStandaloneSetup().createInjectorAndDoEMFRegistration();
            if (rInjector != null) {
                val resourceSet = rInjector.getInstance(typeof(ResourceSet));
                val resourceLoad = resourceSet.getResource(input, true);
                return resourceLoad.getContents().get(0);
            } else {
                // Try to load SCCharts model
                val inputResource = new XMIResourceImpl(input);
                // Load SCCharts model
                try {
                    inputResource.load(null);
                    return inputResource.getContents().get(0);
                } catch (IOException e) {
                    println("Could not load SCChart as an XMIResource.")
                    return null
                }
            }
        } catch (Exception e) {
            e.printStackTrace()
            return null
        }
    }

    /**
     * Generates the wrapper code for a list of SCTCompilationData and saves it. 
     */
    private def void generateWrapperCode(List<SCTCompilationData> datas) {
        val job = new Job("SCT Wrapper code generation") {
            override protected IStatus run(IProgressMonitor monitor) {
                for (data : datas) {
                    generateWrapperCode(data)
                    
                    if (monitor.isCanceled())
                        return Status.CANCEL_STATUS
                }
                
                // Execute commands if both jobs completed successful
                if(!wrapperCodeGenerationHadError){
                    wrapperCodeGenerationCompletedSuccessful = true
                    executeCommands()
                }
                    
                return Status.OK_STATUS
            }
        }
        job.schedule()
    }

    /**
     * Generates wrapper code with the settings from the launch configuration.
     * This is done independently from the sct compilation in a separate job.
     */
    private def generateWrapperCode(SCTCompilationData data) {
        
    }

    /**
     * Executes the commands of the execute tab (compile, deploy and run).
     * The commands are only executed if the sct compilation
     * and wrapper code creation finished without errors.
     */
    private def executeCommands() {
        // NOTE: As this method is called from two threads it is possible
        // that the commands are executed twice.
        // The scheduler might make a context switch after the
        // ...CompletedSuccessful variables are set to true.
        if(compilationCompletedSuccessful && wrapperCodeGenerationCompletedSuccessful){
            execCommand(configuration.getAttribute(ATTR_COMPILE_COMMAND, ""), "Compile Command")
            execCommand(configuration.getAttribute(ATTR_DEPLOY_COMMAND, ""), "Deploy Command")
            execCommand(configuration.getAttribute(ATTR_RUN_COMMAND, ""), "Run Command")    
        }
    }

    /**
     * Executes a command via OS.
     * The command may contain arguments separated by spaces.
     * Double quotes (") can be use to handle a command or argument with spaces as one entity.
     * The created process gets a console in the Console View to fetch its output.
     */
    private def execCommand(String cmdLine, String consoleLabel) {
        if (cmdLine != null && cmdLine != "") {
            try {
                val man = VariablesPlugin.getDefault.stringVariableManager
                val fullCommand = man.performStringSubstitution(cmdLine)

                val commandWithParameters = splitStringOnWhitespace(fullCommand)
                println(fullCommand)
                println(commandWithParameters)

                // Run process
                val p = new ProcessBuilder(commandWithParameters).start()

                // val p = Runtime.getRuntime().exec(fullCommand)
                DebugPlugin.newProcess(launch, p, consoleLabel)
            } catch (Exception e) {
                println("Error running command '" + cmdLine + "'")
                e.printStackTrace()
            }
        }
    }

    /**
     * Split input string on spaces, except if between double quotes ("hello world" would be one token.)
     * Surrounding double quotes are removed.
     * @return List<String> containing slices of the input string.
     */
    private def List<String> splitStringOnWhitespace(String str) {
        // Code from
        // http://stackoverflow.com/questions/7804335/split-string-on-spaces-except-if-between-quotes-i-e-treat-hello-world-as
        val list = new ArrayList<String>();
        val m = Pattern.compile("([^\"]\\S*|\".+?\")\\s*").matcher(str);
        while (m.find()) {
            // .replace(...) is to remove surrounding qoutes
            list.add(m.group(1).replace("\"", ""))
        }
        return list
    }

    /**
     * Returns a proejct handle if the project name is a valid name for a project
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

}
