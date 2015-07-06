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
package de.cau.cs.kieler.scl.kaom.klighd

import de.cau.cs.kieler.core.kgraph.KEdge
import de.cau.cs.kieler.core.kgraph.KGraphElement
import de.cau.cs.kieler.core.kgraph.KNode
import de.cau.cs.kieler.core.krendering.KContainerRendering
import de.cau.cs.kieler.core.krendering.KLineWidth
import de.cau.cs.kieler.core.krendering.KPolyline
import de.cau.cs.kieler.core.krendering.KRendering
import de.cau.cs.kieler.core.krendering.KRenderingFactory
import de.cau.cs.kieler.core.krendering.KStyle
import de.cau.cs.kieler.core.krendering.KText
import de.cau.cs.kieler.core.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.kiml.klayoutdata.KShapeLayout
import de.cau.cs.kieler.kiml.util.KimlUtil
import javax.inject.Inject
/**
 * KRendering Utility class for KLighD visualization.
 * 
 * @author chsch
 * @kieler.design 2012-10-08 proposed cmot
 * @kieler.rating 2012-10-08 proposed yellow cmot
 * 
 */
class KRenderingUtil {
    
    @Inject
    extension KRenderingExtensions
	
	def KRenderingFactory factory() {
		return KRenderingFactory::eINSTANCE;
	} 
	
	def KRendering getKRendering(KGraphElement kge) {
		return kge.getData(typeof(KRendering));
	}
	
	def KShapeLayout getKShapeLayout(KGraphElement kge) {
		return kge.getData(typeof(KShapeLayout));
	}
	
	def dispatch KRendering add(KContainerRendering r, KRendering cr) {
		r.children.add(cr);
		return r
	}
	
	def dispatch KRendering add(KRendering r, KStyle s) {
		r.styles.add(s);
		return r
	}
	
	def KText of(KText text, String content) {
		text.text = content;
		return text;
	}
	
	def KLineWidth of(KLineWidth style, int width) {
		style.lineWidth = width;
		return style;
	}
	
	def KNode create node: KimlUtil::createInitializedNode getNode(Object o) {
	}
	
	def KNode createRoundedRectangulareNode(Object o) {
		val node = o.node;
		val rect = KRenderingFactory::eINSTANCE.createKRoundedRectangle;
		rect.setCornerHeight(10);
		rect.setCornerWidth(10);
		node.data.add(rect);
		return node;
	}
	
	def KNode createRoundedRectangulareNode(Object o, int height, int width) {
		val node = o.createRoundedRectangulareNode;
		val shapeLayout = node.getData(typeof(KShapeLayout));
		shapeLayout.height = height;
		shapeLayout.width = width;
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
        val shapeLayout = node.getData(typeof(KShapeLayout));
        shapeLayout.height = height;
        shapeLayout.width = width;
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
        val shapeLayout = node.getData(typeof(KShapeLayout));
        shapeLayout.height = height;
        shapeLayout.width = width;
        return node;
    }
    
    
    def KNode createTriangleNode(Object o) {
        val node = o.node;
        val tria = createTriangleShape
        node.data.add(tria)
        return node
    }
    
    def KNode createTriangleNode(Object o, int height, int width) {
        val node = o.createTriangleNode
        val shapeLayout = node.getData(typeof(KShapeLayout))
        shapeLayout.height = height
        shapeLayout.width = width
        return node
    }

    def KNode createTriangleReversedNode(Object o) {
        val node = o.node;
        val tria = createTriangleShapeReversed
        node.data.add(tria)
        return node
    }
    
    def KNode createTriangleReversedNode(Object o, int height, int width) {
        val node = o.createTriangleReversedNode
        val shapeLayout = node.getData(typeof(KShapeLayout))
        shapeLayout.height = height
        shapeLayout.width = width
        return node
    }

    def KNode createDiamondNode(Object o) {
        val node = o.node;
        val tria = createDiamondShape
        node.data.add(tria)
        return node
    }
    
    def KNode createDiamondNode(Object o, int height, int width) {
        val node = o.createDiamondNode
        val shapeLayout = node.getData(typeof(KShapeLayout))
        shapeLayout.height = height
        shapeLayout.width = width
        return node
    }

    def KNode createSurfaceNode(Object o) {
        val node = o.node;
        val tria = createSurfaceShape
        node.data.add(tria)
        return node
    }
    
    def KNode createSurfaceNode(Object o, int height, int width) {
        val node = o.createSurfaceNode
        val shapeLayout = node.getData(typeof(KShapeLayout))
        shapeLayout.height = height
        shapeLayout.width = width
        return node
    }

    def KNode createDepthNode(Object o) {
        val node = o.node;
        val tria = createDepthShape
        node.data.add(tria)
        return node
    }
    
    def KNode createDepthNode(Object o, int height, int width) {
        val node = o.createDepthNode
        val shapeLayout = node.getData(typeof(KShapeLayout))
        shapeLayout.height = height
        shapeLayout.width = width
        return node
    }
    

    def KPolyline createTriangleShape() {
        factory.createKPolyline() => [
            it.points += createKPosition(LEFT,  0, 0.5f, TOP,  0, 0);
            it.points += createKPosition(LEFT,  0, 1.0f, TOP,  0, 1.0f);
            it.points += createKPosition(LEFT,  0, 0.0f, TOP,  0, 1.0f);
            it.points += createKPosition(LEFT,  0, 0.5f, TOP,  0, 0);
        ];
    }	

    def KPolyline createTriangleShapeReversed() {
        factory.createKPolyline() => [
            it.points += createKPosition(LEFT,  0, 0.5f, TOP,  0, 1.0f);
            it.points += createKPosition(LEFT,  0, 1.0f, TOP,  0, 0f);
            it.points += createKPosition(LEFT,  0, 0.0f, TOP,  0, 0f);
            it.points += createKPosition(LEFT,  0, 0.5f, TOP,  0, 1.0f);
        ];
    }   

    def KPolyline createDiamondShape() {
        factory.createKPolyline() => [
            it.points += createKPosition(LEFT,  0, 0.5f, TOP,  0, 0f);
            it.points += createKPosition(LEFT,  0, 1.0f, TOP,  0, 0.5f);
            it.points += createKPosition(LEFT,  0, 0.5f, TOP,  0, 1.0f);
            it.points += createKPosition(LEFT,  0, 0f, TOP,  0, 0.5f);
            it.points += createKPosition(LEFT,  0, 0.5f, TOP,  0, 0f);
        ];
    }   

    def KPolyline createSurfaceShape() {
        factory.createKPolyline() => [
            it.points += createKPosition(LEFT,  0, 0.5f, TOP,  0, 0);
            it.points += createKPosition(LEFT,  0, 1.0f, TOP,  0, 0.33f);
            it.points += createKPosition(LEFT,  0, 1.0f, TOP,  0, 1.0f);
            it.points += createKPosition(LEFT,  0, 0.0f, TOP,  0, 1.0f);
            it.points += createKPosition(LEFT,  0, 0.0f, TOP,  0, 0.33f);
            it.points += createKPosition(LEFT,  0, 0.5f, TOP,  0, 0);
        ];
    }   

    def KPolyline createDepthShape() {
        factory.createKPolyline() => [
            it.points += createKPosition(LEFT,  0, 0.5f, TOP,  0, 1.0f);
            it.points += createKPosition(LEFT,  0, 1.0f, TOP,  0, 0.66f);
            it.points += createKPosition(LEFT,  0, 1.0f, TOP,  0, 0.0f);
            it.points += createKPosition(LEFT,  0, 0.0f, TOP,  0, 0.0f);
            it.points += createKPosition(LEFT,  0, 0.0f, TOP,  0, 0.66f);
            it.points += createKPosition(LEFT,  0, 0.5f, TOP,  0, 1.0f);
        ];
    }   

	
	def KEdge create node: KimlUtil::createInitializedEdge getEdge(Object o) {
	}
	
	def KEdge createPolyLineEdge(Object o) {
		val edge = o.edge;
		edge.data.add(factory.createKRoundedBendsPolyline => [
		    it.setBendRadius(5);
		]);
		return edge;
	}
    def KEdge createSplineEdge(Object o) {
        val edge = o.edge;
        edge.data.add(factory.createKSpline);
        return edge;
    }	
}