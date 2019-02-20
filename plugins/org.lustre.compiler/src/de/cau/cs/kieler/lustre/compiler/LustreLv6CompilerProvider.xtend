/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2019 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.lustre.compiler

import de.cau.cs.kieler.kicool.external.IExternalCompilerProvider
import org.eclipse.emf.common.util.URI

/**
 * Locate compiler binaries.
 * 
 * @author als
 */
class LustreLv6CompilerProvider implements IExternalCompilerProvider {
    
    static val PLUGIN = "org.lustre.compiler"
    
    override getId() {
        return "Lustre_V6"
    }
    
    override URI getRootDir(String os, String arch) {
        switch(os) {
            case "linux": return URI.createPlatformPluginURI(PLUGIN + "/compiler/lv6/linux", true)
            default: return null
        }
    }
    
}
