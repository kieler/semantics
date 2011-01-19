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
package de.cau.cs.kieler.kies.transformation.core;

import java.util.Collection;
import java.util.Vector;

import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.xtend.XtendFacade;

/**
 * @author uru
 * 
 */
public class TransformationCommand extends RecordingCommand {

    private XtendFacade xtendFacade;
    private TransformationDescriptor descriptor;

    private Collection<Object> result;

    /**
     * 
     * @param xtendFacade
     * @param theDescriptor
     * @param editingDomain
     */
    public TransformationCommand(final XtendFacade xtendFacade,
            final TransformationDescriptor theDescriptor,
            final TransactionalEditingDomain editingDomain) {
        super(editingDomain);
        this.xtendFacade = xtendFacade;
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
     * {@inheritDoc}
     */
    @Override
    public Collection<Object> getResult() {
        return result;
    }

}
