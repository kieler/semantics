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
import de.cau.cs.kieler.synccharts.diagram.edit.parts.EntryActionEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.EntryActionLabelEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.ExitActionEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.ExitActionLabelEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.InnerActionEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.InnerActionLabelEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.Region2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.RegionEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.RegionIdEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.SignalEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.SignalNameEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.State2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateLabel2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateLabelEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.SuspensionTriggerEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.SuspensionTriggerLabelEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.TextualCodeEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.TransitionDelayEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.TransitionEditPart;
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
                    "Navigator?Diagram?http://kieler.cs.cau.de/synccharts/0.2?Region", SyncchartsElementTypes.Region_1000); //$NON-NLS-1$
        case StateEditPart.VISUAL_ID:
            return getImage(
                    "Navigator?TopLevelNode?http://kieler.cs.cau.de/synccharts/0.2?State", SyncchartsElementTypes.State_2002); //$NON-NLS-1$
        case Region2EditPart.VISUAL_ID:
            return getImage(
                    "Navigator?Node?http://kieler.cs.cau.de/synccharts/0.2?Region", SyncchartsElementTypes.Region_3009); //$NON-NLS-1$
        case State2EditPart.VISUAL_ID:
            return getImage(
                    "Navigator?Node?http://kieler.cs.cau.de/synccharts/0.2?State", SyncchartsElementTypes.State_3010); //$NON-NLS-1$
        case SignalEditPart.VISUAL_ID:
            return getImage(
                    "Navigator?Node?http://kieler.cs.cau.de/expressions?Signal", SyncchartsElementTypes.Signal_3021); //$NON-NLS-1$
        case EntryActionEditPart.VISUAL_ID:
            return getImage(
                    "Navigator?Node?http://kieler.cs.cau.de/synccharts/0.2?Action", SyncchartsElementTypes.Action_3012); //$NON-NLS-1$
        case InnerActionEditPart.VISUAL_ID:
            return getImage(
                    "Navigator?Node?http://kieler.cs.cau.de/synccharts/0.2?Action", SyncchartsElementTypes.Action_3014); //$NON-NLS-1$
        case ExitActionEditPart.VISUAL_ID:
            return getImage(
                    "Navigator?Node?http://kieler.cs.cau.de/synccharts/0.2?Action", SyncchartsElementTypes.Action_3016); //$NON-NLS-1$
        case SuspensionTriggerEditPart.VISUAL_ID:
            return getImage(
                    "Navigator?Node?http://kieler.cs.cau.de/synccharts/0.2?Action", SyncchartsElementTypes.Action_3018); //$NON-NLS-1$
        case TextualCodeEditPart.VISUAL_ID:
            return getImage(
                    "Navigator?Node?http://kieler.cs.cau.de/expressions?TextualCode", SyncchartsElementTypes.TextualCode_3022); //$NON-NLS-1$
        case TransitionEditPart.VISUAL_ID:
            return getImage(
                    "Navigator?Link?http://kieler.cs.cau.de/synccharts/0.2?Transition", SyncchartsElementTypes.Transition_4002); //$NON-NLS-1$
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
            return getState_2002Text(view);
        case Region2EditPart.VISUAL_ID:
            return getRegion_3009Text(view);
        case State2EditPart.VISUAL_ID:
            return getState_3010Text(view);
        case SignalEditPart.VISUAL_ID:
            return getSignal_3021Text(view);
        case EntryActionEditPart.VISUAL_ID:
            return getAction_3012Text(view);
        case InnerActionEditPart.VISUAL_ID:
            return getAction_3014Text(view);
        case ExitActionEditPart.VISUAL_ID:
            return getAction_3016Text(view);
        case SuspensionTriggerEditPart.VISUAL_ID:
            return getAction_3018Text(view);
        case TextualCodeEditPart.VISUAL_ID:
            return getTextualCode_3022Text(view);
        case TransitionEditPart.VISUAL_ID:
            return getTransition_4002Text(view);
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
        } else {
            SyncchartsDiagramEditorPlugin.getInstance().logError(
                    "No domain element for view with visualID = " + 1000); //$NON-NLS-1$
            return ""; //$NON-NLS-1$
        }
    }

    /**
     * @generated
     */
    private String getState_2002Text(View view) {
        IParser parser = SyncchartsParserProvider.getParser(SyncchartsElementTypes.State_2002, view
                .getElement() != null ? view.getElement() : view, SyncchartsVisualIDRegistry
                .getType(StateLabelEditPart.VISUAL_ID));
        if (parser != null) {
            return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view
                    .getElement() : view), ParserOptions.NONE.intValue());
        } else {
            SyncchartsDiagramEditorPlugin.getInstance().logError(
                    "Parser was not found for label " + 5023); //$NON-NLS-1$
            return ""; //$NON-NLS-1$
        }
    }

    /**
     * @generated
     */
    private String getRegion_3009Text(View view) {
        IParser parser = SyncchartsParserProvider.getParser(SyncchartsElementTypes.Region_3009,
                view.getElement() != null ? view.getElement() : view, SyncchartsVisualIDRegistry
                        .getType(RegionIdEditPart.VISUAL_ID));
        if (parser != null) {
            return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view
                    .getElement() : view), ParserOptions.NONE.intValue());
        } else {
            SyncchartsDiagramEditorPlugin.getInstance().logError(
                    "Parser was not found for label " + 5022); //$NON-NLS-1$
            return ""; //$NON-NLS-1$
        }
    }

    /**
     * @generated
     */
    private String getState_3010Text(View view) {
        IParser parser = SyncchartsParserProvider.getParser(SyncchartsElementTypes.State_3010, view
                .getElement() != null ? view.getElement() : view, SyncchartsVisualIDRegistry
                .getType(StateLabel2EditPart.VISUAL_ID));
        if (parser != null) {
            return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view
                    .getElement() : view), ParserOptions.NONE.intValue());
        } else {
            SyncchartsDiagramEditorPlugin.getInstance().logError(
                    "Parser was not found for label " + 5021); //$NON-NLS-1$
            return ""; //$NON-NLS-1$
        }
    }

    /**
     * @generated
     */
    private String getSignal_3021Text(View view) {
        IParser parser = SyncchartsParserProvider.getParser(SyncchartsElementTypes.Signal_3021,
                view.getElement() != null ? view.getElement() : view, SyncchartsVisualIDRegistry
                        .getType(SignalNameEditPart.VISUAL_ID));
        if (parser != null) {
            return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view
                    .getElement() : view), ParserOptions.NONE.intValue());
        } else {
            SyncchartsDiagramEditorPlugin.getInstance().logError(
                    "Parser was not found for label " + 5030); //$NON-NLS-1$
            return ""; //$NON-NLS-1$
        }
    }

    /**
     * @generated
     */
    private String getAction_3012Text(View view) {
        IParser parser = SyncchartsParserProvider.getParser(SyncchartsElementTypes.Action_3012,
                view.getElement() != null ? view.getElement() : view, SyncchartsVisualIDRegistry
                        .getType(EntryActionLabelEditPart.VISUAL_ID));
        if (parser != null) {
            return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view
                    .getElement() : view), ParserOptions.NONE.intValue());
        } else {
            SyncchartsDiagramEditorPlugin.getInstance().logError(
                    "Parser was not found for label " + 5024); //$NON-NLS-1$
            return ""; //$NON-NLS-1$
        }
    }

    /**
     * @generated
     */
    private String getAction_3014Text(View view) {
        IParser parser = SyncchartsParserProvider.getParser(SyncchartsElementTypes.Action_3014,
                view.getElement() != null ? view.getElement() : view, SyncchartsVisualIDRegistry
                        .getType(InnerActionLabelEditPart.VISUAL_ID));
        if (parser != null) {
            return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view
                    .getElement() : view), ParserOptions.NONE.intValue());
        } else {
            SyncchartsDiagramEditorPlugin.getInstance().logError(
                    "Parser was not found for label " + 5025); //$NON-NLS-1$
            return ""; //$NON-NLS-1$
        }
    }

    /**
     * @generated
     */
    private String getAction_3016Text(View view) {
        IParser parser = SyncchartsParserProvider.getParser(SyncchartsElementTypes.Action_3016,
                view.getElement() != null ? view.getElement() : view, SyncchartsVisualIDRegistry
                        .getType(ExitActionLabelEditPart.VISUAL_ID));
        if (parser != null) {
            return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view
                    .getElement() : view), ParserOptions.NONE.intValue());
        } else {
            SyncchartsDiagramEditorPlugin.getInstance().logError(
                    "Parser was not found for label " + 5026); //$NON-NLS-1$
            return ""; //$NON-NLS-1$
        }
    }

    /**
     * @generated
     */
    private String getAction_3018Text(View view) {
        IParser parser = SyncchartsParserProvider.getParser(SyncchartsElementTypes.Action_3018,
                view.getElement() != null ? view.getElement() : view, SyncchartsVisualIDRegistry
                        .getType(SuspensionTriggerLabelEditPart.VISUAL_ID));
        if (parser != null) {
            return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view
                    .getElement() : view), ParserOptions.NONE.intValue());
        } else {
            SyncchartsDiagramEditorPlugin.getInstance().logError(
                    "Parser was not found for label " + 5027); //$NON-NLS-1$
            return ""; //$NON-NLS-1$
        }
    }

    /**
     * @generated
     */
    private String getTextualCode_3022Text(View view) {
        IParser parser = SyncchartsParserProvider.getParser(
                SyncchartsElementTypes.TextualCode_3022, view.getElement() != null ? view
                        .getElement() : view, SyncchartsVisualIDRegistry
                        .getType(TextualCodeEditPart.VISUAL_ID));
        if (parser != null) {
            return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view
                    .getElement() : view), ParserOptions.NONE.intValue());
        } else {
            SyncchartsDiagramEditorPlugin.getInstance().logError(
                    "Parser was not found for label " + 3022); //$NON-NLS-1$
            return ""; //$NON-NLS-1$
        }
    }

    /**
     * @generated
     */
    private String getTransition_4002Text(View view) {
        IParser parser = SyncchartsParserProvider.getParser(SyncchartsElementTypes.Transition_4002,
                view.getElement() != null ? view.getElement() : view, SyncchartsVisualIDRegistry
                        .getType(TransitionDelayEditPart.VISUAL_ID));
        if (parser != null) {
            return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view
                    .getElement() : view), ParserOptions.NONE.intValue());
        } else {
            SyncchartsDiagramEditorPlugin.getInstance().logError(
                    "Parser was not found for label " + 6003); //$NON-NLS-1$
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
