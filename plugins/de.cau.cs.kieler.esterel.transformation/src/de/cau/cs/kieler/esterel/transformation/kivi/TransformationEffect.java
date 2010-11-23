/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.esterel.transformation.kivi;

import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.ui.PlatformUI;
import org.eclipse.xtend.XtendFacade;

import de.cau.cs.kieler.core.kivi.AbstractEffect;
import de.cau.cs.kieler.esterel.transformation.core.TransformationCommand;

/**
 * @author uru
 * 
 */
public class TransformationEffect extends AbstractEffect {

    private XtendFacade xtendFacade;
    private Object[] parameters;
    private String transformationName;
    private TransactionalEditingDomain editingDomain;

    /**
     * Default constructor.
     * 
     * @param facade
     *            the XtendFacade responsible for calling the transformation.
     * @param theTransformationName
     *            name of the transformation to run.
     * @param theParameters
     *            parameters to pass.
     * @param theEditingDomain
     *            editing domain in which the transformation should be performed.
     */
    public TransformationEffect(final XtendFacade facade, final String theTransformationName,
            final Object[] theParameters, final TransactionalEditingDomain theEditingDomain) {
        super();
        this.parameters = theParameters;
        this.transformationName = theTransformationName;
        this.xtendFacade = facade;
        this.editingDomain = theEditingDomain;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void undo() {
        System.out.println("TransformEffect undo");
        super.undo();
    }

    /**
     * {@inheritDoc}
     */
    public void execute() {

        // FIXME workaround to avoid deadlock with FireOnceTriggerListener
        PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {

            public void run() {
                TransformationCommand command = new TransformationCommand(xtendFacade, parameters,
                        transformationName, editingDomain);
                CommandStack stack = editingDomain.getCommandStack();
                stack.execute(command);

            }
        });

    }

}
