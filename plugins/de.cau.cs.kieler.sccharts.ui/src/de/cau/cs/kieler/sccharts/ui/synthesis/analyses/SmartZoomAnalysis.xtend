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
import de.cau.cs.kieler.klighd.kgraph.KGraphData
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.KContainerRendering
import de.cau.cs.kieler.klighd.krendering.KText
import de.cau.cs.kieler.klighd.lsp.utils.SprottyProperties
import de.cau.cs.kieler.klighd.util.KlighdProperties
import de.cau.cs.kieler.sccharts.SCCharts
import java.util.ArrayList
import java.util.List
import java.util.Map
import de.cau.cs.kieler.klighd.lsp.utils.RenderingPreparer

/**
 * @author mka
 */
class SmartZoomAnalysis extends AbstractModelDataCollector<SCCharts> {
    
    public static val NAMESPACE = "sccharts.diagram."
    public static val KGRAPH_SIZE = NAMESPACE + "graph.size"
    public static val HEIGHT = NAMESPACE + "height"
    public static val WIDTH = NAMESPACE + "width"
        
    override getId() {
        "de.cau.cs.kieler.sccharts.ui.synthesis.analyses.smartzoom"
    }
    
    override getName() {
        "Smart Zoom Analysis"
    }
    
    override collect(SCCharts model, Map<String, Object> data, String processorID) {
        
        val diagram = getProperty(SCChartsSynthesisIntermediateProcessor.DIAGRAM)
        val root = diagram.children.head
        if (diagram !== null && root !== null) {
            // prepare rendering to calculate bounds since this doesn't happen in the eclipse world
            RenderingPreparer.prepareRendering(root)
            
            // for each title label, get width of label and 
            // width of containing node and store their ratio
            val ratios = new ArrayList<Double>()
            traverseGraph(root, ratios);
            data.put("Node-Title Ratios", ratios)
        }
    }
    
    def void traverseGraph(KNode node, List<Double> resultList) {
        for (KGraphData datum : node.getData()) {
            textHandler(datum, node, resultList)
            if (datum instanceof KContainerRendering) {
                traverseKGraphData(datum as KContainerRendering, node, resultList);
            }
        }
        for (KNode child : node.getChildren()) {
            traverseGraph(child, resultList);
        }
    }
    
    def void traverseKGraphData(KContainerRendering container, KNode node, List<Double> resultList) {
        for (KGraphData datum : container.getChildren()) {
            textHandler(datum, node, resultList)
            if (datum instanceof KContainerRendering) {
                traverseKGraphData(datum as KContainerRendering, node, resultList);
            }
        }
    }
    
    def void textHandler(KGraphData rendering, KNode node, List<Double> resultList) {
        // if it is a title label compute and store the ratio
        if(rendering.getProperty(KlighdProperties.IS_NODE_TITLE)) {
            var textWidth = 0.0
            if (rendering instanceof KText) {
                textWidth = rendering.getProperty(KlighdProperties.CALCULATED_TEXT_BOUNDS).width
            } else {
                val bounds = rendering.getProperty(SprottyProperties.CALCULATED_BOUNDS)
                if (bounds == null) {
                    throw new Exception("If this is NULL we are sad");
                }
                textWidth = bounds.width
            }
            val ratio = node.width / textWidth
//            println(ratio)
            resultList.add(new Double(ratio))
        }
    }
}