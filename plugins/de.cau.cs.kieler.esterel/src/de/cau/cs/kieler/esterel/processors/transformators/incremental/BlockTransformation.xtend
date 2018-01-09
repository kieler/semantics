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
import de.cau.cs.kieler.esterel.Block
import de.cau.cs.kieler.scl.ScopeStatement
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

/**
 * @author mrb
 *
 */
class  BlockTransformation extends InplaceProcessor<EsterelProgram> {
    
    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    
    public static val ID = "de.cau.cs.kieler.esterel.processors.block"
    
    override getId() {
        return ID
    }

    override getName() {
        return "Block"
    }
    
    @Inject
    extension EsterelTransformationExtensions
    
    override process() {
        if (true) {
            if (environment.getProperty(SCEstIntermediateProcessor.NEXT_STATEMENT_TO_TRANSFORM) instanceof Block) {
                val Block block = environment.getProperty(SCEstIntermediateProcessor.NEXT_STATEMENT_TO_TRANSFORM) as Block
                transform(block)
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
            model.eAllContents.filter(Block).toList.forEach[transform]
        }
    }
    
    def transform(Block block) {
        val ScopeStatement scope = block.statements.createScopeStatement
        block.replace(scope)
        environment.setProperty(SCEstIntermediateProcessor.NEXT_STATEMENT_TO_TRANSFORM, scope)
    }
    
}