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
package de.cau.cs.kieler.esterel.compiler.processors

import de.cau.cs.kieler.core.model.properties.IProperty
import de.cau.cs.kieler.core.model.properties.Property
import de.cau.cs.kieler.esterel.compiler.InriaEsterelCompiler
import de.cau.cs.kieler.kicool.compilation.ExecutableContainer
import de.cau.cs.kieler.kicool.deploy.ProjectInfrastructure
import de.cau.cs.kieler.kicool.deploy.processor.AbstractSystemCompilerProcessor
import java.io.File
import java.nio.file.Files
import java.util.List

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class XESCompiler extends AbstractSystemCompilerProcessor<ExecutableContainer, ExecutableContainer> {
    
    public static val ID = "de.cau.cs.kieler.esterel.compiler.xes"
    
    public static val OBJECT_EXTENSION = ".o"
    
    public static val IProperty<String> EXE_NAME = 
        new Property<String>("de.cau.cs.kieler.esterel.compiler.xes.result", "simulation.exe")

    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    
    override getId() {
        return ID
    }
    
    override getName() {
        "XES Simulation Compiler"
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
        logger.println("== Compiling simulation files (XES) ==")
        
        val sources = newArrayList()
        sources += sourceModel.file
        
        for (addSource : environment.getProperty(SOURCES)?:emptyList) {
            val addSourceFile = new File(infra.generadedCodeFolder, addSource)
            if (addSourceFile.file) {
                sources += infra.generadedCodeFolder.toPath.relativize(addSourceFile.toPath).toFile
            } else if (addSourceFile.directory) {
                for (path : Files.find(addSourceFile.toPath, Integer.MAX_VALUE, [ filePath, fileAttr |
                    return fileAttr.regularFile && filePath.fileName.toString.endsWith(InriaEsterelCompiler.ESTEREL_EXTENSION)
                ]).iterator.toIterable) {
                    sources += infra.generadedCodeFolder.toPath.relativize(path).toFile
                }
            } else {
                environment.errors.add("Source location does not exist: " + addSourceFile)
                logger.println("ERROR: Source location does not exist: " + addSourceFile)
            }
        }
        
        sources.removeIf[!it.name.endsWith(OBJECT_EXTENSION)]
        
        logger.println("Files:")
        sources.forEach[logger.println("  " + it)]
        
        val compiler = new InriaEsterelCompiler(environment)
        if (compiler === null || !compiler.available) {
            environment.errors.add("The " + compiler?.name  + " Esterel compiler is not supported for this operating system")
            logger.println("ERROR: The " + compiler?.name  + " Esterel compiler is not supported for this operating system")
        }
        
        val options = <String>newArrayList
        if (!environment.getProperty(ADDITIONAL_OPTIONS).nullOrEmpty) {
            val args = environment.getProperty(ADDITIONAL_OPTIONS)
            if (args.contains(" ")) {
                options += args.split(" ")
            } else {
                options += args
            }
        }
        
        val targetExe = new File(binFolder, environment.getProperty(EXE_NAME)?:EXE_NAME.^default)
        val targetExePath = infra.generadedCodeFolder.toPath.relativize(targetExe.toPath).toString
        logger.println("Target exe file: " + targetExe)
        
        // Run esterel compiler
        val command = compiler.compileXESCommand(sources, options, targetExePath)
        var success = command.invoke(infra.generadedCodeFolder)?:-1 == 0
        if (!success) {
            environment.errors.add("Compiler did not return success (exit value != 0)")
            logger.println("Compilation failed")
        }
        
        // Create model
        model = new XESExecutableContainer(targetExe, compiler)
        
        // report
        logger.closeLog("xes-compiler-report.log").snapshot
        infra.refresh
    }
    
    override createProcessBuilder(List<String> command, File directory) {
        val pb = super.createProcessBuilder(command, directory)
        
        val compiler = new InriaEsterelCompiler(environment)
        if (compiler !== null) compiler.configureEnvironment(pb.environment) 
        
        return pb        
    }
    
}

class XESExecutableContainer extends ExecutableContainer {
    
    val InriaEsterelCompiler compiler
    
    new(File file, InriaEsterelCompiler compiler) {
        super(file)
        this.compiler = compiler
        this.console = false
    }

    override getEnvironment() {
        val env = <String, String>newHashMap
        compiler.configureEnvironment(env)
        return env
    }
}