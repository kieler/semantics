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
import de.cau.cs.kieler.esterel.Sustain

/**
 * @author mrb
 *
 */
class SustainTransformation extends InplaceProcessor<EsterelProgram> {
    
    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    public static val ID = "de.cau.cs.kieler.esterel.processors.sustain"
    
    override getId() {
        return ID
    }

    override getName() {
        return "Sustain"
    }

    @Inject
    extension EsterelTransformationExtensions
    
    override process() {
        if (true) {
            if (environment.getProperty(SCEstIntermediateProcessor.NEXT_STATEMENT_TO_TRANSFORM) instanceof Sustain) {
                val Sustain sustain = environment.getProperty(SCEstIntermediateProcessor.NEXT_STATEMENT_TO_TRANSFORM) as Sustain
                transform(sustain)
            }
            else {
                throw new UnsupportedOperationException(
                    "The next statement to transform and this processor do not match.\n" +
                    "This processor ID: " + ID + "\n" +
                    "The statement to transform: " + environment.getProperty(SCEstIntermediateProcessor.NEXT_STATEMENT_TO_TRANSFORM)
                )
            }
        }
        else {
            model.eAllContents.filter(Sustain).toList.forEach[transform]
        }
    }
    
    def transform(Sustain sustain) {
        val statements = sustain.getContainingList
        val pos = statements.indexOf(sustain)
        val label = createLabel
        statements.set(pos, label)
        statements.add(pos+1, createEmit(sustain))
        statements.add(pos+2, createPause)
        statements.add(pos+3, createGotoStatement(label))
    }
    
}