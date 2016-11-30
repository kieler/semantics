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

class JavaCodeSimulator implements ISimulator {
    
    public new(){
        
    }
    
    override simulate(List<IFile> inputFiles, List<IFile> compiledFiles, List<CompilationResult> compilationResults) {
        println("Simulating java with "+ inputFiles + ", "+compiledFiles + ", "+compilationResults)
    }
    
}