/**
 * Copyright (c) 2012 committers of YAKINDU and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * 	committers of YAKINDU - initial API and implementation
 * 
 */
package org.yakindu.sct.ui.editor.editor.guice;

import org.eclipse.emf.transaction.RunnableWithResult;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.yakindu.sct.ui.editor.providers.SemanticHints;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.name.Names;
/**
 * 
 * @author andreas muelder - Initial contribution and API
 * 
 */
public class InjectableEditPartFactory implements EditPartFactory,
		SemanticHints {

	@Inject
	private Injector injector;

	protected IGraphicalEditPart createGraphicEditPart(View model) {
		
		IGraphicalEditPart editPart = injector.getInstance(Key.get(
				IGraphicalEditPart.class, Names.named(model.getType())));
		editPart.setModel(model);
		return editPart;
	}

	public EditPart createEditPart(final EditPart context, final Object model) {
		TransactionalEditingDomain editingDomain = TransactionUtil
				.getEditingDomain(model);
		try {
			return (EditPart) editingDomain
					.runExclusive(new RunnableWithResult.Impl<EditPart>() {
						public void run() {
							setResult(createGraphicEditPart((View) model));
						}

					});
		} catch (InterruptedException e) {
			e.printStackTrace();
			return null;
		}
	}

}
