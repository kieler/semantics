/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.core.model.xtend.m2m;

import java.util.Collection;
import java.util.Vector;

import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.xtend.XtendFacade;

import de.cau.cs.kieler.core.model.m2m.TransformationDescriptor;

/**
 * A command executing an xtend transformation. To support undo functionality it's important that
 * this is a RecordingCommand. The result of the transformation is stored and can be retrieved after
 * execution.
 * 
 * @author uru
 * @kieler.rating 2011-02-14 proposed yellow uru
 */
public class XtendTransformationCommand extends RecordingCommand {

    private static final String COMMAND_NAME = "Xtend Transformation Command";

    private XtendFacade xtendFacade;
    private TransformationDescriptor descriptor;
    private Collection<Object> result = null;

    /**
     * @param theXtendFacade
     *            the facade used to execute the transformation
     * @param theDescriptor
     *            information about which transformation to execute
     * @param editingDomain
     *            {@link TransactionalEditingDomain} on which the transformation takes place.
     */
    public XtendTransformationCommand(final XtendFacade theXtendFacade,
            final TransformationDescriptor theDescriptor,
            final TransactionalEditingDomain editingDomain) {
        super(editingDomain, COMMAND_NAME);
        this.xtendFacade = theXtendFacade;
        this.descriptor = theDescriptor;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean canExecute() {
        return true;
    }

    @Override
    protected void doExecute() {
        Object o = xtendFacade.call(descriptor.getTransformationName(), descriptor.getParameters());
        result = new Vector<Object>(1);
        result.add(o);
    }

    /**
     * @return the result of the execution as first element of a collection. In case the execution
     *         has not been executed yet, {@code null} is returned.
     */
    @Override
    public Collection<Object> getResult() {
        return result;
    }

}
