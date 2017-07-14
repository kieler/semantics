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
package de.cau.cs.kieler.simulation.handlers

/**
 * @author aas
 *
 */
class TraceMismatchEvent extends TraceEvent {
    public Object expectedValue
    
    override toString() {
        // The trace number and tick number starts with zero in the data handler.
        // Thus to match the displayed value in the data pool view,
        // it needs to be increased by one
        return "Mismatch of variable '"+variable.name+"' "
             + "after tick "+(tickNumber+1)+" "
             + "of trace "+(traceNumber+1)+" "
             + "from '"+traceFile.projectRelativePath.toOSString+"'\n"
             + "(trace value: "+expectedValue+", simulation value: "+variable.value+")"
    }
}