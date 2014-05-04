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

import com.google.common.collect.ImmutableList
import com.google.inject.Inject
import de.cau.cs.kieler.scg.ControlFlow
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Fork
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.extensions.SCGExtensions

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

/**
 * @author ssm
 *
 */

class SuperfluousForkRemover extends AbstractOptimizer {
    
    @Inject
    extension SCGExtensions
    
    override optimize(SCGraph scg) {
    	val newSCG = scg.copy
    	
    	val singleRegionForks = ImmutableList::copyOf(
    		newSCG.nodes.filter(typeof(Fork)).filter[ !next.nullOrEmpty && next.size==1 ])
    	val removeControlFlows = <ControlFlow> newArrayList
    	
    	singleRegionForks.forEach[ fork |
    		val entry = fork.getAllNext.head.target as Entry
    		
    		fork.allPrevious.forEach[ target = entry.next.target ]
    		entry.exit.allPrevious.forEach[ target = fork.join.next.target ]
    	
    		removeControlFlows += fork.join.next
    		removeControlFlows += entry.exit.next
    		removeControlFlows += entry.next
    		removeControlFlows += fork.next	

    		entry.exit.remove
    		fork.join.remove
    		entry.remove
    		fork.remove
    	]
    	
    	removeControlFlows.forEach[ target.incoming -= it; remove ]
        
        newSCG
    }
 	
}