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
package de.cau.cs.kieler.kicool.compilation

import de.cau.cs.kieler.kicool.System

import static extension de.cau.cs.kieler.kicool.compilation.internal.ContextPopulation.*
import static extension org.eclipse.xtext.EcoreUtil2.*
import de.cau.cs.kieler.kicool.registration.KiCoolRegistration

/**
 * @author ssm
 * @kieler.design 2017-02-19 proposed
 * @kieler.rating 2017-02-19 proposed yellow  
 */
class Compile {
    
    static def CompilationContext createCompilationContext(System system, Object sourceModel) {
        val cc = new CompilationContext => [
            it.system = system.copy
            it.sourceModel = sourceModel
        ]
        
        cc.populateContext
        
        cc
    }
    
    static def CompilationContext createCompilationContext(String systemID, Object sourceModel) {
        //TODO: chanche system paths to id!
        val system = KiCoolRegistration.getSystem(systemID)
        
        createCompilationContext(system, sourceModel)
    }
}