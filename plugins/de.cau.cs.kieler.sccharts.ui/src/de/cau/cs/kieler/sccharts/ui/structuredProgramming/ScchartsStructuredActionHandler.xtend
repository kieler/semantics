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

import de.cau.cs.kieler.klighd.lsp.AbstractActionHandler
import de.cau.cs.kieler.klighd.lsp.IActionHandler
import de.cau.cs.kieler.klighd.lsp.KGraphDiagramServer
import org.eclipse.sprotty.Action

class ScchartsStructuredActionHandler extends AbstractActionHandler implements IActionHandler{
    
    //idealy injection should work however this for some reason gives back null
    //also every time this class is used in the KGraphDiagramServer a new instance is created meaning even after 
    //changing the extension to the correct one its not persistent unless its static
    //@inject
    //ScchartsStructuredProgrammingServerExtension extens
    static ScchartsStructuredProgrammingServerExtension extens = new ScchartsStructuredProgrammingServerExtension()
    
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
        if(extens ===null){
            println("extension not injected problems!")
            return
        }
        
        println(extens)
        
        if (action.kind == DeleteAction.KIND) {
            synchronized (server.modelLock) {
                extens.delete(action as DeleteAction, clientId, server)
            }
        } else if (action.kind == RenameStateAction.KIND) {
            synchronized (server.modelLock) {
                extens.rename(action, clientId, server)
            }
        } else if (action.kind == AddSuccessorStateAction.KIND) {
            synchronized (server.modelLock) {
                extens.addSuccessorState(action as AddSuccessorStateAction, clientId, server)
            }
        } else if (action.kind == AddHierarchicalStateAction.KIND) {
            synchronized (server.modelLock) {
                extens.addHirachicalNode(action as AddHierarchicalStateAction, clientId, server)
            }
        } else if (action.kind == ChangeTargetStateAction.KIND) {
            synchronized (server.modelLock) {
                extens.changeDestination(action as ChangeTargetStateAction, clientId, server)
            }
        } else if (action.kind == ChangeSourceStateAction.KIND) {
            synchronized (server.modelLock) {
                extens.changeSource(action as ChangeSourceStateAction, clientId, server)
            }
        } else if (action.kind == ChangeTriggerEffectAction.KIND) {
            synchronized (server.modelLock) {
                extens.changeIO(action as ChangeTriggerEffectAction, clientId, server)
            }
        } else if (action.kind == RenameRegionAction.KIND) {
            synchronized (server.modelLock) {
                extens.rename(action, clientId, server)
            }
        } else if (action.kind == AddConcurrentRegionAction.KIND) {
            synchronized (server.modelLock) {
                extens.addConcurrentRegion(action as AddConcurrentRegionAction, clientId, server)
            }
        } else if (action.kind == ChangeToAbortingTransitionAction.KIND) {
            synchronized (server.modelLock) {
                extens.changeToAbort(action as ChangeToAbortingTransitionAction, clientId, server)
            }
        } else if (action.kind == ChangeToTerminatingTransitionAction.KIND) {
            synchronized (server.modelLock) {
                extens.changeToTerminating(action as ChangeToTerminatingTransitionAction, clientId, server)
            }
        } else if (action.kind == ChangeToWeakTransitionAction.KIND) {
            synchronized (server.modelLock) {
                extens.changeToWeak(action as ChangeToWeakTransitionAction, clientId, server)
            }
        } else if (action.kind == AddTransitionAction.KIND) {
            synchronized (server.modelLock) {
                extens.addNewTransition(action as AddTransitionAction, clientId, server)
            }
        } else if (action.kind == ToggleFinalStateAction.KIND) {
            synchronized (server.modelLock) {
                extens.toggleFinalState(action as ToggleFinalStateAction, clientId, server)
            }
        } else if (action.kind == MakeInitialStateAction.KIND) {
            synchronized (server.modelLock) {
                extens.makeInitialState(action as MakeInitialStateAction, clientId, server)
            }
        } else if (action.kind == EditSemanticDeclarationAction.KIND) {
            synchronized (server.modelLock) {
                extens.editSemanticDeclaration(action as EditSemanticDeclarationAction, clientId, server)
            }
        } else if (action.kind == ChangePriorityAction.KIND) {
            synchronized (server.modelLock) {
                extens.changeEdgePriority(action as ChangePriorityAction, clientId, server)
            }
        } else {
            throw new IllegalArgumentException("Action " + action.kind + " not supported by handler " +
                this.class.simpleName)
        }
    }
    
    def setExt(ScchartsStructuredProgrammingServerExtension ext) {
        extens = ext 
    }
}