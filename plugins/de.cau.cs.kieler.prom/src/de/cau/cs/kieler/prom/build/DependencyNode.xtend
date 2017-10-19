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
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * A node in the dependency graph. It has an id and optional content as well as a list for dependencies and depending nodes.
 * For instance a file handle could use its full path as id whereas the content is the file handle itself.
 * 
 * @author aas
 *
 */
class DependencyNode {
    /**
     * The nodes that this node depends on.
     */
    @Accessors(PUBLIC_GETTER)
    private val List<DependencyNode> dependencies = newArrayList
    /**
     * Other nodes that depend on this node.
     */
    @Accessors(PUBLIC_GETTER)
    private val List<DependencyNode> depending = newArrayList
    
    /**
     * The id of this node. It is used to identify the node.
     * For files this could be the full path.
     */
    @Accessors
    private var String id
    /**
     * Optional content for the node.
     */
    @Accessors
    private var Object content
    
    /**
     * Flag that can be set when visiting in a depth first search or breadth first search 
     */
    protected int seen
    
    /**
     * Constructor
     * 
     * @param id The id
     * @param content The content
     */
    new(String id, Object content) {
        this.id = id
        this.content = content
    }
    
    /**
     * Adds a dependency for this node.
     * 
     * @return n A node that is used by this node.
     */
    public def void addDependency(DependencyNode n) {
        if(!dependencies.contains(n)) {
            dependencies.add(n)            
        }
        if(!n.depending.contains(this)) {
            n.depending.add(this)            
        }
    } 
    
    /**
     * Removes a dependency for this node.
     * 
     * @return n The node.
     */
    public def void removeDependency(DependencyNode n) {
        dependencies.remove(n)            
        n.depending.remove(this)            
    }
    
    /**
     * Removes all dependencies from this node.
     */
    public def void removeAllDependencies() {
        for(d : dependencies.clone) {
            removeDependency(d)
        }
    }
    
    /**
     * Checks if this is a leaf in the dependency graph, i.e., this node has no dependencies.
     * 
     * @return true if this node has no dependencies, false otherwise.
     */
    public def boolean isLeaf() {
        return dependencies.isEmpty
    }
    
    /**
     * {@inheritDoc}
     */
    override toString() {
        return id
    }
}