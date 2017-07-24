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
package de.cau.cs.kieler.sccharts.legacy.klighd.synthesis.hooks

import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.klighd.kgraph.KEdge
import de.cau.cs.kieler.klighd.kgraph.KLabel
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import de.cau.cs.kieler.sccharts.legacy.sccharts.Scope
import de.cau.cs.kieler.sccharts.legacy.sccharts.Transition
import de.cau.cs.kieler.sccharts.legacy.klighd.hooks.SynthesisActionHook
import de.cau.cs.kieler.sccharts.legacy.klighd.synthesis.GeneralSynthesisOptions
import de.cau.cs.kieler.sccharts.legacy.klighd.synthesis.labels.LabelFocusSelectionListener
import de.cau.cs.kieler.sccharts.legacy.klighd.synthesis.labels.LabelShorteningStrategies
import org.eclipse.elk.core.labels.LabelManagementOptions

import static extension de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses.*
import static extension de.cau.cs.kieler.klighd.util.ModelingUtil.*
/**
 * Shows or hides or shortens transition labels.
 * 
 * @author als
 * @kieler.design 2015-08-13 proposed
 * @kieler.rating 2015-08-13 proposed yellow
 * 
 */
@ViewSynthesisShared
class LegacyLabelShorteningHook extends SynthesisActionHook {

    /** Action ID */
    public static final String ID = "de.cau.cs.kieler.sccharts.legacy.klighd.synthesis.hooks.LegacyLabelShorteningHook";
    
    /** The sub category for the label management */
    public static final SynthesisOption LABEL_MANAGEMENT_CATEGORY = SynthesisOption.createCategory("Label Management", false).
        setCategory(GeneralSynthesisOptions::APPEARANCE)
    /** The synthesis option to generally hide/show labels */
    public static final SynthesisOption HIDE_LABELS = SynthesisOption.createCheckOption("Hide Transition Labels",
        false).setCategory(LABEL_MANAGEMENT_CATEGORY).setUpdateAction(LegacyLabelShorteningHook.ID); // Register this action as updater
    /** The synthesis option to shorten labels */
    public static val SynthesisOption SHORTEN_LABEL_STRATEGY = SynthesisOption::createChoiceOption("Strategy",
        newLinkedList(
            LabelShorteningStrategies.NO,
            LabelShorteningStrategies.TRUNCATE,
            LabelShorteningStrategies.SOFT_WRAPPING,
            LabelShorteningStrategies.PRIORITIES
        ), LabelShorteningStrategies.NO).setCategory(LABEL_MANAGEMENT_CATEGORY).
        setUpdateAction(LegacyLabelShorteningHook.ID) // Register this action as updater
    /** The synthesis option for fixed shorten labels value */
    public static val SynthesisOption SHORTEN_LABEL_WIDTH = SynthesisOption::createRangeOption("Shortening Width",
        0, 1000, 10, 200).setCategory(LABEL_MANAGEMENT_CATEGORY).
        setUpdateAction(LegacyLabelShorteningHook.ID) // Register this action as updater
    /** The listener for handling label focusing */
    private static val LabelFocusSelectionListener labelFocusSelectionListener = new LabelFocusSelectionListener();

    override getDisplayedSynthesisOptions() {
        return newLinkedList(LABEL_MANAGEMENT_CATEGORY, SHORTEN_LABEL_STRATEGY, SHORTEN_LABEL_WIDTH);
        // HIDE_LABELS currently disabled because label shortening is better
    }

    override start(Scope scope, KNode node) {
        // activate label focusing
        // FIXME this does not work for nested (side-by-side) synthesis because view is null
        usedContext.viewer?.contextViewer?.addSelectionChangedListener(labelFocusSelectionListener);
        // configure
        node.configureLabelManagement();
    }

    override processTransition(Transition transition, KEdge edge) {
        if (HIDE_LABELS.booleanValue) {
            edge.eContents.filter(KLabel).forEach[initiallyHide]
        }
    }

    override executeAction(KNode rootNode) {
        val viewer = usedContext.viewer

        if (HIDE_LABELS.booleanValue) {
            rootNode.eAllContentsOfType(KNode, KEdge, KLabel).filter(KLabel).forEach[viewer.hide(it)]
        } else {
            rootNode.eAllContentsOfType(KNode, KEdge, KLabel).filter(KLabel).forEach[viewer.show(it)]
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