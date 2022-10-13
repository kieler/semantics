/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.ui.synthesis

import com.google.inject.Inject
import de.cau.cs.kieler.annotations.CommentAnnotation
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import de.cau.cs.kieler.klighd.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsControlflowRegionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsDataflowRegionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsSerializeHRExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import de.cau.cs.kieler.sccharts.ui.synthesis.styles.CommentStyles
import java.util.List
import org.eclipse.elk.core.options.CoreOptions

import static extension de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses.*

/**
 * Transforms {@link State} into {@link KNode} diagram elements.
 * 
 * @author als ssm
 * @kieler.design 2015-08-13 proposed
 * @kieler.rating 2015-08-13 proposed yellow
 * 
 */
@ViewSynthesisShared
class CommentSynthesis extends SubSynthesis<CommentAnnotation, KNode> {

    @Inject extension KNodeExtensions
    @Inject extension KEdgeExtensions
    @Inject extension AnnotationsExtensions
    @Inject extension SCChartsStateExtensions
    @Inject extension SCChartsControlflowRegionExtensions
    @Inject extension SCChartsDataflowRegionExtensions
    @Inject extension SCChartsSerializeHRExtensions
    @Inject extension TransitionSynthesis
    @Inject extension ControlflowRegionSynthesis
    @Inject extension DataflowRegionSynthesis
    @Inject extension CommentStyles
    @Inject extension AdaptiveZoom

    override List<KNode> performTranformation(CommentAnnotation commentAnnotation) {
        val node = commentAnnotation.createNode().associateWith(commentAnnotation)
        
        node.setLayoutOption(CoreOptions.COMMENT_BOX, true)
        node.configureNodeLOD(commentAnnotation)
        
        node.addCommentFigure
        node.addCommentText(commentAnnotation.values.head)
        
        val source = commentAnnotation.eContainer
        
        if (source instanceof State) {
            val edge = commentAnnotation.createEdge().associateWith(commentAnnotation)
            edge.source = source.node
            edge.target = node
            edge.addCommentPolyline        
        }        

        return <KNode> newArrayList(node)
    }
   
}