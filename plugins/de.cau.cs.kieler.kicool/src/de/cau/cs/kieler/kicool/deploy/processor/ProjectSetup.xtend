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

import de.cau.cs.kieler.core.model.properties.IProperty
import de.cau.cs.kieler.core.model.properties.Property
import de.cau.cs.kieler.kicool.compilation.CodeContainer
import de.cau.cs.kieler.kicool.deploy.ProjectInfrastructure
import java.io.File
import java.io.FileOutputStream
import java.io.FileWriter
import java.io.IOException
import java.io.InputStream
import java.io.OutputStream
import java.io.PrintStream
import java.net.URL
import java.nio.file.Files
import java.util.Map
import org.eclipse.core.runtime.Platform
import org.eclipse.emf.common.util.URI

import static com.google.common.base.Preconditions.*
import java.util.List
import java.util.Comparator

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class ProjectSetup extends AbstractDeploymentProcessor<CodeContainer> {

    public static val IProperty<List<String>> CLEAR = 
        new Property<List<String>>("de.cau.cs.kieler.kicool.deploy.setup.clear", null)
    
    public static val IProperty<Map<String, String>> COPY = 
        new Property<Map<String, String>>("de.cau.cs.kieler.kicool.deploy.setup.copy", null)
        
    public static val IProperty<Boolean> SAVE = 
        new Property<Boolean>("de.cau.cs.kieler.kicool.deploy.setup.save.input", true)
    
    override getId() {
        "de.cau.cs.kieler.kicool.deploy.setup"
    }
    
    override getName() {
        "Project Setup"
    }
    
    override process() {
        // Setup project infrastructure
        val infra = ProjectInfrastructure.getProjectInfrastructure(environment)
        if (infra.generatedCodeFolder === null) {
            return
        } else {
            infra.log(logger)
        }
        
        // Tasks
        if (environment.getProperty(SAVE)) {
            infra.saveCode(logger)
        }
        infra.clearTask(logger)    
        infra.copyTask(logger)
        
        // refresh project
        infra.refresh
        
        // report
        saveLog("setup-report.log")
    }
    
    // ---------------
    // -- SAVE CODE --
    // ---------------
    
    protected def saveCode(ProjectInfrastructure infra, PrintStream logger) {
        logger.println("== Save Generated Code ==")
        
        for (file : model.files) {
            logger.println("Saving " + file.fileName)
            try {
                val target = new File(infra.generatedCodeFolder, file.fileName)
                val writer = new FileWriter(target)
                writer.write(file.code)
                writer.close
                
                infra.sourceCodeFiles += target
                infra.sourceCode = model
            }  catch (Exception e) {
                environment.errors.add("Can not save file " + file.fileName, e)
                logger.print("ERROR: Can not save file " + file.fileName)
                e.printStackTrace(logger)
            }
        }
        
        logger.println
    }
    
    // ------------------
    // -- COPY FILE(S) --
    // ------------------    
    
    protected def copyTask(ProjectInfrastructure infra, PrintStream logger) {
        val copyMap = environment.getProperty(COPY)?:emptyMap
        if (!copyMap.empty) {
            logger.println("== Copy Environment ==")

            for (entry : copyMap.entrySet) {
                val target = new File(infra.generatedCodeFolder, entry.value)
                logger.println("Copying from " + entry.key + " to " + infra.getProjectRelativeFile(target))
                var URI source = null
                try {
                    source = URI.createURI(entry.key)
                } catch (Exception e) {
                    environment.errors.add("Can not parse source URI in copy task", e)
                    logger.print("ERROR: Can not parse source URI in copy task")
                    e.printStackTrace(logger)
                }
                
                try {
                    if (source.file) {
                        val sourceFile = new File(source.toFileString)
                        val success = if (sourceFile.file) {
                            sourceFile.copyFile(target, logger, true)
                        } else {
                            sourceFile.copyFolder(target, logger, true)
                        }
                        if (!success) environment.errors.add("Copying file(s) was not successful!")
                    } else if (source.platformPlugin) {
                        val success = if (source.fileExtension.nullOrEmpty) {
                            source.copyFolder(target, logger, true)
                        } else {
                            source.copyFile(target, logger, true)
                        }
                        if (!success) environment.errors.add("Copying file(s) was not successful!")
                    } else {
                        target.mkdirs
                        environment.errors.add("Source URI format is not supported")
                        logger.print("ERROR: Source URI format is not supported")
                    }
                } catch (Exception e) {
                    environment.errors.add("Error while copying file(s)", e)
                    logger.print("ERROR: Exception while copying file(s)")
                    e.printStackTrace(logger)
                }
                logger.println
            }
            
            logger.println
        }
    }
    
    // -------------------
    // -- CLEAR FILE(S) --
    // -------------------    
    
    protected def clearTask(ProjectInfrastructure infra, PrintStream logger) {
        val clearList = environment.getProperty(CLEAR)?:emptyList
        if (!clearList.empty) {
            logger.println("== Clear Environment ==")
            
            for (entry : clearList) {
                val target = new File(infra.generatedCodeFolder, entry)
                val success = target.deleteRecursively(logger)
                if (!success) environment.errors.add("Error while clearing file(s)")
                logger.println
            }
            
            logger.println
        }
    }
    
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

        val bundle = Platform.getBundle(src.segment(1))
        val path = src.segments.drop(2).join("/")

        // Copy files from bundle which are in the directory.
        val entries = bundle.findEntries(path, "*.*", true)
        if (entries !== null) {
            for (var e = entries; e.hasMoreElements;) {
                val fileUrl = e.nextElement
                val fileUrlPath = fileUrl.toString
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

        val bundle = Platform.getBundle(src.segment(1))
        val path = src.segments.drop(2).take(src.segmentCount - 3).join("/")

        // Copy files from bundle which are in the directory.
        val entries = bundle.findEntries(path, src.lastSegment, true)
        if (entries !== null) {
            val fileUrl = entries.nextElement
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
}