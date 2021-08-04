/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2011 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scg.klighd

import de.cau.cs.kieler.klighd.kgraph.KEdge
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.KPolygon
import de.cau.cs.kieler.klighd.krendering.KRenderingFactory
import de.cau.cs.kieler.klighd.krendering.extensions.KColorExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import javax.inject.Inject
import de.cau.cs.kieler.klighd.kgraph.util.KGraphUtil
import de.cau.cs.kieler.klighd.krendering.extensions.KContainerRenderingExtensions

/**
 * KRendering Utility class for KLighD visualization.
 * 
 * @author chsch ssm
 * @kieler.design 2012-10-08 proposed cmot
 * @kieler.rating 2012-10-08 proposed yellow cmot
 * 
 */
class SCGraphShapes {
    
    @Inject extension KRenderingExtensions
    @Inject extension KColorExtensions
    @Inject extension KNodeExtensions
    @Inject extension KContainerRenderingExtensions
	

	def KNode createRoundedRectangulareNode(Object o) {
		val node = o.node;
		val rect = KRenderingFactory::eINSTANCE.createKRoundedRectangle;
		rect.setCornerHeight(10);
		rect.setCornerWidth(10);
		node.data.add(rect);
		node.KRendering.background = "white".color
		return node;
	}
	
	def KNode createRoundedRectangulareNode(Object o, int height, int width) {
		val node = o.createRoundedRectangulareNode;
		node.height = height;
		node.width = width;
		return node;
	}
	
    def KNode createRectangulareNode(Object o) {
        val node = o.node;
        val rect = KRenderingFactory::eINSTANCE.createKRectangle;
        node.data.add(rect);
        return node;
    }
    
    def KNode createRectangulareNode(Object o, int height, int width) {
        val node = o.createRectangulareNode;
        node.height = height;
        node.width = width;
        return node;
    }

    def KNode createEllipseNode(Object o) {
        val node = o.node;
        val rect = KRenderingFactory::eINSTANCE.createKEllipse;
        node.data.add(rect);
        return node;
    }
    
    def KNode createEllipseNode(Object o, int height, int width) {
        val node = o.createEllipseNode;
        node.height = height;
        node.width = width;
        return node;
    }
    
    def KPolygon createTriangleShape(KPolygon poly) {
        poly => [
            it.points += createKPosition(LEFT,  0, 0.5f, TOP,  0, 0);
            it.points += createKPosition(LEFT,  0, 1.0f, TOP,  0, 1.0f);
            it.points += createKPosition(LEFT,  0, 0.0f, TOP,  0, 1.0f);
            it.points += createKPosition(LEFT,  0, 0.5f, TOP,  0, 0);
            it.background = "white".color
            addText("").setAreaPlacementData.from(LEFT, 0, 0, TOP, 4, 0).to(RIGHT, 0, 0, BOTTOM, 0, 0)
         ];
    }	

    def KPolygon createTriangleLandscapeShape(KPolygon poly) {
        poly => [
            it.points += createKPosition(LEFT,  0, 0.0f, TOP,  0, 0.5f);
            it.points += createKPosition(LEFT,  0, 1.0f, TOP,  0, 0.0f);
            it.points += createKPosition(LEFT,  0, 1.0f, TOP,  0, 1.0f);
            it.points += createKPosition(LEFT,  0, 0.0f, TOP,  0, 0.5f);
            it.background = "white".color
            addText("").setAreaPlacementData.from(LEFT, 2, 0, TOP, 0, 0).to(RIGHT, 0, 0, BOTTOM, 2, 0)
         ];
    }   

    def KPolygon createTriangleShapeReversed(KPolygon poly) {
        poly => [
            it.points += createKPosition(LEFT,  0, 0.5f, TOP,  0, 1.0f);
            it.points += createKPosition(LEFT,  0, 1.0f, TOP,  0, 0f);
            it.points += createKPosition(LEFT,  0, 0.0f, TOP,  0, 0f);
            it.points += createKPosition(LEFT,  0, 0.5f, TOP,  0, 1.0f);
            it.background = "white".color
            addText("").setAreaPlacementData.from(LEFT, 0, 0, TOP, 0, 0).to(RIGHT, 0, 0, BOTTOM, 10, 0)
        ];
    }   

    def KPolygon createTriangleLandscapeShapeReversed(KPolygon poly) {
        poly => [
            it.points += createKPosition(LEFT,  0, 0.0f, TOP,  0, 0.0f);
            it.points += createKPosition(LEFT,  0, 1.0f, TOP,  0, 0.5f);
            it.points += createKPosition(LEFT,  0, 0.0f, TOP,  0, 1.0f);
            it.points += createKPosition(LEFT,  0, 0.0f, TOP,  0, 0.0f);
            it.background = "white".color
            addText("").setAreaPlacementData.from(LEFT, 0, 0, TOP, 0, 0).to(RIGHT, 0, 0, BOTTOM, 4, 0)
        ];
    }   

    def KPolygon createDiamondShape(KPolygon poly) {
        poly => [
            it.points += createKPosition(LEFT,  0, 0.5f, TOP,  0, 0f);
            it.points += createKPosition(LEFT,  0, 1.0f, TOP,  0, 0.5f);
            it.points += createKPosition(LEFT,  0, 0.5f, TOP,  0, 1.0f);
            it.points += createKPosition(LEFT,  0, 0f, TOP,  0, 0.5f);
            it.points += createKPosition(LEFT,  0, 0.5f, TOP,  0, 0f);
            it.background = "white".color
            it.addText("").setAreaPlacementData.
            from(LEFT, 0, 0, TOP, 0, 0).to(RIGHT, 1, 0, BOTTOM, 1, 0) => [
                it.background = "white".color
                it.background.alpha = 196
            ]
        ];
    }   

    def KPolygon createSurfaceShape(KPolygon poly) {
        poly => [
            it.points += createKPosition(LEFT,  0, 0.5f, TOP,  0, 0);
            it.points += createKPosition(LEFT,  0, 1.0f, TOP,  0, 0.33f);
            it.points += createKPosition(LEFT,  0, 1.0f, TOP,  0, 1.0f);
            it.points += createKPosition(LEFT,  0, 0.0f, TOP,  0, 1.0f);
            it.points += createKPosition(LEFT,  0, 0.0f, TOP,  0, 0.33f);
            it.points += createKPosition(LEFT,  0, 0.5f, TOP,  0, 0);
            it.background = "white".color
            addText("")
        ];
    }   

    def KPolygon createSurfaceLandscapeShape(KPolygon poly) {
        poly => [
            it.points += createKPosition(LEFT,  0, 0.25f, TOP,  0, 0);
            it.points += createKPosition(LEFT,  0, 1.0f, TOP,  0, 0);
            it.points += createKPosition(LEFT,  0, 1.0f, TOP,  0, 1.0f);
            it.points += createKPosition(LEFT,  0, 0.25f, TOP,  0, 1.0f);
            it.points += createKPosition(LEFT,  0, 0.0f, TOP,  0, 0.5f);
            it.points += createKPosition(LEFT,  0, 0.25f, TOP,  0, 0);
            it.background = "white".color
            addText("").setAreaPlacementData.from(LEFT, 10, 0, TOP, 0, 0).to(RIGHT, 0, 0, BOTTOM, 3, 0)
        ];
    }   

    def KPolygon createDepthShape(KPolygon poly) {
        poly => [
            it.points += createKPosition(LEFT, 0, 0.5f, TOP, 0, 1.0f);
            it.points += createKPosition(LEFT, 0, 1.0f, TOP, 0, 0.66f);
            it.points += createKPosition(LEFT, 0, 1.0f, TOP, 0, 0.0f);
            it.points += createKPosition(LEFT, 0, 0.0f, TOP, 0, 0.0f);
            it.points += createKPosition(LEFT, 0, 0.0f, TOP, 0, 0.66f);
            it.points += createKPosition(LEFT, 0, 0.5f, TOP, 0, 1.0f);
            it.background = "white".color
            addText("").setAreaPlacementData.from(LEFT, 0, 0, TOP, 0, 0).to(RIGHT, 0, 0, BOTTOM, 4, 0)
        ];
    }   

    def KPolygon createDepthLandscapeShape(KPolygon poly) {
        poly => [
            it.points += createKPosition(LEFT, 0, 0.0f, TOP, 0, 0.0f);
            it.points += createKPosition(LEFT, 0, 0.75f, TOP, 0, 0.0f);
            it.points += createKPosition(LEFT, 0, 1.0f, TOP, 0, 0.5f);
            it.points += createKPosition(LEFT, 0, 0.75f, TOP, 0, 1.0f);
            it.points += createKPosition(LEFT, 0, 0.0f, TOP, 0, 1.0f);
            it.points += createKPosition(LEFT, 0, 0.0f, TOP, 0, 0.0f);
            it.background = "white".color
            addText("").setAreaPlacementData.from(LEFT, 0, 0, TOP, 0, 0).to(RIGHT, 10, 0, BOTTOM, 2, 0)
        ];
    }   

	
	def KEdge create node: KGraphUtil::createInitializedEdge getEdge(Object o) {
	}
	
	def KEdge createPolyLineEdge(Object o) {
		val edge = o.edge;
		edge.data.add(KRenderingFactory::eINSTANCE.createKRoundedBendsPolyline => [
		    it.setBendRadius(5);
		]);
		return edge;
	}
    def KEdge createSplineEdge(Object o) {
        val edge = o.edge;
        edge.data.add(KRenderingFactory::eINSTANCE.createKSpline);
        return edge;
    }	
}