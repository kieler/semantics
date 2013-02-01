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
package org.yakindu.sct.ui.editor.wizards;

import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.yakindu.sct.model.sgraph.Statechart;

/**
 * 
 * @author andreas muelder - Initial contribution and API
 * 
 */
public interface IDiagramInitializer {
	/**
	 * Called by the new model file wizard to initialize a new created diagram
	 * with default model elements
	 * 
	 */
	public void initModel(Statechart statechart, Diagram diagram,
			PreferencesHint preferencesHint);
}
