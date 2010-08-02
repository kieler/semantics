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

import de.cau.cs.kieler.core.expressions.ExpressionsPackage;
import de.cau.cs.kieler.synccharts.SyncchartsPackage;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.RegionLabelEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.SignalNameEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateEntryActionLabelEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateExitActionLabelEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateInnerActionLabelEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateInterfaceDeclaration2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateInterfaceDeclarationEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateLabel2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateLabelEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateSuspensionTriggerLabelEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.TextualCodeEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.TransitionLabelEditPart;
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
    private IParser stateLabel_5049Parser;

    /**
     * @generated
     */
    private IParser getStateLabel_5049Parser() {
        if (stateLabel_5049Parser == null) {
            EAttribute[] features =
                    new EAttribute[] { SyncchartsPackage.eINSTANCE
                            .getScope_Label() };
            MessageFormatParser parser = new MessageFormatParser(features);
            stateLabel_5049Parser = parser;
        }
        return stateLabel_5049Parser;
    }

    /**
     * @generated
     */
    private IParser stateInterfaceDeclaration_5050Parser;

    /**
     * @generated
     */
    private IParser getStateInterfaceDeclaration_5050Parser() {
        if (stateInterfaceDeclaration_5050Parser == null) {
            EAttribute[] features =
                    new EAttribute[] { SyncchartsPackage.eINSTANCE
                            .getScope_InterfaceDeclaration() };
            EAttribute[] editableFeatures =
                    new EAttribute[] { SyncchartsPackage.eINSTANCE
                            .getScope_InterfaceDeclaration() };
            MessageFormatParser parser =
                    new MessageFormatParser(features, editableFeatures);
            stateInterfaceDeclaration_5050Parser = parser;
        }
        return stateInterfaceDeclaration_5050Parser;
    }

    /**
     * @generated
     */
    private IParser regionLabel_5048Parser;

    /**
     * @generated
     */
    private IParser getRegionLabel_5048Parser() {
        if (regionLabel_5048Parser == null) {
            EAttribute[] features =
                    new EAttribute[] { SyncchartsPackage.eINSTANCE
                            .getScope_Label() };
            EAttribute[] editableFeatures =
                    new EAttribute[] { SyncchartsPackage.eINSTANCE
                            .getScope_Label() };
            MessageFormatParser parser =
                    new MessageFormatParser(features, editableFeatures);
            regionLabel_5048Parser = parser;
        }
        return regionLabel_5048Parser;
    }

    /**
     * @generated
     */
    private IParser stateLabel_5046Parser;

    /**
     * @generated
     */
    private IParser getStateLabel_5046Parser() {
        if (stateLabel_5046Parser == null) {
            EAttribute[] features =
                    new EAttribute[] { SyncchartsPackage.eINSTANCE
                            .getScope_Label() };
            MessageFormatParser parser = new MessageFormatParser(features);
            stateLabel_5046Parser = parser;
        }
        return stateLabel_5046Parser;
    }

    /**
     * @generated
     */
    private IParser stateInterfaceDeclaration_5047Parser;

    /**
     * @generated
     */
    private IParser getStateInterfaceDeclaration_5047Parser() {
        if (stateInterfaceDeclaration_5047Parser == null) {
            EAttribute[] features =
                    new EAttribute[] { SyncchartsPackage.eINSTANCE
                            .getScope_InterfaceDeclaration() };
            EAttribute[] editableFeatures =
                    new EAttribute[] { SyncchartsPackage.eINSTANCE
                            .getScope_InterfaceDeclaration() };
            MessageFormatParser parser =
                    new MessageFormatParser(features, editableFeatures);
            stateInterfaceDeclaration_5047Parser = parser;
        }
        return stateInterfaceDeclaration_5047Parser;
    }

    /**
     * @generated
     */
    private IParser signalName_5041Parser;

    /**
     * @generated
     */
    private IParser getSignalName_5041Parser() {
        if (signalName_5041Parser == null) {
            EAttribute[] features =
                    new EAttribute[] { ExpressionsPackage.eINSTANCE
                            .getValuedObject_Name() };
            MessageFormatParser parser = new MessageFormatParser(features);
            parser.setViewPattern("{0},"); //$NON-NLS-1$
            parser.setEditorPattern("{0}"); //$NON-NLS-1$
            parser.setEditPattern("{0}"); //$NON-NLS-1$
            signalName_5041Parser = parser;
        }
        return signalName_5041Parser;
    }

    /**
     * @generated
     */
    private IParser actionLabel_5042Parser;

    /**
     * @generated
     */
    private IParser getActionLabel_5042Parser() {
        if (actionLabel_5042Parser == null) {
            EAttribute[] features =
                    new EAttribute[] { SyncchartsPackage.eINSTANCE
                            .getAction_Label() };
            EAttribute[] editableFeatures =
                    new EAttribute[] { SyncchartsPackage.eINSTANCE
                            .getAction_Label() };
            MessageFormatParser parser =
                    new MessageFormatParser(features, editableFeatures);
            actionLabel_5042Parser = parser;
        }
        return actionLabel_5042Parser;
    }

    /**
     * @generated
     */
    private IParser actionLabel_5043Parser;

    /**
     * @generated
     */
    private IParser getActionLabel_5043Parser() {
        if (actionLabel_5043Parser == null) {
            EAttribute[] features =
                    new EAttribute[] { SyncchartsPackage.eINSTANCE
                            .getAction_Label() };
            EAttribute[] editableFeatures =
                    new EAttribute[] { SyncchartsPackage.eINSTANCE
                            .getAction_Label() };
            MessageFormatParser parser =
                    new MessageFormatParser(features, editableFeatures);
            actionLabel_5043Parser = parser;
        }
        return actionLabel_5043Parser;
    }

    /**
     * @generated
     */
    private IParser actionLabel_5044Parser;

    /**
     * @generated
     */
    private IParser getActionLabel_5044Parser() {
        if (actionLabel_5044Parser == null) {
            EAttribute[] features =
                    new EAttribute[] { SyncchartsPackage.eINSTANCE
                            .getAction_Label() };
            EAttribute[] editableFeatures =
                    new EAttribute[] { SyncchartsPackage.eINSTANCE
                            .getAction_Label() };
            MessageFormatParser parser =
                    new MessageFormatParser(features, editableFeatures);
            actionLabel_5044Parser = parser;
        }
        return actionLabel_5044Parser;
    }

    /**
     * @generated
     */
    private IParser actionLabel_5045Parser;

    /**
     * @generated
     */
    private IParser getActionLabel_5045Parser() {
        if (actionLabel_5045Parser == null) {
            EAttribute[] features =
                    new EAttribute[] { SyncchartsPackage.eINSTANCE
                            .getAction_Label() };
            EAttribute[] editableFeatures =
                    new EAttribute[] { SyncchartsPackage.eINSTANCE
                            .getAction_Label() };
            MessageFormatParser parser =
                    new MessageFormatParser(features, editableFeatures);
            actionLabel_5045Parser = parser;
        }
        return actionLabel_5045Parser;
    }

    /**
     * @generated
     */
    private IParser textualCode_3038Parser;

    /**
     * @generated
     */
    private IParser getTextualCode_3038Parser() {
        if (textualCode_3038Parser == null) {
            EAttribute[] features =
                    new EAttribute[] { ExpressionsPackage.eINSTANCE
                            .getTextualCode_Code() };
            EAttribute[] editableFeatures =
                    new EAttribute[] { ExpressionsPackage.eINSTANCE
                            .getTextualCode_Code() };
            MessageFormatParser parser =
                    new MessageFormatParser(features, editableFeatures);
            textualCode_3038Parser = parser;
        }
        return textualCode_3038Parser;
    }

    /**
     * @generated
     */
    private IParser transitionLabel_6007Parser;

    /**
     * @generated
     */
    private IParser getTransitionLabel_6007Parser() {
        if (transitionLabel_6007Parser == null) {
            EAttribute[] features =
                    new EAttribute[] { SyncchartsPackage.eINSTANCE
                            .getAction_Label() };
            EAttribute[] editableFeatures =
                    new EAttribute[] { SyncchartsPackage.eINSTANCE
                            .getAction_Label() };
            MessageFormatParser parser =
                    new MessageFormatParser(features, editableFeatures);
            transitionLabel_6007Parser = parser;
        }
        return transitionLabel_6007Parser;
    }

    /**
     * @generated
     */
    private IParser transitionPriority_6008Parser;

    /**
     * @generated
     */
    private IParser getTransitionPriority_6008Parser() {
        if (transitionPriority_6008Parser == null) {
            EAttribute[] features =
                    new EAttribute[] { SyncchartsPackage.eINSTANCE
                            .getTransition_Priority() };
            EAttribute[] editableFeatures =
                    new EAttribute[] { SyncchartsPackage.eINSTANCE
                            .getTransition_Priority() };
            MessageFormatParser parser =
                    new MessageFormatParser(features, editableFeatures);
            transitionPriority_6008Parser = parser;
        }
        return transitionPriority_6008Parser;
    }

    /**
     * @generated
     */
    protected IParser getParser(int visualID) {
        switch (visualID) {
        case StateLabelEditPart.VISUAL_ID:
            return getStateLabel_5049Parser();
        case StateInterfaceDeclarationEditPart.VISUAL_ID:
            return getStateInterfaceDeclaration_5050Parser();
        case RegionLabelEditPart.VISUAL_ID:
            return getRegionLabel_5048Parser();
        case StateLabel2EditPart.VISUAL_ID:
            return getStateLabel_5046Parser();
        case StateInterfaceDeclaration2EditPart.VISUAL_ID:
            return getStateInterfaceDeclaration_5047Parser();
        case SignalNameEditPart.VISUAL_ID:
            return getSignalName_5041Parser();
        case StateEntryActionLabelEditPart.VISUAL_ID:
            return getActionLabel_5042Parser();
        case StateInnerActionLabelEditPart.VISUAL_ID:
            return getActionLabel_5043Parser();
        case StateExitActionLabelEditPart.VISUAL_ID:
            return getActionLabel_5044Parser();
        case StateSuspensionTriggerLabelEditPart.VISUAL_ID:
            return getActionLabel_5045Parser();
        case TextualCodeEditPart.VISUAL_ID:
            return getTextualCode_3038Parser();
        case TransitionLabelEditPart.VISUAL_ID:
            return getTransitionLabel_6007Parser();
        case TransitionPriorityEditPart.VISUAL_ID:
            return getTransitionPriority_6008Parser();
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
