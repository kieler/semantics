package de.cau.cs.kieler.prom.simulation

import java.util.List
import org.eclipse.core.resources.IFile
import de.cau.cs.kieler.kico.CompilationResult

class CoreSCChartsSimulator implements ISimulator {
    
    public new(){
        
    }
    
    override simulate(List<IFile> inputFiles, List<IFile> compiledFiles, List<CompilationResult> compilationResults) {
        println("Simulating core sccharts with "+ inputFiles + ", "+compiledFiles + ", "+compilationResults)
    }
}