/**
 * 
 */
package de.cau.cs.kieler.scgprios.results

import de.cau.cs.kieler.kico.AbstractKielerCompilerAncillaryData
import de.cau.cs.kieler.scg.Node
import java.util.HashMap

/**
 * @author cbu
 *
 */
abstract class AbstractPriorityResult extends AbstractKielerCompilerAncillaryData{
    
    private var priorityMap = <Node, Integer> newHashMap
    
    def getPriorityMap(){
        priorityMap
    }
    
    def setPriorityMap(HashMap<Node,Integer> priorityMap){
        this.priorityMap = priorityMap
    }
}