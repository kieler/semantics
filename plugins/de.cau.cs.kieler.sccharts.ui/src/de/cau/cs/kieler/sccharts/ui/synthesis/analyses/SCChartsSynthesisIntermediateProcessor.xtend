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
package de.cau.cs.kieler.sccharts.ui.synthesis.analyses

import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.properties.Property
import de.cau.cs.kieler.kicool.compilation.IntermediateProcessor
import de.cau.cs.kieler.kicool.compilation.ProcessorType
import de.cau.cs.kieler.kicool.registration.KiCoolRegistration
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.ui.synthesis.processors.SCChartsSynthesisProcessor

/**
 * Perform the SCCharts synthesis and stores it in a property.
 * 
 * @author als
 */
class SCChartsSynthesisIntermediateProcessor extends IntermediateProcessor<SCCharts, SCCharts> {
    
    public static val IProperty<KNode> DIAGRAM = 
        new Property<KNode>("de.cau.cs.kieler.sccharts.ui.synthesis.analyses.intermediate.synthesis.diagram", null)
    
    override getId() {
        "de.cau.cs.kieler.sccharts.ui.synthesis.analyses.intermediate.synthesis"
    }

    override getName() {
        "Virtual SCCharts Synthesis"
    }
    
    override getType() {
        ProcessorType.ANALYZER
    }
    
    override process() {
        val synthesis = KiCoolRegistration.getProcessorInstance(SCChartsSynthesisProcessor.ID) as SCChartsSynthesisProcessor
        synthesis?.setEnvironment(sourceEnvironment, environment)
        setProperty(DIAGRAM, synthesis?.sythesize(model))
    }
    
}