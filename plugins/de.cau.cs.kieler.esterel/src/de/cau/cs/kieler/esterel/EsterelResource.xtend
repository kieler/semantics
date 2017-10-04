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
import java.io.OutputStream
import java.util.Map
import org.eclipse.xtext.resource.SaveOptions
import java.io.OutputStreamWriter
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

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
    
    /**
     * This should not be necessary but the backtracking serialize currently cannot serializer the following pattern: 
     * ( (statements+=InstructionStatement ";" | statements+=MetaStatement)* statements+=InstructionStatement? ))
     */
    override void doSave(OutputStream outputStream, Map<?, ?> options) {
        try {
            super.doSave(outputStream, options)
        } catch (RuntimeException re) {
            if (getContents().isEmpty())
                throw new IllegalStateException("The Xtext resource must contain at least one element.");
            val saveOptions = SaveOptions.getOptions(options);
            setEncodingFromOptions(options);
            val model = getContents().head.copy
            for (container : model.eAllContents.filter(StatementContainer).toList) {
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
            serializer.serialize(model, new OutputStreamWriter(outputStream, getEncoding()), saveOptions);
        }
    }
    
}