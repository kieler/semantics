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
package de.cau.cs.kieler.esterel.compiler

import java.io.File
import java.util.ArrayList
import java.util.List
import java.util.Map
import org.eclipse.core.runtime.Platform

import static de.cau.cs.kieler.esterel.compiler.EsterelCompilerActivator.*

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
abstract class EsterelCompiler {
    
    protected var File root
    
    protected def resolveRoot(String compiler) {
        val base = bundlePath.resolve("compiler").toFile
        if (base.directory) {
            val compilerBase = new File(base, compiler)
            if (compilerBase.directory) {
                val platform = new File(compilerBase, Platform.OS)
                if (platform.directory) {
                    root = platform
                } else {
                    val arch = new File(compilerBase, Platform.OS + Platform.OSArch)
                    if (arch.directory) {
                        root = arch
                    }
                }
            }
        }
    }
    
    def isAvailable() {
        return if (root !== null) root.directory else false
    }
    
    abstract def String getName()
    
    abstract def void configureEnvironment(Map<String, String> map)
    
    abstract def List<String> generateCodeCommand(List<File> files, ArrayList<String> strings)
    
    abstract def List<File> getExpectedResults(List<File> files)
    
}