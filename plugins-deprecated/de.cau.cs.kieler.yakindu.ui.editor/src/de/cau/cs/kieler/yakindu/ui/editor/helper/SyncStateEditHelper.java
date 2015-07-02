/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.yakindu.ui.editor.helper;

import org.eclipse.gmf.runtime.common.core.command.CompositeCommand;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.commands.SetValueCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.yakindu.sct.ui.editor.edithelper.StateEditHelper;

import de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncgraphPackage;
import de.cau.cs.kieler.yakindu.ui.editor.factory.SyncMetaModelTypeFactory;

/**
 * The SyncState edit helper. This class extends the StateEditHelper class to
 * allow the creation of initial and final states.
 * 
 * @author wah
 * @kieler.rating green 2013-04-13
 */
public class SyncStateEditHelper extends StateEditHelper {
	@Override
	protected ICommand getConfigureCommand(ConfigureRequest req) {

		CompositeCommand result = new CompositeCommand("Create State");

		ElementTypeRegistry registry = ElementTypeRegistry.getInstance();
		IElementType initialState = registry
				.getType(SyncMetaModelTypeFactory.SYNC_INITIAL_STATE_ID);
		IElementType finalState = registry
				.getType(SyncMetaModelTypeFactory.SYNC_FINAL_STATE_ID);

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
