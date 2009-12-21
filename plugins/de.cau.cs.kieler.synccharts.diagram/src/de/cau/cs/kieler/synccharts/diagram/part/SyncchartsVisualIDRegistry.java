package de.cau.cs.kieler.synccharts.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.SyncchartsPackage;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.Action2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.Action3EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.Action4EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.ActionEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.ActionTriggersAndEffects2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.ActionTriggersAndEffects3EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.ActionTriggersAndEffects4EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.ActionTriggersAndEffectsEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.Region2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.RegionEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.RegionStateCompartmentEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.SignalEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.SignalNameEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.State2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateLabel2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateLabelEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateOnEntryAction2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateOnEntryActionEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateOnExitAction2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateOnExitActionEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateOnInsideAction2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateOnInsideActionEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateRegionCompartment2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateRegionCompartmentEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateSignal2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateSignalEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateSuspend2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateSuspendEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.TransitionEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.TransitionPriorityEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.TransitionTriggersAndEffectsEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class SyncchartsVisualIDRegistry {

    /**
     * @generated
     */
    private static final String DEBUG_KEY = "de.cau.cs.kieler.synccharts.diagram/debug/visualID"; //$NON-NLS-1$

    /**
     * @generated
     */
    public static int getVisualID(View view) {
        if (view instanceof Diagram) {
            if (RegionEditPart.MODEL_ID.equals(view.getType())) {
                return RegionEditPart.VISUAL_ID;
            } else {
                return -1;
            }
        }
        return de.cau.cs.kieler.synccharts.diagram.part.SyncchartsVisualIDRegistry.getVisualID(view
                .getType());
    }

    /**
     * @generated
     */
    public static String getModelID(View view) {
        View diagram = view.getDiagram();
        while (view != diagram) {
            EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
            if (annotation != null) {
                return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
            }
            view = (View) view.eContainer();
        }
        return diagram != null ? diagram.getType() : null;
    }

    /**
     * @generated
     */
    public static int getVisualID(String type) {
        try {
            return Integer.parseInt(type);
        } catch (NumberFormatException e) {
            if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
                SyncchartsDiagramEditorPlugin.getInstance().logError(
                        "Unable to parse view type as a visualID number: " + type);
            }
        }
        return -1;
    }

    /**
     * @generated
     */
    public static String getType(int visualID) {
        return String.valueOf(visualID);
    }

    /**
     * @generated
     */
    public static int getDiagramVisualID(EObject domainElement) {
        if (domainElement == null) {
            return -1;
        }
        if (SyncchartsPackage.eINSTANCE.getRegion().isSuperTypeOf(domainElement.eClass())
                && isDiagram((Region) domainElement)) {
            return RegionEditPart.VISUAL_ID;
        }
        return -1;
    }

    /**
     * @generated
     */
    public static int getNodeVisualID(View containerView, EObject domainElement) {
        if (domainElement == null) {
            return -1;
        }
        String containerModelID = de.cau.cs.kieler.synccharts.diagram.part.SyncchartsVisualIDRegistry
                .getModelID(containerView);
        if (!RegionEditPart.MODEL_ID.equals(containerModelID)) {
            return -1;
        }
        int containerVisualID;
        if (RegionEditPart.MODEL_ID.equals(containerModelID)) {
            containerVisualID = de.cau.cs.kieler.synccharts.diagram.part.SyncchartsVisualIDRegistry
                    .getVisualID(containerView);
        } else {
            if (containerView instanceof Diagram) {
                containerVisualID = RegionEditPart.VISUAL_ID;
            } else {
                return -1;
            }
        }
        switch (containerVisualID) {
        case StateSignalEditPart.VISUAL_ID:
            if (SyncchartsPackage.eINSTANCE.getSignal().isSuperTypeOf(domainElement.eClass())) {
                return SignalEditPart.VISUAL_ID;
            }
            break;
        case StateOnEntryActionEditPart.VISUAL_ID:
            if (SyncchartsPackage.eINSTANCE.getAction().isSuperTypeOf(domainElement.eClass())) {
                return ActionEditPart.VISUAL_ID;
            }
            break;
        case StateOnInsideActionEditPart.VISUAL_ID:
            if (SyncchartsPackage.eINSTANCE.getAction().isSuperTypeOf(domainElement.eClass())) {
                return Action2EditPart.VISUAL_ID;
            }
            break;
        case StateOnExitActionEditPart.VISUAL_ID:
            if (SyncchartsPackage.eINSTANCE.getAction().isSuperTypeOf(domainElement.eClass())) {
                return Action3EditPart.VISUAL_ID;
            }
            break;
        case StateSuspendEditPart.VISUAL_ID:
            if (SyncchartsPackage.eINSTANCE.getAction().isSuperTypeOf(domainElement.eClass())) {
                return Action4EditPart.VISUAL_ID;
            }
            break;
        case StateRegionCompartmentEditPart.VISUAL_ID:
            if (SyncchartsPackage.eINSTANCE.getRegion().isSuperTypeOf(domainElement.eClass())) {
                return Region2EditPart.VISUAL_ID;
            }
            break;
        case RegionStateCompartmentEditPart.VISUAL_ID:
            if (SyncchartsPackage.eINSTANCE.getState().isSuperTypeOf(domainElement.eClass())) {
                return State2EditPart.VISUAL_ID;
            }
            break;
        case StateSignal2EditPart.VISUAL_ID:
            if (SyncchartsPackage.eINSTANCE.getSignal().isSuperTypeOf(domainElement.eClass())) {
                return SignalEditPart.VISUAL_ID;
            }
            break;
        case StateOnEntryAction2EditPart.VISUAL_ID:
            if (SyncchartsPackage.eINSTANCE.getAction().isSuperTypeOf(domainElement.eClass())) {
                return ActionEditPart.VISUAL_ID;
            }
            break;
        case StateOnInsideAction2EditPart.VISUAL_ID:
            if (SyncchartsPackage.eINSTANCE.getAction().isSuperTypeOf(domainElement.eClass())) {
                return Action2EditPart.VISUAL_ID;
            }
            break;
        case StateOnExitAction2EditPart.VISUAL_ID:
            if (SyncchartsPackage.eINSTANCE.getAction().isSuperTypeOf(domainElement.eClass())) {
                return Action3EditPart.VISUAL_ID;
            }
            break;
        case StateSuspend2EditPart.VISUAL_ID:
            if (SyncchartsPackage.eINSTANCE.getAction().isSuperTypeOf(domainElement.eClass())) {
                return Action4EditPart.VISUAL_ID;
            }
            break;
        case StateRegionCompartment2EditPart.VISUAL_ID:
            if (SyncchartsPackage.eINSTANCE.getRegion().isSuperTypeOf(domainElement.eClass())) {
                return Region2EditPart.VISUAL_ID;
            }
            break;
        case RegionEditPart.VISUAL_ID:
            if (SyncchartsPackage.eINSTANCE.getState().isSuperTypeOf(domainElement.eClass())) {
                return StateEditPart.VISUAL_ID;
            }
            break;
        }
        return -1;
    }

    /**
     * @generated
     */
    public static boolean canCreateNode(View containerView, int nodeVisualID) {
        String containerModelID = de.cau.cs.kieler.synccharts.diagram.part.SyncchartsVisualIDRegistry
                .getModelID(containerView);
        if (!RegionEditPart.MODEL_ID.equals(containerModelID)) {
            return false;
        }
        int containerVisualID;
        if (RegionEditPart.MODEL_ID.equals(containerModelID)) {
            containerVisualID = de.cau.cs.kieler.synccharts.diagram.part.SyncchartsVisualIDRegistry
                    .getVisualID(containerView);
        } else {
            if (containerView instanceof Diagram) {
                containerVisualID = RegionEditPart.VISUAL_ID;
            } else {
                return false;
            }
        }
        switch (containerVisualID) {
        case StateEditPart.VISUAL_ID:
            if (StateLabelEditPart.VISUAL_ID == nodeVisualID) {
                return true;
            }
            if (StateSignalEditPart.VISUAL_ID == nodeVisualID) {
                return true;
            }
            if (StateOnEntryActionEditPart.VISUAL_ID == nodeVisualID) {
                return true;
            }
            if (StateOnInsideActionEditPart.VISUAL_ID == nodeVisualID) {
                return true;
            }
            if (StateOnExitActionEditPart.VISUAL_ID == nodeVisualID) {
                return true;
            }
            if (StateSuspendEditPart.VISUAL_ID == nodeVisualID) {
                return true;
            }
            if (StateRegionCompartmentEditPart.VISUAL_ID == nodeVisualID) {
                return true;
            }
            break;
        case Region2EditPart.VISUAL_ID:
            if (RegionStateCompartmentEditPart.VISUAL_ID == nodeVisualID) {
                return true;
            }
            break;
        case State2EditPart.VISUAL_ID:
            if (StateLabel2EditPart.VISUAL_ID == nodeVisualID) {
                return true;
            }
            if (StateSignal2EditPart.VISUAL_ID == nodeVisualID) {
                return true;
            }
            if (StateOnEntryAction2EditPart.VISUAL_ID == nodeVisualID) {
                return true;
            }
            if (StateOnInsideAction2EditPart.VISUAL_ID == nodeVisualID) {
                return true;
            }
            if (StateOnExitAction2EditPart.VISUAL_ID == nodeVisualID) {
                return true;
            }
            if (StateSuspend2EditPart.VISUAL_ID == nodeVisualID) {
                return true;
            }
            if (StateRegionCompartment2EditPart.VISUAL_ID == nodeVisualID) {
                return true;
            }
            break;
        case SignalEditPart.VISUAL_ID:
            if (SignalNameEditPart.VISUAL_ID == nodeVisualID) {
                return true;
            }
            break;
        case ActionEditPart.VISUAL_ID:
            if (ActionTriggersAndEffectsEditPart.VISUAL_ID == nodeVisualID) {
                return true;
            }
            break;
        case Action2EditPart.VISUAL_ID:
            if (ActionTriggersAndEffects2EditPart.VISUAL_ID == nodeVisualID) {
                return true;
            }
            break;
        case Action3EditPart.VISUAL_ID:
            if (ActionTriggersAndEffects3EditPart.VISUAL_ID == nodeVisualID) {
                return true;
            }
            break;
        case Action4EditPart.VISUAL_ID:
            if (ActionTriggersAndEffects4EditPart.VISUAL_ID == nodeVisualID) {
                return true;
            }
            break;
        case StateSignalEditPart.VISUAL_ID:
            if (SignalEditPart.VISUAL_ID == nodeVisualID) {
                return true;
            }
            break;
        case StateOnEntryActionEditPart.VISUAL_ID:
            if (ActionEditPart.VISUAL_ID == nodeVisualID) {
                return true;
            }
            break;
        case StateOnInsideActionEditPart.VISUAL_ID:
            if (Action2EditPart.VISUAL_ID == nodeVisualID) {
                return true;
            }
            break;
        case StateOnExitActionEditPart.VISUAL_ID:
            if (Action3EditPart.VISUAL_ID == nodeVisualID) {
                return true;
            }
            break;
        case StateSuspendEditPart.VISUAL_ID:
            if (Action4EditPart.VISUAL_ID == nodeVisualID) {
                return true;
            }
            break;
        case StateRegionCompartmentEditPart.VISUAL_ID:
            if (Region2EditPart.VISUAL_ID == nodeVisualID) {
                return true;
            }
            break;
        case RegionStateCompartmentEditPart.VISUAL_ID:
            if (State2EditPart.VISUAL_ID == nodeVisualID) {
                return true;
            }
            break;
        case StateSignal2EditPart.VISUAL_ID:
            if (SignalEditPart.VISUAL_ID == nodeVisualID) {
                return true;
            }
            break;
        case StateOnEntryAction2EditPart.VISUAL_ID:
            if (ActionEditPart.VISUAL_ID == nodeVisualID) {
                return true;
            }
            break;
        case StateOnInsideAction2EditPart.VISUAL_ID:
            if (Action2EditPart.VISUAL_ID == nodeVisualID) {
                return true;
            }
            break;
        case StateOnExitAction2EditPart.VISUAL_ID:
            if (Action3EditPart.VISUAL_ID == nodeVisualID) {
                return true;
            }
            break;
        case StateSuspend2EditPart.VISUAL_ID:
            if (Action4EditPart.VISUAL_ID == nodeVisualID) {
                return true;
            }
            break;
        case StateRegionCompartment2EditPart.VISUAL_ID:
            if (Region2EditPart.VISUAL_ID == nodeVisualID) {
                return true;
            }
            break;
        case RegionEditPart.VISUAL_ID:
            if (StateEditPart.VISUAL_ID == nodeVisualID) {
                return true;
            }
            break;
        case TransitionEditPart.VISUAL_ID:
            if (TransitionTriggersAndEffectsEditPart.VISUAL_ID == nodeVisualID) {
                return true;
            }
            if (TransitionPriorityEditPart.VISUAL_ID == nodeVisualID) {
                return true;
            }
            break;
        }
        return false;
    }

    /**
     * @generated
     */
    public static int getLinkWithClassVisualID(EObject domainElement) {
        if (domainElement == null) {
            return -1;
        }
        if (SyncchartsPackage.eINSTANCE.getTransition().isSuperTypeOf(domainElement.eClass())) {
            return TransitionEditPart.VISUAL_ID;
        }
        return -1;
    }

    /**
     * User can change implementation of this method to handle some specific
     * situations not covered by default logic.
     * 
     * @generated
     */
    private static boolean isDiagram(Region element) {
        return true;
    }

}
