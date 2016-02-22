/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.prom.common

import java.io.FileInputStream
import java.io.InputStream
import java.net.URL
import java.util.Map
import org.apache.commons.io.FilenameUtils
import org.apache.commons.io.IOUtils
import org.eclipse.core.runtime.QualifiedName
import org.eclipse.ui.plugin.AbstractUIPlugin
import org.osgi.framework.BundleActivator
import org.osgi.framework.BundleContext
import org.eclipse.core.variables.VariablesPlugin
import de.cau.cs.kieler.prom.launchconfig.LaunchConfiguration

/**
 * The activator class controls the plug-in life cycle.
 * 
 * @author aas
 */
class PromPlugin extends AbstractUIPlugin implements BundleActivator  {
    
    // The plug-in ID
    public static val ID = "de.cau.kieler.prom"
    
    // The shared instance
    private static PromPlugin plugin;
    
    /**
     * Qualifier used to set the environment name property of a project.
     */
    public static val ENVIRIONMENT_QUALIFIER = new QualifiedName(PromPlugin.ID, "environment")
    
    /**
     * Qualifier used to set the main file's project relative path of a project.
     */
    public static val MAIN_FILE_QUALIFIER = new QualifiedName(PromPlugin.ID, "main.file")

    /**
     * The constructor
     */
    new() {
    }

    /*
     * (non-Javadoc)
     * @see BundleActivator#start(org.osgi.framework.BundleContext)
     */
    override void start(BundleContext context) throws Exception {
        super.start(context);
        plugin = this
        
        // Initialize the variables that can be used in the launch configuration
        LaunchConfiguration.initializeVariables()
    }

    /*
     * (non-Javadoc)
     * @see BundleActivator#stop(org.osgi.framework.BundleContext)
     */
    override void stop(BundleContext context) throws Exception {
        plugin = null
        super.stop(context);
    }
    
    /**
     * Returns the shared instance
     *
     * @return the shared instance
     */
    public static def PromPlugin getDefault() {
        return plugin;
    }
    
    /**
     * Returns an input stream for a file loaded from either a file path or an url path.
     * It is only loaded from an url if the url uses the platform protocol from Eclipse.
     * The contents of the returned input stream optionally may have placeholders which can be directly replaced in this method.
     * 
     * @param filePathOrURL The file path or an URL with the platform protocol
     * @param placeholderReplacement A map where the keys are placeholders of the stream and the values are the values of the placeholders. 
     *
     * @return the loaded input stream
     */
    public static def InputStream getInputStream(String filePathOrURL, Map<String, String> placeholderReplacement) {
        // Get input stream from url
        var InputStream inputStream= null
        if(filePathOrURL != null && filePathOrURL != ""){
            
            // Load contents either from platform url or file path
            if (filePathOrURL.trim().startsWith("platform:")) {
                val url = new URL(filePathOrURL);
                inputStream = url.openStream
            } else {
                inputStream = new FileInputStream(filePathOrURL)
            }
        }

        // Return stream
        if(inputStream != null){
            
            // Return stream of content where all placeholders are replaced with actual values.
            if(placeholderReplacement != null){
                val contents = IOUtils.toString(inputStream)
                inputStream.close()
                
                // Replace placeholders
                var contentsWithoutPlaceholders = contents
                for(placeholder : placeholderReplacement.keySet) {
                    contentsWithoutPlaceholders = contentsWithoutPlaceholders.replace(placeholder, placeholderReplacement.get(placeholder))
                }
            
                return IOUtils.toInputStream(contentsWithoutPlaceholders)
            } else {
                return inputStream
            }    
        }
    }
}
