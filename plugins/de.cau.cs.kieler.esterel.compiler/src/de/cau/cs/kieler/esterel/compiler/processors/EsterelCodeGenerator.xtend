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

import de.cau.cs.kieler.esterel.EsterelProgram
import de.cau.cs.kieler.esterel.EsterelStandaloneSetup
import de.cau.cs.kieler.esterel.compiler.InriaEsterelCompiler
import de.cau.cs.kieler.kicool.compilation.CodeContainer
import de.cau.cs.kieler.kicool.deploy.ProjectInfrastructure
import de.cau.cs.kieler.kicool.deploy.processor.AbstractSystemCompilerProcessor
import de.cau.cs.kieler.kicool.deploy.processor.ProjectSetup
import java.io.File
import java.nio.file.Files
import java.util.List
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.xmi.XMLResource
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.resource.XtextResourceSet

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class EsterelCodeGenerator extends AbstractSystemCompilerProcessor<EsterelProgram, CodeContainer> {
    
    public static val ID = "de.cau.cs.kieler.esterel.compiler.inria.c"

    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    
    override getId() {
        return ID
    }
    
    override getName() {
        "Inria Esterel Compiler"
    }
    
    override process() {
        // Setup project infrastructure
        val infra = ProjectInfrastructure.getProjectInfrastructure(environment)
        if (infra.generadedCodeFolder === null) {
            return
        } else {
            infra.log(logger)
        }
        
        // setup
        logger.println
        logger.println("== Setting up Esterel source file ==")
        
        var resource = sourceModel.eResource
        var File sourceFile
        
        if (resource !== null) {
            sourceFile = infra.findResourceLocation(resource)
        }
        
        if (sourceFile === null) {
            sourceFile = new File(infra.generadedCodeFolder, sourceModel.modules.head.name + InriaEsterelCompiler.ESTEREL_EXTENSION)
            logger.println("Serializing Esterel program to " + sourceFile.toString)
            
            // Serialize
            val uri = URI.createURI(sourceFile.toURI.toString)
            val resourceSet = EsterelStandaloneSetup.doSetup().getInstance(XtextResourceSet)
                    
            // create model resource
            val xresource = resourceSet.createResource(uri) as XtextResource
            xresource.getContents().add(sourceModel)
    
            // save
            val saveOptions = <String, String>newHashMap
            saveOptions.put(XMLResource.OPTION_ENCODING, "UTF-8")
            xresource.save(saveOptions)
        } else {
            if (!sourceFile.name.endsWith(InriaEsterelCompiler.ESTEREL_EXTENSION)) {
                environment.errors.add("Resource containing the input model has not the file extension " + InriaEsterelCompiler.ESTEREL_EXTENSION)
                logger.println("ERROR: Resource containing the input model has not the file extension " + InriaEsterelCompiler.ESTEREL_EXTENSION)
            }
            if (sourceFile.parentFile.equals(infra.generadedCodeFolder)) {
                logger.println("Esterel source file already located at the right position")
            } else {
                val src = sourceFile
                val dest = new File(infra.generadedCodeFolder, sourceFile.name)
                logger.println("Copying Esterel source file to " + dest)
                ProjectSetup.copyFile(src, dest, logger, true)
                sourceFile = dest
            }
        }
        
        // esterel
        logger.println
        logger.println("== Compiling Esterel ==")
        
        val sources = newArrayList(sourceFile)
        
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
        
        sources.removeIf[!it.name.endsWith(InriaEsterelCompiler.ESTEREL_EXTENSION)]
        
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
        
        // Run esterel compiler
        var success = compiler.generateCodeCommand(sources, options).invoke(infra.generadedCodeFolder)?:-1 == 0
        if (!success) {
            environment.errors.add("Compiler did not return success (exit value != 0)")
            logger.println("Compilation failed")
        }
        
        // Find result
        val targetCodes = compiler.getExpectedResults(sources)
        for (targetCode : targetCodes) {
            if (!targetCode.exists || !targetCode.file) {
                environment.errors.add("Cannot find generated code at " + targetCode.toString)
                logger.println("ERROR: Cannot find generated code at " + targetCode.toString)
            }
        }
        
        // Create model
        model = new CodeContainer
        for (targetCode : targetCodes) {
            targetModel.addProxyCCodeFile(targetCode)
            infra.sourceCodeFiles += targetCode
        }
        infra.sourceCode = targetModel
        
        // report
        logger.closeLog("esterel-compiler-report.log").snapshot
        infra.refresh
    }
    
    override createProcessBuilder(List<String> command, File directory) {
        val pb = super.createProcessBuilder(command, directory)
        
        val compiler = new InriaEsterelCompiler(environment)
        if (compiler !== null) compiler.configureEnvironment(pb.environment) 
        
        return pb        
    }
    
}