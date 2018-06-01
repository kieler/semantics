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

import de.cau.cs.kieler.core.model.properties.IProperty
import de.cau.cs.kieler.core.model.properties.Property
import java.util.Map
import de.cau.cs.kieler.kicool.deploy.ProjectInfrastructure
import de.cau.cs.kieler.kicool.compilation.JavaCodeFile
import java.io.File
import java.nio.file.Files

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class JavaCompiler extends AbstractSystemCompilerProcessor {
    
    public static val IProperty<Boolean> JAR = 
        new Property<Boolean>("de.cau.cs.kieler.kicool.deploy.compiler.java.jar", true)
        
    public static val IProperty<String> JAR_NAME = 
        new Property<String>("de.cau.cs.kieler.kicool.deploy.compiler.java.jar.name", "main.jar")        
        
    public static val IProperty<String> JAR_ENTRY = 
        new Property<String>("de.cau.cs.kieler.kicool.deploy.compiler.java.jar.entry", "Main") 
    
    override getId() {
        "de.cau.cs.kieler.kicool.deploy.compiler.java"
    }
    
    override getName() {
        "Java Compiler"
    }
    
    override process() {
        // Setup project infrastructure
        val infra = ProjectInfrastructure.getProjectInfrastructure(environment)
        if (infra.generadedCodeFolder === null) {
            return
        } else {
            infra.log(logger)
        }
        
        // Bin folder
        val binFolder = new File(infra.generadedCodeFolder, environment.getProperty(BIN_FOLDER)?:BIN_FOLDER.^default)
        val binPath = infra.generadedCodeFolder.toPath.relativize(binFolder.toPath).toString
        logger.println("Binary output folder: " + binFolder)
        if (binFolder.exists) {
            if (!binFolder.directory) {
                environment.errors.add("Binary output folder exists and is not a directory")
                logger.println("ERROR: Binary output folder exists and is not a directory")
            }
        } else {
            binFolder.mkdirs
        }
        
        // javac
        logger.println
        logger.println("== Compiling source files (javac) ==")
        
        val sources = newArrayList
        val sourcePaths = newLinkedHashSet
        if (environment.getProperty(INCLUDE_GENERATED_FILES)) {
            sources.addAll(infra.sourceCode.files.filter(JavaCodeFile).map[fileName])
        }
        sources.addAll(environment.getProperty(SOURCES)?:emptyList)
        
        logger.println("Files:")
        for (source : sources) {
            val sourceFile = new File(infra.generadedCodeFolder, source)
            if (sourceFile.file) {
                sourcePaths += infra.generadedCodeFolder.toPath.relativize(sourceFile.toPath).toString
            } else if (sourceFile.directory) {
                for (path : Files.find(sourceFile.toPath, Integer.MAX_VALUE, [ filePath, fileAttr |
                    return fileAttr.regularFile && filePath.fileName.toString.endsWith(".java")
                ]).iterator.toIterable) {
                    sourcePaths += infra.generadedCodeFolder.toPath.relativize(path).toString
                }
            } else {
                environment.errors.add("Source location does not exist: " + sourceFile)
                logger.println("ERROR: Source location does not exist: " + sourceFile)
            }
        }
        sourcePaths.forEach[logger.println("  " + it)]
        
        val javac = newArrayList("javac")
        javac += "-verbose"
        javac += "-cp"
        javac += "."
        javac += "-d"
        javac += binPath
        if (!environment.getProperty(ADDITIONAL_OPTIONS).nullOrEmpty) {
            val args = environment.getProperty(ADDITIONAL_OPTIONS)
            if (args.contains(" ")) {
                javac += args.split(" ")
            } else {
                javac += args
            }
        }
        javac += sourcePaths
        
        // Run javac compiler
        var success = javac.invoke(infra.generadedCodeFolder)?:-1 == 0
        if (!success) {
            environment.errors.add("Compiler did not return success (exit value != 0)")
            logger.println("Aborting compilation")
        }

        // jar
        if (success && environment.getProperty(JAR)) {
            logger.println
            logger.println("== Bundling jar archive (jar) ==")
            
            val targetJar = new File(binFolder, environment.getProperty(JAR_NAME)?:JAR_NAME.^default)
            val targetJarPath = binFolder.toPath.relativize(targetJar.toPath).toString
            logger.println("Target jar file: " + targetJar)
            val entryPoint = environment.getProperty(JAR_ENTRY)?:JAR_ENTRY.^default
            logger.println("Jar entry point: " + entryPoint)            
            
            val jar = newArrayList("jar")
            jar += "cvfe"
            jar += targetJarPath
            jar += entryPoint
            for (s : sourcePaths) {
                jar += s.replace(".java", ".class")
            }
            
            // Run javac compiler
            success = jar.invoke(binFolder)?:-1 == 0
            if (!success) {
                environment.errors.add("Compiler did not return success (exit value != 0)")
                logger.println("Compilation failed")
            }
        }
        
        // report
        saveLog("java-compiler-report.log")
        infra.refresh
    }

    
}