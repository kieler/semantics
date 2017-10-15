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
    @Accessors(PUBLIC_GETTER)
    private val Map<String, DependencyNode> nodes = newHashMap
    
    public def List<DependencyNode> getLeafs() {
        return nodes.values.filter[it.isLeaf].toList
    }
    
    public def DependencyNode get(String id) {
        return nodes.get(id)
    }
    
    public def DependencyNode getOrCreate(IFile file) {
        return getOrCreate(file.fullPath.toOSString, file)
    }
    
    public def DependencyNode getOrCreate(String id, Object content) {
        var n = get(id)
        if(n == null) {
            n = new DependencyNode(id, content)
            add(n)
        }
        return n
    }
    
    public def DependencyNode getOrCreateNode(String id) {
        var n = get(id)
        if(n == null) {
            n = new DependencyNode(id, null)
            add(n)
        }
        return n
    }
    
    public def void add(DependencyNode n) {
        nodes.put(n.id, n)
    }
    
    public def void remove(DependencyNode n) {
        nodes.remove(n.id)
    }
    
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
    
    public def List<DependencyNode> findLoop(DependencyNode n) {
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
}