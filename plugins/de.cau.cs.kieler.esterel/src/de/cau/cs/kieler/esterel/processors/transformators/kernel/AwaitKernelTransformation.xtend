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
import de.cau.cs.kieler.esterel.EsterelProgram
import de.cau.cs.kieler.esterel.extensions.EsterelExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.kicool.compilation.InplaceProcessor
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import static extension de.cau.cs.kieler.kicool.kitt.tracing.TracingEcoreUtil.*
import de.cau.cs.kieler.esterel.Await
import de.cau.cs.kieler.esterel.EsterelFactory
import de.cau.cs.kieler.scl.SCLFactory

import static extension de.cau.cs.kieler.esterel.processors.transformators.kernel.KernelTransformations.*
import static extension de.cau.cs.kieler.kicool.kitt.tracing.TransformationTracing.*
import de.cau.cs.kieler.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.scl.StatementContainer
import de.cau.cs.kieler.esterel.Present

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class AwaitKernelTransformation extends InplaceProcessor<EsterelProgram> implements Traceable {

    public static val ID = "de.cau.cs.kieler.esterel.processors.transformators.kernel.await"

    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    override getId() {
        return ID
    }

    override getName() {
        return "Await"
    }
    
    override process() {
        // TODO custom iterator
        model.eAllContents.filter(Await).toList.forEach[transformAwait]
    }

    // -------------------------------------------------------------------------
    // -- Injections 
    // -------------------------------------------------------------------------
    extension EsterelFactory = EsterelFactory.eINSTANCE
    extension SCLFactory = SCLFactory.eINSTANCE
    extension KExpressionsFactory = KExpressionsFactory.eINSTANCE
    
    static val TRAP_PREFIX = "_await_trap"
    
    def transformAwait(Await await) {
        val c = (await.eContainer as StatementContainer)
        val Present p = if (!await.cases.nullOrEmpty) { // Cases
            await.delay = createDelayExpression
            val ex = createOperatorExpression => [operator = OperatorType.LOGICAL_OR]
            await.delay.expression = ex
            val p = createPresent
            for (ca : await.cases) {
                ex.subExpressions += ca.delay.expression.copy
                p.cases += createPresentCase.trace(ca) => [
                    expression = ca.delay.expression
                    statements.addAll(ca.statements)
                ]
            }
            await.cases.clear
            p
        }
        val trapSig = createTrapSignal.trace(await) => [
            name = TRAP_PREFIX
            it.uniqueName
        ]
        val trap = createTrap.trace(await) => [
            trapSignals += trapSig
        ]
        val loop = createLoop.trace(await)
        trap.statements += loop
        loop.statements += createPresent.trace(await) => [
            expression = await.delay.expression
            if (await.delay.delay !== null) {
                (if (strict) environment.errors else environment.warnings).add("Cannot handle count delay", await, true)
            }
            if (p != null) {
                statements += p
                
                throw new UnsupportedOperationException("Await case not supported")
            } else if (!await.statements.nullOrEmpty) {
                statements.addAll(await.statements)
                
                throw new UnsupportedOperationException("Await do not supported")
            }
            statements += createExit.trace(await) => [
                trap = trapSig
            ]
        ]
        loop.statements.add(if (await.delay.immediate) 0 else 1, createPause)
        
        await.replace(trap)
    }
    
}