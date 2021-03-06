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
package de.cau.cs.kieler.sccharts.legacy.klighd.synthesis.hooks

import com.google.inject.Inject
import de.cau.cs.kieler.sccharts.legacy.annotations.Annotatable
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.klighd.kgraph.KEdge
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import de.cau.cs.kieler.sccharts.legacy.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.legacy.sccharts.Region
import de.cau.cs.kieler.sccharts.legacy.sccharts.State
import de.cau.cs.kieler.sccharts.legacy.sccharts.Transition
import de.cau.cs.kieler.sccharts.legacy.klighd.hooks.SynthesisHook
import de.cau.cs.kieler.sccharts.legacy.klighd.synthesis.GeneralSynthesisOptions
import de.cau.cs.kieler.sccharts.legacy.klighd.synthesis.styles.ControlflowRegionStyles
import de.cau.cs.kieler.sccharts.legacy.klighd.synthesis.styles.StateStyles

import static extension de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses.*
/**
 * Removes model elements marked with the annotation hide.
 * 
 * @author als
 * @kieler.design 2015-11-4 proposed
 * @kieler.rating 2015-11-4 proposed yellow
 * 
 */
@ViewSynthesisShared
class LegacyHideAnnotationHook extends SynthesisHook {

    @Inject
    extension StateStyles
    
    @Inject
    extension ControlflowRegionStyles

    /** Keyword for the hide annotation */
    public static final String HIDE_ANNOTATION_KEYWORD = "hide";

    /** The related synthesis option */
    public static final SynthesisOption SHOW_HIDDEN_ELEMENTS = SynthesisOption.createCheckOption("Show hidden Elements",
        false).setCategory(GeneralSynthesisOptions::APPEARANCE);

    override getDisplayedSynthesisOptions() {
        return newLinkedList(SHOW_HIDDEN_ELEMENTS);
    }

    override processState(State state, KNode node) {
        if (!SHOW_HIDDEN_ELEMENTS.booleanValue) {
            if (state.hasHideAnnotation) {
                node.initiallyHide;
            } else if (!state.declarations.empty || !state.localActions.empty || !state.regions.empty) { // Remove content
                // Remove hidden declarations
                val parent = node.contentContainer;
                if (!state.declarations.empty) {
                    val declarationsContainer = parent?.getProperty(StateStyles.DECLARATIONS_CONTAINER);
                    if (declarationsContainer !== null) {
                        for (declaration : state.declarations) {
                            if (declaration.hasHideAnnotation) {
                                val declarationLabel = declarationsContainer.children.findFirst [
                                    isAssociatedWith(declaration)
                                ];
                                if (declarationLabel !== null) {
                                    declarationsContainer.children.remove(declarationLabel);
                                }
                            }
                        }
                    }
                }
                // Remove hidden actions
                if (!state.localActions.empty) {
                    val actionsContainer = parent?.getProperty(StateStyles.ACTIONS_CONTAINER);
                    if (actionsContainer !== null) {
                        for (action : state.localActions) {
                            if (action.hasHideAnnotation) {
                                val actionLabel = actionsContainer.children.findFirst [
                                    isAssociatedWith(action)
                                ];
                                if (actionLabel !== null) {
                                    actionsContainer.children.remove(actionLabel);
                                }
                            }
                        }
                    }
                }
                // Remove hidden regions
                if (!state.regions.empty) {
                    for (region : state.regions) {
                        if (region.hasHideAnnotation) {
                            val regionNode = node.children.findFirst [
                                isAssociatedWith(region)
                            ];
                            if (regionNode !== null) {
                                regionNode.parent = null;
                            }
                        }
                    }
                }
            }
        }
    }
    
    override processRegion(Region region, KNode node) {
        if (!SHOW_HIDDEN_ELEMENTS.booleanValue && region instanceof ControlflowRegion && !region.declarations.empty) {
            // Remove hidden declarations
            val parent = node.regionExtendedContainer
            val declarationsContainer = parent?.getProperty(ControlflowRegionStyles.DECLARATIONS_CONTAINER);
            if (declarationsContainer !== null) {
                for (declaration : region.declarations) {
                    if (declaration.hasHideAnnotation) {
                        val declarationLabel = declarationsContainer.children.findFirst [
                            isAssociatedWith(declaration)
                        ];
                        if (declarationLabel !== null) {
                            declarationsContainer.children.remove(declarationLabel);
                        }
                    }
                }
            }
        }
    }

    override processTransition(Transition transition, KEdge edge) {
        if (!SHOW_HIDDEN_ELEMENTS.booleanValue) {
            if (transition.hasHideAnnotation) {
                edge.initiallyHide;
            }
        }
    }

    /** Checks if the given eleemtent has the hide annotation */
    private def hasHideAnnotation(Annotatable annotatable) {
        return !annotatable.annotations.nullOrEmpty && !annotatable.annotations.filter [
            it.name?.toLowerCase == HIDE_ANNOTATION_KEYWORD // Case insensitive!
        ].empty;
    }

}