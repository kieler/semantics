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
package de.cau.cs.kieler.simulation.testing

import com.google.common.collect.HashMultimap
import java.io.File
import java.io.IOException
import java.nio.file.FileSystems
import java.nio.file.FileVisitResult
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.PathMatcher
import java.nio.file.SimpleFileVisitor
import java.nio.file.attribute.BasicFileAttributes
import java.util.Collection
import java.util.LinkedList
import java.util.List
import java.util.Map
import java.util.Properties
import java.util.Set
import org.eclipse.xtend.lib.annotations.Data

import static extension java.lang.Boolean.*

/**
 * Provides a collection of test models with meta data read from the file system.
 * 
 * @author als
 */
class TestModelCollection {
    
    val List<TestModelData> models = newArrayList
    
    new(File source) {
        this(newArrayList(source))
    }
    new(Collection<File> sources) {
        for (source : sources) {
            // check path
            if (!source.isDirectory) {
                throw new IllegalArgumentException(source.toString + " is not an existing directory.")
            }
        
            // traverse
            models.addAll((new ModelsRepositoryIndexer).index(source.toPath))
        }
    }
        
    /**
     * Returns an unmodifiable view on the test models of this collection.
     */
    def getModels() {
        return models.unmodifiableView
    }
    
    def size() {
        return models.size
    }

    /**
     * Repository Traverser.
     */
    private static class ModelsRepositoryIndexer extends SimpleFileVisitor<Path> {
        
        static val PathMatcher directoryPropertyFileMatcher = FileSystems.getDefault().getPathMatcher("glob:**/directory.properties")
        static val PathMatcher modelPropertyFileMatcher = FileSystems.getDefault().getPathMatcher("glob:**.properties")
        val directoryPropertyFiles = <Path, Properties>newHashMap
        val modelPropertyFiles = <Path, Properties>newHashMap
        val files = HashMultimap.<Path, Path>create
        val directoryTestModelPropertiesPatterns = <Path, ModelProperties>newHashMap
        
        def index(Path repository) {
            val models = new LinkedList
            // Walk directory
            Files.walkFileTree(repository, this)
            // Calculate directory properties
            for (dir : directoryPropertyFiles.keySet.sortBy[nameCount]) {
                val parentPropertiesPattern = dir.getParentPropertiesPattern(repository)
                directoryTestModelPropertiesPatterns.put(dir, new ModelProperties(parentPropertiesPattern, directoryPropertyFiles.get(dir)))
            }
            
            val resourceSets = <String, Set<Path>>newHashMap
            
            // Create model file index
            for (dir : files.keySet) {
                for (fileGroup : files.get(dir).groupBy[fileName.toString.split("\\.", 2).get(0)].entrySet) {
                    val sameModelFiles = fileGroup.value
                    
                    val modelProperty = sameModelFiles.findFirst[modelPropertyFiles.containsKey(it)]
                    val property = if (modelProperty !== null) {
                        new ModelProperties(sameModelFiles.head.getParentPropertiesPattern(repository), modelPropertyFiles.get(modelProperty))
                    } else {
                        sameModelFiles.head.getParentPropertiesPattern(repository)
                    }
                    if (!property.ignore) {
                        sameModelFiles.remove(modelProperty)
                        for (model : sameModelFiles.filter[ f | property.modelExt.exists[f.fileName.toString.endsWith(it)]]) {
                            val relModelPath = repository.relativize(model)
                            resourceSets.putIfAbsent(property.resourceSetID, newHashSet)
                            val resourceSet = resourceSets.get(property.resourceSetID)
                            if (!property.resourceSetID.nullOrEmpty) resourceSet.add(relModelPath)
                            val traces = sameModelFiles.filter[ f | property.traceExt.exists[f.fileName.toString.endsWith(it)]].sort.toList
                            models.add(new TestModelData(
                                repository,
                                relModelPath,
                                traces.unmodifiableView,
                                property.resourceSetID,
                                resourceSet.unmodifiableView,
                                property.modelProperties.unmodifiableView,
                                property.additionalProperties.unmodifiableView,
                                property.confidential
                            ))
                        }
                    }
                }
            }
            
            return models
        }
        
        private def getParentPropertiesPattern(Path file, Path root) {
            var parent = file.parent
            while (parent.nameCount >= root.nameCount) {
                if (directoryTestModelPropertiesPatterns.containsKey(parent)) {
                    return directoryTestModelPropertiesPatterns.get(parent)
                } else {
                    parent = parent.parent
                }
            }
            return new ModelProperties() // default properties
        }
                
        override visitFile(Path file, BasicFileAttributes attrs) throws IOException {
            super.visitFile(file, attrs)
            if (attrs.isRegularFile) {
                if (directoryPropertyFileMatcher.matches(file)) {
                    directoryPropertyFiles.put(file.parent, new Properties => [load(Files.newInputStream(file))])
                } else if (modelPropertyFileMatcher.matches(file)) {
                    modelPropertyFiles.put(file, new Properties => [load(Files.newInputStream(file))])
                    files.put(file.parent, file)
                } else {
                    files.put(file.parent, file)
                }
            }
            return FileVisitResult.CONTINUE
        }     
    }
    
    /**
     * Internal Data Structure for the models repository files.
     */
    @Data
    private static class ModelProperties {
        
        val boolean ignore
        val boolean confidential
        val Set<String> modelExt
        val Set<String> traceExt
        val String resourceSetID
        val Set<String> modelProperties
        val Map<String, String> additionalProperties
        
        package new() {
            ignore = true
            confidential = false
            modelExt = emptySet
            traceExt = emptySet
            resourceSetID = null
            modelProperties = emptySet
            additionalProperties = emptyMap
        }
        
        package new(ModelProperties parent, Properties propertyFile) {
            ignore = if (propertyFile.containsKey("ignore")) propertyFile.getProperty("ignore").trim.parseBoolean else parent.ignore
            confidential = if (propertyFile.containsKey("confidential")) propertyFile.getProperty("confidential").trim.parseBoolean else parent.confidential
            modelExt = if (propertyFile.containsKey("modelFileExtension")) propertyFile.getProperty("modelFileExtension").split(",").map[trim].map[if (it.startsWith(".")) it else "." + it].toSet else parent.modelExt
            traceExt = if (propertyFile.containsKey("traceFileExtension")) propertyFile.getProperty("traceFileExtension").split(",").map[trim].toSet else parent.traceExt
            resourceSetID = if (propertyFile.containsKey("resourceSetID")) propertyFile.getProperty("resourceSetID").trim else parent.resourceSetID
            // Combine model properties
            modelProperties = newHashSet
            modelProperties.addAll(parent.modelProperties)
            if (propertyFile.containsKey("modelProperties")) {
                for (prop : propertyFile.getProperty("modelProperties").split(",").map[trim].toSet) {
                    if (prop.startsWith("!")) {
                        modelProperties.remove(prop.substring(1).trim)
                    } else {
                        modelProperties.add(prop)
                    }
                }
            }
            additionalProperties = newHashMap      
            additionalProperties.putAll(parent.additionalProperties)
            for (entry : propertyFile.entrySet) {
                additionalProperties.put(entry.key as String, entry.value as String)
            }
        }   
    }
}
