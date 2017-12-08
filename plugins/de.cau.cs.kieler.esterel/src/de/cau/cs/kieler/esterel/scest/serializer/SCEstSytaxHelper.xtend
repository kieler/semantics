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
package de.cau.cs.kieler.esterel.scest.serializer

import de.cau.cs.kieler.esterel.EsterelFactory
import de.cau.cs.kieler.esterel.EsterelParallel
import de.cau.cs.kieler.esterel.EsterelProgram
import de.cau.cs.kieler.esterel.EsterelStatement
import de.cau.cs.kieler.esterel.IfTest
import de.cau.cs.kieler.esterel.Present
import de.cau.cs.kieler.esterel.serializer.EsterelSytaxHelper
import de.cau.cs.kieler.scl.Conditional
import de.cau.cs.kieler.scl.Label
import de.cau.cs.kieler.scl.ScopeStatement
import de.cau.cs.kieler.scl.Statement
import de.cau.cs.kieler.scl.StatementContainer
import java.util.List
import org.eclipse.emf.ecore.EObject

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class SCEstSytaxHelper extends EsterelSytaxHelper {
    
    extension EsterelFactory = EsterelFactory.eINSTANCE
    
    override convertSerializerFriendly(EsterelProgram program) {
        for (container : program.eAllContents.filter(StatementContainer).toList) {
            if (!(container instanceof EsterelParallel)) {
                if (container.statements.size > 1) {
                    val t = createEsterelThread
                    t.statements.addAll(container.statements)
                    t.statements.chainSatements
                    container.statements += t
                }
                if (container instanceof Present) {
                    if (container.elseStatements.size > 1) {
                        val t = createEsterelThread
                        t.statements.addAll(container.elseStatements)
                        t.statements.chainSatements
                        container.elseStatements += t
                    }
                }
                if (container instanceof IfTest) {
                    if (container.elseStatements.size > 1) {
                        val t = createEsterelThread
                        t.statements.addAll(container.elseStatements)
                        t.statements.chainSatements
                        container.elseStatements += t
                    }
                }
            }
        }
    }
    
    private def chainSatements(List<Statement> stms) {
        if (stms.size > 2) {
            val t = createEsterelThread
            t.statements.addAll(stms.drop(1).toList)
            t.statements.chainSatements
            stms += t
        }
        
    }
    
    def boolean isSCLStatement(EObject obj) {
        if (obj instanceof EsterelStatement) {
            return false
        }
        switch(obj) {
            Conditional,
            Label,
            ScopeStatement,
            Thread: return true
            default: return false
        }
    }
}
