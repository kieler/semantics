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

import org.eclipse.core.resources.IMarker
import org.eclipse.core.resources.IResource
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * @author aas
 *
 */
class BuildProblem {
    @Accessors(PUBLIC_GETTER)
    private var IResource res
    @Accessors
    private var int line = -1
    @Accessors(PUBLIC_GETTER)
    private var Exception cause = null
    @Accessors(PUBLIC_GETTER)
    private var String message = ""
    private var int severity = IMarker.SEVERITY_WARNING
    
    static def BuildProblem createWarning(IResource res, String message) {
        return createWarning(res, message, null)
    }
    
    static def BuildProblem createWarning(IResource res, Exception cause) {
        return createWarning(res, cause.message, cause)
    }
    
    static def BuildProblem createWarning(IResource res, String message, Exception cause) {
        return new BuildProblem(IMarker.SEVERITY_WARNING, res, message, cause)
    }
    
    static def BuildProblem createError(IResource res, String message) {
        return createError(res, message, null)
    }
    
    static def BuildProblem createError(IResource res, Exception cause) {
        return createError(res, cause.message, cause)
    }
    
    static def BuildProblem createError(IResource res, String message, Exception cause) {
        return new BuildProblem(IMarker.SEVERITY_ERROR, res, message, cause)
    }
    
    private new(int severity, IResource res, String message) {
        this(severity, res, message, null)
    }
    
    private new(int severity, IResource res, String message, Exception cause) {
        this.severity = severity
        this.res = res
        this.message = message
        this.cause = cause
    }
    
    public def boolean isWarning() {
        return severity == IMarker.SEVERITY_WARNING
    }
    
    public def boolean isError() {
        return severity == IMarker.SEVERITY_ERROR
    }
    
    override toString() {
        val sb = new StringBuilder()
        
        sb.append(if (isError) "Error" else "Waring")
        if (res !== null) sb.append(" in ").append(res.toString)
        if (line != -1) sb.append(" in line ").append(line)
        sb.append(": ")
        if (message.nullOrEmpty) {
            if (cause !== null ) sb.append(cause.message)
        } else {
            sb.append(message)
        }
        if (cause !== null) {
            sb.append("\n ").append(cause.class.name).append(": ").append(cause.message)
            for (StackTraceElement element : cause.getStackTrace()) {
                sb.append(element.toString()).append("\n")
            }
        }
        
        return sb.toString
    }
}