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
import de.cau.cs.kieler.klighd.krendering.KGridPlacement
import de.cau.cs.kieler.klighd.krendering.KRectangle
import de.cau.cs.kieler.klighd.krendering.KRenderingFactory
import de.cau.cs.kieler.klighd.krendering.KText
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import de.cau.cs.kieler.klighd.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.ui.synthesis.hooks.SynthesisActionHook
import de.cau.cs.kieler.sccharts.ui.synthesis.GeneralSynthesisOptions
import de.cau.cs.kieler.sccharts.ui.synthesis.styles.StateStyles
import org.eclipse.elk.graph.properties.IProperty
import org.eclipse.elk.graph.properties.Property

import static extension de.cau.cs.kieler.klighd.util.ModelingUtil.*

/**
 * Shows or hides state actions.
 * 
 * @author als
 * @kieler.design 2015-08-13 proposed
 * @kieler.rating 2015-08-13 proposed yellow
 * 
 */
@ViewSynthesisShared
class StateActionsHook extends SynthesisActionHook {

    @Inject
    extension StateStyles

    @Inject
    extension KRenderingExtensions
    @Inject
    extension KContainerRenderingExtensions
    extension KRenderingFactory = KRenderingFactory::eINSTANCE

    /** Action ID */
    public static final String ID = "de.cau.cs.kieler.sccharts.ui.synthesis.hooks.StateActionsHook"
    /** The related synthesis option */
    public static final SynthesisOption SHOW_STATE_ACTIONS = SynthesisOption.createCheckOption("State actions", true).
    	setCategory(GeneralSynthesisOptions::APPEARANCE).setUpdateAction(StateActionsHook.ID); // Register this action as updater
    /** The to break lines in effect chain */
    public static final SynthesisOption LINEBREAKS_IN_EFFECTS = SynthesisOption.createCheckOption("Linebreaks between action effects", false).
        setCategory(GeneralSynthesisOptions::APPEARANCE)
    /** Property to save position of the container */
    private static final IProperty<Integer> INDEX = new Property<Integer>(
        "de.cau.cs.kieler.sccharts.ui.synthesis.hooks.actions.index", 0)

    override getDisplayedSynthesisOptions() {
        return newLinkedList(SHOW_STATE_ACTIONS, LINEBREAKS_IN_EFFECTS)
    }

    override processState(State state, KNode node) {
        if (!state.actions.empty) {
            val container = node.contentContainer
            val actions = container?.getProperty(StateStyles::ACTIONS_CONTAINER)

            if (actions != null) {
                // Break Effect chains
                if (LINEBREAKS_IN_EFFECTS.booleanValue) {
                    for (actionContainer : actions.children.filter(KRectangle).map[children.filter(KRectangle).head].filterNull) {
                        val collumns = (actionContainer.childPlacement as KGridPlacement).numColumns
                        var kText = actionContainer.children.filter(KText).last
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
                // Hide actions
                if (!SHOW_STATE_ACTIONS.booleanValue) {
                    val idx = container.children.indexOf(actions)
                    actions.setProperty(INDEX, idx)
                    container.children.remove(actions)
                    container.addInvisiblePlaceholder(idx)
                }
            }
        }
    }

    override executeAction(KNode rootNode) {
        for (KNode node : rootNode.eAllContentsOfType(KNode).toIterable) {
            if (usedContext.getSourceElement(node) instanceof State) {
                val state = usedContext.getSourceElement(node) as State
                val container = node.contentContainer
                val actions = container?.getProperty(StateStyles::ACTIONS_CONTAINER)

                // Show or hide actions
                if (actions != null) {
                    if (SHOW_STATE_ACTIONS.booleanValue && !state.actions.empty) {
                        // Insert actions in correct position
                        val pos = actions.getProperty(INDEX)
                        container.children.remove(pos)
                        container.children.add(pos, actions)
                    } else {
                        val idx = container.children.indexOf(actions)
                        actions.setProperty(INDEX, idx)
                        container.children.remove(actions)
                        container.addInvisiblePlaceholder(idx)
                    }
                }
            }
        }
        return ActionResult.createResult(true)
    }

    /** 
     * Adds an invisible places holder to the given container in the specific position.
     */
    private def addInvisiblePlaceholder(KContainerRendering container, int index) {
        val rendering = createKRectangle() => [
            invisible = true
        ]
        container.children.add(index, rendering)
    }
}