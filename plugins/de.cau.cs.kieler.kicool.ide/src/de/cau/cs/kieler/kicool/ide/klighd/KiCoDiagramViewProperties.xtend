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
package de.cau.cs.kieler.kicool.ide.klighd

import de.cau.cs.kieler.kicool.compilation.CompilationContext

/**
 * @author ssm
 *
 */
class KiCoDiagramViewProperties {
    
    public static val COMPILATION_CONTEXT = 
        new org.eclipse.elk.graph.properties.Property<CompilationContext>("de.cau.cs.kieler.kicool.ui.klighd.compilcationContext", null)
        
}