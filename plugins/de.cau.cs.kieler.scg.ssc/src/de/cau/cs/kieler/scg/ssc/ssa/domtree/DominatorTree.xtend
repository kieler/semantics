/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2016 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.scg.ssc.ssa.domtree

import com.google.common.collect.BiMap
import com.google.common.collect.HashBiMap
import com.google.common.collect.HashMultimap
import com.google.common.collect.LinkedHashMultimap
import com.google.common.collect.Multimap
import de.cau.cs.kieler.scg.BasicBlock
import de.cau.cs.kieler.scg.Depth
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.ScgFactory
import de.cau.cs.kieler.scg.ScgPackage
import de.cau.cs.kieler.scg.extensions.UnsupportedSCGException
import java.util.Map
import org.eclipse.xtend.lib.annotations.Accessors

import static com.google.common.collect.Maps.*
import de.cau.cs.kieler.scg.Surface

/**
 * This class computes dominator information using the Lengauer-Tarjan method.
 * 
 * See: A Fast Algorithm for Finding Dominators in a Flowgraph T. Lengauer & R. Tarjan, ACM TOPLAS July 1979, pgs 121-141.
 * 
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class DominatorTree {
        
    // The SCG
    @Accessors
    val SCGraph scg
    // These fields represent the structure of the SCG
    val Multimap<BasicBlock, BasicBlock> successors = LinkedHashMultimap.create
    val Multimap<BasicBlock, BasicBlock> predecessors = LinkedHashMultimap.create
    // These fields represent the structure of the SCG in depth first form
    val BiMap<Integer, BasicBlock> dfNum = HashBiMap.create
    val Map<BasicBlock, BasicBlock> dfParent = newHashMap
    // These fields represent the structure of the dominator tree
    val Map<BasicBlock, BasicBlock> idom = newHashMap
    // Internal relations for the dominator analysis
    val Map<BasicBlock, BasicBlock> semi = newHashMap
    val Multimap<BasicBlock, BasicBlock> bucket = HashMultimap.create
    val Map<BasicBlock, BasicBlock> samedom = newHashMap
    val Map<BasicBlock, BasicBlock> ancestor = newHashMap
    val Map<BasicBlock, BasicBlock> best = newHashMap
    // The dominance frontiers
    val Multimap<BasicBlock, BasicBlock> dominanceFrontiers = HashMultimap.create

    new(SCGraph scg) {
        this.scg = scg
        
        // It is expected that this node is an entry node.
        val entryNode = scg.nodes.head
        if (!(entryNode instanceof Entry) || scg.basicBlocks.head.schedulingBlocks.head.nodes.head != entryNode) {
            throw new UnsupportedSCGException(
                "The dominator tree analysis expects an entry node as first node in the first basic block!")
        }
        val entryBB = scg.basicBlocks.head
        
        // Add additional predecessors for tick borders
        val depthes = newHashMap
        val surfaces = newHashMap
        // Calculate BB successors and predecessors
        for (bb : scg.basicBlocks) {
            for (preBB : bb.predecessors.map[basicBlock]) {
                predecessors.put(bb, preBB)
                successors.put(preBB, bb)
            }
            for (sb : bb.schedulingBlocks) {
                for (node : sb.nodes) {
                    if (node instanceof Depth) {
                        depthes.put(node, bb)
                    } else if (node instanceof Surface) {
                        surfaces.put(node, bb)
                    }
                }
            }
        }
        // Fix predecessor relations based on tick borders
        for (surface : surfaces.keySet) {
            val sbb = surfaces.get(surface)
            val dbb = depthes.get(surface.depth)
            predecessors.put(dbb, sbb)
            successors.put(sbb, dbb)
        }
 
        // Start with DFS
        entryBB.dfs(null)
        
        // Calculate Semidominators
        for (var i = dfNum.size-1; i > 0; i--) {
            val bb = i.dfvertex
            val parent = bb.dfparent
            var semiCandidate = parent
            for (predecessor : predecessors(bb)) {
                val newSemiCandidate = if (predecessor.dfnum <= bb.dfnum) {
                    predecessor
                }else{
                    predecessor.ancestorWithLowestSemi.semi
                }
                if (newSemiCandidate.dfnum < semiCandidate.dfnum) {
                    semiCandidate = newSemiCandidate
                }
            }
            semi.put(bb, semiCandidate)
            bucket.put(semiCandidate, bb)
            parent.link(bb)
            // First dominator clause            
            for (targetBB : parent.bucket) {
                val domCandidate = targetBB.ancestorWithLowestSemi
                if (domCandidate.semi == targetBB.semi) {
                    idom.put(targetBB, parent)
                } else {
                    samedom.put(targetBB, domCandidate)
                }
            }
            parent.bucket.clear
        }
        // Second dominator clause  
        for ( i : 1..dfNum.size-1 ) {
            val bb = i.dfvertex
            if (bb.samedom != null) {
                idom.put(bb, bb.samedom.idom)
            }
        }
        
        // Calculate Dominance Frontiers
        calculateDominanceFrontiers(entryBB)
    }

    private def void dfs(BasicBlock bb, BasicBlock parent) {
        if (!dfNum.containsValue(bb)) {
            dfNum.put(dfNum.size, bb)
            dfParent.put(bb, parent)
            for (succesor : bb.successors) {
                succesor.dfs(bb)
            }
        }
    }
    
    private def BasicBlock ancestorWithLowestSemi(BasicBlock bb) {
        val ancestorBB = bb.ancestor
        if (ancestorBB.ancestor != null) {
            val bestCandidate = ancestorBB.ancestorWithLowestSemi
            ancestor.put(bb, ancestorBB.ancestor)
            if (bestCandidate.semi.dfnum < bb.best.semi.dfnum) {
                best.put(bb, bestCandidate)
            }
        }
        return bb.best
    }
    
    private def link(BasicBlock parent, BasicBlock bb) {
        ancestor.put(bb, parent)
        best.put(bb, bb)
    }
    
    private def void calculateDominanceFrontiers(BasicBlock bb) {
        for (successor : bb.successors) {
            if (successor.idom != bb) {
                dominanceFrontiers.put(bb, successor)
            }
        }
        for (child : bb.children) {
            child.calculateDominanceFrontiers
            for (f : dominanceFrontiers.get(child)) {
                if (!bb.isDominator(f) || bb == f) {
                    dominanceFrontiers.put(bb, f)
                }
            }
        }
    }
    
    // -------------------------------------------------------------------------
    // -- Tree Access
    // -------------------------------------------------------------------------
    
    def isStrictDominator(BasicBlock dominator, BasicBlock bb) {
        if (dominator != bb) {
            return dominator.isDominator(bb)
        }
        return false
    }   
    
    def isDominator(BasicBlock dominator, BasicBlock bb) {
        var ancestor = bb
        while (ancestor != null) {
            if (ancestor == dominator) {
                return true
            }
            ancestor = ancestor.idom
        }
        return false
    }
    
    def children(BasicBlock bb) {
        return idom.entrySet.filter[it.value == bb].map[key]
    }
    
    def allChildren(BasicBlock bb) {
        // TODO : bad performance
        val children = newLinkedHashSet
        children.addAll(idom.entrySet.filter[it.value == bb].map[key])
        while (children.addAll(idom.entrySet.filter[children.contains(it.value)].map[key])) {}
        return children
    }
    
    def getDominanceFrontiers(BasicBlock bb) {
        return dominanceFrontiers.get(bb)
    }

    // -------------------------------------------------------------------------
    // -- Convenience Map Accessors
    // -------------------------------------------------------------------------

    def successors(BasicBlock bb) {
        return successors.get(bb)
    }
    
    def predecessors(BasicBlock bb) {
        return predecessors.get(bb)
    }
    
    private def dfnum(BasicBlock bb) {
        return dfNum.inverse.get(bb)?:0
    }

    private def dfvertex(int index) {
        return dfNum.get(index)
    }

    private def dfparent(BasicBlock bb) {
        return dfParent.get(bb)
    }

    def idom(BasicBlock bb) {
        return idom.get(bb)
    }
    
    private def semi(BasicBlock bb) {
        return semi.get(bb)
    }

    private def bucket(BasicBlock bb) {
        return bucket.get(bb)
    }

    private def samedom(BasicBlock bb) {
        return samedom.get(bb)
    }

    private def ancestor(BasicBlock bb) {
        return ancestor.get(bb)
    }

    private def best(BasicBlock bb) {
        return best.get(bb)
    }
}
