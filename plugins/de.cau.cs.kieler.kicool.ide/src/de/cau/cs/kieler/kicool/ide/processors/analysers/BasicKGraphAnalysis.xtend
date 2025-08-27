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
package de.cau.cs.kieler.kicool.ide.processors.analysers

import de.cau.cs.kieler.kicool.ide.processors.KlighdDiagramSynthesisByproduct
import de.cau.cs.kieler.kicool.processors.analyzers.AbstractModelDataCollector
import de.cau.cs.kieler.klighd.kgraph.KEdge
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.KText
import java.util.Map

/**
 * @author als
 */
class BasicKGraphAnalysis extends AbstractModelDataCollector<Object> {
    
    public static val NAMESPACE = "klighd.diagram."
    public static val EOBJ_COUNT = NAMESPACE + "eobjects"
    public static val NODE_COUNT = NAMESPACE + "nodes"
    public static val EDGE_COUNT = NAMESPACE + "edges"
    public static val TEXT_COUNT = NAMESPACE + "texts"
    public static val HEIGHT = NAMESPACE + "height"
    public static val WIDTH = NAMESPACE + "width"
        
    override getId() {
        "de.cau.cs.kieler.kicool.ide.processors.analysers.diagram.analysis.basic"
    }
    
    override getName() {
        "Basic KGraph Analysis"
    }
    
    override collect(Object model, Map<String, Object> data, String processorID) {
        var KNode diagram;
        if (model instanceof KNode) {
            diagram = model
        } else { // Fallback to byproduct
            diagram = getProperty(KlighdDiagramSynthesisByproduct.DIAGRAM)
        }
        if (diagram !== null) {
            val root = diagram.children.head
            if (diagram !== null && root !== null) {
                // Synthesis results
                val eobjs = root.eAllContents.toList
                data.put(EOBJ_COUNT, eobjs.size)
                data.put(NODE_COUNT, eobjs.filter(KNode).size)
                data.put(EDGE_COUNT, eobjs.filter(KEdge).size)
                data.put(TEXT_COUNT, eobjs.filter(KText).size)
                
                // Layout results
                data.put(HEIGHT, root.height)
                data.put(WIDTH, root.width)
            }
        }
    }    
}
