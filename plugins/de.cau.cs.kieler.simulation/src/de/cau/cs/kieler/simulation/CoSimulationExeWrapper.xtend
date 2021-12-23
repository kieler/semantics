/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2019 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.simulation

import de.cau.cs.kieler.kicool.compilation.ExecutableContainer
import java.io.File

/**
 * @author als
 */
class CoSimulationExeWrapper extends SimulationModelWrapper {
    
    new(File file) {
        super(new ExecutableContainer(file), null)
    }
    
    override protected readOutput(DataPool pool) {
        val dp = new DataPool
        super.readOutput(dp)
        // Remove non-output
        dp.pool.entrySet.removeIf[
            val info = this.variables.variables.get(it.key)
            if (info !== null) {
                return !info.exists[isOutput]
            }
            return true
        ]
        pool.setOutput(this, dp.pool)
    }
    
}