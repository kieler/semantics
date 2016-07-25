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

import com.google.common.base.Charsets
import com.google.common.io.CharStreams
import de.cau.cs.kieler.prom.launchconfig.KiCoLaunchConfig
import java.io.ByteArrayInputStream
import java.io.FileInputStream
import java.io.IOException
import java.io.InputStream
import java.io.InputStreamReader
import java.net.URL
import java.util.Map
import org.eclipse.core.resources.IFolder
import org.eclipse.core.runtime.QualifiedName
import org.eclipse.jdt.core.IJavaProject
import org.eclipse.jdt.core.JavaCore
import org.eclipse.ui.plugin.AbstractUIPlugin
import org.osgi.framework.BundleActivator
import org.osgi.framework.BundleContext

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
        KiCoLaunchConfig.initializeVariables()
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
        if(!filePathOrURL.isNullOrEmpty){
            
            // Load contents either from platform url or file path
            if (filePathOrURL.trim.startsWith("platform:")) {
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
                val contents = streamToString(inputStream)
                inputStream.close()
                
                // Replace placeholders
                var contentsWithoutPlaceholders = contents
                for(placeholder : placeholderReplacement.keySet) {
                    contentsWithoutPlaceholders = contentsWithoutPlaceholders.replace(placeholder, placeholderReplacement.get(placeholder))
                }
                val stream = stringToStream(contentsWithoutPlaceholders)
                return stream
            } else {
                return inputStream
            }    
        }
    }
    
    /**
     * Reads all text from the given input stream.
     * 
     * @param inputStream The input stream
     * @return the complete text of the stream
     */
    def private static String streamToString(InputStream inputStream) {
        var text = "";
        val reader = new InputStreamReader(inputStream, Charsets.UTF_8)
        try {
            text = CharStreams.toString(reader);
        } catch (IOException e) {
            e.printStackTrace()
        }
        reader.close()
        return text
    }
    
    /**
     * Creates an input stream for a string.
     * 
     * @param text The string
     * @return a stream for the text
     */
    def private static InputStream stringToStream(String text) {
        val stream = new ByteArrayInputStream(text.getBytes());
        return stream
    }
    
    /**
     * Adds a folder of a java project to the build path source folders.
     * 
     * @param javaProject The java project
     * @param sourceFolder The source folder to be added
     */
    public static def void addFolderToJavaClasspath(IJavaProject javaProject, IFolder sourceFolder) {
        val root = javaProject.getPackageFragmentRoot(sourceFolder);
        val oldEntries = javaProject.getRawClasspath();
        val newEntries = newArrayOfSize(oldEntries.length + 1);
        System.arraycopy(oldEntries, 0, newEntries, 0, oldEntries.length);
        newEntries.set(oldEntries.length, JavaCore.newSourceEntry(root.getPath()));
        javaProject.setRawClasspath(newEntries, null);
    }
}
