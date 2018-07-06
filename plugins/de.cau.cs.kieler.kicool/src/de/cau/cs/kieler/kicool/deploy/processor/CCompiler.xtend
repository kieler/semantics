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
import de.cau.cs.kieler.kicool.compilation.CCodeFile
import de.cau.cs.kieler.kicool.compilation.ExecutableContainer
import de.cau.cs.kieler.kicool.deploy.ProjectInfrastructure
import java.io.File
import java.nio.file.Files

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class CCompiler extends AbstractSystemCompilerProcessor<Object, ExecutableContainer> {
        
    public static val IProperty<String> EXE_NAME = 
        new Property<String>("de.cau.cs.kieler.kicool.deploy.compiler.c.result", "main.exe")
    
    override getId() {
        "de.cau.cs.kieler.kicool.deploy.compiler.c"
    }
    
    override getName() {
        "GCC Compiler"
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
        val binFolder = infra.createBinFolder
        
        // javac
        logger.println
        logger.println("== Compiling source files (GCC) ==")
        
        val sources = newArrayList
        val sourcePaths = newLinkedHashSet
        val iDir = newLinkedHashSet
        
        if (environment.getProperty(INCLUDE_GENERATED_FILES)) {
            sources.addAll(infra.sourceCode.files.filter(CCodeFile).filter[!header].map[fileName])
        }
        sources.addAll(environment.getProperty(SOURCES)?:emptyList)
        
        logger.println("Files:")
        for (source : sources) {
            val sourceFile = new File(infra.generadedCodeFolder, source)
            if (sourceFile.file) {
                sourcePaths += infra.generadedCodeFolder.toPath.relativize(sourceFile.toPath).toString
            } else if (sourceFile.directory) {
                for (path : Files.find(sourceFile.toPath, Integer.MAX_VALUE, [ filePath, fileAttr |
                    return fileAttr.regularFile && filePath.fileName.toString.endsWith(".c")
                ]).iterator.toIterable) {
                    sourcePaths += infra.generadedCodeFolder.toPath.relativize(path).toString
                }
                iDir += infra.generadedCodeFolder.toPath.relativize(sourceFile.toPath).toString
            } else {
                environment.errors.add("Source location does not exist: " + sourceFile)
                logger.println("ERROR: Source location does not exist: " + sourceFile)
            }
        }
        sourcePaths.forEach[logger.println("  " + it)]
        
        if (!iDir.empty) {
            logger.println("Include directories:") 
            iDir.forEach[logger.println("  " + it)] 
        }
        
        val targetExe = new File(binFolder, environment.getProperty(EXE_NAME)?:EXE_NAME.^default)
        val targetExePath = infra.generadedCodeFolder.toPath.relativize(targetExe.toPath).toString
        logger.println("Target exe file: " + targetExe)
        
        val gcc = newArrayList("gcc")
        gcc += "-std=c99"
        gcc += "-lm"
        gcc += "-v"
        gcc += "-Wall"
        gcc += "-o"
        gcc += targetExePath
        if (!iDir.empty) {
            iDir.forEach[ gcc += "-I"+it] 
        }
        if (!environment.getProperty(ADDITIONAL_OPTIONS).nullOrEmpty) {
            val args = environment.getProperty(ADDITIONAL_OPTIONS)
            if (args.contains(" ")) {
                gcc += args.split(" ")
            } else {
                gcc += args
            }
        }
        gcc += sourcePaths
        
        // Run c compiler
        var success = gcc.invoke(infra.generadedCodeFolder)?:-1 == 0
        if (!success) {
            environment.errors.add("Compiler did not return success (exit value != 0)")
            logger.println("Compilation failed")
        }
        
        // Create model
        model = new ExecutableContainer(targetExe)
        
        // report
        logger.closeLog("gcc-compiler-report.log").snapshot
        infra.refresh
    }

    
}