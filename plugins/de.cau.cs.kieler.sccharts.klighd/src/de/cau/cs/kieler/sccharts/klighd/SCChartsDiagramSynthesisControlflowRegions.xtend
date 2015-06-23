package de.cau.cs.kieler.sccharts.klighd

import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.core.kgraph.KNode
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import de.cau.cs.kieler.sccharts.Scope
import com.google.inject.Inject
import de.cau.cs.kieler.core.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.kiml.options.LayoutOptions
import de.cau.cs.kieler.kiml.options.EdgeRouting
import de.cau.cs.kieler.core.krendering.extensions.KRenderingExtensions

import static extension de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses.*
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.core.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.klighd.util.KlighdProperties
import de.cau.cs.kieler.core.krendering.extensions.KColorExtensions
import de.cau.cs.kieler.core.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsExtension
import de.cau.cs.kieler.klighd.KlighdConstants

class SCChartsDiagramSynthesisControlflowRegions {
	
    @Inject 
    extension KNodeExtensions
    
    @Inject
    extension KEdgeExtensions
    
    @Inject
    extension KRenderingExtensions    
    
    @Inject
    extension KContainerRenderingExtensions        
    
    @Inject
    extension KColorExtensions       
    
    @Inject
    extension SCChartsDiagramSynthesisStates    
    
    @Inject
    extension de.cau.cs.kieler.core.annotations.extensions.AnnotationsExtensions
    
    @Inject
    extension SCChartsExtension    
    
    @Inject
    extension SCChartsDiagramSynthesisComments
    
    public def KNode translate(AbstractDiagramSynthesis<Scope> synthesis, ControlflowRegion region, boolean loadLazy) {
        
        val regionNode = region.createNode
        
        regionNode.setLayoutOption(LayoutOptions::ALGORITHM, "de.cau.cs.kieler.graphviz.dot")
        regionNode.setLayoutOption(LayoutOptions::EDGE_ROUTING, EdgeRouting::SPLINES)
        regionNode.setLayoutOption(LayoutOptions::SPACING, 40f);
        
        if (loadLazy) {
            regionNode.setLayoutOption(KlighdProperties::EXPAND, false);       
        } else {
            for (state : region.states) {
                regionNode.children += synthesis.translate(state)
            }

            // semantic comments
            if (region.hasCommentAnnotation) {
                val initialStateNode = region.states.filter[ isInitial ].head.node
                for(commentAnnotation : region.getCommentAnnotations) {
                    val commentNode = createCommentNode(synthesis, commentAnnotation)
                    node.children += commentNode
                    createEdge => [ edge |
                        edge.target = initialStateNode
                        edge.source = commentNode
//                        edge.KRendering => [ invisible = true ]
                    ]                        
                }
            }
        }
        
        val regionLabel = region.label
        
        val regionRectangle =  regionNode.addRectangle
        synthesis.associateWith(regionRectangle, region)
        regionRectangle.setAsExpandedView;
        regionRectangle.setBackgroundGradient("white".color, SCChartsDiagramSynthesisTransitionStyles::REGION_BACKGROUNDGRADIENTEND.copy, 90);
        regionRectangle.setSurroundingSpace(2, 0);
        regionRectangle.invisible = false;
        regionRectangle.foreground = "gray".color
        regionRectangle.lineWidth = 1;
        val regionText = regionRectangle.addText("[-]" + regionLabel)
        if (synthesis.getBooleanValue(SCChartsDiagramSynthesisOptions::USE_ADAPTIVEZOOM)) {
            regionText.lowerVisibilityScaleBound = 0.40f;
        }
        regionText.foreground = "dimGray".color
        regionText.fontSize = 10
        regionText.setPointPlacementData(createKPosition(LEFT, 5, 0, TOP, 2, 0), H_LEFT, V_TOP, 10, 10, 0, 0);
        regionText.addDoubleClickAction(KlighdConstants::ACTION_COLLAPSE_EXPAND);
        regionText.suppressSelectability

        if (!region.empty || !region.label.nullOrEmpty) {
            regionRectangle.addChildArea().setAreaPlacementData().from(LEFT, 0, 0, TOP, 10, 0).to(RIGHT, 0, 0, BOTTOM, 0, 0);
        }
        
        val collapsedRectangle = regionNode.addRectangle()
        synthesis.associateWith(collapsedRectangle, region)
        collapsedRectangle.setAsCollapsedView;
        collapsedRectangle.setBackgroundGradient("white".color, SCChartsDiagramSynthesisTransitionStyles::REGION_BACKGROUNDGRADIENTEND.copy, 90);
        collapsedRectangle.setSurroundingSpace(4, 0);
        collapsedRectangle.invisible = false;
        collapsedRectangle.foreground = "gray".color
        collapsedRectangle.lineWidth = 1;
        val collapsedText = collapsedRectangle.addText("[+]" + regionLabel)
        if (synthesis.getBooleanValue(SCChartsDiagramSynthesisOptions::USE_ADAPTIVEZOOM)) {
            collapsedText.lowerVisibilityScaleBound = 0.40f;
        }
        collapsedText.foreground = "dimGray".color
        collapsedText.fontSize = 10
        collapsedText.setPointPlacementData(createKPosition(LEFT, 5, 0, TOP, 2, 0), H_LEFT, V_TOP, 10, 10, 0, 0);
        if (loadLazy) {
            collapsedText.addDoubleClickAction(SCChartsReferenceExpandAction.ID);
        } else {
            collapsedText.addDoubleClickAction(KlighdConstants::ACTION_COLLAPSE_EXPAND);
        }
        collapsedText.suppressSelectability
        
        if (region.empty) {
            collapsedRectangle.addRectangle().setAreaPlacementData().from(LEFT, 0, 0, TOP, 10, 0).to(RIGHT, 0, 0, BOTTOM, 0, 0).invisible = true;
        }
        
        if (loadLazy) {
            regionNode.suppressSelectability
        }
        synthesis.associateWith(regionNode, region)
        
        return regionNode
    }
	
	
}