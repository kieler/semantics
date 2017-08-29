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
 * @author aas
 *
 */
class DependencyNode {
    @Accessors(PUBLIC_GETTER)
    private val List<DependencyNode> dependencies = newArrayList
    @Accessors(PUBLIC_GETTER)
    private val List<DependencyNode> depending = newArrayList
    
    @Accessors
    private var String id
    @Accessors
    private var Object content
    
    /**
     * Flag that can be set when visiting in a depth first search or breadth first search 
     */
    protected int seen
    
    new(String id, Object content) {
        this.id = id
        this.content = content
    }
    
    public def void addDependency(DependencyNode n) {
        if(!dependencies.contains(n)) {
            dependencies.add(n)            
        }
        if(!n.depending.contains(this)) {
            n.depending.add(this)            
        }
    } 
    
    public def void removeDependency(DependencyNode n) {
        dependencies.remove(n)            
        n.depending.remove(this)            
    }
    
    public def void removeAllDependencies() {
        for(d : dependencies.clone) {
            removeDependency(d)
        }
    }
    
    public def boolean isLeaf() {
        return dependencies.isEmpty
    }
    
    override toString() {
        return id
    }
}