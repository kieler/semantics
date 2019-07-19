/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2018 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.kicool.deploy.processor

import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.properties.Property
import de.cau.cs.kieler.kicool.compilation.CCodeFile
import de.cau.cs.kieler.kicool.deploy.ProjectInfrastructure
import java.io.File
import java.nio.file.Files
import de.cau.cs.kieler.kicool.classes.GenericCompilationResult

/**
 * @author ssm
 * @kieler.design 2018-11-19 proposed
 * @kieler.rating 2018-11-19 proposed yellow
 */
class ArduinoCompiler extends AbstractSystemCompilerProcessor<Object, GenericCompilationResult> {

    public static val IProperty<String> ARDUINO_PATH = 
        new Property<String>("de.cau.cs.kieler.kicool.deploy.compiler.arduino.path", "arduino")
    public static val IProperty<String> ARDUINO_BOARD = 
        new Property<String>("de.cau.cs.kieler.kicool.deploy.compiler.arduino.board", "arduino:avr:mega:cpu=atmega2560")
    public static val IProperty<String> ARDUINO_PORT = 
        new Property<String>("de.cau.cs.kieler.kicool.deploy.compiler.arduino.port", "COM13")
    public static val IProperty<Boolean> ARDUINO_UPLOAD = 
        new Property<Boolean>("de.cau.cs.kieler.kicool.deploy.compiler.arduino.upload", false)
    public static val IProperty<Boolean> ARDUINO_VERIFY = 
        new Property<Boolean>("de.cau.cs.kieler.kicool.deploy.compiler.arduino.verify", true)
   
    override getId() {
        "de.cau.cs.kieler.kicool.deploy.compiler.arduino"
    }
    
    override getName() {
        "Arduino Compiler"
    }
    
    override process() {
        // Setup project infrastructure
        val infra = ProjectInfrastructure.getProjectInfrastructure(environment)
        if (infra.generatedCodeFolder === null) {
            return
        } else {
            infra.log(logger)
        }
        
        // javac
        logger.println
        logger.println("== Compiling source files (Arduino) ==")
        
        val sources = newArrayList
        val sourcePaths = newLinkedHashSet
        val iDir = newLinkedHashSet
        
        sources.addAll(environment.getProperty(SOURCES)?:emptyList)
        
        logger.println("Files:")
        for (source : sources) {
            val sourceFile = new File(infra.generatedCodeFolder, source)
            if (sourceFile.file) {
                sourcePaths += infra.generatedCodeFolder.toPath.relativize(sourceFile.toPath).toString
            } else if (sourceFile.directory) {
                for (path : Files.find(sourceFile.toPath, Integer.MAX_VALUE, [ filePath, fileAttr |
                    return fileAttr.regularFile && filePath.fileName.toString.endsWith(".c")
                ]).iterator.toIterable) {
                    sourcePaths += infra.generatedCodeFolder.toPath.relativize(path).toString
                }
                iDir += infra.generatedCodeFolder.toPath.relativize(sourceFile.toPath).toString
            } else {
                environment.errors.add("Source location does not exist: " + sourceFile)
                logger.println("ERROR: Source location does not exist: " + sourceFile)
            }
        }
        sourcePaths.forEach[logger.println("  " + it)]
        
        if (environment.getProperty(INCLUDE_GENERATED_FILES)) {
            sources.addAll(infra.sourceCode.files.filter(CCodeFile).filter[!header].map[fileName])
        }
        
        if (!iDir.empty) {
            logger.println("Include directories:") 
            iDir.forEach[logger.println("  " + it)] 
        }
        
        val ardc = newArrayList(environment.getProperty(ARDUINO_PATH)?:ARDUINO_PATH.^default)
        if (environment.getProperty(ARDUINO_VERIFY)) ardc += "--verify"
        if (environment.getProperty(ARDUINO_UPLOAD)) {
            ardc += "--upload"
            ardc += "--board"
            ardc += environment.getProperty(ARDUINO_BOARD)
            ardc += "--port"
            ardc += environment.getProperty(ARDUINO_PORT)
         }
        
        if (!environment.getProperty(ADDITIONAL_OPTIONS).nullOrEmpty) {
            val args = environment.getProperty(ADDITIONAL_OPTIONS)
            if (args.contains(" ")) {
                ardc += args.split(" ")
            } else {
                ardc += args
            }
        }
        ardc += sourcePaths
        
        // Run arduino compiler
        escapeOptions = false
        var success = ardc.invoke(infra.generatedCodeFolder)?:-1 == 0
        if (!success) {
            environment.errors.add("Compiler did not return success (exit value != 0)")
            logger.println("Compilation failed")
        }
        
        // Create model
        model = new GenericCompilationResult
        
        // report
        logger.saveLog(environment, "arduino-compiler-report.log")
        infra.refresh
    }

    
}