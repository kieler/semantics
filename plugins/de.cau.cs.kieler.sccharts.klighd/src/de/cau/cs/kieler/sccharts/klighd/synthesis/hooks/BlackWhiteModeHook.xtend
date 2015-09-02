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
package de.cau.cs.kieler.sccharts.klighd.synthesis.hooks

import com.google.inject.Inject
import de.cau.cs.kieler.core.kgraph.KNode
import de.cau.cs.kieler.core.krendering.KColor
import de.cau.cs.kieler.core.krendering.KRenderingFactory
import de.cau.cs.kieler.core.krendering.ViewSynthesisShared
import de.cau.cs.kieler.core.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.klighd.hooks.SCChartsSynthesisHook

/**
 * @author als
 * @kieler.design 2015-08-13 proposed
 * @kieler.rating 2015-08-13 proposed yellow
 * 
 */
@ViewSynthesisShared
class BlackWhiteModeHook extends SCChartsSynthesisHook {

    @Inject
    extension KRenderingExtensions
    
    /** The related synthesis option */
    public static final SynthesisOption PAPER_BW = SynthesisOption.createCheckOption("Black/White (Paper)", false);

    // TODO BW for background gradient
    private static val KRenderingFactory RENDERING_FACTORY = KRenderingFactory.eINSTANCE;
    private static val KColor SCCHARTSGRAY = RENDERING_FACTORY.createKColor() => [
        it.red = 240;
        it.green = 240;
        it.blue = 240
    ];

    override getDisplayedSynthesisOptions() {
        return newLinkedList(PAPER_BW)
    }

    override start(Scope scope, KNode root) {
        // TODO change all colors to gray
    }

    override postState(State state, KNode node) {
        if (PAPER_BW.booleanValue) {
            val container = node.getKContainerRendering;
            container.styles.remove(container.shadow);
        }
    }

}