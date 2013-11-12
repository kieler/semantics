/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2011 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scg.tts

import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.Node
import java.util.List
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Depth
import de.cau.cs.kieler.scg.Surface
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Exit
import de.cau.cs.kieler.scg.pret.annotation.extensions.TTSAnnotationExtension
import de.cau.cs.kieler.scgdep.*

/**
 * This class is intended to assign timing values to an SCG with dependencies such, that an execution 
 * of the statements in the order of the timing values represents a valid schedule according to the 
 * SCMoC.
 * 
 * @author ima
 * @kieler.design 
 * @kieler.rating
 */
class TimeTriggeredScheduler { // inject the annotation Extensions for time triggered scheduling
    extension TTSAnnotationExtension;

    /**
   * Annotates value of WCET up to the execution of each statement at any of its node`s outgoing edges. 
   * Calculates timing padding such that the ordering given by the timing is a valid schedule.
   * 
   * Start condition: Each node is annotated with its local WCET (annotation named LocalWCET).
   * this value is also annotated as WCET. The entry nodes of the threads to be scheduled are 
   * marked with the isInit-Flag set to true. Those threads do not fork further children. 
   * No edges from depthnodes to ancestor threads. These 
   * conditions relate to the fact, that we want to schedule unnested peer threads for the moment.
   * 
   * @param graph
   *        The graph for which the time triggered scheduling is to be done. It`s edges have to be 
   *        annotated with the WCET value for the statement of their start node.
   */
    def public doScheduledTiming(SCGraph graph) {

        val nodes = graph.getNodes();

        // process the depth paths first
        val depthnodes = nodes.filter[it instanceof Depth];
        val depthnodeList = depthnodes.toList;
        processTiming(depthnodeList, true);

        // process all other paths after that - their incoming depth paths are known now.
        val initnodes = nodes.filter[it.isIsInitial];
        val initnodeList = initnodes.toList;
        processTiming(initnodeList, false);
    }

    /** 
   *  Propagates timing value sums along the paths in an SCGraph, calculating WCRT and 
   *  annotating the values to the edges of the graph. Where necessary, timing paddings are inserted 
   *  for proper scheduling.
   *  
   * @param nodes
   *      The actual list of nodes. A modified BFS will begin at these nodes.
   * 
   * @param depth
   *      Flag that signifies whether we are processing depth paths (true) or not.
   */
    def processTiming(List<Node> nodes, boolean depth) {
        while (! nodes.empty) {

            // Sort (ascending) by max. incoming edge weight
            nodes.sortBy(node|inVal(node));

            // Process nodes in order of execution time
            val node = nodes.remove(0);
            val offset = inVal(node);

            /* The switch statement is for the bookkeeping on the branchvector. In case the node is
             * a conditional, we have to update, in any other case, just propagate.
             * No fork and join as we assumed, the threads do not fork further children.
             */
            val nodeBranchVec = node.branchVec;
            switch node {
                case node instanceof Conditional: {
                    (node as Conditional).getThen().target.setBranchvec(nodeBranchVec);
                    (node as Conditional).getThen().target.addToBranchvec(true);
                    (node as Conditional).getElse().target.setBranchvec(nodeBranchVec);
                    (node as Conditional).getElse().target.addToBranchvec(false);
                }
                case node instanceof Assignment: {
                    (node as Assignment).getNext().target.setBranchvec(nodeBranchVec);
                }
                case node instanceof Surface: {
                    (node as Surface).depth.setBranchvec(nodeBranchVec);
                }
                case node instanceof Depth: {
                    (node as Depth).next.target.setBranchvec(nodeBranchVec);
                }
                case node instanceof Entry: {
                    (node as Entry).next.target.setBranchvec(nodeBranchVec);
                }
                case node instanceof Exit: {
                    // end of thread, do not propagate further
                }
            }
            // Init possible padding value
            var dependencyOffset = 0;
            
            // Check all dependency edges
            if (node instanceof AssignmentDep) {
     //       var dependencyList = (node as AssignmentDep).dependencies.filter[it.target == node].forEach[
     //           e |
     //           val difference = node.WCET - e.
     //       ];
}
        }

    }

    /**
     * Returns the highest incoming edge value for the given node.
     * 
     * @param node
     *      The node for which the calculation is done.
     */
    def int inVal(Node node) {
        return node.incoming.sortBy[it.WCET].last.WCET
    }

}
