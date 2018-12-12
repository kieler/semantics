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
package de.cau.cs.kieler.kicool.ide.view

import de.cau.cs.kieler.kicool.System
import de.cau.cs.kieler.kicool.ide.DefaultSystemAssociation
import de.cau.cs.kieler.kicool.registration.KiCoolRegistration
import de.cau.cs.kieler.kicool.util.KiCoolUtils
import java.util.List

/**
 * @author sdo
 * 
 */
class IdeCompilerView {

    def String getDefaultSystem(String editorId) {
        return DefaultSystemAssociation.getDefaultSystem(editorId)
    }

    def List<System> getSystemModels(boolean filter, Class<?> modelClassFilter) {
        val systems = newLinkedList
        systems.addAll(KiCoolRegistration.getSystemModels.filter(System))
        return systems.filter[!filter || hasInput(modelClassFilter)].toList
    }

    private def hasInput(System sys, Class<?> modelClass) {
        val input = KiCoolUtils.findInputClass(sys)
        if (modelClass !== null && input !== null) {
            return input.isAssignableFrom(modelClass)
        }
        return true
    }
}
