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
import de.cau.cs.kieler.kicool.compilation.Compile
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
        
        val TestsuiteCompilationData data = new TestsuiteCompilationData
        
        var String[] code = {}
        if (value.files.size == 1) {
            code = value.files.get(0).code.split("\\r\\n|\\r|\\n")
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
                data.system = KiCoolRegistration.getSystemById(systemID)
            
            // extension: <fileExtension>
            } else if (lowerLine.startsWith("extension:")) {
                data.fileEndsWithFilter = line.substring(10).trim
                logger.println("Filtering for Extension: " + data.fileEndsWithFilter)
            
            // destination: <destinationFolder>
            } else if (lowerLine.startsWith("destination:")) {
                data.destination = line.substring(12).trim
                logger.println("Set Destination to: " + data.destination)
            
            // src-root: <srcRootFolder>
            } else if (lowerLine.startsWith("src-root:")) {
                data.root = line.substring(9).trim
                logger.println("Set src-root to: " + data.root)
            
            // destination: <destinationFolder>
            } else if (lowerLine.startsWith("binfolder:")) {
                data.generatedFolder = line.substring(10).trim
                logger.println("Set binaries-folder to: " + data.generatedFolder)
            
            // <Folder>
            } else {
                compilePath(Paths.get(line), data)
                System.gc()
            }
        }
        
        // compile and extract result
        //val resultEnv = cc.compile
        //var resModel = resultEnv.model
        
        
        logger.println(value.files.size+" Files read")
        logger.println
        environment.allProperties.forEach[k, v, i|
            logger.print(k.id)
            logger.print(" := ")
            logger.println(v.toString)
        ]
        
        
        
        //this.updateProgress(0.5)
        //Thread.sleep(5000)
        
        val result = logger.closeLog("env.log")
        value.files.forEach[f| result.add(f.fileName, "got: "+f.code)]
        model = result
    }
    
    private def compilePath(Path path, TestsuiteCompilationData data) {
        if (data.system === null) {
            environment.errors.add(new NullPointerException("System is null"))
            logger.println("<< No compilation system selected. use: \"system:<systemID>\"")
            return;
        }
        logger.println("Compiling Path: " + path)
        try {
            Files
                .walk(path)
                //.parallel()
                .filter  [file| file.toFile.isFile && data.validFile(file)]
                .forEach [file|
                    compile(data, file)
                ]
        } catch (NoSuchFileException e) {
            environment.errors.add(e)
            logger.println("<< Compiling Path not found: " + path)
        }
    }
    
    private def compile(TestsuiteCompilationData data, Path file) {
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
                val cc = Compile.createCompilationContext(data.system, compileModel)
                cc.startEnvironment.setProperty(ProjectInfrastructure.MODEL_FILE_PATH, file.toString)
                data.fillEnvitonment(cc.startEnvironment)
                
                // run the compiler
                cc.compile
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
        }
        
    }
    
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