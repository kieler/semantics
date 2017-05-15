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
package de.cau.cs.kieler.test.common.repository

import com.google.common.collect.HashMultimap
import java.io.IOException
import java.nio.file.FileSystems
import java.nio.file.FileVisitResult
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.PathMatcher
import java.nio.file.Paths
import java.nio.file.SimpleFileVisitor
import java.nio.file.attribute.BasicFileAttributes
import java.util.List
import java.util.Map
import java.util.Properties
import java.util.Set
import org.eclipse.xtend.lib.annotations.Data

import static extension java.lang.Boolean.*

/**
 * Provides the models in the model repositories.
 * 
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class ModelsRepository {
    
    /* Environment Variable Keys */
    private static val BAMBOO_WD_KEY = "bamboo_working_directory"
    private static val BAMBOO_ADDITIONAL_REPOS_KEY = "bamboo_additional_models_repositories"
    private static val USER_MODELS_KEY = "models_repository"
    private static val USER_ADDITIONAL_REPOS_KEY = "additional_models_repositories"
    
    /** Models retrieved form repository */
    private static val List<TestModelData> models = newLinkedList
    
    /**
     * Returns an unmodifiable view on the test models of the repository
     */
    public static def getModels() {
        if (ModelsRepository.models.empty) {
            readModelsRepository()
        }
        return ModelsRepository.models.unmodifiableView
    }
    
    /**
     * Traverses the models repository and creates an index.
     */
    private static def readModelsRepository() {
        ModelsRepository.models.clear
        
        // Find models repository
        val bambooWD = System.getenv(BAMBOO_WD_KEY)
        val bambooAdditionalRepositories = System.getenv(BAMBOO_ADDITIONAL_REPOS_KEY)
        val userModelsRepository = System.getenv(USER_MODELS_KEY)
        val userAdditionalRepositories = System.getenv(USER_ADDITIONAL_REPOS_KEY)
        var List<Path> repositories = newLinkedList
        
        // compose path
        if (userModelsRepository !== null) {
            repositories.add(Paths.get(userModelsRepository))
            if (userAdditionalRepositories !== null) {
                for (dir : bambooAdditionalRepositories.split(",").map[trim]) {
                    val path = Paths.get(dir)
                    repositories.add(path)
                }
            }
        } else if (bambooWD !== null) {
            repositories.add(Paths.get(bambooWD, "models"))
            if (bambooAdditionalRepositories !== null) {
                for (dir : bambooAdditionalRepositories.split(",").map[trim]) {
                    val path = Paths.get(bambooWD, dir)
                    val name = path.fileName.toString
                    if (name != "models") {
                        repositories.add(path)
                    }
                }
            }
        } else {
            throw new IllegalArgumentException(
                "Cannot detect the models repository." +
                "Please provide the environment variable \""+USER_MODELS_KEY+"\" with the path to the models repository")
        }
        
        for (repo : repositories) {
            // check path
            if (!repo.toFile.isDirectory) {
                throw new IllegalArgumentException(repo + "is not an existing directory")
            }
        
            // traverse
            models.addAll((new ModelsRepositoryIndexer).index(repo))
        }
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
            // Walk directory
            Files.walkFileTree(repository, this)
            // Calculate directory properties
            for (dir : directoryPropertyFiles.keySet.sortBy[nameCount]) {
                val parentPropertiesPattern = dir.getParentPropertiesPattern(repository)
                directoryTestModelPropertiesPatterns.put(dir, new ModelProperties(parentPropertiesPattern, directoryPropertyFiles.get(dir)))
            }
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
                            val traces = sameModelFiles.filter[ f | property.traceExt.exists[f.fileName.toString.endsWith(it)]].sort.toList
                            models.add(new TestModelData(
                                repository,
                                repository.relativize(model),
                                traces.unmodifiableView,
                                property.resourceSetID,
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
            ignore = false
            confidential = false
            modelExt = emptySet
            traceExt = emptySet
            resourceSetID = null
            modelProperties = emptySet
            additionalProperties = emptyMap
        }
        
        package new(ModelProperties parent, Properties propertyFile) {
            ignore = if (propertyFile.containsKey("ignore")) propertyFile.getProperty("ignore").parseBoolean else parent.ignore
            confidential = if (propertyFile.containsKey("confidential")) propertyFile.getProperty("confidential").parseBoolean else parent.confidential
            modelExt = if (propertyFile.containsKey("modelFileExtension")) propertyFile.getProperty("modelFileExtension").split(",").map[trim].toSet else parent.modelExt
            traceExt = if (propertyFile.containsKey("traceFileExtension")) propertyFile.getProperty("traceFileExtension").split(",").map[trim].toSet else parent.traceExt
            resourceSetID = if (propertyFile.containsKey("resourceSetID")) propertyFile.getProperty("resourceSetID").trim else parent.resourceSetID
            // Combine model properties
            modelProperties = newHashSet
            modelProperties.addAll(parent.modelProperties)
            if (propertyFile.containsKey("modelProperties")) {
                for (prop : propertyFile.getProperty("modelProperties").split(",").map[trim].toSet) {
                    if (prop.startsWith("!")) {
                        modelProperties.remove(prop.substring(1))
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