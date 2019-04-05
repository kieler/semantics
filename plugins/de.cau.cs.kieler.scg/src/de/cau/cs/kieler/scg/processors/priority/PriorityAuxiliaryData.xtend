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
package de.cau.cs.kieler.scg.processors.priority

import de.cau.cs.kieler.scg.Node
import java.util.LinkedList
import de.cau.cs.kieler.kicool.classes.IKiCoolCloneable

/**
 * Class that contains auxiliary data in the form of strongly connected components.
 * Contains a list of lists of nodes that represent a strongly connected component as well as 
 * a hash map that maps each node to a strongly connected component if the node is in one.
 * @author lpe
 *
 */
class PriorityAuxiliaryData implements IKiCoolCloneable {
    
    public static final String OPTIMIZED_NODE_PRIORITIES_ANNOTATION = "optPrioIDs"
    public static final String NODE_PRIORITIES_ANNOTATION = "nodePrios"
    public static final String THREAD_SEGMENT_ANNOTATION = "threadSegmentIDs"
    public static final String MAX_PRIO_ID = "maxPrioID"
    
    LinkedList<LinkedList<Node>> stronglyConnectedComponents
    
    /**
     *  Returns all Strongly Connected Components of a SCG
     */
    def LinkedList<LinkedList<Node>> getStronglyConnectedComponents() {
        stronglyConnectedComponents
    }
    
    /**
     *  Saves the Strongly Connected Components of a SCG for later use
     */
    def void setStronglyConnectedComponents(LinkedList<LinkedList<Node>> scc) {
        this.stronglyConnectedComponents = scc
    }
    
    override isMutable() {
        false
    }
    
    override cloneObject() {
        this
    }
    
}