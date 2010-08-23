/*****************************************************************************
 * Copyright (c) 2008 CEA LIST.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Patrick Tessier (CEA LIST) Patrick.Tessier@cea.fr - Initial API and implementation
 *  
 *****************************************************************************/
package org.eclipse.papyrus.diagram.statemachine.custom.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.diagram.common.editpolicies.OrphanViewPolicy;
import org.eclipse.papyrus.diagram.statemachine.custom.commands.CustomRegionDeleteCommand;
import org.eclipse.papyrus.diagram.statemachine.custom.helpers.Zone;

/**
 * this policy is used to supress orphan node view in GMF view the prolicy to
 * remove orphan connection is more complex. It is dependent of the diagram. see
 * remove OrphanConnectionView policy in clazzdiagram
 * 
 */
public class RemoveOrphanViewPolicy extends OrphanViewPolicy {

	public int[] notOrphanNode = { 3002, 2002 };

	public RemoveOrphanViewPolicy() {
		super();
		init(notOrphanNode);
	}

	@Override
	protected Command getDeleteViewCommand(View view) {
		if(Zone.isRegion(view)) {
			TransactionalEditingDomain editingDomain = ((IGraphicalEditPart)getHost()).getEditingDomain();
			return new ICommandProxy(new CustomRegionDeleteCommand(editingDomain, view));
		}
		return super.getDeleteViewCommand(view);
	}
}
