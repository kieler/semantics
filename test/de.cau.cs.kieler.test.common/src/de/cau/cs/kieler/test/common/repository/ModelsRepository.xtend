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

import de.cau.cs.kieler.simulation.testing.TestModelCollection
import java.nio.file.Path
import java.nio.file.Paths

/**
 * Provides the models in the model repositories.
 * 
 * @author als
 */
class ModelsRepository {
    
    /* Environment Variable Keys */
    public static val BAMBOO_WD_KEY = "bamboo_working_directory"
    public static val BAMBOO_MODELS_REPOSITORY_KEY = "bamboo_models_repository"
    public static val MODELS_REPOSITORY_KEY = "models_repository"

    /** Models repository paths */
    static val repositories = <Path>newLinkedList
    /** Test model collection */
    static var TestModelCollection collection = null
    
        
    /**
     * Returns an unmodifiable view on the models of the repositories.
     */
    static def getRepositories() {
        if (ModelsRepository.repositories.empty) {
            findRepositories()
        }
        return ModelsRepository.repositories.unmodifiableView
    }

    /**
     * Retrieves the repositories from the environment.
     */
    private static def findRepositories() {
        ModelsRepository.repositories.clear
        
        // bamboo wd
        val bambooDir = System.getenv(BAMBOO_WD_KEY)
        
        // Find models repository
        var modelsRepositoryEntry = if (System.getenv(MODELS_REPOSITORY_KEY) !== null) {
            System.getenv(MODELS_REPOSITORY_KEY)
        } else {
            System.getenv(BAMBOO_MODELS_REPOSITORY_KEY)
        }
        
        // compose paths
        if (modelsRepositoryEntry !== null) {
            modelsRepositoryEntry = modelsRepositoryEntry.trim
            val paths = if (modelsRepositoryEntry.startsWith("[") && modelsRepositoryEntry.endsWith("]")) {
                modelsRepositoryEntry.substring(1, modelsRepositoryEntry.length - 1).split(",").map[trim].toList
            } else {
                newArrayList(modelsRepositoryEntry)
            }
            for (p : paths) {
                if (bambooDir.nullOrEmpty) {
                    repositories.add(Paths.get(p))
                } else {
                    repositories.add(Paths.get(bambooDir, p))
                }
            }
        } else {
            throw new IllegalArgumentException(
                "Cannot detect the models repository." +
                "Please provide the environment variable \""+MODELS_REPOSITORY_KEY+"\" with the path to the models repository")
        }
    }
    
    /**
     * Returns an unmodifiable view on the test models of the repository.
     */
    static def getModels() {
        if (collection === null) {
            collection = new TestModelCollection(getRepositories().map[toFile])
        }
        return collection.models
    }

}