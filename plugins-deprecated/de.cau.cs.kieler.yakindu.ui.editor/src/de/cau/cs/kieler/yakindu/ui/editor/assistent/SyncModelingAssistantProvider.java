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
package de.cau.cs.kieler.yakindu.ui.editor.assistent;

import static de.cau.cs.kieler.yakindu.ui.editor.editor.SyncElementTypes.CHOICE;
import static de.cau.cs.kieler.yakindu.ui.editor.editor.SyncElementTypes.REGION;

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

import de.cau.cs.kieler.yakindu.ui.editor.editor.SyncElementTypes;

/**
 * Init the Modeling Assistant Provider. This class extends the
 * ModelingAssistantProvider to initialize the elements which are used in the
 * pop-up bar and the connection creation assistant. It adds the SyncState and
 * all types of transitions (weak abort, strong abort, and normal termination).
 * 
 * @author wah
 * @kieler.rating green 2013-04-13
 */
public class SyncModelingAssistantProvider extends ModelingAssistantProvider {

	/**
	 * Initialize the elements to display in the pop-up bar (choice, region,
	 * SyncState).
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);

		if (editPart instanceof RegionEditPart
				|| editPart instanceof RegionCompartmentEditPart)
			return Lists.newArrayList(getSyncInitialStateElementType(),
					getSyncStateElementType(), getSyncFinalStateElementType(),
					CHOICE);

		if (editPart instanceof StateEditPart
				|| editPart instanceof StateFigureCompartmentEditPart)
			return Lists.newArrayList(REGION);

		return Lists.newArrayList();
	}

	/**
	 * Initialize the list of creation assistant elements on a target transition
	 * (choice, initial state, state, or final state).
	 */
	// The warning is supressed while the returned type is conform to
	// List<IElementType>.
	@SuppressWarnings("unchecked")
	@Override
	public List<IElementType> getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		if (getSyncWeakAbortTransitionElementType().equals(relationshipType))
			return Lists.newArrayList(getSyncStateElementType(),
					getSyncFinalStateElementType(), CHOICE);
		if (getSyncStrongAbortTransitionElementType().equals(relationshipType))
			return Lists.newArrayList(getSyncStateElementType(),
					getSyncFinalStateElementType(), CHOICE);
		if (getSyncNormalTerminationTransitionElementType().equals(
				relationshipType))
			return Lists.newArrayList(getSyncStateElementType(),
					getSyncFinalStateElementType(), CHOICE);
		return Collections.EMPTY_LIST;
	}

	/**
	 * Initialize the list of creation assistant elements on a source transition
	 * (choice, initial state, state, or final state).
	 */
	// The warning is supressed while the returned type is conform to
	// List<IElementType>.
	@SuppressWarnings("unchecked")
	@Override
	public List<IElementType> getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		if (getSyncWeakAbortTransitionElementType().equals(relationshipType))
			return Lists.newArrayList(getSyncInitialStateElementType(),
					getSyncStateElementType(), CHOICE);
		if (getSyncStrongAbortTransitionElementType().equals(relationshipType))
			return Lists.newArrayList(getSyncInitialStateElementType(),
					getSyncStateElementType(), CHOICE);
		if (getSyncNormalTerminationTransitionElementType().equals(
				relationshipType))
			return Lists.newArrayList(getSyncInitialStateElementType(),
					getSyncStateElementType(), CHOICE);
		return Collections.EMPTY_LIST;
	}

	/**
	 * Initialize different types of transitions for the connection creation
	 * provider (wean abortion, strong abortion, normal termination).
	 * 
	 */
	@Override
	public List<?> getRelTypesOnSource(IAdaptable source) {
		return Lists.newArrayList(getSyncWeakAbortTransitionElementType(),
				getSyncStrongAbortTransitionElementType(),
				getSyncNormalTerminationTransitionElementType());
	}

	/**
	 * Initialize different types of transitions for the connection creation
	 * provider (wean abortion, strong abortion, normal termination).
	 * 
	 */
	@Override
	public List<?> getRelTypesOnTarget(IAdaptable target) {
		return Lists.newArrayList(getSyncWeakAbortTransitionElementType(),
				getSyncStrongAbortTransitionElementType(),
				getSyncNormalTerminationTransitionElementType());
	}

	/**
	 * Initialize different types of transitions for the connection creation
	 * provider (wean abortion, strong abortion, normal termination).
	 * 
	 */
	@Override
	public List<?> getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		return Lists.newArrayList(
				SyncElementTypes.getSyncWeakAbortTransitionElementType(),
				getSyncStrongAbortTransitionElementType(),
				getSyncNormalTerminationTransitionElementType());
	}

	/**
	 * Override this method to return the Final State Element Type.
	 * This method must be overridden to return the right object.
	 * 
	 * @return the Final State Element Type
	 */
	protected IElementType getSyncFinalStateElementType() {
		return null;
	}

	/**
	 * Override this method to return the State Element Type.
	 * This method must be overridden to return the right object.
	 * 
	 * @return the State Element Type
	 */
	protected IElementType getSyncStateElementType() {
		return null;
	}

	/**
	 * Override this method to return the initial State Element Type.
	 * This method must be overridden to return the right object.
	 * 
	 * @return the initial State Element Type
	 */
	protected IElementType getSyncInitialStateElementType() {
		return null;
	}

	/**
	 * Override this method to return the normal termination transition Element Type.
	 * This method must be overridden to return the right object
	 * 
	 * @return the normal termination transition Element Type
	 */
	protected Object getSyncNormalTerminationTransitionElementType() {
		return null;
	}

	/**
	 * Override this method to return the strong abort transition Element Type.
	 * This method must be overridden to return the right object.
	 * 
	 * @return the strong abort transition Element Type
	 */
	protected Object getSyncStrongAbortTransitionElementType() {
		return null;
	}

	/**
	 * Override this method to return the weak abort transition Element Type.
	 * This method must be overridden to return the right object.
	 * 
	 * @return the weak abort transition Element Type
	 */
	protected Object getSyncWeakAbortTransitionElementType() {
		return null;
	}

}
