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

import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.AbstractEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.notation.View;

import de.cau.cs.kieler.ksbase.core.Messages;

/**
 * Edit policy used to execute a specific transformation. This edit policy creates a
 * {@link TransformationCommand} to execute the transformation.
 * 
 * @author mim
 */
public class ExecuteTransformationEditPolicy extends AbstractEditPolicy {

    /**
     * Checks if a given request is understood from this editPolicy.
     * 
     * @param req
     *            The request to check.
     * @return True if this editPolicy can handle the given request.
     * @see org.eclipse.gef.editpolicies.AbstractEditPolicy#understandsRequest(org.eclipse.gef.Request)
     */
    @Override
    public boolean understandsRequest(final Request req) {
        return (ExecuteTransformationRequest.REQ_EXEC_TRANS).equals(req.getType());
    }

    /**
     * Creates a transformation command for every valid request.
     * 
     * @param req
     *            The request to fulfill
     * @return An @link TransformationCommand if the request parameter is an @link
     *         ExecuteTransformationRequest.
     * 
     * @see org.eclipse.gef.editpolicies.AbstractEditPolicy#getCommand(org.eclipse.gef.Request)
     */
    @Override
    public Command getCommand(final Request req) {
        if (ExecuteTransformationRequest.REQ_EXEC_TRANS.equals(req.getType())) {
            if (req instanceof ExecuteTransformationRequest) {
                ExecuteTransformationRequest transformationRequest = (ExecuteTransformationRequest) req;
                IGraphicalEditPart hostEPart = (IGraphicalEditPart) getHost();
                TransformationCommand command = new TransformationCommand(hostEPart
                        .getEditingDomain(),
                        Messages.executeTransformationEditPolicyTransformationCommandName,
                        new EObjectAdapter((View) hostEPart.getModel()));
                command.initialize(transformationRequest.getEditPart(), transformationRequest
                        .getSelection(), transformationRequest.getCommand(), transformationRequest
                        .getFileName(), transformationRequest.getModelPackages(),
                        transformationRequest.getFramework());
                return new ICommandProxy(command);
            } else {
                return null;
            }
        } else {
            return super.getCommand(req);
        }
    }
}
