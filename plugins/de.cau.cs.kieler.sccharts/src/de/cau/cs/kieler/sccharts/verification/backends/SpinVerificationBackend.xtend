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
 package de.cau.cs.kieler.sccharts.verification.backends

import de.cau.cs.kieler.sccharts.verification.VerificationContext

/**
 * @author aas
 */
class SpinVerificationBackend implements VerificationBackend {
    
    override getVerificationTasks(VerificationContext context) {
        val dummyTask = new VerificationSubTask {
            override getName() {
                return "Dummy Task"
            }
            
            override run() {
                
            }    
        }
        return newArrayList(dummyTask)
    }
}
