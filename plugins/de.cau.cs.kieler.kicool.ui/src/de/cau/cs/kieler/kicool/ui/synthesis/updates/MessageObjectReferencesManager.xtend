/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.kicool.ui.synthesis.updates

import de.cau.cs.kieler.kicool.environments.MessageObjectReferences
import com.google.inject.Inject
import de.cau.cs.kieler.klighd.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import org.eclipse.elk.core.options.CoreOptions
import de.cau.cs.kieler.klighd.krendering.KRoundedRectangle
import de.cau.cs.kieler.klighd.krendering.KText
import de.cau.cs.kieler.klighd.krendering.KPolyline
import de.cau.cs.kieler.klighd.kgraph.KEdge

import static extension de.cau.cs.kieler.kicool.ui.synthesis.styles.ColorStore.*
import static de.cau.cs.kieler.kicool.ui.synthesis.styles.ColorStore.Color.*
import static de.cau.cs.kieler.kicool.ui.synthesis.styles.ColorSystem.*
import de.cau.cs.kieler.klighd.krendering.extensions.KContainerRenderingExtensions
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.kicool.ui.synthesis.styles.ColorSystem
import de.cau.cs.kieler.kicool.classes.IColorSystem
import de.cau.cs.kieler.kicool.environments.MessageObjectLink
import de.cau.cs.kieler.klighd.internal.util.SourceModelTrackingAdapter

/**
 * @author ssm
 * @kieler.design 2017-07-11 proposed 
 * @kieler.rating 2017-07-11 proposed yellow
 *
 */
class MessageObjectReferencesManager {
    
    @Inject extension KNodeExtensions
    @Inject extension KEdgeExtensions 
    @Inject extension KRenderingExtensions  
    @Inject extension KContainerRenderingExtensions
        
    def annotateModelNodes(MessageObjectReferences references, KNode node) {
        val trackingAdapter = new SourceModelTrackingAdapter
        node.eAdapters.add(trackingAdapter)
        
        for(reference : references) {
            if (reference.object != null) {
                val nodes = trackingAdapter.getTargetElements(reference.object)
                if (nodes.empty) {
                    val commentNode = reference.createCommentBox(reference.message, null, reference.colorSystem as ColorSystem)
                    node.children += commentNode
                } else {
                    for (n : nodes) {
                        if (n instanceof KNode) {
                            val parentNode = n.eContainer as KNode
                            val commentNode = reference.createCommentBox(reference.message, n, reference.colorSystem as ColorSystem)
                            parentNode.children.add(commentNode)
                        }
                    }
                }
            } else {
                val commentNode = reference.createCommentBox(reference.message, null, reference.colorSystem as ColorSystem)
                node.children += commentNode
            }
        }
    } 
    
    private def KNode createCommentBox(Object association, String text, KNode relatedNode, ColorSystem colorSystem) {
        val node = association.createNode
        
        node.addLayoutParam(CoreOptions.COMMENT_BOX, true)
        
        node.addCommentFigure(colorSystem)
        node.addCommentText(text)
        
        if (relatedNode != null) {
            val edge = association.createEdge
            edge.source = relatedNode
            edge.target = node
            edge.addCommentPolyline(colorSystem)        
        }        

        return node        
    }
    
    def KRoundedRectangle addCommentFigure(KNode node, ColorSystem colorSystem) {
        node.setMinimalNodeSize(16, 16)
        node.addRoundedRectangle(1, 1, 1) => [
            setBackgroundGradient(colorSystem.background.color, colorSystem.backgroundTarget.color, 90);
            foreground = colorSystem.foreground.color
        ]
    }

    def KText addCommentText(KNode node, String text) {
        node.getKContainerRendering.addText(text) => [
            fontSize = 8;
            setGridPlacementData().from(LEFT, 4, 0, TOP, 4, 0).to(RIGHT, 4, 0, BOTTOM, 4, 0);
        ]
    }
    
    def KPolyline addCommentPolyline(KEdge edge, ColorSystem colorSystem) {
        edge.addPolyline => [
            lineWidth = 1;
            foreground = colorSystem.foreground.color
        ]
    }
    
    
    static def fillUndefinedColors(MessageObjectReferences references, ColorSystem colorSystem) {
        val newReferences = new MessageObjectReferences
        for(reference : references) {
            val IColorSystem cs = if (reference.colorSystem != null) reference.colorSystem else colorSystem
            newReferences.add(new MessageObjectLink(reference.message, reference.object, reference.annotate, cs, null))
        }
        newReferences
    }     
    
}