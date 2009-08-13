package de.cau.cs.kieler.synccharts.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import de.cau.cs.kieler.synccharts.Region;
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
import de.cau.cs.kieler.synccharts.diagram.edit.parts.SignalEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.SignalNameEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.State2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateLabel2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateLabelEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.TransitionEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.TransitionTriggersAndEffectsEditPart;
import de.cau.cs.kieler.synccharts.diagram.part.SyncchartsDiagramEditorPlugin;
import de.cau.cs.kieler.synccharts.diagram.part.SyncchartsVisualIDRegistry;
import de.cau.cs.kieler.synccharts.diagram.providers.SyncchartsElementTypes;
import de.cau.cs.kieler.synccharts.diagram.providers.SyncchartsParserProvider;

/**
 * @generated
 */
public class SyncchartsNavigatorLabelProvider extends LabelProvider implements
        ICommonLabelProvider, ITreePathLabelProvider {

    /**
     * @generated
     */
    static {
        SyncchartsDiagramEditorPlugin.getInstance().getImageRegistry().put(
                "Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
        SyncchartsDiagramEditorPlugin.getInstance().getImageRegistry().put(
                "Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
    }

    /**
     * @generated
     */
    public void updateLabel(ViewerLabel label, TreePath elementPath) {
        Object element = elementPath.getLastSegment();
        if (element instanceof SyncchartsNavigatorItem
                && !isOwnView(((SyncchartsNavigatorItem) element).getView())) {
            return;
        }
        label.setText(getText(element));
        label.setImage(getImage(element));
    }

    /**
     * @generated
     */
    public Image getImage(Object element) {
        if (element instanceof SyncchartsNavigatorGroup) {
            SyncchartsNavigatorGroup group = (SyncchartsNavigatorGroup) element;
            return SyncchartsDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
        }

        if (element instanceof SyncchartsNavigatorItem) {
            SyncchartsNavigatorItem navigatorItem = (SyncchartsNavigatorItem) element;
            if (!isOwnView(navigatorItem.getView())) {
                return super.getImage(element);
            }
            return getImage(navigatorItem.getView());
        }

        return super.getImage(element);
    }

    /**
     * @generated
     */
    public Image getImage(View view) {
        switch (SyncchartsVisualIDRegistry.getVisualID(view)) {
        case RegionEditPart.VISUAL_ID:
            return getImage(
                    "Navigator?Diagram?http://kieler.cs.cau.de/synccharts?Region", SyncchartsElementTypes.Region_1000); //$NON-NLS-1$
        case StateEditPart.VISUAL_ID:
            return getImage(
                    "Navigator?TopLevelNode?http://kieler.cs.cau.de/synccharts?State", SyncchartsElementTypes.State_2001); //$NON-NLS-1$
        case Region2EditPart.VISUAL_ID:
            return getImage(
                    "Navigator?Node?http://kieler.cs.cau.de/synccharts?Region", SyncchartsElementTypes.Region_3001); //$NON-NLS-1$
        case State2EditPart.VISUAL_ID:
            return getImage(
                    "Navigator?Node?http://kieler.cs.cau.de/synccharts?State", SyncchartsElementTypes.State_3002); //$NON-NLS-1$
        case SignalEditPart.VISUAL_ID:
            return getImage(
                    "Navigator?Node?http://kieler.cs.cau.de/synccharts?Signal", SyncchartsElementTypes.Signal_3003); //$NON-NLS-1$
        case ActionEditPart.VISUAL_ID:
            return getImage(
                    "Navigator?Node?http://kieler.cs.cau.de/synccharts?Action", SyncchartsElementTypes.Action_3004); //$NON-NLS-1$
        case Action2EditPart.VISUAL_ID:
            return getImage(
                    "Navigator?Node?http://kieler.cs.cau.de/synccharts?Action", SyncchartsElementTypes.Action_3005); //$NON-NLS-1$
        case Action3EditPart.VISUAL_ID:
            return getImage(
                    "Navigator?Node?http://kieler.cs.cau.de/synccharts?Action", SyncchartsElementTypes.Action_3006); //$NON-NLS-1$
        case Action4EditPart.VISUAL_ID:
            return getImage(
                    "Navigator?Node?http://kieler.cs.cau.de/synccharts?Action", SyncchartsElementTypes.Action_3008); //$NON-NLS-1$
        case TransitionEditPart.VISUAL_ID:
            return getImage(
                    "Navigator?Link?http://kieler.cs.cau.de/synccharts?Transition", SyncchartsElementTypes.Transition_4001); //$NON-NLS-1$
        }
        return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
    }

    /**
     * @generated
     */
    private Image getImage(String key, IElementType elementType) {
        ImageRegistry imageRegistry = SyncchartsDiagramEditorPlugin.getInstance()
                .getImageRegistry();
        Image image = imageRegistry.get(key);
        if (image == null && elementType != null
                && SyncchartsElementTypes.isKnownElementType(elementType)) {
            image = SyncchartsElementTypes.getImage(elementType);
            imageRegistry.put(key, image);
        }

        if (image == null) {
            image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
            imageRegistry.put(key, image);
        }
        return image;
    }

    /**
     * @generated
     */
    public String getText(Object element) {
        if (element instanceof SyncchartsNavigatorGroup) {
            SyncchartsNavigatorGroup group = (SyncchartsNavigatorGroup) element;
            return group.getGroupName();
        }

        if (element instanceof SyncchartsNavigatorItem) {
            SyncchartsNavigatorItem navigatorItem = (SyncchartsNavigatorItem) element;
            if (!isOwnView(navigatorItem.getView())) {
                return null;
            }
            return getText(navigatorItem.getView());
        }

        return super.getText(element);
    }

    /**
     * @generated
     */
    public String getText(View view) {
        if (view.getElement() != null && view.getElement().eIsProxy()) {
            return getUnresolvedDomainElementProxyText(view);
        }
        switch (SyncchartsVisualIDRegistry.getVisualID(view)) {
        case RegionEditPart.VISUAL_ID:
            return getRegion_1000Text(view);
        case StateEditPart.VISUAL_ID:
            return getState_2001Text(view);
        case Region2EditPart.VISUAL_ID:
            return getRegion_3001Text(view);
        case State2EditPart.VISUAL_ID:
            return getState_3002Text(view);
        case SignalEditPart.VISUAL_ID:
            return getSignal_3003Text(view);
        case ActionEditPart.VISUAL_ID:
            return getAction_3004Text(view);
        case Action2EditPart.VISUAL_ID:
            return getAction_3005Text(view);
        case Action3EditPart.VISUAL_ID:
            return getAction_3006Text(view);
        case Action4EditPart.VISUAL_ID:
            return getAction_3008Text(view);
        case TransitionEditPart.VISUAL_ID:
            return getTransition_4001Text(view);
        }
        return getUnknownElementText(view);
    }

    /**
     * @generated
     */
    private String getRegion_1000Text(View view) {
        Region domainModelElement = (Region) view.getElement();
        if (domainModelElement != null) {
            return domainModelElement.getId();
        }
        else {
            SyncchartsDiagramEditorPlugin.getInstance().logError(
                    "No domain element for view with visualID = " + 1000); //$NON-NLS-1$
            return ""; //$NON-NLS-1$
        }
    }

    /**
     * @generated
     */
    private String getState_2001Text(View view) {
        IParser parser = SyncchartsParserProvider.getParser(SyncchartsElementTypes.State_2001, view
                .getElement() != null ? view.getElement() : view, SyncchartsVisualIDRegistry
                .getType(StateLabelEditPart.VISUAL_ID));
        if (parser != null) {
            return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view
                    .getElement() : view), ParserOptions.NONE.intValue());
        }
        else {
            SyncchartsDiagramEditorPlugin.getInstance().logError(
                    "Parser was not found for label " + 5008); //$NON-NLS-1$
            return ""; //$NON-NLS-1$
        }
    }

    /**
     * @generated
     */
    private String getRegion_3001Text(View view) {
        Region domainModelElement = (Region) view.getElement();
        if (domainModelElement != null) {
            return domainModelElement.getId();
        }
        else {
            SyncchartsDiagramEditorPlugin.getInstance().logError(
                    "No domain element for view with visualID = " + 3001); //$NON-NLS-1$
            return ""; //$NON-NLS-1$
        }
    }

    /**
     * @generated
     */
    private String getState_3002Text(View view) {
        IParser parser = SyncchartsParserProvider.getParser(SyncchartsElementTypes.State_3002, view
                .getElement() != null ? view.getElement() : view, SyncchartsVisualIDRegistry
                .getType(StateLabel2EditPart.VISUAL_ID));
        if (parser != null) {
            return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view
                    .getElement() : view), ParserOptions.NONE.intValue());
        }
        else {
            SyncchartsDiagramEditorPlugin.getInstance().logError(
                    "Parser was not found for label " + 5007); //$NON-NLS-1$
            return ""; //$NON-NLS-1$
        }
    }

    /**
     * @generated
     */
    private String getSignal_3003Text(View view) {
        IParser parser = SyncchartsParserProvider.getParser(SyncchartsElementTypes.Signal_3003,
                view.getElement() != null ? view.getElement() : view, SyncchartsVisualIDRegistry
                        .getType(SignalNameEditPart.VISUAL_ID));
        if (parser != null) {
            return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view
                    .getElement() : view), ParserOptions.NONE.intValue());
        }
        else {
            SyncchartsDiagramEditorPlugin.getInstance().logError(
                    "Parser was not found for label " + 5001); //$NON-NLS-1$
            return ""; //$NON-NLS-1$
        }
    }

    /**
     * @generated
     */
    private String getAction_3004Text(View view) {
        IParser parser = SyncchartsParserProvider.getParser(SyncchartsElementTypes.Action_3004,
                view.getElement() != null ? view.getElement() : view, SyncchartsVisualIDRegistry
                        .getType(ActionTriggersAndEffectsEditPart.VISUAL_ID));
        if (parser != null) {
            return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view
                    .getElement() : view), ParserOptions.NONE.intValue());
        }
        else {
            SyncchartsDiagramEditorPlugin.getInstance().logError(
                    "Parser was not found for label " + 5002); //$NON-NLS-1$
            return ""; //$NON-NLS-1$
        }
    }

    /**
     * @generated
     */
    private String getAction_3005Text(View view) {
        IParser parser = SyncchartsParserProvider.getParser(SyncchartsElementTypes.Action_3005,
                view.getElement() != null ? view.getElement() : view, SyncchartsVisualIDRegistry
                        .getType(ActionTriggersAndEffects2EditPart.VISUAL_ID));
        if (parser != null) {
            return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view
                    .getElement() : view), ParserOptions.NONE.intValue());
        }
        else {
            SyncchartsDiagramEditorPlugin.getInstance().logError(
                    "Parser was not found for label " + 5003); //$NON-NLS-1$
            return ""; //$NON-NLS-1$
        }
    }

    /**
     * @generated
     */
    private String getAction_3006Text(View view) {
        IParser parser = SyncchartsParserProvider.getParser(SyncchartsElementTypes.Action_3006,
                view.getElement() != null ? view.getElement() : view, SyncchartsVisualIDRegistry
                        .getType(ActionTriggersAndEffects3EditPart.VISUAL_ID));
        if (parser != null) {
            return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view
                    .getElement() : view), ParserOptions.NONE.intValue());
        }
        else {
            SyncchartsDiagramEditorPlugin.getInstance().logError(
                    "Parser was not found for label " + 5004); //$NON-NLS-1$
            return ""; //$NON-NLS-1$
        }
    }

    /**
     * @generated
     */
    private String getAction_3008Text(View view) {
        IParser parser = SyncchartsParserProvider.getParser(SyncchartsElementTypes.Action_3008,
                view.getElement() != null ? view.getElement() : view, SyncchartsVisualIDRegistry
                        .getType(ActionTriggersAndEffects4EditPart.VISUAL_ID));
        if (parser != null) {
            return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view
                    .getElement() : view), ParserOptions.NONE.intValue());
        }
        else {
            SyncchartsDiagramEditorPlugin.getInstance().logError(
                    "Parser was not found for label " + 5006); //$NON-NLS-1$
            return ""; //$NON-NLS-1$
        }
    }

    /**
     * @generated
     */
    private String getTransition_4001Text(View view) {
        IParser parser = SyncchartsParserProvider.getParser(SyncchartsElementTypes.Transition_4001,
                view.getElement() != null ? view.getElement() : view, SyncchartsVisualIDRegistry
                        .getType(TransitionTriggersAndEffectsEditPart.VISUAL_ID));
        if (parser != null) {
            return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view
                    .getElement() : view), ParserOptions.NONE.intValue());
        }
        else {
            SyncchartsDiagramEditorPlugin.getInstance().logError(
                    "Parser was not found for label " + 6001); //$NON-NLS-1$
            return ""; //$NON-NLS-1$
        }
    }

    /**
     * @generated
     */
    private String getUnknownElementText(View view) {
        return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
    }

    /**
     * @generated
     */
    private String getUnresolvedDomainElementProxyText(View view) {
        return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
    }

    /**
     * @generated
     */
    public void init(ICommonContentExtensionSite aConfig) {
    }

    /**
     * @generated
     */
    public void restoreState(IMemento aMemento) {
    }

    /**
     * @generated
     */
    public void saveState(IMemento aMemento) {
    }

    /**
     * @generated
     */
    public String getDescription(Object anElement) {
        return null;
    }

    /**
     * @generated
     */
    private boolean isOwnView(View view) {
        return RegionEditPart.MODEL_ID.equals(SyncchartsVisualIDRegistry.getModelID(view));
    }

}
