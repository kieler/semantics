/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2011 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.yakindu.synccharts.ui.editor.assistent;

import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import de.cau.cs.kieler.yakindu.synccharts.ui.editor.editor.SyncChartsElementTypes;
import de.cau.cs.kieler.yakindu.ui.editor.assistent.SyncModelingAssistantProvider;

/**
 * Init the Modeling Assistant Provider.
 * 
 * The Modeling Assistant Provider provides a popup and a connection creation
 * assistant to permit to add elements to the model.
 * 
 * @author wah
 * 
 */
public class SyncChartsModelingAssistantProvider extends SyncModelingAssistantProvider {

	@Override
	protected IElementType getSyncFinalStateElementType() {
		return SyncChartsElementTypes.getSyncFinalStateElementType();
	}

	@Override
	protected IElementType getSyncInitialStateElementType() {
		return SyncChartsElementTypes.getSyncInitialStateElementType();
	}

	@Override
	protected Object getSyncNormalTerminationTransitionElementType() {
		return SyncChartsElementTypes.getSyncNormalTerminationTransitionElementType();
	}

	@Override
	protected IElementType getSyncStateElementType() {
		return SyncChartsElementTypes.getSyncStateElementType();
	}

	@Override
	protected Object getSyncStrongAbortTransitionElementType() {
		return SyncChartsElementTypes.getSyncStrongAbortTransitionElementType();
	}

	@Override
	protected Object getSyncWeakAbortTransitionElementType() {
		return SyncChartsElementTypes.getSyncWeakAbortTransitionElementType();
	}

}
