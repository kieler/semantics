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
import de.cau.cs.kieler.core.kgraph.KEdge
import de.cau.cs.kieler.core.kgraph.KLabel
import de.cau.cs.kieler.core.kgraph.KNode
import de.cau.cs.kieler.core.krendering.ViewSynthesisShared
import de.cau.cs.kieler.core.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.kiml.labels.LabelManagementOptions
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.klighd.hooks.SynthesisActionHook
import de.cau.cs.kieler.sccharts.klighd.layout.labels.LabelMetaFocusAction
import de.cau.cs.kieler.sccharts.klighd.layout.labels.LabelShorteningStrategies
import de.cau.cs.kieler.sccharts.klighd.synthesis.styles.ControlflowRegionStyles
import de.cau.cs.kieler.sccharts.klighd.synthesis.styles.StateStyles

import static extension de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses.*
import static extension de.cau.cs.kieler.klighd.util.ModelingUtil.*
import de.cau.cs.kieler.core.krendering.KContainerRendering

/**
 * Shows or hides or shortens transition labels.
 * 
 * @author als
 * @kieler.design 2015-08-13 proposed
 * @kieler.rating 2015-08-13 proposed yellow
 * 
 */
@ViewSynthesisShared
class LabelShorteningHook extends SynthesisActionHook {

    @Inject
    extension KRenderingExtensions

    @Inject
    extension StateStyles

    @Inject
    extension ControlflowRegionStyles

    /** Action ID */
    public static final String ID = "de.cau.cs.kieler.sccharts.klighd.synthesis.hooks.LabelShorteningHook";
    /** The synthesis option to generally hide/show labels */
    public static final SynthesisOption SHOW_LABELS = SynthesisOption.createCheckOption("Transition labels", true).
        setUpdateAction(LabelShorteningHook.ID); // Register this action as updater
    /** The synthesis option to shorten labels */
    private static val SynthesisOption SHORTEN_LABEL_STRATEGY = SynthesisOption::
        createChoiceOption("Shorten Labels", LabelShorteningStrategies.values, LabelShorteningStrategies.NO).
        setUpdateAction(LabelShorteningHook.ID) // Register this action as updater
    /** The synthesis option for fixed shorten labels value */
    private static val SynthesisOption SHORTEN_LABEL_WIDTH = SynthesisOption::createRangeOption("Shortening Width",
        0, 200, 2, 200).setUpdateAction(LabelShorteningHook.ID) // Register this action as updater

    override getDisplayedSynthesisOptions() {
        return newLinkedList(SHORTEN_LABEL_STRATEGY, SHORTEN_LABEL_WIDTH); // SHOW_LABELS
    }

    override start(Scope scope, KNode node) {
//        node.addSingleClickAction(LabelMetaFocusAction.ID)
        node.configureLabelManagement();
    }

    override processTransition(Transition transition, KEdge edge) {
        if (!SHOW_LABELS.booleanValue) {
            edge.eContents.filter(KLabel).forEach[initiallyHide]
        }
    }

    override processState(State state, KNode node) {
        if (!state.declarations.empty) {
            val container = node.contentContainer;
            val declarationsContainer = container?.getProperty(StateStyles.DECLARATIONS_CONTAINER);
            for (declaration : declarationsContainer.children.filter(KContainerRendering)) {
                (declaration.children.head as KContainerRendering).children.drop(1).head.addSingleClickAction(
                    LabelMetaFocusAction.ID);
            }
        }
    }

    override processRegion(Region region, KNode node) {
        if (region instanceof ControlflowRegion && !region.declarations.empty) {
            val parent = node.regionExtendedContainer
            val declarationsContainer = parent?.getProperty(ControlflowRegionStyles.DECLARATIONS_CONTAINER);
            for (declaration : declarationsContainer.children.filter(KContainerRendering)) {
                (declaration.children.head as KContainerRendering).children.drop(1).head.addSingleClickAction(
                    LabelMetaFocusAction.ID);
            }
        }
    }

    override executeAction(KNode rootNode) {
        val viewer = usedContext.viewer

        if (SHOW_LABELS.booleanValue) {
            rootNode.eAllContentsOfType(KNode, KEdge, KLabel).filter(KLabel).forEach[viewer.show(it)]
        } else {
            rootNode.eAllContentsOfType(KNode, KEdge, KLabel).filter(KLabel).forEach[viewer.hide(it)]
        }
        rootNode.configureLabelManagement();

        return ActionResult.createResult(true);
    }

    private def configureLabelManagement(KNode rootNode) {
        var labelManager = (SHORTEN_LABEL_STRATEGY.objectValue as LabelShorteningStrategies).getNewLabelManager();
        if (labelManager != null) {
            labelManager.fixTargetWidth(SHORTEN_LABEL_WIDTH.intValue)
        }
        rootNode.setLayoutOption(LabelManagementOptions.LABEL_MANAGER, labelManager)
    }
}