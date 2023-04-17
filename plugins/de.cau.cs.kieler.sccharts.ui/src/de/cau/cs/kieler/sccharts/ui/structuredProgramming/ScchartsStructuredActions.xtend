/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.ui.structuredProgramming

import de.cau.cs.kieler.klighd.lsp.structuredProgramming.IStructuredActions

/**
 * @author felixj
 *
 */
class ScchartsStructuredActions implements IStructuredActions{
   
    override getKindAndActions() {
        return newHashMap(
            DeleteAction.KIND -> DeleteAction,
            RenameStateAction.KIND -> RenameStateAction,
            AddSuccessorStateAction.KIND -> AddSuccessorStateAction,
            AddHierarchicalStateAction.KIND -> AddHierarchicalStateAction,
            ChangeTargetStateAction.KIND -> ChangeTargetStateAction,
            ChangeSourceStateAction.KIND -> ChangeSourceStateAction,
            ChangeTriggerEffectAction.KIND -> ChangeTriggerEffectAction,
            RenameRegionAction.KIND -> RenameRegionAction,
            AddConcurrentRegionAction.KIND -> AddConcurrentRegionAction,
            ChangeToAbortingTransitionAction.KIND -> ChangeToAbortingTransitionAction,
            ChangeToTerminatingTransitionAction.KIND -> ChangeToTerminatingTransitionAction,
            ChangeToWeakTransitionAction.KIND -> ChangeToWeakTransitionAction,
            AddTransitionAction.KIND -> AddTransitionAction,
            ToggleFinalStateAction.KIND -> ToggleFinalStateAction,
            MakeInitialStateAction.KIND -> MakeInitialStateAction,
            EditSemanticDeclarationAction.KIND -> EditSemanticDeclarationAction,
            ChangePriorityAction.KIND -> ChangePriorityAction
        )
    }
}