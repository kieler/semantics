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
import org.eclipse.gmf.runtime.emf.type.core.ElementType;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.commands.SetValueCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.yakindu.sct.model.sgraph.EntryKind;
import org.yakindu.sct.ui.editor.edithelper.TransitionEditHelper;

import de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncgraphPackage;
import de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.TransitionType;
import de.cau.cs.kieler.yakindu.ui.editor.factory.SyncMetaModelTypeFactory;

/**
 * The class extends the TransitionEditHelper to allow the creation of the
 * different transition type (weak abortion, strong abortion, and normal
 * termination).
 * 
 * @author wah
 * @kieler.rating green 2013-04-13
 * 
 */
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
				.getType(SyncMetaModelTypeFactory.NORMAL_TRANSITION_ID);
		IElementType weakTransition = registry
				.getType(SyncMetaModelTypeFactory.WEAK_TRANSITION_ID);
		IElementType strongTransition = registry
				.getType(SyncMetaModelTypeFactory.STRONG_TRANSITION_ID);

		if (normalTransition.equals(req.getTypeToConfigure())) {
			result.add(new SetValueCommand(
					new SetRequest(
							req.getElementToConfigure(),
							SyncgraphPackage.eINSTANCE.getSyncTransition_Type(),
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
