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
import de.cau.cs.kieler.core.Platform

import static extension de.cau.cs.kieler.kicool.deploy.Logger.*
import static extension de.cau.cs.kieler.kicool.deploy.InfrastructureMacroNames.*

/**
 * @author ssm
 * @kieler.design 2019-05-15 proposed
 * @kieler.rating 2019-05-15 proposed yellow
 */
class NXJCompiler extends AbstractSystemCompilerProcessor<Object, GenericCompilationResult> {


    public static val IProperty<String> NXJ_PATH_NXJC = 
        new Property<String>("de.cau.cs.kieler.kicool.deploy.compiler.nxj.nxjc.path", 
        if (Platform.isWindows) "nxjc.bat" else "nxjc")
    public static val IProperty<String> NXJ_PATH_NXJLINK = 
        new Property<String>("de.cau.cs.kieler.kicool.deploy.compiler.nxj.nxjlink.path", 
        if (Platform.isWindows) "nxjlink.bat" else "nxjlink")
    public static val IProperty<String> NXJ_PATH_NXJUPLOAD = 
        new Property<String>("de.cau.cs.kieler.kicool.deploy.compiler.nxj.nxjupload.path", 
        if (Platform.isWindows) "nxjupload.bat" else "nxjupload")
    public static val IProperty<Boolean> NXJ_RUN_ON_UPLOAD = 
        new Property<Boolean>("de.cau.cs.kieler.kicool.deploy.compiler.nxj.runOnUpload", true)
    public static val IProperty<Boolean> NXJ_DIRECT_BLUETOOTH_UPLOAD = 
        new Property<Boolean>("de.cau.cs.kieler.kicool.deploy.compiler.nxj.directBluetoothUpload", false)


   
    override getId() {
        "de.cau.cs.kieler.kicool.deploy.compiler.nxj"
    }
    
    override getName() {
        "NXJ Compiler"
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
        logger.println("== Compiling source files (NXJ) ==")
        
        val sources = newArrayList
        val sourcePaths = newLinkedHashSet
        val iDir = newLinkedHashSet
        
        sources.addAll(environment.getProperty(SOURCES)?.map[ resolveMacros(infra) ]?:emptyList)
        
        logger.println("Files:")
        for (source : sources) {
            val sourceFile = new File(infra.generatedCodeFolder, source)
            if (sourceFile.file) {
                sourcePaths += infra.generatedCodeFolder.toPath.relativize(sourceFile.toPath).toString
            } else if (sourceFile.directory) {
                for (path : Files.find(sourceFile.toPath, Integer.MAX_VALUE, [ filePath, fileAttr |
                    return fileAttr.regularFile && filePath.fileName.toString.endsWith(".java")
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
        
        val nxjc = newArrayList(environment.getProperty(NXJ_PATH_NXJC)?:NXJ_PATH_NXJC.^default)
//        if (environment.getProperty(NXJ_RUN_ON_UPLOAD)) nxj += "-r"
        nxjc += sourcePaths
        
        val className = sourcePaths.head.replaceAll("\\.java$", "")
        val nxjlink = newArrayList(environment.getProperty(NXJ_PATH_NXJLINK)?:NXJ_PATH_NXJLINK.^default)
        nxjlink += "-o"
        nxjlink += className + ".nxj"
        nxjlink += className
        
        val nxjupload = newArrayList(environment.getProperty(NXJ_PATH_NXJUPLOAD)?:NXJ_PATH_NXJUPLOAD.^default)
        if (environment.getProperty(NXJ_RUN_ON_UPLOAD)) nxjupload += "-r"
        if (environment.getProperty(NXJ_DIRECT_BLUETOOTH_UPLOAD)) nxjupload += "-b"
        nxjupload += className + ".nxj"
        
        
        // Run arduino compiler
        escapeOptions = false
        var success = nxjc.invoke(infra.generatedCodeFolder)?:-1 == 0
        if (!success) {
            environment.errors.add("Compiler did not return success (exit value != 0)")
            logger.println("Compilation failed!")
        } else {
            logger.println("Compilation successful!")
        }
        
        logger = logger.intermediateLog("nxj-compiler-report.log").snapshot.newLogger("== Linking (NXJ) ==")
        
        if (success) {
            success = nxjlink.invoke(infra.generatedCodeFolder)?:-1 == 0
            if (!success) {
                environment.errors.add("Linker did not return success (exit value != 0)")
                logger.println("Linking failed!")
            } else {
                logger.println("Linking successful!")
            }
            
            logger = logger.intermediateLog("nxj-linking-report.log").snapshot.newLogger("== Uploading (NXJ) ==")
            
            if (success) {
                success = nxjupload.invoke(infra.generatedCodeFolder)?:-1 == 0
                if (!success) {
                    environment.errors.add("Uploader did not return success (exit value != 0)")
                    logger.println("Upload failed!")
                } else {
                    logger.println("Upload successful!")
                }
                
                logger.intermediateLog("nxj-upload-report.log").snapshot
            }
        }
        
        // Create model
        model = new GenericCompilationResult
        
        infra.refresh
    }

    
}