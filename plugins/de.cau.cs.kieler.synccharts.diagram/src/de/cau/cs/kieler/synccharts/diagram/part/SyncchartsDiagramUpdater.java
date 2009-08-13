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
import de.cau.cs.kieler.synccharts.Transition;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.Action2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.Action3EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.Action4EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.ActionEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.Region2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.RegionEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.RegionStateCompartmentEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.SignalEditPart;
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
        case StateSignalEditPart.VISUAL_ID:
            return getStateSignal_7001SemanticChildren(view);
        case StateOnEntryActionEditPart.VISUAL_ID:
            return getStateOnEntryAction_7002SemanticChildren(view);
        case StateOnInsideActionEditPart.VISUAL_ID:
            return getStateOnInsideAction_7003SemanticChildren(view);
        case StateOnExitActionEditPart.VISUAL_ID:
            return getStateOnExitAction_7004SemanticChildren(view);
        case StateSuspendEditPart.VISUAL_ID:
            return getStateSuspend_7005SemanticChildren(view);
        case StateRegionCompartmentEditPart.VISUAL_ID:
            return getStateRegionCompartment_7006SemanticChildren(view);
        case RegionStateCompartmentEditPart.VISUAL_ID:
            return getRegionStateCompartment_7008SemanticChildren(view);
        case StateSignal2EditPart.VISUAL_ID:
            return getStateSignal_7009SemanticChildren(view);
        case StateOnEntryAction2EditPart.VISUAL_ID:
            return getStateOnEntryAction_7010SemanticChildren(view);
        case StateOnInsideAction2EditPart.VISUAL_ID:
            return getStateOnInsideAction_7011SemanticChildren(view);
        case StateOnExitAction2EditPart.VISUAL_ID:
            return getStateOnExitAction_7012SemanticChildren(view);
        case StateSuspend2EditPart.VISUAL_ID:
            return getStateSuspend_7013SemanticChildren(view);
        case StateRegionCompartment2EditPart.VISUAL_ID:
            return getStateRegionCompartment_7014SemanticChildren(view);
        case RegionEditPart.VISUAL_ID:
            return getRegion_1000SemanticChildren(view);
        }
        return Collections.EMPTY_LIST;
    }

    /**
     * @generated
     */
    public static List getStateSignal_7001SemanticChildren(View view) {
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
            int visualID = SyncchartsVisualIDRegistry.getNodeVisualID(view, childElement);
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
    public static List getStateOnEntryAction_7002SemanticChildren(View view) {
        if (false == view.eContainer() instanceof View) {
            return Collections.EMPTY_LIST;
        }
        View containerView = (View) view.eContainer();
        if (!containerView.isSetElement()) {
            return Collections.EMPTY_LIST;
        }
        State modelElement = (State) containerView.getElement();
        List result = new LinkedList();
        for (Iterator it = modelElement.getEntryActions().iterator(); it.hasNext();) {
            Action childElement = (Action) it.next();
            int visualID = SyncchartsVisualIDRegistry.getNodeVisualID(view, childElement);
            if (visualID == ActionEditPart.VISUAL_ID) {
                result.add(new SyncchartsNodeDescriptor(childElement, visualID));
                continue;
            }
        }
        return result;
    }

    /**
     * @generated
     */
    public static List getStateOnInsideAction_7003SemanticChildren(View view) {
        if (false == view.eContainer() instanceof View) {
            return Collections.EMPTY_LIST;
        }
        View containerView = (View) view.eContainer();
        if (!containerView.isSetElement()) {
            return Collections.EMPTY_LIST;
        }
        State modelElement = (State) containerView.getElement();
        List result = new LinkedList();
        for (Iterator it = modelElement.getInnerActions().iterator(); it.hasNext();) {
            Action childElement = (Action) it.next();
            int visualID = SyncchartsVisualIDRegistry.getNodeVisualID(view, childElement);
            if (visualID == Action2EditPart.VISUAL_ID) {
                result.add(new SyncchartsNodeDescriptor(childElement, visualID));
                continue;
            }
        }
        return result;
    }

    /**
     * @generated
     */
    public static List getStateOnExitAction_7004SemanticChildren(View view) {
        if (false == view.eContainer() instanceof View) {
            return Collections.EMPTY_LIST;
        }
        View containerView = (View) view.eContainer();
        if (!containerView.isSetElement()) {
            return Collections.EMPTY_LIST;
        }
        State modelElement = (State) containerView.getElement();
        List result = new LinkedList();
        for (Iterator it = modelElement.getExitActions().iterator(); it.hasNext();) {
            Action childElement = (Action) it.next();
            int visualID = SyncchartsVisualIDRegistry.getNodeVisualID(view, childElement);
            if (visualID == Action3EditPart.VISUAL_ID) {
                result.add(new SyncchartsNodeDescriptor(childElement, visualID));
                continue;
            }
        }
        return result;
    }

    /**
     * @generated
     */
    public static List getStateSuspend_7005SemanticChildren(View view) {
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
            int visualID = SyncchartsVisualIDRegistry.getNodeVisualID(view, childElement);
            if (visualID == Action4EditPart.VISUAL_ID) {
                result.add(new SyncchartsNodeDescriptor(childElement, visualID));
            }
        }
        return result;
    }

    /**
     * @generated
     */
    public static List getStateRegionCompartment_7006SemanticChildren(View view) {
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
            int visualID = SyncchartsVisualIDRegistry.getNodeVisualID(view, childElement);
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
    public static List getRegionStateCompartment_7008SemanticChildren(View view) {
        if (false == view.eContainer() instanceof View) {
            return Collections.EMPTY_LIST;
        }
        View containerView = (View) view.eContainer();
        if (!containerView.isSetElement()) {
            return Collections.EMPTY_LIST;
        }
        Region modelElement = (Region) containerView.getElement();
        List result = new LinkedList();
        for (Iterator it = modelElement.getInnerStates().iterator(); it.hasNext();) {
            State childElement = (State) it.next();
            int visualID = SyncchartsVisualIDRegistry.getNodeVisualID(view, childElement);
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
    public static List getStateSignal_7009SemanticChildren(View view) {
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
            int visualID = SyncchartsVisualIDRegistry.getNodeVisualID(view, childElement);
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
    public static List getStateOnEntryAction_7010SemanticChildren(View view) {
        if (false == view.eContainer() instanceof View) {
            return Collections.EMPTY_LIST;
        }
        View containerView = (View) view.eContainer();
        if (!containerView.isSetElement()) {
            return Collections.EMPTY_LIST;
        }
        State modelElement = (State) containerView.getElement();
        List result = new LinkedList();
        for (Iterator it = modelElement.getEntryActions().iterator(); it.hasNext();) {
            Action childElement = (Action) it.next();
            int visualID = SyncchartsVisualIDRegistry.getNodeVisualID(view, childElement);
            if (visualID == ActionEditPart.VISUAL_ID) {
                result.add(new SyncchartsNodeDescriptor(childElement, visualID));
                continue;
            }
        }
        return result;
    }

    /**
     * @generated
     */
    public static List getStateOnInsideAction_7011SemanticChildren(View view) {
        if (false == view.eContainer() instanceof View) {
            return Collections.EMPTY_LIST;
        }
        View containerView = (View) view.eContainer();
        if (!containerView.isSetElement()) {
            return Collections.EMPTY_LIST;
        }
        State modelElement = (State) containerView.getElement();
        List result = new LinkedList();
        for (Iterator it = modelElement.getInnerActions().iterator(); it.hasNext();) {
            Action childElement = (Action) it.next();
            int visualID = SyncchartsVisualIDRegistry.getNodeVisualID(view, childElement);
            if (visualID == Action2EditPart.VISUAL_ID) {
                result.add(new SyncchartsNodeDescriptor(childElement, visualID));
                continue;
            }
        }
        return result;
    }

    /**
     * @generated
     */
    public static List getStateOnExitAction_7012SemanticChildren(View view) {
        if (false == view.eContainer() instanceof View) {
            return Collections.EMPTY_LIST;
        }
        View containerView = (View) view.eContainer();
        if (!containerView.isSetElement()) {
            return Collections.EMPTY_LIST;
        }
        State modelElement = (State) containerView.getElement();
        List result = new LinkedList();
        for (Iterator it = modelElement.getExitActions().iterator(); it.hasNext();) {
            Action childElement = (Action) it.next();
            int visualID = SyncchartsVisualIDRegistry.getNodeVisualID(view, childElement);
            if (visualID == Action3EditPart.VISUAL_ID) {
                result.add(new SyncchartsNodeDescriptor(childElement, visualID));
                continue;
            }
        }
        return result;
    }

    /**
     * @generated
     */
    public static List getStateSuspend_7013SemanticChildren(View view) {
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
            int visualID = SyncchartsVisualIDRegistry.getNodeVisualID(view, childElement);
            if (visualID == Action4EditPart.VISUAL_ID) {
                result.add(new SyncchartsNodeDescriptor(childElement, visualID));
            }
        }
        return result;
    }

    /**
     * @generated
     */
    public static List getStateRegionCompartment_7014SemanticChildren(View view) {
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
            int visualID = SyncchartsVisualIDRegistry.getNodeVisualID(view, childElement);
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
    public static List getRegion_1000SemanticChildren(View view) {
        if (!view.isSetElement()) {
            return Collections.EMPTY_LIST;
        }
        Region modelElement = (Region) view.getElement();
        List result = new LinkedList();
        for (Iterator it = modelElement.getInnerStates().iterator(); it.hasNext();) {
            State childElement = (State) it.next();
            int visualID = SyncchartsVisualIDRegistry.getNodeVisualID(view, childElement);
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
    public static List getContainedLinks(View view) {
        switch (SyncchartsVisualIDRegistry.getVisualID(view)) {
        case RegionEditPart.VISUAL_ID:
            return getRegion_1000ContainedLinks(view);
        case StateEditPart.VISUAL_ID:
            return getState_2001ContainedLinks(view);
        case Region2EditPart.VISUAL_ID:
            return getRegion_3001ContainedLinks(view);
        case State2EditPart.VISUAL_ID:
            return getState_3002ContainedLinks(view);
        case SignalEditPart.VISUAL_ID:
            return getSignal_3003ContainedLinks(view);
        case ActionEditPart.VISUAL_ID:
            return getAction_3004ContainedLinks(view);
        case Action2EditPart.VISUAL_ID:
            return getAction_3005ContainedLinks(view);
        case Action3EditPart.VISUAL_ID:
            return getAction_3006ContainedLinks(view);
        case Action4EditPart.VISUAL_ID:
            return getAction_3008ContainedLinks(view);
        case TransitionEditPart.VISUAL_ID:
            return getTransition_4001ContainedLinks(view);
        }
        return Collections.EMPTY_LIST;
    }

    /**
     * @generated
     */
    public static List getIncomingLinks(View view) {
        switch (SyncchartsVisualIDRegistry.getVisualID(view)) {
        case StateEditPart.VISUAL_ID:
            return getState_2001IncomingLinks(view);
        case Region2EditPart.VISUAL_ID:
            return getRegion_3001IncomingLinks(view);
        case State2EditPart.VISUAL_ID:
            return getState_3002IncomingLinks(view);
        case SignalEditPart.VISUAL_ID:
            return getSignal_3003IncomingLinks(view);
        case ActionEditPart.VISUAL_ID:
            return getAction_3004IncomingLinks(view);
        case Action2EditPart.VISUAL_ID:
            return getAction_3005IncomingLinks(view);
        case Action3EditPart.VISUAL_ID:
            return getAction_3006IncomingLinks(view);
        case Action4EditPart.VISUAL_ID:
            return getAction_3008IncomingLinks(view);
        case TransitionEditPart.VISUAL_ID:
            return getTransition_4001IncomingLinks(view);
        }
        return Collections.EMPTY_LIST;
    }

    /**
     * @generated
     */
    public static List getOutgoingLinks(View view) {
        switch (SyncchartsVisualIDRegistry.getVisualID(view)) {
        case StateEditPart.VISUAL_ID:
            return getState_2001OutgoingLinks(view);
        case Region2EditPart.VISUAL_ID:
            return getRegion_3001OutgoingLinks(view);
        case State2EditPart.VISUAL_ID:
            return getState_3002OutgoingLinks(view);
        case SignalEditPart.VISUAL_ID:
            return getSignal_3003OutgoingLinks(view);
        case ActionEditPart.VISUAL_ID:
            return getAction_3004OutgoingLinks(view);
        case Action2EditPart.VISUAL_ID:
            return getAction_3005OutgoingLinks(view);
        case Action3EditPart.VISUAL_ID:
            return getAction_3006OutgoingLinks(view);
        case Action4EditPart.VISUAL_ID:
            return getAction_3008OutgoingLinks(view);
        case TransitionEditPart.VISUAL_ID:
            return getTransition_4001OutgoingLinks(view);
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
    public static List getState_2001ContainedLinks(View view) {
        State modelElement = (State) view.getElement();
        List result = new LinkedList();
        result.addAll(getContainedTypeModelFacetLinks_Transition_4001(modelElement));
        return result;
    }

    /**
     * @generated
     */
    public static List getRegion_3001ContainedLinks(View view) {
        return Collections.EMPTY_LIST;
    }

    /**
     * @generated
     */
    public static List getState_3002ContainedLinks(View view) {
        State modelElement = (State) view.getElement();
        List result = new LinkedList();
        result.addAll(getContainedTypeModelFacetLinks_Transition_4001(modelElement));
        return result;
    }

    /**
     * @generated
     */
    public static List getSignal_3003ContainedLinks(View view) {
        return Collections.EMPTY_LIST;
    }

    /**
     * @generated
     */
    public static List getAction_3004ContainedLinks(View view) {
        return Collections.EMPTY_LIST;
    }

    /**
     * @generated
     */
    public static List getAction_3005ContainedLinks(View view) {
        return Collections.EMPTY_LIST;
    }

    /**
     * @generated
     */
    public static List getAction_3006ContainedLinks(View view) {
        return Collections.EMPTY_LIST;
    }

    /**
     * @generated
     */
    public static List getAction_3008ContainedLinks(View view) {
        return Collections.EMPTY_LIST;
    }

    /**
     * @generated
     */
    public static List getTransition_4001ContainedLinks(View view) {
        return Collections.EMPTY_LIST;
    }

    /**
     * @generated
     */
    public static List getState_2001IncomingLinks(View view) {
        State modelElement = (State) view.getElement();
        Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet()
                .getResources());
        List result = new LinkedList();
        result
                .addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement,
                        crossReferences));
        return result;
    }

    /**
     * @generated
     */
    public static List getRegion_3001IncomingLinks(View view) {
        return Collections.EMPTY_LIST;
    }

    /**
     * @generated
     */
    public static List getState_3002IncomingLinks(View view) {
        State modelElement = (State) view.getElement();
        Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet()
                .getResources());
        List result = new LinkedList();
        result
                .addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement,
                        crossReferences));
        return result;
    }

    /**
     * @generated
     */
    public static List getSignal_3003IncomingLinks(View view) {
        return Collections.EMPTY_LIST;
    }

    /**
     * @generated
     */
    public static List getAction_3004IncomingLinks(View view) {
        return Collections.EMPTY_LIST;
    }

    /**
     * @generated
     */
    public static List getAction_3005IncomingLinks(View view) {
        return Collections.EMPTY_LIST;
    }

    /**
     * @generated
     */
    public static List getAction_3006IncomingLinks(View view) {
        return Collections.EMPTY_LIST;
    }

    /**
     * @generated
     */
    public static List getAction_3008IncomingLinks(View view) {
        return Collections.EMPTY_LIST;
    }

    /**
     * @generated
     */
    public static List getTransition_4001IncomingLinks(View view) {
        return Collections.EMPTY_LIST;
    }

    /**
     * @generated
     */
    public static List getState_2001OutgoingLinks(View view) {
        State modelElement = (State) view.getElement();
        List result = new LinkedList();
        result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
        return result;
    }

    /**
     * @generated
     */
    public static List getRegion_3001OutgoingLinks(View view) {
        return Collections.EMPTY_LIST;
    }

    /**
     * @generated
     */
    public static List getState_3002OutgoingLinks(View view) {
        State modelElement = (State) view.getElement();
        List result = new LinkedList();
        result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
        return result;
    }

    /**
     * @generated
     */
    public static List getSignal_3003OutgoingLinks(View view) {
        return Collections.EMPTY_LIST;
    }

    /**
     * @generated
     */
    public static List getAction_3004OutgoingLinks(View view) {
        return Collections.EMPTY_LIST;
    }

    /**
     * @generated
     */
    public static List getAction_3005OutgoingLinks(View view) {
        return Collections.EMPTY_LIST;
    }

    /**
     * @generated
     */
    public static List getAction_3006OutgoingLinks(View view) {
        return Collections.EMPTY_LIST;
    }

    /**
     * @generated
     */
    public static List getAction_3008OutgoingLinks(View view) {
        return Collections.EMPTY_LIST;
    }

    /**
     * @generated
     */
    public static List getTransition_4001OutgoingLinks(View view) {
        return Collections.EMPTY_LIST;
    }

    /**
     * @generated
     */
    private static Collection getContainedTypeModelFacetLinks_Transition_4001(State container) {
        Collection result = new LinkedList();
        for (Iterator links = container.getOutgoingTransitions().iterator(); links.hasNext();) {
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
                    SyncchartsElementTypes.Transition_4001, TransitionEditPart.VISUAL_ID));
        }
        return result;
    }

    /**
     * @generated
     */
    private static Collection getIncomingTypeModelFacetLinks_Transition_4001(State target,
            Map crossReferences) {
        Collection result = new LinkedList();
        Collection settings = (Collection) crossReferences.get(target);
        for (Iterator it = settings.iterator(); it.hasNext();) {
            EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it.next();
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
                    SyncchartsElementTypes.Transition_4001, TransitionEditPart.VISUAL_ID));
        }
        return result;
    }

    /**
     * @generated
     */
    private static Collection getOutgoingTypeModelFacetLinks_Transition_4001(State source) {
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
        for (Iterator links = container.getOutgoingTransitions().iterator(); links.hasNext();) {
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
                    SyncchartsElementTypes.Transition_4001, TransitionEditPart.VISUAL_ID));
        }
        return result;
    }

}
