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

import java.nio.file.Path
import org.eclipse.jgit.api.Git
import org.eclipse.jgit.storage.file.FileRepositoryBuilder

import static com.google.common.base.Preconditions.*

/**
 * Provides utilities for the models in the model repositories.
 * 
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class ModelsRepositoryUtil {

    private static val repositoryCache = <Path, Git>newHashMap

    /**
     * Retrieves the current commit checksum of the given file.
     */
    public static def getFileVersion(Path repository, Path relativeFile) {
        initCache
        checkArgument(repositoryCache.containsKey(repository), "Given path is not a git repository " + repository)
        val git = repositoryCache.get(repository)
        val lastRev = git.log.addPath(relativeFile.toString).setMaxCount(1).call.head
        return lastRev.getName
    }

    // ----------------------------------------------------------------------------------------------------------------
    
    private static def initCache() {
        if (repositoryCache.empty) {
            for (repositoryPath : ModelsRepository.repositories) {
                val builder = new FileRepositoryBuilder();
                val repository = builder.setGitDir(repositoryPath.resolve(".git").toFile).setMustExist(true).readEnvironment().findGitDir().build()
                repositoryCache.put(repositoryPath, new Git(repository))
            }
        }
    }
}
