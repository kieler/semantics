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
 * 
 *****************************************************************************/
package de.cau.cs.kieler.core.ui.policies;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DescriptionCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.NoteEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.internal.editparts.NoteAttachmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.services.editpolicy.IEditPolicyProvider;

/**
 * Provides an edit policy to create popup balloons.
 * 
 * @author soh
 * @kieler.rating 2009-02-23 proposed yellow
 */
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
            try {
                if (getContributions() != null) {
                    BalloonPopupBarEditPolicy policy = new BalloonPopupBarEditPolicy(
                            getContributions(), editPart);
                    policy.setHost(editPart);
                    editPart.installEditPolicy(EditPolicyRoles.POPUPBAR_ROLE,
                            policy);
                    policy.activate();
                }
            } catch (RuntimeException e0) {
                e0.printStackTrace();
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
    @SuppressWarnings("restriction")
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
     * 
     * @return
     */
    private List<IBalloonContribution> getContributions() {
        if (contributions == null) {
            IConfigurationElement[] contributors = Platform
                    .getExtensionRegistry()
                    .getConfigurationElementsFor(
                            "de.cau.cs.kieler.core.ui.balloonPopupBarContribution");

            if (contributors != null && contributors.length > 0) {
                contributions = new LinkedList<IBalloonContribution>();

                for (IConfigurationElement contributor : contributors) {
                    if (contributor.isValid()) {
                        try {
                            Object o = contributor
                                    .createExecutableExtension("class");

                            if (o instanceof IBalloonContribution) {
                                IBalloonContribution con = (IBalloonContribution) o;
                                contributions.add(con);

                                IConfigurationElement[] children = contributor
                                        .getChildren();

                                if (children != null && children.length > 0) {
                                    HashMap<String, String> map = new HashMap<String, String>();

                                    for (IConfigurationElement child : children) {
                                        String key = child.getAttribute("key");
                                        String value = child
                                                .getAttribute("value");

                                        map.put(key, value);

                                    }
                                    con.setAttributes(map);
                                }
                            }
                        } catch (CoreException e0) {
                            e0.printStackTrace();
                        }
                    }
                }
            }
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
