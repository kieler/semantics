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
import de.cau.cs.kieler.esterel.IfTest
import de.cau.cs.kieler.esterel.extensions.EsterelTransformationExtensions

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

/**
 * @author mrb
 *
 */
class IfTestTransformation extends AbstractSCEstDynamicProcessor<IfTest> {
    
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
    
    override transform(IfTest ifTest) {
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
        lastStatement = conditional
    }

}