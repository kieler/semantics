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
import de.cau.cs.kieler.core.annotations.Annotatable
import de.cau.cs.kieler.core.kgraph.KEdge
import de.cau.cs.kieler.core.kgraph.KNode
import de.cau.cs.kieler.core.krendering.KContainerRendering
import de.cau.cs.kieler.core.krendering.ViewSynthesisShared
import de.cau.cs.kieler.kiml.klayoutdata.KLayoutData
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.klighd.internal.util.KlighdInternalProperties
import de.cau.cs.kieler.klighd.util.KlighdProperties
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.klighd.hooks.SynthesisHook
import de.cau.cs.kieler.sccharts.klighd.synthesis.styles.ControlflowRegionStyles
import de.cau.cs.kieler.sccharts.klighd.synthesis.styles.StateStyles

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
class HideAnnotationHook extends SynthesisHook {

    @Inject
    extension StateStyles

    /** Keyword for the hide annotation */
    public static final String HIDE_ANNOTATION_KEYWORD = "hide";

    /** The related synthesis option */
    public static final SynthesisOption SHOW_HIDDEN_ELEMENTS = SynthesisOption.createCheckOption("Show hidden Elements",
        false);

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
                    if (declarationsContainer != null) {
                        for (declaration : state.declarations) {
                            if (declaration.hasHideAnnotation) {
                                val declarationLabel = declarationsContainer.children.findFirst [
                                    getProperty(KlighdInternalProperties.MODEL_ELEMEMT) == declaration
                                ];
                                if (declarationLabel != null) {
                                    declarationsContainer.children.remove(declarationLabel);
                                }
                            }
                        }
                    }
                }
                // Remove hidden actions
                if (!state.localActions.empty) {
                    val actionsContainer = parent?.getProperty(StateStyles.ACTIONS_CONTAINER);
                    if (actionsContainer != null) {
                        for (action : state.localActions) {
                            if (action.hasHideAnnotation) {
                                val actionLabel = actionsContainer.children.findFirst [
                                    getProperty(KlighdInternalProperties.MODEL_ELEMEMT) == action
                                ];
                                if (actionLabel != null) {
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
                                getData(KLayoutData).getProperty(KlighdInternalProperties.MODEL_ELEMEMT) == region
                            ];
                            if (regionNode != null) {
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
            if (declarationsContainer != null) {
                for (declaration : region.declarations) {
                    if (declaration.hasHideAnnotation) {
                        val declarationLabel = declarationsContainer.children.findFirst [
                            getProperty(KlighdInternalProperties.MODEL_ELEMEMT) == declaration
                        ];
                        if (declarationLabel != null) {
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
            it.name.toLowerCase == HIDE_ANNOTATION_KEYWORD // Case insensitive!
        ].empty;
    }

    /** 
     * Retrieves the extended container for the region.
     */
    private def getRegionExtendedContainer(KNode node) {
        return node.data.filter(KContainerRendering).filter [
            getProperty(KlighdProperties.EXPANDED_RENDERING)
        ].head;
    }
}