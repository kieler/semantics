package de.cau.cs.kieler.sccharts.launchconfig

import de.cau.cs.kieler.kico.KielerCompiler
import de.cau.cs.kieler.kico.KielerCompilerContext
import freemarker.template.Configuration
import freemarker.template.Template
import freemarker.template.Version
import java.io.File
import java.io.FileReader
import java.io.FileWriter
import java.io.PrintWriter
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.debug.core.ILaunch
import org.eclipse.debug.core.ILaunchConfiguration
import org.eclipse.debug.core.model.ILaunchConfigurationDelegate2
import org.eclipse.emf.ecore.EObject

class LaunchConfiguration implements ILaunchConfigurationDelegate2 {

    public static val ATTR_COMPILE_COMMAND = "de.cau.cs.kieler.scchart.launchconfig.execute.command.compile"
    public static val ATTR_DEPLOY_COMMAND = "de.cau.cs.kieler.scchart.launchconfig.execute.command.deploy"
    public static val ATTR_RUN_COMMAND = "de.cau.cs.kieler.scchart.launchconfig.execute.command.run"

    public static val ATTR_SCT_FILES = "de.cau.cs.kieler.scchart.launchconfig.sct.files"
    public static val ATTR_SCT_FILEDATA = "de.cau.cs.kieler.scchart.launchconfig.sct.filedata"

    override void launch(ILaunchConfiguration configuration, String mode, ILaunch launch,
        IProgressMonitor monitor) throws CoreException {
        println("Now launching an SCT project!")

        val datas = SCTCompilationData.loadAllFromConfiguration(configuration)
        datas.forEach [
            compile(it)
            execCommand(configuration.getAttribute(ATTR_COMPILE_COMMAND, ""))
            execCommand(configuration.getAttribute(ATTR_DEPLOY_COMMAND, ""))
            execCommand(configuration.getAttribute(ATTR_RUN_COMMAND, ""))
        ]
    }

    override ILaunch getLaunch(ILaunchConfiguration configuration, String mode) throws CoreException {
        return null
    }

    override boolean buildForLaunch(ILaunchConfiguration configuration, String mode,
        IProgressMonitor monitor) throws CoreException {
        return true
    }

    override boolean finalLaunchCheck(ILaunchConfiguration configuration, String mode,
        IProgressMonitor monitor) throws CoreException {
        return true
    }

    override boolean preLaunchCheck(ILaunchConfiguration configuration, String mode,
        IProgressMonitor monitor) throws CoreException {
        return true
    }

    private def compile(SCTCompilationData data) {
        println("compiling: " + data.name)

        val EObject model = null;

        val languageToTransformationIDMapping = #{"Java" -> "S2JAVA", "C" -> "S2C"}
        val transformationID = languageToTransformationIDMapping.get(data.targetLanguage)
        if (transformationID != null) {
            // Compile sct
            val context = new KielerCompilerContext(#[transformationID], #[], model)
            val result = KielerCompiler.compile(context)

            // Flush compilation result to target
            if (result != null && result.string != null) {
                try {
                    if (data.targetTemplate != null && data.targetTemplate != "") {
                        // Use template
                        val reader = new FileReader(new File(data.targetTemplate))
                        val cfg = new Configuration(new Version(2, 3, 0))
                        val template = new Template("tmp", reader, cfg)
                        val writer = new FileWriter(new File(data.path))
                        template.process(#{"sct_code" -> result.string}, writer)
                        reader.close()
                        writer.close()
                    } else {
                        // Write directly to file
                        val writer = new PrintWriter(data.path, "UTF-8");
                        writer.print(result.string)
                        writer.close()
                    }
//                } catch(FileNotFoundException e){
//                    e.printStackTrace()
//                } catch(UnsupportedEncodingException e){
//                    e.printStackTrace()
//                } catch(IOException e){
//                    e.printStackTrace()
//                } catch(SecurityException e){
//                    e.printStackTrace()
//                }
                } catch (Exception e) {
                    e.printStackTrace()
                }
            }
        } else {
            println("Can't find transformationID for SCT target language '" + data.targetLanguage + "'.")
        }
    }

    private def execCommand(String cmdLine) {
        if (cmdLine != null && cmdLine != "") {
            try{
                // TODO: Run process and fill eclipse console with output
                //val p = Runtime.getRuntime().exec(cmdLine)
                //println("Process finished with exit code "+p.exitValue)
            } catch (Exception e) {
                println("Error running command '"+cmdLine+"'")
                e.printStackTrace()
            }
        }
    }
}
