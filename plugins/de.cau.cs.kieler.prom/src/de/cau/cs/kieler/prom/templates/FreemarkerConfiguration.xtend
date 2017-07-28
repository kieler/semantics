/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.prom.templates

import freemarker.cache.FileTemplateLoader
import freemarker.cache.MultiTemplateLoader
import freemarker.cache.StringTemplateLoader
import freemarker.template.Configuration
import freemarker.template.TemplateExceptionHandler
import freemarker.template.Version
import java.util.Locale
import java.io.File

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class FreemarkerConfiguration {
    
    /**
     * The last created configuration.
     */
    private static var Configuration configuration = newConfiguration("./")
    
    /**
     * The string template loader of the configuration. 
     */
    private static var StringTemplateLoader stringTemplateLoader
    
    /**
     * The file template loader of the configuration.
     */
    private static var FileTemplateLoader fileTemplateLoader
    
    
    /**
     * Creates a new configuration and sets its template directory and prepares a string template loader.
     * @return the created configuration.
     */
    public static def newConfiguration(String templateDirectory){
        // Configure FreeMarker
        configuration = new Configuration(new Version(2, 3, 0));
        configuration.defaultEncoding = "UTF-8";
        configuration.locale = Locale.US;
        configuration.templateExceptionHandler = TemplateExceptionHandler.RETHROW_HANDLER
        configuration.whitespaceStripping = true
        configuration.numberFormat = "0.##########"
        configuration.classicCompatible = false
        
        // We want to load templates from files in the directory
        // as well as from simple strings.
        stringTemplateLoader = new StringTemplateLoader();
        fileTemplateLoader = new FileTemplateLoader(new File(templateDirectory));
        
        val loaders = #{ stringTemplateLoader, fileTemplateLoader };
        val mtl = new MultiTemplateLoader(loaders);
        configuration.setTemplateLoader(mtl);
        
        return configuration
    }
    
    /**
     * Returns the string template loader of the last created configuration.
     * @return the string template loader
     */
    public static def getStringTemplateLoader(){
        return stringTemplateLoader
    }
    
    /**
     * Returns the file template loader of the last created configuration.
     * @return the file template loader
     */
    public static def getFileTemplateLoader(){
        return fileTemplateLoader
    }
    
    /**
     * Returns the last created configuration.
     * @return the last created configuration
     */
    public static def getConfiguration(){
        return configuration
    }
}