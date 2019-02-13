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

import de.cau.cs.kieler.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.kicool.ProcessorEntry
import de.cau.cs.kieler.kicool.ProcessorGroup
import de.cau.cs.kieler.kicool.ProcessorReference
import de.cau.cs.kieler.kicool.ProcessorSystem
import de.cau.cs.kieler.kicool.System
import de.cau.cs.kieler.kicool.compilation.CompilationContext
import de.cau.cs.kieler.kicool.registration.KiCoolRegistration
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.util.EcoreUtil.Copier

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

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
        cc.system = cc.originalSystem.copyAndAddToSystemMap(cc) as System
        cc.system.processors.replaceSystemsByGroups(cc)
    }
       
    /**
     * Expand all system entries to full flat group entries.
     */
    static protected def dispatch ProcessorEntry replaceSystemsByGroups(ProcessorSystem processorSystem, CompilationContext cc) {
         val system = KiCoolRegistration.getSystemById(processorSystem.id).copyAndAddToSystemMap(cc) as System
         
         system.processors = system.processors.replaceSystemsByGroups(cc)
         if (system.config !== null) {
             // Move system config into first processor
            val first = system.processors.firstProcessorReference
            if (first.preconfig === null) {
                first.preconfig = KExpressionsFactory.eINSTANCE.createJsonObjectValue
            }
            first.preconfig.members.addAll(0, system.config.members.map[copy])
         }
         return system.processors
    }
    
    static protected def dispatch ProcessorEntry replaceSystemsByGroups(ProcessorReference processorReference, CompilationContext cc) {
        return processorReference
    }

    static protected def dispatch ProcessorEntry replaceSystemsByGroups(ProcessorGroup processorGroup, CompilationContext cc) {
        val newList = <ProcessorEntry> newLinkedList
        for (entry : processorGroup.processors) {
            newList += entry.replaceSystemsByGroups(cc)
        }
        return processorGroup => [
            processors.clear
            processors.addAll(newList)
        ]
    }
    
    static protected def EObject copyAndAddToSystemMap(EObject source, CompilationContext cc) {
        val copier = new Copier
        val result = copier.copy(source) 
        copier.copyReferences
        
        for (eObject : source.eAllContents.filter(ProcessorEntry).toIterable) {
            cc.systemMap.put(copier.get(eObject) as ProcessorEntry, eObject)
        }
        return result
    }
    
    static protected dispatch def ProcessorReference firstProcessorReference(ProcessorReference p) {
        return p
    }
    
    static protected dispatch def ProcessorReference firstProcessorReference(ProcessorGroup g) {
        return g.processors.head.firstProcessorReference
    }
}

