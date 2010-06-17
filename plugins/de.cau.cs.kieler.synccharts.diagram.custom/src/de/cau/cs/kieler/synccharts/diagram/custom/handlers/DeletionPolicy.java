/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 *
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 *
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.synccharts.diagram.custom.handlers;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.requests.EditCommandRequestWrapper;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;

import de.cau.cs.kieler.core.ui.policies.DeletionPolicyProvider;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.Region2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.RegionEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.RegionStateCompartmentEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.State2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.TransitionEditPart;

/**
 * This policy prevents deletion of edit parts that should not be deleted from a
 * synccharts diagram.
 * 
 * @author soh
 * @kieler.rating 2010-03-12 proposed yellow
 */
public class DeletionPolicy extends DeletionPolicyProvider {

	/** All parts that belong to the synccharts editor. */
	private static final Class<?>[] ALL_PARTS = { 
	    /* FIXME: names of EditParts are broken
	    EntryActionEditPart.class,
			EntryActionLabelEditPart.class, ExitActionEditPart.class,
			ExitActionLabelEditPart.class, InnerActionEditPart.class,
			InnerActionLabelEditPart.class, Region2EditPart.class,
			RegionEditPart.class, RegionIdEditPart.class,
			RegionStateCompartmentEditPart.class, SignalEditPart.class,
			SignalNameEditPart.class, State2EditPart.class,
			StateEditPart.class, StateEntryActionCompartment2EditPart.class,
			StateEntryActionCompartmentEditPart.class,
			StateExitActionCompartment2EditPart.class,
			StateExitActionCompartmentEditPart.class,
			StateInnerActionCompartment2EditPart.class,
			StateInnerActionCompartmentEditPart.class,
			StateInterfaceDeclaration2EditPart.class,
			StateInterfaceDeclarationEditPart.class, StateLabel2EditPart.class,
			StateLabelEditPart.class, StateRegionCompartment2EditPart.class,
			StateRegionCompartmentEditPart.class,
			StateSignalCompartment2EditPart.class,
			StateSignalCompartmentEditPart.class,
			StateSuspensionTriggerCompartment2EditPart.class,
			StateSuspensionTriggerCompartmentEditPart.class,
			SuspensionTriggerEditPart.class,
			SuspensionTriggerLabelEditPart.class, TextualCodeEditPart.class,
			TransitionDelayEditPart.class, TransitionEditPart.class,
			TransitionPriorityEditPart.class 
			*/
			};

	/**
	 * 
	 * {@inheritDoc}
	 */
	@Override
	public boolean isUnremovableEditPart(final EditPart editPart) {
		if (editPart instanceof Region2EditPart) {
			return false;
		} else if (editPart instanceof RegionEditPart) {
			return false;
		} else if (editPart instanceof State2EditPart) {
			return false;
		} else if (editPart instanceof StateEditPart) {
			return false;
		} else if (editPart instanceof TransitionEditPart) {
			return false;
		}
		return true;
	}

	/**
	 * 
	 * {@inheritDoc}
	 */
	@Override
	public boolean provides(final EditPart editPart) {
		for (Class<?> aClass : ALL_PARTS) {
			if (aClass.equals(editPart.getClass())) {
				return true;
			}
		}
		return false;
	}

	/**
	 * 
	 * {@inheritDoc}
	 */
	@Override
	public void createEditPolicies(final EditPart editPart) {
		// only care about one specific edit part for now
		if (editPart instanceof RegionStateCompartmentEditPart) {
			editPart.installEditPolicy(EditPolicy.COMPONENT_ROLE,
					new SyncchartsComponentEditPolicy(editPart));
		} else {
			super.createEditPolicies(editPart);
		}
	}

	/**
	 * The special edit policy for handling synccharts deletion events.
	 * 
	 * @author soh
	 */
	protected class SyncchartsComponentEditPolicy extends
			KielerComponentEditPolicy {

		/**
		 * Create a new policy.
		 * 
		 * @param editPartParam
		 *            the edit part
		 */
		public SyncchartsComponentEditPolicy(final EditPart editPartParam) {
			super(editPartParam);
		}

		/**
		 * 
		 * {@inheritDoc}
		 */
		@Override
		public Command getCommand(final Request request) {
			Command result = super.getCommand(request);
			EditPart editPart = super.getEditPart();

			// when a region state compartment is about to be delete
			// the enclosing region should be deleted instead
			if (request instanceof EditCommandRequestWrapper
					&& editPart instanceof RegionStateCompartmentEditPart) {
				EditCommandRequestWrapper req = (EditCommandRequestWrapper) request;
				IEditCommandRequest cmdReq = req.getEditCommandRequest();

				// the element is destroyed
				if (cmdReq instanceof DestroyElementRequest) {
					// get the same request for the parent (region edit part)
					result = editPart.getParent().getCommand(request);
				}
			}
			return result;
		}
	}
}
