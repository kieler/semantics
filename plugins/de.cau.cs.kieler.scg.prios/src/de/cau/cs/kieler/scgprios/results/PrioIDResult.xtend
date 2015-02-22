/**
 * 
 */
package de.cau.cs.kieler.scgprios.results

import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.kico.AbstractKielerCompilerAncillaryData
import java.util.HashMap

/**
 * @author cbu
 *
 */
class PrioIDResult extends AbstractKielerCompilerAncillaryData {
    
    private var priorityMap = <Node, Long> newHashMap
    
    def getPriorityMap(){
        priorityMap
    }
    
    def setPriorityMap(HashMap<Node,Long> priorityMap){
        this.priorityMap = priorityMap
    }
}