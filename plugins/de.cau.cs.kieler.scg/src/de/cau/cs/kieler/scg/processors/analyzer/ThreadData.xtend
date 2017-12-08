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

/**
 * @author ssm
 *
 */
class ThreadData implements IKiCoolCloneable {
    
    @Accessors var Map<Entry, ThreadPathType> data = <Entry, ThreadPathType> newLinkedHashMap
    @Accessors var Multimap<Fork, Entry> forkMap = LinkedHashMultimap.create
    
    def createForkMap() {
        for (entry : data.keySet) {
            if (entry !== null) {
                val parentFork = entry.incoming.filter(ControlFlow)?.map[eContainer].filter(Fork)?.head
                if (parentFork !== null) {
                    forkMap.put(parentFork, entry)
                }
            }
        }
    }
    
    override isMutable() {
        false
    }
    
    override cloneObject() {
        new ThreadData => [ td |
            td.data.putAll(data)
            td.forkMap.putAll(forkMap)
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
    }    
    
}