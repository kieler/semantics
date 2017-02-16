/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.klighd.synthesis.hooks

import com.google.inject.Inject
import de.cau.cs.kieler.annotations.Annotatable
import org.eclipse.elk.graph.KNode
import de.cau.cs.kieler.klighd.krendering.KContainerRendering
import de.cau.cs.kieler.klighd.krendering.KText
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsExtension
import de.cau.cs.kieler.sccharts.klighd.hooks.SynthesisHook
import de.cau.cs.kieler.sccharts.klighd.synthesis.styles.StateStyles
import de.cau.cs.kieler.sccharts.klighd.synthesis.GeneralSynthesisOptions

/**
 * Removes model elements marked with the annotation hide.
 * 
 * @author als
 * @kieler.design 2015-11-4 proposed
 * @kieler.rating 2015-11-4 proposed yellow
 * 
 */
@ViewSynthesisShared
class HideEntryKeywordHook extends SynthesisHook {

    @Inject
    extension StateStyles

    @Inject
    extension SCChartsExtension

    /** Keyword for the hide annotation */
    public static final String HIDE_ANNOTATION_KEYWORD = "CbasedSCChart";
    
    /** The related synthesis option */
    public static final SynthesisOption HIDE_ENTRY = SynthesisOption.createCheckOption("Hide Entry Keyword",
        true).setCategory(GeneralSynthesisOptions::APPEARANCE);

    override getDisplayedSynthesisOptions() {
        return newLinkedList(HIDE_ENTRY);
    }
    
    override processState(State state, KNode node) {
        
        if (HIDE_ENTRY.booleanValue) { // && state.getRootState.hasHideAnnotation) {
            if (!state.localActions.empty &&
                state.localActions.size == state.entryActions.size) {
                // Remove entry actions
                val parent = node.contentContainer;
                val actionsContainer = parent?.getProperty(StateStyles.ACTIONS_CONTAINER);
                if (actionsContainer != null) {
                    for (action : state.localActions) {
                        val actionLabel = actionsContainer.children.findFirst [
                            isAssociatedWith(action)
                        ] as KContainerRendering
                        if (actionLabel != null) {
                            val componentContainer = actionLabel.children.head as KContainerRendering
                            componentContainer.children.remove(componentContainer.children.head)
                            val text = componentContainer.children.head as KText
                            if (text.text.startsWith("/")) {
                                text.text = text.text.substring(1)
                            }
                        }
                    }
                }
            }
        }
    }

    /** Checks if the given element has the hide annotation */
    private def hasHideAnnotation(Annotatable annotatable) {
        return !annotatable.annotations.nullOrEmpty && !annotatable.annotations.filter [
            it.name?.toLowerCase == HIDE_ANNOTATION_KEYWORD // Case insensitive!
        ].empty;
    }

}
