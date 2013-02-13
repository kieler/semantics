/**
 * Copyright (c) 2010 committers of YAKINDU and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * 	committers of YAKINDU - initial API and implementation
 * 
 */
package de.cau.cs.kieler.yakindu.sccharts.ui.editor.assistent;

import static de.cau.cs.kieler.yakindu.sccharts.ui.editor.editor.SyncChartsElementTypes.CHOICE;
import static de.cau.cs.kieler.yakindu.sccharts.ui.editor.editor.SyncChartsElementTypes.REGION;
import static de.cau.cs.kieler.yakindu.sccharts.ui.editor.editor.SyncChartsElementTypes.SYNC_FINAL_STATE;
import static de.cau.cs.kieler.yakindu.sccharts.ui.editor.editor.SyncChartsElementTypes.SYNC_INITIAL_STATE;
import static de.cau.cs.kieler.yakindu.sccharts.ui.editor.editor.SyncChartsElementTypes.SYNC_NORMAL_TERMINATION_TRANSITION;
import static de.cau.cs.kieler.yakindu.sccharts.ui.editor.editor.SyncChartsElementTypes.SYNC_STATE;
import static de.cau.cs.kieler.yakindu.sccharts.ui.editor.editor.SyncChartsElementTypes.SYNC_STRONG_ABORT_TRANSITION;
import static de.cau.cs.kieler.yakindu.sccharts.ui.editor.editor.SyncChartsElementTypes.SYNC_WEAK_ABORT_TRANSITION;

import java.util.Collections;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.modelingassistant.ModelingAssistantProvider;
import org.yakindu.sct.ui.editor.editparts.RegionCompartmentEditPart;
import org.yakindu.sct.ui.editor.editparts.RegionEditPart;
import org.yakindu.sct.ui.editor.editparts.StateEditPart;
import org.yakindu.sct.ui.editor.editparts.StateFigureCompartmentEditPart;

import com.google.common.collect.Lists;

import de.cau.cs.kieler.yakindu.sccharts.ui.editor.editor.SyncChartsElementTypes;

/**
 * Init the Modeling Assistant Provider
 * 
 * @author wah
 * 
 */
public class KielerModelingAssistantProvider extends ModelingAssistantProvider {

	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);

		if (editPart instanceof RegionEditPart
				|| editPart instanceof RegionCompartmentEditPart)
			return Lists.newArrayList(SYNC_INITIAL_STATE, SYNC_STATE,
					SYNC_FINAL_STATE, CHOICE);

		if (editPart instanceof StateEditPart
				|| editPart instanceof StateFigureCompartmentEditPart)
			return Lists.newArrayList(REGION);

		return Lists.newArrayList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<IElementType> getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		if (SyncChartsElementTypes.SYNC_WEAK_ABORT_TRANSITION
				.equals(relationshipType)) 
			return Lists.newArrayList(SYNC_STATE, SYNC_FINAL_STATE, CHOICE);
		if (SyncChartsElementTypes.SYNC_STRONG_ABORT_TRANSITION
				.equals(relationshipType))
			return Lists.newArrayList(SYNC_STATE, SYNC_FINAL_STATE, CHOICE);
		if (SyncChartsElementTypes.SYNC_NORMAL_TERMINATION_TRANSITION
				.equals(relationshipType))
			return Lists.newArrayList(SYNC_STATE, SYNC_FINAL_STATE, CHOICE);
		return Collections.EMPTY_LIST;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<IElementType> getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		if (SyncChartsElementTypes.SYNC_WEAK_ABORT_TRANSITION
				.equals(relationshipType))
			return Lists.newArrayList(SYNC_INITIAL_STATE, SYNC_STATE, CHOICE);
		if (SyncChartsElementTypes.SYNC_STRONG_ABORT_TRANSITION
				.equals(relationshipType))
			return Lists.newArrayList(SYNC_INITIAL_STATE, SYNC_STATE, CHOICE);
		if (SyncChartsElementTypes.SYNC_NORMAL_TERMINATION_TRANSITION
				.equals(relationshipType))
			return Lists.newArrayList(SYNC_INITIAL_STATE, SYNC_STATE, CHOICE);
		return Collections.EMPTY_LIST;
	}

	@Override
	public List<?> getRelTypesOnSource(IAdaptable source) {
		return Lists.newArrayList(SYNC_WEAK_ABORT_TRANSITION,
				SYNC_STRONG_ABORT_TRANSITION,
				SYNC_NORMAL_TERMINATION_TRANSITION);
	}

	@Override
	public List<?> getRelTypesOnTarget(IAdaptable target) {
		return Lists.newArrayList(SYNC_WEAK_ABORT_TRANSITION,
				SYNC_STRONG_ABORT_TRANSITION,
				SYNC_NORMAL_TERMINATION_TRANSITION);
	}

	@Override
	public List<?> getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		return Lists.newArrayList(SYNC_WEAK_ABORT_TRANSITION,
				SYNC_STRONG_ABORT_TRANSITION,
				SYNC_NORMAL_TERMINATION_TRANSITION);
	}
}
