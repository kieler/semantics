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
package de.cau.cs.kieler.kicool.processors.ast

import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.properties.Property
import de.cau.cs.kieler.kicool.deploy.ProjectInfrastructure
import java.io.File
import java.nio.file.Files
import de.cau.cs.kieler.kicool.deploy.processor.AbstractSystemCompilerProcessor
import de.cau.cs.kieler.kicool.deploy.processor.CCompiler
import de.cau.cs.kieler.kicool.compilation.CodeContainer

/**
 * @author ssm
 * @kieler.design 2019-04-23 proposed
 * @kieler.rating 2019-04-23 proposed yellow
 */
class GCCAST extends AbstractSystemCompilerProcessor<CodeContainer, CodeContainer> {

    public static val IProperty<String> RAW_AST_NAME = 
        new Property<String>("de.cau.cs.kieler.kicool.ast.raw.name", "ast")

    override getId() {
        "de.cau.cs.kieler.kicool.ast.gcc"
    }
    
    override getName() {
        "GCC AST"
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
        val debugFolder = infra.createDebugFolder(true)
        
        logger.println
        logger.println("== Compiling source files (GCC) ==")
        
        val sources = newArrayList
        val sourcePaths = newLinkedHashSet
        val iDir = newLinkedHashSet
        
//        if (environment.getProperty(INCLUDE_GENERATED_FILES)) {
//            sources.addAll(infra.sourceCode.files.filter(CCodeFile).filter[!header].map[fileName])
//        }
        sources.addAll(environment.getProperty(SOURCES)?:emptyList)
        sourcePaths.add(infra.modelFile.toString)
        
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
        
        if (!iDir.empty) {
            logger.println("Include directories:") 
            iDir.forEach[logger.println("  " + it)] 
        }

        val targetExe = new File(binFolder, environment.getProperty(CCompiler.EXE_NAME)?:CCompiler.EXE_NAME.^default)
        val targetExePath = infra.generatedCodeFolder.toPath.relativize(targetExe.toPath).toString
        logger.println("Target exe file: " + targetExe)        
        val targetAST = new File(debugFolder, environment.getProperty(RAW_AST_NAME)?:RAW_AST_NAME.^default)
        val targetASTPath = infra.generatedCodeFolder.toPath.relativize(targetAST.toPath).toString
        logger.println("Target AST file: " + targetAST)
        
        val gcc = newArrayList(environment.getProperty(CCompiler.CC_PATH)?:CCompiler.CC_PATH.^default)
        gcc += "-std=c99"
        gcc += "-lm"
        gcc += "-v"
        gcc += "-Wall"
        gcc += "-fdump-tree-original-raw=" + targetASTPath
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
        var success = gcc.invoke(infra.generatedCodeFolder)?:-1 == 0
        if (!success) {
            environment.errors.add("Compiler did not return success (exit value != 0)")
            logger.println("Compilation failed")
        }
        
        // report
        logger.saveLog(environment, "gcc-compiler-report.log")
        infra.refresh
    }

}