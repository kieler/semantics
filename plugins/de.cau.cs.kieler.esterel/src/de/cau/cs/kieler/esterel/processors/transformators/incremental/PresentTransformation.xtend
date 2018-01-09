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
import de.cau.cs.kieler.esterel.Present
import de.cau.cs.kieler.scl.Conditional
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.kicool.compilation.EObjectReferencePropertyData
import org.eclipse.emf.ecore.EObject

/**
 * @author mrb
 *
 */
class PresentTransformation extends InplaceProcessor<EsterelProgram> {
    
    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    
    public static val ID = "de.cau.cs.kieler.esterel.processors.present"
    
    override getId() {
        return ID
    }

    override getName() {
        return "Present"
    }
    
    @Inject
    extension EsterelTransformationExtensions
    
    var EObject lastStatement
    
    override process() {
        val nextStatement = environment.getProperty(SCEstIntermediateProcessor.NEXT_STATEMENT_TO_TRANSFORM).getObject
        val isDynamicCompilation = environment.getProperty(SCEstIntermediateProcessor.DYNAMIC_COMPILATION)
        
        if (isDynamicCompilation) {
            if (nextStatement instanceof Present) {
                transform(nextStatement)
            }
            else {
                throw new UnsupportedOperationException(
                    "The next statement to transform and this processor do not match.\n" +
                    "This processor ID: " + ID + "\n" +
                    "The statement to transform: " + nextStatement
                )
            }
            environment.setProperty(SCEstIntermediateProcessor.NEXT_STATEMENT_TO_TRANSFORM, new EObjectReferencePropertyData(lastStatement))
        }
        else {
            model.eAllContents.filter(Present).toList.forEach[transform]
        }
    }
    
    def transform(Present present) {
        var Conditional conditional
        if (!present.cases.empty) {
            conditional = createConditional(present.cases.get(0).expression)
            conditional.statements.add(present.cases.get(0).statements)
            var tempConditional = conditional
            // present cases lead to nested conditional statements
            for (var i=1; i<present.cases.length; i++) {
                var e = present.cases.get(i)
                var conditional2 = createConditional(e.expression)
                conditional2.statements.add(e.statements)
                var elseStatement = createElseScope(conditional2)
                tempConditional.setElse(elseStatement)
                tempConditional = conditional2
            }
            if (!present.elseStatements.isEmpty) {
                tempConditional.setElse(createElseScope(present.elseStatements))
            }
        }
        else {
            conditional = createConditional(present.expression)
            conditional.statements.add(present.statements)
            if (!present.elseStatements.isEmpty) {
                conditional.setElse(createElseScope(present.elseStatements))
            }
        }  
        present.replace(conditional)  
        lastStatement = conditional
    }
    
}