package de.cau.cs.kieler.sccharts.launchconfig

import com.google.common.io.Files
import de.cau.cs.kieler.freemarker.FreeMarkerPlugin
import de.cau.cs.kieler.kico.KielerCompiler
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.text.sct.SctStandaloneSetup
import freemarker.template.Configuration
import freemarker.template.Template
import freemarker.template.TemplateExceptionHandler
import freemarker.template.Version
import java.io.File
import java.io.FileFilter
import java.io.FileReader
import java.io.FileWriter
import java.io.PrintWriter
import java.io.StringWriter
import java.util.ArrayList
import java.util.HashMap
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

import static de.cau.cs.kieler.freemarker.FreeMarkerPlugin.*
import static de.cau.cs.kieler.sccharts.launchconfig.LaunchConfiguration.*

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

    var String compileCommand
    var String deployCommand
    var String runCommand

    // Variables to check if the compilation and code generation ended successfully
    var boolean compilationCompletedSuccessful
    var boolean wrapperCodeGenerationCompletedSuccessful

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
        if (project != null) {
            // Compile SCT files
            val datas = SCTCompilationData.loadAllFromConfiguration(configuration)
            compile(datas)
            generateWrapperCode(datas)
        } else {
            println("Project of SCT launch configuration '" + configuration.name + "' does not exist.")
        }
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

        // Execution
        compileCommand = configuration.getAttribute(ATTR_COMPILE_COMMAND, "")
        deployCommand = configuration.getAttribute(ATTR_DEPLOY_COMMAND, "")
        runCommand = configuration.getAttribute(ATTR_RUN_COMMAND, "")
    }

    /**
     * Compiles a list of SCTCompildationData via KiCo.
     * The compilation is done in a new job.
     */
    private def void compile(List<SCTCompilationData> datas) {

        compilationCompletedSuccessful = false

        val job = new Job("SCT Compilation") {
            override protected IStatus run(IProgressMonitor monitor) {

                for (data : datas) {
                    compile(data)

                    if (monitor.isCanceled())
                        return Status.CANCEL_STATUS
                }

                // If an exception occured while executing this job.
                // We would not get to the following lines.
                // Execute commands if both jobs completed successful
                compilationCompletedSuccessful = true
                executeCommands()

                return Status.OK_STATUS
            }
        }
        job.schedule()
    }

    /**
     * Compile an sct file via KiCo and save result.
     */
    private def compile(SCTCompilationData data) {
        // Load model from file
        val EObject model = loadModelFromFile(data.path)

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
        createDirectories(targetPath)

        if (targetTemplate != "") {
            // Use template
            val reader = new FileReader(new File(project.location + "/" + targetTemplate))
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
     * Loads an EObject from a file path.
     * @param fullPath The fully qualified path to the file.
     */
    private def EObject loadModelFromFile(String fullPath) {
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
            inputResource.load(null);
            return inputResource.getContents().get(0);
        }
    }

    /**
     * Generates the wrapper code for a list of SCTCompilationData and saves it. 
     */
    private def void generateWrapperCode(List<SCTCompilationData> datas) {
        wrapperCodeGenerationCompletedSuccessful = false

        val job = new Job("SCT Wrapper code generation") {
            override protected IStatus run(IProgressMonitor monitor) {

                val targetLocation = new File(project.location + "/" + wrapperCodeTarget)
                val templateLocation = new File(project.location + "/" + wrapperCodeTemplate)
                val snippetDirectory = new File(project.location + "/" + wrapperCodeSnippetDirectory)

                // Check consistency of paths
                if (wrapperCodeTarget != "" && wrapperCodeTemplate != "" && templateLocation.exists &&
                    wrapperCodeSnippetDirectory != "" && snippetDirectory.exists) {

                    val List<WrapperCodeAnnotationData> annotationDatas = newArrayList()

                    for (data : datas) {
                        getWrapperCodeAnnotationData(data, annotationDatas)

                        if (monitor.isCanceled())
                            return Status.CANCEL_STATUS
                    }

                    // Create template macro calls from annotations
                    val map = new HashMap<String, String>()
                    var outputs = ""
                    var inputs = ""
                    var inits = ""
                    for (data : annotationDatas) {
                        inits += getAssignments(data.varName, data.varType);
                        inits += getInitAnnotationMacro(data.name, data.arguments);

                        outputs += getAssignments(data.varName, data.varType);
                        outputs += getOutputAnnotationMacro(data.name, data.arguments);

                        inputs += getAssignments(data.varName, data.varType);
                        inputs += getInputAnnotationMacro(data.name, data.arguments);
                    }
                    map.put("init_macros", inits)
                    map.put("output_macros", outputs)
                    map.put("input_macros", inputs)

                    // Inject macro calls in input template
                    FreeMarkerPlugin.templateDirectory = project.location.toOSString()
                    val template = FreeMarkerPlugin.configuration.getTemplate(wrapperCodeTemplate)

                    val writer = new StringWriter();
                    template.process(map, writer)

                    // Let FreeMarker process the new input template
                    FreeMarkerPlugin.templateDirectory = snippetDirectory.absolutePath

                    // Add implicit include of assignment macros
                    FreeMarkerPlugin.stringTemplateLoader.putTemplate("assignmentMacros",
                        FreeMarkerPlugin.assignmentMacros)
                    FreeMarkerPlugin.configuration.addAutoInclude("assignmentMacros")

                    // Implicitly add snippets to FreeMarker when processing the next template
                    val List<File> snippetFiles = newArrayList()
                    getFilesRecursive(snippetDirectory, snippetFiles)                    
                    snippetFiles.forEach [
                        val relativePath = snippetDirectory.toURI().relativize(it.toURI()).getPath()
                        FreeMarkerPlugin.configuration.addAutoInclude(relativePath)
                    ]

                    // Process template with macro calls and loaded snippets
                    FreeMarkerPlugin.stringTemplateLoader.putTemplate("tmp", writer.toString())
                    val newTemplate = FreeMarkerPlugin.configuration.getTemplate("tmp")

                    newTemplate.process(newHashMap(), new FileWriter(targetLocation))

                }

                // If an exception occured while executing this job.
                // We would not get to the following lines.
                // Execute commands if both jobs completed successful
                wrapperCodeGenerationCompletedSuccessful = true
                executeCommands()

                return Status.OK_STATUS
            }
        }
        job.schedule()
    }

    private static def String getAssignments(String varname, String vartype) {
        return "<#assign varname='" + varname + "' " + "vartype='" + vartype + "'" +
            " init_snippet='' output_snippet = '' input_snippet = '' />\n";
    }

    private static def String getInitAnnotationMacro(String annotationName, String... args) {
        return getAnnotationMacro(annotationName, args) + "\n${init_snippet!}\n";
    }

    private static def String getOutputAnnotationMacro(String annotationName, String... args) {
        return getAnnotationMacro(annotationName, args) + "\n${output_snippet!}\n";
    }

    private static def String getInputAnnotationMacro(String annotationName, String... args) {
        return getAnnotationMacro(annotationName, args) + "\n${input_snippet!}\n";
    }

    private static def String getAnnotationMacro(String annotationName, String... args) {
        var txt = "<@" + annotationName + " ";
        for (String arg : args) {
            txt += "'" + arg + "' ";
        }
        txt += "/>";
        return txt;
    }

    def void getFilesRecursive(File folder, List<File> list) {
        // Filter that accepts directories and files with extension ftl
        val ftlFilter = new FileFilter() {
            override accept(File file) {
                return file.isDirectory || Files.getFileExtension(file.name).toLowerCase == "ftl"
            }
        }
        
        // Iterate over files in the folder recursively.
        // Add every file that is not filtered to the list.
        for (fileEntry : folder.listFiles(ftlFilter)) {
            if (fileEntry.isDirectory()) {
                getFilesRecursive(fileEntry, list);
            } else {
                list.add(fileEntry)
            }
        }
    }

    /**
     * Generates wrapper code with the settings from the launch configuration.
     * This is done independently from the sct compilation in a separate job.
     */
    private def getWrapperCodeAnnotationData(SCTCompilationData sctData, List annotationDatas) {
        val model = loadModelFromFile(sctData.path)

        if (model != null && model instanceof State) {
            // Iterate over model to get all annotations
            val root = (model as State)
            for (decl : root.declarations) {

                // Only consider annotations for inputs and outputs.
                if (decl.input || decl.output) {

                    for (anno : decl.annotations) {
                        val data = new WrapperCodeAnnotationData()
                        // Data from annotation
                        data.name = anno.name

                        // Data from declaration
                        data.input = decl.input
                        data.output = decl.output

                        // Add to list
                        annotationDatas += data
                    }
                }
            }
        }
    }

    /**
     * Executes the commands of the execute tab (compile, deploy and run).
     * The commands are only executed if the sct compilation
     * and wrapper code creation finished without errors.
     */
    private def executeCommands() {
        // NOTE: As this method is called from two jobs it is possible
        // that the commands are executed twice.
        // The scheduler might make a context switch after the
        // ...CompletedSuccessful variables are set to true.
        if (compilationCompletedSuccessful && wrapperCodeGenerationCompletedSuccessful) {
            val job = new Job("SCT Execute Commands") {

                override protected run(IProgressMonitor monitor) {
                    if (!execCommand(compileCommand, "Compile Command"))
                        return Status.OK_STATUS
                    if (!execCommand(deployCommand, "Deploy Command"))
                        return Status.OK_STATUS
                    if (!execCommand(runCommand, "Run Command"))
                        return Status.OK_STATUS

                    return Status.OK_STATUS
                }
            }
            job.schedule()
        }
    }

    /**
     * Executes a command via OS and waits for the process termination.
     * The command may contain arguments separated by spaces.
     * Double quotes (") can be use to handle a command or argument with spaces as one entity.
     * The created process gets a console in the Console View to fetch its output.
     * 
     * @return True iff the process terminated normally.
     */
    private def boolean execCommand(String cmdLine, String consoleLabel) {
        if (cmdLine != null && cmdLine != "") {
            val man = VariablesPlugin.getDefault.stringVariableManager
            val fullCommand = man.performStringSubstitution(cmdLine)
            val commandWithParameters = splitStringOnWhitespace(fullCommand)

            // Run process
            val p = new ProcessBuilder(commandWithParameters).start()
            DebugPlugin.newProcess(launch, p, consoleLabel)

            // Wait until the process finished
            val errorCode = p.waitFor()
            return ( errorCode == 0)
        }
        return true
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
