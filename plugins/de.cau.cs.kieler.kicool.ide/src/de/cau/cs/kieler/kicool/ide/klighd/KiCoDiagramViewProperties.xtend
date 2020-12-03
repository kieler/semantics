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
import org.eclipse.elk.graph.properties.Property

/**
 * @author ssm, als
 *
 */
class KiCoDiagramViewProperties {
    
    /** The conext related to the model that is to be synthezied */
    public static val COMPILATION_CONTEXT = new Property<CompilationContext>("de.cau.cs.kieler.kicool.ide.klighd.compilcationContext", null)
    
    /** The execution duration in ms reported by the synthesis */
    public static val SYNTHESIS_TIME = new Property<Long>("de.cau.cs.kieler.kicool.ide.klighd.synthesis.time", null)
    
    /** The time in ms when the diagram view started the update process */    
    public static val UPDATE_START = new Property<Long>("de.cau.cs.kieler.kicool.ide.klighd.update.starttime", null)    
}
