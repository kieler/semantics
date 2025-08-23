/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2022-2025 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.ui.synthesis.analyses

import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.properties.Property
import de.cau.cs.kieler.kicool.processors.analyzers.AbstractModelDataCollector
import de.cau.cs.kieler.klighd.kgraph.KGraphData
import de.cau.cs.kieler.klighd.kgraph.KIdentifier
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.KContainerRendering
import de.cau.cs.kieler.klighd.krendering.KRendering
import de.cau.cs.kieler.klighd.krendering.KText
import de.cau.cs.kieler.klighd.util.KlighdPredicates
import de.cau.cs.kieler.klighd.util.KlighdProperties
import de.cau.cs.kieler.sccharts.SCCharts
import java.util.ArrayList
import java.util.List
import java.util.Map
import java.util.HashMap

/**
 * Analyzes the readability of key renderings with and without smart zoom
 * 
 * @author mka, nre
 */
class SmartZoomAnalysis extends AbstractModelDataCollector<SCCharts> {
    
    public static val IProperty<Double> VIEWPORT_SIZE =
        new Property<Double>("de.cau.cs.kieler.sccharts.ui.synthesis.analyses.smartzoom.viewportSize", 1000.0)
    public static val IProperty<Double> ZOOM_STEP_FACTOR =
        new Property<Double>("de.cau.cs.kieler.sccharts.ui.synthesis.analyses.smartzoom.zoomStepFactor", 2.0)
    
    // analyze readability with smart zoom enabled
    public static val IProperty<Boolean> SMART_ZOOM =
        new Property<Boolean>("de.cau.cs.kieler.sccharts.ui.synthesis.analyses.smartzoom.smartZoom", true)
    // include every child node as its own root for the analysis
    public static val IProperty<Boolean> COMPARE_FROM_CHILDREN =
        new Property<Boolean>("de.cau.cs.kieler.sccharts.ui.synthesis.analyses.smartzoom.compareFromChildren", true)
    // Overwrites COMPARE_FROM_CHILDREN if false
    public static val IProperty<Boolean> COMPARE_FROM_PARENTS = 
        new Property<Boolean>("de.cau.cs.kieler.sccharts.ui.synthesis.analyses.smartzoom.compareFromParents", true)
    // Excludes childless nodes as the root for analysis, i.e., exclude all Level 0 analyses that only analyze their own key rendering
    public static val IProperty<Boolean> EXCLUDE_CHILDLESS_ROOTS =
        new Property<Boolean>("de.cau.cs.kieler.sccharts.ui.synthesis.analyses.smartzoom.excludeChildlessRoots", false)
    // Excludes childless nodes as the target for analysis, i.e., exclude all analyses that analyze the readability of small childless nodes
    public static val IProperty<Boolean> EXCLUDE_CHILDLESS_KEY_RENDERINGS =
        new Property<Boolean>("de.cau.cs.kieler.sccharts.ui.synthesis.analyses.smartzoom.excludeChildlessKeyRenderings", false)
    // true: use the old sorting, where Level 0 is for top level of hierarchy, 1 for the next, etc.
    // false: use the new sorting, where Level 0 is for all bottom-most levels of hierarchy, 1 for the ones above with one child hierarchy, etc.
    public static val IProperty<Boolean> LEVELS_FROM_TOP =
        new Property<Boolean>("de.cau.cs.kieler.sccharts.ui.synthesis.analyses.smartzoom.levelsFromTop", false)
    
    override getId() {
        "de.cau.cs.kieler.sccharts.ui.synthesis.analyses.smartzoom"
    }
    
    override getName() {
        "Smart Zoom Readability Analysis"
    }
    
    val Map<KNode, Integer> childDepths = new HashMap
    
    override collect(SCCharts model, Map<String, Object> data, String processorID) {
        childDepths.clear()
        
        val diagram = getProperty(SCChartsSynthesisIntermediateProcessor.DIAGRAM)
        val root = diagram.children.head
        if (diagram !== null &&
            root !== null && 
            !(environment.getProperty(EXCLUDE_CHILDLESS_ROOTS) && root.children.empty)
        ) {
            // prepare rendering to calculate bounds since this doesn't happen in the eclipse world
            RenderingPreparer.prepareRenderingLayout(root)
            
            // Figure out the total depth of the graph
            val depth = depth(root)
            
            // Calculate the Log Max Diagram Scale (LMDS) for the root node.
            // That is, calculate the scale factor that this node needs to fit into a 1000px x 1000px viewport.
            // Every rendering that can scale up to counteract this LMDS will be readable at at least 100%
            val lmds = lmns(root)
            
            // Traverse the graph and search for a key rendering in each child node.
            // Compare the Log Max Key Scale (LMKS) of each node with each of its ancestors and collect the data in a results list
            // "Level 0 differences": [5,7,9,...], "Level 1 differences": [1,1,2,3,5,7,...],...
            
            val scaleDifferenceLevels = new ArrayList<List<Map<String, Double>>>()
            for (var int i = 0; i < depth; i++) {
                scaleDifferenceLevels.add(new ArrayList<Map<String, Double>>())
            }
            
            // Remember all Log Max Node Scales of the ancestry hierarchy to compare against while traversing the graph
            val lmns = new ArrayList<Pair<String, Double>>()
            lmns.add(findId(root) -> lmds)
            traverseGraph(root, lmns, scaleDifferenceLevels)
            
            var i = 0
            for (level : scaleDifferenceLevels) {
                data.put("" + i, level)
                i++
            }
        }
    }
    
    def String findId(KNode node) {
        var identifier = node.data.findFirst[it instanceof KIdentifier] as KIdentifier
        if (identifier !== null){
            return identifier.id
        } else if (node.parent === null) {
            return "root node"
        } else {
            return "unnamed child of " + findId(node.parent)
        }
    }
    
    def double lmns(KNode node) {
        // node width 2k, height 1k. (viewport 1k/1k)
        // => width limits scale
        // => ratios = 0.5, 1
        // => take the _MIN_
        return -logMin(environment.getProperty(VIEWPORT_SIZE) / node.width, environment.getProperty(VIEWPORT_SIZE) / node.height)
    }
    
    def double logMin(double a, double b) {
        return Math.log(Math.min(a, b)) / Math.log(environment.getProperty(ZOOM_STEP_FACTOR))
    }
    
    def void traverseGraph(KNode node, List<Pair<String, Double>> lmnss, List<List<Map<String, Double>>> resultLevels) {
        var done = false
        for (KGraphData datum : node.getData()) {
            if (datum instanceof KRendering && !KlighdPredicates.isCollapsedRendering().apply(datum as KRendering)) {
                done = done || textHandler(datum, node, lmnss, resultLevels)
                if (!done && datum instanceof KContainerRendering) {
                    traverseKGraphData(datum as KContainerRendering, node, lmnss, resultLevels)
                }
            }
        }
        for (KNode child : node.getChildren()) {
            val lmns = lmns(child)
            lmnss.add(findId(child) -> lmns)
            traverseGraph(child, lmnss, resultLevels)
            lmnss.removeLast()
        }
    }
    
    def boolean traverseKGraphData(KContainerRendering container, KNode node, List<Pair<String, Double>> lmnss, List<List<Map<String, Double>>> resultLevels) {
        for (KGraphData datum : container.getChildren()) {
            if (textHandler(datum, node, lmnss, resultLevels)) return true
            if (datum instanceof KContainerRendering) {
                if (traverseKGraphData(datum as KContainerRendering, node, lmnss, resultLevels)) return true
            }
        }
    }
    
    def boolean textHandler(KGraphData rendering, KNode node, List<Pair<String, Double>> lmnss, List<List<Map<String, Double>>> resultLevels) {
        if (!rendering.getProperty(KlighdProperties.IS_NODE_TITLE) || !(rendering instanceof KRendering)) return false
        if (getProperty(EXCLUDE_CHILDLESS_KEY_RENDERINGS) && node.children.empty) return true
        // if it is a title label compute and store the ratios
        
        var keyWidth = 0.0
        var keyHeight = 0.0
        var String text
        if (rendering instanceof KText) {
            keyWidth = rendering.getProperty(KlighdProperties.CALCULATED_TEXT_BOUNDS).width
            keyHeight = rendering.getProperty(KlighdProperties.CALCULATED_TEXT_BOUNDS).height
            text = rendering.text
        } else {
            val bounds = rendering.getProperty(RenderingPreparer.CALCULATED_BOUNDS)
            if (bounds === null) {
                throw new Exception("If this is NULL we are sad");
            }
            keyWidth = bounds.width
            keyHeight = bounds.height
            text = findText(rendering as KRendering)
        }
        
        // Iterate through all ancestors to calculate the readability compared to that node
        val widthRatio = node.width / keyWidth
        val heightRatio = node.height / keyHeight
        
        // node width 1k, height 1k. key width 200, 100
        // => width limits scale
        // => ratios = 5, 10
        // => take the _MIN_
        var int i = lmnss.size - 1
        val lmks = if (environment.getProperty(SMART_ZOOM)) logMin(widthRatio, heightRatio) else 0
        if (environment.getProperty(COMPARE_FROM_PARENTS)) {
            for (lmns : lmnss) {
                
                // list starts at the root
                val diff = lmks - lmns.value
                val int resultIndex = environment.getProperty(LEVELS_FROM_TOP) ? i : (childDepths.get(node) - 1)
                resultLevels.get(resultIndex).add(newHashMap(text + " in " + lmns.key -> diff))
                i--
                // skip all but the first iteration if we only want to compare to the root node
                if (!environment.getProperty(COMPARE_FROM_CHILDREN)) return true
                // skip last iteration that compares key rendering of childless node if option for that is set
                if (i == 0 && (environment.getProperty(EXCLUDE_CHILDLESS_ROOTS) && node.children.empty)) return true
            }
        } else if (!(environment.getProperty(EXCLUDE_CHILDLESS_ROOTS) && node.children.empty)) {
            val lmns = lmnss.last
            
            val diff = lmks - lmns.value
            val int resultIndex = environment.getProperty(LEVELS_FROM_TOP) ? 0 : (childDepths.get(node) - 1)
            resultLevels.get(resultIndex).add(newHashMap(text + " in " + lmns.key -> diff))
        }
        return true
    }

    def String findText(KRendering rendering) {
        if (rendering instanceof KText) {
            return rendering.text
        } else if (rendering instanceof KContainerRendering) {
            // take the first contained text rendering we can find
            for (childRendering : rendering.children) {
                val text = findText(childRendering)
                if (text !== null) {
                    return text
                }
            }
        }
        return null
    }
    
    def int depth(KNode node) {
        var childDepth = 0
        for (child : node.children) {
            childDepth = Math.max(childDepth, depth(child))
        }
        childDepth++
        childDepths.put(node, childDepth)
        return childDepth
    }
}


//-> log of ratio indicates range of scale levels at which a particular rendering is readable
//-> if we call a zoom interaction that scales the viewport by a factor s, then log_s(key rendering to node ratio) indicates how many consecutive zoom interactions away from the 100% scale still keep the key rendering at 100% scale.
//e.g. ratio = 32, s = 2, so log_2(32) = 5 zoom interactions that zoom out by a factor of 2 (or 0.5, depending on the viewpoint) still keep the key rendering at full scale
//logarithmic scale is sensible because the zoom interactions stack the total zoom level exponentially
//can be compared to total scale level needed to view a diagram in a e.g. 1000px x 1000px viewport as the upper limit
//-> if that complete diagram scale is e.g. 8, or log_2(8) = 3 zoom levels, then any label with a log key rendering to node ratio of at least 3 is always readable if included in the viewport.
//
//variables:
//- (log) max key scale for each rendering in a diagram (LMKS)
//-- could be sorted by level of hierarchy (LMKS_0..LMKS_n)
//- (log) max diagram scale (LMDS)
//
//LMKS_0 - LMDS (Level 0): top level is readable if value > 0
//LMKS_1 - LMDS (Level 1): first level of hierarchy is readable if value > 0
//...
//
//- Every child node can be its own LMDS with LMKS_0+ originating from there. Maybe do a diagram without this and with this further data included
//
//- Then, group values of every level of hierarchy difference (e.g. LMKS_0 - LMDS is one difference) and do violin plots
//- possible for SCCharts, LF, SPViz diagrams, ... (easiest for SCCharts)
//
//- also possible to compare to solution without smart zoom - then all LMKS are hard set to 1


