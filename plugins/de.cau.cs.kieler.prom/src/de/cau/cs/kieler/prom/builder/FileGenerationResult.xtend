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
package de.cau.cs.kieler.prom.builder

import java.util.List
import org.eclipse.core.resources.IFile

/**
 * @author aas
 *
 */
class FileGenerationResult {
    private List<IFile> createdFiles = newArrayList
    private List<BuildProblem> problems = newArrayList
    
    public def void addCreatedFile(IFile createdFile) {
        createdFiles.add(createdFile)
    }
    
    public def List<IFile> getCreateFiles() {
        return createdFiles
    }
    
    public def addProblem(BuildProblem problem) {
        problems.add(problem)
    }
    
    public def getProblems() {
        return problems
    }
}