/**
 * 
 */
package de.cau.cs.kieler.scgprios.extensions

import java.util.LinkedList
import de.cau.cs.kieler.scg.Node

/**
 * This class contains common methods, which are working with strongly connected components
 * 
 * @author cbu
 *
 */
class SCCExtension {
    
    private var commonExt = new CommonExtension
   
    
    /**
     * Returns the children from all nodes of a strongly connected component, which are not contained
     * inside the strongly connected component itself
     * 
     * @param sccPartition
     *          strongly connected component in question
     * @return
     *        list of children of that strongly connected component
     */
    def LinkedList<Node> getChildrenFromSCC(LinkedList<Node> sccPartition){
     
        var children = new LinkedList<Node>
        // get all children from each node
        for (node : sccPartition){
            children.addAll(commonExt.getInstantChildrenOfNode(node))
        }
        var newChildren = commonExt.removeMultipleElements(children)
        // remove children, which are located inside the sccPartition
        for (s : sccPartition){
            newChildren.remove(s)
        }
        newChildren
    }
    
    /**
     * Returns the dependencies from all nodes of a strongly connected component, which are not contained
     * inside the strongly connected component itself
     * 
     * @param sccPartition
     *          strongly connected component in question
     * @return
     *        list of dependencies of that strongly connected component
     */
    def LinkedList<Node> getDependenciesFromSCC(LinkedList<Node> sccPartition){
        
        var depNodes = new LinkedList<Node> 
        // get all dependency nodes for each node
        for (node : sccPartition){
            depNodes.addAll(commonExt.getDependencyNodes(node))
        }
        var cleanDepNodes = commonExt.removeMultipleElements(depNodes) 
        // remove dependencies, which are located inside the sccPartition
        for (s : sccPartition){
            cleanDepNodes.remove(s)
        }
        cleanDepNodes
    }
}