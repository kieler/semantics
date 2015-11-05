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
import de.cau.cs.kieler.core.krendering.ViewSynthesisShared
import de.cau.cs.kieler.core.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.klighd.hooks.SynthesisHook

/**
 * Removes shadows.
 * 
 * @author als
 * @kieler.design 2015-08-13 proposed
 * @kieler.rating 2015-08-13 proposed yellow
 * 
 */
@ViewSynthesisShared
class ShadowHook extends SynthesisHook {

    @Inject
    extension KRenderingExtensions
    
    /** The related synthesis option */
    public static final SynthesisOption SHOW_SHADOW = SynthesisOption.createCheckOption("Shadow",
            true);

    override getDisplayedSynthesisOptions() {
        return newLinkedList(SHOW_SHADOW)
    }

    override processState(State state, KNode node) {
        if (!SHOW_SHADOW.booleanValue) {
            val container = node.getKContainerRendering;
            container.styles.remove(container.shadow);
        }
    }

}