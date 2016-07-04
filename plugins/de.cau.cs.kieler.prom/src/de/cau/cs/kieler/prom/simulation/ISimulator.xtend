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
 package de.cau.cs.kieler.prom.simulation

import de.cau.cs.kieler.kico.CompilationResult
import java.util.List
import org.eclipse.core.resources.IFile

interface ISimulator {
    
    /**
     * @param inputFiles Models and eso files. Associations can be computed in the simulator
     * @param compiledFiles The saved result of KiCo compilation (e.g. java code, c code, core sct models)
     * @param compilationResults The object that is returned in KiCo compilation. One result per compiled file. With the same order. 
     */
     // Are the compiled files needed if the compilation result is a parameter?
     // -> The files are kind of part of the compilation result?
    public def void simulate(List<IFile> inputFiles, List<IFile> compiledFiles, List<CompilationResult> compilationResults);
    
}