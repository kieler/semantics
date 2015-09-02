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
import de.cau.cs.kieler.core.krendering.KContainerRendering
import de.cau.cs.kieler.core.krendering.KRenderingFactory
import de.cau.cs.kieler.core.krendering.ViewSynthesisShared
import de.cau.cs.kieler.core.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.properties.Property
import de.cau.cs.kieler.klighd.IAction.ActionResult
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsExtension
import de.cau.cs.kieler.sccharts.klighd.hooks.SCChartsSynthesisActionHook
import de.cau.cs.kieler.sccharts.klighd.synthesis.styles.StateStyles

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
class StateActionsHook extends SCChartsSynthesisActionHook {

    @Inject
    extension StateStyles

    @Inject
    extension SCChartsExtension

    @Inject
    extension KRenderingExtensions
    extension KRenderingFactory = KRenderingFactory::eINSTANCE

    /** Action ID */
    public static final String ID = "de.cau.cs.kieler.sccharts.klighd.synthesis.hooks.StateActionsHook";
    /** The related synthesis option */
    public static final SynthesisOption SHOW_STATE_ACTIONS = SynthesisOption.createCheckOption("State actions", true).
        setUpdateAction(StateActionsHook.ID); // Register this action as updater
    /** Property to save position of the container */
    private static final IProperty<Integer> INDEX = new Property<Integer>(
        "de.cau.cs.kieler.sccharts.klighd.synthesis.hooks.actions.index", 0);

    override getDisplayedSynthesisOptions() {
        return newLinkedList(SHOW_STATE_ACTIONS);
    }

    override postState(State state, KNode node) {
        if (!state.declarations.empty && !SHOW_STATE_ACTIONS.booleanValue) {
            val container = node.contentContainer;
            val actions = container?.getProperty(StateStyles::ACTIONS_CONTAINER);
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
        return ActionResult.createResult(true).dontAnimateLayout;
    }

    private def addInvisiblePlaceholder(KContainerRendering container, int index) {
        val rendering = createKRectangle() => [
            invisible = true;
        ]
        container.children.add(index, rendering);
    }
}