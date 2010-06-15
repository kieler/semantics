package de.cau.cs.kieler.synccharts.diagram.providers;

import java.util.ArrayList;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.core.providers.IViewProvider;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateDiagramViewOperation;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateEdgeViewOperation;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateNodeViewOperation;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateViewForKindOperation;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateViewOperation;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants;
import org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities;
import org.eclipse.gmf.runtime.emf.core.util.EMFCoreUtil;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.notation.Connector;
import org.eclipse.gmf.runtime.notation.DecorationNode;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.FontStyle;
import org.eclipse.gmf.runtime.notation.Location;
import org.eclipse.gmf.runtime.notation.MeasurementUnit;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.NotationFactory;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.RelativeBendpoints;
import org.eclipse.gmf.runtime.notation.Routing;
import org.eclipse.gmf.runtime.notation.Shape;
import org.eclipse.gmf.runtime.notation.TitleStyle;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.notation.datatype.RelativeBendpoint;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.FontData;

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
import de.cau.cs.kieler.synccharts.diagram.part.SyncchartsVisualIDRegistry;

/**
 * @generated
 */
public class SyncchartsViewProvider extends AbstractProvider implements
        IViewProvider {

    /**
     * @generated
     */
    public final boolean provides(IOperation operation) {
        if (operation instanceof CreateViewForKindOperation) {
            return provides((CreateViewForKindOperation) operation);
        }
        assert operation instanceof CreateViewOperation;
        if (operation instanceof CreateDiagramViewOperation) {
            return provides((CreateDiagramViewOperation) operation);
        } else if (operation instanceof CreateEdgeViewOperation) {
            return provides((CreateEdgeViewOperation) operation);
        } else if (operation instanceof CreateNodeViewOperation) {
            return provides((CreateNodeViewOperation) operation);
        }
        return false;
    }

    /**
     * @generated
     */
    protected boolean provides(CreateViewForKindOperation op) {
        /*
            if (op.getViewKind() == Node.class)
              return getNodeViewClass(op.getSemanticAdapter(), op.getContainerView(), op.getSemanticHint()) != null;
            if (op.getViewKind() == Edge.class)
              return getEdgeViewClass(op.getSemanticAdapter(), op.getContainerView(), op.getSemanticHint()) != null;
        */
        return true;
    }

    /**
     * @generated
     */
    protected boolean provides(CreateDiagramViewOperation op) {
        return RegionEditPart.MODEL_ID.equals(op.getSemanticHint())
                && SyncchartsVisualIDRegistry
                        .getDiagramVisualID(getSemanticElement(op
                                .getSemanticAdapter())) != -1;
    }

    /**
     * @generated
     */
    protected boolean provides(CreateNodeViewOperation op) {
        if (op.getContainerView() == null) {
            return false;
        }
        IElementType elementType = getSemanticElementType(op
                .getSemanticAdapter());
        EObject domainElement = getSemanticElement(op.getSemanticAdapter());
        int visualID;
        if (op.getSemanticHint() == null) {
            // Semantic hint is not specified. Can be a result of call from CanonicalEditPolicy.
            // In this situation there should be NO elementType, visualID will be determined
            // by VisualIDRegistry.getNodeVisualID() for domainElement.
            if (elementType != null || domainElement == null) {
                return false;
            }
            visualID = SyncchartsVisualIDRegistry.getNodeVisualID(op
                    .getContainerView(), domainElement);
        } else {
            visualID = SyncchartsVisualIDRegistry.getVisualID(op
                    .getSemanticHint());
            if (elementType != null) {
                if (!SyncchartsElementTypes.isKnownElementType(elementType)
                        || (!(elementType instanceof IHintedType))) {
                    return false; // foreign element type
                }
                String elementTypeHint = ((IHintedType) elementType)
                        .getSemanticHint();
                if (!op.getSemanticHint().equals(elementTypeHint)) {
                    return false; // if semantic hint is specified it should be the same as in element type
                }
                if (domainElement != null
                        && visualID != SyncchartsVisualIDRegistry
                                .getNodeVisualID(op.getContainerView(),
                                        domainElement)) {
                    return false; // visual id for node EClass should match visual id from element type
                }
            } else {
                if (!RegionEditPart.MODEL_ID.equals(SyncchartsVisualIDRegistry
                        .getModelID(op.getContainerView()))) {
                    return false; // foreign diagram
                }
                switch (visualID) {
                case StateEditPart.VISUAL_ID:
                case SignalEditPart.VISUAL_ID:
                case EntryActionEditPart.VISUAL_ID:
                case TextualCodeEditPart.VISUAL_ID:
                case Region2EditPart.VISUAL_ID:
                case State2EditPart.VISUAL_ID:
                case InnerActionEditPart.VISUAL_ID:
                case ExitActionEditPart.VISUAL_ID:
                case SuspensionTriggerEditPart.VISUAL_ID:
                    if (domainElement == null
                            || visualID != SyncchartsVisualIDRegistry
                                    .getNodeVisualID(op.getContainerView(),
                                            domainElement)) {
                        return false; // visual id in semantic hint should match visual id for domain element
                    }
                    break;
                default:
                    return false;
                }
            }
        }
        return StateEditPart.VISUAL_ID == visualID
                || Region2EditPart.VISUAL_ID == visualID
                || State2EditPart.VISUAL_ID == visualID
                || SignalEditPart.VISUAL_ID == visualID
                || EntryActionEditPart.VISUAL_ID == visualID
                || InnerActionEditPart.VISUAL_ID == visualID
                || ExitActionEditPart.VISUAL_ID == visualID
                || SuspensionTriggerEditPart.VISUAL_ID == visualID
                || TextualCodeEditPart.VISUAL_ID == visualID;
    }

    /**
     * @generated
     */
    protected boolean provides(CreateEdgeViewOperation op) {
        IElementType elementType = getSemanticElementType(op
                .getSemanticAdapter());
        if (!SyncchartsElementTypes.isKnownElementType(elementType)
                || (!(elementType instanceof IHintedType))) {
            return false; // foreign element type
        }
        String elementTypeHint = ((IHintedType) elementType).getSemanticHint();
        if (elementTypeHint == null
                || (op.getSemanticHint() != null && !elementTypeHint.equals(op
                        .getSemanticHint()))) {
            return false; // our hint is visual id and must be specified, and it should be the same as in element type
        }
        int visualID = SyncchartsVisualIDRegistry.getVisualID(elementTypeHint);
        EObject domainElement = getSemanticElement(op.getSemanticAdapter());
        if (domainElement != null
                && visualID != SyncchartsVisualIDRegistry
                        .getLinkWithClassVisualID(domainElement)) {
            return false; // visual id for link EClass should match visual id from element type
        }
        return true;
    }

    /**
     * @generated
     */
    public Diagram createDiagram(IAdaptable semanticAdapter,
            String diagramKind, PreferencesHint preferencesHint) {
        Diagram diagram = NotationFactory.eINSTANCE.createDiagram();
        diagram.getStyles().add(NotationFactory.eINSTANCE.createDiagramStyle());
        diagram.setType(RegionEditPart.MODEL_ID);
        diagram.setElement(getSemanticElement(semanticAdapter));
        diagram.setMeasurementUnit(MeasurementUnit.PIXEL_LITERAL);
        return diagram;
    }

    /**
     * @generated
     */
    public Node createNode(IAdaptable semanticAdapter, View containerView,
            String semanticHint, int index, boolean persisted,
            PreferencesHint preferencesHint) {
        final EObject domainElement = getSemanticElement(semanticAdapter);
        final int visualID;
        if (semanticHint == null) {
            visualID = SyncchartsVisualIDRegistry.getNodeVisualID(
                    containerView, domainElement);
        } else {
            visualID = SyncchartsVisualIDRegistry.getVisualID(semanticHint);
        }
        switch (visualID) {
        case StateEditPart.VISUAL_ID:
            return createState_2002(domainElement, containerView, index,
                    persisted, preferencesHint);
        case Region2EditPart.VISUAL_ID:
            return createRegion_3009(domainElement, containerView, index,
                    persisted, preferencesHint);
        case State2EditPart.VISUAL_ID:
            return createState_3010(domainElement, containerView, index,
                    persisted, preferencesHint);
        case SignalEditPart.VISUAL_ID:
            return createSignal_3011(domainElement, containerView, index,
                    persisted, preferencesHint);
        case EntryActionEditPart.VISUAL_ID:
            return createAction_3012(domainElement, containerView, index,
                    persisted, preferencesHint);
        case InnerActionEditPart.VISUAL_ID:
            return createAction_3014(domainElement, containerView, index,
                    persisted, preferencesHint);
        case ExitActionEditPart.VISUAL_ID:
            return createAction_3016(domainElement, containerView, index,
                    persisted, preferencesHint);
        case SuspensionTriggerEditPart.VISUAL_ID:
            return createAction_3018(domainElement, containerView, index,
                    persisted, preferencesHint);
        case TextualCodeEditPart.VISUAL_ID:
            return createTextualCode_3020(domainElement, containerView, index,
                    persisted, preferencesHint);
        }
        // can't happen, provided #provides(CreateNodeViewOperation) is correct
        return null;
    }

    /**
     * @generated
     */
    public Edge createEdge(IAdaptable semanticAdapter, View containerView,
            String semanticHint, int index, boolean persisted,
            PreferencesHint preferencesHint) {
        IElementType elementType = getSemanticElementType(semanticAdapter);
        String elementTypeHint = ((IHintedType) elementType).getSemanticHint();
        switch (SyncchartsVisualIDRegistry.getVisualID(elementTypeHint)) {
        case TransitionEditPart.VISUAL_ID:
            return createTransition_4002(getSemanticElement(semanticAdapter),
                    containerView, index, persisted, preferencesHint);
        }
        // can never happen, provided #provides(CreateEdgeViewOperation) is correct
        return null;
    }

    /**
     * @generated
     */
    public Node createState_2002(EObject domainElement, View containerView,
            int index, boolean persisted, PreferencesHint preferencesHint) {
        Shape node = NotationFactory.eINSTANCE.createShape();
        node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
        node.setType(SyncchartsVisualIDRegistry
                .getType(StateEditPart.VISUAL_ID));
        ViewUtil.insertChildView(containerView, node, index, persisted);
        node.setElement(domainElement);
        stampShortcut(containerView, node);
        // initializeFromPreferences 
        final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
                .getPreferenceStore();

        org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(
                prefStore, IPreferenceConstants.PREF_LINE_COLOR);
        ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE
                .getLineStyle_LineColor(), FigureUtilities
                .RGBToInteger(lineRGB));
        FontStyle nodeFontStyle = (FontStyle) node
                .getStyle(NotationPackage.Literals.FONT_STYLE);
        if (nodeFontStyle != null) {
            FontData fontData = PreferenceConverter.getFontData(prefStore,
                    IPreferenceConstants.PREF_DEFAULT_FONT);
            nodeFontStyle.setFontName(fontData.getName());
            nodeFontStyle.setFontHeight(fontData.getHeight());
            nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
            nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
            org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
                    .getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
            nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
                    .intValue());
        }
        org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(
                prefStore, IPreferenceConstants.PREF_FILL_COLOR);
        ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE
                .getFillStyle_FillColor(), FigureUtilities
                .RGBToInteger(fillRGB));
        Node label5023 = createLabel(node, SyncchartsVisualIDRegistry
                .getType(StateLabelEditPart.VISUAL_ID));
        Node label5029 = createLabel(node, SyncchartsVisualIDRegistry
                .getType(StateInterfaceDeclarationEditPart.VISUAL_ID));
        createCompartment(node, SyncchartsVisualIDRegistry
                .getType(StateSignalCompartmentEditPart.VISUAL_ID), true,
                false, false, false);
        createCompartment(node, SyncchartsVisualIDRegistry
                .getType(StateEntryActionCompartmentEditPart.VISUAL_ID), true,
                false, false, false);
        createCompartment(node, SyncchartsVisualIDRegistry
                .getType(StateInnerActionCompartmentEditPart.VISUAL_ID), true,
                false, false, false);
        createCompartment(node, SyncchartsVisualIDRegistry
                .getType(StateExitActionCompartmentEditPart.VISUAL_ID), true,
                false, false, false);
        createCompartment(node, SyncchartsVisualIDRegistry
                .getType(StateSuspensionTriggerCompartmentEditPart.VISUAL_ID),
                true, false, false, false);
        createCompartment(node, SyncchartsVisualIDRegistry
                .getType(StateRegionCompartmentEditPart.VISUAL_ID), true,
                false, false, false);
        return node;
    }

    /**
     * @generated
     */
    public Node createRegion_3009(EObject domainElement, View containerView,
            int index, boolean persisted, PreferencesHint preferencesHint) {
        Shape node = NotationFactory.eINSTANCE.createShape();
        node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
        node.setType(SyncchartsVisualIDRegistry
                .getType(Region2EditPart.VISUAL_ID));
        ViewUtil.insertChildView(containerView, node, index, persisted);
        node.setElement(domainElement);
        // initializeFromPreferences 
        final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
                .getPreferenceStore();

        org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(
                prefStore, IPreferenceConstants.PREF_LINE_COLOR);
        ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE
                .getLineStyle_LineColor(), FigureUtilities
                .RGBToInteger(lineRGB));
        FontStyle nodeFontStyle = (FontStyle) node
                .getStyle(NotationPackage.Literals.FONT_STYLE);
        if (nodeFontStyle != null) {
            FontData fontData = PreferenceConverter.getFontData(prefStore,
                    IPreferenceConstants.PREF_DEFAULT_FONT);
            nodeFontStyle.setFontName(fontData.getName());
            nodeFontStyle.setFontHeight(fontData.getHeight());
            nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
            nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
            org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
                    .getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
            nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
                    .intValue());
        }
        org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(
                prefStore, IPreferenceConstants.PREF_FILL_COLOR);
        ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE
                .getFillStyle_FillColor(), FigureUtilities
                .RGBToInteger(fillRGB));
        Node label5022 = createLabel(node, SyncchartsVisualIDRegistry
                .getType(RegionIdEditPart.VISUAL_ID));
        createCompartment(node, SyncchartsVisualIDRegistry
                .getType(RegionStateCompartmentEditPart.VISUAL_ID), true,
                false, false, false);
        return node;
    }

    /**
     * @generated
     */
    public Node createState_3010(EObject domainElement, View containerView,
            int index, boolean persisted, PreferencesHint preferencesHint) {
        Shape node = NotationFactory.eINSTANCE.createShape();
        node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
        node.setType(SyncchartsVisualIDRegistry
                .getType(State2EditPart.VISUAL_ID));
        ViewUtil.insertChildView(containerView, node, index, persisted);
        node.setElement(domainElement);
        // initializeFromPreferences 
        final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
                .getPreferenceStore();

        org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(
                prefStore, IPreferenceConstants.PREF_LINE_COLOR);
        ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE
                .getLineStyle_LineColor(), FigureUtilities
                .RGBToInteger(lineRGB));
        FontStyle nodeFontStyle = (FontStyle) node
                .getStyle(NotationPackage.Literals.FONT_STYLE);
        if (nodeFontStyle != null) {
            FontData fontData = PreferenceConverter.getFontData(prefStore,
                    IPreferenceConstants.PREF_DEFAULT_FONT);
            nodeFontStyle.setFontName(fontData.getName());
            nodeFontStyle.setFontHeight(fontData.getHeight());
            nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
            nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
            org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
                    .getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
            nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
                    .intValue());
        }
        org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(
                prefStore, IPreferenceConstants.PREF_FILL_COLOR);
        ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE
                .getFillStyle_FillColor(), FigureUtilities
                .RGBToInteger(fillRGB));
        Node label5021 = createLabel(node, SyncchartsVisualIDRegistry
                .getType(StateLabel2EditPart.VISUAL_ID));
        Node label5028 = createLabel(node, SyncchartsVisualIDRegistry
                .getType(StateInterfaceDeclaration2EditPart.VISUAL_ID));
        createCompartment(node, SyncchartsVisualIDRegistry
                .getType(StateSignalCompartment2EditPart.VISUAL_ID), true,
                false, false, false);
        createCompartment(node, SyncchartsVisualIDRegistry
                .getType(StateEntryActionCompartment2EditPart.VISUAL_ID), true,
                false, false, false);
        createCompartment(node, SyncchartsVisualIDRegistry
                .getType(StateInnerActionCompartment2EditPart.VISUAL_ID), true,
                false, false, false);
        createCompartment(node, SyncchartsVisualIDRegistry
                .getType(StateExitActionCompartment2EditPart.VISUAL_ID), true,
                false, false, false);
        createCompartment(node, SyncchartsVisualIDRegistry
                .getType(StateSuspensionTriggerCompartment2EditPart.VISUAL_ID),
                true, false, false, false);
        createCompartment(node, SyncchartsVisualIDRegistry
                .getType(StateRegionCompartment2EditPart.VISUAL_ID), true,
                false, false, false);
        return node;
    }

    /**
     * @generated
     */
    public Node createSignal_3011(EObject domainElement, View containerView,
            int index, boolean persisted, PreferencesHint preferencesHint) {
        Shape node = NotationFactory.eINSTANCE.createShape();
        node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
        node.setType(SyncchartsVisualIDRegistry
                .getType(SignalEditPart.VISUAL_ID));
        ViewUtil.insertChildView(containerView, node, index, persisted);
        node.setElement(domainElement);
        // initializeFromPreferences 
        final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
                .getPreferenceStore();

        org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(
                prefStore, IPreferenceConstants.PREF_LINE_COLOR);
        ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE
                .getLineStyle_LineColor(), FigureUtilities
                .RGBToInteger(lineRGB));
        FontStyle nodeFontStyle = (FontStyle) node
                .getStyle(NotationPackage.Literals.FONT_STYLE);
        if (nodeFontStyle != null) {
            FontData fontData = PreferenceConverter.getFontData(prefStore,
                    IPreferenceConstants.PREF_DEFAULT_FONT);
            nodeFontStyle.setFontName(fontData.getName());
            nodeFontStyle.setFontHeight(fontData.getHeight());
            nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
            nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
            org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
                    .getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
            nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
                    .intValue());
        }
        org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(
                prefStore, IPreferenceConstants.PREF_FILL_COLOR);
        ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE
                .getFillStyle_FillColor(), FigureUtilities
                .RGBToInteger(fillRGB));
        Node label5014 = createLabel(node, SyncchartsVisualIDRegistry
                .getType(SignalNameEditPart.VISUAL_ID));
        return node;
    }

    /**
     * @generated
     */
    public Node createAction_3012(EObject domainElement, View containerView,
            int index, boolean persisted, PreferencesHint preferencesHint) {
        Shape node = NotationFactory.eINSTANCE.createShape();
        node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
        node.setType(SyncchartsVisualIDRegistry
                .getType(EntryActionEditPart.VISUAL_ID));
        ViewUtil.insertChildView(containerView, node, index, persisted);
        node.setElement(domainElement);
        // initializeFromPreferences 
        final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
                .getPreferenceStore();

        org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(
                prefStore, IPreferenceConstants.PREF_LINE_COLOR);
        ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE
                .getLineStyle_LineColor(), FigureUtilities
                .RGBToInteger(lineRGB));
        FontStyle nodeFontStyle = (FontStyle) node
                .getStyle(NotationPackage.Literals.FONT_STYLE);
        if (nodeFontStyle != null) {
            FontData fontData = PreferenceConverter.getFontData(prefStore,
                    IPreferenceConstants.PREF_DEFAULT_FONT);
            nodeFontStyle.setFontName(fontData.getName());
            nodeFontStyle.setFontHeight(fontData.getHeight());
            nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
            nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
            org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
                    .getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
            nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
                    .intValue());
        }
        org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(
                prefStore, IPreferenceConstants.PREF_FILL_COLOR);
        ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE
                .getFillStyle_FillColor(), FigureUtilities
                .RGBToInteger(fillRGB));
        Node label5024 = createLabel(node, SyncchartsVisualIDRegistry
                .getType(EntryActionLabelEditPart.VISUAL_ID));
        return node;
    }

    /**
     * @generated
     */
    public Node createAction_3014(EObject domainElement, View containerView,
            int index, boolean persisted, PreferencesHint preferencesHint) {
        Shape node = NotationFactory.eINSTANCE.createShape();
        node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
        node.setType(SyncchartsVisualIDRegistry
                .getType(InnerActionEditPart.VISUAL_ID));
        ViewUtil.insertChildView(containerView, node, index, persisted);
        node.setElement(domainElement);
        // initializeFromPreferences 
        final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
                .getPreferenceStore();

        org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(
                prefStore, IPreferenceConstants.PREF_LINE_COLOR);
        ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE
                .getLineStyle_LineColor(), FigureUtilities
                .RGBToInteger(lineRGB));
        FontStyle nodeFontStyle = (FontStyle) node
                .getStyle(NotationPackage.Literals.FONT_STYLE);
        if (nodeFontStyle != null) {
            FontData fontData = PreferenceConverter.getFontData(prefStore,
                    IPreferenceConstants.PREF_DEFAULT_FONT);
            nodeFontStyle.setFontName(fontData.getName());
            nodeFontStyle.setFontHeight(fontData.getHeight());
            nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
            nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
            org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
                    .getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
            nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
                    .intValue());
        }
        org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(
                prefStore, IPreferenceConstants.PREF_FILL_COLOR);
        ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE
                .getFillStyle_FillColor(), FigureUtilities
                .RGBToInteger(fillRGB));
        Node label5025 = createLabel(node, SyncchartsVisualIDRegistry
                .getType(InnerActionLabelEditPart.VISUAL_ID));
        return node;
    }

    /**
     * @generated
     */
    public Node createAction_3016(EObject domainElement, View containerView,
            int index, boolean persisted, PreferencesHint preferencesHint) {
        Shape node = NotationFactory.eINSTANCE.createShape();
        node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
        node.setType(SyncchartsVisualIDRegistry
                .getType(ExitActionEditPart.VISUAL_ID));
        ViewUtil.insertChildView(containerView, node, index, persisted);
        node.setElement(domainElement);
        // initializeFromPreferences 
        final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
                .getPreferenceStore();

        org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(
                prefStore, IPreferenceConstants.PREF_LINE_COLOR);
        ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE
                .getLineStyle_LineColor(), FigureUtilities
                .RGBToInteger(lineRGB));
        FontStyle nodeFontStyle = (FontStyle) node
                .getStyle(NotationPackage.Literals.FONT_STYLE);
        if (nodeFontStyle != null) {
            FontData fontData = PreferenceConverter.getFontData(prefStore,
                    IPreferenceConstants.PREF_DEFAULT_FONT);
            nodeFontStyle.setFontName(fontData.getName());
            nodeFontStyle.setFontHeight(fontData.getHeight());
            nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
            nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
            org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
                    .getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
            nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
                    .intValue());
        }
        org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(
                prefStore, IPreferenceConstants.PREF_FILL_COLOR);
        ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE
                .getFillStyle_FillColor(), FigureUtilities
                .RGBToInteger(fillRGB));
        Node label5026 = createLabel(node, SyncchartsVisualIDRegistry
                .getType(ExitActionLabelEditPart.VISUAL_ID));
        return node;
    }

    /**
     * @generated
     */
    public Node createAction_3018(EObject domainElement, View containerView,
            int index, boolean persisted, PreferencesHint preferencesHint) {
        Shape node = NotationFactory.eINSTANCE.createShape();
        node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
        node.setType(SyncchartsVisualIDRegistry
                .getType(SuspensionTriggerEditPart.VISUAL_ID));
        ViewUtil.insertChildView(containerView, node, index, persisted);
        node.setElement(domainElement);
        // initializeFromPreferences 
        final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
                .getPreferenceStore();

        org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(
                prefStore, IPreferenceConstants.PREF_LINE_COLOR);
        ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE
                .getLineStyle_LineColor(), FigureUtilities
                .RGBToInteger(lineRGB));
        FontStyle nodeFontStyle = (FontStyle) node
                .getStyle(NotationPackage.Literals.FONT_STYLE);
        if (nodeFontStyle != null) {
            FontData fontData = PreferenceConverter.getFontData(prefStore,
                    IPreferenceConstants.PREF_DEFAULT_FONT);
            nodeFontStyle.setFontName(fontData.getName());
            nodeFontStyle.setFontHeight(fontData.getHeight());
            nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
            nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
            org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
                    .getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
            nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
                    .intValue());
        }
        org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(
                prefStore, IPreferenceConstants.PREF_FILL_COLOR);
        ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE
                .getFillStyle_FillColor(), FigureUtilities
                .RGBToInteger(fillRGB));
        Node label5027 = createLabel(node, SyncchartsVisualIDRegistry
                .getType(SuspensionTriggerLabelEditPart.VISUAL_ID));
        return node;
    }

    /**
     * @generated
     */
    public Node createTextualCode_3020(EObject domainElement,
            View containerView, int index, boolean persisted,
            PreferencesHint preferencesHint) {
        Node node = NotationFactory.eINSTANCE.createNode();
        node.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
        node.setType(SyncchartsVisualIDRegistry
                .getType(TextualCodeEditPart.VISUAL_ID));
        ViewUtil.insertChildView(containerView, node, index, persisted);
        node.setElement(domainElement);
        return node;
    }

    /**
     * @generated
     */
    public Edge createTransition_4002(EObject domainElement,
            View containerView, int index, boolean persisted,
            PreferencesHint preferencesHint) {
        Connector edge = NotationFactory.eINSTANCE.createConnector();
        edge.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
        RelativeBendpoints bendpoints = NotationFactory.eINSTANCE
                .createRelativeBendpoints();
        ArrayList points = new ArrayList(2);
        points.add(new RelativeBendpoint());
        points.add(new RelativeBendpoint());
        bendpoints.setPoints(points);
        edge.setBendpoints(bendpoints);
        ViewUtil.insertChildView(containerView, edge, index, persisted);
        edge.setType(SyncchartsVisualIDRegistry
                .getType(TransitionEditPart.VISUAL_ID));
        edge.setElement(domainElement);
        // initializePreferences
        final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
                .getPreferenceStore();

        org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(
                prefStore, IPreferenceConstants.PREF_LINE_COLOR);
        ViewUtil.setStructuralFeatureValue(edge, NotationPackage.eINSTANCE
                .getLineStyle_LineColor(), FigureUtilities
                .RGBToInteger(lineRGB));
        FontStyle edgeFontStyle = (FontStyle) edge
                .getStyle(NotationPackage.Literals.FONT_STYLE);
        if (edgeFontStyle != null) {
            FontData fontData = PreferenceConverter.getFontData(prefStore,
                    IPreferenceConstants.PREF_DEFAULT_FONT);
            edgeFontStyle.setFontName(fontData.getName());
            edgeFontStyle.setFontHeight(fontData.getHeight());
            edgeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
            edgeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
            org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
                    .getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
            edgeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
                    .intValue());
        }
        Routing routing = Routing.get(prefStore
                .getInt(IPreferenceConstants.PREF_LINE_STYLE));
        if (routing != null) {
            ViewUtil.setStructuralFeatureValue(edge, NotationPackage.eINSTANCE
                    .getRoutingStyle_Routing(), routing);
        }
        Node label6003 = createLabel(edge, SyncchartsVisualIDRegistry
                .getType(TransitionDelayEditPart.VISUAL_ID));
        label6003.setLayoutConstraint(NotationFactory.eINSTANCE
                .createLocation());
        Location location6003 = (Location) label6003.getLayoutConstraint();
        location6003.setX(0);
        location6003.setY(40);
        Node label6004 = createLabel(edge, SyncchartsVisualIDRegistry
                .getType(TransitionPriorityEditPart.VISUAL_ID));
        label6004.setLayoutConstraint(NotationFactory.eINSTANCE
                .createLocation());
        Location location6004 = (Location) label6004.getLayoutConstraint();
        location6004.setX(0);
        location6004.setY(60);
        return edge;
    }

    /**
     * @generated
     */
    private void stampShortcut(View containerView, Node target) {
        if (!RegionEditPart.MODEL_ID.equals(SyncchartsVisualIDRegistry
                .getModelID(containerView))) {
            EAnnotation shortcutAnnotation = EcoreFactory.eINSTANCE
                    .createEAnnotation();
            shortcutAnnotation.setSource("Shortcut"); //$NON-NLS-1$
            shortcutAnnotation.getDetails().put(
                    "modelID", RegionEditPart.MODEL_ID); //$NON-NLS-1$
            target.getEAnnotations().add(shortcutAnnotation);
        }
    }

    /**
     * @generated
     */
    private Node createLabel(View owner, String hint) {
        DecorationNode rv = NotationFactory.eINSTANCE.createDecorationNode();
        rv.setType(hint);
        ViewUtil.insertChildView(owner, rv, ViewUtil.APPEND, true);
        return rv;
    }

    /**
     * @generated
     */
    private Node createCompartment(View owner, String hint,
            boolean canCollapse, boolean hasTitle, boolean canSort,
            boolean canFilter) {
        //SemanticListCompartment rv = NotationFactory.eINSTANCE.createSemanticListCompartment();
        //rv.setShowTitle(showTitle);
        //rv.setCollapsed(isCollapsed);
        Node rv;
        if (canCollapse) {
            rv = NotationFactory.eINSTANCE.createBasicCompartment();
        } else {
            rv = NotationFactory.eINSTANCE.createDecorationNode();
        }
        if (hasTitle) {
            TitleStyle ts = NotationFactory.eINSTANCE.createTitleStyle();
            ts.setShowTitle(true);
            rv.getStyles().add(ts);
        }
        if (canSort) {
            rv.getStyles().add(NotationFactory.eINSTANCE.createSortingStyle());
        }
        if (canFilter) {
            rv.getStyles()
                    .add(NotationFactory.eINSTANCE.createFilteringStyle());
        }
        rv.setType(hint);
        ViewUtil.insertChildView(owner, rv, ViewUtil.APPEND, true);
        return rv;
    }

    /**
     * @generated
     */
    private EObject getSemanticElement(IAdaptable semanticAdapter) {
        if (semanticAdapter == null) {
            return null;
        }
        EObject eObject = (EObject) semanticAdapter.getAdapter(EObject.class);
        if (eObject != null) {
            return EMFCoreUtil.resolve(TransactionUtil
                    .getEditingDomain(eObject), eObject);
        }
        return null;
    }

    /**
     * @generated
     */
    private IElementType getSemanticElementType(IAdaptable semanticAdapter) {
        if (semanticAdapter == null) {
            return null;
        }
        return (IElementType) semanticAdapter.getAdapter(IElementType.class);
    }
}
