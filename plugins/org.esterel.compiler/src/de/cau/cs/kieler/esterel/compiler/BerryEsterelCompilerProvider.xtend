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
package de.cau.cs.kieler.esterel.compiler

import de.cau.cs.kieler.kicool.external.IExternalCompilerProvider
import org.eclipse.emf.common.util.URI

/**
 * Locate compiler binaries.
 * 
 * @author als
 */
class BerryEsterelCompilerProvider implements IExternalCompilerProvider {
    
    static val PLUGIN = "org.esterel.compiler"
    
    override getId() {
        return "BerryEsterelV5_100"
    }
    
    override URI getRootDir(String os, String arch) {
        switch(os) {
            case "linux": return URI.createPlatformPluginURI(PLUGIN + "/compiler/iec_v5_100/linux", true)
            case "macosx": return URI.createPlatformPluginURI(PLUGIN + "/compiler/iec_v5_100/macosx", true)
            default: return null
        }
    }
    
}