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
    private IParser stateLabel_5039Parser;

    /**
     * @generated
     */
    private IParser getStateLabel_5039Parser() {
        if (stateLabel_5039Parser == null) {
            EAttribute[] features =
                    new EAttribute[] { SyncchartsPackage.eINSTANCE
                            .getScope_Label() };
            MessageFormatParser parser = new MessageFormatParser(features);
            stateLabel_5039Parser = parser;
        }
        return stateLabel_5039Parser;
    }

    /**
     * @generated
     */
    private IParser stateInterfaceDeclaration_5040Parser;

    /**
     * @generated
     */
    private IParser getStateInterfaceDeclaration_5040Parser() {
        if (stateInterfaceDeclaration_5040Parser == null) {
            EAttribute[] features =
                    new EAttribute[] { SyncchartsPackage.eINSTANCE
                            .getScope_InterfaceDeclaration() };
            EAttribute[] editableFeatures =
                    new EAttribute[] { SyncchartsPackage.eINSTANCE
                            .getScope_InterfaceDeclaration() };
            MessageFormatParser parser =
                    new MessageFormatParser(features, editableFeatures);
            stateInterfaceDeclaration_5040Parser = parser;
        }
        return stateInterfaceDeclaration_5040Parser;
    }

    /**
     * @generated
     */
    private IParser regionLabel_5038Parser;

    /**
     * @generated
     */
    private IParser getRegionLabel_5038Parser() {
        if (regionLabel_5038Parser == null) {
            EAttribute[] features =
                    new EAttribute[] { SyncchartsPackage.eINSTANCE
                            .getScope_Label() };
            EAttribute[] editableFeatures =
                    new EAttribute[] { SyncchartsPackage.eINSTANCE
                            .getScope_Label() };
            MessageFormatParser parser =
                    new MessageFormatParser(features, editableFeatures);
            regionLabel_5038Parser = parser;
        }
        return regionLabel_5038Parser;
    }

    /**
     * @generated
     */
    private IParser stateLabel_5036Parser;

    /**
     * @generated
     */
    private IParser getStateLabel_5036Parser() {
        if (stateLabel_5036Parser == null) {
            EAttribute[] features =
                    new EAttribute[] { SyncchartsPackage.eINSTANCE
                            .getScope_Label() };
            MessageFormatParser parser = new MessageFormatParser(features);
            stateLabel_5036Parser = parser;
        }
        return stateLabel_5036Parser;
    }

    /**
     * @generated
     */
    private IParser stateInterfaceDeclaration_5037Parser;

    /**
     * @generated
     */
    private IParser getStateInterfaceDeclaration_5037Parser() {
        if (stateInterfaceDeclaration_5037Parser == null) {
            EAttribute[] features =
                    new EAttribute[] { SyncchartsPackage.eINSTANCE
                            .getScope_InterfaceDeclaration() };
            EAttribute[] editableFeatures =
                    new EAttribute[] { SyncchartsPackage.eINSTANCE
                            .getScope_InterfaceDeclaration() };
            MessageFormatParser parser =
                    new MessageFormatParser(features, editableFeatures);
            stateInterfaceDeclaration_5037Parser = parser;
        }
        return stateInterfaceDeclaration_5037Parser;
    }

    /**
     * @generated
     */
    private IParser signalName_5031Parser;

    /**
     * @generated
     */
    private IParser getSignalName_5031Parser() {
        if (signalName_5031Parser == null) {
            EAttribute[] features =
                    new EAttribute[] { ExpressionsPackage.eINSTANCE
                            .getValuedObject_Name() };
            MessageFormatParser parser = new MessageFormatParser(features);
            parser.setViewPattern("{0},"); //$NON-NLS-1$
            parser.setEditorPattern("{0}"); //$NON-NLS-1$
            parser.setEditPattern("{0}"); //$NON-NLS-1$
            signalName_5031Parser = parser;
        }
        return signalName_5031Parser;
    }

    /**
     * @generated
     */
    private IParser actionLabel_5032Parser;

    /**
     * @generated
     */
    private IParser getActionLabel_5032Parser() {
        if (actionLabel_5032Parser == null) {
            EAttribute[] features =
                    new EAttribute[] { SyncchartsPackage.eINSTANCE
                            .getAction_Label() };
            EAttribute[] editableFeatures =
                    new EAttribute[] { SyncchartsPackage.eINSTANCE
                            .getAction_Label() };
            MessageFormatParser parser =
                    new MessageFormatParser(features, editableFeatures);
            actionLabel_5032Parser = parser;
        }
        return actionLabel_5032Parser;
    }

    /**
     * @generated
     */
    private IParser actionLabel_5033Parser;

    /**
     * @generated
     */
    private IParser getActionLabel_5033Parser() {
        if (actionLabel_5033Parser == null) {
            EAttribute[] features =
                    new EAttribute[] { SyncchartsPackage.eINSTANCE
                            .getAction_Label() };
            EAttribute[] editableFeatures =
                    new EAttribute[] { SyncchartsPackage.eINSTANCE
                            .getAction_Label() };
            MessageFormatParser parser =
                    new MessageFormatParser(features, editableFeatures);
            actionLabel_5033Parser = parser;
        }
        return actionLabel_5033Parser;
    }

    /**
     * @generated
     */
    private IParser actionLabel_5034Parser;

    /**
     * @generated
     */
    private IParser getActionLabel_5034Parser() {
        if (actionLabel_5034Parser == null) {
            EAttribute[] features =
                    new EAttribute[] { SyncchartsPackage.eINSTANCE
                            .getAction_Label() };
            EAttribute[] editableFeatures =
                    new EAttribute[] { SyncchartsPackage.eINSTANCE
                            .getAction_Label() };
            MessageFormatParser parser =
                    new MessageFormatParser(features, editableFeatures);
            actionLabel_5034Parser = parser;
        }
        return actionLabel_5034Parser;
    }

    /**
     * @generated
     */
    private IParser actionLabel_5035Parser;

    /**
     * @generated
     */
    private IParser getActionLabel_5035Parser() {
        if (actionLabel_5035Parser == null) {
            EAttribute[] features =
                    new EAttribute[] { SyncchartsPackage.eINSTANCE
                            .getAction_Label() };
            EAttribute[] editableFeatures =
                    new EAttribute[] { SyncchartsPackage.eINSTANCE
                            .getAction_Label() };
            MessageFormatParser parser =
                    new MessageFormatParser(features, editableFeatures);
            actionLabel_5035Parser = parser;
        }
        return actionLabel_5035Parser;
    }

    /**
     * @generated
     */
    private IParser textualCode_3030Parser;

    /**
     * @generated
     */
    private IParser getTextualCode_3030Parser() {
        if (textualCode_3030Parser == null) {
            EAttribute[] features =
                    new EAttribute[] { ExpressionsPackage.eINSTANCE
                            .getTextualCode_Code() };
            EAttribute[] editableFeatures =
                    new EAttribute[] { ExpressionsPackage.eINSTANCE
                            .getTextualCode_Code() };
            MessageFormatParser parser =
                    new MessageFormatParser(features, editableFeatures);
            textualCode_3030Parser = parser;
        }
        return textualCode_3030Parser;
    }

    /**
     * @generated
     */
    private IParser transitionLabel_6005Parser;

    /**
     * @generated
     */
    private IParser getTransitionLabel_6005Parser() {
        if (transitionLabel_6005Parser == null) {
            EAttribute[] features =
                    new EAttribute[] { SyncchartsPackage.eINSTANCE
                            .getAction_Label() };
            EAttribute[] editableFeatures =
                    new EAttribute[] { SyncchartsPackage.eINSTANCE
                            .getAction_Label() };
            MessageFormatParser parser =
                    new MessageFormatParser(features, editableFeatures);
            transitionLabel_6005Parser = parser;
        }
        return transitionLabel_6005Parser;
    }

    /**
     * @generated
     */
    private IParser transitionPriority_6006Parser;

    /**
     * @generated
     */
    private IParser getTransitionPriority_6006Parser() {
        if (transitionPriority_6006Parser == null) {
            EAttribute[] features =
                    new EAttribute[] { SyncchartsPackage.eINSTANCE
                            .getTransition_Priority() };
            EAttribute[] editableFeatures =
                    new EAttribute[] { SyncchartsPackage.eINSTANCE
                            .getTransition_Priority() };
            MessageFormatParser parser =
                    new MessageFormatParser(features, editableFeatures);
            transitionPriority_6006Parser = parser;
        }
        return transitionPriority_6006Parser;
    }

    /**
     * @generated
     */
    protected IParser getParser(int visualID) {
        switch (visualID) {
        case StateLabelEditPart.VISUAL_ID:
            return getStateLabel_5039Parser();
        case StateInterfaceDeclarationEditPart.VISUAL_ID:
            return getStateInterfaceDeclaration_5040Parser();
        case RegionLabelEditPart.VISUAL_ID:
            return getRegionLabel_5038Parser();
        case StateLabel2EditPart.VISUAL_ID:
            return getStateLabel_5036Parser();
        case StateInterfaceDeclaration2EditPart.VISUAL_ID:
            return getStateInterfaceDeclaration_5037Parser();
        case SignalNameEditPart.VISUAL_ID:
            return getSignalName_5031Parser();
        case StateEntryActionLabelEditPart.VISUAL_ID:
            return getActionLabel_5032Parser();
        case StateInnerActionLabelEditPart.VISUAL_ID:
            return getActionLabel_5033Parser();
        case StateExitActionLabelEditPart.VISUAL_ID:
            return getActionLabel_5034Parser();
        case StateSuspensionTriggerLabelEditPart.VISUAL_ID:
            return getActionLabel_5035Parser();
        case TextualCodeEditPart.VISUAL_ID:
            return getTextualCode_3030Parser();
        case TransitionLabelEditPart.VISUAL_ID:
            return getTransitionLabel_6005Parser();
        case TransitionPriorityEditPart.VISUAL_ID:
            return getTransitionPriority_6006Parser();
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
