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

import de.cau.cs.kieler.kiml.util.KimlUtil
import de.cau.cs.kieler.core.kgraph.KNode
import de.cau.cs.kieler.core.krendering.KRenderingFactory
import de.cau.cs.kieler.kiml.klayoutdata.KShapeLayout
import de.cau.cs.kieler.core.krendering.KRendering
import de.cau.cs.kieler.core.kgraph.KGraphElement
import de.cau.cs.kieler.core.krendering.KStyle
import de.cau.cs.kieler.core.krendering.KLineWidth
import de.cau.cs.kieler.core.krendering.KContainerRendering
import de.cau.cs.kieler.core.krendering.KText
import de.cau.cs.kieler.core.kgraph.KEdge

class KRenderingUtil {
	
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
	
	def KEdge create node: KimlUtil::createInitializedEdge getEdge(Object o) {
	}
	
	def KEdge createPolyLineEdge(Object o) {
		val edge = o.edge;
		edge.data.add(factory.createKPolyline);
		return edge;
	}
	
}