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
import org.eclipse.core.resources.IResource
import org.eclipse.core.resources.IContainer
import java.util.List
import org.eclipse.core.resources.IFile
import java.util.ArrayList
import org.eclipse.core.variables.VariablesPlugin
import org.eclipse.core.runtime.Path
import java.io.File
import org.eclipse.core.variables.IStringVariableManager

/**
 * The activator class controls the plug-in life cycle.
 * 
 * @author aas
 */
class PromPlugin extends AbstractUIPlugin implements BundleActivator  {
    
    // The plug-in ID
    public static val ID = "de.cau.cs.kieler.prom"
    
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

    // Variable names
    public static val LAUNCHED_PROJECT_VARIABLE = "launched_project_loc"

    public static val MAIN_FILE_NAME_VARIABLE = "main_name"
    public static val MAIN_FILE_PATH_VARIABLE = "main_path"
    public static val MAIN_FILE_LOCATION_VARIABLE = "main_loc"
    public static val MAIN_FILE_NAME_WITHOUT_FILE_EXTENSION_VARIABLE = "main_name_no_ext"

    public static val COMPILED_MAIN_FILE_NAME_VARIABLE = "compiled_main_name"
    public static val COMPILED_MAIN_FILE_PATH_VARIABLE = "compiled_main_path"
    public static val COMPILED_MAIN_FILE_LOCATION_VARIABLE = "compiled_main_loc"
    public static val COMPILED_MAIN_FILE_NAME_WITHOUT_FILE_EXTENSION_VARIABLE = "compiled_main_name_no_ext"
    
    private static var IStringVariableManager varManager
    
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
        initializeVariables()
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
    
    /**
     * Searches recursively for resources with the same file extension.
     * 
     * @param resources The resources in which the search takes place
     * @param fileExtension The file extension that files must have, or null if all files should be included
     */
    public static def List<IFile> findFiles(IResource[] resources, String fileExtension) {
        return findFiles(resources, #[fileExtension])
    }
    
    /**
     * Searches recursively for resources with the same file extension.
     * 
     * @param resources The resources in which the search takes place
     * @param fileExtensions The file extensions that files must have, or null if all files should be included
     */
    public static def List<IFile> findFiles(IResource[] resources, String[] fileExtension) {
        val ArrayList<IFile> findings = newArrayList()
        for(IResource res : resources) {
            if (res instanceof IContainer) {
                findings.addAll(findFiles(res.members, fileExtension));
            } else if (res instanceof IFile) {
                if(fileExtension == null || fileExtension.contains(res.fileExtension.toLowerCase) ){
                    findings.add(res)
                }
            }
        }
        return findings
    }
    
    /**
     * Sets several eclipse string variables for this launch (e.g. ${main_name}, ${compiled_main_name}).
     * The variables can be used for example in the commands and file paths.
     */
    public static def void setVariables(String projectLocation, String mainFilePath, String compiledMainFilePath) {
        // Set project
        setVariable(LAUNCHED_PROJECT_VARIABLE, projectLocation)

        // Set main file
        val mainFileName = new File(mainFilePath).name
        val mainFileLocation = if(mainFileName != "")
                                   new File(projectLocation + File.separator + mainFilePath).absolutePath
                               else
                                   ""
        val mainFileWithoutExtension = new Path(mainFileName).removeFileExtension.toOSString
        setVariable(MAIN_FILE_NAME_VARIABLE, mainFileName)
        setVariable(MAIN_FILE_LOCATION_VARIABLE, mainFileLocation)
        setVariable(MAIN_FILE_PATH_VARIABLE, mainFilePath)
        setVariable(MAIN_FILE_NAME_WITHOUT_FILE_EXTENSION_VARIABLE, mainFileWithoutExtension)

        // Set compiled main file
        val mainTargetName = new File(compiledMainFilePath).name
        val mainTargetLocation = if(mainTargetName != "")
                                     new File(projectLocation + File.separator + compiledMainFilePath).absolutePath
                                 else
                                    ""
        val mainTargetWithoutExtension = new Path(mainTargetName).removeFileExtension.toOSString
        setVariable(COMPILED_MAIN_FILE_NAME_VARIABLE, mainTargetName)
        setVariable(COMPILED_MAIN_FILE_LOCATION_VARIABLE, mainTargetLocation)
        setVariable(COMPILED_MAIN_FILE_PATH_VARIABLE, compiledMainFilePath)
        setVariable(COMPILED_MAIN_FILE_NAME_WITHOUT_FILE_EXTENSION_VARIABLE, mainTargetWithoutExtension)
    }

    /**
     * Creates or modifies the variable with the given name and data.
     * 
     * @param name The variable's name
     * @param value The variable's value
     * @param description The variable's description 
     */
    public static def void setVariable(String name, String value) {
        val variableManager = VariablesPlugin.getDefault.stringVariableManager
        var variable = variableManager.getValueVariable(name)
        variable.value = value
    }
    
    /**
     * Registers a string variable at the string variable manager.
     * 
     * @param name The name of the variable
     * @param description A short description for the variable
     */
    public static def void initializeVariable(String name, String description) {
        val variable = variableManager.newValueVariable(name, description, false, "")
        variable.description = description
        variableManager.addVariables(#[variable])
    }
     
    /**
     * Initializes all variables that are used in the launch configuration if they have not been initialized yet.
     */
    public static def void initializeVariables() {
        // Check if variables have been initialized already
        var variable = variableManager.getValueVariable(MAIN_FILE_NAME_VARIABLE)
        // Instantiate all variables if none yet
        if (variable == null) {
            // Project
            initializeVariable(LAUNCHED_PROJECT_VARIABLE,
            "Fully qualified path to the launched application")
    
            // Main file
            initializeVariable(MAIN_FILE_NAME_VARIABLE,
                "Name of the main file of the launched application")
            initializeVariable(MAIN_FILE_LOCATION_VARIABLE,
                "Fully qualified location of the main file of the launched application")
            initializeVariable(MAIN_FILE_PATH_VARIABLE,
                "Project relative path of the main file of the launched application")
            initializeVariable(MAIN_FILE_NAME_WITHOUT_FILE_EXTENSION_VARIABLE,
                "Project relative path of the main file of the launched application without file extension")
            
            // Compiled main file
            initializeVariable(COMPILED_MAIN_FILE_NAME_VARIABLE,
                "Name of the compiled main file of the launched application")
            initializeVariable(COMPILED_MAIN_FILE_LOCATION_VARIABLE,
                "Fully qualified location of the compiled main file of the launched application")
            initializeVariable(COMPILED_MAIN_FILE_PATH_VARIABLE,
                "Project relative path of the compiled main file of the launched application")
            initializeVariable(COMPILED_MAIN_FILE_NAME_WITHOUT_FILE_EXTENSION_VARIABLE,
                "Project relative path of the compiled main file of the launched application without file extension")
        }
    }
    
    /**
     * Initializes and returns the variable manager that performs string substitutions
     * 
     * @return the variable manager
     */
    public static def IStringVariableManager getVariableManager() {
        if(varManager == null) {
            varManager = VariablesPlugin.getDefault.stringVariableManager
        }
        return varManager
    }
}
