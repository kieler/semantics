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
package de.cau.cs.kieler.kies.transformation.core.kivi;

import java.util.Map;
import java.util.concurrent.Semaphore;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.xtend.XtendFacade;
import org.eclipse.xtend.expression.Variable;

import de.cau.cs.kieler.core.kivi.AbstractEffect;
import de.cau.cs.kieler.kies.transformation.core.TransformationContext;
import de.cau.cs.kieler.kies.transformation.core.TransformationDescriptor;
import de.cau.cs.kieler.kies.transformation.impl.XtendTransformationContext;
import de.cau.cs.kieler.kies.transformation.util.TransformationUtil;

/**
 * @author uru
 * 
 */
public class TransformationEffect extends AbstractEffect {

    private TransformationContext context;
    private Object result;

    /**
     * @param theContext
     *            {@link TransformationContext} containing all necessary information in order to
     *            execute the transformation.
     */
    public TransformationEffect(final TransformationContext theContext) {
        this.context = theContext;
    }

    /**
     * Constructor.
     * 
     * @param extentionFile
     *            the path to the file containing the extensions.
     * @param basePackages
     *            all meta models that are required to execute this transformation.
     * @param theDescriptor
     *            {@link TransformationDescriptor} containing the name of the transformation to be
     *            executed and all parameters which should be passed.
     * @param theEditingDomain
     *            {@link TransactionalEditingDomain} in which the transformation should be executed.
     */
    public TransformationEffect(final String extentionFile, final String[] basePackages,
            final TransformationDescriptor theDescriptor,
            final TransactionalEditingDomain theEditingDomain) {
        this(extentionFile, basePackages, theDescriptor, theEditingDomain, null, null);
    }

    /**
     * Constructor.
     * 
     * @param extentionFile
     *            the path to the file containing the extensions.
     * @param basePackages
     *            all meta models that are required to execute this transformation.
     * @param theDescriptor
     *            {@link TransformationDescriptor} containing the name of the transformation to be
     *            executed and all parameters which should be passed.
     * @param theEditingDomain
     *            {@link TransactionalEditingDomain} in which the transformation should be executed.
     * @param lock
     *            A semaphore that is released as soon as the transformation was executed.
     */
    public TransformationEffect(final String extentionFile, final String[] basePackages,
            final TransformationDescriptor theDescriptor,
            final TransactionalEditingDomain theEditingDomain, final Semaphore lock) {
        this(extentionFile, basePackages, theDescriptor, theEditingDomain, null, lock);
    }

    /**
     * Constructor.
     * 
     * @param extentionFile
     *            the path to the file containing the extensions.
     * @param basePackages
     *            all meta models that are required to execute this transformation.
     * @param theDescriptor
     *            {@link TransformationDescriptor} containing the name of the transformation to be
     *            executed and all parameters which should be passed.
     * @param theEditingDomain
     *            {@link TransactionalEditingDomain} in which the transformation should be executed.
     * @param globalVars
     *            A {@link Map<String, Variable>} containing global variables.
     */
    public TransformationEffect(final String extentionFile, final String[] basePackages,
            final TransformationDescriptor theDescriptor,
            final TransactionalEditingDomain theEditingDomain,
            final Map<String, Variable> globalVars) {
        this(extentionFile, basePackages, theDescriptor, theEditingDomain, globalVars, null);
    }

    /**
     * Constructor.
     * 
     * @param extentionFile
     *            the path to the file containing the extensions.
     * @param basePackages
     *            all meta models that are required to execute this transformation.
     * @param theDescriptor
     *            {@link TransformationDescriptor} containing the name of the transformation to be
     *            executed and all parameters which should be passed.
     * @param theEditingDomain
     *            {@link TransactionalEditingDomain} in which the transformation should be executed.
     * @param globalVars
     *            A {@link Map<String, Variable>} containing global variables.
     * @param lock
     *            A semaphore that is released as soon as the transformation was executed.
     */
    public TransformationEffect(final String extentionFile, final String[] basePackages,
            final TransformationDescriptor theDescriptor,
            final TransactionalEditingDomain theEditingDomain,
            final Map<String, Variable> globalVars, final Semaphore lock) {

        XtendFacade facade = TransformationUtil.initializeFacade(extentionFile, basePackages,
                globalVars);
        this.context = new XtendTransformationContext(facade, theDescriptor, theEditingDomain, lock);
    }

    /**
     * {@inheritDoc}
     */
    public void execute() {
        // execute the transformation
        context.executeCurrent();
        // retrieve result
        result = context.getLastResult();
    }

    /**
     * @return the result
     */
    public Object getResult() {
        return result;
    }
}
