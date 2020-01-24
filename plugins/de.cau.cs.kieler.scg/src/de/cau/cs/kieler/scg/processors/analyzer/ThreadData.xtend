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
package de.cau.cs.kieler.scg.processors.analyzer

import de.cau.cs.kieler.kicool.classes.IKiCoolCloneable
import org.eclipse.xtend.lib.annotations.Accessors
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.extensions.ThreadPathType
import java.util.Map
import org.eclipse.emf.ecore.util.EcoreUtil.Copier
import de.cau.cs.kieler.scg.Fork
import com.google.common.collect.Multimap
import com.google.common.collect.LinkedHashMultimap
import de.cau.cs.kieler.scg.ControlFlow
import java.util.Set
import de.cau.cs.kieler.scg.Node
import java.util.List
import de.cau.cs.kieler.scg.extensions.SCGThreadExtensions
import com.google.inject.Inject

/**
 * @author ssm
 *
 */
class ThreadData implements IKiCoolCloneable {
    
    @Inject extension SCGThreadExtensions
    
    @Accessors var Map<Entry, ThreadPathType> data = <Entry, ThreadPathType> newLinkedHashMap
    @Accessors var Multimap<Fork, Entry> forkMap = LinkedHashMultimap.create
    @Accessors var Map<Entry, Set<Node>> threadMapping = newLinkedHashMap
    @Accessors var Map<Node, List<Entry>> nodeMapping = newLinkedHashMap
    
    def createForkMap() {
        for (entry : data.keySet) {
            if (entry !== null) {
                val parentFork = entry.incomingLinks.filter(ControlFlow)?.map[eContainer].filter(Fork)?.head
                if (parentFork !== null) {
                    forkMap.put(parentFork, entry)
                }
            }
        }
    }
    
    def createThreadNodeMaps(Entry entry) {
        val localTM = <Entry, Set<Node>> newLinkedHashMap
        val localNM = <Node, List<Entry>> newLinkedHashMap
        entry.getAllThreadNodesAndThreads(localTM, localNM)
        for (tm : localTM.keySet) {
            threadMapping.put(tm, localTM.get(tm))
        }
        for (nm : localNM.keySet) {
            nodeMapping.put(nm, localNM.get(nm))
        }
    }
    
    override isMutable() {
        false
    }
    
    override cloneObject() {
        new ThreadData => [ td |
            td.data.putAll(data)
            td.forkMap.putAll(forkMap)
            td.threadMapping.putAll(threadMapping)
            td.nodeMapping.putAll(nodeMapping)
        ] 
    }
    
    override void resolveCopiedObjects(Copier copier) {
        val resolvedThreadData = <Entry, ThreadPathType> newLinkedHashMap 
        for (key : data.keySet) {
            val newKey = copier.get(key) as Entry
            resolvedThreadData.put(newKey, data.get(key))
        } 
        data = resolvedThreadData
        forkMap.clear
        createForkMap
        
        val Map<Entry, Set<Node>> resolvedThreadMapping = newLinkedHashMap
        val Map<Node, List<Entry>> resolvedNodeMapping = newLinkedHashMap
        
        for (e : threadMapping.keySet) {
            val newE = copier.get(e) as Entry
            val newSet = <Node> newLinkedHashSet
            for (n : threadMapping.get(e)) {
                newSet.add(copier.get(n) as Node)
            }
            resolvedThreadMapping.put(newE, newSet)
        }
        for (n : nodeMapping.keySet) {
            val newN = copier.get(n) as Node
            val newList = <Entry> newLinkedList
            for (e : nodeMapping.get(n)) {
                newList.add(copier.get(e) as Entry)
            }
            resolvedNodeMapping.put(newN, newList)
        }        

        threadMapping = resolvedThreadMapping
        nodeMapping = resolvedNodeMapping                
    }    
    
}