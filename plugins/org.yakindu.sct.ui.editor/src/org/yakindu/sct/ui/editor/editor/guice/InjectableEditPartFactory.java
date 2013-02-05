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

import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.services.editpart.AbstractEditPartProvider;
import org.eclipse.gmf.runtime.diagram.ui.services.editpart.CreateGraphicEditPartOperation;
import org.eclipse.gmf.runtime.diagram.ui.services.editpart.IEditPartOperation;
import org.eclipse.gmf.runtime.notation.View;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.name.Names;

/**
 * 
 * @author andreas muelder - Initial contribution and API
 * 
 */
public class InjectableEditPartFactory extends AbstractEditPartProvider {

	@Inject
	private Injector injector;

	@Override
	public boolean provides(IOperation operation) {
		if (operation instanceof CreateGraphicEditPartOperation) {
			View view = ((IEditPartOperation) operation).getView();
			return createGraphicEditPart(view) != null;
		}
		return false;
	}

	public IGraphicalEditPart createGraphicEditPart(View model) {
		IGraphicalEditPart editPart = injector.getInstance(Key.get(IGraphicalEditPart.class,
				Names.named(model.getType())));
		editPart.setModel(model);
		return editPart;
	}

}
