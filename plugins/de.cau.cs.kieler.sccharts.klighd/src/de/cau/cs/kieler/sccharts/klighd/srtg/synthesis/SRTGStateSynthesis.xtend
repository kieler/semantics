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
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.klighd.synthesis.styles.StateStyles
import org.eclipse.elk.core.options.CoreOptions
import org.eclipse.elk.graph.KNode

import static extension de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses.*
import de.cau.cs.kieler.sccharts.klighd.synthesis.SubSynthesis

/**
 * Transforms {@link State} into {@link KNode} diagram elements.
 * 
 * @author ssm
 * @kieler.design 2017-01-18 proposed 
 * @kieler.rating 2017-01-18 proposed 
 * 
 */
@ViewSynthesisShared
class SRTGStateSynthesis extends SubSynthesis<SRTGSynthesis, State, KNode> {

    @Inject
    extension KNodeExtensions

    @Inject
    extension SRTGTransitionSynthesis

    @Inject
    extension SRTGControlflowRegionSynthesis

    @Inject
    extension StateStyles

    override performTranformation(State state) {
        val node = state.createNode().associateWith(state);

        node.addLayoutParam(CoreOptions::ALGORITHM, "org.eclipse.elk.box");
        node.setLayoutOption(CoreOptions::EXPAND_NODES, true);
        node.setLayoutOption(CoreOptions::SPACING_BORDER, 2f);
        node.setLayoutOption(CoreOptions::SPACING_NODE, 1f);

        // Basic state style
        node.addDefaultFigure

        // Styles from modifiers
        if (state.isInitial) {
            node.setInitialStyle
        }
        if (state.isFinal) {
            node.setFinalStyle
        }

        node.setShadowStyle

        if (!state.label.nullOrEmpty) {
           node.addSimpleStateLabel(state.label).associateWith(state)
        } else {
            node.addEmptyStateLabel
        }

        // Transform all outgoing transitions
        for (transition : state.outgoingTransitions) {
            transition.transform;
        }

        // Transform regions
        for (region : state.regions) {
            switch region {
                ControlflowRegion: node.children += region.transform
            }
        }

        return node;
    }

}