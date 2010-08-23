package org.eclipse.papyrus.diagram.statemachine.providers;

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
import org.eclipse.papyrus.diagram.common.parser.stereotype.AppliedStereotypeParser;
import org.eclipse.papyrus.diagram.statemachine.custom.parsers.TransitionPropertiesParser;
import org.eclipse.papyrus.diagram.statemachine.edit.parts.FinalStateNameEditPart;
import org.eclipse.papyrus.diagram.statemachine.edit.parts.FinalStateStereotypeEditPart;
import org.eclipse.papyrus.diagram.statemachine.edit.parts.PseudostateNameEditPart;
import org.eclipse.papyrus.diagram.statemachine.edit.parts.PseudostateStereotypeEditPart;
import org.eclipse.papyrus.diagram.statemachine.edit.parts.StateMachineNameEditPart;
import org.eclipse.papyrus.diagram.statemachine.edit.parts.StateNameEditPart;
import org.eclipse.papyrus.diagram.statemachine.edit.parts.TransitionGuardEditPart;
import org.eclipse.papyrus.diagram.statemachine.edit.parts.TransitionNameEditPart;
import org.eclipse.papyrus.diagram.statemachine.edit.parts.TransitionStereotypeEditPart;
import org.eclipse.papyrus.diagram.statemachine.parsers.MessageFormatParser;
import org.eclipse.papyrus.diagram.statemachine.part.UMLVisualIDRegistry;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class UMLParserProvider extends AbstractProvider implements
		IParserProvider {

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

	/**
	 * Utility method that consults ParserService
	 * 
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
	private IParser stateMachineName_2001Parser;

	/**
	 * @generated
	 */
	private IParser pseudostateName_4001Parser;

	/**
	 * @generated
	 */
	private AppliedStereotypeParser pseudostateName_4002Parser;

	/**
	 * @generated
	 */
	private IParser finalStateName_5001Parser;

	/**
	 * @generated
	 */
	private IParser stateName_6001Parser;

	/**
	 * @generated
	 */
	private AppliedStereotypeParser finalStateName_5002Parser;

	/**
	 * @generated
	 */
	private IParser transitionName_7001Parser;

	/**
	 * @generated
	 */
	private TransitionPropertiesParser transitionGuard_7002Parser;

	/**
	 * @generated
	 */
	private IParser getFinalStateName_5001Parser() {
		if (finalStateName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			finalStateName_5001Parser = parser;
		}
		return finalStateName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser getFinalStateName_5002Parser() {
		if (finalStateName_5002Parser == null) {
			finalStateName_5002Parser = new AppliedStereotypeParser();
		}
		return finalStateName_5002Parser;
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(UMLVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(UMLVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case StateMachineNameEditPart.VISUAL_ID:
			return getStateMachineName_2001Parser();
		case PseudostateNameEditPart.VISUAL_ID:
			return getPseudostateName_4001Parser();
		case PseudostateStereotypeEditPart.VISUAL_ID:
			return getPseudostateName_4002Parser();
		case FinalStateNameEditPart.VISUAL_ID:
			return getFinalStateName_5001Parser();
		case FinalStateStereotypeEditPart.VISUAL_ID:
			return getFinalStateName_5002Parser();
		case StateNameEditPart.VISUAL_ID:
			return getStateName_6001Parser();
		case TransitionNameEditPart.VISUAL_ID:
			return getTransitionName_7001Parser();
		case TransitionGuardEditPart.VISUAL_ID:
			return getTransitionGuard_7002Parser();
		case TransitionStereotypeEditPart.VISUAL_ID:
			return getTransitionName_7003Parser();
		}
		return null;
	}

	/**
	 * @generated
	 */
	private IParser getPseudostateName_4001Parser() {
		if (pseudostateName_4001Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pseudostateName_4001Parser = parser;
		}
		return pseudostateName_4001Parser;
	}

	/**
	 * @generated
	 */
	private IParser getPseudostateName_4002Parser() {
		if (pseudostateName_4002Parser == null) {
			pseudostateName_4002Parser = new AppliedStereotypeParser();
		}
		return pseudostateName_4002Parser;
	}

	/**
	 * @generated
	 */
	private IParser getStateMachineName_2001Parser() {
		if (stateMachineName_2001Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			stateMachineName_2001Parser = parser;
		}
		return stateMachineName_2001Parser;
	}

	/**
	 * @generated
	 */
	private IParser getStateName_6001Parser() {
		if (stateName_6001Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			stateName_6001Parser = parser;
		}
		return stateName_6001Parser;
	}

	/**
	 * @generated
	 */
	private IParser getTransitionGuard_7002Parser() {
		if (transitionGuard_7002Parser == null) {
			transitionGuard_7002Parser = new TransitionPropertiesParser();
		}
		return transitionGuard_7002Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser transitionName_7003Parser;

	/**
	 * @generated
	 */
	private IParser getTransitionName_7003Parser() {
		if (transitionName_7003Parser == null) {
			transitionName_7003Parser = new AppliedStereotypeParser();
		}
		return transitionName_7003Parser;
	}

	/**
	 * @generated
	 */
	private IParser getTransitionName_7001Parser() {
		if (transitionName_7001Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			transitionName_7001Parser = parser;
		}
		return transitionName_7001Parser;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (UMLElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

}
