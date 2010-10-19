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
import de.cau.cs.kieler.synccharts.diagram.edit.parts.RegionState2LabelEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.RegionStateLabelEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.SignalNameEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateEntryActionLabelEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateExitActionLabelEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateInnerActionLabelEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateInterfaceDeclarationEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateLabelEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateRegionLabelEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateSuspensionTriggerLabelEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.TextualCodeLabelEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.TransitionLabelEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.TransitionPriorityEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.VariableNameEditPart;
import de.cau.cs.kieler.synccharts.diagram.parsers.MessageFormatParser;
import de.cau.cs.kieler.synccharts.diagram.part.SyncchartsVisualIDRegistry;

/**
 * @generated
 */
public class SyncchartsParserProvider extends AbstractProvider implements IParserProvider {

    /**
     * @generated
     */
    private IParser stateLabel_5059Parser;

    /**
     * @generated
     */
    private IParser getStateLabel_5059Parser() {
        if (stateLabel_5059Parser == null) {
            EAttribute[] features = new EAttribute[] { SyncchartsPackage.eINSTANCE.getScope_Label() };
            MessageFormatParser parser = new MessageFormatParser(features);
            stateLabel_5059Parser = parser;
        }
        return stateLabel_5059Parser;
    }

    /**
     * @generated
     */
    private IParser stateInterfaceDeclaration_5060Parser;

    /**
     * @generated
     */
    private IParser getStateInterfaceDeclaration_5060Parser() {
        if (stateInterfaceDeclaration_5060Parser == null) {
            EAttribute[] features = new EAttribute[] { SyncchartsPackage.eINSTANCE
                .getScope_InterfaceDeclaration() };
            EAttribute[] editableFeatures = new EAttribute[] { SyncchartsPackage.eINSTANCE
                .getScope_InterfaceDeclaration() };
            MessageFormatParser parser = new MessageFormatParser(features, editableFeatures);
            stateInterfaceDeclaration_5060Parser = parser;
        }
        return stateInterfaceDeclaration_5060Parser;
    }

    /**
     * @generated
     */
    private IParser signalName_5051Parser;

    /**
     * @generated
     */
    private IParser getSignalName_5051Parser() {
        if (signalName_5051Parser == null) {
            EAttribute[] features = new EAttribute[] { ExpressionsPackage.eINSTANCE
                .getValuedObject_Name() };
            MessageFormatParser parser = new MessageFormatParser(features);
            parser.setViewPattern("{0},"); //$NON-NLS-1$
            parser.setEditorPattern("{0}"); //$NON-NLS-1$
            parser.setEditPattern("{0}"); //$NON-NLS-1$
            signalName_5051Parser = parser;
        }
        return signalName_5051Parser;
    }

    /**
     * @generated
     */
    private IParser actionLabel_5052Parser;

    /**
     * @generated
     */
    private IParser getActionLabel_5052Parser() {
        if (actionLabel_5052Parser == null) {
            EAttribute[] features = new EAttribute[] { SyncchartsPackage.eINSTANCE
                .getAction_Label() };
            EAttribute[] editableFeatures = new EAttribute[] { SyncchartsPackage.eINSTANCE
                .getAction_Label() };
            MessageFormatParser parser = new MessageFormatParser(features, editableFeatures);
            actionLabel_5052Parser = parser;
        }
        return actionLabel_5052Parser;
    }

    /**
     * @generated
     */
    private IParser actionLabel_5053Parser;

    /**
     * @generated
     */
    private IParser getActionLabel_5053Parser() {
        if (actionLabel_5053Parser == null) {
            EAttribute[] features = new EAttribute[] { SyncchartsPackage.eINSTANCE
                .getAction_Label() };
            EAttribute[] editableFeatures = new EAttribute[] { SyncchartsPackage.eINSTANCE
                .getAction_Label() };
            MessageFormatParser parser = new MessageFormatParser(features, editableFeatures);
            actionLabel_5053Parser = parser;
        }
        return actionLabel_5053Parser;
    }

    /**
     * @generated
     */
    private IParser actionLabel_5054Parser;

    /**
     * @generated
     */
    private IParser getActionLabel_5054Parser() {
        if (actionLabel_5054Parser == null) {
            EAttribute[] features = new EAttribute[] { SyncchartsPackage.eINSTANCE
                .getAction_Label() };
            EAttribute[] editableFeatures = new EAttribute[] { SyncchartsPackage.eINSTANCE
                .getAction_Label() };
            MessageFormatParser parser = new MessageFormatParser(features, editableFeatures);
            actionLabel_5054Parser = parser;
        }
        return actionLabel_5054Parser;
    }

    /**
     * @generated
     */
    private IParser actionLabel_5055Parser;

    /**
     * @generated
     */
    private IParser getActionLabel_5055Parser() {
        if (actionLabel_5055Parser == null) {
            EAttribute[] features = new EAttribute[] { SyncchartsPackage.eINSTANCE
                .getAction_Label() };
            EAttribute[] editableFeatures = new EAttribute[] { SyncchartsPackage.eINSTANCE
                .getAction_Label() };
            MessageFormatParser parser = new MessageFormatParser(features, editableFeatures);
            actionLabel_5055Parser = parser;
        }
        return actionLabel_5055Parser;
    }

    /**
     * @generated
     */
    private IParser textualCodeCode_5061Parser;

    /**
     * @generated
     */
    private IParser getTextualCodeCode_5061Parser() {
        if (textualCodeCode_5061Parser == null) {
            EAttribute[] features = new EAttribute[] { ExpressionsPackage.eINSTANCE
                .getTextualCode_Code() };
            EAttribute[] editableFeatures = new EAttribute[] { ExpressionsPackage.eINSTANCE
                .getTextualCode_Code() };
            MessageFormatParser parser = new MessageFormatParser(features, editableFeatures);
            textualCodeCode_5061Parser = parser;
        }
        return textualCodeCode_5061Parser;
    }

    /**
     * @generated
     */
    private IParser regionLabel_5058Parser;

    /**
     * @generated
     */
    private IParser getRegionLabel_5058Parser() {
        if (regionLabel_5058Parser == null) {
            EAttribute[] features = new EAttribute[] { SyncchartsPackage.eINSTANCE.getScope_Label() };
            EAttribute[] editableFeatures = new EAttribute[] { SyncchartsPackage.eINSTANCE
                .getScope_Label() };
            MessageFormatParser parser = new MessageFormatParser(features, editableFeatures);
            regionLabel_5058Parser = parser;
        }
        return regionLabel_5058Parser;
    }

    /**
     * @generated
     */
    private IParser stateLabel_5056Parser;

    /**
     * @generated
     */
    private IParser getStateLabel_5056Parser() {
        if (stateLabel_5056Parser == null) {
            EAttribute[] features = new EAttribute[] { SyncchartsPackage.eINSTANCE.getScope_Label() };
            MessageFormatParser parser = new MessageFormatParser(features);
            stateLabel_5056Parser = parser;
        }
        return stateLabel_5056Parser;
    }

    /**
     * @generated
     */
    private IParser stateInterfaceDeclaration_5057Parser;

    /**
     * @generated
     */
    private IParser getStateInterfaceDeclaration_5057Parser() {
        if (stateInterfaceDeclaration_5057Parser == null) {
            EAttribute[] features = new EAttribute[] { SyncchartsPackage.eINSTANCE
                .getScope_InterfaceDeclaration() };
            EAttribute[] editableFeatures = new EAttribute[] { SyncchartsPackage.eINSTANCE
                .getScope_InterfaceDeclaration() };
            MessageFormatParser parser = new MessageFormatParser(features, editableFeatures);
            stateInterfaceDeclaration_5057Parser = parser;
        }
        return stateInterfaceDeclaration_5057Parser;
    }

    /**
     * @generated
     */
    private IParser variableName_5062Parser;

    /**
     * @generated
     */
    private IParser getVariableName_5062Parser() {
        if (variableName_5062Parser == null) {
            EAttribute[] features = new EAttribute[] { ExpressionsPackage.eINSTANCE
                .getValuedObject_Name() };
            MessageFormatParser parser = new MessageFormatParser(features);
            variableName_5062Parser = parser;
        }
        return variableName_5062Parser;
    }

    /**
     * @generated
     */
    private IParser transitionLabel_6009Parser;

    /**
     * @generated
     */
    private IParser getTransitionLabel_6009Parser() {
        if (transitionLabel_6009Parser == null) {
            EAttribute[] features = new EAttribute[] { SyncchartsPackage.eINSTANCE
                .getAction_Label() };
            EAttribute[] editableFeatures = new EAttribute[] { SyncchartsPackage.eINSTANCE
                .getAction_Label() };
            MessageFormatParser parser = new MessageFormatParser(features, editableFeatures);
            transitionLabel_6009Parser = parser;
        }
        return transitionLabel_6009Parser;
    }

    /**
     * @generated
     */
    private IParser transitionPriority_6010Parser;

    /**
     * @generated
     */
    private IParser getTransitionPriority_6010Parser() {
        if (transitionPriority_6010Parser == null) {
            EAttribute[] features = new EAttribute[] { SyncchartsPackage.eINSTANCE
                .getTransition_Priority() };
            EAttribute[] editableFeatures = new EAttribute[] { SyncchartsPackage.eINSTANCE
                .getTransition_Priority() };
            MessageFormatParser parser = new MessageFormatParser(features, editableFeatures);
            transitionPriority_6010Parser = parser;
        }
        return transitionPriority_6010Parser;
    }

    /**
     * @generated
     */
    protected IParser getParser(int visualID) {
        switch (visualID) {
        case StateLabelEditPart.VISUAL_ID:
            return getStateLabel_5059Parser();
        case StateInterfaceDeclarationEditPart.VISUAL_ID:
            return getStateInterfaceDeclaration_5060Parser();
        case SignalNameEditPart.VISUAL_ID:
            return getSignalName_5051Parser();
        case StateEntryActionLabelEditPart.VISUAL_ID:
            return getActionLabel_5052Parser();
        case StateInnerActionLabelEditPart.VISUAL_ID:
            return getActionLabel_5053Parser();
        case StateExitActionLabelEditPart.VISUAL_ID:
            return getActionLabel_5054Parser();
        case StateSuspensionTriggerLabelEditPart.VISUAL_ID:
            return getActionLabel_5055Parser();
        case TextualCodeLabelEditPart.VISUAL_ID:
            return getTextualCodeCode_5061Parser();
        case StateRegionLabelEditPart.VISUAL_ID:
            return getRegionLabel_5058Parser();
        case RegionStateLabelEditPart.VISUAL_ID:
            return getStateLabel_5056Parser();
        case RegionState2LabelEditPart.VISUAL_ID:
            return getStateInterfaceDeclaration_5057Parser();
        case VariableNameEditPart.VISUAL_ID:
            return getVariableName_5062Parser();
        case TransitionLabelEditPart.VISUAL_ID:
            return getTransitionLabel_6009Parser();
        case TransitionPriorityEditPart.VISUAL_ID:
            return getTransitionPriority_6010Parser();
        }
        return null;
    }

    /**
     * Utility method that consults ParserService
     * @generated
     */
    public static IParser getParser(IElementType type, EObject object, String parserHint) {
        return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
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
