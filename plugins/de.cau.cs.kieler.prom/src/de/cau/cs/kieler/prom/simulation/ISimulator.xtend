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