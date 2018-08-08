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
package de.cau.cs.kieler.kicool.ide

import org.eclipse.core.runtime.Platform

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class DefaultSystemAssociation {
    
    public static val EXTENSION_POINT_SYSTEM = "de.cau.cs.kieler.kicool.ui.system"
    
    private static var defaultSystemMap = <String, String>newHashMap
    
    static def loadRegisteredDefaultSystems() {
        defaultSystemMap.clear
        val systems = Platform.getExtensionRegistry().getConfigurationElementsFor(EXTENSION_POINT_SYSTEM);
        for(system : systems) {
            defaultSystemMap.put(system.getAttribute("editor"), system.getAttribute("is"))
        }
    }
    
    static def getDefaultSystem(String editorId) {
        if (defaultSystemMap.empty) loadRegisteredDefaultSystems;
        
        return defaultSystemMap.get(editorId)
    }
}