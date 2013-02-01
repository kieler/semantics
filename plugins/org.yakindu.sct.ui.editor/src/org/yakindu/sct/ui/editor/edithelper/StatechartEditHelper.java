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

import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.core.command.UnexecutableCommand;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelper;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.yakindu.sct.model.sgraph.Statechart;

/**
 * 
 * @author andreas muelder - Initial contribution and API
 * 
 */
public class StatechartEditHelper extends AbstractEditHelper {

	@Override
	protected ICommand getCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (req.getSource() instanceof Statechart) {
			return UnexecutableCommand.INSTANCE;
		}
		return super.getCreateRelationshipCommand(req);
	}

}
