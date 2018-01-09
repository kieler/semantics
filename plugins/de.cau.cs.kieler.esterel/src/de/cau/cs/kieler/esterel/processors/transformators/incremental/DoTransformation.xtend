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
import de.cau.cs.kieler.esterel.Do
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

/**
 * @author mrb
 *
 */
class DoTransformation extends InplaceProcessor<EsterelProgram> {
    
    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    
    public static val ID = "de.cau.cs.kieler.esterel.processors.do"
    
    override getId() {
        return ID
    }

    override getName() {
        return "Do"
    }
    
    @Inject
    extension EsterelTransformationExtensions
    
    override process() {
        if (true) {
            if (environment.getProperty(SCEstIntermediateProcessor.NEXT_STATEMENT_TO_TRANSFORM) instanceof Do) {
                val Do doo = environment.getProperty(SCEstIntermediateProcessor.NEXT_STATEMENT_TO_TRANSFORM) as Do
                transform(doo)
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
            model.eAllContents.filter(Do).toList.forEach[transform]
        }
    }
    
    def transform(Do doo) {
        val abort = createAbort
        abort.statements.add(doo.statements)
        // do upto
        if (doo.delay !== null) {
            abort.delay = doo.delay
            abort.statements.add(createHalt)
        }
        // do watching
        else {
            abort.delay = doo.watching
            abort.doStatements.add(doo.watchingStatements)
        }
        doo.replace(abort)
    }

}