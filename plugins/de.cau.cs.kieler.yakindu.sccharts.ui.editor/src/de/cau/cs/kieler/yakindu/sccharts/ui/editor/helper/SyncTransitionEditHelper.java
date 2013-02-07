package de.cau.cs.kieler.yakindu.sccharts.ui.editor.helper;

import org.eclipse.gmf.runtime.common.core.command.CompositeCommand;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.ElementType;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.commands.SetValueCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.yakindu.sct.model.sgraph.EntryKind;
import org.yakindu.sct.ui.editor.edithelper.TransitionEditHelper;

import de.cau.cs.kieler.yakindu.sccharts.ui.editor.factory.KielerMetaModelTypeFactory;
import de.cau.cs.kieler.yakindu.sgraph.syncgraph.SyncgraphPackage;
import de.cau.cs.kieler.yakindu.sgraph.syncgraph.TransitionType;

public class SyncTransitionEditHelper extends TransitionEditHelper {


	/**
	 * Set the right {@link EntryKind} for the given {@link ElementType}
	 */
	@Override
	protected ICommand getConfigureCommand(ConfigureRequest req) {
		CompositeCommand result = new CompositeCommand("Create Transition");
		result.add(super.getConfigureCommand(req));

		ElementTypeRegistry registry = ElementTypeRegistry.getInstance();
		IElementType normalTransition = registry
				.getType(KielerMetaModelTypeFactory.NORMAL_TRANSITION_ID);
		IElementType weakTransition = registry
				.getType(KielerMetaModelTypeFactory.WEAK_TRANSITION_ID);
		IElementType strongTransition = registry
				.getType(KielerMetaModelTypeFactory.STRONG_TRANSITION_ID);

		if (normalTransition.equals(req.getTypeToConfigure())) {
			result.add(new SetValueCommand(
					new SetRequest(req.getElementToConfigure(),
							SyncgraphPackage.eINSTANCE
									.getSyncTransition_Type(),
							TransitionType.NORMALTERMINATION)));
		} else if (weakTransition.equals(req.getTypeToConfigure())) {
			result.add(new SetValueCommand(new SetRequest(req
					.getElementToConfigure(), SyncgraphPackage.eINSTANCE
					.getSyncTransition_Type(), TransitionType.WEAKABORT)));
		} else if (strongTransition.equals(req.getTypeToConfigure())) {
			result.add(new SetValueCommand(new SetRequest(req
					.getElementToConfigure(), SyncgraphPackage.eINSTANCE
					.getSyncTransition_Type(), TransitionType.STRONGABORT)));
		}
		return result;
	}

}
