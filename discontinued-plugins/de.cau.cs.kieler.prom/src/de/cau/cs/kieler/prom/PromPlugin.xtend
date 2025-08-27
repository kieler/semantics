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
package de.cau.cs.kieler.prom

import com.google.common.base.Charsets
import com.google.common.io.CharStreams
import de.cau.cs.kieler.prom.kibuild.BuildConfiguration
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
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.FileLocator
import org.eclipse.core.runtime.IPath
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.IStatus
import org.eclipse.core.runtime.Path
import org.eclipse.core.runtime.Platform
import org.eclipse.core.runtime.Plugin
import org.eclipse.core.runtime.QualifiedName
import org.eclipse.core.runtime.Status
import org.eclipse.core.runtime.SubMonitor
import org.eclipse.core.runtime.jobs.Job
import org.eclipse.core.variables.IStringVariableManager
import org.eclipse.core.variables.VariablesPlugin
import org.eclipse.jdt.core.IClasspathEntry
import org.eclipse.jdt.core.IJavaProject
import org.eclipse.jdt.core.JavaCore
import org.eclipse.jface.preference.IPreferenceStore
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtext.util.StringInputStream

/**
 * The activator class controls the plug-in life cycle.
 * Contains util methods to work with Eclipse resources (IResource, IProject, etc.) 
 * 
 * @author aas
 */
class PromPlugin extends Plugin  {
    
    public static var PromPlugin instance
    
    // The plug-in ID
    public static val PLUGIN_ID = "de.cau.cs.kieler.prom"
    
    /**
     * The directory in which compiled output of this launch will be saved per default.
     */
    public static val BUILD_DIRECTORY = "kieler-gen"
    
    /**
     * Qualifier used to set the build configuration for a project.
     */
    public static val BUILD_CONFIGURATION_QUALIFIER = new QualifiedName(PromPlugin.PLUGIN_ID, "build.configuration")
    
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
     * Storage for preferences.
     * This reference is set in the PromUIPlugin.
     */
    @Accessors
    private static IPreferenceStore preferenceStore

    /**
     * The constructor
     */
    new() {
        super()
        instance = this
    }
    
    /**
     * Returns a string with the content from the given input stream.
     */
    public static def String toString(InputStream stream) {
        val isr = new InputStreamReader(stream, Charsets.UTF_8)
        val text = CharStreams.toString(isr)
        isr.close
        return text
    }
    
    /**
     * Creates a bitmask in which the given bits are set.
     * 
     * @param bits The bits to be set in the bitmask
     * @return the bitwise OR over all given bits.
     */
    public static def int createBitmask(int... bits) {
        var mask = 0
        for(b : bits) {
            mask = mask.bitwiseOr(b)
        }
        return mask
    }
    
    /**
     * Checks if a project is a java project
     * 
     * @param project The project
     * @return true if the project has the Java project nature, false otherwise.
     */
    public static def boolean isJavaProject(IProject project) {
        return project.hasNature(JavaCore.NATURE_ID)
    }
    /**
     * Loads the build configuration that is defined in the project properties from the given project.
     * 
     * @param project The project
     * @return The build config for the project, or null if none could be loaded
     */
    public static def BuildConfiguration getBuildConfig(IProject project) {
        val configFilePath = project.getPersistentProperty(PromPlugin.BUILD_CONFIGURATION_QUALIFIER)
        if (!configFilePath.isNullOrEmpty) {
            val file = project.getFile(configFilePath)
            val model = ModelImporter.load(file)
            if(model instanceof BuildConfiguration) {
                return model
            }
        }
       return null
    }
    
    /**
     * Returns an input stream for a file loaded from either a file path or an url path.
     * It is only loaded from an url if the url uses the platform protocol from Eclipse.
     * The contents of the returned input stream optionally may have placeholders which can be directly replaced in this method.
     * 
     * @param filePathOrURL The file path or an URL with the platform protocol
     * @param variableMappings A map where the keys are variables in the stream and the values are the values for the placeholders (e.g. a value for ${project_name}). 
     *
     * @return the loaded input stream
     */
    public static def InputStream getInputStream(String filePathOrURL, Map<String, String> variableMappings) {
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
            if(variableMappings != null){
                val contents = streamToString(inputStream)
                inputStream.close
                
                // Replace placeholders
                var contentsWithoutPlaceholders = contents
                for(entry : variableMappings.entrySet) {
                    contentsWithoutPlaceholders = contentsWithoutPlaceholders.replace("${"+entry.key+"}", entry.value)
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
        var text = ""
        val reader = new InputStreamReader(inputStream, Charsets.UTF_8)
        try {
            text = CharStreams.toString(reader);
        } catch (IOException e) {
            e.printStackTrace
        }
        reader.close
        return text
    }
    
    /**
     * Creates an input stream for a string.
     * 
     * @param text The string
     * @return a stream for the text
     */
    def private static InputStream stringToStream(String text) {
        val stream = new ByteArrayInputStream(text.bytes);
        return stream
    }
    
    /**
     * Adds a folder of a java project to the build path source folders.
     * 
     * @param javaProject The java project
     * @param sourceFolder The source folder to be added
     */
    public static def void addFolderToJavaClasspath(IJavaProject javaProject, IFolder sourceFolder) {
        val oldEntries = javaProject.rawClasspath;
        val newEntries = newArrayOfSize(oldEntries.length + 1);
        System.arraycopy(oldEntries, 0, newEntries, 0, oldEntries.length);
        newEntries.set(oldEntries.length, JavaCore.newSourceEntry(sourceFolder.fullPath));
        javaProject.setRawClasspath(newEntries, null);
    }
    
    /**
     * Excludes a folder inside a source folder of a java project from beeing built.
     * 
     * @param javaProject The java project
     * @param sourceFolder The source folder
     * @param exclude The folder to be excluded from the build
     */
    public static def void excludeFolderFromJavaClasspath(IJavaProject javaProject, IFolder excludeFolder) {
        val entries = javaProject.rawClasspath
        val sourceFolder = javaProject.project.getFolder(excludeFolder.projectRelativePath.segment(0))
        val excludePath = excludeFolder.projectRelativePath.addTrailingSeparator.removeFirstSegments(1)
        for(entry : entries) {
            if(entry.path == sourceFolder.fullPath) {
                val oldExclusionPatterns = entry.exclusionPatterns
                if(!entry.exclusionPatterns.contains(excludePath)) {
                    val newExclusionPatterns = newArrayOfSize(oldExclusionPatterns.length + 1)
                    System.arraycopy(oldExclusionPatterns, 0, newExclusionPatterns, 0, oldExclusionPatterns.length)
                    newExclusionPatterns.set(oldExclusionPatterns.length, excludePath)
                    updateClasspathEntry(javaProject, entry, JavaCore.newSourceEntry(entry.path, newExclusionPatterns))
                } else {
                }
            }
        }
    }
    
    /**
     * Replaces the classpath entry that matches oldEntry with newEntry. 
     */
    public static def void updateClasspathEntry(IJavaProject javaProject, IClasspathEntry oldEntry, IClasspathEntry newEntry) {
        val oldEntries = javaProject.rawClasspath
        val newEntries = oldEntries.clone
        for(var i = 0; i < newEntries.length; i++) {
            val entry = newEntries.get(i)
            if(entry.path == newEntry.path) {
                newEntries.set(i, newEntry)
            }
        }
        javaProject.setRawClasspath(newEntries, null)
    }
    
    /**
     * Searches and returns the project with the given name. 
     * 
     * @param name The name of a project to be found
     * @return the project with the given name, or null if none.
     */
    static def IProject findProject(String name) {
        if (!name.isNullOrEmpty && new Path(name).isValidPath(name)) {
            val p = ResourcesPlugin.workspace.root.getProject(name)
            if (p.exists) {
                return p    
            }
        }
        return null
    }

    /**
     * Find a file via its full path in the workspace or an absolute file path.
     */
    public static def IFile findFile(IPath fullPath) {
        // Try to find a file from the full workspace path
        var file = ResourcesPlugin.workspace.root.getFile(fullPath)
        if(file === null || !file.exists) {
            // Try to find a file from an absolute file path
            val jFile = new File(fullPath.toOSString)
            val uri = jFile.toURI()
            val files = ResourcesPlugin.getWorkspace().getRoot().findFilesForLocationURI(uri)
            if(files !== null && !files.isEmpty) {
                file = files.get(0)
            }
        }
        return file
    }
    
    /**
     * Find a file via its full path in the workspace or an absolute file path.
     */
    public static def IFile findFile(String fullPath) {
        val path = new Path(fullPath)
        return findFile(path)
    }
    
    /**
     * Find a folder via its full path in the workspace.
     */
    public static def IFolder findFolder(IPath fullPath) {
        val folder = ResourcesPlugin.workspace.root.getFolder(fullPath)
        return folder
    }
    
    /**
     * Find a folder via its full path in the workspace.
     */
    public static def IFolder findFolder(String fullPath) {
        val path = new Path(fullPath)
        return findFolder(path)
    }
    
    /**
     * Searches recursively for resources with the same file extension.
     * 
     * @param resources The resources in which the search takes place
     * @param fileExtension The file extension that files must have, or null if all files should be included
     * @return a list of the found files
     */
    public static def List<IFile> findFiles(IResource[] resources, String fileExtension) {
        return findFiles(resources, #[fileExtension])
    }
    
    /**
     * Searches recursively for resources with the same file extension.
     * 
     * @param resources The resources in which the search takes place
     * @param fileExtensions The file extensions that files must have, or null if all files should be included
     * @return a list of the found files
     */
    public static def List<IFile> findFiles(IResource[] resources, String[] fileExtensions) {
        val ArrayList<IFile> findings = newArrayList
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
     * Checks if the directory in the java project is configured as source directory.
     * 
     * @param javaProject A project with the java nature
     * @param directory The directory
     * @return true if the directory is a source directory. false otherwise.
     */
    public static def boolean isJavaSourceDirectory(IJavaProject javaProject, String directory) {
        val classPathEntries = javaProject.getRawClasspath();
        for(entry : classPathEntries) {
            if(entry.entryKind == IClasspathEntry.CPE_SOURCE) {
                val sourceFolderName = new Path(entry.path.toOSString).lastSegment
                if(sourceFolderName.equals(directory)) {
                    return true
                }
            } 
        }
        return false
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
     * Creates an empty resource and all needed parent folders.
     * If the resource already exists, nothing happens.
     * 
     * @param resource The resource handle to be created
     */
    public static def void createResource(IResource resource) throws CoreException {
        createResource(resource, null as InputStream, false)
    }
    
    /**
     * Creates an empty resource and all needed parent folders.
     * 
     * @param resource The resource handle to be created
     * @param overwrite Determines if an existing resource should be replaced.
     */
    public static def void createResource(IResource resource, boolean overwrite) throws CoreException {
        createResource(resource, null as InputStream, overwrite)
    }
    
    /**
     * Creates a resource and all needed parent folders.
     * If the resource is a file, it can be initialized with some text.
     * If the resource already exists, nothing happens.
     * 
     * @param resource The resource handle to be created
     * @param text Initial content for the resource
     */
    public static def void createResource(IResource resource, String text) throws CoreException {
        createResource(resource, text, false)
    }
    
    /**
     * Creates a resource and all needed parent folders.
     * If the resource is a file, it can be initialized with some text.
     * 
     * @param resource The resource handle to be created
     * @param text Initial content for the resource
     * @param overwrite Determines if an existing resource should be replaced.
     */
    public static def void createResource(IResource resource, String text, boolean overwrite) throws CoreException {
        val stream = if(text.isNullOrEmpty)
                         null
                     else
                         new StringInputStream(text)
        createResource(resource, stream, overwrite)
    }
    
    /**
     * Creates a resource and all needed parent folders in a project.
     * The created resource is initialized with the inputs of the stream.
     * The stream is closed afterwards.
     * If the resource already exists, nothing happens.
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
     * @param overwrite Determines if an already existing resource should be replaced.
     */
    public static def void createResource(IResource resource, InputStream inputStream, boolean overwrite) throws CoreException {
        if (resource == null || (resource.exists && !overwrite))
            return;

        if (!resource.parent.exists)
            createResource(resource.parent, inputStream);

        switch(resource.type){
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
                stream.close
            }
            case IResource.FOLDER : {
                if(!resource.exists) {
                    try {
                        (resource as IFolder).create(true, true, null)
                    } catch(CoreException e) {
                        // There seem to be cases in which the resource does exist,
                        // yet resource.exists returns false and thus an exception is thrown, because the resource already exists...
                        // However, this exception can be safely ignored here.
                        e.printStackTrace
                    }
                }
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
        new File(filePath).parentFile.mkdirs
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
     * @param variableMappings A map with optional variable mappings, e.g., a value for ${project_name}
     */
    public static def IFile initializeFile(IProject project, String projectRelativePath, String origin,
                                           Map<String, String> variableMappings) {
       val resource = project.getFile(projectRelativePath)
       // Create empty file
       if(origin.trim.isNullOrEmpty) {
           PromPlugin.createResource(resource)
       } else {
           // Create file with initial content from origin
           val initialContentStream = PromPlugin.getInputStream(origin, variableMappings)
           PromPlugin.createResource(resource, initialContentStream, true)
       }
       return resource
    }
    
    /**
     * Creates a file in the new project with the content from the origin,
     * or an empty file if the origin is null or empty
     * 
     * @param projectRelativePath The project relative path of the resource to create
     * @param origin Optional path to initial content for the new file
     */
    public static def IFile initializeFile(IProject project, String projectRelativePath, String origin) {
       return initializeFile(project, projectRelativePath, origin, null)
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
        } else if(origin.isNullOrEmpty) {
            // Create empty directory
            val newFolder = project.getFolder(projectRelativePath)
            PromPlugin.createResource(newFolder);
        } else {
            // Copy directory from file system
            val source = new File(origin)
            val target = new File(project.location + File.separator + projectRelativePath)
            
            copyFolder(source, target)
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

        val uriWithUnifiedSegmentSeparator = url.trim.replace("\\", "/")
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
                    for (var e = entries; e.hasMoreElements;) {
                        val entry = e.nextElement
                        val fileUrl = FileLocator.toFileURL(entry)

                        // Calculate the relative path of the file
                        // in the target snippet directory.
                        val i = fileUrl.toString.indexOf(dir) + dir.length
                        var relativePath = fileUrl.toString.substring(i)
                        if (relativePath.startsWith("/"))
                            relativePath = relativePath.substring(1)

                        // Create file in project with content of file from url
                        val stream = fileUrl.openStream
                        val file = newFolder.getFile(relativePath)
                        PromPlugin.createResource(file, stream, true)
                        stream.close
                    }
                    newFolder.refreshLocal(IResource.DEPTH_INFINITE, null)
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
        if(!src.isDirectory)
            return;
        if(dest.exists){
            if(!dest.isDirectory){
                return;
            }
        } else {
            dest.mkdirs;
        }
    
        if(src.listFiles == null || src.listFiles.length == 0)
            return;
        
        for(File file : src.listFiles){
            val fileDest = new File(dest, file.name)
            if(file.isDirectory){
                copyFolder(file, fileDest)
            }else if(!fileDest.exists){
                try {
                    Files.copy(file.toPath, fileDest.toPath)
                } catch (IOException e) {
                    e.printStackTrace
                }
            }
        }
    }
    
    /**
     * Starts the procedure in a new job with a progress monitor.
     */
    public static def void execInJob(String jobName, (SubMonitor) => void procedure) {
        val job = new Job(jobName) {
            override protected run(IProgressMonitor monitor) {
                val subMonitor = SubMonitor.convert(monitor)
                procedure.apply(subMonitor)
                subMonitor.done
                return Status.OK_STATUS
            }
        }
        job.schedule
    }
    
    /**
     * Split input string on spaces, except if between double quotes (e.g. "hello world" would be one token.)
     * Surrounding double quotes are removed.
     * 
     * @param str The string to be splitted
     * @return the slices of the input string.
     */
    public static def List<String> splitStringOnWhitespace(String str) {
        // Code from
        // http://stackoverflow.com/questions/7804335/split-string-on-spaces-except-if-between-quotes-i-e-treat-hello-world-as
        val list = new ArrayList<String>();
        val m = Pattern.compile("([^\"]\\S*|\".+?\")\\s*").matcher(str);
        while (m.find()) {
            // .replace(...) is to remove surrounding qoutes
            list.add(m.group(1).replace("\"", ""))
        }
        return list
    }
}
