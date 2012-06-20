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
package de.cau.cs.kieler.synccharts.codegen.dependencies.klighd.xtend

import de.cau.cs.kieler.klighd.transformations.AbstractTransformation
import de.cau.cs.kieler.klighd.TransformationContext
import de.cau.cs.kieler.core.kgraph.KNode
import de.cau.cs.kieler.kiml.util.KimlUtil
import com.google.inject.Inject
import de.cau.cs.kieler.kiml.options.LayoutOptions
import de.cau.cs.kieler.kiml.options.Direction
import de.cau.cs.kieler.kiml.options.EdgeRouting
import de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.Dependencies
import de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.Node
import de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.Dependency
import de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.SignalDependency
import de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.ControlflowDependency
import de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.TransitionDependency
import de.cau.cs.kieler.core.krendering.KPolyline
import de.cau.cs.kieler.core.krendering.KPosition
import de.cau.cs.kieler.core.krendering.KXPosition
import de.cau.cs.kieler.core.krendering.KYPosition
import de.cau.cs.kieler.core.krendering.KLineWidth
import de.cau.cs.kieler.core.krendering.KForegroundColor

/**
 * Visualization of a dependency graph for a SyncChart.
 * 
 * @author cmot
 */
class DependencyDiagramSynthesis extends AbstractTransformation<Dependencies, KNode> {
	
	@Inject
	extension KRenderingUtil
	
	// Main transformation for every dependency node create a node figure and for every dependency an connecting edge figure.
	override KNode transform(Dependencies model, TransformationContext<Dependencies, KNode> transformationContext) {
		
		val rootNode = KimlUtil::createInitializedNode;
		rootNode.KShapeLayout.setProperty(LayoutOptions::SPACING, Float::valueOf("10.0"));
	    rootNode.KShapeLayout.setProperty(LayoutOptions::DIRECTION, Direction::DOWN);
	    rootNode.KShapeLayout.setProperty(LayoutOptions::EDGE_ROUTING, EdgeRouting::ORTHOGONAL);
	    rootNode.KShapeLayout.setProperty(LayoutOptions::ALGORITHM, "de.cau.cs.kieler.klay.layered");
		
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
			val kNode = node.createRoundedRectangulareNode(25, 85);
			kNode.KRendering.add(factory.createKLineWidth.of(2));
			
			val color = factory.createKForegroundColor();
			if (node.id.endsWith("_S")) {
				color.setRed(0);
				color.setBlue(0);
				color.setGreen(0);
			}
			else {
				color.setRed(200);
				color.setBlue(200);
				color.setGreen(200);
			}
			kNode.KRendering.add(color);
			val nodeText = node.id.substring(0,node.id.length - 2);
			
			kNode.KRendering.add(factory.createKText.of(nodeText + " (" + node.priority + ")"));
			rootNode.children.add(kNode)
			return kNode
	}
	
	
	// For a dependency edge create a connecting figure with a decorator. Depending on the type use
	// a different color.
	def createDependencyFigure(Dependency dependency, KNode rootNode) {
		val kEdge = dependency.createPolyLineEdge;
		kEdge.KRendering.add(factory.createKLineWidth.of(2));
		
		var color = factory.createKForegroundColor();
		var color2 = factory.createKForegroundColor();
		if (dependency instanceof SignalDependency) {
			color.setRed(255);
			color2.setRed(255);
		}
		else if (dependency instanceof ControlflowDependency) {
			color.setBlue(230);
			color2.setRed(255);
			if ((dependency as ControlflowDependency).immediate) {
					color.setBlue(255);
					color.setGreen(150);
					color2.setBlue(255);
					color2.setGreen(150);
			}
		}
		else if (dependency instanceof TransitionDependency) {
			color.setGreen(255);
			color2.setGreen(255);
		}
		kEdge.KRendering.add(color2);
		(kEdge.KRendering as KPolyline).addConnectionArrow(1, color, true);
		
//		val ellipse = factory.createKEllipse;
//		val dpd = factory.createKDecoratorPlacementData;
//		dpd.location = Float::valueOf("0.99");
//		dpd.height = 7;
//		dpd.width = 7;
//		dpd.XOffset = -5;
//		dpd.YOffset = -5;
//		ellipse.placementData = dpd;
//		kEdge.KRendering.add(ellipse);
		
		kEdge.source = dependency.sourceNode.createNodeFigure(rootNode);
		kEdge.target = dependency.targetNode.createNodeFigure(rootNode);
		
		kEdge.source.outgoingEdges.add(kEdge);
		
		return kEdge
	}
	
	
	def KPolyline addConnectionArrow(KPolyline line, int scale, KForegroundColor kForegroundColor, boolean toHead) {
		val float actualScale = Math::sqrt(2*scale).floatValue;
        val dpd = factory.createKDecoratorPlacementData;
        dpd.height = 6 * actualScale;
        dpd.width = 6 * actualScale;
        dpd.XOffset = -7 * actualScale;
        dpd.YOffset = (dpd.height.floatValue + (scale.floatValue / 2.floatValue)) / (-2).floatValue;
        dpd.relative = true; // this directs klighd to rotate the decorator accordingly!!
        dpd.location = if (toHead) "1.0".float else 0;
        
        val plp = factory.createKPolylinePlacementData;
		plp.detailPlacementData = dpd;        
        if (toHead) {
            plp.points.addAll(newArrayList(
        	    createPoint(createLeftPos(0,0), createTopPos(0,0)),
        	    createPoint(createRightPos(0,0), createTopPos(0.float,"0.5".float)),
        	    createPoint(createLeftPos(0,0), createBottomPos(0,0))
            ));
        } else {
            plp.points.addAll(newArrayList(
        	    createPoint(createRightPos(0,0), createTopPos(0,0)),
        	    createPoint(createLeftPos(0,0), createTopPos(0.float,"0.5".float)),
        	    createPoint(createRightPos(0,0), createBottomPos(0,0))
            ));
        }

        val linewidth = factory.createKLineWidth;
        linewidth.lineWidth = line.styles.filter(typeof(KLineWidth)).last?.lineWidth;
        
        val arrow =  factory.createKPolyline;
        arrow.add(linewidth);
        arrow.add(kForegroundColor);
        arrow.placementData = plp;

        return line.add(arrow) as KPolyline;
    }
    
    def KXPosition createLeftPos(Integer abs, Integer rel) {
    	return createLeftPos(abs.float, rel.float);
	}

    def KXPosition createLeftPos(Float abs, Float rel) {
    	val pos = factory.createKLeftPosition;
    	pos.absolute = abs;
    	pos.relative = rel;
    	return pos;
    }
    
    def KXPosition createRightPos(Integer abs, Integer rel) {
    	createRightPos(abs.float, rel.float);
    }
    def KXPosition createRightPos(Float abs, Float rel) {
    	val pos = factory.createKRightPosition;
    	pos.absolute = abs;
    	pos.relative = rel;
    	return pos;
    }

    def KYPosition createBottomPos(Integer abs, Integer rel) {
    	return createBottomPos(abs.getFloat, rel.getFloat);
    }
    def KYPosition createBottomPos(Float abs, Float rel) {
    	val pos = factory.createKBottomPosition;
    	pos.absolute = abs;
    	pos.relative = rel;
    	return pos;
    }

    def KYPosition createTopPos(Integer abs, Integer rel) {
    	return createTopPos(abs.getFloat, rel.getFloat);
    }
    def KYPosition createTopPos(Float abs, Float rel) {
    	val pos = factory.createKTopPosition;
    	pos.absolute = abs;
    	pos.relative = rel;
    	return pos;
    }
    
    def KPosition createPoint(KXPosition x, KYPosition y) {
    	val pos = factory.createKPosition;
    	pos.x = x;
    	pos.y = y;
    	return pos;
    }
	
    def float getFloat(String s) {
    	return Float::valueOf(s);
    }
    def float getFloat(Integer i) {
    	return Float::valueOf(i);
    }
    	
}