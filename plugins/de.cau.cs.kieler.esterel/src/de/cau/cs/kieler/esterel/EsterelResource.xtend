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
package de.cau.cs.kieler.esterel

import org.eclipse.xtext.linking.lazy.LazyLinkingResource
import org.eclipse.xtext.parser.IParseResult
import de.cau.cs.kieler.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.scl.StatementContainer

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class EsterelResource extends LazyLinkingResource {
    
    extension EsterelFactory = EsterelFactory.eINSTANCE
    
    override updateInternalState(IParseResult parseResult) {
        val root = parseResult.rootASTElement
        
        if (root instanceof EsterelProgram) {
            // Collect
            val parallels = newLinkedList
            val threads = newLinkedList
            for (EObj : root.eAllContents.toIterable) {
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
                    if (parent instanceof StatementContainer) {
                        parent.statements.addAll(parent.statements.indexOf(thread), thread.statements)
                        parent.statements.remove(thread)
                    }
                }
            }      
        }
        super.updateInternalState(parseResult)
    }
    
    override doLinking() {
        super.doLinking
        
        // Fix tick references
        val root = parseResult?.rootASTElement
        if (root instanceof EsterelProgram) {
            if (root.tick === null) {
                root.tick = KExpressionsFactory.eINSTANCE.createValuedObject => [
                    name = "tick"
                ]
            }
            root.eAllContents.filter(TickReference).forEach[valuedObject = root.tick]
        }        
    }
}