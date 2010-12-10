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

import de.cau.cs.kieler.core.kexpressions.Signal;
import de.cau.cs.kieler.core.kexpressions.TextualCode;
import de.cau.cs.kieler.core.kexpressions.Variable;
import de.cau.cs.kieler.synccharts.Action;
import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.SyncchartsPackage;
import de.cau.cs.kieler.synccharts.Transition;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.RegionEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.RegionStateCompartmentEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.RegionStateEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.SignalEditPart;
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
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateRegionEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateSignalCompartment2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateSignalCompartmentEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateSuspensionTriggerCompartment2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateSuspensionTriggerCompartmentEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateSuspensionTriggerEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.TextualCodeEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.TransitionEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.VariableEditPart;
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
        case StateSignalCompartmentEditPart.VISUAL_ID:
            return getStateInterface_7054SemanticChildren(view);
        case StateEntryActionCompartmentEditPart.VISUAL_ID:
            return getStateOnEntryAction_7055SemanticChildren(view);
        case StateInnerActionCompartmentEditPart.VISUAL_ID:
            return getStateOnInsideAction_7056SemanticChildren(view);
        case StateExitActionCompartmentEditPart.VISUAL_ID:
            return getStateOnExitAction_7057SemanticChildren(view);
        case StateSuspensionTriggerCompartmentEditPart.VISUAL_ID:
            return getStateSuspend_7058SemanticChildren(view);
        case StateRegionCompartment2EditPart.VISUAL_ID:
            return getStateRegionCompartment_7059SemanticChildren(view);
        case RegionStateCompartmentEditPart.VISUAL_ID:
            return getRegionStateCompartment_7060SemanticChildren(view);
        case StateSignalCompartment2EditPart.VISUAL_ID:
            return getStateInterface_7061SemanticChildren(view);
        case StateEntryActionCompartment2EditPart.VISUAL_ID:
            return getStateOnEntryAction_7062SemanticChildren(view);
        case StateInnerActionCompartment2EditPart.VISUAL_ID:
            return getStateOnInsideAction_7063SemanticChildren(view);
        case StateExitActionCompartment2EditPart.VISUAL_ID:
            return getStateOnExitAction_7064SemanticChildren(view);
        case StateSuspensionTriggerCompartment2EditPart.VISUAL_ID:
            return getStateSuspend_7065SemanticChildren(view);
        case StateRegionCompartmentEditPart.VISUAL_ID:
            return getStateRegionCompartment_7066SemanticChildren(view);
        }
        return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<SyncchartsNodeDescriptor> getRegion_1000SemanticChildren(View view) {
        if (!view.isSetElement()) {
            return Collections.emptyList();
        }
        Region modelElement = (Region) view.getElement();
        LinkedList<SyncchartsNodeDescriptor> result = new LinkedList<SyncchartsNodeDescriptor>();
        for (Iterator<?> it = modelElement.getStates().iterator(); it.hasNext();) {
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
    public static List<SyncchartsNodeDescriptor> getStateInterface_7054SemanticChildren(View view) {
        if (false == view.eContainer() instanceof View) {
            return Collections.emptyList();
        }
        View containerView = (View) view.eContainer();
        if (!containerView.isSetElement()) {
            return Collections.emptyList();
        }
        State modelElement = (State) containerView.getElement();
        LinkedList<SyncchartsNodeDescriptor> result = new LinkedList<SyncchartsNodeDescriptor>();
        for (Iterator<?> it = modelElement.getSignals().iterator(); it.hasNext();) {
            Signal childElement = (Signal) it.next();
            int visualID = SyncchartsVisualIDRegistry.getNodeVisualID(view, childElement);
            if (visualID == SignalEditPart.VISUAL_ID) {
                result.add(new SyncchartsNodeDescriptor(childElement, visualID));
                continue;
            }
        }
        for (Iterator<?> it = modelElement.getVariables().iterator(); it.hasNext();) {
            Variable childElement = (Variable) it.next();
            int visualID = SyncchartsVisualIDRegistry.getNodeVisualID(view, childElement);
            if (visualID == VariableEditPart.VISUAL_ID) {
                result.add(new SyncchartsNodeDescriptor(childElement, visualID));
                continue;
            }
        }
        return result;
    }

    /**
     * @generated
     */
    public static List<SyncchartsNodeDescriptor> getStateOnEntryAction_7055SemanticChildren(
            View view) {
        if (false == view.eContainer() instanceof View) {
            return Collections.emptyList();
        }
        View containerView = (View) view.eContainer();
        if (!containerView.isSetElement()) {
            return Collections.emptyList();
        }
        State modelElement = (State) containerView.getElement();
        LinkedList<SyncchartsNodeDescriptor> result = new LinkedList<SyncchartsNodeDescriptor>();
        for (Iterator<?> it = modelElement.getEntryActions().iterator(); it.hasNext();) {
            Action childElement = (Action) it.next();
            int visualID = SyncchartsVisualIDRegistry.getNodeVisualID(view, childElement);
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
    public static List<SyncchartsNodeDescriptor> getStateOnInsideAction_7056SemanticChildren(
            View view) {
        if (false == view.eContainer() instanceof View) {
            return Collections.emptyList();
        }
        View containerView = (View) view.eContainer();
        if (!containerView.isSetElement()) {
            return Collections.emptyList();
        }
        State modelElement = (State) containerView.getElement();
        LinkedList<SyncchartsNodeDescriptor> result = new LinkedList<SyncchartsNodeDescriptor>();
        for (Iterator<?> it = modelElement.getInnerActions().iterator(); it.hasNext();) {
            Action childElement = (Action) it.next();
            int visualID = SyncchartsVisualIDRegistry.getNodeVisualID(view, childElement);
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
    public static List<SyncchartsNodeDescriptor> getStateOnExitAction_7057SemanticChildren(View view) {
        if (false == view.eContainer() instanceof View) {
            return Collections.emptyList();
        }
        View containerView = (View) view.eContainer();
        if (!containerView.isSetElement()) {
            return Collections.emptyList();
        }
        State modelElement = (State) containerView.getElement();
        LinkedList<SyncchartsNodeDescriptor> result = new LinkedList<SyncchartsNodeDescriptor>();
        for (Iterator<?> it = modelElement.getExitActions().iterator(); it.hasNext();) {
            Action childElement = (Action) it.next();
            int visualID = SyncchartsVisualIDRegistry.getNodeVisualID(view, childElement);
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
    public static List<SyncchartsNodeDescriptor> getStateSuspend_7058SemanticChildren(View view) {
        if (false == view.eContainer() instanceof View) {
            return Collections.emptyList();
        }
        View containerView = (View) view.eContainer();
        if (!containerView.isSetElement()) {
            return Collections.emptyList();
        }
        State modelElement = (State) containerView.getElement();
        LinkedList<SyncchartsNodeDescriptor> result = new LinkedList<SyncchartsNodeDescriptor>();
        {
            Action childElement = modelElement.getSuspensionTrigger();
            int visualID = SyncchartsVisualIDRegistry.getNodeVisualID(view, childElement);
            if (visualID == StateSuspensionTriggerEditPart.VISUAL_ID) {
                result.add(new SyncchartsNodeDescriptor(childElement, visualID));
            }
        }
        return result;
    }

    /**
     * @generated
     */
    public static List<SyncchartsNodeDescriptor> getStateRegionCompartment_7059SemanticChildren(
            View view) {
        if (false == view.eContainer() instanceof View) {
            return Collections.emptyList();
        }
        View containerView = (View) view.eContainer();
        if (!containerView.isSetElement()) {
            return Collections.emptyList();
        }
        State modelElement = (State) containerView.getElement();
        LinkedList<SyncchartsNodeDescriptor> result = new LinkedList<SyncchartsNodeDescriptor>();
        for (Iterator<?> it = modelElement.getBodyText().iterator(); it.hasNext();) {
            TextualCode childElement = (TextualCode) it.next();
            int visualID = SyncchartsVisualIDRegistry.getNodeVisualID(view, childElement);
            if (visualID == TextualCodeEditPart.VISUAL_ID) {
                result.add(new SyncchartsNodeDescriptor(childElement, visualID));
                continue;
            }
        }
        for (Iterator<?> it = modelElement.getRegions().iterator(); it.hasNext();) {
            Region childElement = (Region) it.next();
            int visualID = SyncchartsVisualIDRegistry.getNodeVisualID(view, childElement);
            if (visualID == StateRegionEditPart.VISUAL_ID) {
                result.add(new SyncchartsNodeDescriptor(childElement, visualID));
                continue;
            }
        }
        return result;
    }

    /**
     * @generated
     */
    public static List<SyncchartsNodeDescriptor> getRegionStateCompartment_7060SemanticChildren(
            View view) {
        if (false == view.eContainer() instanceof View) {
            return Collections.emptyList();
        }
        View containerView = (View) view.eContainer();
        if (!containerView.isSetElement()) {
            return Collections.emptyList();
        }
        Region modelElement = (Region) containerView.getElement();
        LinkedList<SyncchartsNodeDescriptor> result = new LinkedList<SyncchartsNodeDescriptor>();
        for (Iterator<?> it = modelElement.getStates().iterator(); it.hasNext();) {
            State childElement = (State) it.next();
            int visualID = SyncchartsVisualIDRegistry.getNodeVisualID(view, childElement);
            if (visualID == RegionStateEditPart.VISUAL_ID) {
                result.add(new SyncchartsNodeDescriptor(childElement, visualID));
                continue;
            }
        }
        for (Iterator<?> it = modelElement.getBodyText().iterator(); it.hasNext();) {
            TextualCode childElement = (TextualCode) it.next();
            int visualID = SyncchartsVisualIDRegistry.getNodeVisualID(view, childElement);
            if (visualID == TextualCodeEditPart.VISUAL_ID) {
                result.add(new SyncchartsNodeDescriptor(childElement, visualID));
                continue;
            }
        }
        return result;
    }

    /**
     * @generated
     */
    public static List<SyncchartsNodeDescriptor> getStateInterface_7061SemanticChildren(View view) {
        if (false == view.eContainer() instanceof View) {
            return Collections.emptyList();
        }
        View containerView = (View) view.eContainer();
        if (!containerView.isSetElement()) {
            return Collections.emptyList();
        }
        State modelElement = (State) containerView.getElement();
        LinkedList<SyncchartsNodeDescriptor> result = new LinkedList<SyncchartsNodeDescriptor>();
        for (Iterator<?> it = modelElement.getSignals().iterator(); it.hasNext();) {
            Signal childElement = (Signal) it.next();
            int visualID = SyncchartsVisualIDRegistry.getNodeVisualID(view, childElement);
            if (visualID == SignalEditPart.VISUAL_ID) {
                result.add(new SyncchartsNodeDescriptor(childElement, visualID));
                continue;
            }
        }
        for (Iterator<?> it = modelElement.getVariables().iterator(); it.hasNext();) {
            Variable childElement = (Variable) it.next();
            int visualID = SyncchartsVisualIDRegistry.getNodeVisualID(view, childElement);
            if (visualID == VariableEditPart.VISUAL_ID) {
                result.add(new SyncchartsNodeDescriptor(childElement, visualID));
                continue;
            }
        }
        return result;
    }

    /**
     * @generated
     */
    public static List<SyncchartsNodeDescriptor> getStateOnEntryAction_7062SemanticChildren(
            View view) {
        if (false == view.eContainer() instanceof View) {
            return Collections.emptyList();
        }
        View containerView = (View) view.eContainer();
        if (!containerView.isSetElement()) {
            return Collections.emptyList();
        }
        State modelElement = (State) containerView.getElement();
        LinkedList<SyncchartsNodeDescriptor> result = new LinkedList<SyncchartsNodeDescriptor>();
        for (Iterator<?> it = modelElement.getEntryActions().iterator(); it.hasNext();) {
            Action childElement = (Action) it.next();
            int visualID = SyncchartsVisualIDRegistry.getNodeVisualID(view, childElement);
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
    public static List<SyncchartsNodeDescriptor> getStateOnInsideAction_7063SemanticChildren(
            View view) {
        if (false == view.eContainer() instanceof View) {
            return Collections.emptyList();
        }
        View containerView = (View) view.eContainer();
        if (!containerView.isSetElement()) {
            return Collections.emptyList();
        }
        State modelElement = (State) containerView.getElement();
        LinkedList<SyncchartsNodeDescriptor> result = new LinkedList<SyncchartsNodeDescriptor>();
        for (Iterator<?> it = modelElement.getInnerActions().iterator(); it.hasNext();) {
            Action childElement = (Action) it.next();
            int visualID = SyncchartsVisualIDRegistry.getNodeVisualID(view, childElement);
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
    public static List<SyncchartsNodeDescriptor> getStateOnExitAction_7064SemanticChildren(View view) {
        if (false == view.eContainer() instanceof View) {
            return Collections.emptyList();
        }
        View containerView = (View) view.eContainer();
        if (!containerView.isSetElement()) {
            return Collections.emptyList();
        }
        State modelElement = (State) containerView.getElement();
        LinkedList<SyncchartsNodeDescriptor> result = new LinkedList<SyncchartsNodeDescriptor>();
        for (Iterator<?> it = modelElement.getExitActions().iterator(); it.hasNext();) {
            Action childElement = (Action) it.next();
            int visualID = SyncchartsVisualIDRegistry.getNodeVisualID(view, childElement);
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
    public static List<SyncchartsNodeDescriptor> getStateSuspend_7065SemanticChildren(View view) {
        if (false == view.eContainer() instanceof View) {
            return Collections.emptyList();
        }
        View containerView = (View) view.eContainer();
        if (!containerView.isSetElement()) {
            return Collections.emptyList();
        }
        State modelElement = (State) containerView.getElement();
        LinkedList<SyncchartsNodeDescriptor> result = new LinkedList<SyncchartsNodeDescriptor>();
        {
            Action childElement = modelElement.getSuspensionTrigger();
            int visualID = SyncchartsVisualIDRegistry.getNodeVisualID(view, childElement);
            if (visualID == StateSuspensionTriggerEditPart.VISUAL_ID) {
                result.add(new SyncchartsNodeDescriptor(childElement, visualID));
            }
        }
        return result;
    }

    /**
     * @generated
     */
    public static List<SyncchartsNodeDescriptor> getStateRegionCompartment_7066SemanticChildren(
            View view) {
        if (false == view.eContainer() instanceof View) {
            return Collections.emptyList();
        }
        View containerView = (View) view.eContainer();
        if (!containerView.isSetElement()) {
            return Collections.emptyList();
        }
        State modelElement = (State) containerView.getElement();
        LinkedList<SyncchartsNodeDescriptor> result = new LinkedList<SyncchartsNodeDescriptor>();
        for (Iterator<?> it = modelElement.getBodyText().iterator(); it.hasNext();) {
            TextualCode childElement = (TextualCode) it.next();
            int visualID = SyncchartsVisualIDRegistry.getNodeVisualID(view, childElement);
            if (visualID == TextualCodeEditPart.VISUAL_ID) {
                result.add(new SyncchartsNodeDescriptor(childElement, visualID));
                continue;
            }
        }
        for (Iterator<?> it = modelElement.getRegions().iterator(); it.hasNext();) {
            Region childElement = (Region) it.next();
            int visualID = SyncchartsVisualIDRegistry.getNodeVisualID(view, childElement);
            if (visualID == StateRegionEditPart.VISUAL_ID) {
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
            return getState_2005ContainedLinks(view);
        case SignalEditPart.VISUAL_ID:
            return getSignal_3041ContainedLinks(view);
        case StateEntryActionEditPart.VISUAL_ID:
            return getAction_3042ContainedLinks(view);
        case StateInnerActionEditPart.VISUAL_ID:
            return getAction_3043ContainedLinks(view);
        case StateExitActionEditPart.VISUAL_ID:
            return getAction_3044ContainedLinks(view);
        case StateSuspensionTriggerEditPart.VISUAL_ID:
            return getAction_3045ContainedLinks(view);
        case TextualCodeEditPart.VISUAL_ID:
            return getTextualCode_3046ContainedLinks(view);
        case StateRegionEditPart.VISUAL_ID:
            return getRegion_3039ContainedLinks(view);
        case RegionStateEditPart.VISUAL_ID:
            return getState_3040ContainedLinks(view);
        case VariableEditPart.VISUAL_ID:
            return getVariable_3047ContainedLinks(view);
        case TransitionEditPart.VISUAL_ID:
            return getTransition_4005ContainedLinks(view);
        }
        return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<SyncchartsLinkDescriptor> getIncomingLinks(View view) {
        switch (SyncchartsVisualIDRegistry.getVisualID(view)) {
        case StateEditPart.VISUAL_ID:
            return getState_2005IncomingLinks(view);
        case SignalEditPart.VISUAL_ID:
            return getSignal_3041IncomingLinks(view);
        case StateEntryActionEditPart.VISUAL_ID:
            return getAction_3042IncomingLinks(view);
        case StateInnerActionEditPart.VISUAL_ID:
            return getAction_3043IncomingLinks(view);
        case StateExitActionEditPart.VISUAL_ID:
            return getAction_3044IncomingLinks(view);
        case StateSuspensionTriggerEditPart.VISUAL_ID:
            return getAction_3045IncomingLinks(view);
        case TextualCodeEditPart.VISUAL_ID:
            return getTextualCode_3046IncomingLinks(view);
        case StateRegionEditPart.VISUAL_ID:
            return getRegion_3039IncomingLinks(view);
        case RegionStateEditPart.VISUAL_ID:
            return getState_3040IncomingLinks(view);
        case VariableEditPart.VISUAL_ID:
            return getVariable_3047IncomingLinks(view);
        case TransitionEditPart.VISUAL_ID:
            return getTransition_4005IncomingLinks(view);
        }
        return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<SyncchartsLinkDescriptor> getOutgoingLinks(View view) {
        switch (SyncchartsVisualIDRegistry.getVisualID(view)) {
        case StateEditPart.VISUAL_ID:
            return getState_2005OutgoingLinks(view);
        case SignalEditPart.VISUAL_ID:
            return getSignal_3041OutgoingLinks(view);
        case StateEntryActionEditPart.VISUAL_ID:
            return getAction_3042OutgoingLinks(view);
        case StateInnerActionEditPart.VISUAL_ID:
            return getAction_3043OutgoingLinks(view);
        case StateExitActionEditPart.VISUAL_ID:
            return getAction_3044OutgoingLinks(view);
        case StateSuspensionTriggerEditPart.VISUAL_ID:
            return getAction_3045OutgoingLinks(view);
        case TextualCodeEditPart.VISUAL_ID:
            return getTextualCode_3046OutgoingLinks(view);
        case StateRegionEditPart.VISUAL_ID:
            return getRegion_3039OutgoingLinks(view);
        case RegionStateEditPart.VISUAL_ID:
            return getState_3040OutgoingLinks(view);
        case VariableEditPart.VISUAL_ID:
            return getVariable_3047OutgoingLinks(view);
        case TransitionEditPart.VISUAL_ID:
            return getTransition_4005OutgoingLinks(view);
        }
        return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<SyncchartsLinkDescriptor> getRegion_1000ContainedLinks(View view) {
        return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<SyncchartsLinkDescriptor> getState_2005ContainedLinks(View view) {
        State modelElement = (State) view.getElement();
        LinkedList<SyncchartsLinkDescriptor> result = new LinkedList<SyncchartsLinkDescriptor>();
        result.addAll(getContainedTypeModelFacetLinks_Transition_4005(modelElement));
        return result;
    }

    /**
     * @generated
     */
    public static List<SyncchartsLinkDescriptor> getSignal_3041ContainedLinks(View view) {
        return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<SyncchartsLinkDescriptor> getAction_3042ContainedLinks(View view) {
        return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<SyncchartsLinkDescriptor> getAction_3043ContainedLinks(View view) {
        return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<SyncchartsLinkDescriptor> getAction_3044ContainedLinks(View view) {
        return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<SyncchartsLinkDescriptor> getAction_3045ContainedLinks(View view) {
        return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<SyncchartsLinkDescriptor> getTextualCode_3046ContainedLinks(View view) {
        return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<SyncchartsLinkDescriptor> getRegion_3039ContainedLinks(View view) {
        return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<SyncchartsLinkDescriptor> getState_3040ContainedLinks(View view) {
        State modelElement = (State) view.getElement();
        LinkedList<SyncchartsLinkDescriptor> result = new LinkedList<SyncchartsLinkDescriptor>();
        result.addAll(getContainedTypeModelFacetLinks_Transition_4005(modelElement));
        return result;
    }

    /**
     * @generated
     */
    public static List<SyncchartsLinkDescriptor> getVariable_3047ContainedLinks(View view) {
        return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<SyncchartsLinkDescriptor> getTransition_4005ContainedLinks(View view) {
        return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<SyncchartsLinkDescriptor> getState_2005IncomingLinks(View view) {
        State modelElement = (State) view.getElement();
        Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
                .find(view.eResource().getResourceSet().getResources());
        LinkedList<SyncchartsLinkDescriptor> result = new LinkedList<SyncchartsLinkDescriptor>();
        result.addAll(getIncomingTypeModelFacetLinks_Transition_4005(modelElement, crossReferences));
        return result;
    }

    /**
     * @generated
     */
    public static List<SyncchartsLinkDescriptor> getSignal_3041IncomingLinks(View view) {
        return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<SyncchartsLinkDescriptor> getAction_3042IncomingLinks(View view) {
        return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<SyncchartsLinkDescriptor> getAction_3043IncomingLinks(View view) {
        return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<SyncchartsLinkDescriptor> getAction_3044IncomingLinks(View view) {
        return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<SyncchartsLinkDescriptor> getAction_3045IncomingLinks(View view) {
        return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<SyncchartsLinkDescriptor> getTextualCode_3046IncomingLinks(View view) {
        return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<SyncchartsLinkDescriptor> getRegion_3039IncomingLinks(View view) {
        return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<SyncchartsLinkDescriptor> getState_3040IncomingLinks(View view) {
        State modelElement = (State) view.getElement();
        Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
                .find(view.eResource().getResourceSet().getResources());
        LinkedList<SyncchartsLinkDescriptor> result = new LinkedList<SyncchartsLinkDescriptor>();
        result.addAll(getIncomingTypeModelFacetLinks_Transition_4005(modelElement, crossReferences));
        return result;
    }

    /**
     * @generated
     */
    public static List<SyncchartsLinkDescriptor> getVariable_3047IncomingLinks(View view) {
        return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<SyncchartsLinkDescriptor> getTransition_4005IncomingLinks(View view) {
        return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<SyncchartsLinkDescriptor> getState_2005OutgoingLinks(View view) {
        State modelElement = (State) view.getElement();
        LinkedList<SyncchartsLinkDescriptor> result = new LinkedList<SyncchartsLinkDescriptor>();
        result.addAll(getOutgoingTypeModelFacetLinks_Transition_4005(modelElement));
        return result;
    }

    /**
     * @generated
     */
    public static List<SyncchartsLinkDescriptor> getSignal_3041OutgoingLinks(View view) {
        return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<SyncchartsLinkDescriptor> getAction_3042OutgoingLinks(View view) {
        return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<SyncchartsLinkDescriptor> getAction_3043OutgoingLinks(View view) {
        return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<SyncchartsLinkDescriptor> getAction_3044OutgoingLinks(View view) {
        return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<SyncchartsLinkDescriptor> getAction_3045OutgoingLinks(View view) {
        return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<SyncchartsLinkDescriptor> getTextualCode_3046OutgoingLinks(View view) {
        return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<SyncchartsLinkDescriptor> getRegion_3039OutgoingLinks(View view) {
        return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<SyncchartsLinkDescriptor> getState_3040OutgoingLinks(View view) {
        State modelElement = (State) view.getElement();
        LinkedList<SyncchartsLinkDescriptor> result = new LinkedList<SyncchartsLinkDescriptor>();
        result.addAll(getOutgoingTypeModelFacetLinks_Transition_4005(modelElement));
        return result;
    }

    /**
     * @generated
     */
    public static List<SyncchartsLinkDescriptor> getVariable_3047OutgoingLinks(View view) {
        return Collections.emptyList();
    }

    /**
     * @generated
     */
    public static List<SyncchartsLinkDescriptor> getTransition_4005OutgoingLinks(View view) {
        return Collections.emptyList();
    }

    /**
     * @generated
     */
    private static Collection<SyncchartsLinkDescriptor> getContainedTypeModelFacetLinks_Transition_4005(
            State container) {
        LinkedList<SyncchartsLinkDescriptor> result = new LinkedList<SyncchartsLinkDescriptor>();
        for (Iterator<?> links = container.getOutgoingTransitions().iterator(); links.hasNext();) {
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
                    SyncchartsElementTypes.Transition_4005, TransitionEditPart.VISUAL_ID));
        }
        return result;
    }

    /**
     * @generated
     */
    private static Collection<SyncchartsLinkDescriptor> getIncomingTypeModelFacetLinks_Transition_4005(
            State target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
        LinkedList<SyncchartsLinkDescriptor> result = new LinkedList<SyncchartsLinkDescriptor>();
        Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
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
                    SyncchartsElementTypes.Transition_4005, TransitionEditPart.VISUAL_ID));
        }
        return result;
    }

    /**
     * @generated
     */
    private static Collection<SyncchartsLinkDescriptor> getOutgoingTypeModelFacetLinks_Transition_4005(
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
            return Collections.emptyList();
        }
        LinkedList<SyncchartsLinkDescriptor> result = new LinkedList<SyncchartsLinkDescriptor>();
        for (Iterator<?> links = container.getOutgoingTransitions().iterator(); links.hasNext();) {
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
                    SyncchartsElementTypes.Transition_4005, TransitionEditPart.VISUAL_ID));
        }
        return result;
    }

}
