/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2019 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.kicool.cli

import com.google.gson.Gson
import com.google.gson.JsonObject
import com.google.gson.JsonParser
import de.cau.cs.kieler.core.KielerVersion
import de.cau.cs.kieler.core.model.ModelUtil
import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.properties.Property
import de.cau.cs.kieler.core.services.KielerLanguage
import de.cau.cs.kieler.kexpressions.kext.KExtStandaloneParser
import de.cau.cs.kieler.kicool.KiCoolStandaloneSetup
import de.cau.cs.kieler.kicool.compilation.CodeContainer
import de.cau.cs.kieler.kicool.compilation.CompilationContext
import de.cau.cs.kieler.kicool.compilation.Compile
import de.cau.cs.kieler.kicool.compilation.ExecutableContainer
import de.cau.cs.kieler.kicool.compilation.ExecutableContainerWrapper
import de.cau.cs.kieler.kicool.compilation.internal.EnvironmentPropertyHolder
import de.cau.cs.kieler.kicool.compilation.observer.CompilationFinished
import de.cau.cs.kieler.kicool.compilation.observer.ProcessorError
import de.cau.cs.kieler.kicool.compilation.observer.ProcessorFinished
import de.cau.cs.kieler.kicool.compilation.observer.ProcessorStart
import de.cau.cs.kieler.kicool.deploy.ProjectInfrastructure
import de.cau.cs.kieler.kicool.deploy.processor.AbstractSystemCompilerProcessor
import de.cau.cs.kieler.kicool.environments.Environment
import de.cau.cs.kieler.kicool.registration.KiCoolRegistration
import de.cau.cs.kieler.kicool.registration.ModelInformation
import de.cau.cs.kieler.kicool.util.KiCoolUtils
import java.io.File
import java.net.URL
import java.nio.file.FileSystems
import java.nio.file.Files
import java.util.List
import java.util.Map
import java.util.Observable
import java.util.Observer
import java.util.regex.Pattern
import org.apache.log4j.ConsoleAppender
import org.apache.log4j.Level
import org.apache.log4j.Logger
import org.apache.log4j.PatternLayout
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.ResourceSet
import picocli.CommandLine
import picocli.CommandLine.Command
import picocli.CommandLine.Option
import picocli.CommandLine.Parameters

import static extension de.cau.cs.kieler.core.uri.URIUtils.*
import static extension java.lang.String.format

/**
 * @author als
 */
@Command(name = "kico")
class KielerCompilerCLI implements Runnable, Observer {

    @Option(names = #["--version"], description = "prints the version of this compiler.")
    protected boolean version
    
    @Option(names = #["-v", "--verbose"], description = "activates verbose output.")
    protected boolean verbose
    
    @Option(names = #["-w", "--warn"], description = "activates warning output for parser and compiler.")
    protected boolean warn

    @Option(names = #["-t", "--try-all"], description = "prevents the compiler from stopping at the first error when compiling multiple source files.")
    protected boolean tryall
    
    @Option(names = #["-e", "--external", "--class-path"], paramLabel = "FILE", description = "one or multiple .jar files where the compiler searches for additional processors and compilation systems.")
    protected List<String> externalJars
    
    @Option(names = #["-s", "--system"], paramLabel = "SYSTEM-ID/FILE", description = "the ID of the compilation system or local .kico-file. (default: ${DEFAULT-VALUE})")
    protected String systemId = "de.cau.cs.kieler.kicool.identity"
    
    @Option(names = #["-i", "--intermediates"], description = "deactivates inplace compilation and saves all intermediate models. (default: ${DEFAULT-VALUE})")
    protected boolean intermediates = false
    
    @Option(names = #["-c", "--config", "--configuration"], paramLabel = "FILE", description = "the JSON configuration file to configure the compiler. All entries will be set as properties in the start environment. All entries with a keys starting with '--' and a string value will be treated as if they were passed as additional arguments to this command line call (override). Additionally it supports '--files' for specifying the input files (absolute or relative to the config file).")
    protected File config
    
    @Option(names = #["-D", "-P", "--property"], paramLabel = "PROPERTY", description = "the compiler properties to set in the start environment.")
    protected Map<String, String> properties
    
    @Option(names = #["-f", "--filter"], paramLabel = "PATTERN", description = "the glob pattern for filtering input files. (default: ${DEFAULT-VALUE})")
    protected String filter = "*.*"
    
    @Option(names = #["-o", "--output"], paramLabel = "FILE/DIRECTORY", description = "the output file or directory (for multiple source files) where the compilation result(s) should be saved. By default the result will be save alongside the source file with a deduced or default name, this might lead to overwrites if compiling multiple source files in the same directory.")
    protected File output
    
    @Option(names = #["-g", "--generated-code"], paramLabel = "DIRECTORY", description = "directory where the intermediate results and other generated files of the compilation can be stored. By default the files will be saved in a 'kieler-gen' folder alongside the source file, this might lead to overwrites if compiling multiple source files in the same directory.")
    protected File genCodeDir
    
    @Option(names = #["--no-output"], description = "deactivates saving the final compilation result. (default: ${DEFAULT-VALUE})")
    protected boolean noOutput = false
    
    @Parameters(description = "the files and/or directories to process.")
    protected List<File> files
    
    @Option(names = #["--list-systems"], description = "lists common compilation systems.")
    protected boolean listSystems
    
    @Option(names = #["--list-all-systems"], description = "lists all available compilation systems, including internal and developer-only systems.")
    protected boolean listAllSystems
    
    @Option(names = #["-h", "--help"], usageHelp = true, description = "displays this help message.")
    protected boolean help
    
    protected static val LAZY_PREFIX = "de.cau.cs.kieler"
    protected static val IProperty<File> SOURCE_FILE = new Property<File>("de.cau.cs.kieler.kicool.cli.source.file")
    protected val kicoInjector = KiCoolStandaloneSetup.doSetup

    static def void main(String[] args) throws Exception {
        val cl = new CommandLine(new KielerCompilerCLI())
        System.exit(cl.execute(args))
    }
    
    new() {
        // Prevents log4j warnings about unconfigured logger by xtext
        val root = Logger.getRootLogger()
        root.level = Level.ERROR
        root.addAppender(new ConsoleAppender(new PatternLayout(PatternLayout.TTCC_CONVERSION_PATTERN)))
    }
    
    override run() {
        var JsonObject configJson
        if (config !== null) {
            try {
                val content = new String(Files.readAllBytes(config.toPath))
                val json = (new JsonParser).parse(content) as JsonObject
                // Additional command arguments
                val jsonArgs = <String>newArrayList
                for (entry : json.entrySet.filter[key.startsWith("--") && value.isJsonPrimitive && value.asJsonPrimitive.isString]) {
                    if (entry.key.equals("--files")) { // Parse input files from config
                        val paths = <String>newArrayList()
                        val m = Pattern.compile("([^\"]\\S*|\".+?\")\\s*").matcher(entry.value.asString);
                        while (m.find()) {
                            paths += m.group(1).replace("\"", "")
                        }
                        val files = paths.map[trim].filter[!empty].map[new File(it)]
                        for (file : files) {
                            if (file.absolute) {
                                jsonArgs += file.toString
                            } else {
                                jsonArgs += new File(config.parentFile, file.toString).toString
                            }
                        }
                    } else { // other cli arguments
                        jsonArgs += entry.key
                        jsonArgs += entry.value.asString
                    }
                }
                val additionalCl = new CommandLine(this) // Not sure if it is good to reinitialize arguments of this instance
                val result = additionalCl.parseArgs(jsonArgs)
                if (result !== null && !result.errors.empty) {
                    println("Could not parse additional command line arguments from configuration file.")
                    for (e : result.errors) {
                        e.printStackTrace
                    }
                } else if (result !== null && verbose) {
                    for (arg : result.matchedArgs) {
                        println("Applied command line argument value from configuration file: " + arg.stringValues.join(" "))
                    }
                }
                json.entrySet.removeIf[key.startsWith("--")]
                configJson = json
            } catch (Exception e) {
                println("Could not parse configuration file: " + config.toString)
                e.printStackTrace
            }
        }
        
        // Print version
        if (version) {
            println(KielerVersion.version)
            System.exit(0)
        }
        
        // Handle additional libraries
        if (externalJars !== null) {
            for (path : externalJars) {
                addURLToClassLoader(new File(path).toURI().toURL())
            }
        }
        
        try {
            // List systems if requested
            val exit = printList()
            if (exit) System.exit(0)
            
            // Collect files
            val folderMatcher = FileSystems.getDefault().getPathMatcher("glob:**/" + filter)
            val fileMatcher = FileSystems.getDefault().getPathMatcher("glob:" + filter)
            val modelFiles = newArrayList
            if (files !== null) {
                for (file : files) {
                    if (file.isFile) {
                        if (fileMatcher.matches(file.toPath) || folderMatcher.matches(file.toPath)) {
                            modelFiles += file
                        } else {
                            println("Source file %s does not match input pattern %s!".format(file, filter))
                        }
                    } else if (file.isDirectory) {
                        modelFiles += Files.walk(file.toPath).filter[Files.isRegularFile(it) && (fileMatcher.matches(it) || folderMatcher.matches(it))].map[toFile].iterator.toIterable
                    } else {
                        println("%s does not exist".format(file))
                    }
                }
            }
            
            if (modelFiles.empty && config !== null && config.exists) {
                if (verbose) println("No explicit file to compile. Using config file as compiler input.")
                modelFiles += config
            }
            
            if (modelFiles.empty) {
                if (verbose || !listSystems || !listAllSystems || !help) println("No files to compile.")
                if (files === null || files.empty) CommandLine.usage(this, System.out)
                System.exit(-1)
            }
            
            
            // Find system
            val availableSystems = availableSystemsMap
            val lazyId = (systemId !== null && systemId.startsWith(".")) ? LAZY_PREFIX + systemId : systemId
            var system = if (availableSystems.containsKey(lazyId)) {
                availableSystems.get(lazyId)
            } else {
                if (verbose) println("No registered system with id %s assuming kico file".format(systemId))
                loadSystemFile()
            }
            if (system === null) System.exit(-1)
            
            // Prepare properties
            val jsonProps = newArrayList
            val rawProps = newHashMap
            if (configJson !== null && !configJson.entrySet.empty) {
                try {
                    val json = KExtStandaloneParser.parseJsonObject((new Gson).toJson(configJson))
                    if (json !== null) {
                        jsonProps += json
                    } else {
                        println("Could not convert configuration file into compiler properties.")
                    }
                } catch (Exception e) {
                    println("Could not convert configuration file into compiler properties.")
                    e.printStackTrace
                }
            }
            if (properties !== null && !properties.empty) {
                for (prop : properties.entrySet) {
                    try {
                        val json = KExtStandaloneParser.parseJsonObject("{\"" + prop.key + "\":" + prop.value + "}")
                        if (json !== null) {
                            jsonProps += json
                        } else {
                            rawProps.put(prop.key, prop.value)
                        }
                    } catch (Exception e) {
                        if (verbose) println("Could not parse value of compiler property %s. Value set as string: %s".format(prop.key, prop.value))
                        rawProps.put(prop.key, prop.value)
                    }
                }
            }
            
            // prepare generated code folder
            if (genCodeDir !== null) {
                if (genCodeDir.isFile) {
                    println("Directory for generated files (%s) is a file".format(genCodeDir))
                    System.exit(-1)
                }
                if (!genCodeDir.exists && !genCodeDir.mkdirs) {
                    println("Cannot create directory for generated code: %s".format(genCodeDir))
                    System.exit(-1)
                }
            }
            
            var error = false
            val languages = availableInputLanguagesMap
            for (file : modelFiles) {
                // Read model
                var Object model
                if (verbose) println("Reading model from file %s".format(file))
                val ext = file.name.substring(file.name.lastIndexOf(".") + 1)
                if (!languages.containsKey(ext)) {
                    if (verbose) println("No language registered with extension %s. Input will be parsed as text.".format(ext))
                    model = new CodeContainer()
                    (model as CodeContainer).addProxy(file, new String(Files.readAllBytes(file.toPath)))
                } else {
                    val res = languages.get(ext).injector.getInstance(ResourceSet).createResource(URI.createFileURI(file.canonicalPath))
                    res.load(emptyMap)
                    if (!res.errors.empty) {
                        println("Error(s) in parsed model (%s)".format(file))
                        for (msg : res.errors) {
                            println(" %d:%d: %s".format(msg.line, msg.column, msg.message))
                        }
                        if (tryall) {
                            error = true
                        } else {
                            System.exit(-1)
                        }
                    } if (res.contents.empty) {
                        println("No model in file %s".format(file))
                        if (tryall) {
                            error = true
                        } else {
                            System.exit(-1)
                        }
                    } else {
                        if (verbose || warn) {
                            if (!res.warnings.empty) {
                                println("Waring(s) in parsed model (%s)".format(file))
                                for (msg : res.warnings) {
                                    println(" %d:%d: %s".format(msg.line, msg.column, msg.message))
                                }
                            }
                        }
                        model = res.contents.head
                    }
                }
                
                // Compile
                if (model !== null) {
                    val cc = Compile.createCompilationContext(system, model)
                    cc.startEnvironment.setProperty(Environment.INPLACE, !intermediates)
                    cc.startEnvironment.setProperty(SOURCE_FILE, file)
                    cc.startEnvironment.setProperty(ProjectInfrastructure.MODEL_FILE_PATH, file.canonicalPath)
                    cc.startEnvironment.setProperty(ProjectInfrastructure.USE_TEMPORARY_PROJECT, false)
                    cc.startEnvironment.setProperty(AbstractSystemCompilerProcessor.VERBOSE, verbose)
                    if (genCodeDir !== null) {
                        cc.startEnvironment.setProperty(ProjectInfrastructure.GENERATED_FOLDER_ROOT, genCodeDir.canonicalPath)
                        cc.startEnvironment.setProperty(ProjectInfrastructure.GENERATED_NAME, file.name)
                    }
                    
                    // Set properties
                    for (json : jsonProps) {
                        EnvironmentPropertyHolder.processEnvironmentConfig(cc.startEnvironment, json)
                    }
                    for (prop : rawProps.entrySet) {
                        cc.startEnvironment.allProperties.put(new Property(prop.key), prop.value)
                    }
                    
                    if (intermediates) {
                        val pinf = ProjectInfrastructure.getProjectInfrastructure(cc.startEnvironment)
                        if (verbose) pinf.log(System.out)
                    }
                    
                    cc.addObserver(this)
                    if (verbose) println("Compiling %s".format(file))
                    cc.compile
                    
                    if (tryall && !cc.allErrors.empty) error = true
                    
                    if (!noOutput && cc.allErrors.empty) {
                        if (verbose) println("Saving compilation result")
                        var dest = if (output === null) {
                            file.canonicalFile.parentFile
                        } else if (output.exists) {
                            output
                        } else if (modelFiles.size > 1) {
                            if (!output.mkdirs) {
                                println("Could not create output directory: %s".format(output))
                                if (tryall) {
                                    error = true
                                } else {
                                    System.exit(-1)
                                }
                            }
                            output
                        } else {
                            output
                        }
                        dest = new File(dest, files.get(0).toURI.relativize(file.parentFile.toURI).getPath() + "/")
                        if (!cc.result.model.saveModel(dest, file, cc)) {
                            if (tryall) {
                                error = true
                            } else {
                                System.exit(-1)
                            }
                        }
                    }
                }
                println
            }
            if (error) System.exit(-1)
        } catch (Exception e) {
            println("Unexpected error!")
            e.printStackTrace
            System.exit(-1)
        }
    }
    
    protected def Map<String, de.cau.cs.kieler.kicool.System> getAvailableSystemsMap() {
        return KiCoolRegistration.systemModels.toMap[id]
    } 
    
    protected def Map<String, KielerLanguage> getAvailableInputLanguagesMap() {
        return KielerLanguage.allRegisteredLanguages.fold(newHashMap)[ map, lang | lang.supportedResourceExtensions.forEach[ map.put(it, lang) ]; map]
    }
    
    override update(Observable o, Object event) {
        switch (event) {
            CompilationFinished: {
                if (verbose) println("Compilation finished in %.2fms".format(event.environment.getProperty(Environment.COMPILATION_TIME).doubleValue / 1000_000))
            }
            ProcessorStart: {
                if (verbose) println("Executing processor: %s (%s)".format(event.processorInstance.name, event.processorInstance.id))
            }
            ProcessorError: {
                println(event.error)
            }
            ProcessorFinished: {
                val env = event.processorInstance.environment
                if (env.errors !== null && !env.errors.empty) {
                    println("Error(s) in compilation")
                    for (error : env.errors.get(Environment.REPORT_ROOT)) {
                        println(error.message)
                        if (error.exception !== null) error.exception.printStackTrace
                    }
                }
                if (warn && env.warnings !== null && !env.warnings.empty) {
                    for (warning : env.warnings.get(Environment.REPORT_ROOT)) {
                        println(warning.message)
                        if (warning.exception !== null) warning.exception.printStackTrace
                    }
                }
                val processorDir = if (intermediates) {
                    val pinf = ProjectInfrastructure.getProjectInfrastructure(env)
                    val idx = event.compilationContext.processorInstances.indexOf(event.processorInstance)
                    val dir = new File(pinf.generatedCodeFolder, "%02d_%s".format(idx, event.processorInstance.id))
                    if (dir.isFile || (!dir.exists && !dir.mkdirs)) {
                        println("Cannot create folder for intermediate results %s".format(dir))
                    }
                    if (genCodeDir !== null) {
                       new File(genCodeDir, genCodeDir.canonicalFile.toPath.relativize(dir.canonicalFile.toPath).toString)
                    } else {
                        (new File(".")).canonicalFile.toPath.relativize(dir.canonicalFile.toPath).toFile
                    }
                }
                if ((verbose || intermediates) && env.logs !== null && !env.logs.files.empty) {
                    for (log : env.logs.files) {
                        if (verbose) {
                            println(log.code)
                        }
                        if (intermediates) {
                            try {
                                Files.write(new File(processorDir, log.fileName).toPath, log.code.getBytes())
                            } catch (Exception e) {
                                println("Cannot save log file %s to %s".format(log.fileName, processorDir))
                            }
                        }
                    }
                }
                if (verbose) {
                    println("Processing time: %.2fms".format(env.getProperty(Environment.TRANSFORMATION_TIME).doubleValue / 1000_000))
                }
                if (!tryall && env.errors !== null && !env.errors.empty) {
                    println("Compilation failed.")
                    System.exit(-1)
                }
                if (intermediates) {
                    if (!env.model.saveModel(processorDir, env.getProperty(SOURCE_FILE), event.compilationContext)) {
                        println("Could not save intermediate result processor %s (%s)".format(event.processorInstance.name, event.processorInstance.id))
                    }
                }
            }
            // TODO support ProcessorSnapshot in the future?
        }
    }
    
    protected def loadSystemFile() {
        if (!systemId.nullOrEmpty) {
            val file = new File(systemId)
            if (file.isFile && systemId.endsWith(".kico")) {
                try {
                val ResourceSet rs = kicoInjector.getInstance(typeof(ResourceSet))
                val resource = rs.getResource(URI.createFileURI(file.canonicalPath), true)
                    val system = resource.contents.head
                    if (system instanceof de.cau.cs.kieler.kicool.System) {
                        return system
                    }
                } catch (Exception e) {
                    e.printStackTrace
                    println("Could not load system from file %s".format(systemId))
                    return null
                }
            } else {
                println("Compilation system %s does not exist.".format(systemId))
                return null
            }
        }
        println("No compilation system specified.")
        return null
    }
    
    protected def boolean printList() {
        if (listSystems || listAllSystems) {
            if (listAllSystems) {
                println("All available compilation systems:")
            } else {
                println("Compilation systems:")
            }
           
            val languages = availableInputLanguagesMap
            for (entry : availableSystemsMap.entrySet.filter[listAllSystems ? true : it.value.public].sortBy[key]) {
                val input = KiCoolUtils.findInputClass(entry.value)
                val lang = languages.values.findFirst[supportedModels.contains(input)]
                if (lang !== null) {
                    println("  %s - [%s] - %s".format(entry.key, lang.supportedResourceExtensions.join(", ")["*." + it], entry.value.label))
                } else if (input !== null && ("Object".equals(input.simpleName) || "EObject".equals(input.simpleName))) {
                    println("  %s - [*.*] - %s".format(entry.key, entry.value.label))
                } else {
                    println("  %s - %s".format(entry.key, entry.value.label))
                }
            }
            return true
        }
        return false
    }
    
    protected def saveModel(Object model, File dest, File source, CompilationContext cc) {
        try {
            val name = (source.name.contains(".")) ? source.name.substring(0, source.name.indexOf(".")) : source.name + ".result"
            if (model instanceof CodeContainer) { // special handling because it may save multiple files
                if (dest.file && model.files.size > 1) {
                    println("Could not save multiple compilation results (%s) into single file.".format(model.files.map[fileName].join(", ")))
                    return false
                }
                if (!dest.exists) {
                    if (model.files.size == 1) {
                        dest.createNewFile
                    } else {
                        if (!dest.mkdirs) {
                            println("Could not create output directory: %s".format(dest))
                            return false
                        }
                    }
                }
                if (model.files.size == 1 && dest.isFile) {
                    if (verbose) println("Writing to %s".format(dest))
                    Files.write(dest.toPath, model.head.code.getBytes())
                } else {
                    for (f : model.files) {
                        val target = new File(dest, f.fileName)
                        if (verbose) println("Writing to %s".format(target))
                        Files.write(target.toPath, f.code.getBytes())
                    }
                }
            } else {
                if (!dest.exists) {
                    dest.createNewFile
                }
                if (model instanceof EObject) {
                    if (dest.isFile) {
                        if (verbose) println("Writing to %s".format(dest))
                        ModelUtil.saveModel(model, dest.URI)
                    } else {
                        val ext = ModelInformation.getExtensionAndInjector(model)
                        if (ext !== null) {
                            val target = new File(dest, name + "." + ext.key)
                            if (target.absoluteFile.equals(source.absoluteFile)) {
                                if (output === null) {
                                    println("Results were not saved since source and target destination are identical (%s). To enable destructive updates set output destination explicitly.".format(target))
                                    return false
                                } else if (verbose) {
                                    println("Performing destructive source file update.")
                                }
                            }
                            if (verbose) println("Writing to %s".format(target))
                            ModelUtil.saveModel(model, target.URI, ext.value)
                        } else {
                            val target = new File(dest, name + ".unknown")
                            if (verbose) println("Writing to %s".format(target))
                            ModelUtil.saveModel(model, target.URI)
                        }
                    }
                } else if (model instanceof ExecutableContainer ||
                          (model instanceof ExecutableContainerWrapper && (model as ExecutableContainerWrapper).executableContainer !== null)) {
                    val exe = (model instanceof ExecutableContainerWrapper) ? model.executableContainer : model as ExecutableContainer
                    if (dest.isFile) {
                        if (verbose) println("Writing to %s".format(dest))
                        if (dest.exists) dest.delete
                        Files.copy(exe.file.toPath, dest.toPath)
                    } else {
                        val target = new File(dest, exe.file.name)
                        if (verbose) println("Writing to %s".format(target))
                        if (target.exists) target.delete
                        Files.copy(exe.file.toPath, target.toPath)
                    }
                } else {
                    if (dest.isFile) {
                        if (verbose) println("Writing to %s".format(dest))
                        Files.write(dest.toPath, model.toString.getBytes())
                    } else {
                        val target = new File(dest, name + ".txt")
                        if (target.absoluteFile.equals(source.absoluteFile)) {
                            if (output === null) {
                                println("Results were not saved since source and target destination are identical (%s). To enable destructive updates set output destination explicitly.".format(target))
                                return false
                            } else if (verbose) {
                                println("Performing destructive source file update.")
                            }
                        }
                        if (verbose) println("Writing to %s".format(target))
                        Files.write(target.toPath, model.toString.getBytes())
                    }
                }
            }
        } catch (Exception e) {
            println("Exception when saving model")
            e.printStackTrace
            return false
        }
        return true
    }
    
    static def addURLToClassLoader(URL u) {
        val sysloader = ClassLoader.getSystemClassLoader();
        if(sysloader instanceof CLILoader){
            sysloader.addURL(u)
        } else{
            println("WARNING: The system class loader was not set to 'de.cau.cs.kieler.kicool.cli.CLILoader'. In this case the option --class-path is not supported and will be ignored.")
        }
    }
}
