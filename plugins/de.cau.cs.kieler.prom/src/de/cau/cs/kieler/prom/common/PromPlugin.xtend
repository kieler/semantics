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
import java.io.ByteArrayInputStream
import java.io.File
import java.io.FileInputStream
import java.io.IOException
import java.io.InputStream
import java.io.InputStreamReader
import java.net.URL
import java.nio.file.Files
import java.util.ArrayList
import java.util.List
import java.util.Map
import java.util.regex.Pattern
import org.eclipse.core.resources.IContainer
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IFolder
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.IResource
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.FileLocator
import org.eclipse.core.runtime.Path
import org.eclipse.core.runtime.Platform
import org.eclipse.core.runtime.QualifiedName
import org.eclipse.core.runtime.Status
import org.eclipse.core.variables.IStringVariableManager
import org.eclipse.core.variables.VariablesPlugin
import org.eclipse.jdt.core.IJavaProject
import org.eclipse.jdt.core.JavaCore
import org.eclipse.ui.plugin.AbstractUIPlugin
import org.eclipse.ui.statushandlers.StatusManager
import org.eclipse.xtext.util.StringInputStream
import org.osgi.framework.BundleActivator
import org.osgi.framework.BundleContext
import org.eclipse.ui.statushandlers.StatusAdapter

/**
 * The activator class controls the plug-in life cycle.
 * 
 * @author aas
 */
class PromPlugin extends AbstractUIPlugin implements BundleActivator  {
    
    // The plug-in ID
    public static val PLUGIN_ID = "de.cau.cs.kieler.prom"
    
    // The shared instance
    private static PromPlugin plugin;
    
    /**
     * The directory in which compiled output of this launch will be saved per default.
     */
    public static val BUILD_DIRECTORY = "kieler-gen"
    
    /**
     * Qualifier used to set the environment name property of a project.
     */
    public static val ENVIRIONMENT_QUALIFIER = new QualifiedName(PromPlugin.PLUGIN_ID, "environment")
    
    /**
     * Qualifier used to set the main file's project relative path of a project.
     */
    public static val MAIN_FILE_QUALIFIER = new QualifiedName(PromPlugin.PLUGIN_ID, "main.file")

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
     * Log an information
     */
    public static def void log(String msg) {
        log(Status.INFO, msg, null)
    }
    
    /**
     * Log an error
     */
    public static def void log(String msg, Exception e) {
        log(Status.ERROR, msg, e)
    }
    
    /**
     * Log a message
     */
    public static def void log(int severity, String msg, Exception e) {
        val status = new Status(severity, PLUGIN_ID, msg, e)
        val statusAdapter = new StatusAdapter(status)
        val style = StatusManager.LOG//.bitwiseOr(StatusManager.SHOW)
        StatusManager.getManager().handle(statusAdapter, style)
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
    public static def List<IFile> findFiles(IResource[] resources, String[] fileExtensions) {
        val ArrayList<IFile> findings = newArrayList()
        for(IResource res : resources) {
            if (res instanceof IContainer) {
                findings.addAll(findFiles(res.members, fileExtensions));
            } else if (res instanceof IFile) {
                if(fileExtensions == null || res.fileExtension != null && fileExtensions.contains(res.fileExtension.toLowerCase) ){
                    findings.add(res)
                }
            }
        }
        return findings
    }
    
    /**
     * Sets several eclipse string variables (e.g. ${main_name}, ${compiled_main_name}).
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
     * Initializes all variables if they have not been initialized yet.
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
    private static def IStringVariableManager getVariableManager() {
        if(varManager == null) {
            varManager = VariablesPlugin.getDefault.stringVariableManager
        }
        return varManager
    }
    
    /**
     * Creates a resource and all needed parent folders in a project.
     * The created resource is initialized with the inputs of the stream.
     * The stream is closed afterwards.
     * 
     * @param resource The resource handle to be created
     * @param stream Input stream with initial content for the resource
     */
    public static def void createResource(IResource resource, InputStream stream) throws CoreException {
        createResource(resource, stream, false)
    }
    
    /**
     * Creates a resource and all needed parent folders in a project.
     * The created resource is initialized with the inputs of the stream.
     * The stream is closed afterwards.
     * 
     * @param resource The resource handle to be created
     * @param stream Input stream with initial content for the resource
     * @param overwrite Determines if an already existing resource should be updated with new content. 
     */
    public static def void createResource(IResource resource, InputStream inputStream, boolean overwrite) throws CoreException {
        if (resource == null || (resource.exists && !overwrite))
            return;

        if (!resource.parent.exists)
            createResource(resource.parent, inputStream);

        switch(resource.getType()){
            case IResource.FILE : {
                // Select a stream with content
                val stream = if(inputStream != null)
                                  inputStream
                              else
                                  new StringInputStream("")
                // Update or create the file with the content from the stream
                if(overwrite && resource.exists) {
                    (resource as IFile).setContents(stream, true, false, null)
                } else if(!resource.exists) {
                    (resource as IFile).create(stream, true, null)
                }
                // Close stream with content
                stream.close()
            }
            case IResource.FOLDER :
                if(!resource.exists) {
                    (resource as IFolder).create(IResource.NONE, true, null)
                }
            case IResource.PROJECT : {
                if(!resource.exists) {
                    (resource as IProject).create(null)
                    (resource as IProject).open(null)
                }
            }
        }
    }
    
    /**
     * Creates the folder structure for a fully qualified file path.
     * 
     * @param path The path to a fully qualified file
     */
    public static def void createDirectories(String filePath) {
        new File(filePath).parentFile.mkdirs()
    }
    
    /**
     * Uses the variable manager to perform a substitution of variables to their value (e.g. ${project_name} -> MyProject)
     * If the project is specified, the variables ${project_name} and ${project_loc} are replaced accordingly.
     * 
     * @param expression An expression with placeholders
     * @param project Optional project to set ${project_name} and ${project_loc}. May be null.
     * @return the expression with all placeholders resolved
     */
    public static def String performStringSubstitution(String expression, IProject project) {
        if(project == null) {
            return variableManager.performStringSubstitution(expression)
        } else {
            // The variables ${project_name} and ${project_loc}
            // normally refer to the project selected in the Project Explorer.
            // However we want to replace these with the corresponding value of the given project.
            val project_loc = project.location.toOSString
            val project_name = project.name
            val newExpression = expression.replaceAll(Pattern.quote("${project_loc}"), project_loc)
                                          .replaceAll(Pattern.quote("${project_name}"), project_name)
            return variableManager.performStringSubstitution(newExpression)
        }
    }
    
     
    
    /**
     * Creates a file in the new project with the content from the origin,
     * or an empty file if the origin is null or empty
     * 
     * @param projectRelativePath The project relative path of the resource to create
     * @param origin Optional path to initial content for the new file
     */
    public static def void initializeFile(IProject project, String projectRelativePath, String origin) {
        val resource = project.getFile(projectRelativePath)
       // Create empty file
       if(origin.trim.isNullOrEmpty) {
           PromPlugin.createResource(resource, null)
       } else {
           // Create file with initial content from origin
           val initialContentStream = PromPlugin.getInputStream(origin, null)
           PromPlugin.createResource(resource, initialContentStream)
       }
    }

    /**
     * Creates a folder in the new project with the content from the origin,
     * or an empty folder if the origin is null or empty
     * 
     * @param projectRelativePath The project relative path of the resource to create
     * @param origin Optional path to initial content for the new folder
     */
    public static def void initializeFolder(IProject project, String projectRelativePath, String origin) {
        if (origin.trim.startsWith("platform:")) {
            // Fill folder with files from plugin
            val newFolder = project.getFolder(projectRelativePath)
            initializeFolderViaPlatformURL(newFolder, origin)
        } else if(!origin.isNullOrEmpty) {
            // Copy directory from file system
            val source = new File(origin)
            val target = new File(project.location + File.separator + projectRelativePath)
            
            copyFolder(source, target)
        } else {
            // Create empty directory
            val newFolder = project.getFolder(projectRelativePath)
            PromPlugin.createResource(newFolder, null);
        }
    }
    
    /**
     * Copies the contents of the resources from the platform url
     * to the folder of the newly created project.
     * 
     * @param newFolder The folder to be created and initialized
     * @param url URL to a plugin's directory with initial content for snippets
     */
    private static def void initializeFolderViaPlatformURL(IFolder newFolder, String url) throws Exception {
        // URL should be in form 'platform:/plugin/org.myplugin.bla/path/to/template/directory'

        val uriWithUnifiedSegmentSeparator = url.trim().replace("\\", "/")
        if (uriWithUnifiedSegmentSeparator.startsWith("platform:/plugin/")) {
            // Remove 'platform:/plugin/'
            val path = uriWithUnifiedSegmentSeparator.substring(17)

            // First segment is the bundle name,
            // followed by the path of the directory.
            val index = path.indexOf("/")
            if (index > 0 && path.length > index + 1) {
                val bundleName = path.substring(0, index)
                val dir = path.substring(index + 1)

                // Load bundle / plugin
                val bundle = Platform.getBundle(bundleName);

                // Copy files from bundle which are in the directory.
                val entries = bundle.findEntries(dir, "*.*", true)
                if (entries != null) {
                    for (var e = entries; e.hasMoreElements();) {
                        val entry = e.nextElement
                        val fileUrl = FileLocator.toFileURL(entry)

                        // Calculate the relative path of the file
                        // in the target snippet directory.
                        val i = fileUrl.toString.indexOf(dir) + dir.length
                        var relativePath = fileUrl.toString.substring(i)
                        if (relativePath.startsWith("/"))
                            relativePath = relativePath.substring(1)

                        // Create file in project with content of file from url
                        val stream = fileUrl.openStream()
                        val file = newFolder.getFile(relativePath)
                        PromPlugin.createResource(file, stream)
                        stream.close()
                    }
                } else {
                    throw new Exception("The directory '"+dir+"'\n"
                        + "of the plugin '"+bundleName+"' does not exist or is empty.")
                }
            }
        }
    }
    
    /**
     * Copy the contents of a folder recursively.
     * 
     * @param src The source folder
     * @param dest The destination folder
     */
    def static private void copyFolder(File src, File dest) {
        // Checks
        if(src == null || dest == null)
            return;
        if(!src.isDirectory())
            return;
        if(dest.exists()){
            if(!dest.isDirectory()){
//                System.out.println("destination not a folder " + dest);
                return;
            }
        } else {
            dest.mkdirs();
        }
    
        if(src.listFiles() == null || src.listFiles().length == 0)
            return;
        
        for(File file : src.listFiles()){
            val fileDest = new File(dest, file.getName())
//            println(file.getAbsolutePath()+" --> "+fileDest.getAbsolutePath())
            if(file.isDirectory()){
                copyFolder(file, fileDest)
            }else if(!fileDest.exists()){
                try {
                    Files.copy(file.toPath(), fileDest.toPath())
                } catch (IOException e) {
                    e.printStackTrace()
                }
            }
        }
    }
}
