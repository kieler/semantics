package de.cau.cs.kieler.synccharts.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

import de.cau.cs.kieler.core.expressions.Signal;
import de.cau.cs.kieler.core.expressions.TextualCode;
import de.cau.cs.kieler.synccharts.Action;
import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.SyncchartsPackage;
import de.cau.cs.kieler.synccharts.Transition;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.Region2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.RegionEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.RegionStateCompartmentEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.SignalEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.State2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateEntryActionCompartment2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateEntryActionCompartmentEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateEntryActionEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateExitActionCompartment2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateExitActionCompartmentEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateExitActionEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateInnerActionCompartment2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateInnerActionCompartmentEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateInnerActionEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateRegionCompartment2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateRegionCompartmentEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateSignalCompartment2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateSignalCompartmentEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateSuspensionTriggerCompartment2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateSuspensionTriggerCompartmentEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateSuspensionTriggerEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.TextualCodeEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.TransitionEditPart;
import de.cau.cs.kieler.synccharts.diagram.providers.SyncchartsElementTypes;

/**
 * @generated
 */
public class SyncchartsDiagramUpdater {

    /**
     * @generated
     */
    public static List<SyncchartsNodeDescriptor> getSemanticChildren(View view) {
        switch (SyncchartsVisualIDRegistry.getVisualID(view)) {
        case RegionEditPart.VISUAL_ID:
            return getRegion_1000SemanticChildren(view);
        case StateEditPart.VISUAL_ID:
            return getState_2004SemanticChildren(view);
        case State2EditPart.VISUAL_ID:
            return getState_3032SemanticChildren(view);
        case StateSignalCompartment2EditPart.VISUAL_ID:
            return getStateSignal_7041SemanticChildren(view);
        case StateEntryActionCompartment2EditPart.VISUAL_ID:
            return getStateOnEntryAction_7042SemanticChildren(view);
        case StateInnerActionCompartment2EditPart.VISUAL_ID:
            return getStateOnInsideAction_7043SemanticChildren(view);
        case StateExitActionCompartment2EditPart.VISUAL_ID:
            return getStateOnExitAction_7044SemanticChildren(view);
        case StateSuspensionTriggerCompartment2EditPart.VISUAL_ID:
            return getStateSuspend_7045SemanticChildren(view);
        case StateRegionCompartmentEditPart.VISUAL_ID:
            return getStateRegionCompartment_7046SemanticChildren(view);
        case RegionStateCompartmentEditPart.VISUAL_ID:
            return getRegionStateCompartment_7047SemanticChildren(view);
        case StateSignalCompartmentEditPart.VISUAL_ID:
            return getStateSignal_7048SemanticChildren(view);
        case StateEntryActionCompartmentEditPart.VISUAL_ID:
            return getStateOnEntryAction_7049SemanticChildren(view);
        case StateInnerActionCompartmentEditPart.VISUAL_ID:
            return getStateOnInsideAction_7050SemanticChildren(view);
        case StateExitActionCompartmentEditPart.VISUAL_ID:
            return getStateOnExitAction_7051SemanticChildren(view);
        case StateSuspensionTriggerCompartmentEditPart.VISUAL_ID:
            return getStateSuspend_7052SemanticChildren(view);
        case StateRegionCompartment2EditPart.VISUAL_ID:
            return getStateRegionCompartment_7053SemanticChildren(view);
        }
        return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<SyncchartsNodeDescriptor> getRegion_1000SemanticChildren(
            View view) {
        if (!view.isSetElement()) {
            return Collections.emptyList();
        }
        Region modelElement = (Region) view.getElement();
        LinkedList<SyncchartsNodeDescriptor> result =
                new LinkedList<SyncchartsNodeDescriptor>();
        for (Iterator<?> it = modelElement.getStates().iterator(); it.hasNext();) {
            State childElement = (State) it.next();
            int visualID =
                    SyncchartsVisualIDRegistry.getNodeVisualID(view,
                            childElement);
            if (visualID == StateEditPart.VISUAL_ID) {
                result.add(new SyncchartsNodeDescriptor(childElement, visualID));
                continue;
            }
        }
        return result;
    }

    /**
     * @generated
     */
    public static List<SyncchartsNodeDescriptor> getState_2004SemanticChildren(
            View view) {
        if (!view.isSetElement()) {
            return Collections.emptyList();
        }
        State modelElement = (State) view.getElement();
        LinkedList<SyncchartsNodeDescriptor> result =
                new LinkedList<SyncchartsNodeDescriptor>();
        {
            TextualCode childElement = modelElement.getBodyText();
            int visualID =
                    SyncchartsVisualIDRegistry.getNodeVisualID(view,
                            childElement);
            if (visualID == TextualCodeEditPart.VISUAL_ID) {
                result.add(new SyncchartsNodeDescriptor(childElement, visualID));
            }
        }
        return result;
    }

    /**
     * @generated
     */
    public static List<SyncchartsNodeDescriptor> getState_3032SemanticChildren(
            View view) {
        if (!view.isSetElement()) {
            return Collections.emptyList();
        }
        State modelElement = (State) view.getElement();
        LinkedList<SyncchartsNodeDescriptor> result =
                new LinkedList<SyncchartsNodeDescriptor>();
        {
            TextualCode childElement = modelElement.getBodyText();
            int visualID =
                    SyncchartsVisualIDRegistry.getNodeVisualID(view,
                            childElement);
            if (visualID == TextualCodeEditPart.VISUAL_ID) {
                result.add(new SyncchartsNodeDescriptor(childElement, visualID));
            }
        }
        return result;
    }

    /**
     * @generated
     */
    public static List<SyncchartsNodeDescriptor> getStateSignal_7041SemanticChildren(
            View view) {
        if (false == view.eContainer() instanceof View) {
            return Collections.emptyList();
        }
        View containerView = (View) view.eContainer();
        if (!containerView.isSetElement()) {
            return Collections.emptyList();
        }
        State modelElement = (State) containerView.getElement();
        LinkedList<SyncchartsNodeDescriptor> result =
                new LinkedList<SyncchartsNodeDescriptor>();
        for (Iterator<?> it = modelElement.getSignals().iterator(); it
                .hasNext();) {
            Signal childElement = (Signal) it.next();
            int visualID =
                    SyncchartsVisualIDRegistry.getNodeVisualID(view,
                            childElement);
            if (visualID == SignalEditPart.VISUAL_ID) {
                result.add(new SyncchartsNodeDescriptor(childElement, visualID));
                continue;
            }
        }
        return result;
    }

    /**
     * @generated
     */
    public static List<SyncchartsNodeDescriptor> getStateOnEntryAction_7042SemanticChildren(
            View view) {
        if (false == view.eContainer() instanceof View) {
            return Collections.emptyList();
        }
        View containerView = (View) view.eContainer();
        if (!containerView.isSetElement()) {
            return Collections.emptyList();
        }
        State modelElement = (State) containerView.getElement();
        LinkedList<SyncchartsNodeDescriptor> result =
                new LinkedList<SyncchartsNodeDescriptor>();
        for (Iterator<?> it = modelElement.getEntryActions().iterator(); it
                .hasNext();) {
            Action childElement = (Action) it.next();
            int visualID =
                    SyncchartsVisualIDRegistry.getNodeVisualID(view,
                            childElement);
            if (visualID == StateEntryActionEditPart.VISUAL_ID) {
                result.add(new SyncchartsNodeDescriptor(childElement, visualID));
                continue;
            }
        }
        return result;
    }

    /**
     * @generated
     */
    public static List<SyncchartsNodeDescriptor> getStateOnInsideAction_7043SemanticChildren(
            View view) {
        if (false == view.eContainer() instanceof View) {
            return Collections.emptyList();
        }
        View containerView = (View) view.eContainer();
        if (!containerView.isSetElement()) {
            return Collections.emptyList();
        }
        State modelElement = (State) containerView.getElement();
        LinkedList<SyncchartsNodeDescriptor> result =
                new LinkedList<SyncchartsNodeDescriptor>();
        for (Iterator<?> it = modelElement.getInnerActions().iterator(); it
                .hasNext();) {
            Action childElement = (Action) it.next();
            int visualID =
                    SyncchartsVisualIDRegistry.getNodeVisualID(view,
                            childElement);
            if (visualID == StateInnerActionEditPart.VISUAL_ID) {
                result.add(new SyncchartsNodeDescriptor(childElement, visualID));
                continue;
            }
        }
        return result;
    }

    /**
     * @generated
     */
    public static List<SyncchartsNodeDescriptor> getStateOnExitAction_7044SemanticChildren(
            View view) {
        if (false == view.eContainer() instanceof View) {
            return Collections.emptyList();
        }
        View containerView = (View) view.eContainer();
        if (!containerView.isSetElement()) {
            return Collections.emptyList();
        }
        State modelElement = (State) containerView.getElement();
        LinkedList<SyncchartsNodeDescriptor> result =
                new LinkedList<SyncchartsNodeDescriptor>();
        for (Iterator<?> it = modelElement.getExitActions().iterator(); it
                .hasNext();) {
            Action childElement = (Action) it.next();
            int visualID =
                    SyncchartsVisualIDRegistry.getNodeVisualID(view,
                            childElement);
            if (visualID == StateExitActionEditPart.VISUAL_ID) {
                result.add(new SyncchartsNodeDescriptor(childElement, visualID));
                continue;
            }
        }
        return result;
    }

    /**
     * @generated
     */
    public static List<SyncchartsNodeDescriptor> getStateSuspend_7045SemanticChildren(
            View view) {
        if (false == view.eContainer() instanceof View) {
            return Collections.emptyList();
        }
        View containerView = (View) view.eContainer();
        if (!containerView.isSetElement()) {
            return Collections.emptyList();
        }
        State modelElement = (State) containerView.getElement();
        LinkedList<SyncchartsNodeDescriptor> result =
                new LinkedList<SyncchartsNodeDescriptor>();
        {
            Action childElement = modelElement.getSuspensionTrigger();
            int visualID =
                    SyncchartsVisualIDRegistry.getNodeVisualID(view,
                            childElement);
            if (visualID == StateSuspensionTriggerEditPart.VISUAL_ID) {
                result.add(new SyncchartsNodeDescriptor(childElement, visualID));
            }
        }
        return result;
    }

    /**
     * @generated
     */
    public static List<SyncchartsNodeDescriptor> getStateRegionCompartment_7046SemanticChildren(
            View view) {
        if (false == view.eContainer() instanceof View) {
            return Collections.emptyList();
        }
        View containerView = (View) view.eContainer();
        if (!containerView.isSetElement()) {
            return Collections.emptyList();
        }
        State modelElement = (State) containerView.getElement();
        LinkedList<SyncchartsNodeDescriptor> result =
                new LinkedList<SyncchartsNodeDescriptor>();
        for (Iterator<?> it = modelElement.getRegions().iterator(); it
                .hasNext();) {
            Region childElement = (Region) it.next();
            int visualID =
                    SyncchartsVisualIDRegistry.getNodeVisualID(view,
                            childElement);
            if (visualID == Region2EditPart.VISUAL_ID) {
                result.add(new SyncchartsNodeDescriptor(childElement, visualID));
                continue;
            }
        }
        return result;
    }

    /**
     * @generated
     */
    public static List<SyncchartsNodeDescriptor> getRegionStateCompartment_7047SemanticChildren(
            View view) {
        if (false == view.eContainer() instanceof View) {
            return Collections.emptyList();
        }
        View containerView = (View) view.eContainer();
        if (!containerView.isSetElement()) {
            return Collections.emptyList();
        }
        Region modelElement = (Region) containerView.getElement();
        LinkedList<SyncchartsNodeDescriptor> result =
                new LinkedList<SyncchartsNodeDescriptor>();
        for (Iterator<?> it = modelElement.getStates().iterator(); it.hasNext();) {
            State childElement = (State) it.next();
            int visualID =
                    SyncchartsVisualIDRegistry.getNodeVisualID(view,
                            childElement);
            if (visualID == State2EditPart.VISUAL_ID) {
                result.add(new SyncchartsNodeDescriptor(childElement, visualID));
                continue;
            }
        }
        return result;
    }

    /**
     * @generated
     */
    public static List<SyncchartsNodeDescriptor> getStateSignal_7048SemanticChildren(
            View view) {
        if (false == view.eContainer() instanceof View) {
            return Collections.emptyList();
        }
        View containerView = (View) view.eContainer();
        if (!containerView.isSetElement()) {
            return Collections.emptyList();
        }
        State modelElement = (State) containerView.getElement();
        LinkedList<SyncchartsNodeDescriptor> result =
                new LinkedList<SyncchartsNodeDescriptor>();
        for (Iterator<?> it = modelElement.getSignals().iterator(); it
                .hasNext();) {
            Signal childElement = (Signal) it.next();
            int visualID =
                    SyncchartsVisualIDRegistry.getNodeVisualID(view,
                            childElement);
            if (visualID == SignalEditPart.VISUAL_ID) {
                result.add(new SyncchartsNodeDescriptor(childElement, visualID));
                continue;
            }
        }
        return result;
    }

    /**
     * @generated
     */
    public static List<SyncchartsNodeDescriptor> getStateOnEntryAction_7049SemanticChildren(
            View view) {
        if (false == view.eContainer() instanceof View) {
            return Collections.emptyList();
        }
        View containerView = (View) view.eContainer();
        if (!containerView.isSetElement()) {
            return Collections.emptyList();
        }
        State modelElement = (State) containerView.getElement();
        LinkedList<SyncchartsNodeDescriptor> result =
                new LinkedList<SyncchartsNodeDescriptor>();
        for (Iterator<?> it = modelElement.getEntryActions().iterator(); it
                .hasNext();) {
            Action childElement = (Action) it.next();
            int visualID =
                    SyncchartsVisualIDRegistry.getNodeVisualID(view,
                            childElement);
            if (visualID == StateEntryActionEditPart.VISUAL_ID) {
                result.add(new SyncchartsNodeDescriptor(childElement, visualID));
                continue;
            }
        }
        return result;
    }

    /**
     * @generated
     */
    public static List<SyncchartsNodeDescriptor> getStateOnInsideAction_7050SemanticChildren(
            View view) {
        if (false == view.eContainer() instanceof View) {
            return Collections.emptyList();
        }
        View containerView = (View) view.eContainer();
        if (!containerView.isSetElement()) {
            return Collections.emptyList();
        }
        State modelElement = (State) containerView.getElement();
        LinkedList<SyncchartsNodeDescriptor> result =
                new LinkedList<SyncchartsNodeDescriptor>();
        for (Iterator<?> it = modelElement.getInnerActions().iterator(); it
                .hasNext();) {
            Action childElement = (Action) it.next();
            int visualID =
                    SyncchartsVisualIDRegistry.getNodeVisualID(view,
                            childElement);
            if (visualID == StateInnerActionEditPart.VISUAL_ID) {
                result.add(new SyncchartsNodeDescriptor(childElement, visualID));
                continue;
            }
        }
        return result;
    }

    /**
     * @generated
     */
    public static List<SyncchartsNodeDescriptor> getStateOnExitAction_7051SemanticChildren(
            View view) {
        if (false == view.eContainer() instanceof View) {
            return Collections.emptyList();
        }
        View containerView = (View) view.eContainer();
        if (!containerView.isSetElement()) {
            return Collections.emptyList();
        }
        State modelElement = (State) containerView.getElement();
        LinkedList<SyncchartsNodeDescriptor> result =
                new LinkedList<SyncchartsNodeDescriptor>();
        for (Iterator<?> it = modelElement.getExitActions().iterator(); it
                .hasNext();) {
            Action childElement = (Action) it.next();
            int visualID =
                    SyncchartsVisualIDRegistry.getNodeVisualID(view,
                            childElement);
            if (visualID == StateExitActionEditPart.VISUAL_ID) {
                result.add(new SyncchartsNodeDescriptor(childElement, visualID));
                continue;
            }
        }
        return result;
    }

    /**
     * @generated
     */
    public static List<SyncchartsNodeDescriptor> getStateSuspend_7052SemanticChildren(
            View view) {
        if (false == view.eContainer() instanceof View) {
            return Collections.emptyList();
        }
        View containerView = (View) view.eContainer();
        if (!containerView.isSetElement()) {
            return Collections.emptyList();
        }
        State modelElement = (State) containerView.getElement();
        LinkedList<SyncchartsNodeDescriptor> result =
                new LinkedList<SyncchartsNodeDescriptor>();
        {
            Action childElement = modelElement.getSuspensionTrigger();
            int visualID =
                    SyncchartsVisualIDRegistry.getNodeVisualID(view,
                            childElement);
            if (visualID == StateSuspensionTriggerEditPart.VISUAL_ID) {
                result.add(new SyncchartsNodeDescriptor(childElement, visualID));
            }
        }
        return result;
    }

    /**
     * @generated
     */
    public static List<SyncchartsNodeDescriptor> getStateRegionCompartment_7053SemanticChildren(
            View view) {
        if (false == view.eContainer() instanceof View) {
            return Collections.emptyList();
        }
        View containerView = (View) view.eContainer();
        if (!containerView.isSetElement()) {
            return Collections.emptyList();
        }
        State modelElement = (State) containerView.getElement();
        LinkedList<SyncchartsNodeDescriptor> result =
                new LinkedList<SyncchartsNodeDescriptor>();
        for (Iterator<?> it = modelElement.getRegions().iterator(); it
                .hasNext();) {
            Region childElement = (Region) it.next();
            int visualID =
                    SyncchartsVisualIDRegistry.getNodeVisualID(view,
                            childElement);
            if (visualID == Region2EditPart.VISUAL_ID) {
                result.add(new SyncchartsNodeDescriptor(childElement, visualID));
                continue;
            }
        }
        return result;
    }

    /**
     * @generated
     */
    public static List<SyncchartsLinkDescriptor> getContainedLinks(View view) {
        switch (SyncchartsVisualIDRegistry.getVisualID(view)) {
        case RegionEditPart.VISUAL_ID:
            return getRegion_1000ContainedLinks(view);
        case StateEditPart.VISUAL_ID:
            return getState_2004ContainedLinks(view);
        case Region2EditPart.VISUAL_ID:
            return getRegion_3031ContainedLinks(view);
        case State2EditPart.VISUAL_ID:
            return getState_3032ContainedLinks(view);
        case SignalEditPart.VISUAL_ID:
            return getSignal_3033ContainedLinks(view);
        case StateEntryActionEditPart.VISUAL_ID:
            return getAction_3034ContainedLinks(view);
        case StateInnerActionEditPart.VISUAL_ID:
            return getAction_3035ContainedLinks(view);
        case StateExitActionEditPart.VISUAL_ID:
            return getAction_3036ContainedLinks(view);
        case StateSuspensionTriggerEditPart.VISUAL_ID:
            return getAction_3037ContainedLinks(view);
        case TextualCodeEditPart.VISUAL_ID:
            return getTextualCode_3038ContainedLinks(view);
        case TransitionEditPart.VISUAL_ID:
            return getTransition_4004ContainedLinks(view);
        }
        return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<SyncchartsLinkDescriptor> getIncomingLinks(View view) {
        switch (SyncchartsVisualIDRegistry.getVisualID(view)) {
        case StateEditPart.VISUAL_ID:
            return getState_2004IncomingLinks(view);
        case Region2EditPart.VISUAL_ID:
            return getRegion_3031IncomingLinks(view);
        case State2EditPart.VISUAL_ID:
            return getState_3032IncomingLinks(view);
        case SignalEditPart.VISUAL_ID:
            return getSignal_3033IncomingLinks(view);
        case StateEntryActionEditPart.VISUAL_ID:
            return getAction_3034IncomingLinks(view);
        case StateInnerActionEditPart.VISUAL_ID:
            return getAction_3035IncomingLinks(view);
        case StateExitActionEditPart.VISUAL_ID:
            return getAction_3036IncomingLinks(view);
        case StateSuspensionTriggerEditPart.VISUAL_ID:
            return getAction_3037IncomingLinks(view);
        case TextualCodeEditPart.VISUAL_ID:
            return getTextualCode_3038IncomingLinks(view);
        case TransitionEditPart.VISUAL_ID:
            return getTransition_4004IncomingLinks(view);
        }
        return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<SyncchartsLinkDescriptor> getOutgoingLinks(View view) {
        switch (SyncchartsVisualIDRegistry.getVisualID(view)) {
        case StateEditPart.VISUAL_ID:
            return getState_2004OutgoingLinks(view);
        case Region2EditPart.VISUAL_ID:
            return getRegion_3031OutgoingLinks(view);
        case State2EditPart.VISUAL_ID:
            return getState_3032OutgoingLinks(view);
        case SignalEditPart.VISUAL_ID:
            return getSignal_3033OutgoingLinks(view);
        case StateEntryActionEditPart.VISUAL_ID:
            return getAction_3034OutgoingLinks(view);
        case StateInnerActionEditPart.VISUAL_ID:
            return getAction_3035OutgoingLinks(view);
        case StateExitActionEditPart.VISUAL_ID:
            return getAction_3036OutgoingLinks(view);
        case StateSuspensionTriggerEditPart.VISUAL_ID:
            return getAction_3037OutgoingLinks(view);
        case TextualCodeEditPart.VISUAL_ID:
            return getTextualCode_3038OutgoingLinks(view);
        case TransitionEditPart.VISUAL_ID:
            return getTransition_4004OutgoingLinks(view);
        }
        return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<SyncchartsLinkDescriptor> getRegion_1000ContainedLinks(
            View view) {
        return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<SyncchartsLinkDescriptor> getState_2004ContainedLinks(
            View view) {
        State modelElement = (State) view.getElement();
        LinkedList<SyncchartsLinkDescriptor> result =
                new LinkedList<SyncchartsLinkDescriptor>();
        result.addAll(getContainedTypeModelFacetLinks_Transition_4004(modelElement));
        return result;
    }

    /**
     * @generated
     */
    public static List<SyncchartsLinkDescriptor> getRegion_3031ContainedLinks(
            View view) {
        return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<SyncchartsLinkDescriptor> getState_3032ContainedLinks(
            View view) {
        State modelElement = (State) view.getElement();
        LinkedList<SyncchartsLinkDescriptor> result =
                new LinkedList<SyncchartsLinkDescriptor>();
        result.addAll(getContainedTypeModelFacetLinks_Transition_4004(modelElement));
        return result;
    }

    /**
     * @generated
     */
    public static List<SyncchartsLinkDescriptor> getSignal_3033ContainedLinks(
            View view) {
        return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<SyncchartsLinkDescriptor> getAction_3034ContainedLinks(
            View view) {
        return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<SyncchartsLinkDescriptor> getAction_3035ContainedLinks(
            View view) {
        return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<SyncchartsLinkDescriptor> getAction_3036ContainedLinks(
            View view) {
        return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<SyncchartsLinkDescriptor> getAction_3037ContainedLinks(
            View view) {
        return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<SyncchartsLinkDescriptor> getTextualCode_3038ContainedLinks(
            View view) {
        return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<SyncchartsLinkDescriptor> getTransition_4004ContainedLinks(
            View view) {
        return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<SyncchartsLinkDescriptor> getState_2004IncomingLinks(
            View view) {
        State modelElement = (State) view.getElement();
        Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences =
                EcoreUtil.CrossReferencer.find(view.eResource()
                        .getResourceSet().getResources());
        LinkedList<SyncchartsLinkDescriptor> result =
                new LinkedList<SyncchartsLinkDescriptor>();
        result.addAll(getIncomingTypeModelFacetLinks_Transition_4004(
                modelElement, crossReferences));
        return result;
    }

    /**
     * @generated
     */
    public static List<SyncchartsLinkDescriptor> getRegion_3031IncomingLinks(
            View view) {
        return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<SyncchartsLinkDescriptor> getState_3032IncomingLinks(
            View view) {
        State modelElement = (State) view.getElement();
        Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences =
                EcoreUtil.CrossReferencer.find(view.eResource()
                        .getResourceSet().getResources());
        LinkedList<SyncchartsLinkDescriptor> result =
                new LinkedList<SyncchartsLinkDescriptor>();
        result.addAll(getIncomingTypeModelFacetLinks_Transition_4004(
                modelElement, crossReferences));
        return result;
    }

    /**
     * @generated
     */
    public static List<SyncchartsLinkDescriptor> getSignal_3033IncomingLinks(
            View view) {
        return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<SyncchartsLinkDescriptor> getAction_3034IncomingLinks(
            View view) {
        return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<SyncchartsLinkDescriptor> getAction_3035IncomingLinks(
            View view) {
        return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<SyncchartsLinkDescriptor> getAction_3036IncomingLinks(
            View view) {
        return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<SyncchartsLinkDescriptor> getAction_3037IncomingLinks(
            View view) {
        return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<SyncchartsLinkDescriptor> getTextualCode_3038IncomingLinks(
            View view) {
        return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<SyncchartsLinkDescriptor> getTransition_4004IncomingLinks(
            View view) {
        return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<SyncchartsLinkDescriptor> getState_2004OutgoingLinks(
            View view) {
        State modelElement = (State) view.getElement();
        LinkedList<SyncchartsLinkDescriptor> result =
                new LinkedList<SyncchartsLinkDescriptor>();
        result.addAll(getOutgoingTypeModelFacetLinks_Transition_4004(modelElement));
        return result;
    }

    /**
     * @generated
     */
    public static List<SyncchartsLinkDescriptor> getRegion_3031OutgoingLinks(
            View view) {
        return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<SyncchartsLinkDescriptor> getState_3032OutgoingLinks(
            View view) {
        State modelElement = (State) view.getElement();
        LinkedList<SyncchartsLinkDescriptor> result =
                new LinkedList<SyncchartsLinkDescriptor>();
        result.addAll(getOutgoingTypeModelFacetLinks_Transition_4004(modelElement));
        return result;
    }

    /**
     * @generated
     */
    public static List<SyncchartsLinkDescriptor> getSignal_3033OutgoingLinks(
            View view) {
        return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<SyncchartsLinkDescriptor> getAction_3034OutgoingLinks(
            View view) {
        return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<SyncchartsLinkDescriptor> getAction_3035OutgoingLinks(
            View view) {
        return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<SyncchartsLinkDescriptor> getAction_3036OutgoingLinks(
            View view) {
        return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<SyncchartsLinkDescriptor> getAction_3037OutgoingLinks(
            View view) {
        return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<SyncchartsLinkDescriptor> getTextualCode_3038OutgoingLinks(
            View view) {
        return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<SyncchartsLinkDescriptor> getTransition_4004OutgoingLinks(
            View view) {
        return Collections.emptyList();
    }

    /**
     * @generated
     */
    private static Collection<SyncchartsLinkDescriptor> getContainedTypeModelFacetLinks_Transition_4004(
            State container) {
        LinkedList<SyncchartsLinkDescriptor> result =
                new LinkedList<SyncchartsLinkDescriptor>();
        for (Iterator<?> links = container.getOutgoingTransitions().iterator(); links
                .hasNext();) {
            EObject linkObject = (EObject) links.next();
            if (false == linkObject instanceof Transition) {
                continue;
            }
            Transition link = (Transition) linkObject;
            if (TransitionEditPart.VISUAL_ID != SyncchartsVisualIDRegistry
                    .getLinkWithClassVisualID(link)) {
                continue;
            }
            State dst = link.getTargetState();
            State src = link.getSourceState();
            result.add(new SyncchartsLinkDescriptor(src, dst, link,
                    SyncchartsElementTypes.Transition_4004,
                    TransitionEditPart.VISUAL_ID));
        }
        return result;
    }

    /**
     * @generated
     */
    private static Collection<SyncchartsLinkDescriptor> getIncomingTypeModelFacetLinks_Transition_4004(
            State target,
            Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
        LinkedList<SyncchartsLinkDescriptor> result =
                new LinkedList<SyncchartsLinkDescriptor>();
        Collection<EStructuralFeature.Setting> settings =
                crossReferences.get(target);
        for (EStructuralFeature.Setting setting : settings) {
            if (setting.getEStructuralFeature() != SyncchartsPackage.eINSTANCE
                    .getTransition_TargetState()
                    || false == setting.getEObject() instanceof Transition) {
                continue;
            }
            Transition link = (Transition) setting.getEObject();
            if (TransitionEditPart.VISUAL_ID != SyncchartsVisualIDRegistry
                    .getLinkWithClassVisualID(link)) {
                continue;
            }
            State src = link.getSourceState();
            result.add(new SyncchartsLinkDescriptor(src, target, link,
                    SyncchartsElementTypes.Transition_4004,
                    TransitionEditPart.VISUAL_ID));
        }
        return result;
    }

    /**
     * @generated
     */
    private static Collection<SyncchartsLinkDescriptor> getOutgoingTypeModelFacetLinks_Transition_4004(
            State source) {
        State container = null;
        // Find container element for the link.
        // Climb up by containment hierarchy starting from the source
        // and return the first element that is instance of the container class.
        for (EObject element = source; element != null && container == null; element =
                element.eContainer()) {
            if (element instanceof State) {
                container = (State) element;
            }
        }
        if (container == null) {
            return Collections.emptyList();
        }
        LinkedList<SyncchartsLinkDescriptor> result =
                new LinkedList<SyncchartsLinkDescriptor>();
        for (Iterator<?> links = container.getOutgoingTransitions().iterator(); links
                .hasNext();) {
            EObject linkObject = (EObject) links.next();
            if (false == linkObject instanceof Transition) {
                continue;
            }
            Transition link = (Transition) linkObject;
            if (TransitionEditPart.VISUAL_ID != SyncchartsVisualIDRegistry
                    .getLinkWithClassVisualID(link)) {
                continue;
            }
            State dst = link.getTargetState();
            State src = link.getSourceState();
            if (src != source) {
                continue;
            }
            result.add(new SyncchartsLinkDescriptor(src, dst, link,
                    SyncchartsElementTypes.Transition_4004,
                    TransitionEditPart.VISUAL_ID));
        }
        return result;
    }

}
