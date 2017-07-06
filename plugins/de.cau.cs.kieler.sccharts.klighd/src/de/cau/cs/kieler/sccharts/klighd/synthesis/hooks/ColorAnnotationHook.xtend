/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.klighd.synthesis.hooks

import com.google.inject.Inject
import de.cau.cs.kieler.annotations.Annotatable
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.klighd.kgraph.KEdge
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.klighd.hooks.SynthesisHook
import de.cau.cs.kieler.sccharts.klighd.synthesis.GeneralSynthesisOptions
import de.cau.cs.kieler.sccharts.klighd.synthesis.styles.ControlflowRegionStyles
import de.cau.cs.kieler.sccharts.klighd.synthesis.styles.StateStyles

import static extension de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses.*
import de.cau.cs.kieler.sccharts.klighd.synthesis.SCChartsSynthesis
import de.cau.cs.kieler.sccharts.klighd.AbstractSCChartsSynthesis
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.annotations.CommentAnnotation
import de.cau.cs.kieler.klighd.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.sccharts.klighd.synthesis.KNodeExtensionsReplacement
import de.cau.cs.kieler.klighd.krendering.KContainerRendering
import de.cau.cs.kieler.klighd.krendering.KColoring
import de.cau.cs.kieler.klighd.krendering.KBackground
import de.cau.cs.kieler.klighd.krendering.KColor
import de.cau.cs.kieler.klighd.krendering.KForeground
import com.google.inject.internal.Annotations
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.annotations.StringAnnotation
import java.util.Map
import de.cau.cs.kieler.klighd.krendering.extensions.KColorExtensions
import de.cau.cs.kieler.klighd.krendering.KRenderingUtil

/**
 * Removes model elements marked with the annotation hide.
 * 
 * @author als
 * @kieler.design 2015-11-4 proposed
 * @kieler.rating 2015-11-4 proposed yellow
 * 
 */
@ViewSynthesisShared
class ColorAnnotationHook extends SynthesisHook {

    @Inject extension AnnotationsExtensions
    @Inject extension KNodeExtensionsReplacement
    @Inject extension KEdgeExtensions
    @Inject extension StateStyles
    @Inject extension ControlflowRegionStyles

    /** Keyword for the hide annotation */
    public static final String BACKGROUND_ANNOTATION_KEYWORD = "background"
    public static final String BACKGROUND_TARGET_ANNOTATION_KEYWORD = "backgroundTarget"
    public static final String FOREGROUND_ANNOTATION_KEYWORD = "foreground"
    public static final String ALPHA_ANNOTATION_KEYWORD = "alpha"

    override void finish(Scope scope, KNode node) {
        val relevantObjects = scope.eAllContents.filter(Annotatable).filter[ annotations.exists[
                name != null && (
                    name.equals(BACKGROUND_ANNOTATION_KEYWORD) ||
                    name.equals(BACKGROUND_TARGET_ANNOTATION_KEYWORD) ||
                    name.equals(FOREGROUND_ANNOTATION_KEYWORD) ||
                    name.equals(ALPHA_ANNOTATION_KEYWORD)
                    )
            ] 
        ].toIterable
        
        for (object : relevantObjects) {
            if (object.nodeExists) {
                val kNode = object.node
                val rendering = kNode.getContainer
                
                val background = object.getAnnotation(BACKGROUND_ANNOTATION_KEYWORD)
                val backgroundTarget = object.getAnnotation(BACKGROUND_TARGET_ANNOTATION_KEYWORD)
                val foreground = object.getAnnotation(FOREGROUND_ANNOTATION_KEYWORD)
                val alpha = object.getAnnotation(ALPHA_ANNOTATION_KEYWORD)
                
                if (background != null) {
                    val backgroundTargetColor = if (backgroundTarget != null) 
                        (backgroundTarget as StringAnnotation).createColor
                        else (background as StringAnnotation).createColor
                    rendering.setBackgroundColor((background as StringAnnotation).createColor, backgroundTargetColor)
                }
                
                if (foreground != null) {
                    rendering.setForegroundColor((foreground as StringAnnotation).createColor)
                }
                
                if (alpha != null) {
                    rendering.setAlpha(Integer.parseInt((alpha as StringAnnotation).values.head))
                }                
            }
        }
    }
    
    private static def void setForegroundColor(KContainerRendering container, KColor foreground) {
        container.styles.filter(KColoring).forEach[ c |
            if (c instanceof KForeground) { 
                c.color = foreground
            }
        ]
    }
    
    private static def void setBackgroundColor(KContainerRendering container, KColor background, KColor backgroundTarget) {
        container.styles.filter(KColoring).forEach[ c |
            if (c instanceof KBackground) { 
                c.color = background
                c.targetColor = backgroundTarget
            }
        ]
    }

    private static def void setAlpha(KContainerRendering container, int alpha) {
        container.styles.filter(KColoring).forEach[ c |
            if (c instanceof KBackground) { 
                c.alpha = alpha
                c.targetAlpha = alpha
            }
        ]
    }
    
    
    static def getContainer(KNode node) {
        node.getData(KContainerRendering) as KContainerRendering
    }
    
    static def KColor createColor(StringAnnotation anno) {
        var color = anno.values.head
        if (!color.startsWith("#")) color = "#" + color
        KRenderingUtil.getColor(color)
    }    
}
