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
import de.cau.cs.kieler.kicool.compilation.ExecutableContainer
import de.cau.cs.kieler.kicool.compilation.ExecutableJarContainer
import de.cau.cs.kieler.kicool.compilation.JavaCodeFile
import de.cau.cs.kieler.kicool.deploy.ProjectInfrastructure
import java.io.File
import java.nio.file.Files

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class JavaCompiler extends AbstractSystemCompilerProcessor<Object, ExecutableContainer> {

    public static val IProperty<String> JAVAC_PATH = 
        new Property<String>("de.cau.cs.kieler.kicool.deploy.compiler.java.path", "javac")

    public static val IProperty<String> JAR_PATH = 
        new Property<String>("de.cau.cs.kieler.kicool.deploy.compiler.java.jar.path", "jar")
            
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
        if (infra.generatedCodeFolder === null) {
            return
        } else {
            infra.log(logger)
        }
        
        // Bin folder
        val binFolder = infra.createBinFolder
        val binPath = infra.generatedCodeFolder.toPath.relativize(binFolder.toPath).toString
        
        // javac
        logger.println
        logger.println("== Compiling source files (javac) ==")
        
        val sources = newArrayList
        val sourcePaths = newLinkedHashSet
        if (environment.getProperty(INCLUDE_GENERATED_FILES)) {
            sources.addAll(infra.sourceCode.files.filter(JavaCodeFile).map[fileName])
        }
        sources.addAll(environment.getProperty(SOURCES)?:emptyList)
        val sourceFiles = sources.map[new File(infra.generatedCodeFolder, it)].toList
        
        logger.println("Files:")
        for (sourceFile : sourceFiles) {
            if (sourceFile.file) {
                sourcePaths += infra.generatedCodeFolder.toPath.relativize(sourceFile.toPath).toString
            } else if (sourceFile.directory) {
                for (path : Files.find(sourceFile.toPath, Integer.MAX_VALUE, [ filePath, fileAttr |
                    return fileAttr.regularFile && filePath.fileName.toString.endsWith(".java")
                ]).iterator.toIterable) {
                    sourcePaths += infra.generatedCodeFolder.toPath.relativize(path).toString
                }
            } else {
                environment.errors.add("Source location does not exist: " + sourceFile)
                logger.println("ERROR: Source location does not exist: " + sourceFile)
            }
        }
        sourcePaths.forEach[logger.println("  " + it)]
        
        val javac = newArrayList(environment.getProperty(JAVAC_PATH)?:JAVAC_PATH.^default)
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
        var success = javac.invoke(infra.generatedCodeFolder)?:-1 == 0
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
            
            val jar = newArrayList(environment.getProperty(JAR_PATH)?:JAR_PATH.^default)
            jar += "cvfe"
            jar += targetJarPath
            jar += entryPoint
            for (sourceFile : sourceFiles) {
                val path = infra.generatedCodeFolder.toPath.relativize(sourceFile.toPath).toString
                if (sourceFile.isFile) {
                    jar += path.replace(".java", ".class")
                    // Find anonymous inner classes
                    val innerClassPrefix = sourceFile.name.substring(0, sourceFile.name.length - 5)+ "$"
                    for (siblingPath : Files.find(binFolder.toPath, 1, [ filePath, fileAttr |
                        val name = filePath.fileName.toString
                        return fileAttr.regularFile && name.startsWith(innerClassPrefix) && name.endsWith(".class")
                    ]).iterator.toIterable) {
                        jar += binFolder.toPath.relativize(siblingPath).toString
                    }
                } else {
                    jar += path
                }
            }
            
            // Run javac compiler
            success = jar.invoke(binFolder)?:-1 == 0
            if (!success) {
                environment.errors.add("Compiler did not return success (exit value != 0)")
                logger.println("Compilation failed")
            }
            
            model = new ExecutableJarContainer(targetJar)
        } else {
            model = new ExecutableContainer(new File(sources.head))
        }
        
        // report
        logger.closeLog("java-compiler-report.log").snapshot
        infra.refresh
    }

    
}