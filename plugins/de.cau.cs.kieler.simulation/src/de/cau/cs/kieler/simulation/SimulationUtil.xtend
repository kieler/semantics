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

import java.util.List
import org.eclipse.core.resources.IFile
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.SubMonitor
import org.eclipse.emf.ecore.EObject

import static de.cau.cs.kieler.prom.FileExtensions.*

/**
 * @author aas
 *
 */
class SimulationUtil {
    /**
     * Starts a simulation from the given files.
     * The files can contain a kisim file, simin file, trace file or executables.
     */
    public static def void startSimulation(List<IFile> files, IProgressMonitor monitor) {
        if(files.isNullOrEmpty) {
            return
        }
        val context = new SimulationContext
        context.monitor = monitor
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
    
    /**
     * Starts a simulation by compiling an EObject using a suited frontend and backend
     * and afterwards starting the executable result.
     */
    public static def void startSimulation(EObject model, SubMonitor monitor) {
        // Prepare monitor
        val childMonitor = if(monitor != null)
                               monitor.newChild(1)
                           else
                               null
        // Start simulation with the model
        val context = new SimulationContext
        context.model = model as EObject
        context.monitor = childMonitor
        context.start
    }
}