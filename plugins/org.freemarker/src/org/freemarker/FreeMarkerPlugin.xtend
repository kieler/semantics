package org.freemarker

import freemarker.cache.FileTemplateLoader
import freemarker.cache.MultiTemplateLoader
import freemarker.cache.StringTemplateLoader
import freemarker.template.Configuration
import freemarker.template.TemplateExceptionHandler
import freemarker.template.Version
import java.io.File
import java.util.Locale
import org.osgi.framework.BundleActivator
import org.osgi.framework.BundleContext

/**
 * Plugin and interface to use the FreeMarker template engine.
 * @author aas
 */
class FreeMarkerPlugin implements BundleActivator {
    static BundleContext context

    /**
     * The last created configuration.
     */
    private static var Configuration configuration
    
    /**
     * The string template loader of the configuration. 
     */
    private static var StringTemplateLoader stringTemplateLoader
    
    /**
     * The file template loader of the configuration.
     */
    private static var FileTemplateLoader fileTemplateLoader
    
    /**
     * Returns the context.
     * @return the context
     */
    def static package BundleContext getContext() {
        return context
    }

    /*
     * (non-Javadoc)
     * @see BundleActivator#start(org.osgi.framework.BundleContext)
     */
    override void start(BundleContext bundleContext) throws Exception {
        FreeMarkerPlugin.context = bundleContext
        
        // Set up template loaders
        newConfiguration("./")
    }
    
    /*
     * (non-Javadoc)
     * @see BundleActivator#stop(org.osgi.framework.BundleContext)
     */
    override void stop(BundleContext bundleContext) throws Exception {
        FreeMarkerPlugin.context = null
    }
    
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
        configuration.setNumberFormat("0.##########")
         
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
