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

import de.cau.cs.kieler.annotations.Pragmatable
import de.cau.cs.kieler.annotations.StringPragma
import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.properties.Property
import de.cau.cs.kieler.kicool.compilation.CodeContainer
import de.cau.cs.kieler.kicool.compilation.Processor
import de.cau.cs.kieler.kicool.compilation.ProcessorType
import de.cau.cs.kieler.kicool.deploy.Logger
import de.cau.cs.kieler.kicool.deploy.ProjectInfrastructure
import java.io.File
import java.io.FileWriter
import org.eclipse.xtend.lib.annotations.Accessors

import static de.cau.cs.kieler.kicool.deploy.TemplatePosition.*

import static extension de.cau.cs.kieler.kicool.deploy.TemplateInjection.*

/**
 * @author ssm
 * @kieler.design 2018-11-22 proposed
 * @kieler.rating 2018-11-22 proposed yellow
 */
class ModelIncludes extends Processor<Object, CodeContainer> {

// TODO: This looks pretty similar to the AbstractTemplateGeneratorProcessor. Think about a good inheritance structure.
    public static val PRAGMA_INCLUDE = "include"
    public static val PRAGMA_LIBINCLUDE = "libinclude"
    
    public static val TEMPLATE_FILE_NAME = "model-includes.ftl"
    @Accessors var String genFolder = "templates-gen"
    
    public static val IProperty<String> INCLUDES_FORMAT = 
        new Property<String>("de.cau.cs.kieler.deploy.model.includes.format", "#include \"%s\"")    
    public static val IProperty<String> LIBINCLUDES_FORMAT = 
        new Property<String>("de.cau.cs.kieler.deploy.model.includes.format", "#include <%s>")  
          
    val logger = new Logger
    
    override getType() {
        return ProcessorType.EXOGENOUS_TRANSFORMATOR
    }
    
    override getId() {
        "de.cau.cs.kieler.kicool.deploy.model.includes"
    }
    
    override getName() {
        "Model Includes"
    }
    
    override process() {
        val infra = ProjectInfrastructure.getProjectInfrastructure(environment)
        if (infra.generatedCodeFolder === null) {
            return
        } else {
            infra.log(logger)
        }      
        
        val context = getCompilationContext
        val pragmaProcessor = context.getLastProcessorForResultType(typeof(Pragmatable))
        
        var save = false
        val cc = new CodeContainer
        var code = 
            '''
            <#macro model_includes_header position>
            '''
        
        if (pragmaProcessor !== null) {
            val pragmatable = pragmaProcessor.environment.model as Pragmatable
            val clearProp = environment.getProperty(ProjectSetup.CLEAR)?:newLinkedList
            val copyProp = environment.getProperty(ProjectSetup.COPY)?:newHashMap
            
            for (inc : pragmatable.pragmas.filter[ name == PRAGMA_LIBINCLUDE ].filter(StringPragma).toList) {
                code += String.format(environment.getProperty(LIBINCLUDES_FORMAT), inc.values.head) + "\n"
                save = true
            } 
            for (inc : pragmatable.pragmas.filter[ name == PRAGMA_INCLUDE ].filter(StringPragma).toList) {
                clearProp.add(inc.values.head)
                copyProp.put(infra.modelFile.parentFile.toURI + inc.values.head, inc.values.head)
                code += String.format(environment.getProperty(INCLUDES_FORMAT), inc.values.head) + "\n"
                save = true
            } 
        
            environment.setProperty(ProjectSetup.CLEAR, clearProp)
            environment.setProperty(ProjectSetup.COPY, copyProp)
        }
        
        code += '''</#macro>'''
        
        cc.add(TEMPLATE_FILE_NAME, code)
        
        if (save) {
            environment.addIncludeInjection(TEMPLATE_FILE_NAME.relativeTemplatePath)
            environment.addMacroInjection(HEADER, "model_includes_header")
            
            val folder = new File(infra.generatedCodeFolder, genFolder)
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
        }
        
        logger.saveLog(environment, "model-includes-template.log")
        model = cc
    }
    
    def relativeTemplatePath(String fileName) {
        // First slash is important for freemarker to look into the base directory
        return "/" + genFolder + "/" + fileName
    }
}