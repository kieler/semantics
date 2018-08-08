/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.kicool.ide

import de.cau.cs.kieler.kicool.registration.KiCoolRegistration
import de.cau.cs.kieler.kicool.System
import java.util.List
import de.cau.cs.kieler.kicool.util.KiCoolUtils

/**
 * @author sdo
 *
 */
class CompilerViewUtil {
    static def String getDefaultSystem(String editorId) {
		return DefaultSystemAssociation.getDefaultSystem(editorId)
	}
	
	static def setTemporarySystem(System system) {
        KiCoolRegistration.registerTemporarySystem(system)
//        updateSystemList TODO
    }
    
    static def List<System> getSystemModels(boolean filter, Class<?> modelClassFilter) {    
        val systems = newLinkedList
        systems.addAll(KiCoolRegistration.getSystemModels.filter(System))
        return systems.filter[!filter || hasInput(modelClassFilter)].toList
    }
    
    static private def hasInput(System sys, Class<?> modelClass) {
        val input = KiCoolUtils.findInputClass(sys)
        if (modelClass !== null && input !== null) {
            return input.isAssignableFrom(modelClass)
        }
        return true
    }
}