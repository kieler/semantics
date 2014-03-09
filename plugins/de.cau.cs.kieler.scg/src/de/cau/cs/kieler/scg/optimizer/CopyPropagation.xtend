/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scg.optimizer

import com.google.inject.Inject
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsExtension
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.ControlFlow
import de.cau.cs.kieler.scg.SCGraph

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import com.google.common.collect.ImmutableList

/**
 * @author ssm
 *
 */
 
class CopyPropagation extends AbstractOptimizer {
    
    @Inject
    extension KExpressionsExtension
    
    private static val GUARDNAME = "guard" 
    
    private val referenceAssignments = <Assignment> newArrayList
    
    override optimize(SCGraph scg) {
        scg.nodes.filter(typeof(Assignment)).forEach[
            if (it.assignment instanceof ValuedObjectReference
                && it.valuedObject.name.contains(GUARDNAME)
            ) {
                referenceAssignments += it
            }    
        ]  
        
        val ic = ImmutableList::copyOf(referenceAssignments)  
        
        ic.forEach[ ra |
            val incoming = ImmutableList::copyOf(ra.incoming.filter(typeof(ControlFlow)))
            incoming.forEach[ target = ra.next.target ]
            
            val originalObject = (ra.assignment as ValuedObjectReference).valuedObject 
            val references = ImmutableList::copyOf(scg.eAllContents.filter(typeof(ValuedObjectReference)).filter[ it.valuedObject == ra.valuedObject ])
            for(ref : references) {
                if (ref!=null) 
                    ref.valuedObject = originalObject
            }
            
            scg.removeValuedObject(ra.valuedObject)
            ra.next.target.incoming -= ra.next
            ra.remove
        ]
        
        scg
    }
    
}