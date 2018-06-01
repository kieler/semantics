/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2018 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.kicool.ui.view.registry

import org.eclipse.xtend.lib.annotations.Accessors
import java.util.List
import de.cau.cs.kieler.kicool.compilation.Processor
import de.cau.cs.kieler.kicool.registration.KiCoolRegistration
import de.cau.cs.kieler.kicool.System
import java.util.Map
import java.util.Set

/**
 * @author ssm
 * @kieler.design 2018-06-01 proposed
 * @kieler.rating 2018-06-01 proposed yellow 
 *
 */
class KiCoolRegistrySummary {
    
    @Accessors List<System> systemList = <System> newLinkedList
    @Accessors Map<String, System> systemIdMap = <String, System> newHashMap   
    @Accessors List<System> temporarySystemsList = <System> newLinkedList
    @Accessors List<Class<? extends Processor<?,?>>> processorList = <Class<? extends Processor<?,?>>> newLinkedList
    @Accessors Map<String, Class<? extends Processor>> processorIdMap = <String, Class<? extends Processor>> newHashMap
    @Accessors Set<String> processorIds = <String> newHashSet
    
    def KiCoolRegistrySummary fetchFromRegistry() {
        systemList.clear
        systemList.addAll(KiCoolRegistration.getSystemModels)
        
        temporarySystemsList.clear
        
        systemIdMap.clear
        systemList.forEach[ systemIdMap.put(id, it) ]
        
        processorList.clear
        processorList.addAll(KiCoolRegistration.getProcessorClasses)
        
        processorIdMap.clear
        processorList.forEach[ processorIdMap.put(name, it) ]
        
        processorIds.clear
        processorIds.addAll(KiCoolRegistration.getProcessorIds)
        
        return this
    }
}