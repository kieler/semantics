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

import de.cau.cs.kieler.core.kexpressions.KExpressionsPackage;
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
import de.cau.cs.kieler.synccharts.diagram.edit.parts.TextualCodeCodeEditPart;
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
    private IParser stateLabel_5073Parser;

    /**
     * @generated
     */
    private IParser getStateLabel_5073Parser() {
        if (stateLabel_5073Parser == null) {
            EAttribute[] features = new EAttribute[] { SyncchartsPackage.eINSTANCE.getScope_Label() };
            MessageFormatParser parser = new MessageFormatParser(features);
            stateLabel_5073Parser = parser;
        }
        return stateLabel_5073Parser;
    }

    /**
     * @generated
     */
    private IParser stateInterfaceDeclaration_5074Parser;

    /**
     * @generated
     */
    private IParser getStateInterfaceDeclaration_5074Parser() {
        if (stateInterfaceDeclaration_5074Parser == null) {
            EAttribute[] features = new EAttribute[] { SyncchartsPackage.eINSTANCE
                    .getScope_InterfaceDeclaration() };
            EAttribute[] editableFeatures = new EAttribute[] { SyncchartsPackage.eINSTANCE
                    .getScope_InterfaceDeclaration() };
            MessageFormatParser parser = new MessageFormatParser(features, editableFeatures);
            stateInterfaceDeclaration_5074Parser = parser;
        }
        return stateInterfaceDeclaration_5074Parser;
    }

    /**
     * @generated
     */
    private IParser signalName_5063Parser;

    /**
     * @generated
     */
    private IParser getSignalName_5063Parser() {
        if (signalName_5063Parser == null) {
            EAttribute[] features = new EAttribute[] { KExpressionsPackage.eINSTANCE
                    .getValuedObject_Name() };
            MessageFormatParser parser = new MessageFormatParser(features);
            parser.setViewPattern("{0},"); //$NON-NLS-1$
            parser.setEditorPattern("{0}"); //$NON-NLS-1$
            parser.setEditPattern("{0}"); //$NON-NLS-1$
            signalName_5063Parser = parser;
        }
        return signalName_5063Parser;
    }

    /**
     * @generated
     */
    private IParser actionLabel_5064Parser;

    /**
     * @generated
     */
    private IParser getActionLabel_5064Parser() {
        if (actionLabel_5064Parser == null) {
            EAttribute[] features = new EAttribute[] { SyncchartsPackage.eINSTANCE
                    .getAction_Label() };
            EAttribute[] editableFeatures = new EAttribute[] { SyncchartsPackage.eINSTANCE
                    .getAction_Label() };
            MessageFormatParser parser = new MessageFormatParser(features, editableFeatures);
            actionLabel_5064Parser = parser;
        }
        return actionLabel_5064Parser;
    }

    /**
     * @generated
     */
    private IParser actionLabel_5065Parser;

    /**
     * @generated
     */
    private IParser getActionLabel_5065Parser() {
        if (actionLabel_5065Parser == null) {
            EAttribute[] features = new EAttribute[] { SyncchartsPackage.eINSTANCE
                    .getAction_Label() };
            EAttribute[] editableFeatures = new EAttribute[] { SyncchartsPackage.eINSTANCE
                    .getAction_Label() };
            MessageFormatParser parser = new MessageFormatParser(features, editableFeatures);
            actionLabel_5065Parser = parser;
        }
        return actionLabel_5065Parser;
    }

    /**
     * @generated
     */
    private IParser actionLabel_5066Parser;

    /**
     * @generated
     */
    private IParser getActionLabel_5066Parser() {
        if (actionLabel_5066Parser == null) {
            EAttribute[] features = new EAttribute[] { SyncchartsPackage.eINSTANCE
                    .getAction_Label() };
            EAttribute[] editableFeatures = new EAttribute[] { SyncchartsPackage.eINSTANCE
                    .getAction_Label() };
            MessageFormatParser parser = new MessageFormatParser(features, editableFeatures);
            actionLabel_5066Parser = parser;
        }
        return actionLabel_5066Parser;
    }

    /**
     * @generated
     */
    private IParser actionLabel_5067Parser;

    /**
     * @generated
     */
    private IParser getActionLabel_5067Parser() {
        if (actionLabel_5067Parser == null) {
            EAttribute[] features = new EAttribute[] { SyncchartsPackage.eINSTANCE
                    .getAction_Label() };
            EAttribute[] editableFeatures = new EAttribute[] { SyncchartsPackage.eINSTANCE
                    .getAction_Label() };
            MessageFormatParser parser = new MessageFormatParser(features, editableFeatures);
            actionLabel_5067Parser = parser;
        }
        return actionLabel_5067Parser;
    }

    /**
     * @generated
     */
    private IParser textualCodeCode_5068Parser;

    /**
     * @generated
     */
    private IParser getTextualCodeCode_5068Parser() {
        if (textualCodeCode_5068Parser == null) {
            EAttribute[] features = new EAttribute[] { KExpressionsPackage.eINSTANCE
                    .getTextualCode_Code() };
            EAttribute[] editableFeatures = new EAttribute[] { KExpressionsPackage.eINSTANCE
                    .getTextualCode_Code() };
            MessageFormatParser parser = new MessageFormatParser(features, editableFeatures);
            textualCodeCode_5068Parser = parser;
        }
        return textualCodeCode_5068Parser;
    }

    /**
     * @generated
     */
    private IParser regionLabel_5072Parser;

    /**
     * @generated
     */
    private IParser getRegionLabel_5072Parser() {
        if (regionLabel_5072Parser == null) {
            EAttribute[] features = new EAttribute[] { SyncchartsPackage.eINSTANCE.getScope_Label() };
            EAttribute[] editableFeatures = new EAttribute[] { SyncchartsPackage.eINSTANCE
                    .getScope_Label() };
            MessageFormatParser parser = new MessageFormatParser(features, editableFeatures);
            regionLabel_5072Parser = parser;
        }
        return regionLabel_5072Parser;
    }

    /**
     * @generated
     */
    private IParser stateLabel_5070Parser;

    /**
     * @generated
     */
    private IParser getStateLabel_5070Parser() {
        if (stateLabel_5070Parser == null) {
            EAttribute[] features = new EAttribute[] { SyncchartsPackage.eINSTANCE.getScope_Label() };
            MessageFormatParser parser = new MessageFormatParser(features);
            stateLabel_5070Parser = parser;
        }
        return stateLabel_5070Parser;
    }

    /**
     * @generated
     */
    private IParser stateInterfaceDeclaration_5071Parser;

    /**
     * @generated
     */
    private IParser getStateInterfaceDeclaration_5071Parser() {
        if (stateInterfaceDeclaration_5071Parser == null) {
            EAttribute[] features = new EAttribute[] { SyncchartsPackage.eINSTANCE
                    .getScope_InterfaceDeclaration() };
            EAttribute[] editableFeatures = new EAttribute[] { SyncchartsPackage.eINSTANCE
                    .getScope_InterfaceDeclaration() };
            MessageFormatParser parser = new MessageFormatParser(features, editableFeatures);
            stateInterfaceDeclaration_5071Parser = parser;
        }
        return stateInterfaceDeclaration_5071Parser;
    }

    /**
     * @generated
     */
    private IParser variableName_5069Parser;

    /**
     * @generated
     */
    private IParser getVariableName_5069Parser() {
        if (variableName_5069Parser == null) {
            EAttribute[] features = new EAttribute[] { KExpressionsPackage.eINSTANCE
                    .getValuedObject_Name() };
            MessageFormatParser parser = new MessageFormatParser(features);
            variableName_5069Parser = parser;
        }
        return variableName_5069Parser;
    }

    /**
     * @generated
     */
    private IParser transitionLabel_6011Parser;

    /**
     * @generated
     */
    private IParser getTransitionLabel_6011Parser() {
        if (transitionLabel_6011Parser == null) {
            EAttribute[] features = new EAttribute[] { SyncchartsPackage.eINSTANCE
                    .getAction_Label() };
            EAttribute[] editableFeatures = new EAttribute[] { SyncchartsPackage.eINSTANCE
                    .getAction_Label() };
            MessageFormatParser parser = new MessageFormatParser(features, editableFeatures);
            transitionLabel_6011Parser = parser;
        }
        return transitionLabel_6011Parser;
    }

    /**
     * @generated
     */
    private IParser transitionPriority_6012Parser;

    /**
     * @generated
     */
    private IParser getTransitionPriority_6012Parser() {
        if (transitionPriority_6012Parser == null) {
            EAttribute[] features = new EAttribute[] { SyncchartsPackage.eINSTANCE
                    .getTransition_Priority() };
            EAttribute[] editableFeatures = new EAttribute[] { SyncchartsPackage.eINSTANCE
                    .getTransition_Priority() };
            MessageFormatParser parser = new MessageFormatParser(features, editableFeatures);
            transitionPriority_6012Parser = parser;
        }
        return transitionPriority_6012Parser;
    }

    /**
     * @generated
     */
    protected IParser getParser(int visualID) {
        switch (visualID) {
        case StateLabelEditPart.VISUAL_ID:
            return getStateLabel_5073Parser();
        case StateInterfaceDeclarationEditPart.VISUAL_ID:
            return getStateInterfaceDeclaration_5074Parser();
        case SignalNameEditPart.VISUAL_ID:
            return getSignalName_5063Parser();
        case StateEntryActionLabelEditPart.VISUAL_ID:
            return getActionLabel_5064Parser();
        case StateInnerActionLabelEditPart.VISUAL_ID:
            return getActionLabel_5065Parser();
        case StateExitActionLabelEditPart.VISUAL_ID:
            return getActionLabel_5066Parser();
        case StateSuspensionTriggerLabelEditPart.VISUAL_ID:
            return getActionLabel_5067Parser();
        case TextualCodeCodeEditPart.VISUAL_ID:
            return getTextualCodeCode_5068Parser();
        case StateRegionLabelEditPart.VISUAL_ID:
            return getRegionLabel_5072Parser();
        case RegionStateLabelEditPart.VISUAL_ID:
            return getStateLabel_5070Parser();
        case RegionState2LabelEditPart.VISUAL_ID:
            return getStateInterfaceDeclaration_5071Parser();
        case VariableNameEditPart.VISUAL_ID:
            return getVariableName_5069Parser();
        case TransitionLabelEditPart.VISUAL_ID:
            return getTransitionLabel_6011Parser();
        case TransitionPriorityEditPart.VISUAL_ID:
            return getTransitionPriority_6012Parser();
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
