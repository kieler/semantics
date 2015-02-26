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
package de.cau.cs.kieler.scgprios.transform

import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.scg.SCGraph
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Fork
import de.cau.cs.kieler.scg.ControlFlow
import de.cau.cs.kieler.kico.Transformation
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.kico.KielerCompilerException
import de.cau.cs.kieler.scg.Exit

/**
 * This class is part of the SCGPRIO transformation chain. This chain is used to check the scheduling
 * and to calculate and optimize the priorities stepwise for the priority based compilation approach.
 * The transformation can be called manually or used by KiCo to perform a series of transformations.
 * <pre>
 * SCGPRIO 
 *   |-- OptimizeSCG                           <== YOU ARE HERE
 *   |-- NodePriorities                        
 *   |-- OptimizedNodePriorities                   
 *   |-- ThreadSegmentIDs
 *   |-- OptimizedThreadSegmentIDs
 * </pre>
 * 
 * @author cbu
 *
 */
class OptimizeSCGTransformation extends Transformation{
    
    
    /** 
     * Generic model transformation interface.
     * 
     * @param eObject
     *          the root element of the input model
     * @param context
     *          the context of the input model
     * @return 
     *          Returns the modified root element
     */
    override transform(EObject eObject, KielerCompilerContext context) {
        return optimizeThreads(eObject as SCGraph, context)
    }
    
    /**
     * This transformation removes threads which contain only an entry and exit node.
     * This is only necessary, because SCL_P has a problem with empty threads
     * 
     * @param graph: 
     *          SCG with dependencies
     * @result 
     *          unmodified SCG with dependencies
     */
    def SCGraph optimizeThreads(SCGraph scg, KielerCompilerContext context){
        var nodes = scg.nodes
        var nodes2remove = <Node> newLinkedList
        for (n : nodes){
            if (n instanceof Entry){
                var exit = (n as Entry).exit
                if ((n as Entry).next.target.equals(exit)){
                    nodes2remove.add(n)
                }
                
            }
        }
        if (!nodes2remove.empty){
            for (rn : nodes2remove){
                removeThread(scg, rn as Entry, context)
            }
            var superfluousForks = scg.nodes.filter[(it instanceof Fork && (it as Fork).next.length == 1)]
            removeSuperFluousForks(scg, superfluousForks)
        }
        scg
    }
    
    /**
     * Removes regions without further functionality (regions which are only made of entry and exit nodes)
     * This transformation is only required because some test cases contain such regions
     * Otherwise this transformation is absolutely unnecessary.
     * Additionally: if the SCG gets more optimization, this transformation might also become 
     * superfluous.
     * 
     * @param scg
     *          the SCG 
     * @param entry
     *          entry node of region which should be removed
     * @param context
     *          KielerCompilerContext (used for Warning)
     */
    private def void removeThread(SCGraph scg, Entry entry, KielerCompilerContext context){
        var controlFlow = entry.incoming.filter[it instanceof ControlFlow].head
        var fork = controlFlow.eContainer as Fork
        if (fork.next.length > 1){
            // remove nodes
            fork.next.remove(controlFlow)
            fork.join.incoming.remove(entry.exit)
            scg.nodes.remove(entry)
            scg.nodes.remove(entry.exit)
        } else if (fork.next.length == 1){
            // remove fork and join nodes
            var incomings = fork.incoming.filter[it instanceof ControlFlow]
            var newTarget = fork.join.next.target
            if (newTarget.equals(fork)){
                if (context != null) {
                context.getCompilationResult().addPostponedWarning(
                    new KielerCompilerException(id, "The SCG contains instantanious Loop!"));
            }
            } else {
            for (i : incomings){
        
                i.target = newTarget
            }
            scg.nodes.remove(fork)
            scg.nodes.remove(fork.join)
            // remove nodes
            fork.next.remove(controlFlow)
            fork.join.incoming.remove(entry.exit)
            scg.nodes.remove(entry)
            scg.nodes.remove(entry.exit)
            }
            
        }
        
    }
    
    /**
     * Removes fork and join nodes, if there is only a single thread between them
     * 
     * @param scg
     *          the SCG 
     * @param entry
     *          entry node of region which should be removed
     * @param context
     *          KielerCompilerContext (used for Warning)
     */
    private def removeSuperFluousForks(SCGraph scg, Iterable<Node> forklist){
        for (f : forklist){
            var fork = f as Fork
            var incomings = fork.incoming.filter[it instanceof ControlFlow]
            var entry = fork.next.head.target as Entry
            var nextTarget = entry.next.target
            for (i : incomings){
                i.target = nextTarget
            }
            var exit = entry.exit as Exit
            var incomingExit = exit.incoming.filter[it instanceof ControlFlow]
            var exitTarget = fork.join.next.target
            for (e : incomingExit){
                e.target = exitTarget
            }
        }
    }
    
    
    

}