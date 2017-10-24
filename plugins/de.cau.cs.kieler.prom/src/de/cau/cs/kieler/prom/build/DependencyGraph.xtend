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
package de.cau.cs.kieler.prom.build

import java.util.List
import java.util.Map
import org.eclipse.core.resources.IFile
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * A container for dependency nodes.
 *   
 * @author aas
 *
 */
class DependencyGraph {
    /**
     * The nodes in this graph.
     * The key of the map is the node id,
     * the value of the map is the node itself.
     */
    @Accessors(PUBLIC_GETTER)
    private val Map<String, DependencyNode> nodes = newHashMap
    
    /**
     * Returns the nodes that do not have any dependencies.
     * 
     * @return all nodes without dependencies
     */
    public def List<DependencyNode> getLeafs() {
        return nodes.values.filter[it.isLeaf].toList
    }
    
    /**
     * Returns the dependency node with the given id, or null if none.
     * 
     * @return the dependency node with the given id, or null if none
     */
    public def DependencyNode get(IFile file) {
        return nodes.get(getId(file))
    }
    
    /**
     * Returns the dependency node for the given file handle.
     * If no such node exists, it is created.
     * 
     * @return an existing dependency node for the given file, or a new one if none yet. 
     */
    public def DependencyNode getOrCreate(IFile file) {
        var n = get(file)
        if(n == null) {
            n = new DependencyNode(file)
            add(n)
        }
        return n
    }
    
    /**
     * Adds the dependency node to this graph.
     * 
     * @param n The node
     */
    public def void add(DependencyNode n) {
        nodes.put(n.id, n)
    }
    
    /**
     * Removes the dependency node from this graph.
     * 
     * @param n The node
     */
    public def void remove(DependencyNode n) {
        nodes.remove(n.id)
    }
    
    /**
     * Searches for a loop in the dependency graph and returns involved nodes.
     * If no loop exists, null is returned.
     * 
     * @return nodes that create a cyclic dependency or null if none.
     */
    public def List<DependencyNode> findLoop() {
        for(n : nodes.values) {
            n.seen = 0
        } 
        for(n : nodes.values) {
            val loop = findLoop(n)
            if(loop != null) {
                return loop
            }
        } 
        return null
    }
    
    /**
     * Helper method to find loops in the graph.
     * Checks if there is a loop starting from the given node. 
     */
    private def List<DependencyNode> findLoop(DependencyNode n) {
        if(n.seen == 2) {
            // Finished before without cycle
            return null    
        } else if(n.seen == 1) {
            // Found cycle
            return nodes.values.filter[it.seen == 1].toList
        }
        // Now visited
        n.seen = 1
        for(d : n.dependencies) {
            val loop = findLoop(d)
            if(loop != null ) {
                return loop    
            }
        }
        // Now finished without cycle
        n.seen = 2
        return null
    }
    
    /**
     * Returns the nodes in a topological order, i.e., an order that respects all dependencies.
     * The node that represent files to be built are marked correspondingly.
     */
    public def List<DependencyNode> getTopologicalSort(List<IFile> filesToBeBuilt) {
        // Marking algorithm: Count the number of dependencies,
        // If a node has 0 dependencies,
        // add the node to the list, set its dependency count to -1
        // and decrement the dependency count of depending nodes by 1.
        // Repeat until no nodes left.
        
        // Count dependencies of nodes
        val nodeList = newLinkedList
        nodeList.addAll(nodes.values)
        for(n : nodeList) {
            n.seen = n.dependencies.size
            n.shouldBeBuilt = false
        }
        
        // Indicate the files that should be built
        for(file : filesToBeBuilt) {
            val node = nodes.get(getId(file))
            if(node != null) {
                node.shouldBeBuilt = true    
            }
        }
        
        val result = <DependencyNode> newArrayList
        while(result.size < nodeList.size) {
            var boolean newLeafFound = false
            // Remove the leaf nodes
            for(n : nodeList) {
                if(n.seen == 0) {
                    // No dependencies left
                    n.seen = -1
                    result.add(n)
                    // Add the corresponding file to the return list
                    newLeafFound = true
                    // Decrement dependencies of others
                    // Indicate that the files should be built, if this file should be built
                    for(depending : n.depending) {
                        depending.seen--
                        if(n.shouldBeBuilt) {
                            depending.shouldBeBuilt = true
                        }
                    }
                }
            }
            if(!newLeafFound) {
                throw new Exception("There is no topological sort for the dependency graph. There are cyclic dependencies.")
            }
        }
        return result
    }
    
    private def String getId(IFile file) {
        return file.fullPath.toOSString
    }
}