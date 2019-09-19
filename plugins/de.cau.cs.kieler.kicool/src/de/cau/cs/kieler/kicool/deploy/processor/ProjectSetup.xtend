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
import de.cau.cs.kieler.kicool.compilation.CodeContainer
import de.cau.cs.kieler.kicool.compilation.InplaceProcessor
import de.cau.cs.kieler.kicool.deploy.Logger
import de.cau.cs.kieler.kicool.deploy.ProjectInfrastructure
import java.io.File
import java.io.FileWriter
import java.io.PrintStream
import java.util.List
import java.util.Map
import org.eclipse.emf.common.util.URI

import static extension de.cau.cs.kieler.kicool.deploy.ProjectInfrastructure.*

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class ProjectSetup extends InplaceProcessor<CodeContainer> {

    public static val IProperty<List<String>> CLEAR = 
        new Property<List<String>>("de.cau.cs.kieler.kicool.deploy.setup.clear", null)
    
    public static val IProperty<Map<String, String>> COPY = 
        new Property<Map<String, String>>("de.cau.cs.kieler.kicool.deploy.setup.copy", null)
        
    public static val IProperty<Boolean> SAVE = 
        new Property<Boolean>("de.cau.cs.kieler.kicool.deploy.setup.save.input", true)
    
    val logger = new Logger
    
    override getId() {
        "de.cau.cs.kieler.kicool.deploy.setup"
    }
    
    override getName() {
        "Project Setup"
    }
    
    override process() {
        // Setup project infrastructure
        val infra = ProjectInfrastructure.getProjectInfrastructure(environment)
        if (infra.generatedCodeFolder === null) {
            return
        } else {
            infra.log(logger)
        }
        
        // Tasks
        if (environment.getProperty(SAVE)) {
            infra.saveCode(logger)
        }
        infra.clearTask(logger)    
        infra.copyTask(logger)
        
        // refresh project
        infra.refresh
        
        // report
        logger.saveLog(environment, "setup-report.log")
    }
    
    // ---------------
    // -- SAVE CODE --
    // ---------------
    
    protected def saveCode(ProjectInfrastructure infra, PrintStream logger) {
        logger.println("== Save Generated Code ==")
        
        for (file : model.files) {
            logger.println("Saving " + file.fileName)
            try {
                val target = new File(infra.generatedCodeFolder, file.fileName)
                val writer = new FileWriter(target)
                writer.write(file.code)
                writer.close
                
                infra.sourceCodeFiles += target
                infra.sourceCode = model
            }  catch (Exception e) {
                environment.errors.add("Can not save file " + file.fileName, e)
                logger.print("ERROR: Can not save file " + file.fileName)
                e.printStackTrace(logger)
            }
        }
        
        logger.println
    }
    
    // ------------------
    // -- COPY FILE(S) --
    // ------------------    
    
    protected def copyTask(ProjectInfrastructure infra, PrintStream logger) {
        val copyMap = environment.getProperty(COPY)?:emptyMap
        if (!copyMap.empty) {
            logger.println("== Copy Environment ==")

            for (entry : copyMap.entrySet) {
                val target = new File(infra.generatedCodeFolder, entry.value)
                logger.println("Copying from " + entry.key + " to " + infra.getProjectRelativeFile(target))
                var URI source = null
                try {
                    source = URI.createURI(entry.key)
                } catch (Exception e) {
                    environment.errors.add("Can not parse source URI in copy task", e)
                    logger.print("ERROR: Can not parse source URI in copy task")
                    e.printStackTrace(logger)
                }
                
                try {
                    if (source.file) {
                        val sourceFile = new File(source.toFileString)
                        val success = if (sourceFile.file) {
                            sourceFile.copyFile(target, logger, true)
                        } else {
                            sourceFile.copyFolder(target, logger, true)
                        }
                        if (!success) environment.errors.add("Copying file(s) was not successful!")
                    } else if (source.platformPlugin) {
                        val success = if (source.fileExtension.nullOrEmpty) {
                            source.copyFolder(target, logger, true)
                        } else {
                            source.copyFile(target, logger, true)
                        }
                        if (!success) environment.errors.add("Copying file(s) was not successful!")
                    } else {
                        target.mkdirs
                        environment.errors.add("Source URI format is not supported")
                        logger.print("ERROR: Source URI format is not supported")
                    }
                } catch (Exception e) {
                    environment.errors.add("Error while copying file(s)", e)
                    logger.print("ERROR: Exception while copying file(s)")
                    e.printStackTrace(logger)
                }
                logger.println
            }
            
            logger.println
        }
    }
    
    // -------------------
    // -- CLEAR FILE(S) --
    // -------------------    
    
    protected def clearTask(ProjectInfrastructure infra, PrintStream logger) {
        val clearList = environment.getProperty(CLEAR)?:emptyList
        if (!clearList.empty) {
            logger.println("== Clear Environment ==")
            
            for (entry : clearList) {
                val target = new File(infra.generatedCodeFolder, entry)
                val success = target.deleteRecursively(logger)
                if (!success) environment.errors.add("Error while clearing file(s)")
                logger.println
            }
            
            logger.println
        }
    }

}