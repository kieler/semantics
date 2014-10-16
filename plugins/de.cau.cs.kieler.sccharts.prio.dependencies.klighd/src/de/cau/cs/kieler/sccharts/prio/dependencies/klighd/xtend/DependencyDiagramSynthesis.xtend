/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2011 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.prio.dependencies.klighd.xtend

import com.google.inject.Inject
import de.cau.cs.kieler.core.kgraph.KNode
import de.cau.cs.kieler.core.krendering.KColor
import de.cau.cs.kieler.core.krendering.KLineWidth
import de.cau.cs.kieler.core.krendering.KPolyline
import de.cau.cs.kieler.core.krendering.KPosition
import de.cau.cs.kieler.core.krendering.KXPosition
import de.cau.cs.kieler.core.krendering.KYPosition
import de.cau.cs.kieler.core.krendering.extensions.KColorExtensions
import de.cau.cs.kieler.core.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.kiml.options.Direction
import de.cau.cs.kieler.kiml.options.EdgeRouting
import de.cau.cs.kieler.kiml.options.LayoutOptions
import de.cau.cs.kieler.kiml.util.KimlUtil
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import de.cau.cs.kieler.sccharts.prio.dependencies.dependency.ControlflowDependency
import de.cau.cs.kieler.sccharts.prio.dependencies.dependency.Dependencies
import de.cau.cs.kieler.sccharts.prio.dependencies.dependency.Dependency
import de.cau.cs.kieler.sccharts.prio.dependencies.dependency.Node
import de.cau.cs.kieler.sccharts.prio.dependencies.dependency.TransitionDependency
import de.cau.cs.kieler.sccharts.prio.dependencies.dependency.ValuedObjectDependency
import java.util.List
import de.cau.cs.kieler.core.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.core.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.core.krendering.extensions.KLabelExtensions
import de.cau.cs.kieler.core.krendering.extensions.KPolylineExtensions

/**
 * Visualization of a dependency graph for a SyncChart.
 * 
 * @author cmot
 * @kieler.design 2012-10-08 proposed cmot
 * @kieler.rating 2012-10-08 proposed yellow cmot
 * 
 */
class DependencyDiagramSynthesis extends AbstractDiagramSynthesis<Dependencies> { 

    // TODO: Fix checkstyle warnings (e.g. spaces for tabs)

    //@Inject
    //extension KRenderingUtil 
	
    @Inject
    extension KColorExtensions
    
    @Inject 
    extension KNodeExtensions

    @Inject
    extension KEdgeExtensions

    @Inject
    extension KPolylineExtensions

    @Inject
    extension KLabelExtensions
    
    @Inject
    extension KRenderingExtensions
    
	static SynthesisOption edgeStyle = SynthesisOption::createCheckOption("Spline", false);
	
	override List<SynthesisOption> getDisplayedSynthesisOptions() {
	    return newArrayList(edgeStyle); 
	}
	
	// Main transformation for every dependency node create a node figure and for every dependency an connecting edge figure.
	override KNode transform(Dependencies model) {
		
		val rootNode = KimlUtil::createInitializedNode;
		if (edgeStyle.booleanValue) {
           rootNode.setLayoutOption(LayoutOptions::SPACING, Float::valueOf("25.0"));
           rootNode.setLayoutOption(LayoutOptions::DIRECTION, Direction::DOWN);
           rootNode.addLayoutParam(LayoutOptions::EDGE_ROUTING, EdgeRouting::SPLINES);
           rootNode.addLayoutParam(LayoutOptions::ALGORITHM, "de.cau.cs.kieler.graphviz.dot");
		} else {
           rootNode.setLayoutOption(LayoutOptions::SPACING, Float::valueOf("10.0"));
           rootNode.setLayoutOption(LayoutOptions::DIRECTION, Direction::DOWN);
           rootNode.addLayoutParam(LayoutOptions::EDGE_ROUTING, EdgeRouting::ORTHOGONAL);
           rootNode.addLayoutParam(LayoutOptions::ALGORITHM, "de.cau.cs.kieler.klay.layered");
		}
		
		val nodes = model.nodes;
		for (node : nodes) {
	    	node.createNodeFigure(rootNode);	
	    }
		
		
		val dependencies = model.dependencies;
		for (dependency : dependencies) {
	    	dependency.createDependencyFigure(rootNode);	
	    }

		return rootNode;
	}
	
	
	// For a dependency node create a node figure. For strong nodes (ending wit _S) use black for
	// weak nodes use gray.
	def createNodeFigure(Node node, KNode rootNode) {
	        val kNode = node.createNode()
	        val rect = kNode.addRoundedRectangle(25, 85, 2)
			
			kNode.KRendering.foreground = if (node.id.endsWith("_S")) "black".color else "gray".color;
//            kNode.addLayoutParam(LayoutOptions::EDGE_ROUTING, EdgeRouting::ORTHOGONAL);
//            kNode.addLayoutParam(LayoutOptions::ALGORITHM, "de.cau.cs.kieler.klay.layered");
			
			val nodeText = node.id.substring(0, node.id.length - 2);
			val kNode2 = rect.createNode
			
			val ktext = kNode2.addText(nodeText + " (" + node.priority + ")")
			ktext.setFontSize(11)
			ktext.setFontBold(true);
			
			kNode.children.add(kNode2)
			rootNode.children.add(kNode)
			return kNode
	}
	
    private static val KColor DEPENDENCY_RED = RENDERING_FACTORY.createKColor() =>
        [it.red = 240; it.green = 0; it.blue = 0];
    private static val KColor DEPENDENCY_GREEN = RENDERING_FACTORY.createKColor() =>
        [it.red = 0; it.green = 240; it.blue = 0];
    private static val KColor DEPENDENCY_BLUE = RENDERING_FACTORY.createKColor() =>
        [it.red = 0; it.green = 0; it.blue = 240];
    private static val KColor DEPENDENCY_BLUE2 = RENDERING_FACTORY.createKColor() =>
        [it.red = 100; it.green = 100; it.blue = 240];
	
	
	// For a dependency edge create a connecting figure with a decorator. Depending on the type use
	// a different color.
	def createDependencyFigure(Dependency dependency, KNode rootNode) {
	    
	    val kEdge = dependency.createEdge()
            kEdge.source = dependency.sourceNode.node;
            kEdge.target = dependency.targetNode.node;
//            kEdge.addLayoutParam(LayoutOptions::EDGE_ROUTING, EdgeRouting::ORTHOGONAL);
//            kEdge.addLayoutParam(LayoutOptions::ALGORITHM, "de.cau.cs.kieler.klay.layered");
            kEdge.addSpline(2) => [
                it.addArrowDecorator()
                it.setLineWidth(2)
                
                if (dependency instanceof ValuedObjectDependency) {
                    it.foreground = DEPENDENCY_RED;
                }
                else if (dependency instanceof ControlflowDependency) {
                    it.foreground = DEPENDENCY_BLUE;
                    if ((dependency as ControlflowDependency).immediate) {
                        it.foreground = DEPENDENCY_BLUE2;
                    }
                }
                else if (dependency instanceof TransitionDependency) {
                    it.foreground = DEPENDENCY_GREEN;
                }
                
	        ];

	}
	
    def float getFloat(String s) {
    	return Float::valueOf(s);
    }
    def float getFloat(Integer i) {
    	return Float::valueOf(i);
    }
    	
}