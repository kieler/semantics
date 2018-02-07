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
 * Container for information about problems that occured during the build.
 * 
 * @author aas
 *
 */
class BuildProblem {
    /**
     * The resource that has the problem. 
     */
    @Accessors(PUBLIC_GETTER)
    private var IResource res
    
    /**
     * The line in the resource that has the problem.  
     */
    @Accessors
    private var int line = -1
    
    /**
     * Exception that caused the problem.
     */
    @Accessors(PUBLIC_GETTER)
    private var Exception cause = null
    
    /**
     * A message for the user to understand the problem.
     */
    @Accessors(PUBLIC_GETTER)
    private var String message = ""
    
    /**
     * The severity of the problem.
     * Typically this is either IMarker.SEVERITY_WARNING or IMarker.SEVERITY_ERROR
     */
    private var int severity = IMarker.SEVERITY_WARNING
    
    /**
     * Creates a warning
     * 
     * @param res The resource that has the problem
     * @param message The warning message
     */
    static def BuildProblem createWarning(IResource res, String message) {
        return createWarning(res, message, null)
    }
    
    /**
     * Creates a warning
     * 
     * @param res The resource that has the problem
     * @param cause The exception that caused the issue
     */
    static def BuildProblem createWarning(IResource res, Exception cause) {
        return createWarning(res, cause.message, cause)
    }
    
    /**
     * Creates a warning
     * 
     * @param res The resource that has the problem
     * @param message The warning message for the user
     * @param cause The exception that caused the issue
     */
    static def BuildProblem createWarning(IResource res, String message, Exception cause) {
        return new BuildProblem(IMarker.SEVERITY_WARNING, res, message, cause)
    }
    
    /**
     * Creates a error
     * 
     * @param res The resource that has the problem
     * @param message The error message
     */
    static def BuildProblem createError(IResource res, String message) {
        return createError(res, message, null)
    }
    
    /**
     * Creates a error
     * 
     * @param res The resource that has the problem
     * @param cause The exception that caused the issue
     */
    static def BuildProblem createError(IResource res, Exception cause) {
        return createError(res, cause.toString, cause)
    }
    
    /**
     * Creates a error
     * 
     * @param res The resource that has the problem
     * @param message The error message
     * @param cause The exception that caused the issue
     */
    static def BuildProblem createError(IResource res, String message, Exception cause) {
        return new BuildProblem(IMarker.SEVERITY_ERROR, res, message, cause)
    }
    
    /**
     * Constructor
     */
    private new(int severity, IResource res, String message) {
        this(severity, res, message, null)
    }
    
    /**
     * Constructor
     */
    private new(int severity, IResource res, String message, Exception cause) {
        this.severity = severity
        this.res = res
        this.message = message
        this.cause = cause
    }
    
    /**
     * Checks whether this problem is a warning or an error.
     * 
     * @return true if it is a warning, false otherwise.
     */
    public def boolean isWarning() {
        return severity == IMarker.SEVERITY_WARNING
    }
    
    /**
     * Checks whether this problem is a warning or an error.
     * 
     * @return true if it is an error, false otherwise.
     */
    public def boolean isError() {
        return severity == IMarker.SEVERITY_ERROR
    }
    
    /**
     * Creates a string with the message and cause and where the issue occurs (the resource and line)
     * 
     * {@inheritDoc}
     */
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
            if (cause.cause !== null) {
                sb.append("\n caused by ").append(cause.cause.class.name).append(": ").append(cause.cause.message)
            }
            for (StackTraceElement element : cause.getStackTrace()) {
                sb.append(element.toString()).append("\n")
            }
        }
        
        return sb.toString
    }
}