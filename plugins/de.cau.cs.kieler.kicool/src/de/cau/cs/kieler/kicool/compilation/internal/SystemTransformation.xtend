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

/**
 * Internal class that creates the working copy of the system.
 * 
 * @author ssm
 * @kieler.design 2017-02-19 proposed
 * @kieler.rating 2017-02-19 proposed yellow  
 */
class SystemTransformation {
    
    /**
     * Create instances for all processors (including metrics).
     */
    static def void transformSystem(CompilationContext cc) {
        val copier = new Copier
        cc.system = copier.copy(cc.originalSystem) as de.cau.cs.kieler.kicool.System
        copier.copyReferences
        
        for (eObject : cc.originalSystem.eAllContents.filter(ProcessorEntry).toIterable) {
            cc.systemMap.put(copier.get(eObject) as ProcessorEntry, eObject)
        }
    }
    
}

