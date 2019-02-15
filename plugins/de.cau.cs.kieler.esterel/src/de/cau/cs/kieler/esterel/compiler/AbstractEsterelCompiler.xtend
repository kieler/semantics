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
import de.cau.cs.kieler.core.services.KielerServiceLoader

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
abstract class AbstractEsterelCompiler {
    
    public static val PROVIDERS = KielerServiceLoader.load(IEsterelCompilerProvider).toMap[id]
    
    protected var File root
    
    def isAvailable() {
        return if (root !== null) root.directory else false
    }
    
    abstract def String getName()
    
    abstract def void configureEnvironment(Map<String, String> map)
    
    abstract def List<String> generateCodeCommand(List<File> files, ArrayList<String> strings)
    
    abstract def List<File> getExpectedResults(List<File> files)
    
}