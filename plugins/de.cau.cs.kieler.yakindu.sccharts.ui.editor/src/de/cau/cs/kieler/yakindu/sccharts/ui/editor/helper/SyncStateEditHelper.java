package de.cau.cs.kieler.yakindu.sccharts.ui.editor.helper;

import org.eclipse.gmf.runtime.common.core.command.CompositeCommand;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.commands.SetValueCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.yakindu.sct.ui.editor.edithelper.StateEditHelper;

import de.cau.cs.kieler.yakindu.sccharts.ui.editor.factory.KielerMetaModelTypeFactory;
import de.cau.cs.kieler.yakindu.sgraph.syncgraph.SyncgraphPackage;

public class SyncStateEditHelper extends StateEditHelper {
	@Override
	protected ICommand getConfigureCommand(ConfigureRequest req) {

		CompositeCommand result = new CompositeCommand("Create State");

		ElementTypeRegistry registry = ElementTypeRegistry.getInstance();
		IElementType initialState = registry
				.getType(KielerMetaModelTypeFactory.SYNC_INITIAL_STATE_ID);
		IElementType finalState = registry
				.getType(KielerMetaModelTypeFactory.SYNC_FINAL_STATE_ID);

		if (initialState.equals(req.getTypeToConfigure())) {
			result.add(new SetValueCommand(new SetRequest(req
					.getElementToConfigure(), SyncgraphPackage.eINSTANCE
					.getSyncState_IsInitial(), true)));
		} else if (finalState.equals(req.getTypeToConfigure())) {
			result.add(new SetValueCommand(new SetRequest(req
					.getElementToConfigure(), SyncgraphPackage.eINSTANCE
					.getSyncState_IsFinal(), true)));
		}
		return result;
	}
}
