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

import de.cau.cs.kieler.prom.PromPlugin
import org.eclipse.core.resources.IProject
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.Path

/**
 * @author aas
 *
 */
class CSimulationCompiler extends SimulationCompiler {
    
    private static val DEFAULT_COMMAND = "gcc -std=c99 -Werror=int-conversion -o \"./${outputFolder}/${executable_name}\""
    
    new() {
        command.value = DEFAULT_COMMAND
    }
    
    new(IProgressMonitor monitor) {
        super(monitor)
    }
    
    override initializeCompilation() {
        super.initializeCompilation 
        // Copy cJSON.c and cJSON.h to output directory of simulation
        createCJsonLibrary(project)
    }
    
    override getProcessArguments() {
        // Example command to compile simulation code: "gcc -std=c99 -o SimulationCode SimulationCode.c"
        val commandArguments = super.processArguments
        return commandArguments + #[file.projectRelativePath.toOSString]
    }
    
    override getSupportedFileExtensions() {
        return #["c"]
    }
    
    /**
     * Copies the cJSON.c and cJSON.h files from the plugin to the directory.
     * @param project the project to copy the files into
     */
    private def void createCJsonLibrary(IProject project) {
        val libPath = new Path(libFolder.stringValue)
        val libFolder = project.getFolder(libPath)
        if(!libFolder.exists) {
            PromPlugin.initializeFolder(project, libPath.toOSString, "platform:/plugin/de.cau.cs.kieler.prom/resources/sim/c/cJSON")
            libFolder.parent.refreshLocal(1, null)
        }
    }
    
    override toString() {
        return "C Simulation compiler"
    }
}