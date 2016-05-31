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
package de.cau.cs.kieler.scg.priorities

import de.cau.cs.kieler.kico.AbstractKielerCompilerAuxiliaryData
import de.cau.cs.kieler.scg.Node
import java.util.HashMap

/**
 * @author lpe
 *
 */
class PriorityAuxiliaryData extends AbstractKielerCompilerAuxiliaryData {
    
    private HashMap<Node, Integer> nodePrio
    private HashMap<Node, Integer> threadSegmentID
    private HashMap<Node, Integer> optimizedPrioID
    
    new(HashMap<Node, Integer> npr) {
        nodePrio = npr.clone as HashMap<Node, Integer>
    }
    
    public def void setNodePrio(HashMap<Node, Integer> npr) {
        nodePrio = npr.clone as HashMap<Node, Integer>
    }
    
    public def HashMap<Node, Integer> getNodePrio() {
        nodePrio
    }
    
    public def void setThreadSegmentID(HashMap<Node, Integer> tsid) {
        threadSegmentID = tsid.clone as HashMap<Node, Integer>
    }
    
    public def HashMap<Node, Integer> getThreadSegmentID() {
        threadSegmentID
    }
    
    public def void setOptimizedPrioID(HashMap<Node, Integer> opid) {
        optimizedPrioID = opid.clone as HashMap<Node, Integer>
    }
    
    public def HashMap<Node, Integer> getOptimizedPrioID() {
        optimizedPrioID
    }
    
}