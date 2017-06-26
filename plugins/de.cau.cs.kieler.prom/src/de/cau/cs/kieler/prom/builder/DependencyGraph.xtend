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
package de.cau.cs.kieler.prom.builder

import java.util.List
import org.eclipse.core.resources.IFile
import java.util.Stack
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * @author aas
 *
 */
class DependencyGraph {
    @Accessors(PUBLIC_GETTER)
    private val List<DependencyNode> nodes = newArrayList
    
    public def List<DependencyNode> getLeafs() {
        return nodes.filter[it.isLeaf].toList
    }
    
    public def DependencyNode get(String id) {
        return nodes.findFirst[it.id == id]
    }
    
    public def DependencyNode getOrCreate(IFile file) {
        return getOrCreate(file.id)
    }
    
    public def DependencyNode getOrCreate(String id) {
        var n = get(id)
        if(n == null) {
            n = new DependencyNode(id, null)
            add(n)
        }
        return n
    }
    
    public def DependencyNode createNode(String id) {
        var n = get(id)
        if(n == null) {
            n = new DependencyNode(id, null)
            add(n)
        }
        return n
    }
    
    public def DependencyNode createNode(IFile file) {
        return createNode(file.id)
    }
    
    public def void add(DependencyNode n) {
        if(!nodes.contains(n)) {
            nodes.add(n)
        }
    }
    
    public def void remove(DependencyNode n) {
        nodes.remove(n)
    }
    
    public def List<DependencyNode> findLoop() {
        for(n : nodes) {
            n.seen = 0
        } 
        for(n : nodes) {
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
            return nodes.filter[it.seen == 1].toList
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
    
    public def String getId(IFile file) {
        return file.fullPath.toOSString
    }
}