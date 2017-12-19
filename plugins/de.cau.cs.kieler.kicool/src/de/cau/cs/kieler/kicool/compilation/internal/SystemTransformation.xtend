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
package de.cau.cs.kieler.kicool.compilation.internal

import de.cau.cs.kieler.kicool.compilation.CompilationContext

import org.eclipse.emf.ecore.util.EcoreUtil.Copier
import de.cau.cs.kieler.kicool.ProcessorEntry
import de.cau.cs.kieler.kicool.ProcessorReference
import de.cau.cs.kieler.kicool.ProcessorGroup
import de.cau.cs.kieler.kicool.ProcessorSystem
import de.cau.cs.kieler.kicool.registration.KiCoolRegistration
import org.eclipse.emf.ecore.EObject

/**
 * Internal class that creates the working copy of the system.
 * 
 * @author ssm
 * @kieler.design 2017-12-19 proposed
 * @kieler.rating 2017-12-19 proposed yellow  
 */
class SystemTransformation {
    
    /**
     * Create instances for all processors (including metrics).
     */
    static def void transformSystem(CompilationContext cc) {
        cc.system = cc.originalSystem.copyAndAddToSystemMap(cc) as de.cau.cs.kieler.kicool.System
        
        cc.flattenSystem
    }
    
    /**
     * Expand all system entries to full flat group entries.
     */
    static def void flattenSystem(CompilationContext cc) {
        cc.system.processors = cc.system.processors.replaceSystemEntry(cc)
    }
    
    static protected def dispatch ProcessorEntry replaceSystemEntry(ProcessorReference processorReference, CompilationContext cc) {
        processorReference
    }

    static protected def dispatch ProcessorEntry replaceSystemEntry(ProcessorGroup processorGroup, CompilationContext cc) {
        val newList = <ProcessorEntry> newLinkedList
        for (entry : processorGroup.processors) {
            newList += entry.replaceSystemEntry(cc)
        }
        processorGroup => [
            processors.clear
            processors.addAll(newList)
        ]
    }
    
    static protected def dispatch ProcessorEntry replaceSystemEntry(ProcessorSystem processorSystem, CompilationContext cc) {
         val system = KiCoolRegistration.getSystemById(processorSystem.id).copyAndAddToSystemMap(cc) as de.cau.cs.kieler.kicool.System
         system.processors
    }
    
    
    static protected def EObject copyAndAddToSystemMap(EObject source, CompilationContext cc) {
        val copier = new Copier
        val result = copier.copy(source) 
        copier.copyReferences
        
        for (eObject : source.eAllContents.filter(ProcessorEntry).toIterable) {
            cc.systemMap.put(copier.get(eObject) as ProcessorEntry, eObject)
        }
        result
    }
}

