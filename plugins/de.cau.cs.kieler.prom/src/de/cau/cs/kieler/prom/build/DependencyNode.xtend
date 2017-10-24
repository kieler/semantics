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
import org.eclipse.core.resources.IFile
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * A node in the dependency graph. It contains file handle as well as a list for dependencies and depending nodes.
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
     * The file handle
     */
    @Accessors
    private var IFile file
    
    /**
     * Flag that can be set when visiting in a depth first search or breadth first search 
     */
    protected int seen
    
    /**
     * Flag to indicate that this file should be built
     */
    public boolean shouldBeBuilt
    
    /**
     * Constructor
     * 
     * @param file The file
     */
    new(IFile file) {
        this.file = file
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
        return "node '"+id+"' ("+shouldBeBuilt+")"
    }
    
    public def String getId() {
        return file.fullPath.toOSString
    }
}