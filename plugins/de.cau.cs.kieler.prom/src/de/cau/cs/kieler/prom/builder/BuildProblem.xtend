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
package de.cau.cs.kieler.prom.builder

import org.eclipse.core.resources.IMarker
import org.eclipse.core.resources.IFile
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * @author aas
 *
 */
class BuildProblem {
    @Accessors(PUBLIC_GETTER)
    private var IFile file
    @Accessors(PUBLIC_GETTER)
    private var Exception cause = null
    @Accessors(PUBLIC_GETTER)
    private var String message = ""
    private var int severity = IMarker.SEVERITY_WARNING
    
    static def BuildProblem createWarning(IFile file, String message) {
        return createWarning(file, message, null)
    }
    
    static def BuildProblem createWarning(IFile file, Exception cause) {
        return createWarning(file, cause.message, cause)
    }
    
    static def BuildProblem createWarning(IFile file, String message, Exception cause) {
        return new BuildProblem(IMarker.SEVERITY_WARNING, file, message, cause)
    }
    
    static def BuildProblem createError(IFile file, String message) {
        return createError(file, message, null)
    }
    
    static def BuildProblem createError(IFile file, Exception cause) {
        return createError(file, cause.message, cause)
    }
    
    static def BuildProblem createError(IFile file, String message, Exception cause) {
        return new BuildProblem(IMarker.SEVERITY_ERROR, file, message, cause)
    }
    
    private new(int severity, IFile file, String message) {
        this(severity, file, message, null)
    }
    
    private new(int severity, IFile file, String message, Exception cause) {
        this.severity = severity
        this.file = file
        this.message = message
        this.cause = cause
    }
    
    public def boolean isWarning() {
        return severity == IMarker.SEVERITY_WARNING
    }
    
    public def boolean isError() {
        return severity == IMarker.SEVERITY_ERROR
    }
}