/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
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

/**
 * @author mrb
 *
 */
class LoopTransformation extends InplaceProcessor<EsterelProgram> {
    
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
    
    override process() {
        model.eAllContents.filter(Loop).toList.forEach[transform]
    }
    
    def transform(Loop loop) {
        val statements = getContainingList(loop)
        val pos = statements.indexOf(loop)
        val label = createLabel
        statements.set(pos, label)
        if (loop.delay === null) {
            loop.statements.add(createGotoStatement(label))
            statements.add(pos+1, loop.statements)
        }
        else {
            val abort = createAbort
            abort.statements.add(loop.statements)
            abort.statements.add(createHalt)
            abort.delay = loop.delay
            for (a : loop.annotations) {
                if (isGenerated(a)) {
                    abort.annotations.add(copy(a))
                }
            }
            statements.add(pos+1, abort)
            statements.add(pos+2, createGotoStatement(label))
        }    
    }
 
}