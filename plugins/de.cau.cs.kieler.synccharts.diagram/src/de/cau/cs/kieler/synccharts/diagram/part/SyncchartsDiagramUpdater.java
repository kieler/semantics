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

import de.cau.cs.kieler.synccharts.Action;
import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.Signal;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.SyncchartsPackage;
import de.cau.cs.kieler.synccharts.TextualCode;
import de.cau.cs.kieler.synccharts.Transition;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.EntryActionEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.ExitActionEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.InnerActionEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.Region2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.RegionEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.RegionStateCompartmentEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.SignalEditPart;
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
import de.cau.cs.kieler.synccharts.diagram.edit.parts.SuspensionTriggerEditPart;
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
            return getState_2002SemanticChildren(view);
        case State2EditPart.VISUAL_ID:
            return getState_3010SemanticChildren(view);
        case StateSignalCompartmentEditPart.VISUAL_ID:
            return getStateCompartment_7015SemanticChildren(view);
        case StateEntryActionCompartmentEditPart.VISUAL_ID:
            return getStateCompartment_7016SemanticChildren(view);
        case StateInnerActionCompartmentEditPart.VISUAL_ID:
            return getStateCompartment_7017SemanticChildren(view);
        case StateExitActionCompartmentEditPart.VISUAL_ID:
            return getStateCompartment_7018SemanticChildren(view);
        case StateSuspensionTriggerCompartmentEditPart.VISUAL_ID:
            return getStateCompartment_7019SemanticChildren(view);
        case StateRegionCompartmentEditPart.VISUAL_ID:
            return getStateRegionCompartment_7020SemanticChildren(view);
        case RegionStateCompartmentEditPart.VISUAL_ID:
            return getRegionStateCompartment_7021SemanticChildren(view);
        case StateSignalCompartment2EditPart.VISUAL_ID:
            return getStateCompartment_7022SemanticChildren(view);
        case StateEntryActionCompartment2EditPart.VISUAL_ID:
            return getStateCompartment_7023SemanticChildren(view);
        case StateInnerActionCompartment2EditPart.VISUAL_ID:
            return getStateCompartment_7024SemanticChildren(view);
        case StateExitActionCompartment2EditPart.VISUAL_ID:
            return getStateCompartment_7025SemanticChildren(view);
        case StateSuspensionTriggerCompartment2EditPart.VISUAL_ID:
            return getStateCompartment_7026SemanticChildren(view);
        case StateRegionCompartment2EditPart.VISUAL_ID:
            return getStateRegionCompartment_7027SemanticChildren(view);
        case RegionEditPart.VISUAL_ID:
            return getRegion_1000SemanticChildren(view);
        }
        return Collections.EMPTY_LIST;
    }

    /**
     * @generated
     */
    public static List getState_2002SemanticChildren(View view) {
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
    public static List getState_3010SemanticChildren(View view) {
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
    public static List getStateCompartment_7015SemanticChildren(View view) {
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
    public static List getStateCompartment_7016SemanticChildren(View view) {
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
            if (visualID == EntryActionEditPart.VISUAL_ID) {
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
    public static List getStateCompartment_7017SemanticChildren(View view) {
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
            if (visualID == InnerActionEditPart.VISUAL_ID) {
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
    public static List getStateCompartment_7018SemanticChildren(View view) {
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
            if (visualID == ExitActionEditPart.VISUAL_ID) {
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
    public static List getStateCompartment_7019SemanticChildren(View view) {
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
            if (visualID == SuspensionTriggerEditPart.VISUAL_ID) {
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
    public static List getStateRegionCompartment_7020SemanticChildren(View view) {
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
    public static List getRegionStateCompartment_7021SemanticChildren(View view) {
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
    public static List getStateCompartment_7022SemanticChildren(View view) {
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
    public static List getStateCompartment_7023SemanticChildren(View view) {
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
            if (visualID == EntryActionEditPart.VISUAL_ID) {
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
    public static List getStateCompartment_7024SemanticChildren(View view) {
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
            if (visualID == InnerActionEditPart.VISUAL_ID) {
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
    public static List getStateCompartment_7025SemanticChildren(View view) {
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
            if (visualID == ExitActionEditPart.VISUAL_ID) {
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
    public static List getStateCompartment_7026SemanticChildren(View view) {
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
            if (visualID == SuspensionTriggerEditPart.VISUAL_ID) {
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
    public static List getStateRegionCompartment_7027SemanticChildren(View view) {
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
            return getState_2002ContainedLinks(view);
        case Region2EditPart.VISUAL_ID:
            return getRegion_3009ContainedLinks(view);
        case State2EditPart.VISUAL_ID:
            return getState_3010ContainedLinks(view);
        case SignalEditPart.VISUAL_ID:
            return getSignal_3011ContainedLinks(view);
        case EntryActionEditPart.VISUAL_ID:
            return getAction_3012ContainedLinks(view);
        case InnerActionEditPart.VISUAL_ID:
            return getAction_3014ContainedLinks(view);
        case ExitActionEditPart.VISUAL_ID:
            return getAction_3016ContainedLinks(view);
        case SuspensionTriggerEditPart.VISUAL_ID:
            return getAction_3018ContainedLinks(view);
        case TextualCodeEditPart.VISUAL_ID:
            return getTextualCode_3020ContainedLinks(view);
        case TransitionEditPart.VISUAL_ID:
            return getTransition_4002ContainedLinks(view);
        }
        return Collections.EMPTY_LIST;
    }

    /**
     * @generated
     */
    public static List getIncomingLinks(View view) {
        switch (SyncchartsVisualIDRegistry.getVisualID(view)) {
        case StateEditPart.VISUAL_ID:
            return getState_2002IncomingLinks(view);
        case Region2EditPart.VISUAL_ID:
            return getRegion_3009IncomingLinks(view);
        case State2EditPart.VISUAL_ID:
            return getState_3010IncomingLinks(view);
        case SignalEditPart.VISUAL_ID:
            return getSignal_3011IncomingLinks(view);
        case EntryActionEditPart.VISUAL_ID:
            return getAction_3012IncomingLinks(view);
        case InnerActionEditPart.VISUAL_ID:
            return getAction_3014IncomingLinks(view);
        case ExitActionEditPart.VISUAL_ID:
            return getAction_3016IncomingLinks(view);
        case SuspensionTriggerEditPart.VISUAL_ID:
            return getAction_3018IncomingLinks(view);
        case TextualCodeEditPart.VISUAL_ID:
            return getTextualCode_3020IncomingLinks(view);
        case TransitionEditPart.VISUAL_ID:
            return getTransition_4002IncomingLinks(view);
        }
        return Collections.EMPTY_LIST;
    }

    /**
     * @generated
     */
    public static List getOutgoingLinks(View view) {
        switch (SyncchartsVisualIDRegistry.getVisualID(view)) {
        case StateEditPart.VISUAL_ID:
            return getState_2002OutgoingLinks(view);
        case Region2EditPart.VISUAL_ID:
            return getRegion_3009OutgoingLinks(view);
        case State2EditPart.VISUAL_ID:
            return getState_3010OutgoingLinks(view);
        case SignalEditPart.VISUAL_ID:
            return getSignal_3011OutgoingLinks(view);
        case EntryActionEditPart.VISUAL_ID:
            return getAction_3012OutgoingLinks(view);
        case InnerActionEditPart.VISUAL_ID:
            return getAction_3014OutgoingLinks(view);
        case ExitActionEditPart.VISUAL_ID:
            return getAction_3016OutgoingLinks(view);
        case SuspensionTriggerEditPart.VISUAL_ID:
            return getAction_3018OutgoingLinks(view);
        case TextualCodeEditPart.VISUAL_ID:
            return getTextualCode_3020OutgoingLinks(view);
        case TransitionEditPart.VISUAL_ID:
            return getTransition_4002OutgoingLinks(view);
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
    public static List getState_2002ContainedLinks(View view) {
        State modelElement = (State) view.getElement();
        List result = new LinkedList();
        result
                .addAll(getContainedTypeModelFacetLinks_Transition_4002(modelElement));
        return result;
    }

    /**
     * @generated
     */
    public static List getRegion_3009ContainedLinks(View view) {
        return Collections.EMPTY_LIST;
    }

    /**
     * @generated
     */
    public static List getState_3010ContainedLinks(View view) {
        State modelElement = (State) view.getElement();
        List result = new LinkedList();
        result
                .addAll(getContainedTypeModelFacetLinks_Transition_4002(modelElement));
        return result;
    }

    /**
     * @generated
     */
    public static List getSignal_3011ContainedLinks(View view) {
        return Collections.EMPTY_LIST;
    }

    /**
     * @generated
     */
    public static List getAction_3012ContainedLinks(View view) {
        return Collections.EMPTY_LIST;
    }

    /**
     * @generated
     */
    public static List getAction_3014ContainedLinks(View view) {
        return Collections.EMPTY_LIST;
    }

    /**
     * @generated
     */
    public static List getAction_3016ContainedLinks(View view) {
        return Collections.EMPTY_LIST;
    }

    /**
     * @generated
     */
    public static List getAction_3018ContainedLinks(View view) {
        return Collections.EMPTY_LIST;
    }

    /**
     * @generated
     */
    public static List getTextualCode_3020ContainedLinks(View view) {
        return Collections.EMPTY_LIST;
    }

    /**
     * @generated
     */
    public static List getTransition_4002ContainedLinks(View view) {
        return Collections.EMPTY_LIST;
    }

    /**
     * @generated
     */
    public static List getState_2002IncomingLinks(View view) {
        State modelElement = (State) view.getElement();
        Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
                .getResourceSet().getResources());
        List result = new LinkedList();
        result.addAll(getIncomingTypeModelFacetLinks_Transition_4002(
                modelElement, crossReferences));
        return result;
    }

    /**
     * @generated
     */
    public static List getRegion_3009IncomingLinks(View view) {
        return Collections.EMPTY_LIST;
    }

    /**
     * @generated
     */
    public static List getState_3010IncomingLinks(View view) {
        State modelElement = (State) view.getElement();
        Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
                .getResourceSet().getResources());
        List result = new LinkedList();
        result.addAll(getIncomingTypeModelFacetLinks_Transition_4002(
                modelElement, crossReferences));
        return result;
    }

    /**
     * @generated
     */
    public static List getSignal_3011IncomingLinks(View view) {
        return Collections.EMPTY_LIST;
    }

    /**
     * @generated
     */
    public static List getAction_3012IncomingLinks(View view) {
        return Collections.EMPTY_LIST;
    }

    /**
     * @generated
     */
    public static List getAction_3014IncomingLinks(View view) {
        return Collections.EMPTY_LIST;
    }

    /**
     * @generated
     */
    public static List getAction_3016IncomingLinks(View view) {
        return Collections.EMPTY_LIST;
    }

    /**
     * @generated
     */
    public static List getAction_3018IncomingLinks(View view) {
        return Collections.EMPTY_LIST;
    }

    /**
     * @generated
     */
    public static List getTextualCode_3020IncomingLinks(View view) {
        return Collections.EMPTY_LIST;
    }

    /**
     * @generated
     */
    public static List getTransition_4002IncomingLinks(View view) {
        return Collections.EMPTY_LIST;
    }

    /**
     * @generated
     */
    public static List getState_2002OutgoingLinks(View view) {
        State modelElement = (State) view.getElement();
        List result = new LinkedList();
        result
                .addAll(getOutgoingTypeModelFacetLinks_Transition_4002(modelElement));
        return result;
    }

    /**
     * @generated
     */
    public static List getRegion_3009OutgoingLinks(View view) {
        return Collections.EMPTY_LIST;
    }

    /**
     * @generated
     */
    public static List getState_3010OutgoingLinks(View view) {
        State modelElement = (State) view.getElement();
        List result = new LinkedList();
        result
                .addAll(getOutgoingTypeModelFacetLinks_Transition_4002(modelElement));
        return result;
    }

    /**
     * @generated
     */
    public static List getSignal_3011OutgoingLinks(View view) {
        return Collections.EMPTY_LIST;
    }

    /**
     * @generated
     */
    public static List getAction_3012OutgoingLinks(View view) {
        return Collections.EMPTY_LIST;
    }

    /**
     * @generated
     */
    public static List getAction_3014OutgoingLinks(View view) {
        return Collections.EMPTY_LIST;
    }

    /**
     * @generated
     */
    public static List getAction_3016OutgoingLinks(View view) {
        return Collections.EMPTY_LIST;
    }

    /**
     * @generated
     */
    public static List getAction_3018OutgoingLinks(View view) {
        return Collections.EMPTY_LIST;
    }

    /**
     * @generated
     */
    public static List getTextualCode_3020OutgoingLinks(View view) {
        return Collections.EMPTY_LIST;
    }

    /**
     * @generated
     */
    public static List getTransition_4002OutgoingLinks(View view) {
        return Collections.EMPTY_LIST;
    }

    /**
     * @generated
     */
    private static Collection getContainedTypeModelFacetLinks_Transition_4002(
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
                    SyncchartsElementTypes.Transition_4002,
                    TransitionEditPart.VISUAL_ID));
        }
        return result;
    }

    /**
     * @generated
     */
    private static Collection getIncomingTypeModelFacetLinks_Transition_4002(
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
                    SyncchartsElementTypes.Transition_4002,
                    TransitionEditPart.VISUAL_ID));
        }
        return result;
    }

    /**
     * @generated
     */
    private static Collection getOutgoingTypeModelFacetLinks_Transition_4002(
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
                    SyncchartsElementTypes.Transition_4002,
                    TransitionEditPart.VISUAL_ID));
        }
        return result;
    }

}
