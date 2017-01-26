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
package de.cau.cs.kieler.sccharts.klighd.srtg.synthesis

import com.google.inject.Inject
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import de.cau.cs.kieler.klighd.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.extensions.SCChartsSerializeHRExtension
import de.cau.cs.kieler.sccharts.klighd.synthesis.styles.ControlflowRegionStyles
import org.eclipse.elk.alg.layered.properties.EdgeLabelSideSelection
import org.eclipse.elk.alg.layered.properties.LayeredOptions
import org.eclipse.elk.core.options.CoreOptions
import org.eclipse.elk.core.options.EdgeRouting
import org.eclipse.elk.graph.KNode

import static extension de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses.*

/**
 * Transforms {@link ControlflowRegion} into {@link KNode} diagram elements.
 * 
 * @author ssm
 * @kieler.design 2017-01-18 proposed 
 * @kieler.rating 2017-01-18 proposed 
 * 
 */
@ViewSynthesisShared
class SRTGControlflowRegionSynthesis extends SRTGSubSynthesis<ControlflowRegion, KNode> {

    @Inject
    extension KNodeExtensions

    @Inject
    extension KRenderingExtensions

    @Inject
    extension SCChartsSerializeHRExtension

    @Inject
    extension SRTGStateSynthesis

    @Inject
    extension ControlflowRegionStyles

    override performTranformation(ControlflowRegion region) {
        val node = region.createNode().associateWith(region);

        node.addLayoutParam(CoreOptions::ALGORITHM, "org.eclipse.elk.graphviz.dot");
        node.setLayoutOption(CoreOptions::SPACING_NODE, 40f);
        node.addLayoutParam(CoreOptions::EDGE_ROUTING, EdgeRouting::SPLINES);
        node.addLayoutParam(LayeredOptions::EDGE_LABEL_SIDE_SELECTION, EdgeLabelSideSelection.DIRECTION_UP);
        
        val label = if(region.label.nullOrEmpty) "" else " " + region.label;

        node.addRegionFigure => [
            associateWith(region)
            addButton("" + label)
        ]

        for (state : region.states) {
            node.children += state.transform;
        }

        return node;
    }

}