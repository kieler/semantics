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
import de.cau.cs.kieler.kicool.compilation.InplaceProcessor
import de.cau.cs.kieler.esterel.extensions.EsterelTransformationExtensions
import de.cau.cs.kieler.esterel.EsterelProgram
import de.cau.cs.kieler.esterel.Loop
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.kicool.compilation.EObjectReferencePropertyData

/**
 * @author mrb
 *
 */
class LoopTransformation extends AbstractSCEstDynamicProcessor<Loop> {
    
    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    
    public static val ID = "de.cau.cs.kieler.esterel.processors.loop"
    
    override getId() {
        return ID
    }

    override getName() {
        return "Loop"
    }
    
    @Inject
    extension EsterelTransformationExtensions
    
    override transform(Loop loop) {
        val statements = getContainingList(loop)
        val pos = statements.indexOf(loop)
        val label = createLabel
        statements.set(pos, label)
        if (loop.delay === null) {
            val goto = label.createGotoStatement
            loop.statements.add(goto)
            statements.addAll(pos+1, loop.statements)
            lastStatement = goto
        }
        else {
            val abort = createAbort
            abort.statements.addAll(loop.statements)
            abort.statements.addHaltFunctionality
            abort.delay = loop.delay
            for (a : loop.annotations) {
                if (isGenerated(a)) {
                    abort.annotations.add(copy(a))
                }
            }
            statements.add(pos+1, abort)
            statements.add(pos+2, label.createGotoStatement)
            lastStatement = abort
            environment.setProperty(SCEstIntermediateProcessor.TRANSFORM_THIS_STATEMENT, true)
        }    
    }
 
}