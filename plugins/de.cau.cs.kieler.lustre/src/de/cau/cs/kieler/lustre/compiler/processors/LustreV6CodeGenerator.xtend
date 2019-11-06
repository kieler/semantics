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
package de.cau.cs.kieler.lustre.compiler.processors

import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.properties.Property
import de.cau.cs.kieler.kicool.compilation.CodeContainer
import de.cau.cs.kieler.kicool.compilation.codegen.CodeGeneratorNames
import de.cau.cs.kieler.kicool.deploy.ProjectInfrastructure
import de.cau.cs.kieler.kicool.deploy.processor.AbstractSystemCompilerProcessor
import de.cau.cs.kieler.lustre.LustreStandaloneSetup
import de.cau.cs.kieler.lustre.compiler.LustreV6Compiler
import de.cau.cs.kieler.lustre.lustre.LustreProgram
import de.cau.cs.kieler.lustre.lustre.NodeDeclaration
import java.io.File
import java.nio.file.Files
import java.util.List
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.xmi.XMLResource
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.resource.XtextResourceSet

import static extension de.cau.cs.kieler.kicool.deploy.ProjectInfrastructure.*

/**
 * @author lgr
 */
class LustreV6CodeGenerator extends AbstractSystemCompilerProcessor<LustreProgram, CodeContainer> {

    public static val ID = "de.cau.cs.kieler.lustre.compiler.v6.c"
        
    public static val IProperty<Boolean> HAS_STATE = 
        new Property<Boolean>("de.cau.cs.kieler.lustre.compiler.v6.hasState", true)

    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    
    override getId() {
        return ID
    }
    
    override getName() {
        "V6 Lustre Compiler"
    }
    
    override process() {
        // Setup project infrastructure
        val infra = ProjectInfrastructure.getProjectInfrastructure(environment)
        if (infra.generatedCodeFolder === null) {
            return
        } else {
            infra.log(logger)
        }
        
        // setup
        logger.println
        logger.println("== Setting up Lustre source file ==")
        
        var resource = sourceModel.eResource
        val modelName = sourceModel.nodes.head.valuedObjects.head.name
        environment.setProperty(HAS_STATE, (sourceModel.nodes.head as NodeDeclaration).hasState)
        
        var File sourceFile
        
        if (resource !== null) {
            sourceFile = infra.findResourceLocation(resource)
        }
        
        if (sourceFile === null) {
            sourceFile = new File(infra.generatedCodeFolder, modelName + LustreV6Compiler.LUSTRE_EXTENSION)
            logger.println("Serializing Lustre program to " + sourceFile.toString)
            
            // Serialize
            val uri = URI.createURI(sourceFile.toURI.toString)
            val resourceSet = LustreStandaloneSetup.doSetup().getInstance(XtextResourceSet)
                    
            // create model resource
            val xresource = resourceSet.createResource(uri) as XtextResource
            xresource.getContents().add(sourceModel)
    
            // save
            val saveOptions = <String, String>newHashMap
            saveOptions.put(XMLResource.OPTION_ENCODING, "UTF-8")
            xresource.save(saveOptions)
        } else {
            if (!sourceFile.name.endsWith(LustreV6Compiler.LUSTRE_EXTENSION)) {
                environment.errors.add("Resource containing the input model has not the file extension " + LustreV6Compiler.LUSTRE_EXTENSION)
                logger.println("ERROR: Resource containing the input model has not the file extension " + LustreV6Compiler.LUSTRE_EXTENSION)
            }
            if (sourceFile.parentFile.equals(infra.generatedCodeFolder)) {
                logger.println("Lustre source file already located at the right position")
            } else {
                val src = sourceFile
                val dest = new File(infra.generatedCodeFolder, sourceFile.name)
                logger.println("Copying Lustre source file to " + dest)
                src.copyFile(dest, logger, true)
                sourceFile = dest
            }
        }
        
        // lustre
        logger.println
        logger.println("== Compiling Lustre ==")
        
        val sources = newArrayList(sourceFile)
        
        for (addSource : environment.getProperty(SOURCES)?:emptyList) {
            val addSourceFile = new File(infra.generatedCodeFolder, addSource)
            if (addSourceFile.file) {
                sources += infra.generatedCodeFolder.toPath.relativize(addSourceFile.toPath).toFile
            } else if (addSourceFile.directory) {
                for (path : Files.find(addSourceFile.toPath, Integer.MAX_VALUE, [ filePath, fileAttr |
                    return fileAttr.regularFile && filePath.fileName.toString.endsWith(LustreV6Compiler.LUSTRE_EXTENSION)
                ]).iterator.toIterable) {
                    sources += infra.generatedCodeFolder.toPath.relativize(path).toFile
                }
            } else {
                environment.errors.add("Source location does not exist: " + addSourceFile)
                logger.println("ERROR: Source location does not exist: " + addSourceFile)
            }
        }
        
        sources.removeIf[!it.name.endsWith(LustreV6Compiler.LUSTRE_EXTENSION)]
        
        logger.println("Files:")
        sources.forEach[logger.println("  " + it)]
        
        logger.println("Setup Lustre compiler")
        val compiler = new LustreV6Compiler(environment)
        if (compiler === null || !compiler.available) {
            environment.errors.add("The " + compiler?.name  + " Lustre compiler is not supported on this operating system!")
            logger.println("ERROR: The " + compiler?.name  + " Lustre compiler is not supported on this operating system!")
        } else {
            compiler.setup(infra, logger)
            if (!compiler.isProperlySetUp) {
                environment.errors.add("The " + compiler?.name  + " could not be initialized properly.")
                logger.println("ERROR: The " + compiler?.name  + " could not be initialized properly.")
            }
            
            logger.println("Running compilation")             
            val options = <String>newArrayList
            if (!environment.getProperty(ADDITIONAL_OPTIONS).nullOrEmpty) {
                val args = environment.getProperty(ADDITIONAL_OPTIONS)
                if (args.contains(" ")) {
                    options += args.split(" ")
                } else {
                    options += args
                }
            }
            
            // Run lustre compiler
            var success = compiler.generateCodeCommand(sources, options).invoke(infra.generatedCodeFolder)?:-1 == 0
            if (!success) {
                environment.errors.add(
                    "Compiler did not return success (exit value != 0)" + 
                    "\nEither the source code cannot be compiled or the Luster compiler cannot be found." +
                    "\nPlease check the KiCo log for further details."
                )
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
            
            // Create model for sh file
            model = new CodeContainer
            for (targetCode : targetCodes) {
                if (targetCode.name.endsWith(".c") || targetCode.name.endsWith(".h")) {
                    targetModel.addProxyCCodeFile(targetCode) => [
                        naming.put(CodeGeneratorNames.TICKDATA, modelName)
                    ]
                } else if (targetCode.name.endsWith(".sh")) {
                    targetModel.addProxy(targetCode)
                }            
                infra.sourceCodeFiles += targetCode
            }
            infra.sourceCode = targetModel
        }

        // report
        var log = logger.saveLog(environment, "lustre-compiler.log")
        if (log.code.contains("is declared as a node, but it uses no memory (i.e., it is a function)")) {
            environment.setProperty(HAS_STATE, false)
        }
        
        infra.refresh
    }
    
    override createProcessBuilder(List<String> command, File directory) {
        val pb = super.createProcessBuilder(command, directory)
        
        val compiler = new LustreV6Compiler(environment)
        if (compiler !== null) compiler.configureEnvironment(pb.environment) 
        
        return pb        
    }
    
}