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
import de.cau.cs.kieler.esterel.IfTest
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

/**
 * @author mrb
 *
 */
class IfTestTransformation extends InplaceProcessor<EsterelProgram> {
    
    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    
    public static val ID = "de.cau.cs.kieler.esterel.processors.if"
    
    override getId() {
        return ID
    }

    override getName() {
        return "If"
    }
    
    @Inject
    extension EsterelTransformationExtensions
    
    override process() {
        if (true) {
            if (environment.getProperty(SCEstIntermediateProcessor.NEXT_STATEMENT_TO_TRANSFORM) instanceof IfTest) {
                val IfTest ifTest = environment.getProperty(SCEstIntermediateProcessor.NEXT_STATEMENT_TO_TRANSFORM) as IfTest
                transform(ifTest)
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
            model.eAllContents.filter(IfTest).toList.forEach[transform]
        }
    }
    
    def transform(IfTest ifTest) {
        val conditional = createConditional(ifTest.expression)
        conditional.statements.add(ifTest.statements)
        if (!ifTest.elseif.empty) {
            var tempConditional = conditional
            for (e : ifTest.elseif) {
                val conditional2 = createConditional(e.expression)
                conditional2.statements.add(e.statements)
                val elseStatement = createElseScope(conditional2)
                tempConditional.setElse(elseStatement)
                tempConditional = conditional2
            }
            if (!ifTest.elseStatements.isEmpty) {
                tempConditional.setElse(createElseScope(ifTest.elseStatements))
            }
        }
        else if (!ifTest.elseStatements.isEmpty) {
            conditional.setElse(createElseScope(ifTest.elseStatements))
        }
        ifTest.replace(conditional)
    }

}