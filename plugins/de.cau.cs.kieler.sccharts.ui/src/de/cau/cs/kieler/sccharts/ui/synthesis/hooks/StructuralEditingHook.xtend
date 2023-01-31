/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2022 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.ui.synthesis.hooks

import java.util.HashMap
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import de.cau.cs.kieler.klighd.util.KlighdProperties
import de.cau.cs.kieler.klighd.structuredEditMsg.StructuredEditOptions
import de.cau.cs.kieler.klighd.lsp.structuredProgramming.sccharts.DeleteAction;
import de.cau.cs.kieler.klighd.lsp.structuredProgramming.sccharts.RenameStateAction;
import de.cau.cs.kieler.klighd.lsp.structuredProgramming.sccharts.AddHierarchicalStateAction;
import de.cau.cs.kieler.klighd.lsp.structuredProgramming.sccharts.AddSuccessorStateAction;
import de.cau.cs.kieler.klighd.lsp.structuredProgramming.sccharts.ChangeTriggerEffectAction;
import de.cau.cs.kieler.klighd.lsp.structuredProgramming.sccharts.RenameRegionAction;
import de.cau.cs.kieler.klighd.lsp.structuredProgramming.sccharts.AddConcurrentRegionAction;
import de.cau.cs.kieler.klighd.lsp.structuredProgramming.sccharts.ChangeTargetStateAction
import de.cau.cs.kieler.klighd.lsp.structuredProgramming.sccharts.ChangeSourceStateAction
import de.cau.cs.kieler.klighd.lsp.structuredProgramming.sccharts.ChangeToAbortingTransitionAction
import de.cau.cs.kieler.klighd.lsp.structuredProgramming.sccharts.ChangeToTerminatingTransitionAction
import de.cau.cs.kieler.klighd.lsp.structuredProgramming.sccharts.ChangeToWeakTransitionAction
import de.cau.cs.kieler.klighd.lsp.structuredProgramming.sccharts.ToggleFinalStateAction
import de.cau.cs.kieler.klighd.lsp.structuredProgramming.sccharts.AddTransitionAction
import de.cau.cs.kieler.klighd.lsp.structuredProgramming.sccharts.EditSemanticDeclarationAction



@ViewSynthesisShared
class StructuralEditingHook extends SynthesisHook {

    override finish(Scope scope, KNode node) {
        val map = new HashMap()

        map.put("simpleState,hierarchicalState", #[
            EditSemanticDeclarationAction.getMsg(),
            RenameStateAction.getMsg(),
            AddSuccessorStateAction.getMsg(),
            AddHierarchicalStateAction.getMsg(),
            AddTransitionAction.getMsg(),
            ToggleFinalStateAction.getMsg(),
            DeleteAction.getMsg()
        ])

        map.put("transition", #[
            ChangeTargetStateAction.getMsg(),
            ChangeSourceStateAction.getMsg(),
            ChangeTriggerEffectAction.getMsg(),
            ChangeToWeakTransitionAction.getMsg(),
            ChangeToTerminatingTransitionAction.getMsg(),
            ChangeToAbortingTransitionAction.getMsg(),
            DeleteAction.getMsg()
        ])

        map.put("controlflowRegion,dataflowRegion", #[
            RenameRegionAction.getMsg(),
            AddConcurrentRegionAction.getMsg(),
            DeleteAction.getMsg()
        ])

        val options = new StructuredEditOptions(map)

        node.setProperty(KlighdProperties.STRUCTURED_EDITING, options)
    }
}
