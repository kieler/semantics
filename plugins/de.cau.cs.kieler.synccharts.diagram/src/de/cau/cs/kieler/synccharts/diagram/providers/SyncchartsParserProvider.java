package de.cau.cs.kieler.synccharts.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import de.cau.cs.kieler.synccharts.SyncchartsPackage;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.EntryActionLabelEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.ExitActionLabelEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.InnerActionLabelEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.RegionIdEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.SignalNameEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateInterfaceDeclaration2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateInterfaceDeclarationEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateLabel2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateLabelEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.SuspensionTriggerLabelEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.TextualCodeEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.TransitionDelayEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.TransitionPriorityEditPart;
import de.cau.cs.kieler.synccharts.diagram.parsers.MessageFormatParser;
import de.cau.cs.kieler.synccharts.diagram.part.SyncchartsVisualIDRegistry;

/**
 * @generated
 */
public class SyncchartsParserProvider extends AbstractProvider implements
        IParserProvider {

    /**
     * @generated
     */
    private IParser stateLabel_5023Parser;

    /**
     * @generated
     */
    private IParser getStateLabel_5023Parser() {
        if (stateLabel_5023Parser == null) {
            EAttribute[] features = new EAttribute[] { SyncchartsPackage.eINSTANCE
                    .getScope_Label() };
            MessageFormatParser parser = new MessageFormatParser(features);
            stateLabel_5023Parser = parser;
        }
        return stateLabel_5023Parser;
    }

    /**
     * @generated
     */
    private IParser stateInterfaceDeclaration_5029Parser;

    /**
     * @generated
     */
    private IParser getStateInterfaceDeclaration_5029Parser() {
        if (stateInterfaceDeclaration_5029Parser == null) {
            EAttribute[] features = new EAttribute[] { SyncchartsPackage.eINSTANCE
                    .getScope_InterfaceDeclaration() };
            EAttribute[] editableFeatures = new EAttribute[] { SyncchartsPackage.eINSTANCE
                    .getScope_InterfaceDeclaration() };
            MessageFormatParser parser = new MessageFormatParser(features,
                    editableFeatures);
            stateInterfaceDeclaration_5029Parser = parser;
        }
        return stateInterfaceDeclaration_5029Parser;
    }

    /**
     * @generated
     */
    private IParser regionLabel_5022Parser;

    /**
     * @generated
     */
    private IParser getRegionLabel_5022Parser() {
        if (regionLabel_5022Parser == null) {
            EAttribute[] features = new EAttribute[] { SyncchartsPackage.eINSTANCE
                    .getScope_Label() };
            EAttribute[] editableFeatures = new EAttribute[] { SyncchartsPackage.eINSTANCE
                    .getScope_Label() };
            MessageFormatParser parser = new MessageFormatParser(features,
                    editableFeatures);
            regionLabel_5022Parser = parser;
        }
        return regionLabel_5022Parser;
    }

    /**
     * @generated
     */
    private IParser stateLabel_5021Parser;

    /**
     * @generated
     */
    private IParser getStateLabel_5021Parser() {
        if (stateLabel_5021Parser == null) {
            EAttribute[] features = new EAttribute[] { SyncchartsPackage.eINSTANCE
                    .getScope_Label() };
            MessageFormatParser parser = new MessageFormatParser(features);
            stateLabel_5021Parser = parser;
        }
        return stateLabel_5021Parser;
    }

    /**
     * @generated
     */
    private IParser stateInterfaceDeclaration_5028Parser;

    /**
     * @generated
     */
    private IParser getStateInterfaceDeclaration_5028Parser() {
        if (stateInterfaceDeclaration_5028Parser == null) {
            EAttribute[] features = new EAttribute[] { SyncchartsPackage.eINSTANCE
                    .getScope_InterfaceDeclaration() };
            EAttribute[] editableFeatures = new EAttribute[] { SyncchartsPackage.eINSTANCE
                    .getScope_InterfaceDeclaration() };
            MessageFormatParser parser = new MessageFormatParser(features,
                    editableFeatures);
            stateInterfaceDeclaration_5028Parser = parser;
        }
        return stateInterfaceDeclaration_5028Parser;
    }

    /**
     * @generated
     */
    private IParser signalName_5014Parser;

    /**
     * @generated
     */
    private IParser getSignalName_5014Parser() {
        if (signalName_5014Parser == null) {
            EAttribute[] features = new EAttribute[] { SyncchartsPackage.eINSTANCE
                    .getValuedObject_Name() };
            MessageFormatParser parser = new MessageFormatParser(features);
            parser.setViewPattern("{0},"); //$NON-NLS-1$
            parser.setEditorPattern("{0}"); //$NON-NLS-1$
            parser.setEditPattern("{0}"); //$NON-NLS-1$
            signalName_5014Parser = parser;
        }
        return signalName_5014Parser;
    }

    /**
     * @generated
     */
    private IParser actionLabel_5024Parser;

    /**
     * @generated
     */
    private IParser getActionLabel_5024Parser() {
        if (actionLabel_5024Parser == null) {
            EAttribute[] features = new EAttribute[] { SyncchartsPackage.eINSTANCE
                    .getAction_Label() };
            EAttribute[] editableFeatures = new EAttribute[] { SyncchartsPackage.eINSTANCE
                    .getAction_Label() };
            MessageFormatParser parser = new MessageFormatParser(features,
                    editableFeatures);
            actionLabel_5024Parser = parser;
        }
        return actionLabel_5024Parser;
    }

    /**
     * @generated
     */
    private IParser actionLabel_5025Parser;

    /**
     * @generated
     */
    private IParser getActionLabel_5025Parser() {
        if (actionLabel_5025Parser == null) {
            EAttribute[] features = new EAttribute[] { SyncchartsPackage.eINSTANCE
                    .getAction_Label() };
            EAttribute[] editableFeatures = new EAttribute[] { SyncchartsPackage.eINSTANCE
                    .getAction_Label() };
            MessageFormatParser parser = new MessageFormatParser(features,
                    editableFeatures);
            actionLabel_5025Parser = parser;
        }
        return actionLabel_5025Parser;
    }

    /**
     * @generated
     */
    private IParser actionLabel_5026Parser;

    /**
     * @generated
     */
    private IParser getActionLabel_5026Parser() {
        if (actionLabel_5026Parser == null) {
            EAttribute[] features = new EAttribute[] { SyncchartsPackage.eINSTANCE
                    .getAction_Label() };
            EAttribute[] editableFeatures = new EAttribute[] { SyncchartsPackage.eINSTANCE
                    .getAction_Label() };
            MessageFormatParser parser = new MessageFormatParser(features,
                    editableFeatures);
            actionLabel_5026Parser = parser;
        }
        return actionLabel_5026Parser;
    }

    /**
     * @generated
     */
    private IParser actionLabel_5027Parser;

    /**
     * @generated
     */
    private IParser getActionLabel_5027Parser() {
        if (actionLabel_5027Parser == null) {
            EAttribute[] features = new EAttribute[] { SyncchartsPackage.eINSTANCE
                    .getAction_Label() };
            EAttribute[] editableFeatures = new EAttribute[] { SyncchartsPackage.eINSTANCE
                    .getAction_Label() };
            MessageFormatParser parser = new MessageFormatParser(features,
                    editableFeatures);
            actionLabel_5027Parser = parser;
        }
        return actionLabel_5027Parser;
    }

    /**
     * @generated
     */
    private IParser textualCode_3020Parser;

    /**
     * @generated
     */
    private IParser getTextualCode_3020Parser() {
        if (textualCode_3020Parser == null) {
            EAttribute[] features = new EAttribute[] { SyncchartsPackage.eINSTANCE
                    .getTextualCode_Code() };
            EAttribute[] editableFeatures = new EAttribute[] { SyncchartsPackage.eINSTANCE
                    .getTextualCode_Code() };
            MessageFormatParser parser = new MessageFormatParser(features,
                    editableFeatures);
            textualCode_3020Parser = parser;
        }
        return textualCode_3020Parser;
    }

    /**
     * @generated
     */
    private IParser transitionLabel_6003Parser;

    /**
     * @generated
     */
    private IParser getTransitionLabel_6003Parser() {
        if (transitionLabel_6003Parser == null) {
            EAttribute[] features = new EAttribute[] { SyncchartsPackage.eINSTANCE
                    .getAction_Label() };
            EAttribute[] editableFeatures = new EAttribute[] { SyncchartsPackage.eINSTANCE
                    .getAction_Label() };
            MessageFormatParser parser = new MessageFormatParser(features,
                    editableFeatures);
            transitionLabel_6003Parser = parser;
        }
        return transitionLabel_6003Parser;
    }

    /**
     * @generated
     */
    private IParser transitionPriority_6004Parser;

    /**
     * @generated
     */
    private IParser getTransitionPriority_6004Parser() {
        if (transitionPriority_6004Parser == null) {
            EAttribute[] features = new EAttribute[] { SyncchartsPackage.eINSTANCE
                    .getTransition_Priority() };
            EAttribute[] editableFeatures = new EAttribute[] { SyncchartsPackage.eINSTANCE
                    .getTransition_Priority() };
            MessageFormatParser parser = new MessageFormatParser(features,
                    editableFeatures);
            transitionPriority_6004Parser = parser;
        }
        return transitionPriority_6004Parser;
    }

    /**
     * @generated
     */
    protected IParser getParser(int visualID) {
        switch (visualID) {
        case StateLabelEditPart.VISUAL_ID:
            return getStateLabel_5023Parser();
        case StateInterfaceDeclarationEditPart.VISUAL_ID:
            return getStateInterfaceDeclaration_5029Parser();
        case RegionIdEditPart.VISUAL_ID:
            return getRegionLabel_5022Parser();
        case StateLabel2EditPart.VISUAL_ID:
            return getStateLabel_5021Parser();
        case StateInterfaceDeclaration2EditPart.VISUAL_ID:
            return getStateInterfaceDeclaration_5028Parser();
        case SignalNameEditPart.VISUAL_ID:
            return getSignalName_5014Parser();
        case EntryActionLabelEditPart.VISUAL_ID:
            return getActionLabel_5024Parser();
        case InnerActionLabelEditPart.VISUAL_ID:
            return getActionLabel_5025Parser();
        case ExitActionLabelEditPart.VISUAL_ID:
            return getActionLabel_5026Parser();
        case SuspensionTriggerLabelEditPart.VISUAL_ID:
            return getActionLabel_5027Parser();
        case TextualCodeEditPart.VISUAL_ID:
            return getTextualCode_3020Parser();
        case TransitionDelayEditPart.VISUAL_ID:
            return getTransitionLabel_6003Parser();
        case TransitionPriorityEditPart.VISUAL_ID:
            return getTransitionPriority_6004Parser();
        }
        return null;
    }

    /**
     * Utility method that consults ParserService
     * @generated
     */
    public static IParser getParser(IElementType type, EObject object,
            String parserHint) {
        return ParserService.getInstance().getParser(
                new HintAdapter(type, object, parserHint));
    }

    /**
     * @generated
     */
    public IParser getParser(IAdaptable hint) {
        String vid = (String) hint.getAdapter(String.class);
        if (vid != null) {
            return getParser(SyncchartsVisualIDRegistry.getVisualID(vid));
        }
        View view = (View) hint.getAdapter(View.class);
        if (view != null) {
            return getParser(SyncchartsVisualIDRegistry.getVisualID(view));
        }
        return null;
    }

    /**
     * @generated
     */
    public boolean provides(IOperation operation) {
        if (operation instanceof GetParserOperation) {
            IAdaptable hint = ((GetParserOperation) operation).getHint();
            if (SyncchartsElementTypes.getElement(hint) == null) {
                return false;
            }
            return getParser(hint) != null;
        }
        return false;
    }

    /**
     * @generated
     */
    private static class HintAdapter extends ParserHintAdapter {

        /**
         * @generated
         */
        private final IElementType elementType;

        /**
         * @generated
         */
        public HintAdapter(IElementType type, EObject object, String parserHint) {
            super(object, parserHint);
            assert type != null;
            elementType = type;
        }

        /**
         * @generated
         */
        public Object getAdapter(Class adapter) {
            if (IElementType.class.equals(adapter)) {
                return elementType;
            }
            return super.getAdapter(adapter);
        }
    }

}
