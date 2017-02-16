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
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.klighd.krendering.KContainerRendering
import de.cau.cs.kieler.klighd.krendering.KRenderingFactory
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.klighd.hooks.SynthesisActionHook
import de.cau.cs.kieler.sccharts.klighd.synthesis.GeneralSynthesisOptions
import de.cau.cs.kieler.sccharts.klighd.synthesis.styles.StateStyles
import org.eclipse.elk.graph.KNode
import org.eclipse.elk.graph.properties.IProperty
import org.eclipse.elk.graph.properties.Property

import static extension de.cau.cs.kieler.klighd.util.ModelingUtil.*
import de.cau.cs.kieler.sccharts.klighd.synthesis.SCChartsSynthesis
import de.cau.cs.kieler.sccharts.klighd.AbstractSCChartsSynthesis
import de.cau.cs.kieler.sccharts.Scope

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
    extension KRenderingFactory = KRenderingFactory::eINSTANCE

    /** Action ID */
    public static final String ID = "de.cau.cs.kieler.sccharts.klighd.synthesis.hooks.StateActionsHook";
    /** The related synthesis option */
    public static final SynthesisOption SHOW_STATE_ACTIONS = SynthesisOption.createCheckOption("State actions", true).
    	setCategory(GeneralSynthesisOptions::APPEARANCE).setUpdateAction(StateActionsHook.ID); // Register this action as updater
    /** Property to save position of the container */
    private static final IProperty<Integer> INDEX = new Property<Integer>(
        "de.cau.cs.kieler.sccharts.klighd.synthesis.hooks.actions.index", 0);

    override getDisplayedSynthesisOptions() {
        return newLinkedList(SHOW_STATE_ACTIONS);
    }

    override processState(State state, KNode node) {
        if (!state.declarations.empty && !SHOW_STATE_ACTIONS.booleanValue) {
            val container = node.contentContainer;
            val actions = container?.getProperty(StateStyles::ACTIONS_CONTAINER);

            // Hide actions
            if (actions != null) {
                val idx = container.children.indexOf(actions)
                actions.setProperty(INDEX, idx);
                container.children.remove(actions);
                container.addInvisiblePlaceholder(idx);
            }
        }
    }

    override executeAction(KNode rootNode) {
        for (KNode node : rootNode.eAllContentsOfType(KNode).toIterable) {
            if (usedContext.getSourceElement(node) instanceof State) {
                val state = usedContext.getSourceElement(node) as State;
                val container = node.contentContainer;
                val actions = container?.getProperty(StateStyles::ACTIONS_CONTAINER);

                // Show or hide actions
                if (actions != null) {
                    if (SHOW_STATE_ACTIONS.booleanValue && !state.declarations.empty) {
                        // Insert actions in correct position
                        val pos = actions.getProperty(INDEX);
                        container.children.remove(pos);
                        container.children.add(pos, actions);
                    } else {
                        val idx = container.children.indexOf(actions)
                        actions.setProperty(INDEX, idx);
                        container.children.remove(actions);
                        container.addInvisiblePlaceholder(idx);
                    }
                }
            }
        }
        return ActionResult.createResult(true);
    }

    /** 
     * Adds an invisible places holder to the given container in the specific position.
     */
    private def addInvisiblePlaceholder(KContainerRendering container, int index) {
        val rendering = createKRectangle() => [
            invisible = true;
        ]
        container.children.add(index, rendering);
    }
}