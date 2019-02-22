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
import de.cau.cs.kieler.kicool.deploy.CommonTemplateVariables
import de.cau.cs.kieler.kicool.deploy.ProjectInfrastructure
import freemarker.cache.FileTemplateLoader
import freemarker.template.Configuration
import freemarker.template.TemplateExceptionHandler
import freemarker.template.Version
import java.io.File
import java.io.FileNotFoundException
import java.io.FileWriter
import java.util.Locale
import java.util.Map

import static extension de.cau.cs.kieler.kicool.deploy.TemplateInjection.*

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class TemplateEngine extends AbstractDeploymentProcessor<Object> {
    
    public static val IProperty<Map<String, String>> TEMPLATES = 
        new Property<Map<String, String>>("de.cau.cs.kieler.kicool.deploy.templates", null)
        
    public static val IProperty<Map<String, Object>> GENRAL_ENVIRONMENT = 
        new Property<Map<String, Object>>("de.cau.cs.kieler.kicool.deploy.template.environment", null)

    public static val IProperty<Map<String, Map<String, Object>>> SPECIFIC_ENVIRONMENT = 
        new Property<Map<String, Map<String, Object>>>("de.cau.cs.kieler.kicool.deploy.template.environments", null)
    
    override getId() {
        "de.cau.cs.kieler.kicool.deploy.templates"
    }
    
    override getName() {
        "Template Engine"
    }
    
    override process() {
        // Setup project infrastructure
        val infra = ProjectInfrastructure.getProjectInfrastructure(environment)
        if (infra.generatedCodeFolder === null) {
            return
        } else {
            infra.log(logger)
        }
        
        // Setup template environment
        logger.println("== General Template Environment ==")
        
        val generalTemplateEnvironment = <String, Object>newHashMap
        
        // Defaults
        generalTemplateEnvironment.putAll(CommonTemplateVariables.DEFAULTS)
        val sourceFile = infra.sourceCode.files.head
        if (sourceFile !== null) {
            generalTemplateEnvironment.put(CommonTemplateVariables.MODEL_DATA_FILE, sourceFile.fileName)
            val name = if (sourceFile.fileName.contains(".")) sourceFile.fileName.substring(0, sourceFile.fileName.lastIndexOf(".")) else sourceFile.fileName
            generalTemplateEnvironment.put(CommonTemplateVariables.MODEL_DATA_TYPE, name)
        }
        // Environment
        generalTemplateEnvironment.putAll(environment.getProperty(GENRAL_ENVIRONMENT)?:newHashMap)
        // Genral
        generalTemplateEnvironment.put(CommonTemplateVariables.BASE_DIR, infra.generatedCodeFolder.toString)       
        // Injection
        generalTemplateEnvironment.registerTemplateInjection(environment)
        
        for (entry : generalTemplateEnvironment.entrySet) {
            logger.println(entry.key + ": " + entry.value)
        }
        
        val additionalTemplateEnvironments = environment.getProperty(SPECIFIC_ENVIRONMENT)?:newHashMap
        
        logger.println
        
        // Process Templates
        logger.println("== Processing Templates ==")
        
        val templates = environment.getProperty(TEMPLATES)?:emptyMap
        for (entry : templates.entrySet) {
            val target = new File(infra.generatedCodeFolder, entry.value)
            val relativeTemplatePath = entry.key
            val template = new File(infra.generatedCodeFolder, relativeTemplatePath)
            
            logger.println("Processing template: " + template)
            
            if (!template.file) {
                logger.println("Error: Template file does not exist")
                environment.errors.add("Template file does not exist", new FileNotFoundException(template.toString))
            }
            
            // Run freemarker
            try {
                // prepare output file
                target.parentFile.mkdirs
                val writer = new FileWriter(target)
                
                // prepare environment
                logger.println("Additional environment:")
                val templateEnvironment = newHashMap
                templateEnvironment.putAll(generalTemplateEnvironment)
                
                var Map<String, Object> additionalTemplateEnvironment = newHashMap
                if (additionalTemplateEnvironments.containsKey(entry.value)) {
                    if (additionalTemplateEnvironment instanceof Map<?, ?>) {
                        additionalTemplateEnvironment = additionalTemplateEnvironments.get(entry.value)
                    } else if (additionalTemplateEnvironment !== null) {
                        logger.println("WARNING: Additional template environment is specified but not of type Map<String, String> but " + additionalTemplateEnvironment.class.name)
                    }
                }
                
                additionalTemplateEnvironment.put(CommonTemplateVariables.TARGET, target.toString) 
                additionalTemplateEnvironment.put(CommonTemplateVariables.TARGET_NAME, target.name) 
                additionalTemplateEnvironment.put(CommonTemplateVariables.TARGET_BASENAME, target.name.substring(0, target.name.lastIndexOf("."))) 
                
                templateEnvironment.putAll(additionalTemplateEnvironment)
                for (kv : additionalTemplateEnvironment.entrySet) {
                    logger.println("  " + kv.key + ": " + kv.value)
                }
                
                
                // prepare freemarker
                val freemarkerTemplate = createFreemarkerConfiguration(infra.generatedCodeFolder).getTemplate(relativeTemplatePath)
                // process
                freemarkerTemplate.process(templateEnvironment, writer)
                
                // close
                writer.close
            } catch (Exception e) {
                environment.errors.add("Error while processing template")//, e)
                logger.println("ERROR: Exception while processing template")
                e.printStackTrace(logger)
            }
        }
        
        logger.println        
        
        // refresh project
        infra.refresh
        
        // report
        saveLog("template-report.log")
    }
    
    /**
     * Creates a new configuration and sets its template directory and prepares a string template loader.
     * @return the created configuration.
     */
    protected def Configuration createFreemarkerConfiguration(File templateDirectory) {
        // Configure FreeMarker
        val configuration = new Configuration(new Version(2, 3, 0))
        configuration.defaultEncoding = "UTF-8"
        configuration.locale = Locale.US
        configuration.templateExceptionHandler = TemplateExceptionHandler.RETHROW_HANDLER
        configuration.whitespaceStripping = true
        configuration.numberFormat = "0.##########"
        configuration.classicCompatible = false
        configuration.templateLoader = new FileTemplateLoader(templateDirectory)
        return configuration
    }
}
