/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2018 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
 package de.cau.cs.kieler.sccharts.verification

import org.eclipse.core.resources.IFile
import org.eclipse.xtend.lib.annotations.Accessors

class VerificationResult {
    @Accessors VerificationResultStatus status = VerificationResultStatus.PENDING
    /**
     * Pointer to a ktrace file with the counterexample
     */
    @Accessors IFile counterexampleFile = null
    /**
     * Pointer to a file with the output of the process that is executed for verification
     */
    @Accessors IFile processOutputFile = null
    /**
     * Exception that caused the corresponding status
     */
    @Accessors Exception cause = null
    
    new(VerificationResultStatus status) {
        this.status = status
    }
    
    new(Exception e) {
        this(VerificationResultStatus.EXCEPTION)
        this.cause = e
    }
    
    new(IFile counterexampleFile) {
        this(VerificationResultStatus.FAILED)
        this.counterexampleFile = counterexampleFile
    }
}
