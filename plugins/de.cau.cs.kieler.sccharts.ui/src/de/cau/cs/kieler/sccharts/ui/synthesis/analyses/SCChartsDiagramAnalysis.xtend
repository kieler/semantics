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
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.sccharts.SCCharts
import java.util.Map
import org.eclipse.elk.core.options.CoreOptions
import java.util.ArrayList
import java.util.List

/**
 * @author als, mka
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
            
            // Zoom metrics
            var scaleLimit = 1.0;
        
            if (root.getProperty(CoreOptions.TOPDOWN_LAYOUT)) {
                // determine min_scale, inverse of minScale is scaleLimit for topdown graphs
                scaleLimit = 1.0 / getMinScale(diagram, 1.0);
            } else {
                // use dimensions of graph to determine scaleLimit
                val assumedViewportWidth = 700;
                // for graphs smaller than the viewport use a scale nearly 1
                val zoomOutScale = Math.min(assumedViewportWidth / root.getWidth(), 0.999999);
                scaleLimit = zoomOutScale;
                         
            }
            // set up z samplers
            val sampleStepSize = Math.min( 1.0 / scaleLimit, scaleLimit);
            var zSamplers = new ArrayList()
            val IZLevelAggregator avgAgg = new AverageAggregator();
            val IZLevelAggregator maxAgg = new MaxAggregator<Double>();
            
            val readEval = new ReadabilityEvaluator(diagram, scaleLimit);
            zSamplers.add(new ZSampler<Readability, Double, Double>(readEval, avgAgg, "Average Readability"));
            
            val threshold = 0.8;
            val threshCountAgg = new ReadabilityThresholdCountAggregator(threshold);
//            zSamplers.add(new ZSampler(readEval, threshCountAgg, "Readability Threshold " + threshold));
            
            val globScDiscEval = new GlobalScaleDiscrepancyEvaluator(diagram, scaleLimit);
//            zSamplers.add(new ZSampler<ScaleDiscrepancy, Double, Double>(globScDiscEval, avgAgg, "Average Global Scale Discrepancy"));
                    
            // TODO: for sccharts it would be more insightful to look at discrepancies up to certain local deth
            //       to capture discrepancies between regions in neighbouring states, essentially skipping the 
            //       unscaled parallel nodes
            val locScDiscEval = new LocalScaleDiscrepancyEvaluator(diagram, scaleLimit);
            zSamplers.add(new ZSampler<ScaleDiscrepancy, Double, Double>(locScDiscEval, avgAgg, "Average Local Scale Discrepancy"));
            
//            zSamplers.add(new ZSampler<ScaleDiscrepancy, Double, Double>(locScDiscEval, maxAgg, "Max Local Scale Discrepancy"));
            
            // run analysis
            for (ZSampler<?,?,?> sampler : zSamplers) {
                val result = sampler.getSamples(diagram, sampleStepSize);
                // put results into output json
                data.put(sampler.getName, result)
                
                // print output to console, only for testing, actual output too much for console
                // System.out.println(sampler.getName + " " + result.size());
            }
        }
    }
    
    def private double getMinScale(KNode graph, double scale) {
        var scales = new ArrayList();
        for (KNode child : graph.getChildren()) {
            scales.add(getMinScale(child, scale * graph.getProperty(CoreOptions.TOPDOWN_SCALE_FACTOR)));
        }
        var minScale = scale;
        for (Double scaleValue : scales) {
            if (scaleValue < minScale) {
                minScale = scaleValue;
            }
        }
        return minScale;
    }
}