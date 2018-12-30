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
 package de.cau.cs.kieler.sccharts.verification.backend.task

import de.cau.cs.kieler.sccharts.verification.VerificationContext
import de.cau.cs.kieler.sccharts.verification.backend.VerificationBackendTask

/**
 * @author aas
 */
class CompileToSmvTask implements VerificationBackendTask {
    
    private val VerificationContext context
    
    new(VerificationContext context) {
        this.context = context
    }
    
    override getName() {
        return "Compile to SMV"
    }
    
    override run() {
        
    }
}
