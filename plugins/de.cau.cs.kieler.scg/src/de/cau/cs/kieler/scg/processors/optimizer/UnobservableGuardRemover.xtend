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
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.SCGraphs
import de.cau.cs.kieler.scg.extensions.SCGDependencyExtensions
import de.cau.cs.kieler.scg.processors.analyzer.LoopAnalyzerV2
import de.cau.cs.kieler.scg.processors.analyzer.SingleLoop
import java.util.Set

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.scg.extensions.SCGMethodExtensions

/**
 * @author ssm
 * @kieler.design 2018-07-05 proposed 
 * @kieler.rating 2018-07-05 proposed yellow
 */
class UnobservableGuardRemover extends InplaceProcessor<SCGraphs> implements Traceable {

    @Inject extension SCGDependencyExtensions
    @Inject extension SCGMethodExtensions
    
    override getId() {
        "de.cau.cs.kieler.scg.processors.unobservableGuardRemover"
    }
    
    override getName() {
        "Unobservable Guard Remover"
    }
    
    override process() {
        val model = getModel
        val loopData = environment.getProperty(LoopAnalyzerV2.LOOP_DATA)
        
        if (loopData === null) return;
        
        val unobservableLoops = <SingleLoop> newHashSet
        unobservableLoops.addAll(loopData.loops)
        
        for (loop : loopData.loops) {
            if (loop.criticalNodes.exists[ !dependencies.filter(GuardDependency).empty ]) 
                unobservableLoops -= loop
            for (n : loop.criticalNodes.filter[ it !== null ]) 
                for (d : n.dependencies) {
                    if (!loop.criticalNodes.contains(d.target))
                        unobservableLoops -= loop
                }
        }
        
        val unobservableNodes = <Node> newHashSet
        unobservableLoops.forEach[ unobservableNodes.addAll(it.criticalNodes) ]
        
        for (scg : model.scgs.ignoreMethods) {
            scg.performIneffectiveGuardRemoval(unobservableNodes)
        }
    }
    
    def performIneffectiveGuardRemoval(SCGraph scg, Set<Node> unobservableNodes) {
        for (n : unobservableNodes) {
            for (il :  n.incomingLinks.immutableCopy) {
                il.target = null
                il.remove                
            }
            
            n.remove
        }
    }
 
}
    