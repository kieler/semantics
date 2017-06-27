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

import org.eclipse.core.resources.IFile
import org.eclipse.core.runtime.IProgressMonitor

/**
 * @author aas
 *
 */
abstract class SimulationCompiler {
    
    protected SimulationGenerationResult result
    protected var IProgressMonitor monitor
    
    public def String[] getSupportedFileExtensions()
    public def SimulationGenerationResult compile(IFile file)
    
    new(IProgressMonitor monitor) {
        this.monitor = monitor
    }
    
    public def boolean canCompile(IFile file) {
        return supportedFileExtensions.contains(file.fileExtension)
    }
}