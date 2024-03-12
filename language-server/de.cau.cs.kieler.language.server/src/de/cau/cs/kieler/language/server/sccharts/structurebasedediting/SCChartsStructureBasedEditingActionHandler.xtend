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

import com.google.inject.Inject
import de.cau.cs.kieler.klighd.lsp.AbstractActionHandler
import de.cau.cs.kieler.klighd.lsp.KGraphDiagramServer
import org.eclipse.sprotty.Action

class SCChartsStructureBasedEditingActionHandler extends AbstractActionHandler {

    @Inject
    SCChartsStructureBasedEditingLanguageServerExtension lsExtension

    new() {
        this.supportedMessages = newHashMap(
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

    override handle(Action action, String clientId, KGraphDiagramServer server) {

        if (action.kind == DeleteAction.KIND) {
            synchronized (server.modelLock) {
                lsExtension.delete(action as DeleteAction, clientId)
            }
        } else if (action.kind == RenameStateAction.KIND) {
            synchronized (server.modelLock) {
                lsExtension.rename(action, clientId)
            }
        } else if (action.kind == AddSuccessorStateAction.KIND) {
            synchronized (server.modelLock) {
                lsExtension.addSuccessorState(action as AddSuccessorStateAction, clientId)
            }
        } else if (action.kind == AddHierarchicalStateAction.KIND) {
            synchronized (server.modelLock) {
                lsExtension.addHirachicalNode(action as AddHierarchicalStateAction, clientId)
            }
        } else if (action.kind == ChangeTargetStateAction.KIND) {
            synchronized (server.modelLock) {
                lsExtension.changeDestination(action as ChangeTargetStateAction, clientId)
            }
        } else if (action.kind == ChangeSourceStateAction.KIND) {
            synchronized (server.modelLock) {
                lsExtension.changeSource(action as ChangeSourceStateAction, clientId)
            }
        } else if (action.kind == ChangeTriggerEffectAction.KIND) {
            synchronized (server.modelLock) {
                lsExtension.changeIO(action as ChangeTriggerEffectAction, clientId)
            }
        } else if (action.kind == RenameRegionAction.KIND) {
            synchronized (server.modelLock) {
                lsExtension.rename(action, clientId)
            }
        } else if (action.kind == AddConcurrentRegionAction.KIND) {
            synchronized (server.modelLock) {
                lsExtension.addConcurrentRegion(action as AddConcurrentRegionAction, clientId)
            }
        } else if (action.kind == ChangeToAbortingTransitionAction.KIND) {
            synchronized (server.modelLock) {
                lsExtension.changeToAbort(action as ChangeToAbortingTransitionAction, clientId)
            }
        } else if (action.kind == ChangeToTerminatingTransitionAction.KIND) {
            synchronized (server.modelLock) {
                lsExtension.changeToTerminating(action as ChangeToTerminatingTransitionAction, clientId)
            }
        } else if (action.kind == ChangeToWeakTransitionAction.KIND) {
            synchronized (server.modelLock) {
                lsExtension.changeToWeak(action as ChangeToWeakTransitionAction, clientId)
            }
        } else if (action.kind == AddTransitionAction.KIND) {
            synchronized (server.modelLock) {
                lsExtension.addNewTransition(action as AddTransitionAction, clientId)
            }
        } else if (action.kind == ToggleFinalStateAction.KIND) {
            synchronized (server.modelLock) {
                lsExtension.toggleFinalState(action as ToggleFinalStateAction, clientId)
            }
        } else if (action.kind == MakeInitialStateAction.KIND) {
            synchronized (server.modelLock) {
                lsExtension.makeInitialState(action as MakeInitialStateAction, clientId)
            }
        } else if (action.kind == EditSemanticDeclarationAction.KIND) {
            synchronized (server.modelLock) {
                lsExtension.editSemanticDeclaration(action as EditSemanticDeclarationAction, clientId)
            }
        } else if (action.kind == ChangePriorityAction.KIND) {
            synchronized (server.modelLock) {
                lsExtension.changeEdgePriority(action as ChangePriorityAction, clientId)
            }
        } else {
            throw new IllegalArgumentException("Action " + action.kind + " not supported by handler " +
                this.class.simpleName)
        }
    }
}