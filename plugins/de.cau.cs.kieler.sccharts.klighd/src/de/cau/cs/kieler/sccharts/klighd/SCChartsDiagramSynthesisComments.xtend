package de.cau.cs.kieler.sccharts.klighd

import de.cau.cs.kieler.core.kgraph.KNode
import de.cau.cs.kieler.core.annotations.CommentAnnotation
import com.google.inject.Inject
import de.cau.cs.kieler.core.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.core.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.kiml.options.LayoutOptions

import static extension de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses.*
import de.cau.cs.kieler.core.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.core.krendering.extensions.KColorExtensions
import de.cau.cs.kieler.core.krendering.extensions.KContainerRenderingExtensions

class SCChartsDiagramSynthesisComments {
    
    @Inject
    extension KNodeExtensions 

    @Inject
    extension KRenderingExtensions
    
    @Inject
    extension KColorExtensions
    
    @Inject
    extension KContainerRenderingExtensions        
 
    
	public def KNode createCommentNode(AbstractDiagramSynthesis<Scope> synthesis, CommentAnnotation commentAnnotation) {
        val commentNode = commentAnnotation.createNode
        commentNode.setLayoutOption(LayoutOptions::SPACING, 1f);
        val commentText = commentAnnotation.values.head
        val commentRectangle = commentNode.addRectangle;
        synthesis.associateWith(commentRectangle, commentAnnotation)

        commentRectangle.invisible = false;
        commentRectangle.foreground = "DarkGoldenrod".color
        commentRectangle.background = "LemonChiffon".color
        commentRectangle.lineWidth = 0.5f;
        val commentKText = commentRectangle.addText(commentText)
        synthesis.associateWith(commentKText, commentAnnotation) 
        if (synthesis.getBooleanValue(SCChartsDiagramSynthesisOptions::USE_ADAPTIVEZOOM)) {
            commentKText.lowerVisibilityScaleBound = 0.40f;
        }                
        commentKText.foreground = "DarkGoldenrod".color
        commentKText.invisible = false;
        commentKText.fontSize = 10
        commentKText.setPointPlacementData(createKPosition(LEFT, 4, 0, TOP, 4, 0), H_LEFT, V_TOP, 4, 4, 0, 0);
        commentKText.suppressSelectability
        
        return commentNode    
    }
}