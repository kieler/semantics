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
    public static List getSemanticChildren(View view) {
        switch (SyncchartsVisualIDRegistry.getVisualID(view)) {
        case StateEditPart.VISUAL_ID:
            return getState_2003SemanticChildren(view);
        case State2EditPart.VISUAL_ID:
            return getState_3024SemanticChildren(view);
        case StateSignalCompartment2EditPart.VISUAL_ID:
            return getStateCompartment_7028SemanticChildren(view);
        case StateEntryActionCompartment2EditPart.VISUAL_ID:
            return getStateCompartment_7029SemanticChildren(view);
        case StateInnerActionCompartment2EditPart.VISUAL_ID:
            return getStateCompartment_7030SemanticChildren(view);
        case StateExitActionCompartment2EditPart.VISUAL_ID:
            return getStateCompartment_7031SemanticChildren(view);
        case StateSuspensionTriggerCompartment2EditPart.VISUAL_ID:
            return getStateCompartment_7032SemanticChildren(view);
        case StateRegionCompartmentEditPart.VISUAL_ID:
            return getStateRegionCompartment_7033SemanticChildren(view);
        case RegionStateCompartmentEditPart.VISUAL_ID:
            return getRegionStateCompartment_7034SemanticChildren(view);
        case StateSignalCompartmentEditPart.VISUAL_ID:
            return getStateCompartment_7035SemanticChildren(view);
        case StateEntryActionCompartmentEditPart.VISUAL_ID:
            return getStateCompartment_7036SemanticChildren(view);
        case StateInnerActionCompartmentEditPart.VISUAL_ID:
            return getStateCompartment_7037SemanticChildren(view);
        case StateExitActionCompartmentEditPart.VISUAL_ID:
            return getStateCompartment_7038SemanticChildren(view);
        case StateSuspensionTriggerCompartmentEditPart.VISUAL_ID:
            return getStateCompartment_7039SemanticChildren(view);
        case StateRegionCompartment2EditPart.VISUAL_ID:
            return getStateRegionCompartment_7040SemanticChildren(view);
        case RegionEditPart.VISUAL_ID:
            return getRegion_1000SemanticChildren(view);
        }
        return Collections.EMPTY_LIST;
    }

    /**
     * @generated
     */
    public static List getState_2003SemanticChildren(View view) {
        if (!view.isSetElement()) {
            return Collections.EMPTY_LIST;
        }
        State modelElement = (State) view.getElement();
        List result = new LinkedList();
        {
            TextualCode childElement = modelElement.getBodyText();
            int visualID = SyncchartsVisualIDRegistry.getNodeVisualID(view,
                    childElement);
            if (visualID == TextualCodeEditPart.VISUAL_ID) {
                result
                        .add(new SyncchartsNodeDescriptor(childElement,
                                visualID));
            }
        }
        return result;
    }

    /**
     * @generated
     */
    public static List getState_3024SemanticChildren(View view) {
        if (!view.isSetElement()) {
            return Collections.EMPTY_LIST;
        }
        State modelElement = (State) view.getElement();
        List result = new LinkedList();
        {
            TextualCode childElement = modelElement.getBodyText();
            int visualID = SyncchartsVisualIDRegistry.getNodeVisualID(view,
                    childElement);
            if (visualID == TextualCodeEditPart.VISUAL_ID) {
                result
                        .add(new SyncchartsNodeDescriptor(childElement,
                                visualID));
            }
        }
        return result;
    }

    /**
     * @generated
     */
    public static List getStateCompartment_7028SemanticChildren(View view) {
        if (false == view.eContainer() instanceof View) {
            return Collections.EMPTY_LIST;
        }
        View containerView = (View) view.eContainer();
        if (!containerView.isSetElement()) {
            return Collections.EMPTY_LIST;
        }
        State modelElement = (State) containerView.getElement();
        List result = new LinkedList();
        for (Iterator it = modelElement.getSignals().iterator(); it.hasNext();) {
            Signal childElement = (Signal) it.next();
            int visualID = SyncchartsVisualIDRegistry.getNodeVisualID(view,
                    childElement);
            if (visualID == SignalEditPart.VISUAL_ID) {
                result
                        .add(new SyncchartsNodeDescriptor(childElement,
                                visualID));
                continue;
            }
        }
        return result;
    }

    /**
     * @generated
     */
    public static List getStateCompartment_7029SemanticChildren(View view) {
        if (false == view.eContainer() instanceof View) {
            return Collections.EMPTY_LIST;
        }
        View containerView = (View) view.eContainer();
        if (!containerView.isSetElement()) {
            return Collections.EMPTY_LIST;
        }
        State modelElement = (State) containerView.getElement();
        List result = new LinkedList();
        for (Iterator it = modelElement.getEntryActions().iterator(); it
                .hasNext();) {
            Action childElement = (Action) it.next();
            int visualID = SyncchartsVisualIDRegistry.getNodeVisualID(view,
                    childElement);
            if (visualID == StateEntryActionEditPart.VISUAL_ID) {
                result
                        .add(new SyncchartsNodeDescriptor(childElement,
                                visualID));
                continue;
            }
        }
        return result;
    }

    /**
     * @generated
     */
    public static List getStateCompartment_7030SemanticChildren(View view) {
        if (false == view.eContainer() instanceof View) {
            return Collections.EMPTY_LIST;
        }
        View containerView = (View) view.eContainer();
        if (!containerView.isSetElement()) {
            return Collections.EMPTY_LIST;
        }
        State modelElement = (State) containerView.getElement();
        List result = new LinkedList();
        for (Iterator it = modelElement.getInnerActions().iterator(); it
                .hasNext();) {
            Action childElement = (Action) it.next();
            int visualID = SyncchartsVisualIDRegistry.getNodeVisualID(view,
                    childElement);
            if (visualID == StateInnerActionEditPart.VISUAL_ID) {
                result
                        .add(new SyncchartsNodeDescriptor(childElement,
                                visualID));
                continue;
            }
        }
        return result;
    }

    /**
     * @generated
     */
    public static List getStateCompartment_7031SemanticChildren(View view) {
        if (false == view.eContainer() instanceof View) {
            return Collections.EMPTY_LIST;
        }
        View containerView = (View) view.eContainer();
        if (!containerView.isSetElement()) {
            return Collections.EMPTY_LIST;
        }
        State modelElement = (State) containerView.getElement();
        List result = new LinkedList();
        for (Iterator it = modelElement.getExitActions().iterator(); it
                .hasNext();) {
            Action childElement = (Action) it.next();
            int visualID = SyncchartsVisualIDRegistry.getNodeVisualID(view,
                    childElement);
            if (visualID == StateExitActionEditPart.VISUAL_ID) {
                result
                        .add(new SyncchartsNodeDescriptor(childElement,
                                visualID));
                continue;
            }
        }
        return result;
    }

    /**
     * @generated
     */
    public static List getStateCompartment_7032SemanticChildren(View view) {
        if (false == view.eContainer() instanceof View) {
            return Collections.EMPTY_LIST;
        }
        View containerView = (View) view.eContainer();
        if (!containerView.isSetElement()) {
            return Collections.EMPTY_LIST;
        }
        State modelElement = (State) containerView.getElement();
        List result = new LinkedList();
        {
            Action childElement = modelElement.getSuspensionTrigger();
            int visualID = SyncchartsVisualIDRegistry.getNodeVisualID(view,
                    childElement);
            if (visualID == StateSuspensionTriggerEditPart.VISUAL_ID) {
                result
                        .add(new SyncchartsNodeDescriptor(childElement,
                                visualID));
            }
        }
        return result;
    }

    /**
     * @generated
     */
    public static List getStateRegionCompartment_7033SemanticChildren(View view) {
        if (false == view.eContainer() instanceof View) {
            return Collections.EMPTY_LIST;
        }
        View containerView = (View) view.eContainer();
        if (!containerView.isSetElement()) {
            return Collections.EMPTY_LIST;
        }
        State modelElement = (State) containerView.getElement();
        List result = new LinkedList();
        for (Iterator it = modelElement.getRegions().iterator(); it.hasNext();) {
            Region childElement = (Region) it.next();
            int visualID = SyncchartsVisualIDRegistry.getNodeVisualID(view,
                    childElement);
            if (visualID == Region2EditPart.VISUAL_ID) {
                result
                        .add(new SyncchartsNodeDescriptor(childElement,
                                visualID));
                continue;
            }
        }
        return result;
    }

    /**
     * @generated
     */
    public static List getRegionStateCompartment_7034SemanticChildren(View view) {
        if (false == view.eContainer() instanceof View) {
            return Collections.EMPTY_LIST;
        }
        View containerView = (View) view.eContainer();
        if (!containerView.isSetElement()) {
            return Collections.EMPTY_LIST;
        }
        Region modelElement = (Region) containerView.getElement();
        List result = new LinkedList();
        for (Iterator it = modelElement.getInnerStates().iterator(); it
                .hasNext();) {
            State childElement = (State) it.next();
            int visualID = SyncchartsVisualIDRegistry.getNodeVisualID(view,
                    childElement);
            if (visualID == State2EditPart.VISUAL_ID) {
                result
                        .add(new SyncchartsNodeDescriptor(childElement,
                                visualID));
                continue;
            }
        }
        return result;
    }

    /**
     * @generated
     */
    public static List getStateCompartment_7035SemanticChildren(View view) {
        if (false == view.eContainer() instanceof View) {
            return Collections.EMPTY_LIST;
        }
        View containerView = (View) view.eContainer();
        if (!containerView.isSetElement()) {
            return Collections.EMPTY_LIST;
        }
        State modelElement = (State) containerView.getElement();
        List result = new LinkedList();
        for (Iterator it = modelElement.getSignals().iterator(); it.hasNext();) {
            Signal childElement = (Signal) it.next();
            int visualID = SyncchartsVisualIDRegistry.getNodeVisualID(view,
                    childElement);
            if (visualID == SignalEditPart.VISUAL_ID) {
                result
                        .add(new SyncchartsNodeDescriptor(childElement,
                                visualID));
                continue;
            }
        }
        return result;
    }

    /**
     * @generated
     */
    public static List getStateCompartment_7036SemanticChildren(View view) {
        if (false == view.eContainer() instanceof View) {
            return Collections.EMPTY_LIST;
        }
        View containerView = (View) view.eContainer();
        if (!containerView.isSetElement()) {
            return Collections.EMPTY_LIST;
        }
        State modelElement = (State) containerView.getElement();
        List result = new LinkedList();
        for (Iterator it = modelElement.getEntryActions().iterator(); it
                .hasNext();) {
            Action childElement = (Action) it.next();
            int visualID = SyncchartsVisualIDRegistry.getNodeVisualID(view,
                    childElement);
            if (visualID == StateEntryActionEditPart.VISUAL_ID) {
                result
                        .add(new SyncchartsNodeDescriptor(childElement,
                                visualID));
                continue;
            }
        }
        return result;
    }

    /**
     * @generated
     */
    public static List getStateCompartment_7037SemanticChildren(View view) {
        if (false == view.eContainer() instanceof View) {
            return Collections.EMPTY_LIST;
        }
        View containerView = (View) view.eContainer();
        if (!containerView.isSetElement()) {
            return Collections.EMPTY_LIST;
        }
        State modelElement = (State) containerView.getElement();
        List result = new LinkedList();
        for (Iterator it = modelElement.getInnerActions().iterator(); it
                .hasNext();) {
            Action childElement = (Action) it.next();
            int visualID = SyncchartsVisualIDRegistry.getNodeVisualID(view,
                    childElement);
            if (visualID == StateInnerActionEditPart.VISUAL_ID) {
                result
                        .add(new SyncchartsNodeDescriptor(childElement,
                                visualID));
                continue;
            }
        }
        return result;
    }

    /**
     * @generated
     */
    public static List getStateCompartment_7038SemanticChildren(View view) {
        if (false == view.eContainer() instanceof View) {
            return Collections.EMPTY_LIST;
        }
        View containerView = (View) view.eContainer();
        if (!containerView.isSetElement()) {
            return Collections.EMPTY_LIST;
        }
        State modelElement = (State) containerView.getElement();
        List result = new LinkedList();
        for (Iterator it = modelElement.getExitActions().iterator(); it
                .hasNext();) {
            Action childElement = (Action) it.next();
            int visualID = SyncchartsVisualIDRegistry.getNodeVisualID(view,
                    childElement);
            if (visualID == StateExitActionEditPart.VISUAL_ID) {
                result
                        .add(new SyncchartsNodeDescriptor(childElement,
                                visualID));
                continue;
            }
        }
        return result;
    }

    /**
     * @generated
     */
    public static List getStateCompartment_7039SemanticChildren(View view) {
        if (false == view.eContainer() instanceof View) {
            return Collections.EMPTY_LIST;
        }
        View containerView = (View) view.eContainer();
        if (!containerView.isSetElement()) {
            return Collections.EMPTY_LIST;
        }
        State modelElement = (State) containerView.getElement();
        List result = new LinkedList();
        {
            Action childElement = modelElement.getSuspensionTrigger();
            int visualID = SyncchartsVisualIDRegistry.getNodeVisualID(view,
                    childElement);
            if (visualID == StateSuspensionTriggerEditPart.VISUAL_ID) {
                result
                        .add(new SyncchartsNodeDescriptor(childElement,
                                visualID));
            }
        }
        return result;
    }

    /**
     * @generated
     */
    public static List getStateRegionCompartment_7040SemanticChildren(View view) {
        if (false == view.eContainer() instanceof View) {
            return Collections.EMPTY_LIST;
        }
        View containerView = (View) view.eContainer();
        if (!containerView.isSetElement()) {
            return Collections.EMPTY_LIST;
        }
        State modelElement = (State) containerView.getElement();
        List result = new LinkedList();
        for (Iterator it = modelElement.getRegions().iterator(); it.hasNext();) {
            Region childElement = (Region) it.next();
            int visualID = SyncchartsVisualIDRegistry.getNodeVisualID(view,
                    childElement);
            if (visualID == Region2EditPart.VISUAL_ID) {
                result
                        .add(new SyncchartsNodeDescriptor(childElement,
                                visualID));
                continue;
            }
        }
        return result;
    }

    /**
     * @generated
     */
    public static List getRegion_1000SemanticChildren(View view) {
        if (!view.isSetElement()) {
            return Collections.EMPTY_LIST;
        }
        Region modelElement = (Region) view.getElement();
        List result = new LinkedList();
        for (Iterator it = modelElement.getInnerStates().iterator(); it
                .hasNext();) {
            State childElement = (State) it.next();
            int visualID = SyncchartsVisualIDRegistry.getNodeVisualID(view,
                    childElement);
            if (visualID == StateEditPart.VISUAL_ID) {
                result
                        .add(new SyncchartsNodeDescriptor(childElement,
                                visualID));
                continue;
            }
        }
        return result;
    }

    /**
     * @generated
     */
    public static List getContainedLinks(View view) {
        switch (SyncchartsVisualIDRegistry.getVisualID(view)) {
        case RegionEditPart.VISUAL_ID:
            return getRegion_1000ContainedLinks(view);
        case StateEditPart.VISUAL_ID:
            return getState_2003ContainedLinks(view);
        case Region2EditPart.VISUAL_ID:
            return getRegion_3023ContainedLinks(view);
        case State2EditPart.VISUAL_ID:
            return getState_3024ContainedLinks(view);
        case SignalEditPart.VISUAL_ID:
            return getSignal_3025ContainedLinks(view);
        case StateEntryActionEditPart.VISUAL_ID:
            return getAction_3026ContainedLinks(view);
        case StateInnerActionEditPart.VISUAL_ID:
            return getAction_3027ContainedLinks(view);
        case StateExitActionEditPart.VISUAL_ID:
            return getAction_3028ContainedLinks(view);
        case StateSuspensionTriggerEditPart.VISUAL_ID:
            return getAction_3029ContainedLinks(view);
        case TextualCodeEditPart.VISUAL_ID:
            return getTextualCode_3030ContainedLinks(view);
        case TransitionEditPart.VISUAL_ID:
            return getTransition_4003ContainedLinks(view);
        }
        return Collections.EMPTY_LIST;
    }

    /**
     * @generated
     */
    public static List getIncomingLinks(View view) {
        switch (SyncchartsVisualIDRegistry.getVisualID(view)) {
        case StateEditPart.VISUAL_ID:
            return getState_2003IncomingLinks(view);
        case Region2EditPart.VISUAL_ID:
            return getRegion_3023IncomingLinks(view);
        case State2EditPart.VISUAL_ID:
            return getState_3024IncomingLinks(view);
        case SignalEditPart.VISUAL_ID:
            return getSignal_3025IncomingLinks(view);
        case StateEntryActionEditPart.VISUAL_ID:
            return getAction_3026IncomingLinks(view);
        case StateInnerActionEditPart.VISUAL_ID:
            return getAction_3027IncomingLinks(view);
        case StateExitActionEditPart.VISUAL_ID:
            return getAction_3028IncomingLinks(view);
        case StateSuspensionTriggerEditPart.VISUAL_ID:
            return getAction_3029IncomingLinks(view);
        case TextualCodeEditPart.VISUAL_ID:
            return getTextualCode_3030IncomingLinks(view);
        case TransitionEditPart.VISUAL_ID:
            return getTransition_4003IncomingLinks(view);
        }
        return Collections.EMPTY_LIST;
    }

    /**
     * @generated
     */
    public static List getOutgoingLinks(View view) {
        switch (SyncchartsVisualIDRegistry.getVisualID(view)) {
        case StateEditPart.VISUAL_ID:
            return getState_2003OutgoingLinks(view);
        case Region2EditPart.VISUAL_ID:
            return getRegion_3023OutgoingLinks(view);
        case State2EditPart.VISUAL_ID:
            return getState_3024OutgoingLinks(view);
        case SignalEditPart.VISUAL_ID:
            return getSignal_3025OutgoingLinks(view);
        case StateEntryActionEditPart.VISUAL_ID:
            return getAction_3026OutgoingLinks(view);
        case StateInnerActionEditPart.VISUAL_ID:
            return getAction_3027OutgoingLinks(view);
        case StateExitActionEditPart.VISUAL_ID:
            return getAction_3028OutgoingLinks(view);
        case StateSuspensionTriggerEditPart.VISUAL_ID:
            return getAction_3029OutgoingLinks(view);
        case TextualCodeEditPart.VISUAL_ID:
            return getTextualCode_3030OutgoingLinks(view);
        case TransitionEditPart.VISUAL_ID:
            return getTransition_4003OutgoingLinks(view);
        }
        return Collections.EMPTY_LIST;
    }

    /**
     * @generated
     */
    public static List getRegion_1000ContainedLinks(View view) {
        return Collections.EMPTY_LIST;
    }

    /**
     * @generated
     */
    public static List getState_2003ContainedLinks(View view) {
        State modelElement = (State) view.getElement();
        List result = new LinkedList();
        result
                .addAll(getContainedTypeModelFacetLinks_Transition_4003(modelElement));
        return result;
    }

    /**
     * @generated
     */
    public static List getRegion_3023ContainedLinks(View view) {
        return Collections.EMPTY_LIST;
    }

    /**
     * @generated
     */
    public static List getState_3024ContainedLinks(View view) {
        State modelElement = (State) view.getElement();
        List result = new LinkedList();
        result
                .addAll(getContainedTypeModelFacetLinks_Transition_4003(modelElement));
        return result;
    }

    /**
     * @generated
     */
    public static List getSignal_3025ContainedLinks(View view) {
        return Collections.EMPTY_LIST;
    }

    /**
     * @generated
     */
    public static List getAction_3026ContainedLinks(View view) {
        return Collections.EMPTY_LIST;
    }

    /**
     * @generated
     */
    public static List getAction_3027ContainedLinks(View view) {
        return Collections.EMPTY_LIST;
    }

    /**
     * @generated
     */
    public static List getAction_3028ContainedLinks(View view) {
        return Collections.EMPTY_LIST;
    }

    /**
     * @generated
     */
    public static List getAction_3029ContainedLinks(View view) {
        return Collections.EMPTY_LIST;
    }

    /**
     * @generated
     */
    public static List getTextualCode_3030ContainedLinks(View view) {
        return Collections.EMPTY_LIST;
    }

    /**
     * @generated
     */
    public static List getTransition_4003ContainedLinks(View view) {
        return Collections.EMPTY_LIST;
    }

    /**
     * @generated
     */
    public static List getState_2003IncomingLinks(View view) {
        State modelElement = (State) view.getElement();
        Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
                .getResourceSet().getResources());
        List result = new LinkedList();
        result.addAll(getIncomingTypeModelFacetLinks_Transition_4003(
                modelElement, crossReferences));
        return result;
    }

    /**
     * @generated
     */
    public static List getRegion_3023IncomingLinks(View view) {
        return Collections.EMPTY_LIST;
    }

    /**
     * @generated
     */
    public static List getState_3024IncomingLinks(View view) {
        State modelElement = (State) view.getElement();
        Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
                .getResourceSet().getResources());
        List result = new LinkedList();
        result.addAll(getIncomingTypeModelFacetLinks_Transition_4003(
                modelElement, crossReferences));
        return result;
    }

    /**
     * @generated
     */
    public static List getSignal_3025IncomingLinks(View view) {
        return Collections.EMPTY_LIST;
    }

    /**
     * @generated
     */
    public static List getAction_3026IncomingLinks(View view) {
        return Collections.EMPTY_LIST;
    }

    /**
     * @generated
     */
    public static List getAction_3027IncomingLinks(View view) {
        return Collections.EMPTY_LIST;
    }

    /**
     * @generated
     */
    public static List getAction_3028IncomingLinks(View view) {
        return Collections.EMPTY_LIST;
    }

    /**
     * @generated
     */
    public static List getAction_3029IncomingLinks(View view) {
        return Collections.EMPTY_LIST;
    }

    /**
     * @generated
     */
    public static List getTextualCode_3030IncomingLinks(View view) {
        return Collections.EMPTY_LIST;
    }

    /**
     * @generated
     */
    public static List getTransition_4003IncomingLinks(View view) {
        return Collections.EMPTY_LIST;
    }

    /**
     * @generated
     */
    public static List getState_2003OutgoingLinks(View view) {
        State modelElement = (State) view.getElement();
        List result = new LinkedList();
        result
                .addAll(getOutgoingTypeModelFacetLinks_Transition_4003(modelElement));
        return result;
    }

    /**
     * @generated
     */
    public static List getRegion_3023OutgoingLinks(View view) {
        return Collections.EMPTY_LIST;
    }

    /**
     * @generated
     */
    public static List getState_3024OutgoingLinks(View view) {
        State modelElement = (State) view.getElement();
        List result = new LinkedList();
        result
                .addAll(getOutgoingTypeModelFacetLinks_Transition_4003(modelElement));
        return result;
    }

    /**
     * @generated
     */
    public static List getSignal_3025OutgoingLinks(View view) {
        return Collections.EMPTY_LIST;
    }

    /**
     * @generated
     */
    public static List getAction_3026OutgoingLinks(View view) {
        return Collections.EMPTY_LIST;
    }

    /**
     * @generated
     */
    public static List getAction_3027OutgoingLinks(View view) {
        return Collections.EMPTY_LIST;
    }

    /**
     * @generated
     */
    public static List getAction_3028OutgoingLinks(View view) {
        return Collections.EMPTY_LIST;
    }

    /**
     * @generated
     */
    public static List getAction_3029OutgoingLinks(View view) {
        return Collections.EMPTY_LIST;
    }

    /**
     * @generated
     */
    public static List getTextualCode_3030OutgoingLinks(View view) {
        return Collections.EMPTY_LIST;
    }

    /**
     * @generated
     */
    public static List getTransition_4003OutgoingLinks(View view) {
        return Collections.EMPTY_LIST;
    }

    /**
     * @generated
     */
    private static Collection getContainedTypeModelFacetLinks_Transition_4003(
            State container) {
        Collection result = new LinkedList();
        for (Iterator links = container.getOutgoingTransitions().iterator(); links
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
                    SyncchartsElementTypes.Transition_4003,
                    TransitionEditPart.VISUAL_ID));
        }
        return result;
    }

    /**
     * @generated
     */
    private static Collection getIncomingTypeModelFacetLinks_Transition_4003(
            State target, Map crossReferences) {
        Collection result = new LinkedList();
        Collection settings = (Collection) crossReferences.get(target);
        for (Iterator it = settings.iterator(); it.hasNext();) {
            EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
                    .next();
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
                    SyncchartsElementTypes.Transition_4003,
                    TransitionEditPart.VISUAL_ID));
        }
        return result;
    }

    /**
     * @generated
     */
    private static Collection getOutgoingTypeModelFacetLinks_Transition_4003(
            State source) {
        State container = null;
        // Find container element for the link.
        // Climb up by containment hierarchy starting from the source
        // and return the first element that is instance of the container class.
        for (EObject element = source; element != null && container == null; element = element
                .eContainer()) {
            if (element instanceof State) {
                container = (State) element;
            }
        }
        if (container == null) {
            return Collections.EMPTY_LIST;
        }
        Collection result = new LinkedList();
        for (Iterator links = container.getOutgoingTransitions().iterator(); links
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
                    SyncchartsElementTypes.Transition_4003,
                    TransitionEditPart.VISUAL_ID));
        }
        return result;
    }

}
