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
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.esterel.UnEmit

/**
 * @author mrb
 *
 */
class UnEmitTransformation extends InplaceProcessor<EsterelProgram> {
    
    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    public static val ID = "de.cau.cs.kieler.esterel.processors.unemit"
    
    override getId() {
        return ID
    }

    override getName() {
        return "UnEmit"
    }

    @Inject
    extension EsterelTransformationExtensions
    
    override process() {
        val nextStatement = environment.getProperty(SCEstIntermediateProcessor.NEXT_STATEMENT_TO_TRANSFORM).getObject
        val isDynamicCompilation = environment.getProperty(SCEstIntermediateProcessor.DYNAMIC_COMPILATION)
        
        if (isDynamicCompilation) {
            if (nextStatement instanceof UnEmit) {
                transform(nextStatement)
            }
            else {
                throw new UnsupportedOperationException(
                    "The next statement to transform and this processor do not match.\n" +
                    "This processor ID: " + ID + "\n" +
                    "The statement to transform: " + nextStatement
                )
            }
        }
        else {
            model.eAllContents.filter(UnEmit).toList.forEach[transform]
        }
    }
    
    def transform(UnEmit unemit) {
        unemit.replace(createAssignment(unemit.signal, createFalse))
    }
    
}