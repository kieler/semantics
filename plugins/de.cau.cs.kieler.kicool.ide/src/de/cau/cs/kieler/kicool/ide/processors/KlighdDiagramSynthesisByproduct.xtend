/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2022 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.kicool.ide.processors

import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.properties.Property
import de.cau.cs.kieler.kicool.compilation.IntermediateProcessor
import de.cau.cs.kieler.kicool.compilation.ProcessorType
import de.cau.cs.kieler.kicool.registration.KiCoolRegistration
import de.cau.cs.kieler.klighd.kgraph.KNode

/**
 * Perform a Klighd diagram synthesis and stores it in a property.
 * 
 * @author als
 */
class KlighdDiagramSynthesisByproduct extends IntermediateProcessor<Object, Object> {
    
    public static val IProperty<KNode> DIAGRAM = 
        new Property<KNode>("de.cau.cs.kieler.kicool.ide.processors.diagram.synthesis.byproduct", null)
    
    override getId() {
        "de.cau.cs.kieler.kicool.ide.processors.diagram.synthesis.byproduct"
    }

    override getName() {
        "Klighd Diagram Synthesis Byproduct"
    }
    
    override getType() {
        ProcessorType.ANALYZER
    }
    
    override process() {
        val synthesis = KiCoolRegistration.getProcessorInstance(KlighdDiagramSynthesis.ID) as KlighdDiagramSynthesis
        synthesis?.setEnvironment(sourceEnvironment, environment)
        setProperty(DIAGRAM, synthesis?.sythesize(model))
    }
    
}