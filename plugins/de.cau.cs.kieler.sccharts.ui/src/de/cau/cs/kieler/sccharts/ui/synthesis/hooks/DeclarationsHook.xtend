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
package de.cau.cs.kieler.sccharts.ui.synthesis.hooks

import com.google.inject.Inject
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.KContainerRendering
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.ui.synthesis.GeneralSynthesisOptions
import de.cau.cs.kieler.sccharts.ui.synthesis.styles.ControlflowRegionStyles
import de.cau.cs.kieler.sccharts.ui.synthesis.styles.StateStyles
import org.eclipse.elk.graph.properties.IProperty
import org.eclipse.elk.graph.properties.Property

/**
 * Shows or hides state declarations.
 * 
 * @author als
 * @kieler.design 2015-08-13 proposed
 * @kieler.rating 2015-08-13 proposed yellow
 * 
 */
@ViewSynthesisShared
class DeclarationsHook extends SynthesisHook {

    @Inject extension StateStyles
    @Inject extension ControlflowRegionStyles

    /** Action ID */
    public static final String ID = "de.cau.cs.kieler.sccharts.ui.synthesis.hooks.DeclarationsHook";
    /** The related synthesis option */
    public static final SynthesisOption SHOW_DECLARATIONS = SynthesisOption.createCheckOption("sccharts.declarations.showDeclarations", "Declarations", true).
        setCategory(GeneralSynthesisOptions::APPEARANCE)

    override getDisplayedSynthesisOptions() {
        return newLinkedList(SHOW_DECLARATIONS)
    }

    override processState(State state, KNode node) {
        if (!SHOW_DECLARATIONS.booleanValue) {
            val container = node.contentContainer
            val declarations = container?.getProperty(StateStyles.DECLARATIONS_CONTAINER)

            if (declarations !== null) {
                container.children.remove(declarations)
            }
        }
    }

    override processRegion(Region region, KNode node) {
        if (region instanceof Region && !region.declarations.empty && !SHOW_DECLARATIONS.booleanValue) {
            val parent = node.regionExtendedContainer
            val declarations = parent?.getProperty(ControlflowRegionStyles.DECLARATIONS_CONTAINER)
            if (declarations !== null) {
                val container = declarations.eContainer as KContainerRendering
                // Hide declarations
                if (declarations !== null && container !== null) {
                    container.children.remove(declarations)
                }
            }
        }
    }
}