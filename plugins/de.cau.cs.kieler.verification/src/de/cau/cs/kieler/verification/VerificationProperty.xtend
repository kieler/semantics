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
package de.cau.cs.kieler.verification

import org.eclipse.core.resources.IFile
import org.eclipse.xtend.lib.annotations.Accessors

/** 
 * @author aas
 */
class VerificationProperty {
    @Accessors private String name = ""
    @Accessors private String formula = ""
    @Accessors private VerificationPropertyType type = VerificationPropertyType.INVARIANT
    @Accessors VerificationPropertyStatus status = VerificationPropertyStatus.PENDING
    
    /**
     * Pointer to a ktrace file with the counterexample.
     * This is only relevant if the property has the status FAILED.
     */
    @Accessors(PUBLIC_GETTER) IFile counterexampleFile = null
    /**
     * Pointer to a file with the output of the process that was executed for verification.
     */
    @Accessors IFile processOutputFile = null
    /**
     * Pointer to a file with the model in the model checker input language (e.g. SMV or Promela).
     */
    @Accessors IFile modelCheckerModelFile = null
    /**
     * Exception that caused the corresponding status.
     * This is only relevant if the property has the status EXPECTION.
     */
    @Accessors(PUBLIC_GETTER) Exception cause = null
    
    new(String name, String formula, VerificationPropertyType type) {
        this.name = name
        this.formula = formula
        this.type = type
    }
    
    override toString() {
        return '''VerificationProperty@«hashCode»(name:«name», formula:«formula», status:«status»)'''
    }
    
    public def void fail(IFile counterexampleFile) {
        this.status = VerificationPropertyStatus.FAILED
        this.counterexampleFile = counterexampleFile
    }
    
    public def void fail(Exception e) {
        this.cause = e
        this.status = VerificationPropertyStatus.EXCEPTION
    }
}
