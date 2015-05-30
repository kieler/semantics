package de.cau.cs.kieler.sccharts.launchconfig

import de.cau.cs.kieler.kico.KielerCompiler
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.sccharts.text.sct.SctStandaloneSetup
import freemarker.template.Configuration
import freemarker.template.Template
import freemarker.template.Version
import java.io.File
import java.io.FileReader
import java.io.FileWriter
import java.io.IOException
import java.io.PrintWriter
import java.util.ArrayList
import java.util.List
import java.util.concurrent.ExecutionException
import java.util.regex.Pattern
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.variables.VariablesPlugin
import org.eclipse.debug.core.DebugPlugin
import org.eclipse.debug.core.ILaunch
import org.eclipse.debug.core.ILaunchConfiguration
import org.eclipse.debug.core.model.ILaunchConfigurationDelegate
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl
import freemarker.template.TemplateExceptionHandler

class LaunchConfiguration implements ILaunchConfigurationDelegate {

    public static val ATTR_COMPILE_COMMAND = "de.cau.cs.kieler.scchart.launchconfig.execute.command.compile"
    public static val ATTR_DEPLOY_COMMAND = "de.cau.cs.kieler.scchart.launchconfig.execute.command.deploy"
    public static val ATTR_RUN_COMMAND = "de.cau.cs.kieler.scchart.launchconfig.execute.command.run"

    public static val ATTR_SCT_FILES = "de.cau.cs.kieler.scchart.launchconfig.sct.files"

    var ILaunchConfiguration configuration
    var String mode
    var ILaunch launch
    var IProgressMonitor monitor

    override void launch(ILaunchConfiguration configuration, String mode, ILaunch launch,
        IProgressMonitor monitor) throws CoreException {
        this.configuration = configuration
        this.mode = mode
        this.launch = launch
        this.monitor = monitor

        println("Now launching an SCT project!")
        // Compile SCT files
        val datas = SCTCompilationData.loadAllFromConfiguration(configuration)
        datas.forEach [
            compile(it)
        ]
        // Execute commands
        execCommand(configuration.getAttribute(ATTR_COMPILE_COMMAND, ""), "Compile Command")
        execCommand(configuration.getAttribute(ATTR_DEPLOY_COMMAND, ""), "Deploy Command")
        execCommand(configuration.getAttribute(ATTR_RUN_COMMAND, ""), "Run Command")
    }

    private def compile(SCTCompilationData data) {
        println("compiling: " + data.name)

        var EObject model = null;
        try {
            model = loadModelFromFile(data.path)
        } catch (Exception e) {
            e.printStackTrace()
        }

        if (model != null) {
            if (data.targetLanguage != null && data.targetLanguage != "") {
                // Compile sct
                val context = new KielerCompilerContext("T_"+data.targetLanguage, model)
                val result = KielerCompiler.compile(context)

                // Flush compilation result to target
                if (result != null && result.string != null) {
                    try {
                        if (data.targetTemplate != null && data.targetTemplate != "") {
                            // Use template
                            val reader = new FileReader(new File(data.targetTemplate))
                            val cfg = new Configuration(new Version(2, 3, 0))
                            cfg.templateExceptionHandler = TemplateExceptionHandler.RETHROW_HANDLER
                            
                            val template = new Template("tmp", reader, cfg)
                            val writer = new FileWriter(new File(data.targetPath))
                            template.process(#{"sct_code" -> result.string}, writer)
                            reader.close()
                            writer.close()
                        } else {
                            // Write directly to file
                            val writer = new PrintWriter(data.targetPath, "UTF-8");
                            writer.print(result.string)
                            writer.close()
                        }
                    } catch (Exception e) {
                        e.printStackTrace()
                    }
                }
            } else {
                println("Can't find transformationID for SCT target language '" + data.targetLanguage + "'.")
            }
        }
    }

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
    private def List<String> splitStringOnWhitespace(String str){
        // Code from
        // http://stackoverflow.com/questions/7804335/split-string-on-spaces-except-if-between-quotes-i-e-treat-hello-world-as
        
        val list = new ArrayList<String>();
        val m = Pattern.compile("([^\"]\\S*|\".+?\")\\s*").matcher(str);
        while (m.find()){
            // .replace(...) is to remove surrounding qoutes
            list.add(m.group(1).replace("\"", "") )
        }
        return list
    }

    private def EObject loadModelFromFile(String fullPath) {
        // The contents of de.cau.cs.kieler.core.model.handlers.AbstractConvertModelHandler.convert
        // are pretty similar to this method -> generalize and reuse?
        
        // Create URIs and load the instance with our resource injector
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
                throw new ExecutionException("Could not load SCChart as an XMIResource.", e);
            }
        }
    }

}
