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

import java.io.File
import org.eclipse.core.runtime.Platform

/**
 * @author als
 */
interface IEsterelCompilerProvider {
    
     def resolveRoot(File base) {
        try {
            if (base.directory) {
                val platform = new File(base, Platform.OS)
                if (platform.directory) {
                    return platform
                } else {
                    val arch = new File(base, Platform.OS + Platform.OSArch)
                    if (arch.directory) {
                        return arch
                    }
                }
            }
       } catch(Exception e) {
           e.printStackTrace
       }
    }
    
    abstract def String getId()
    
    abstract def File getRootDir()
    
}