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
package de.cau.cs.kieler.annotations.registry

import java.util.List
import java.util.Set
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtend.lib.annotations.Data
import com.google.inject.Singleton
import de.cau.cs.kieler.annotations.Pragma

/**
 * @author ssm
 *
 */
@Singleton
class PragmaRegistry {
    
    private static val pragmaMap = <String, List<PragmaEntry>> newHashMap
    
    def static String register(String name, Class<? extends Pragma> pragmaClass, String description
    ) {
        val newPragmaEntry = new PragmaEntry(name, pragmaClass, description)
        val pragmaList = 
            if (pragmaMap.containsKey(name)) pragmaMap.get(name)
                else <PragmaEntry> newLinkedList
        pragmaMap.put(name, pragmaList => [ it += newPragmaEntry ])
        return name 
    }
    
    def static Set<PragmaEntry> getRegisteredPragmas() {
        pragmaMap.values.flatten.toSet
    }
    
    def static void printRegisteredPRagmas() {
        for(entry : getRegisteredPragmas) {
            val StringBuilder sb = new StringBuilder
            sb.append(entry.name)
            sb.append(" ")
            sb.append(entry.clazz.toString)
            sb.append("\n  ");
            sb.append(entry.description)
            sb.append("\n")
            println(sb)
        }
    }
    
}

@Data
class PragmaEntry {
    val String name
    val Class<? extends Pragma> clazz
    val String description
}