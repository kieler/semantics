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

import de.cau.cs.kieler.kicool.processors.analyzers.AbstractModelDataCollector
import de.cau.cs.kieler.sccharts.SCCharts
import java.util.Map

/**
 * @author als
 */
class SCChartsDiagramAnalysis extends AbstractModelDataCollector<SCCharts> {
    
    public static val NAMESPACE = "sccharts.diagram."
    public static val KGRAPH_SIZE = NAMESPACE + "graph.size"
    public static val HEIGHT = NAMESPACE + "height"
    public static val WIDTH = NAMESPACE + "width"
        
    override getId() {
        "de.cau.cs.kieler.sccharts.ui.synthesis.analyses.diagram"
    }
    
    override getName() {
        "SCCharts Diagram Analysis"
    }
    
    override collect(SCCharts model, Map<String, Object> data, String processorID) {
        val diagram = getProperty(SCChartsSynthesisIntermediateProcessor.DIAGRAM)
        val root = diagram.children.head
        if (diagram !== null && root !== null) {
            // Synthesis results
            data.put(KGRAPH_SIZE, root.eAllContents.size)
            
            // Layout results
            data.put(HEIGHT, root.height)
            data.put(WIDTH, root.width)
        }
    }    
}