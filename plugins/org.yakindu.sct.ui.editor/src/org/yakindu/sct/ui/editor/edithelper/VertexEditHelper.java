/**
 * Copyright (c) 2011 committers of YAKINDU and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * 	committers of YAKINDU - initial API and implementation
 * 
 */
package org.yakindu.sct.ui.editor.edithelper;

import org.eclipse.emf.common.util.EList;
import org.eclipse.gmf.runtime.common.core.command.CompositeCommand;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelper;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyDependentsRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.yakindu.sct.model.sgraph.Transition;
import org.yakindu.sct.model.sgraph.Vertex;

/**
 * Base Edit Helper class for all Vertices
 * 
 * @author andreas muelder
 * 
 */
public class VertexEditHelper extends AbstractEditHelper {

	@Override
	protected ICommand getDestroyDependentsCommand(DestroyDependentsRequest req) {
		
		Vertex elementToDestroy = (Vertex) req.getElementToDestroy();
		EList<Transition> incomingTransitions = elementToDestroy
				.getIncomingTransitions();
		if (incomingTransitions.size() != 0) {
			CompositeCommand compoundCommand = new CompositeCommand(
					"Delete vertex");
			for (Transition transition : incomingTransitions) {
				DestroyElementCommand destroyCommand = new DestroyElementCommand(
						new DestroyElementRequest(transition, false));
				compoundCommand.add(destroyCommand);
			}
			return compoundCommand;
		}
		return super.getDestroyDependentsCommand(req);
	}
	
	@Override
	protected ICommand getConfigureCommand(ConfigureRequest req) {
		System.out.println("configure " + req);
		return super.getConfigureCommand(req);
	}
}
