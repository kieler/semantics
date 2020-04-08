/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.ui.synthesis.hooks

import de.cau.cs.kieler.sccharts.ui.synthesis.styles.StateStyles
import de.cau.cs.kieler.sccharts.ui.synthesis.styles.ControlflowRegionStyles
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.sccharts.ui.synthesis.GeneralSynthesisOptions
import javax.inject.Inject
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.klighd.krendering.KContainerRendering
import de.cau.cs.kieler.kexpressions.impl.VariableDeclarationImpl
import de.cau.cs.kieler.kexpressions.VariableDeclaration

/**
 * @author kolja
 * 
 */
class LocalDeclarationsHook extends SynthesisHook {
    @Inject extension StateStyles
    @Inject extension ControlflowRegionStyles

    /** Action ID */
    public static final String ID = "de.cau.cs.kieler.sccharts.ui.synthesis.hooks.DeclarationsHook";
    /** The related synthesis option */
    public static final SynthesisOption SHOW_LOCAL_DECLARATIONS = SynthesisOption.createCheckOption("sccharts.localDeclarations.showLaocalDeclaration",
        "Local Declarations", true).setCategory(GeneralSynthesisOptions::APPEARANCE)

    override getDisplayedSynthesisOptions() {
        return newLinkedList(SHOW_LOCAL_DECLARATIONS)
    }

    override processState(State state, KNode node) {
        if (!SHOW_LOCAL_DECLARATIONS.booleanValue) {
            val container = node.contentContainer
            val declarations = container?.getProperty(StateStyles.DECLARATIONS_CONTAINER)

            if (declarations !== null) {
                for (c : declarations.children.immutableCopy) {
                    var VariableDeclaration dec = null
                    for (p : c.properties) {
                        if (p.value instanceof VariableDeclaration) {
                            dec = p.value as VariableDeclaration
                        }
                    }
                    if (dec !== null) {
                        if (!dec.input && !dec.output) {
                            declarations.children.remove(c)
                        }
                    }
                }
            }
        }
    }

    override processRegion(Region region, KNode node) {
        if (region instanceof Region && !region.declarations.empty && !SHOW_LOCAL_DECLARATIONS.booleanValue) {
            val parent = node.regionExtendedContainer
            val declarations = parent?.getProperty(ControlflowRegionStyles.DECLARATIONS_CONTAINER)
            if (declarations !== null) {
                // Hide declarations
                for (c : declarations.children.immutableCopy) {
                    var VariableDeclaration dec = null
                    for (p : c.properties) {
                        if (p.value instanceof VariableDeclaration) {
                            dec = p.value as VariableDeclaration
                        }
                    }
                    if (dec !== null) {
                        if (!dec.input && !dec.output) {
                            declarations.children.remove(c)
                        }
                    }
                }
            }
        }
    }
}
