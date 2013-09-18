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
import de.cau.cs.kieler.synccharts.diagram.edit.parts.RegionEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.RegionStateEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.RegionStateLabelEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.SignalEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.SignalNameEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateEntryActionEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateEntryActionLabelEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateExitActionEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateExitActionLabelEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateInnerActionEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateInnerActionLabelEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateLabelEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateRegionEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateRegionLabelEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateSuspensionTriggerEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateSuspensionTriggerLabelEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.TextualCodeCodeEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.TextualCodeEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.TransitionEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.TransitionLabelEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.VariableEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.VariableNameEditPart;
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
        SyncchartsDiagramEditorPlugin.getInstance().getImageRegistry()
                .put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
        SyncchartsDiagramEditorPlugin.getInstance().getImageRegistry()
                .put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
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
        case SignalEditPart.VISUAL_ID:
            return getImage(
                    "Navigator?Node?http://kieler.cs.cau.de/kexpressions/0.1.2?Signal", SyncchartsElementTypes.Signal_3048); //$NON-NLS-1$
        case StateEditPart.VISUAL_ID:
            return getImage(
                    "Navigator?TopLevelNode?http://kieler.cs.cau.de/synccharts/0.2.4?State", SyncchartsElementTypes.State_2006); //$NON-NLS-1$
        case VariableEditPart.VISUAL_ID:
            return getImage(
                    "Navigator?Node?http://kieler.cs.cau.de/kexpressions/0.1.2?Variable", SyncchartsElementTypes.Variable_3056); //$NON-NLS-1$
        case StateRegionEditPart.VISUAL_ID:
            return getImage(
                    "Navigator?Node?http://kieler.cs.cau.de/synccharts/0.2.4?Region", SyncchartsElementTypes.Region_3054); //$NON-NLS-1$
        case TextualCodeEditPart.VISUAL_ID:
            return getImage(
                    "Navigator?Node?http://kieler.cs.cau.de/kexpressions/0.1.2?TextualCode", SyncchartsElementTypes.TextualCode_3053); //$NON-NLS-1$
        case TransitionEditPart.VISUAL_ID:
            return getImage(
                    "Navigator?Link?http://kieler.cs.cau.de/synccharts/0.2.4?Transition", SyncchartsElementTypes.Transition_4006); //$NON-NLS-1$
        case StateExitActionEditPart.VISUAL_ID:
            return getImage(
                    "Navigator?Node?http://kieler.cs.cau.de/synccharts/0.2.4?Action", SyncchartsElementTypes.Action_3051); //$NON-NLS-1$
        case StateEntryActionEditPart.VISUAL_ID:
            return getImage(
                    "Navigator?Node?http://kieler.cs.cau.de/synccharts/0.2.4?Action", SyncchartsElementTypes.Action_3049); //$NON-NLS-1$
        case StateInnerActionEditPart.VISUAL_ID:
            return getImage(
                    "Navigator?Node?http://kieler.cs.cau.de/synccharts/0.2.4?Action", SyncchartsElementTypes.Action_3050); //$NON-NLS-1$
        case RegionEditPart.VISUAL_ID:
            return getImage(
                    "Navigator?Diagram?http://kieler.cs.cau.de/synccharts/0.2.4?Region", SyncchartsElementTypes.Region_1000); //$NON-NLS-1$
        case RegionStateEditPart.VISUAL_ID:
            return getImage(
                    "Navigator?Node?http://kieler.cs.cau.de/synccharts/0.2.4?State", SyncchartsElementTypes.State_3055); //$NON-NLS-1$
        case StateSuspensionTriggerEditPart.VISUAL_ID:
            return getImage(
                    "Navigator?Node?http://kieler.cs.cau.de/synccharts/0.2.4?Action", SyncchartsElementTypes.Action_3052); //$NON-NLS-1$
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
        case SignalEditPart.VISUAL_ID:
            return getSignal_3048Text(view);
        case StateEditPart.VISUAL_ID:
            return getState_2006Text(view);
        case VariableEditPart.VISUAL_ID:
            return getVariable_3056Text(view);
        case StateRegionEditPart.VISUAL_ID:
            return getRegion_3054Text(view);
        case TextualCodeEditPart.VISUAL_ID:
            return getTextualCode_3053Text(view);
        case TransitionEditPart.VISUAL_ID:
            return getTransition_4006Text(view);
        case StateExitActionEditPart.VISUAL_ID:
            return getAction_3051Text(view);
        case StateEntryActionEditPart.VISUAL_ID:
            return getAction_3049Text(view);
        case StateInnerActionEditPart.VISUAL_ID:
            return getAction_3050Text(view);
        case RegionEditPart.VISUAL_ID:
            return getRegion_1000Text(view);
        case RegionStateEditPart.VISUAL_ID:
            return getState_3055Text(view);
        case StateSuspensionTriggerEditPart.VISUAL_ID:
            return getAction_3052Text(view);
        }
        return getUnknownElementText(view);
    }

    /**
     * @generated
     */
    private String getTransition_4006Text(View view) {
        IParser parser = SyncchartsParserProvider.getParser(SyncchartsElementTypes.Transition_4006,
                view.getElement() != null ? view.getElement() : view,
                SyncchartsVisualIDRegistry.getType(TransitionLabelEditPart.VISUAL_ID));
        if (parser != null) {
            return parser.getPrintString(
                    new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
                    ParserOptions.NONE.intValue());
        } else {
            SyncchartsDiagramEditorPlugin.getInstance().logError(
                    "Parser was not found for label " + 6011); //$NON-NLS-1$
            return ""; //$NON-NLS-1$
        }
    }

    /**
     * @generated
     */
    private String getState_2006Text(View view) {
        IParser parser = SyncchartsParserProvider.getParser(SyncchartsElementTypes.State_2006,
                view.getElement() != null ? view.getElement() : view,
                SyncchartsVisualIDRegistry.getType(StateLabelEditPart.VISUAL_ID));
        if (parser != null) {
            return parser.getPrintString(
                    new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
                    ParserOptions.NONE.intValue());
        } else {
            SyncchartsDiagramEditorPlugin.getInstance().logError(
                    "Parser was not found for label " + 5073); //$NON-NLS-1$
            return ""; //$NON-NLS-1$
        }
    }

    /**
     * @generated
     */
    private String getRegion_3054Text(View view) {
        IParser parser = SyncchartsParserProvider.getParser(SyncchartsElementTypes.Region_3054,
                view.getElement() != null ? view.getElement() : view,
                SyncchartsVisualIDRegistry.getType(StateRegionLabelEditPart.VISUAL_ID));
        if (parser != null) {
            return parser.getPrintString(
                    new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
                    ParserOptions.NONE.intValue());
        } else {
            SyncchartsDiagramEditorPlugin.getInstance().logError(
                    "Parser was not found for label " + 5072); //$NON-NLS-1$
            return ""; //$NON-NLS-1$
        }
    }

    /**
     * @generated
     */
    private String getAction_3049Text(View view) {
        IParser parser = SyncchartsParserProvider.getParser(SyncchartsElementTypes.Action_3049,
                view.getElement() != null ? view.getElement() : view,
                SyncchartsVisualIDRegistry.getType(StateEntryActionLabelEditPart.VISUAL_ID));
        if (parser != null) {
            return parser.getPrintString(
                    new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
                    ParserOptions.NONE.intValue());
        } else {
            SyncchartsDiagramEditorPlugin.getInstance().logError(
                    "Parser was not found for label " + 5064); //$NON-NLS-1$
            return ""; //$NON-NLS-1$
        }
    }

    /**
     * @generated
     */
    private String getSignal_3048Text(View view) {
        IParser parser = SyncchartsParserProvider.getParser(SyncchartsElementTypes.Signal_3048,
                view.getElement() != null ? view.getElement() : view,
                SyncchartsVisualIDRegistry.getType(SignalNameEditPart.VISUAL_ID));
        if (parser != null) {
            return parser.getPrintString(
                    new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
                    ParserOptions.NONE.intValue());
        } else {
            SyncchartsDiagramEditorPlugin.getInstance().logError(
                    "Parser was not found for label " + 5063); //$NON-NLS-1$
            return ""; //$NON-NLS-1$
        }
    }

    /**
     * @generated
     */
    private String getTextualCode_3053Text(View view) {
        IParser parser = SyncchartsParserProvider.getParser(
                SyncchartsElementTypes.TextualCode_3053,
                view.getElement() != null ? view.getElement() : view,
                SyncchartsVisualIDRegistry.getType(TextualCodeCodeEditPart.VISUAL_ID));
        if (parser != null) {
            return parser.getPrintString(
                    new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
                    ParserOptions.NONE.intValue());
        } else {
            SyncchartsDiagramEditorPlugin.getInstance().logError(
                    "Parser was not found for label " + 5068); //$NON-NLS-1$
            return ""; //$NON-NLS-1$
        }
    }

    /**
     * @generated
     */
    private String getState_3055Text(View view) {
        IParser parser = SyncchartsParserProvider.getParser(SyncchartsElementTypes.State_3055,
                view.getElement() != null ? view.getElement() : view,
                SyncchartsVisualIDRegistry.getType(RegionStateLabelEditPart.VISUAL_ID));
        if (parser != null) {
            return parser.getPrintString(
                    new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
                    ParserOptions.NONE.intValue());
        } else {
            SyncchartsDiagramEditorPlugin.getInstance().logError(
                    "Parser was not found for label " + 5070); //$NON-NLS-1$
            return ""; //$NON-NLS-1$
        }
    }

    /**
     * @generated
     */
    private String getVariable_3056Text(View view) {
        IParser parser = SyncchartsParserProvider.getParser(SyncchartsElementTypes.Variable_3056,
                view.getElement() != null ? view.getElement() : view,
                SyncchartsVisualIDRegistry.getType(VariableNameEditPart.VISUAL_ID));
        if (parser != null) {
            return parser.getPrintString(
                    new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
                    ParserOptions.NONE.intValue());
        } else {
            SyncchartsDiagramEditorPlugin.getInstance().logError(
                    "Parser was not found for label " + 5069); //$NON-NLS-1$
            return ""; //$NON-NLS-1$
        }
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
    private String getAction_3051Text(View view) {
        IParser parser = SyncchartsParserProvider.getParser(SyncchartsElementTypes.Action_3051,
                view.getElement() != null ? view.getElement() : view,
                SyncchartsVisualIDRegistry.getType(StateExitActionLabelEditPart.VISUAL_ID));
        if (parser != null) {
            return parser.getPrintString(
                    new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
                    ParserOptions.NONE.intValue());
        } else {
            SyncchartsDiagramEditorPlugin.getInstance().logError(
                    "Parser was not found for label " + 5066); //$NON-NLS-1$
            return ""; //$NON-NLS-1$
        }
    }

    /**
     * @generated
     */
    private String getAction_3050Text(View view) {
        IParser parser = SyncchartsParserProvider.getParser(SyncchartsElementTypes.Action_3050,
                view.getElement() != null ? view.getElement() : view,
                SyncchartsVisualIDRegistry.getType(StateInnerActionLabelEditPart.VISUAL_ID));
        if (parser != null) {
            return parser.getPrintString(
                    new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
                    ParserOptions.NONE.intValue());
        } else {
            SyncchartsDiagramEditorPlugin.getInstance().logError(
                    "Parser was not found for label " + 5065); //$NON-NLS-1$
            return ""; //$NON-NLS-1$
        }
    }

    /**
     * @generated
     */
    private String getAction_3052Text(View view) {
        IParser parser = SyncchartsParserProvider.getParser(SyncchartsElementTypes.Action_3052,
                view.getElement() != null ? view.getElement() : view,
                SyncchartsVisualIDRegistry.getType(StateSuspensionTriggerLabelEditPart.VISUAL_ID));
        if (parser != null) {
            return parser.getPrintString(
                    new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
                    ParserOptions.NONE.intValue());
        } else {
            SyncchartsDiagramEditorPlugin.getInstance().logError(
                    "Parser was not found for label " + 5067); //$NON-NLS-1$
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
