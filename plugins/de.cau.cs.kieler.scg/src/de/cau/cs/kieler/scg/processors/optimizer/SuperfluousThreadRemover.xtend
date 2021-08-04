/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scg.processors.optimizer

import com.google.inject.Inject
import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.properties.Property
import de.cau.cs.kieler.kicool.compilation.InplaceProcessor
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.scg.ControlFlow
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Exit
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.SCGraphs
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import de.cau.cs.kieler.scg.extensions.SCGCoreExtensions

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

/**
 * 
 * The SuperfluousThreadRemover removes threads that contain only entry and exit nodes.
 * It should run before the SuperfluousForkRemover to facilitate its optimization. 
 * 
 * @author ssm
 *
 */
class SuperfluousThreadRemover extends InplaceProcessor<SCGraphs> implements Traceable {
    
    public static val IProperty<Boolean> ENABLE_STR = new Property<Boolean>("de.cau.cs.kieler.sccharts.scg.str", true);

    @Inject extension SCGCoreExtensions
    @Inject extension SCGControlFlowExtensions

    override getId() {
        "de.cau.cs.kieler.scg.processors.str"
    }
    
    override getName() {
        "Superfluous Thread Remover"
    }
    
    override process() {
        if (environment.getProperty(ENABLE_STR)) {
            model.scgs.forEach[optimize]
        }
    }

    def optimize(SCGraph scg) {
        
        // Initialize a cache for control flows that must be removed afterwards.
        
        // Find entry nodes that belong to superfluous threads
        val entries = scg.nodes.filter(Entry).filter[ it.next.target instanceof Exit ].toList
        for(entry : entries) {
            val removeControlFlows = <ControlFlow>newArrayList
            
            val fork = entry.getAllPreviousHeadNode.asFork
            val exit = entry.exit
            val join = fork.join
            removeControlFlows += entry.allPrevious
            removeControlFlows += entry.next
            removeControlFlows += exit.next
            
            exit.remove
            entry.remove
            
            // Remove all marked control flows.
            removeControlFlows.filterNull.forEach[
                target?.incomingLinks?.remove(it) 
                remove
            ]
            
            if (fork.next.size == 0) {
                val forkCFs = fork.allPrevious.toList
                forkCFs.forEach[ target = join.next.target ]
                
                fork.remove
                join.next.remove
                join.remove                   
            }
        }
        
        scg
    }

}
