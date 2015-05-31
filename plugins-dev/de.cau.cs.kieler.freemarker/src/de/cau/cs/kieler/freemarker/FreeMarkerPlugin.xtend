package de.cau.cs.kieler.freemarker

import freemarker.cache.FileTemplateLoader
import freemarker.cache.MultiTemplateLoader
import freemarker.cache.StringTemplateLoader
import freemarker.template.Configuration
import freemarker.template.TemplateExceptionHandler
import freemarker.template.Version
import java.io.File
import java.util.Locale
import org.eclipse.xtend.lib.annotations.Accessors
import org.osgi.framework.BundleActivator
import org.osgi.framework.BundleContext

class FreeMarkerPlugin implements BundleActivator {
    static BundleContext context

    @Accessors
    private static var Configuration configuration
    
    private static var StringTemplateLoader stringTemplateLoader
    
    private static var FileTemplateLoader fileTemplateLoader
    
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
        setTemplateDirectory("./")
    }
    
    /*
     * (non-Javadoc)
     * @see BundleActivator#stop(org.osgi.framework.BundleContext)
     */
    override void stop(BundleContext bundleContext) throws Exception {
        FreeMarkerPlugin.context = null
    }
    
    public static def setTemplateDirectory(String dir){
        // Configure FreeMarker
        configuration = new Configuration(new Version(2, 3, 0));
        configuration.setDefaultEncoding("UTF-8");
        configuration.setLocale(Locale.US);
        configuration.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
        configuration.templateExceptionHandler = TemplateExceptionHandler.RETHROW_HANDLER
        
        // We want to load templates from files in the directory
        // as well as from simple strings.
        stringTemplateLoader = new StringTemplateLoader();        
        fileTemplateLoader = new FileTemplateLoader(new File(dir));
        
        val loaders = #{ stringTemplateLoader, fileTemplateLoader };
        val mtl = new MultiTemplateLoader(loaders);
        configuration.setTemplateLoader(mtl);
    }
    
    public static def getStringTemplateLoader(){
        return stringTemplateLoader
    }
    
    public static def getFileTemplateLoader(){
        return fileTemplateLoader
    }  
    
    // This should really be loaded from a resource of this plug-in.
    @Accessors
    public static val assignmentMacros = 
"<#-- init -->\n"+
"<#macro init>\n"+
"   <#assign init_snippet>\n"+
"       <#nested />\n"+
"   </#assign>\n"+
"</#macro>\n"+

"<#-- input -->\n"+
"<#macro input>\n"+
"   <#assign input_snippet>\n"+
"       <#nested />\n"+
"   </#assign>\n"+
"</#macro>\n"+

"<#-- output -->\n"+
"<#macro output>\n"+
"   <#assign output_snippet>\n"+
"       <#nested />\n"+
"   </#assign>\n"+
"</#macro>\n"
}
