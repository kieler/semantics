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
package de.cau.cs.kieler.prom.build

import java.util.List
import org.eclipse.core.resources.IFile

/**
 * Container for information about files and problems that have been created as part of a build.
 * 
 * @author aas
 *
 */
class FileGenerationResult {
    /**
     * The created files.
     */
    private List<IFile> createdFiles = newArrayList
    /**
     * The problems that occured.
     */
    private List<BuildProblem> problems = newArrayList
    
    /**
     * Adds a created file.
     */
    public def void addCreatedFile(IFile createdFile) {
        createdFiles.add(createdFile)
    }
    
    /**
     * Returns the created files.
     */
    public def List<IFile> getCreatedFiles() {
        return createdFiles
    }
    
    /**
     * Adds a problem.
     */
    public def addProblem(BuildProblem problem) {
        problems.add(problem)
    }
    
    /**
     * Returns the problems that occured.
     */
    public def getProblems() {
        return problems
    }
}