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
import de.cau.cs.kieler.klighd.krendering.KGridPlacement
import de.cau.cs.kieler.klighd.krendering.KRectangle
import de.cau.cs.kieler.klighd.krendering.KText
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import de.cau.cs.kieler.klighd.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.ui.synthesis.GeneralSynthesisOptions
import de.cau.cs.kieler.sccharts.ui.synthesis.styles.StateStyles

/**
 * Shows or hides state actions.
 * 
 * @author als
 * @kieler.design 2015-08-13 proposed
 * @kieler.rating 2015-08-13 proposed yellow
 * 
 */
@ViewSynthesisShared
class StateActionsHook extends SynthesisHook {

    @Inject
    extension StateStyles
    @Inject
    extension KRenderingExtensions
    @Inject
    extension KContainerRenderingExtensions

    /** Action ID */
    public static final String ID = "de.cau.cs.kieler.sccharts.ui.synthesis.hooks.StateActionsHook"
    /** The related synthesis option */
    public static final SynthesisOption SHOW_STATE_ACTIONS = SynthesisOption.createCheckOption(StateActionsHook, "State Actions", true).
    	setCategory(GeneralSynthesisOptions::APPEARANCE)
    /** The to break lines in effect chain */
    public static final SynthesisOption LINEBREAKS_IN_EFFECTS = SynthesisOption.createCheckOption(StateActionsHook, "Linebreaks in Actions", false).
        setCategory(GeneralSynthesisOptions::APPEARANCE)

    override getDisplayedSynthesisOptions() {
        return newLinkedList(SHOW_STATE_ACTIONS, LINEBREAKS_IN_EFFECTS)
    }

    override processState(State state, KNode node) {
        val container = node.contentContainer
        val actions = container?.getProperty(StateStyles::ACTIONS_CONTAINER)

        if (actions !== null) {
            // Break Effect chains
            if (LINEBREAKS_IN_EFFECTS.booleanValue) {
                for (actionContainer : actions.children.filter(KRectangle).map[children.filter(KRectangle).head].filterNull) {
                    val collumns = (actionContainer.childPlacement as KGridPlacement).numColumns
                    val kText = actionContainer.children.filter(KText).last
                    val action = state.actions.findFirst[actionContainer.isAssociatedWith(it)]
                    if (GeneralSynthesisOptions.SHOW_USER_LABELS.booleanValue && action !== null && !action.label.nullOrEmpty) {
                        // Split labels at newlines
                        val lines = kText.text.split("\n")
                        
                        val firstRowWrapper = actionContainer.addRectangle() => [
                            invisible = true
                            horizontalAlignment = H_LEFT
                        ]
                        // Double wrap to enforce stacked left alignment
                        val firstRow = firstRowWrapper.addRectangle() => [
                            invisible = true
                            setPointPlacementData(createKPosition(LEFT, 0, 0, TOP, 0, 0), H_LEFT, V_TOP, 0, 0, 0, 0);
                        ]
                        // Put first row elements into new container
                        firstRow.children += actionContainer.children.filter[ c | c !== firstRowWrapper].toList()
                        firstRow.gridPlacement = collumns;
                        (actionContainer.childPlacement as KGridPlacement).numColumns = 1;
                        
                        if (lines.length > 1) {
                            // Adjust first line
                            kText => [
                                text = lines.head 
                                horizontalAlignment = H_LEFT
                            ]
                            for (var i = 1; i < lines.length; i++) {
                                // Add separate line
                                actionContainer.addText(lines.get(i)) => [
                                    horizontalAlignment = H_LEFT
                                ]
                            }
                        }
                    } else {
                        // Split effect lines
                        val lines = kText.text.split(";")
                        if (lines.length > 1) {
                            kText.text = lines.head.trim + ";"
                            for (var i = 1; i < lines.length; i++) {
                                // Create invisible placeholders to align lines
                                for (var j = 0 ; j < (collumns - 1) ; j++) {
                                    actionContainer.addRectangle => [
                                        invisible = true
                                    ]
                                }
                                // Add separate line
                                actionContainer.addText(lines.get(i).trim + if (i < (lines.length - 1)) ";" else "") => [
                                    horizontalAlignment = H_LEFT
                                ]
                            }
                        }
                    }
                }
            }
            // Hide actions
            if (!SHOW_STATE_ACTIONS.booleanValue) {
                container.children.remove(actions)
            }
        }
    }
}