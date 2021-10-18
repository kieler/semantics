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
package de.cau.cs.kieler.esterel.processors.transformators.incremental

import com.google.inject.Inject
import de.cau.cs.kieler.esterel.Halt
import de.cau.cs.kieler.esterel.extensions.EsterelTransformationExtensions

/**
 * @author mrb
 *
 */
class HaltTransformation extends AbstractSCEstDynamicProcessor<Halt> {
    
    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    public static val ID = "de.cau.cs.kieler.esterel.processors.halt"
    
    override getId() {
        return ID
    }

    override getName() {
        return "Halt"
    }
    
    @Inject
    extension EsterelTransformationExtensions
    
    override transform(Halt halt) {
        val statements = getContainingList(halt)
        val pos = statements.indexOf(halt)
        val label = createLabel
        statements.set(pos, label)
        statements.add(pos+1, createPause)
        statements.add(pos+2, createGotoStatement(label))
        lastStatement = statements.get(pos+2)
    }
 
}