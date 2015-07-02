/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 * 
 *****************************************************************************/
package de.cau.cs.kieler.ksbase.gmf.handler;

import java.util.List;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DescriptionCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.NoteEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.internal.editparts.NoteAttachmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.services.editpolicy.IEditPolicyProvider;

import de.cau.cs.kieler.core.model.gmf.policies.IBalloonContribution;

/**
 * Provides an edit policy to create popup balloons.
 * 
 * @author soh
 */
@SuppressWarnings("restriction")
public class BalloonPopupEditPolicyProvider extends AbstractProvider implements
        IEditPolicyProvider {

    /** The list of contributions. */
    private List<IBalloonContribution> contributions = null;

    /**
     * Creates the edit policies.
     * 
     * @param editPart
     *            The editPart to register this policy with.
     */
    public void createEditPolicies(final EditPart editPart) {
        if (!isNote(editPart)) {
            List<IBalloonContribution> contrib = getContributions();
            if (contrib != null) {
                editPart.removeEditPolicy(EditPolicyRoles.POPUPBAR_ROLE);
                BalloonPopupBarEditPolicy policy = new BalloonPopupBarEditPolicy(
                        contrib, editPart);
                policy.setHost(editPart);
                editPart.installEditPolicy(EditPolicyRoles.POPUPBAR_ROLE,
                        policy);
                policy.activate();
            }
        }
    }

    /**
     * Determines whether the edit part is a note.
     * 
     * @param editPart
     *            the edit part
     * @return true if it is a note
     */
    private boolean isNote(final EditPart editPart) {
        if (editPart instanceof DescriptionCompartmentEditPart) {
            return true;
        }
        if (editPart instanceof NoteEditPart) {
            return true;
        }
        if (editPart instanceof NoteAttachmentEditPart) {
            return true;
        }
        return false;
    }

    /**
     * Get the contributions from the extending plugins.
     * 
     * @return the list of contributions
     */
    private List<IBalloonContribution> getContributions() {
        if (contributions == null) {
            // FIXME not supported currently
            // contributions = DynamicMenuContributions.INSTANCE.getBalloonContributions();
        }
        return contributions;
    }

    /**
     * Checks if this edit policy provides an operation.
     * 
     * @param operation
     *            The operation to check.
     * @return True if this edit policy provides the given operation
     */
    public boolean provides(final IOperation operation) {
        return true;
        // return operation instanceof CreateEditPoliciesOperation;
    }
    
}
