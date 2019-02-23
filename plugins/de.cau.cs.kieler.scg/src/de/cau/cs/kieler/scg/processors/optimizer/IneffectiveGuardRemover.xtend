/*
RegularSSATransformation.xtend * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2016 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.scg.processors.optimizer

import com.google.inject.Inject
import de.cau.cs.kieler.kicool.compilation.InplaceProcessor
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.scg.GuardDependency
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.SCGraphs
import de.cau.cs.kieler.scg.extensions.SCGDependencyExtensions

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.processors.SimpleGuardExpressions

/**
 * @author ssm
 * @kieler.design 2018-07-05 proposed 
 * @kieler.rating 2018-07-05 proposed yellow
 */
class IneffectiveGuardRemover extends InplaceProcessor<SCGraphs> implements Traceable {

    @Inject extension SCGDependencyExtensions
    
    override getId() {
        "de.cau.cs.kieler.scg.processors.ineffectiveGuardRemover"
    }
    
    override getName() {
        "Ineffective Guard Remover"
    }
    
    override process() {
        val model = getModel
        
        for (scg : model.scgs) {
            scg.performIneffectiveGuardRemoval
        }
    }
    
    def performIneffectiveGuardRemoval(SCGraph scg) {
        val ineffectiveNodes = scg.nodes.filter(Assignment).filter[ 
            dependencies.empty && 
            incomingLinks.filter(GuardDependency).empty &&
            ((reference === null) || (!reference.valuedObject.name.startsWith(SimpleGuardExpressions.TERM_GUARD_NAME)))
        ].toList
        
        for (n : ineffectiveNodes) {
            for (il :  n.incomingLinks.immutableCopy) {
                il.target = null
                il.remove                
            }
            
            n.remove
        }
    }
 
}
    