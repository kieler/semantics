package de.cau.cs.kieler.synccharts.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.SyncchartsPackage;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.EntryActionEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.EntryActionLabelEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.ExitActionEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.ExitActionLabelEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.InnerActionEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.InnerActionLabelEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.Region2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.RegionEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.RegionIdEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.RegionStateCompartmentEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.SignalEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.SignalNameEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.State2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateEntryActionCompartment2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateEntryActionCompartmentEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateExitActionCompartment2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateExitActionCompartmentEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateInnerActionCompartment2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateInnerActionCompartmentEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateInterfaceDeclaration2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateInterfaceDeclarationEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateLabel2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateLabelEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateRegionCompartment2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateRegionCompartmentEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateSignalCompartment2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateSignalCompartmentEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateSuspensionTriggerCompartment2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateSuspensionTriggerCompartmentEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.SuspensionTriggerEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.SuspensionTriggerLabelEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.TextualCodeEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.TransitionDelayEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.TransitionEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.TransitionPriorityEditPart;

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
		return de.cau.cs.kieler.synccharts.diagram.part.SyncchartsVisualIDRegistry
				.getVisualID(view.getType());
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
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				SyncchartsDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
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
		if (SyncchartsPackage.eINSTANCE.getRegion().isSuperTypeOf(
				domainElement.eClass())
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
		case StateEditPart.VISUAL_ID:
			if (SyncchartsPackage.eINSTANCE.getTextualCode().isSuperTypeOf(
					domainElement.eClass())) {
				return TextualCodeEditPart.VISUAL_ID;
			}
			break;
		case State2EditPart.VISUAL_ID:
			if (SyncchartsPackage.eINSTANCE.getTextualCode().isSuperTypeOf(
					domainElement.eClass())) {
				return TextualCodeEditPart.VISUAL_ID;
			}
			break;
		case StateSignalCompartmentEditPart.VISUAL_ID:
			if (SyncchartsPackage.eINSTANCE.getSignal().isSuperTypeOf(
					domainElement.eClass())) {
				return SignalEditPart.VISUAL_ID;
			}
			break;
		case StateEntryActionCompartmentEditPart.VISUAL_ID:
			if (SyncchartsPackage.eINSTANCE.getAction().isSuperTypeOf(
					domainElement.eClass())) {
				return EntryActionEditPart.VISUAL_ID;
			}
			break;
		case StateInnerActionCompartmentEditPart.VISUAL_ID:
			if (SyncchartsPackage.eINSTANCE.getAction().isSuperTypeOf(
					domainElement.eClass())) {
				return InnerActionEditPart.VISUAL_ID;
			}
			break;
		case StateExitActionCompartmentEditPart.VISUAL_ID:
			if (SyncchartsPackage.eINSTANCE.getAction().isSuperTypeOf(
					domainElement.eClass())) {
				return ExitActionEditPart.VISUAL_ID;
			}
			break;
		case StateSuspensionTriggerCompartmentEditPart.VISUAL_ID:
			if (SyncchartsPackage.eINSTANCE.getAction().isSuperTypeOf(
					domainElement.eClass())) {
				return SuspensionTriggerEditPart.VISUAL_ID;
			}
			break;
		case StateRegionCompartmentEditPart.VISUAL_ID:
			if (SyncchartsPackage.eINSTANCE.getRegion().isSuperTypeOf(
					domainElement.eClass())) {
				return Region2EditPart.VISUAL_ID;
			}
			break;
		case RegionStateCompartmentEditPart.VISUAL_ID:
			if (SyncchartsPackage.eINSTANCE.getState().isSuperTypeOf(
					domainElement.eClass())) {
				return State2EditPart.VISUAL_ID;
			}
			break;
		case StateSignalCompartment2EditPart.VISUAL_ID:
			if (SyncchartsPackage.eINSTANCE.getSignal().isSuperTypeOf(
					domainElement.eClass())) {
				return SignalEditPart.VISUAL_ID;
			}
			break;
		case StateEntryActionCompartment2EditPart.VISUAL_ID:
			if (SyncchartsPackage.eINSTANCE.getAction().isSuperTypeOf(
					domainElement.eClass())) {
				return EntryActionEditPart.VISUAL_ID;
			}
			break;
		case StateInnerActionCompartment2EditPart.VISUAL_ID:
			if (SyncchartsPackage.eINSTANCE.getAction().isSuperTypeOf(
					domainElement.eClass())) {
				return InnerActionEditPart.VISUAL_ID;
			}
			break;
		case StateExitActionCompartment2EditPart.VISUAL_ID:
			if (SyncchartsPackage.eINSTANCE.getAction().isSuperTypeOf(
					domainElement.eClass())) {
				return ExitActionEditPart.VISUAL_ID;
			}
			break;
		case StateSuspensionTriggerCompartment2EditPart.VISUAL_ID:
			if (SyncchartsPackage.eINSTANCE.getAction().isSuperTypeOf(
					domainElement.eClass())) {
				return SuspensionTriggerEditPart.VISUAL_ID;
			}
			break;
		case StateRegionCompartment2EditPart.VISUAL_ID:
			if (SyncchartsPackage.eINSTANCE.getRegion().isSuperTypeOf(
					domainElement.eClass())) {
				return Region2EditPart.VISUAL_ID;
			}
			break;
		case RegionEditPart.VISUAL_ID:
			if (SyncchartsPackage.eINSTANCE.getState().isSuperTypeOf(
					domainElement.eClass())) {
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
			if (StateInterfaceDeclarationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StateSignalCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StateEntryActionCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StateInnerActionCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StateExitActionCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StateSuspensionTriggerCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StateRegionCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TextualCodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Region2EditPart.VISUAL_ID:
			if (RegionIdEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RegionStateCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case State2EditPart.VISUAL_ID:
			if (StateLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StateInterfaceDeclaration2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StateSignalCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StateEntryActionCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StateInnerActionCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StateExitActionCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StateSuspensionTriggerCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StateRegionCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TextualCodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SignalEditPart.VISUAL_ID:
			if (SignalNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EntryActionEditPart.VISUAL_ID:
			if (EntryActionLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InnerActionEditPart.VISUAL_ID:
			if (InnerActionLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ExitActionEditPart.VISUAL_ID:
			if (ExitActionLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SuspensionTriggerEditPart.VISUAL_ID:
			if (SuspensionTriggerLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StateSignalCompartmentEditPart.VISUAL_ID:
			if (SignalEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StateEntryActionCompartmentEditPart.VISUAL_ID:
			if (EntryActionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StateInnerActionCompartmentEditPart.VISUAL_ID:
			if (InnerActionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StateExitActionCompartmentEditPart.VISUAL_ID:
			if (ExitActionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StateSuspensionTriggerCompartmentEditPart.VISUAL_ID:
			if (SuspensionTriggerEditPart.VISUAL_ID == nodeVisualID) {
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
		case StateSignalCompartment2EditPart.VISUAL_ID:
			if (SignalEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StateEntryActionCompartment2EditPart.VISUAL_ID:
			if (EntryActionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StateInnerActionCompartment2EditPart.VISUAL_ID:
			if (InnerActionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StateExitActionCompartment2EditPart.VISUAL_ID:
			if (ExitActionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StateSuspensionTriggerCompartment2EditPart.VISUAL_ID:
			if (SuspensionTriggerEditPart.VISUAL_ID == nodeVisualID) {
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
			if (TransitionDelayEditPart.VISUAL_ID == nodeVisualID) {
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
		if (SyncchartsPackage.eINSTANCE.getTransition().isSuperTypeOf(
				domainElement.eClass())) {
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
