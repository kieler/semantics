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
 * @author aas
 *
 */
class Command {
    
    new(String command, String label){
        this.command = command
        this.label = label
    }
    
    @Accessors
    private var String command
    
    @Accessors
    private var String fullCommand
    
    @Accessors
    private var String label 
    
    @Accessors
    private var int errorCode
}