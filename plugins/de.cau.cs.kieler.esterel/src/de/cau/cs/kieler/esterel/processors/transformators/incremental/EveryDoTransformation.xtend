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
import de.cau.cs.kieler.esterel.EveryDo
import de.cau.cs.kieler.esterel.extensions.EsterelTransformationExtensions

import static org.eclipse.emf.ecore.util.EcoreUtil.*

/**
 * @author mrb
 *
 */
class EveryDoTransformation extends AbstractSCEstDynamicProcessor<EveryDo> {
    
    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    
    public static val ID = "de.cau.cs.kieler.esterel.processors.everydo"
    
    override getId() {
        return ID
    }

    override getName() {
        return "EveryDo"
    }
    
    @Inject
    extension EsterelTransformationExtensions
    
    override transform(EveryDo everyDo) {
        val statements = getContainingList(everyDo)
        val pos = statements.indexOf(everyDo)
        val await = createAwait
        val loop = createLoop
        await.delay = everyDo.delay
        loop.statements.addAll(everyDo.statements)
        loop.delay = copy(await.delay)
        for (a : everyDo.annotations) {
            if (isGenerated(a)) {
                await.annotations.add(copy(a))
                loop.annotations.add(copy(a))
            }
        }
        statements.set(pos, await)
        statements.add(pos+1, loop)
        lastStatement = await
        environment.setProperty(SCEstIntermediateProcessor.TRANSFORM_THIS_STATEMENT, true)
    }
    
}