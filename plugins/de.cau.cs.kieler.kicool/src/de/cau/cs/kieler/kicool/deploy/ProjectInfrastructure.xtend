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
package de.cau.cs.kieler.kicool.deploy

import de.cau.cs.kieler.annotations.Nameable
import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.properties.Property
import de.cau.cs.kieler.core.uri.URIUtils
import de.cau.cs.kieler.kicool.compilation.CodeContainer
import de.cau.cs.kieler.kicool.environments.Environment
import java.io.File
import java.io.FileOutputStream
import java.io.IOException
import java.io.InputStream
import java.io.OutputStream
import java.io.PrintStream
import java.net.URL
import java.nio.file.FileSystems
import java.nio.file.Files
import java.util.Comparator
import java.util.Enumeration
import java.util.Iterator
import java.util.List
import java.util.Map
import java.util.Map.Entry
import java.util.Set
import java.util.stream.Collectors
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.IResource
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.Platform
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer
import org.eclipse.xtend.lib.annotations.AccessorType
import org.eclipse.xtend.lib.annotations.Accessors

import static com.google.common.base.Preconditions.*
import static de.cau.cs.kieler.kicool.environments.Environment.*

import static extension org.eclipse.xtend.lib.annotations.AccessorType.*
import java.nio.file.Paths

/**
 * 
 * @author als
 * @kieler.design 2018-05-18 proposed
 * @kieler.rating 2018-05-18 proposed yellow  
 */
class ProjectInfrastructure {
    
    public static val IProperty<ProjectInfrastructure> PROJECT_INFRASTRUCTURE = 
        new Property<ProjectInfrastructure>("de.cau.cs.kieler.kicool.deploy.project", null)
    
    public static val IProperty<String> MODEL_FILE_PATH = 
        new Property<String>("de.cau.cs.kieler.kicool.deploy.project.file.path", null)
    
    
    public static val IProperty<Boolean> USE_TEMPORARY_PROJECT = 
        new Property<Boolean>("de.cau.cs.kieler.kicool.deploy.project.use", true)
    
    public static val IProperty<String> TEMPORARY_PROJECT_NAME = 
        new Property<String>("de.cau.cs.kieler.kicool.deploy.project.name", "KIELER-Temp")
    
    
    public static val IProperty<Boolean> USE_GENERATED_FOLDER = 
        new Property<Boolean>("de.cau.cs.kieler.kicool.deploy.project.generated.use", true)
        
    public static val IProperty<String> GENERATED_FOLDER_ROOT = 
        new Property<String>("de.cau.cs.kieler.kicool.deploy.project.generated.root", null)

    public static val IProperty<String> GENERATED_NAME = 
        new Property<String>("de.cau.cs.kieler.kicool.deploy.project.generated.name", "kieler-gen")
    
    public static val IProperty<Boolean> USE_SHORT_DIRECTORY_NAMES = 
        new Property<Boolean>("de.cau.cs.kieler.kicool.deploy.project.generated.useShortNames", 
            de.cau.cs.kieler.core.Platform.isWindows)


    public static val IProperty<Map<String, String>> PATH_VARIABLES =
        new Property<Map<String, String>>("de.cau.cs.kieler.kicool.deploy.project.path.variables", null)
    
    public static val IProperty<Boolean> OWN_MODEL_FOLDER =
        new Property<Boolean>("de.cau.cs.kieler.kicool.deploy.project.model.ownfolder", false)
        
        

    public static val Set<IProject> createdTemporaryProjects = newHashSet

    @Accessors(AccessorType.PUBLIC_GETTER)
    var IProject project = null
    @Accessors(AccessorType.PUBLIC_GETTER)
    var File modelFile = null
    @Accessors(AccessorType.PUBLIC_GETTER)
    var File modelFolder = null
    @Accessors(AccessorType.PUBLIC_GETTER)
    var File generatedCodeFolder = null
    @Accessors(AccessorType.PUBLIC_GETTER)
    var List<File> sourceCodeFiles = newArrayList
    @Accessors
    var CodeContainer sourceCode = null
    
    @Accessors(AccessorType.PUBLIC_GETTER)
    var Map<String,String> variables;
    
    static def getProjectInfrastructure(Environment environment) {
        var projectInfrastructure = environment.getProperty(PROJECT_INFRASTRUCTURE)
        if (projectInfrastructure === null) {
            projectInfrastructure = new ProjectInfrastructure(environment)
            environment.setProperty(PROJECT_INFRASTRUCTURE, projectInfrastructure)
        }
        return projectInfrastructure
    }
    /**
     * Returns the temporary project.
     * If the project does not exist yet, it is created beforehand.
     * 
     * @return The temporary project
     */
    static def IProject getTemporaryProject() { 
        return getTemporaryProject(null)
    }
     
    static def IProject getTemporaryProject(Environment environment) {
        val root = ResourcesPlugin.getWorkspace.getRoot
        val name = if (environment !== null) environment.getProperty(TEMPORARY_PROJECT_NAME) else TEMPORARY_PROJECT_NAME.^default
        val project = root.getProject(name)
        if (!project.exists) {
            project.create(null)
        }
        if(!project.open) {
            project.open(null)
        }
        // Store project for cleanup
        createdTemporaryProjects.add(project)
        return project
    }
    
    new(Environment environment) {
        var Resource resource = null
        variables = environment.getPropertyComputeIfAbsent(PATH_VARIABLES, [newHashMap])
        
        
        // ############### MODEL_FILE ###############
        modelFile = null
        // Check if compilation is based on input file
        val inputModelPath = environment.getProperty(MODEL_FILE_PATH)
        if (inputModelPath !== null) {
            modelFile = new File(inputModelPath)
            if (!modelFile.isFile) {
                modelFile = null
            }
        }
        
        // alternatively get path from original model
        val inputModel = environment.getProperty(ORIGINAL_MODEL)
        if (modelFile === null) {
            if (inputModel instanceof EObject) {
                resource = inputModel.eResource
                if (resource !== null) {
                    modelFile = resource.findResourceLocation
                    if (modelFile === null && resource.URI !== null) {
                        modelFile = URIUtils.getJavaFile(resource.URI)
                    }
                }
            } else if (inputModel instanceof CodeContainer) {
                if (!inputModel.files.empty) {
                    modelFile = inputModel.files.head.underlyingFile
                }
            }
        }
        
        // store variables about source file
        if (modelFile !== null) {
            variables.putIfAbsent("MODEL_FILE_PATH", modelFile.path)
            variables.putIfAbsent("MODEL_FILE_NAME", modelFile.name)
            val nameParts = modelFile.name.split("\\.", 2)
            
            val rawName = nameParts.get(0)
            variables.putIfAbsent("MODEL_FILE_RAW_NAME", rawName)
            variables.putIfAbsent("MODEL_FILE_RAW_NAME_PATHSAVE", rawName.replace(" ", "_"))
            
            val fileExtension = if (nameParts.length>1) nameParts.get(1) else ""
            variables.putIfAbsent("MODEL_FILE_EXTENSION", fileExtension)
            variables.putIfAbsent("MODEL_FILE_EXTENSION_PATHSAVE", fileExtension.replace(".", "-").replace(" ", "_"))
        }
        val constModelFile = modelFile
        
        
        // ############### SOURCE_FOLDER ###############
        // determine model src folder
        val srcFolderPath = variables.computeIfAbsent("SRC_ROOT",[
            if (constModelFile !== null) {
                return constModelFile.parentFile.path
            }
            return null
        ])
        val srcFolder = if (srcFolderPath !== null) new File(srcFolderPath)
        
        
        // ############### RELATIVE_SOURCE_PATH ###############
        // get relative path, before temporary project reroutes modelFolder
        if (srcFolder !== null && modelFile !== null) {
            variables.computeIfAbsent("RELATIVE_MODEL_PATH", [
                Paths.get(srcFolder.path)
                     .relativize(Paths.get(constModelFile.parent))
                     .toString
            ])
        }
        
        
        // ############### DEFAULT_DESTINATION_ROOT(modelFolder) ###############
        if (environment.getProperty(USE_TEMPORARY_PROJECT)) {
            // Get folder in project by turning (project)path/modelname into folder name.
            // initialize project
            project = environment.temporaryProject
            
            // Find name
            var name = "unknown"
            if (resource !== null && resource.URI !== null && resource.URI.platform) {
                // workspace relative / plug-in-based path
                name = resource.URI.toPlatformString(true)
            } else if (resource !== null && resource.URI !== null && resource.URI.file) {
                name = resource.URI.toFileString
                if (environment.getProperty(USE_SHORT_DIRECTORY_NAMES)) {
                    val nameSplits = name.split("\\\\")
                    name = nameSplits.get(nameSplits.length - 1)
                }
            } else if (modelFile !== null) {
                // src file path
                name = modelFile.toString
            } else if (inputModel instanceof Nameable) {
                name = inputModel.name
            }
            name = name.replaceAll("/|\\\\", "-")
            name = name.replaceAll(" |\\.|:", "-")
            
            // Create Folder
            val folder = project.getFolder(name)
            modelFolder = folder.rawLocation.toFile
        } else if (srcFolder !== null && srcFolder.exists) {
            // set default destination to source folder
            modelFolder = srcFolder
        } else {
            environment.warnings.add("Can not detect model location to create project infrastructure.")
        }
        
        
        // ############### DESTINATION_ROOT ###############
        variables.computeIfAbsent("DST_ROOT", [
            if (modelFolder !== null) {
                if (hasProject) {
                    return project.getFolder(modelFolder.name).rawLocation.toFile.path
                } else {
                    if (environment.getProperty(USE_GENERATED_FOLDER) && !environment.getProperty(GENERATED_FOLDER_ROOT).nullOrEmpty) {
                        return environment.getProperty(GENERATED_FOLDER_ROOT)
                    } else {
                        return modelFolder.path
                    }
                }
            } else {
                return null;
            }
        ])
        
        
        // ############### USE_GENERATED_FOLDER ###############
        if (environment.getProperty(USE_GENERATED_FOLDER)) {
            variables.putIfAbsent("GEN_FOLDER", environment.getProperty(GENERATED_NAME))
        }
                
        
        // ############### OWN_MODEL_FOLDER ###############
        if (environment.getProperty(OWN_MODEL_FOLDER)) {
            variables.computeIfAbsent("OWN_MODEL_FOLDER", [
                variables.get("MODEL_FILE_RAW_NAME_PATHSAVE")
            ])
        }
        
        
        // ############### CALCULATE DESTINATION/FLATEN VARIABLES ###############
        // add default output path
        variables.putIfAbsent("DST", "${DST_ROOT}/${GEN_FOLDER}/${RELATIVE_MODEL_PATH}/${OWN_MODEL_FOLDER}/")
        
        
        // ############### CREATE FOLDER ###############
        val relativeModelPath =
            Paths.get(variableLookup("DST_ROOT"))
            .relativize(Paths.get(variableLookup("DST")))
            .normalize
        
        val dstFolderPath = variableLookup("DST_ROOT")
        val dstFolder = dstFolderPath !== null ? new File(dstFolderPath) : null
        
        if (dstFolder !== null) {
            if (hasProject) {
                var gen = project.getFolder(dstFolder.name)
                if (!gen.exists) {
                    gen.create(true, true, null)
                }
                
                println(gen.rawLocation.toFile)
                
                // generate folders
                if (relativeModelPath !== null) {
                    for (var i = 0; i<relativeModelPath.getNameCount; i++) {
                        gen = gen.getFolder(relativeModelPath.getName(i).toString)
                        if (!gen.exists) {
                            gen.create(true, true, null)
                        }
                    }
                }
                generatedCodeFolder = gen.rawLocation.toFile
            } else {
                generatedCodeFolder = new File(variableLookup("DST"))
                if (!generatedCodeFolder.exists) {
                    generatedCodeFolder.mkdirs
                }
            }
        }
        
    }
    
    def getProjectRelativeFile(File file) {
        if (hasProject) {
            val root = project.workspace.root.rawLocation
            if (root !== null) {
                return root.toFile.toPath.relativize(file.toPath).toFile
            } else {
                return file
            }
        } else {
            return file
        }
    }
    
    def hasProject() {
        return project !== null
    }
    
    def refresh() {
        if (hasProject) project.refreshLocal(IResource.DEPTH_INFINITE, null)
    }
    
    def log(PrintStream logger) {
        logger.println("== Project Infrastructure ==")
        logger.println("Model file: " + modelFile)
        logger.println("Base folder: " + modelFolder)
        logger.println("Generated code folder: " + generatedCodeFolder)
        logger.println
    }
    
    def findResourceLocation(Resource resource) {
        return WorkspaceSynchronizer.getFile(resource)?.rawLocation?.toFile
    }
    
    def String variableLookup(String input) {
        return variableReplacement("${"+input+"}")
    }
    def String variableReplacement(String input) {
        return variableReplacement(null, newHashSet, input)
    }
    def String variableReplacement(Map<String,String> vars,  String input) {
        return variableReplacement(vars, newHashSet, input)
    }
    def String variableReplacement(Map<String,String> vars, Set<String> blocked, String input) {
        if (input === null) return null;
        
        // perform replacements
        val sb = new StringBuilder
        var lastIndex = 0
        var index = 0
        
        while ((index = input.indexOf("${", lastIndex)) !== -1) {
            // append text before occurrence of "${"
            if (index !== lastIndex) {
                sb.append(input, lastIndex, index)
            }
            lastIndex = index+2 // set position after "${"
            
            if ((index = input.indexOf("}", lastIndex)) !== -1) {
                // get value of variable
                val variableName = input.substring(lastIndex, index)
                
                // prevent endless recursion
                if (blocked.contains(variableName)) {
                    throw new IllegalArgumentException("Path contained recursive variable \"" + variableName + "\"")
                }
                
                // get variable
                blocked.add(variableName)
                val variableValue = variableReplacement(vars, blocked, (vars?.get(variableName) ?: variables.get(variableName)))
                blocked.remove(variableName)
                
                if (variableValue !== null) {
                    sb.append(variableValue)
                } // if variable not found: skip entry
                
                lastIndex = index+1
            } else {
                // broken variable (no end tag "}")
                throw new IllegalArgumentException("Path variable contained variable start \"${\" but no end tag \"}\"")
            }
        }
        
        // append last bit of text before end of input
        if (input.length !== lastIndex) {
            sb.append(input, lastIndex, input.length)
        }
        
        return sb.toString
    }
    
    
    // == UTILS ==
    
        
    /**
     * Copy the contents of a folder recursively.
     * 
     * @param src The source folder
     * @param dest The destination folder
     */
    static def boolean copyFolder(File src, File dest, PrintStream logger, boolean overrideFile) {
        // Checks
        checkNotNull(src, "Source is null")
        checkNotNull(dest, "Target is null")
        checkArgument(src.isDirectory, "Source is not an existing directory")
        checkArgument(!dest.exists || dest.isDirectory, "Destination exists and is not a directory")

        if (!dest.exists){
            dest.mkdirs;
        }
        
        logger?.println("Copying folder: " + src)
        if (src.listFiles === null || src.listFiles.length == 0) {
            logger?.println("No files to copy")
            return true
        } else {
            for (File file : src.listFiles) {
                val fileDest = new File(dest, file.name)
                if (file.isDirectory){
                    return copyFolder(file, fileDest, logger, overrideFile)
                } else if (!fileDest.exists) {
                    return file.copyFile(fileDest, logger, overrideFile)
                }
            }
        }
    }
    
    
    static def boolean copyFolder(URI src, File dest, PrintStream logger, boolean overrideFile) {
        checkNotNull(src, "Source is null")
        checkNotNull(dest, "Target is null")
        checkArgument(src.platformPlugin, "Source is not a plugin platform URI (i.e. 'platform:/plugin/org.myplugin/path/to/directory')")
        checkArgument(src.segmentCount > 2, "Source is not a valid plugin platform URI (i.e. 'platform:/plugin/org.myplugin/path/to/directory')")
        checkArgument(src.fileExtension.nullOrEmpty, "Source is not a directory")

        val path = src.segments.drop(2).join("/")
        var Iterator<URL> entries
        if (src.isPlatformPlugin) {
            if (Platform.isRunning) {
                val bundle = Platform.getBundle(src.segment(1))
                entries = bundle.findEntries(path, "*", true).toIterator
            } else {
                val uri = ClassLoader.getSystemResource(path).toURI
                if (uri.scheme.equals("jar")) {
                    val fs = FileSystems.newFileSystem(uri, emptyMap)
                    val files = Files.walk(fs.getPath(path)).filter[
                        Files.isRegularFile(it)
                    ].map[
                        val filePath = it.toString
                        ClassLoader.getSystemResource(filePath.startsWith("/") ? filePath.substring(1) : filePath)
                    ].collect(Collectors.toList)
                    fs.close
                    entries = files.iterator
                } else {
                    entries = Files.walk(new File(uri).toPath).filter[
                        Files.isRegularFile(it)
                    ].map[
                        it.toUri.toURL
                    ].collect(Collectors.toList).iterator
                }
            }
        } else {
            entries = Files.walk(new File(src.toFileString).toPath).filter[
                Files.isRegularFile(it)
            ].map[
                it.toUri.toURL
            ].collect(Collectors.toList).iterator
        }
        if (entries.hasNext) {
            while (entries.hasNext) {
                val fileUrl = entries.next
                val fileUrlPath = fileUrl.toString
                val relStart = fileUrlPath.indexOf(path) + 1 + path.length
                if (!fileUrlPath.endsWith("/") && relStart < fileUrlPath.length) { // is file
                    val relativePath = fileUrlPath.substring(fileUrlPath.indexOf(path) + path.length + 1)
                    val destFile = new File(dest, relativePath)
    
                    logger?.println("Copying file: " + fileUrlPath)
                    
                    destFile.parentFile.mkdirs
                    if (destFile.isDirectory) {
                        logger?.println("Destination already exists and is directory (" + destFile + ")")
                        return false
                    } else if (!destFile.exists || overrideFile) {
                        fileUrl.copyUrlToFile(destFile)
                    } else {
                        logger?.println("Skip - destination already exists")
                    }
                }
            }
            return true
        } else {
            logger.println("No files in directory " + src.toString)
            return false
        }
    }
    
    static def boolean copyFile(File src, File dest, PrintStream logger, boolean overrideFile) {
        // Checks
        checkNotNull(src, "Source is null")
        checkNotNull(dest, "Target is null")
        checkArgument(src.file, "Source is not an existing file")
        checkArgument(!dest.exists || dest.file, "Destination exists and is not a file")
        
        if (!dest.exists || overrideFile) {
            logger?.println("Copying file: " + src)
            try {
                if (dest.exists)  {
                    dest.delete
                } else {
                    val parent = dest.canonicalFile.parentFile
                    if (!parent.exists) {
                        parent.mkdirs
                    }
                }
                Files.copy(src.toPath, dest.toPath)
                return true
            } catch (IOException e) {
                if (logger !== null)
                e.printStackTrace(logger)
                return false
            }
        } else {
            logger?.println("Skip - destination already exists")
            return true
        }
    }
    
    static def boolean copyFile(URI src, File dest, PrintStream logger, boolean overrideFile) {
        checkNotNull(src, "Source is null")
        checkNotNull(dest, "Target is null")
        checkArgument(src.platformPlugin, "Source is not a plugin platform URI (i.e. 'platform:/plugin/org.myplugin/path/to/directory')")
        checkArgument(src.segmentCount > 2, "Source is not a valid plugin platform URI (i.e. 'platform:/plugin/org.myplugin/path/to/directory')")
        checkArgument(!src.fileExtension.nullOrEmpty, "Source is not a file")

        var URL fileUrl
        if (src.isPlatformPlugin) {
            if (Platform.isRunning) {
                val bundle = Platform.getBundle(src.segment(1))
                val path = src.segments.drop(2).take(src.segmentCount - 3).join("/")
                val entries = bundle.findEntries(path, src.lastSegment, true)
                fileUrl = entries?.nextElement
            } else {
                val path = src.segments.drop(2).join("/")
                fileUrl = ClassLoader.getSystemResource(path)
            }
        } else {
            fileUrl = URIUtils.getURL(src)
        }
        if (fileUrl !== null) {
            val fileUrlPath = fileUrl.toString
            logger?.println("Copying file: " + fileUrlPath)
            
            dest.parentFile.mkdirs
            if (dest.isDirectory) {
                logger?.println("Destination already exists and is directory (" + dest + ")")
                return false
            } else if (!dest.exists || overrideFile) {
                fileUrl.copyUrlToFile(dest)
            } else {
                logger?.println("Skip - destination already exists")
            }
            return true
        } else {
            logger.println("File not found in directory " + src.toString)
            return false
        }
    }
    
    static def void copyUrlToFile(URL src, File dest) {
        checkNotNull(src, "Source is null")
        checkNotNull(dest, "Target is null")
        
        val InputStream input = src.openStream
        var OutputStream output = null
        try {
            output = new FileOutputStream(dest)
            val byte[] buf = newByteArrayOfSize(2048)
            var int bytesRead;
            while ((bytesRead = input.read(buf)) > 0) {
                output.write(buf, 0, bytesRead)
            }
        } finally {
            input.close();
            output?.close();
        }
    }
    
    /**
     * Deletes a file/folder recursively.
     * 
     * @param src The source folder
     * @param dest The destination folder
     */
    static def boolean deleteRecursively(File target, PrintStream logger) {
        // Checks
        checkNotNull(target, "Target is null")

        try {
            if (target.file) {
                logger.println("Deleting file: " + target)
                target.delete
            } else if (target.directory) {
                Files.walk(target.toPath).sorted(Comparator.reverseOrder).map[toFile].forEach[
                    if (isDirectory) {
                        logger.println("Deleting folder: " + it)
                    } else if (isFile) {
                        logger.println("Deleting file: " + it)
                    }
                    delete
                ]
            }
            return true
        } catch (Exception e) {
            logger.print("ERROR: Exception while clearing file(s)")
            e.printStackTrace(logger)
            return false
        }
    }
    
    /**
     * Only available in Enumeration by default since Java 9 :(
     */
    private static def <E> Iterator<E> toIterator(Enumeration<E> enumeration) {
        return new Iterator<E>() {
            override boolean hasNext() {
                return enumeration.hasMoreElements()
            }
            override E next() {
                return enumeration.nextElement()
            }
        };
    }
}
