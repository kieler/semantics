/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2019 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.ui.synthesis

import de.cau.cs.kieler.annotations.CommentAnnotation
import de.cau.cs.kieler.kexpressions.Declaration
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.klighd.kgraph.KEdge
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.KText
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import de.cau.cs.kieler.sccharts.Action
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.Transition
import javax.inject.Inject

import static extension de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses.*
import de.cau.cs.kieler.klighd.kgraph.KLabel

/**
 * @author als
 */
@ViewSynthesisShared
class AdaptiveZoom {
    
    /** Option for enabling adaptive zoom */
    public static final SynthesisOption USE_ADAPTIVEZOOM =
            SynthesisOption.createCheckOption("Adaptive Zoom", false).setCategory(GeneralSynthesisOptions.NAVIGATION)
            
    static val TUNNEL_EFFECT = 0.85
    static val DEFAULT_LOWER_SCALE_BOUND = 0.15
            
    @Inject
    SCChartsSynthesis synthesis
    
    dispatch def configureNodeLOD(KNode node, Region region) {
        // Create a tunnel effect with regions to benifit from adaptive zoom
        if (isActivated) {
            node.initiallyScale(TUNNEL_EFFECT)
        }
    }
    
    dispatch def configureNodeLOD(KNode node, State state) {
        if (isActivated && state.eContainer instanceof Region) { // Excclude outer most state
            node.lowerVisibilityScaleBound = DEFAULT_LOWER_SCALE_BOUND
        }
    }
    
    dispatch def configureNodeLOD(KNode node, CommentAnnotation commentAnnotation) {
        if (isActivated) {
            node.lowerVisibilityScaleBound = DEFAULT_LOWER_SCALE_BOUND * 2
        }
    }
    
    dispatch def configureEdgeLOD(KEdge edge, Transition t) {
        if (isActivated) {
            edge.lowerVisibilityScaleBound = DEFAULT_LOWER_SCALE_BOUND
        }
    }
    
    dispatch def configureLabelLOD(KLabel label, Transition t) {
        if (isActivated) {
            label.lowerVisibilityScaleBound = DEFAULT_LOWER_SCALE_BOUND * 2
        }
    }
    
    dispatch def configureTextLOD(KText text, Declaration decl) {
        if (isActivated) {
            text.lowerVisibilityScaleBound = DEFAULT_LOWER_SCALE_BOUND * 2
        }
    }
    
    dispatch def configureTextLOD(KText text, Action action) {
        if (isActivated) {
            text.lowerVisibilityScaleBound = DEFAULT_LOWER_SCALE_BOUND * 2
        }
    }
    
    dispatch def configureTextLOD(KText text, Region region) {
        if (isActivated) {
            text.lowerVisibilityScaleBound = DEFAULT_LOWER_SCALE_BOUND * 2
        }
    }
    
    dispatch def configureTextLOD(KText text, State state) {
        if (isActivated) {
            text.lowerVisibilityScaleBound = DEFAULT_LOWER_SCALE_BOUND * 1.5
        }
    }
    
    def boolean isActivated() {
        if (synthesis.usedContext !== null) {
            return synthesis.getBooleanValue(USE_ADAPTIVEZOOM)
        }
        return false
    }
}