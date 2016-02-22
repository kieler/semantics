/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scg.processors.optimizer

import com.google.common.collect.ImmutableList
import com.google.inject.Inject
import de.cau.cs.kieler.scg.ControlFlow
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Fork
import de.cau.cs.kieler.scg.SCGraph

import static extension de.cau.cs.kieler.kitt.tracing.TransformationTracing.*
import static extension de.cau.cs.kieler.kitt.tracing.TracingEcoreUtil.*
import de.cau.cs.kieler.scg.extensions.UnsupportedSCGException
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import de.cau.cs.kieler.scg.extensions.SCGThreadExtensions

/**
 * 
 * The SuperfluousForkRemover removes forks with only one outgoing control flow. 
 * The incoming flows are simply connected to the node following the entry node. 
 * Also the incoming links to the exit node are re-routed to the node succeeding the join.
 * Eventually, all superfluous nodes and control flows are removed. 
 * 
 * @author ssm
 * @kieler.design 2014-05-04 proposed 
 * @kieler.rating 2014-05-04 proposed yellow
 *
 */
class SuperfluousForkRemover extends AbstractOptimizer {

    @Inject
    extension SCGControlFlowExtensions

    @Inject
    extension SCGThreadExtensions

    override optimize(SCGraph scg) {

        // Retrieve all forks with only one outgoing control flow.
        val singleRegionForks = ImmutableList::copyOf(
            scg.nodes.filter(typeof(Fork)).filter[!next.nullOrEmpty && next.size == 1])

        // Initialize a cache for control flows that must be removed afterwards.
        val removeControlFlows = <ControlFlow>newArrayList

        for (fork : singleRegionForks) {
            val ancestorEntry = fork.threadEntry

            // Entry node of the fork
            val entry = fork.getAllNext.head.target as Entry

            // Re-route all control flows to the fork node to the target of the entry node's next flow.
            val forkPreviousControlflows = fork.allPrevious.toList
            for (flows : forkPreviousControlflows) {
                if (entry.next == null) {
                    throw new UnsupportedSCGException(
                        "Cannot re-route entry flows without next target. The SCG seems to be broken.")
                } else {
                    flows.target = entry.next.target
                }
            }

            // Re-route all control flows of to the exit node to the target of the join node's next flow.
            val exitPreviousControlflows = entry.exit.allPrevious.toList
            for (flows : exitPreviousControlflows) {
                if (fork.join.next == null) {
                    throw new UnsupportedSCGException(
                        "Cannot re-route join flows without next target. The SCG seems to be broken.")
                } else {
                    flows.target = fork.join.next.target
                }
            }

            if(tracingActive) {
                //KITT redirect tracing relations
                forkPreviousControlflows.trace(entry.next)
                forkPreviousControlflows.trace(fork.next)
                exitPreviousControlflows.trace(fork.join.next, entry.exit.next)
                ancestorEntry.trace(entry, fork)
                ancestorEntry.exit.trace(entry.exit, fork.join)
            }

            // Add superfluous control flows to the remove list.
            removeControlFlows += fork.join.next
            removeControlFlows += entry.exit.next
            removeControlFlows += entry.next
            removeControlFlows += fork.next

            // Remove the nodes.
            entry.exit.remove
            fork.join.remove
            entry.remove
            fork.remove
        }

        // Remove all marked control flows.
        removeControlFlows.forEach[target.incoming -= it; remove]
        
        scg
    }

}
