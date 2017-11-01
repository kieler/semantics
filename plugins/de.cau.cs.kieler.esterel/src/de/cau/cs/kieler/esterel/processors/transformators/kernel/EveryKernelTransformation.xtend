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

import com.google.inject.Inject
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.esterel.EsterelFactory
import de.cau.cs.kieler.esterel.EsterelProgram
import de.cau.cs.kieler.esterel.Loop
import de.cau.cs.kieler.esterel.extensions.EsterelExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.kicool.compilation.InplaceProcessor
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.scl.SCLFactory
import static extension de.cau.cs.kieler.kicool.kitt.tracing.TransformationTracing.*
import static extension de.cau.cs.kieler.kicool.kitt.tracing.TracingEcoreUtil.*
import de.cau.cs.kieler.esterel.EveryDo
import de.cau.cs.kieler.scl.StatementContainer

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class EveryKernelTransformation extends InplaceProcessor<EsterelProgram> implements Traceable {

    public static val ID = "de.cau.cs.kieler.esterel.processors.transformators.kernel.every"

    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    override getId() {
        return ID
    }

    override getName() {
        return "EveryDo"
    }
    
    override process() {
        // TODO custom iterator
        model.eAllContents.filter(EveryDo).toList.forEach[transform]
    }
    
    // !! Produces: await, loop each

    // -------------------------------------------------------------------------
    // -- Injections 
    // -------------------------------------------------------------------------
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KEffectsExtensions
    @Inject extension AnnotationsExtensions
    @Inject extension EsterelExtensions
    
    extension EsterelFactory = EsterelFactory.eINSTANCE
    extension SCLFactory = SCLFactory.eINSTANCE
    
    def transform(EveryDo every) {
        val c = (every.eContainer as StatementContainer)
        c.statements.add(c.statements.indexOf(every), createAwait => [
            delay = every.delay.copy
        ])
        every.replace(createLoop => [
            statements.addAll(every.statements)
            delay = every.delay
        ])
    }
    
}