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
package de.cau.cs.kieler.esterel.serializer

import de.cau.cs.kieler.esterel.EsterelFactory
import de.cau.cs.kieler.esterel.EsterelParallel
import de.cau.cs.kieler.esterel.EsterelProgram
import de.cau.cs.kieler.esterel.EsterelThread
import de.cau.cs.kieler.esterel.IfTest
import de.cau.cs.kieler.esterel.Present
import de.cau.cs.kieler.esterel.TickReference
import de.cau.cs.kieler.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.scl.StatementContainer
import java.util.List
import de.cau.cs.kieler.scl.Statement

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class EsterelSytaxHelper {
    
    extension EsterelFactory = EsterelFactory.eINSTANCE
    
    def convertUserFriendly(EsterelProgram program) {
        // Collect
        val parallels = newLinkedList
        val threads = newLinkedList
        for (EObj : program.eAllContents.toIterable) {
            switch(EObj) {
                EsterelParallel: parallels += EObj
                EsterelThread: threads += EObj
            }
        }
        
        // Fix single statement threads
        for (parallel : parallels) {
            for (var i = 0; i < parallel.statements.size; i++) {
                val stm = parallel.statements.get(i)
                if (!(stm instanceof EsterelThread)) {
                    val newThread = createEsterelThread => [
                        statements += stm
                    ]
                    // Add because stm is already removed
                    parallel.statements.add(i, newThread)
                }
            }
        }  
        
        // Fix threads w/o parallel
        for (thread : threads) {
            val parent = thread.eContainer
            if (!(parent instanceof EsterelParallel)) {
                if (thread.eContainingFeature.isMany) {
                    val container = parent.eGet(thread.eContainingFeature) as List<Statement>
                    container.addAll(container.indexOf(thread), thread.statements)
                    container.remove(thread)
                }
            }
        }
    }
    
    def convertSerializerFriendly(EsterelProgram program) {
        for (container : program.eAllContents.filter(StatementContainer).toList) {
            if (!(container instanceof EsterelParallel)) {
                if (container.statements.size > 1) {
                    val t = createEsterelThread
                    t.statements.addAll(container.statements)
                    container.statements += t
                }
                if (container instanceof Present) {
                    if (container.elseStatements.size > 1) {
                        val t = createEsterelThread
                        t.statements.addAll(container.elseStatements)
                        container.elseStatements += t
                    }
                }
                if (container instanceof IfTest) {
                    if (container.elseStatements.size > 1) {
                        val t = createEsterelThread
                        t.statements.addAll(container.elseStatements)
                        container.elseStatements += t
                    }
                }
            }
        }
    }
    
    def fixTickReferences(EsterelProgram program) {
        if (program.tick === null) {
            program.tick = KExpressionsFactory.eINSTANCE.createValuedObject => [
                name = "tick"
            ]
        }
        program.eAllContents.filter(TickReference).forEach[valuedObject = program.tick]
    }
}