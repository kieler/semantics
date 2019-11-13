/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.simulation.testsuite

import com.google.inject.Guice
import de.cau.cs.kieler.kicool.compilation.CodeContainer
import de.cau.cs.kieler.kicool.compilation.ExogenousProcessor
import de.cau.cs.kieler.kicool.deploy.Logger
import de.cau.cs.kieler.kicool.deploy.ProjectInfrastructure
import de.cau.cs.kieler.kicool.registration.KiCoolRegistration
import java.nio.file.Files
import java.nio.file.NoSuchFileException
import java.nio.file.Path
import java.nio.file.Paths
import java.util.Locale
import org.eclipse.emf.common.util.URI
import org.eclipse.xtext.resource.IResourceServiceProvider
import org.eclipse.xtext.resource.XtextResourceSet

/**
 * @author mek
 *
 */
class TestsuiteTransformation extends ExogenousProcessor<CodeContainer, CodeContainer>{
    
    val logger = new Logger
    
    override getId() {
         "de.cau.cs.kieler.simulation.testsuite.deploy"
    }
    
    override getName() {
        "Test-suite processor"
    }
        
    override process() {
        val value = model
        var Path basePath = Paths.get("./");
        
        val TestsuiteCompilationData config = new TestsuiteCompilationData
        config.logger = logger
        
        // interpret config file line-by-line
        var String[] code = {}
        if (value.files.size == 1) {
            code = value.files.get(0).code.split("\\r\\n|\\r|\\n")
            if (value.files.get(0).proxy) {
                basePath = Paths.get(value.files.get(0).file.parentFile.absolutePath)
            }
        } else if (value.files.size > 1) {
            environment.errors.add("Testsuite Creation allows only one Config-File.")
        } else {
            environment.errors.add("Testsuite Creation needs a Config-File.")
        }
        
        for (String codeLine : code) {
            val line      = codeLine.trim
            val lowerLine = line.toLowerCase(Locale.ROOT)
            
            if (line == "" || line.startsWith("//")) {
                // NOP
            // system: <SystemID>
            } else if (lowerLine.startsWith("system:")) {
                val systemID = line.substring(7).trim
                logger.println("Loading System: " + systemID)
                config.system = KiCoolRegistration.getSystemById(systemID)
            
            // extension: <fileExtension>
            } else if (lowerLine.startsWith("extension:")) {
                config.fileEndsWithFilter = line.substring(10).trim
                logger.println("Filtering for Extension: " + config.fileEndsWithFilter)
            
            // destination: <destinationFolder>
            } else if (lowerLine.startsWith("destination:")) {
                if (config.destination === null) {
                    config.destination = line.substring(12).trim
                    environment.getPropertyComputeIfAbsent(
                        ProjectInfrastructure.PATH_VARIABLES, [newHashMap]
                    ).put("DST_ROOT", config.destination)
                    logger.println("Set Destination to: " + config.destination)
                } else {
                    logger.println("ERROR destination already set to " + config.destination +
                                    " (" + line.substring(12).trim + ")"
                                    )
                }
            
            // src-root: <srcRootFolder>
            } else if (lowerLine.startsWith("src-root:")) {
                config.root = line.substring(9).trim
                logger.println("Set src-root to: " + config.root)
            
            // binfolder: <binFolder>
            } else if (lowerLine.startsWith("binfolder:")) {
                config.generatedFolder = line.substring(10).trim
                logger.println("Set binaries-folder to: " + config.generatedFolder)
            
            // <Folder>
            } else {
                compilePath(basePath.resolve(Paths.get(line)), config)
                System.gc()
            }
        }
        
        
        logger.println
        environment.allProperties.forEach[k, v, i|
            logger.print(k.id)
            logger.print(" := ")
            logger.println(v.toString)
        ]
        
        val result = logger.closeLog("env.log")
        model = result
    }
    
    /**
     * compiles all valid files under given path according to the config
     */
    private def compilePath(Path path, TestsuiteCompilationData config) {
        if (config.system === null) {
            environment.errors.add(new NullPointerException("System is null"))
            logger.println("<< No compilation system selected. use: \"system:<systemID>\"")
            return;
        }
        logger.println("Compiling Path: " + path + " ("+path.toAbsolutePath+")")
        try {
            Files
                .walk(path)
                .filter  [file| file.toFile.isFile && config.validFile(file)]
                .forEach [file|
                    compile(config, file)
                ]
        } catch (NoSuchFileException e) {
            environment.errors.add(e)
            logger.println("<< Compiling Path not found: " + path)
        }
    }
    
    /**
     * This method tries to compile a given file with specified config.
     */
    private def compile(TestsuiteCompilationData config, Path file) {
        logger.println(" - "+file.toString)
        try {
            val provider = file.getResourceServiceProvider
            // get the Model to compile
            val resource = provider.getResource(
                URI.createFileURI(file.toAbsolutePath.normalize.toString)
                , true
            )
            val compileModel = resource.getContents().head
            try {
                // get a compilation context
                val cc = config.getCompilationContext(compileModel, file)
                
                // run the compiler
                cc?.compile
            } catch (Exception e) {
                environment.errors.add(e)
                logger.println(" << ERROR <<")
                logger.println("Error: could not compile model from file " + file)
                e.printStackTrace(logger)
                logger.println(" >> ----- >>")
            }
        } catch (Exception e) {
            environment.errors.add(e)
            logger.println(" << ERROR <<")
            logger.println("Error: could not load model from file " + file)
            e.printStackTrace(logger)
            logger.println(" >> ----- >>")
        } catch (OutOfMemoryError e) {
            logger.println(" << ERROR << OutOfMemory <<")
            logger.println("Error: could not load/compile model from file " + file)
            logger.println(" >> ----- >>")
        } catch (StackOverflowError e) {
            logger.println(" << ERROR << StackOverflow <<")
            logger.println("Error: could not load/compile model from file " + file)
            logger.println(" >> ----- >>")
        }
        
    }
    
    /**
     * This method gets a new ResourceServiceProvider to load models.
     */
    private def getResourceServiceProvider(Path file) {
        val registry = Guice.createInjector().getInstance(IResourceServiceProvider.Registry)
        val abspath = file.toAbsolutePath.normalize.toString
        val provider = registry
            .getResourceServiceProvider(
                URI.createFileURI(abspath)
            )
        if (provider === null) {
            logger.println("<< could not load file. use: \"extension:<extension>\" to filter input files.")
            throw new NullPointerException("No Resource Service Provider for file "+file)
        }
        return provider.get(XtextResourceSet)
    }
}