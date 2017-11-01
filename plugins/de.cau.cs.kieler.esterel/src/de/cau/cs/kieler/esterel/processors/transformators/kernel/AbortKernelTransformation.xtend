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

import de.cau.cs.kieler.esterel.Abort
import de.cau.cs.kieler.esterel.EsterelFactory
import de.cau.cs.kieler.esterel.EsterelProgram
import de.cau.cs.kieler.kicool.compilation.InplaceProcessor
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable

import static extension de.cau.cs.kieler.kicool.kitt.tracing.TracingEcoreUtil.*
import static extension de.cau.cs.kieler.kicool.kitt.tracing.TransformationTracing.*

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class AbortKernelTransformation extends InplaceProcessor<EsterelProgram> implements Traceable {

    public static val ID = "de.cau.cs.kieler.esterel.processors.transformators.kernel.abort"

    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    override getId() {
        return ID
    }

    override getName() {
        return "Abort"
    }
    
    override process() {
        // TODO custom iterator
        model.eAllContents.filter(Abort).toList.forEach[transform]
    }
    
    // !! Produces: Await
    
    // -------------------------------------------------------------------------
    // -- Injections 
    // -------------------------------------------------------------------------
    
    extension EsterelFactory = EsterelFactory.eINSTANCE
    
    static val TRAP_PREFIX = "_abort_trap"
    
    def transform(Abort abort) {
        val trapSig = createTrapSignal.trace(abort) => [
            name = TRAP_PREFIX
            it.uniqueName
        ]
        val t1 = createEsterelThread.trace(abort) => [
            statements += createSuspend.trace(abort) => [
                statements.addAll(abort.statements)
                delay = abort.delay.copy
            ]
            statements += createExit.trace(abort) => [
                trap = trapSig
            ]
        ]
        val t2 = createEsterelThread.trace(abort) => [
            statements += createAwait.trace(abort) => [
                delay = abort.delay.copy
            ]
            statements += createExit.trace(abort) => [
                trap = trapSig
            ]
        ]        
        val trap = createTrap.trace(abort) => [
            trapSignals += trapSig
            statements += createEsterelParallel.trace(abort) => [
                statements += t1
                statements += t2
            ]
        ]
        abort.replace(trap)
    }
    
}