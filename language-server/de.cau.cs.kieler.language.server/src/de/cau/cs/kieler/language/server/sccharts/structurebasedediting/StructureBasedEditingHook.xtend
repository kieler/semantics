/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2024 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.language.server.sccharts.structurebasedediting

import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import de.cau.cs.kieler.klighd.structurebasedediting.StructureBasedEditingOptions
import de.cau.cs.kieler.klighd.util.KlighdProperties
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.sccharts.ui.synthesis.filtering.SCChartsSemanticFilterTags
import de.cau.cs.kieler.sccharts.ui.synthesis.hooks.SynthesisHook
import java.util.HashMap

/**
 * Class for adding a property to the root state of a scchart diagram
 */
@ViewSynthesisShared
class StructureBasedEditingHook extends SynthesisHook {

    override finish(Scope scope, KNode node) {
        val map = new HashMap()

        // all states support the following actions
        map.put(SCChartsSemanticFilterTags.STATE, #[
            EditSemanticDeclarationAction.getMsg(),
            RenameStateAction.getMsg(),
            AddSuccessorStateAction.getMsg(),
            AddHierarchicalStateAction.getMsg(),
            AddTransitionAction.getMsg(),
            ToggleFinalStateAction.getMsg(),
            DeleteAction.getMsg()
        ])

        // Non initial states support one more action
        map.put(SCChartsSemanticFilterTags.NOT_INITIAL_STATE, #[
            MakeInitialStateAction.getMsg()
        ])

        // Transitions supported actions
        map.put(SCChartsSemanticFilterTags.TRANSITION, #[
            ChangeTargetStateAction.getMsg(),
            ChangeSourceStateAction.getMsg(),
            ChangeTriggerEffectAction.getMsg(),
            DeleteAction.getMsg(),
            ChangePriorityAction.getMsg()
        ])
        // Depending on the type of transition we can change it to the other two options
        map.put(SCChartsSemanticFilterTags.WEAK_TRANSITION, #[
            ChangeToTerminatingTransitionAction.getMsg(),
            ChangeToAbortingTransitionAction.getMsg()
        ])
        map.put(SCChartsSemanticFilterTags.ABORTING_TRANSITION, #[
            ChangeToWeakTransitionAction.getMsg(),
            ChangeToTerminatingTransitionAction.getMsg()
        ])
        map.put(SCChartsSemanticFilterTags.TERMINATING_TRANSITION, #[
            ChangeToWeakTransitionAction.getMsg(),
            ChangeToAbortingTransitionAction.getMsg()
        ])

        // Actions supported by regions
        map.put(SCChartsSemanticFilterTags.REGION, #[
            RenameRegionAction.getMsg(),
            AddConcurrentRegionAction.getMsg(),
            DeleteAction.getMsg()
        ])

        val options = new StructureBasedEditingOptions(map)
        // sets the property for the root node
        node.setProperty(KlighdProperties.STRUCTURED_EDITING, options)
    }
}