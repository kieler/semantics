package org.eclipse.papyrus.diagram.statemachine.part;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gmf.runtime.diagram.ui.services.palette.PaletteFactory;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.papyrus.diagram.common.service.AspectUnspecifiedTypeConnectionTool;
import org.eclipse.papyrus.diagram.common.service.AspectUnspecifiedTypeCreationTool;
import org.eclipse.papyrus.diagram.statemachine.providers.UMLElementTypes;

/**
 * @generated
 */
public class UMLPaletteFactory extends PaletteFactory.Adapter {

	/**
	 * @generated
	 */
	private final static String CREATESTATEMACHINECREATIONTOOL = "createStateMachineCreationTool"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	private final static String CREATEREGIONCREATIONTOOL = "createRegionCreationTool"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	private final static String CREATESTATECREATIONTOOL = "createStateCreationTool"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	private final static String CREATEINITIALCREATIONTOOL = "createInitialCreationTool"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	private final static String CREATEFINALSTATECREATIONTOOL = "createFinalStateCreationTool"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	private final static String CREATESHALLOWHISTORYCREATIONTOOL = "createShallowHistoryCreationTool"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	private final static String CREATEDEEPHISTORYCREATIONTOOL = "createDeepHistoryCreationTool"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	private final static String CREATEFORKCREATIONTOOL = "createForkCreationTool"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	private final static String CREATEJOINCREATIONTOOL = "createJoinCreationTool"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	private final static String CREATECHOICECREATIONTOOL = "createChoiceCreationTool"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	private final static String CREATEJUNCTIONCREATIONTOOL = "createJunctionCreationTool"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	private final static String CREATEENTRYPOINTCREATIONTOOL = "createEntryPointCreationTool"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	private final static String CREATEEXITPOINTCREATIONTOOL = "createExitPointCreationTool"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	private final static String CREATETERMINATECREATIONTOOL = "createTerminateCreationTool"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	private final static String CREATETRANSITIONCREATIONTOOL = "createTransitionCreationTool"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public UMLPaletteFactory() {

	}

	/**
	 * @generated
	 */
	private Tool createChoiceCreationTool() {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(UMLElementTypes.Pseudostate_4000);

		Tool tool = new AspectUnspecifiedTypeCreationTool(types);
		return tool;
	}

	/**
	 * @generated
	 */
	private Tool createDeepHistoryCreationTool() {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(UMLElementTypes.Pseudostate_4000);

		Tool tool = new AspectUnspecifiedTypeCreationTool(types);
		return tool;
	}

	/**
	 * @generated
	 */
	private Tool createEntryPointCreationTool() {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(UMLElementTypes.Pseudostate_4000);

		Tool tool = new AspectUnspecifiedTypeCreationTool(types);
		return tool;
	}

	/**
	 * @generated
	 */
	private Tool createExitPointCreationTool() {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(UMLElementTypes.Pseudostate_4000);

		Tool tool = new AspectUnspecifiedTypeCreationTool(types);
		return tool;
	}

	/**
	 * @generated
	 */
	private Tool createFinalStateCreationTool() {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(UMLElementTypes.FinalState_5000);

		Tool tool = new AspectUnspecifiedTypeCreationTool(types);
		return tool;
	}

	/**
	 * @generated
	 */
	private Tool createForkCreationTool() {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(UMLElementTypes.Pseudostate_4000);

		Tool tool = new AspectUnspecifiedTypeCreationTool(types);
		return tool;
	}

	/**
	 * @generated
	 */
	private Tool createInitialCreationTool() {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(UMLElementTypes.Pseudostate_4000);

		Tool tool = new AspectUnspecifiedTypeCreationTool(types);
		return tool;
	}

	/**
	 * @generated
	 */
	private Tool createJoinCreationTool() {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(UMLElementTypes.Pseudostate_4000);

		Tool tool = new AspectUnspecifiedTypeCreationTool(types);
		return tool;
	}

	/**
	 * @generated
	 */
	private Tool createJunctionCreationTool() {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(UMLElementTypes.Pseudostate_4000);

		Tool tool = new AspectUnspecifiedTypeCreationTool(types);
		return tool;
	}

	/**
	 * @generated
	 */
	private Tool createRegionCreationTool() {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(UMLElementTypes.Region_3000);

		Tool tool = new AspectUnspecifiedTypeCreationTool(types);
		return tool;
	}

	/**
	 * @generated
	 */
	private Tool createShallowHistoryCreationTool() {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(UMLElementTypes.Pseudostate_4000);

		Tool tool = new AspectUnspecifiedTypeCreationTool(types);
		return tool;
	}

	/**
	 * @generated
	 */
	private Tool createStateCreationTool() {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(UMLElementTypes.State_6000);

		Tool tool = new AspectUnspecifiedTypeCreationTool(types);
		return tool;
	}

	/**
	 * @generated
	 */
	private Tool createStateMachineCreationTool() {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(UMLElementTypes.StateMachine_2000);

		Tool tool = new AspectUnspecifiedTypeCreationTool(types);
		return tool;
	}

	/**
	 * @generated
	 */
	private Tool createTerminateCreationTool() {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(UMLElementTypes.Pseudostate_4000);

		Tool tool = new AspectUnspecifiedTypeCreationTool(types);
		return tool;
	}

	/**
	 * @generated
	 */
	public Tool createTool(String toolId) {
		if (toolId.equals(CREATESTATEMACHINECREATIONTOOL)) {
			return createStateMachineCreationTool();
		}
		if (toolId.equals(CREATEREGIONCREATIONTOOL)) {
			return createRegionCreationTool();
		}
		if (toolId.equals(CREATESTATECREATIONTOOL)) {
			return createStateCreationTool();
		}
		if (toolId.equals(CREATEINITIALCREATIONTOOL)) {
			return createInitialCreationTool();
		}
		if (toolId.equals(CREATEFINALSTATECREATIONTOOL)) {
			return createFinalStateCreationTool();
		}
		if (toolId.equals(CREATESHALLOWHISTORYCREATIONTOOL)) {
			return createShallowHistoryCreationTool();
		}
		if (toolId.equals(CREATEDEEPHISTORYCREATIONTOOL)) {
			return createDeepHistoryCreationTool();
		}
		if (toolId.equals(CREATEFORKCREATIONTOOL)) {
			return createForkCreationTool();
		}
		if (toolId.equals(CREATEJOINCREATIONTOOL)) {
			return createJoinCreationTool();
		}
		if (toolId.equals(CREATECHOICECREATIONTOOL)) {
			return createChoiceCreationTool();
		}
		if (toolId.equals(CREATEJUNCTIONCREATIONTOOL)) {
			return createJunctionCreationTool();
		}
		if (toolId.equals(CREATEENTRYPOINTCREATIONTOOL)) {
			return createEntryPointCreationTool();
		}
		if (toolId.equals(CREATEEXITPOINTCREATIONTOOL)) {
			return createExitPointCreationTool();
		}
		if (toolId.equals(CREATETERMINATECREATIONTOOL)) {
			return createTerminateCreationTool();
		}
		if (toolId.equals(CREATETRANSITIONCREATIONTOOL)) {
			return createTransitionCreationTool();
		}

		// default return: null
		return null;
	}

	/**
	 * @generated
	 */
	private Tool createTransitionCreationTool() {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(UMLElementTypes.Transition_7000);

		Tool tool = new AspectUnspecifiedTypeConnectionTool(types);
		return tool;
	}

	/**
	 * @generated
	 */
	public Object getTemplate(String templateId) {

		// default return: null
		return null;
	}

}
