/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.launchconfig

import org.eclipse.xtend.lib.annotations.Accessors

/**
 * Container for shell commands.
 * 
 * @author aas
 *
 */
class Command {
    
    new(String command, String label){
        this.command = command
        this.label = label
    }
    
    /**
     * The command to be executed e.g.'echo ${project_name}'
     */
    @Accessors
    private var String command
    
    /**
     * The command ready to be executed with all variables substituted e.g. 'echo MyProject'
     */
    @Accessors
    private var String fullCommand
    
    /**
     * A label for the Console View which communicates stdin, stdout and stderr of this command's process.
     */
    @Accessors
    private var String label 
    
    /**
     * The returned error code of the process from this command.
     */
    @Accessors
    private var int errorCode
}