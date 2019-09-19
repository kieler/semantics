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

import de.cau.cs.kieler.kicool.compilation.CodeContainer
import de.cau.cs.kieler.kicool.compilation.Processor
import de.cau.cs.kieler.kicool.compilation.ProcessorType
import de.cau.cs.kieler.kicool.deploy.Logger
import de.cau.cs.kieler.kicool.deploy.ProjectInfrastructure
import java.io.File
import java.io.FileWriter
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
abstract class AbstractTemplateGeneratorProcessor<I> extends Processor<I, CodeContainer> {
    
    protected val logger = new Logger
    @Accessors var String genFolder = "templates-gen"

    override getType() {
        return ProcessorType.EXOGENOUS_TRANSFORMATOR
    }
    
    override process() {
        // Generate template code
        val infra = ProjectInfrastructure.getProjectInfrastructure(environment)
        if (infra.generatedCodeFolder === null) {
            environment.errors.add("No folder for generated code is available. Check project setup.")
        } else {
            logger.println("== Template Generation ==")
            val cc = generateTemplate()
            
            logger.println
            logger.println("== Save Generated Templates ==")
            
            val folder = new File(infra.generatedCodeFolder, genFolder)
            if (!folder.exists) {
                folder.mkdirs
            }
            logger.println("Destination: " + folder)
            
            for (file : cc.files) {
                logger.println("Saving " + file.fileName)
                try {
                    val targetFile = new File(folder, file.fileName)
                    val writer = new FileWriter(targetFile)
                    writer.write(file.code)
                    writer.close
                }  catch (Exception e) {
                    environment.errors.add("Can not save file " + file.fileName, e)
                    logger.print("ERROR: Can not save file " + file.fileName)
                    e.printStackTrace(logger)
                }
            }
            
            model = cc
        }
        
        logger.saveLog(environment, "template-generation.log")
    }
    
    def CodeContainer generateTemplate()
    
    def relativeTemplatePath(String fileName) {
        // First slash is important for freemarker to look into the base directory
        return "/" + genFolder + "/" + fileName
    }
    
}
