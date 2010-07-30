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
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateEntryActionCompartment2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateEntryActionCompartmentEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateExitActionCompartment2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateExitActionCompartmentEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateInnerActionCompartment2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateInnerActionCompartmentEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateRegionCompartment2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateRegionCompartmentEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateSignalCompartment2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateSignalCompartmentEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateSuspensionTriggerCompartment2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateSuspensionTriggerCompartmentEditPart;
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
        if (editPart instanceof RegionEditPart) {
            ArrayList<IElementType> types = new ArrayList<IElementType>(1);
            types.add(SyncchartsElementTypes.State_2004);
            return types;
        }
        if (editPart instanceof StateEditPart) {
            ArrayList<IElementType> types = new ArrayList<IElementType>(1);
            types.add(SyncchartsElementTypes.TextualCode_3038);
            return types;
        }
        if (editPart instanceof State2EditPart) {
            ArrayList<IElementType> types = new ArrayList<IElementType>(1);
            types.add(SyncchartsElementTypes.TextualCode_3038);
            return types;
        }
        if (editPart instanceof StateSignalCompartment2EditPart) {
            ArrayList<IElementType> types = new ArrayList<IElementType>(1);
            types.add(SyncchartsElementTypes.Signal_3033);
            return types;
        }
        if (editPart instanceof StateEntryActionCompartment2EditPart) {
            ArrayList<IElementType> types = new ArrayList<IElementType>(1);
            types.add(SyncchartsElementTypes.Action_3034);
            return types;
        }
        if (editPart instanceof StateInnerActionCompartment2EditPart) {
            ArrayList<IElementType> types = new ArrayList<IElementType>(1);
            types.add(SyncchartsElementTypes.Action_3035);
            return types;
        }
        if (editPart instanceof StateExitActionCompartment2EditPart) {
            ArrayList<IElementType> types = new ArrayList<IElementType>(1);
            types.add(SyncchartsElementTypes.Action_3036);
            return types;
        }
        if (editPart instanceof StateSuspensionTriggerCompartment2EditPart) {
            ArrayList<IElementType> types = new ArrayList<IElementType>(1);
            types.add(SyncchartsElementTypes.Action_3037);
            return types;
        }
        if (editPart instanceof StateRegionCompartmentEditPart) {
            ArrayList<IElementType> types = new ArrayList<IElementType>(1);
            types.add(SyncchartsElementTypes.Region_3031);
            return types;
        }
        if (editPart instanceof RegionStateCompartmentEditPart) {
            ArrayList<IElementType> types = new ArrayList<IElementType>(1);
            types.add(SyncchartsElementTypes.State_3032);
            return types;
        }
        if (editPart instanceof StateSignalCompartmentEditPart) {
            ArrayList<IElementType> types = new ArrayList<IElementType>(1);
            types.add(SyncchartsElementTypes.Signal_3033);
            return types;
        }
        if (editPart instanceof StateEntryActionCompartmentEditPart) {
            ArrayList<IElementType> types = new ArrayList<IElementType>(1);
            types.add(SyncchartsElementTypes.Action_3034);
            return types;
        }
        if (editPart instanceof StateInnerActionCompartmentEditPart) {
            ArrayList<IElementType> types = new ArrayList<IElementType>(1);
            types.add(SyncchartsElementTypes.Action_3035);
            return types;
        }
        if (editPart instanceof StateExitActionCompartmentEditPart) {
            ArrayList<IElementType> types = new ArrayList<IElementType>(1);
            types.add(SyncchartsElementTypes.Action_3036);
            return types;
        }
        if (editPart instanceof StateSuspensionTriggerCompartmentEditPart) {
            ArrayList<IElementType> types = new ArrayList<IElementType>(1);
            types.add(SyncchartsElementTypes.Action_3037);
            return types;
        }
        if (editPart instanceof StateRegionCompartment2EditPart) {
            ArrayList<IElementType> types = new ArrayList<IElementType>(1);
            types.add(SyncchartsElementTypes.Region_3031);
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
        return selectExistingElement(target,
                getTypesForSource(target, relationshipType));
    }

    /**
     * @generated
     */
    public EObject selectExistingElementForTarget(IAdaptable source,
            IElementType relationshipType) {
        return selectExistingElement(source,
                getTypesForTarget(source, relationshipType));
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
        HashSet<EObject> elements = new HashSet<EObject>();
        for (Iterator<EObject> it = diagram.getElement().eAllContents(); it
                .hasNext();) {
            EObject element = it.next();
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
