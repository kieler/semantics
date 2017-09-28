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
package de.cau.cs.kieler.simulation

import de.cau.cs.kieler.simulation.backends.SimulationBackend
import java.util.List
import org.eclipse.core.resources.IFile

import static de.cau.cs.kieler.prom.FileExtensions.*

/**
 * @author aas
 *
 */
class SimulationUtil {
    
    public static def void startSimulation(List<IFile> files) {
        if(files.isNullOrEmpty) {
            return
        }
        val context = new SimulationContext
        context.simulationBackend = SimulationBackend.currentBackend
        for(file : files) {
            if(isSimulationConfiguration(file)) {
                context.kisimFile = file
            } else if(isSimulationInput(file)) {
                context.simInFile = file
            } else if(isExecutable(file)) {
                context.executableFiles.add(file)
            } else if(isModel(file)) {
                context.modelFile = file
            }
        }
        context.start
    }
}