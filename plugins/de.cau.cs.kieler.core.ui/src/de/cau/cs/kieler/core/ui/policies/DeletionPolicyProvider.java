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
package de.cau.cs.kieler.core.ui.policies;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ComponentEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.requests.GroupRequestViaKeyboard;
import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;
import org.eclipse.gmf.runtime.diagram.ui.services.editpolicy.CreateEditPoliciesOperation;
import org.eclipse.gmf.runtime.diagram.ui.services.editpolicy.IEditPolicyProvider;

/**
 * This policy is responsible for ensuring that elements get deleted from model
 * or not at all.
 * 
 * @author soh
 * @kieler.rating 2009-02-24 proposed yellow
 */
public abstract class DeletionPolicyProvider extends AbstractProvider implements
        IEditPolicyProvider {

    /**
     * Creates the edit policies.
     * 
     * @param editPart
     *            The editPart to register this policy with.
     */
    public void createEditPolicies(final EditPart editPart) {
        editPart.installEditPolicy(EditPolicy.COMPONENT_ROLE,
                new KielerComponentEditPolicy(editPart));
    }

    /**
     * Determines whether an edit part is unremovable. Subclasses should
     * override.
     * 
     * @param editPart
     *            the edit part
     * @return true if the edit part should not be removed.
     */
    protected boolean isUnremovableEditPart(
            @SuppressWarnings("unused") final EditPart editPart) {
        return false;
    }

    /**
     * Determine whether or not the edit policy is applicable for the edit part.
     * 
     * Extending classes should specify ALL editParts that concern them here,
     * even the unremovable ones.
     * 
     * @param editPart
     *            the edit part
     * @return true
     */
    protected boolean provides(
            @SuppressWarnings("unused") final EditPart editPart) {
        return true;
    }

    /**
     * Checks if this edit policy provides an operation.
     * 
     * @param operation
     *            The operation to check.
     * @return True if this edit policy provides the given operation
     */
    public boolean provides(final IOperation operation) {
        boolean result = false;
        if (operation instanceof CreateEditPoliciesOperation) {
            CreateEditPoliciesOperation op = (CreateEditPoliciesOperation) operation;
            result = provides(op.getEditPart());
        }
        return result;
    }

    /**
     * The policy to be applied to the edit parts for controlling deletion
     * behaviour. Other classes may extend this to provide their own
     * implementation.
     * 
     * @author soh
     */
    protected class KielerComponentEditPolicy extends ComponentEditPolicy {

        /** The edit part to operate on. */
        private EditPart editPart;

        /**
         * Getter for the edit part.
         * 
         * @return the edit part
         */
        protected EditPart getEditPart() {
            return editPart;
        }

        /**
         * Creates a new policy saving the edit part along with it.
         * 
         * @param editPartParam
         *            the edit part
         */
        public KielerComponentEditPolicy(final EditPart editPartParam) {
            this.editPart = editPartParam;
        }

        @Override
        public Command getCommand(final Request request) {
            Command result = super.getCommand(request);

            // If the user presses the delete key, don't delete
            if (request instanceof GroupRequestViaKeyboard
                    && RequestConstants.REQ_DELETE.equals(request.getType())) {
                GroupRequestViaKeyboard req = (GroupRequestViaKeyboard) request;

                if (isUnremovableEditPart(editPart)) {
                    // edit part should not be touched
                    result = UnexecutableCommand.INSTANCE;
                } else {
                    // create a semantic delete request rather than delete from
                    // diagram
                    result = super.createDeleteSemanticCommand(req);
                }
            }

            return result;
        }

    }
}
