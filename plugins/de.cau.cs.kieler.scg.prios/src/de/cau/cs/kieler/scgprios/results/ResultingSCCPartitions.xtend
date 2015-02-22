/**
 * 
 */
package de.cau.cs.kieler.scgprios.results

import de.cau.cs.kieler.kico.AbstractKielerCompilerAncillaryData
import java.util.LinkedList
import de.cau.cs.kieler.scg.Node

/**
 * @author cbu
 *
 */
class ResultingSCCPartitions extends AbstractKielerCompilerAncillaryData {
    
    private var LinkedList<LinkedList<Node>> sccPartitions
    
    def getSCCPartitions(){
        sccPartitions
    }
    
    def void setSCCPartitions(LinkedList<LinkedList<Node>> sccPartitions){
        this.sccPartitions = sccPartitions
    }
    
}