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
package de.cau.cs.kieler.esterel.processors.transformators.kernel

import de.cau.cs.kieler.esterel.EsterelFactory
import de.cau.cs.kieler.esterel.EsterelProgram
import de.cau.cs.kieler.esterel.Loop
import de.cau.cs.kieler.kicool.compilation.InplaceProcessor
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable

import static extension de.cau.cs.kieler.kicool.kitt.tracing.TransformationTracing.*

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class LoopEachKernelTransformation extends InplaceProcessor<EsterelProgram> implements Traceable {

    public static val ID = "de.cau.cs.kieler.esterel.processors.transformators.kernel.loopeach"

    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    override getId() {
        return ID
    }

    override getName() {
        return "Loop Each"
    }
    
    override process() {
        // TODO custom iterator
        model.eAllContents.filter(Loop).filter[delay !== null].toList.forEach[transform]
    }
    
    // !! Produces: abort, halt

    extension EsterelFactory = EsterelFactory.eINSTANCE
    
    def transform(Loop loop) {
        val abort = createAbort.trace(loop) => [
            statements.addAll(loop.statements)
            statements += createHalt.trace(loop)
            delay = loop.delay
        ]
        
        loop.statements += abort
    }
    
}