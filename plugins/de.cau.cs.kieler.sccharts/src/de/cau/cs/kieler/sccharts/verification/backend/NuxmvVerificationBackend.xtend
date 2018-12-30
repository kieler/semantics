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
 package de.cau.cs.kieler.sccharts.verification.backend

import de.cau.cs.kieler.sccharts.verification.VerificationContext
import de.cau.cs.kieler.sccharts.verification.backend.task.CompileToSmvTask
import de.cau.cs.kieler.sccharts.verification.backend.task.RunNuxmvTask

/**
 * @author aas
 */
class NuxmvVerificationBackend implements VerificationBackend {
    
    override getVerificationTasks(VerificationContext context) {
        val compileTask = new CompileToSmvTask(context)
        val runTask = new RunNuxmvTask(context, compileTask)
        return newArrayList(compileTask, runTask)
    }
}
