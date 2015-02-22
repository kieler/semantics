/**
 * 
 */
package de.cau.cs.kieler.scgprios.priorities

import java.util.LinkedList
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.Write_Write
import de.cau.cs.kieler.scg.Dependency

/**
 * @author cbu
 *
 */
class Scheduling {
    /**
     * Check, if any strongly connected component contains an iur-edge or if there is any
     * write-write conflict. 
     * 
     * @param sccPartitions: List of partitions of strongly connected components
     * @param context: KielerCompilerContext
     * @param id: ID of current transformation
     * @return Returns true, if the SCG is schedulable
     */
    def boolean scheduleexists(LinkedList<LinkedList<Node>> sccPartitions) {
        for (scc : sccPartitions) {
            for (s : scc) {
                var dependencies = s.dependencies
                for (d : dependencies) {
                    if (d.concurrent && d instanceof Write_Write && !d.confluent) {
                        // SCG contains Write_Write conflict
                        return false
                    } else {
                        if (d.concurrent && !d.confluent && scc.contains(d.target)) {
                            // SCG contains IUR edge in SCC
                            return false
                        }
                    }
                }
            }
        }
        return true
    }
    
    /**
     * Reduces the dependencies to those, which prevent the SCG from being schedulable.
     * This should help the user to understand the problem 
     * 
     * @param sccPartitions: List of partitions of strongly connected components
     */
    def void debugDependencies(LinkedList<LinkedList<Node>> sccPartitions){
        for (scc : sccPartitions){
            for (s : scc){
                var dependencies = s.dependencies
                var dependencies2remove = <Dependency> newLinkedList
                // find dependencies which are not critical
                for (d : dependencies){
                    if (!(d.concurrent && (scc.contains(d.target) || (d instanceof Write_Write)))){
                        dependencies2remove.add(d)
                    }
                }
                // remove those uncritical dependencies
                for (rd : dependencies2remove){
                    s.dependencies.remove(rd)
                }
            }
        }
        
    }
    
}