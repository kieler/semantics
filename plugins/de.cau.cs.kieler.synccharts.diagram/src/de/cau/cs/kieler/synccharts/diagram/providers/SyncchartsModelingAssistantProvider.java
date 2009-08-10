package de.cau.cs.kieler.synccharts.diagram.providers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.modelingassistant.ModelingAssistantProvider;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

import de.cau.cs.kieler.synccharts.diagram.edit.parts.RegionEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.RegionStateCompartmentEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.State2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateEditPart;
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
import de.cau.cs.kieler.synccharts.diagram.part.Messages;
import de.cau.cs.kieler.synccharts.diagram.part.SyncchartsDiagramEditorPlugin;

/**
 * @generated
 */
public class SyncchartsModelingAssistantProvider extends
		ModelingAssistantProvider {

	/**
	 * @generated
	 */
	public List getTypesForPopupBar(IAdaptable host) {
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart instanceof StateSignalEditPart) {
			ArrayList types = new ArrayList(1);
			types.add(SyncchartsElementTypes.Signal_3003);
			return types;
		}
		if (editPart instanceof StateOnEntryActionEditPart) {
			ArrayList types = new ArrayList(1);
			types.add(SyncchartsElementTypes.Action_3004);
			return types;
		}
		if (editPart instanceof StateOnInsideActionEditPart) {
			ArrayList types = new ArrayList(1);
			types.add(SyncchartsElementTypes.Action_3005);
			return types;
		}
		if (editPart instanceof StateOnExitActionEditPart) {
			ArrayList types = new ArrayList(1);
			types.add(SyncchartsElementTypes.Action_3006);
			return types;
		}
		if (editPart instanceof StateSuspendEditPart) {
			ArrayList types = new ArrayList(1);
			types.add(SyncchartsElementTypes.Action_3008);
			return types;
		}
		if (editPart instanceof StateRegionCompartmentEditPart) {
			ArrayList types = new ArrayList(1);
			types.add(SyncchartsElementTypes.Region_3001);
			return types;
		}
		if (editPart instanceof RegionStateCompartmentEditPart) {
			ArrayList types = new ArrayList(1);
			types.add(SyncchartsElementTypes.State_3002);
			return types;
		}
		if (editPart instanceof StateSignal2EditPart) {
			ArrayList types = new ArrayList(1);
			types.add(SyncchartsElementTypes.Signal_3003);
			return types;
		}
		if (editPart instanceof StateOnEntryAction2EditPart) {
			ArrayList types = new ArrayList(1);
			types.add(SyncchartsElementTypes.Action_3004);
			return types;
		}
		if (editPart instanceof StateOnInsideAction2EditPart) {
			ArrayList types = new ArrayList(1);
			types.add(SyncchartsElementTypes.Action_3005);
			return types;
		}
		if (editPart instanceof StateOnExitAction2EditPart) {
			ArrayList types = new ArrayList(1);
			types.add(SyncchartsElementTypes.Action_3006);
			return types;
		}
		if (editPart instanceof StateSuspend2EditPart) {
			ArrayList types = new ArrayList(1);
			types.add(SyncchartsElementTypes.Action_3008);
			return types;
		}
		if (editPart instanceof StateRegionCompartment2EditPart) {
			ArrayList types = new ArrayList(1);
			types.add(SyncchartsElementTypes.Region_3001);
			return types;
		}
		if (editPart instanceof RegionEditPart) {
			ArrayList types = new ArrayList(1);
			types.add(SyncchartsElementTypes.State_2001);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof StateEditPart) {
			return ((StateEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof State2EditPart) {
			return ((State2EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof StateEditPart) {
			return ((StateEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof State2EditPart) {
			return ((State2EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof StateEditPart) {
			return ((StateEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof State2EditPart) {
			return ((State2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof StateEditPart) {
			return ((StateEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof State2EditPart) {
			return ((State2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof StateEditPart) {
			return ((StateEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof State2EditPart) {
			return ((State2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForSource(IAdaptable target,
			IElementType relationshipType) {
		return selectExistingElement(target, getTypesForSource(target,
				relationshipType));
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForTarget(IAdaptable source,
			IElementType relationshipType) {
		return selectExistingElement(source, getTypesForTarget(source,
				relationshipType));
	}

	/**
	 * @generated
	 */
	protected EObject selectExistingElement(IAdaptable host, Collection types) {
		if (types.isEmpty()) {
			return null;
		}
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart == null) {
			return null;
		}
		Diagram diagram = (Diagram) editPart.getRoot().getContents().getModel();
		Collection elements = new HashSet();
		for (Iterator it = diagram.getElement().eAllContents(); it.hasNext();) {
			EObject element = (EObject) it.next();
			if (isApplicableElement(element, types)) {
				elements.add(element);
			}
		}
		if (elements.isEmpty()) {
			return null;
		}
		return selectElement((EObject[]) elements.toArray(new EObject[elements
				.size()]));
	}

	/**
	 * @generated
	 */
	protected boolean isApplicableElement(EObject element, Collection types) {
		IElementType type = ElementTypeRegistry.getInstance().getElementType(
				element);
		return types.contains(type);
	}

	/**
	 * @generated
	 */
	protected EObject selectElement(EObject[] elements) {
		Shell shell = Display.getCurrent().getActiveShell();
		ILabelProvider labelProvider = new AdapterFactoryLabelProvider(
				SyncchartsDiagramEditorPlugin.getInstance()
						.getItemProvidersAdapterFactory());
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(
				shell, labelProvider);
		dialog.setMessage(Messages.SyncchartsModelingAssistantProviderMessage);
		dialog.setTitle(Messages.SyncchartsModelingAssistantProviderTitle);
		dialog.setMultipleSelection(false);
		dialog.setElements(elements);
		EObject selected = null;
		if (dialog.open() == Window.OK) {
			selected = (EObject) dialog.getFirstResult();
		}
		return selected;
	}
}
