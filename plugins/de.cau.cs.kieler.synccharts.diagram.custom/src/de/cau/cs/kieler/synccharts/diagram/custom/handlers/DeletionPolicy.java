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
import de.cau.cs.kieler.synccharts.diagram.edit.parts.Action2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.Action3EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.Action4EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.ActionEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.ActionTriggersAndEffects2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.ActionTriggersAndEffects3EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.ActionTriggersAndEffects4EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.ActionTriggersAndEffectsEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.Region2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.RegionEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.RegionIdEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.RegionStateCompartmentEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.SignalEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.SignalNameEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.State2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateBodyText2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateBodyTextEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateInterfaceDeclaration2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateInterfaceDeclarationEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateLabel2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateLabelEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateOnEntryAction2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateOnEntryActionEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateOnExitAction2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateOnExitActionEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateOnInsideAction2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateOnInsideActionEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateRegionCompartment2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateRegionCompartmentEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateSignal2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateSignalEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateSuspend2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateSuspendEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.TransitionEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.TransitionPriorityEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.TransitionTriggersAndEffectsEditPart;

/**
 * This policy prevents deletion of edit parts that should not be deleted from a
 * synccharts diagram.
 * 
 * @author soh
 * @kieler.rating 2010-03-12 proposed yellow
 */
public class DeletionPolicy extends DeletionPolicyProvider {

    /** All parts that belong to the synccharts editor. */
    private static final Class<?>[] ALL_PARTS = { Action2EditPart.class,
            Action3EditPart.class, Action4EditPart.class, ActionEditPart.class,
            ActionTriggersAndEffects2EditPart.class,
            ActionTriggersAndEffects3EditPart.class,
            ActionTriggersAndEffects4EditPart.class,
            ActionTriggersAndEffectsEditPart.class, Region2EditPart.class,
            RegionEditPart.class, RegionIdEditPart.class,
            RegionStateCompartmentEditPart.class, SignalEditPart.class,
            SignalNameEditPart.class, State2EditPart.class,
            StateBodyText2EditPart.class, StateBodyTextEditPart.class,
            StateEditPart.class, StateInterfaceDeclaration2EditPart.class,
            StateInterfaceDeclarationEditPart.class, StateLabel2EditPart.class,
            StateLabelEditPart.class, StateOnEntryAction2EditPart.class,
            StateOnEntryActionEditPart.class, StateOnExitAction2EditPart.class,
            StateOnExitActionEditPart.class,
            StateOnInsideAction2EditPart.class,
            StateOnInsideActionEditPart.class,
            StateRegionCompartment2EditPart.class,
            StateRegionCompartmentEditPart.class, StateSignal2EditPart.class,
            StateSignalEditPart.class, StateSuspend2EditPart.class,
            StateSuspendEditPart.class, TransitionEditPart.class,
            TransitionPriorityEditPart.class,
            TransitionTriggersAndEffectsEditPart.class };

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
