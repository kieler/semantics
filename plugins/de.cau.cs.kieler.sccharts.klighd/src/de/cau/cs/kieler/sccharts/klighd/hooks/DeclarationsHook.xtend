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
package de.cau.cs.kieler.sccharts.klighd.hooks

import com.google.inject.Inject
import de.cau.cs.kieler.core.kgraph.KNode
import de.cau.cs.kieler.core.krendering.ViewSynthesisShared
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.klighd.SCChartsSynthesisHook
import de.cau.cs.kieler.sccharts.klighd.styles.StateStyles

/**
 * @author als
 * @kieler.design 2015-08-13 proposed
 * @kieler.rating 2015-08-13 proposed yellow
 * 
 */
@ViewSynthesisShared
class DeclarationsHook extends SCChartsSynthesisHook {

    @Inject
    extension StateStyles

    public static final SynthesisOption SHOW_SIGNAL_DECLARATIONS = SynthesisOption.createCheckOption("Declarations",
        true);

    override getDisplayedSynthesisOptions() {
        return newLinkedList(SHOW_SIGNAL_DECLARATIONS)
    }

    override postState(State state, KNode node) {
        if (!state.declarations.empty && !SHOW_SIGNAL_DECLARATIONS.booleanValue) {
            val declarations = node.declarationsContainer;
            if (declarations != null) {
                declarations.parent.children.remove(declarations);
            }
        }
    }
}