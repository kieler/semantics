/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2011 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.core.model.xtend.m2m;

import java.util.Map;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.xtend.XtendFacade;
import org.eclipse.xtend.expression.Variable;

import de.cau.cs.kieler.core.model.effects.TransformationEffect;
import de.cau.cs.kieler.core.model.m2m.ITransformationContext;
import de.cau.cs.kieler.core.model.m2m.TransformationDescriptor;
import de.cau.cs.kieler.core.model.xtend.util.XtendTransformationUtil;

/**
 * Xtend implementation of an {@link TransformationEffect}.
 * 
 * @author uru
 * @kieler.rating 2011-02-14 green
 *      review by msp, haf
 */
public class XtendTransformationEffect extends TransformationEffect {

    /**
     * @param context
     *            {@link ITransformationContext} containing all necessary information in order to
     *            execute the transformation.
     * @param descriptor
     *            The transformation's {@link TransformationDescriptor}
     */
    public XtendTransformationEffect(final ITransformationContext context,
            final TransformationDescriptor descriptor) {
        super(context, descriptor);
    }

    /**
     * @param extentionFile
     *            the path to the file containing the extensions.
     * @param basePackages
     *            all meta models that are required to execute this transformation.
     * @param transformationName
     *            the name of the transformation that should be executed
     * @param parameters
     *            an array of the parameters that should be passed to the transformation
     * @param theEditingDomain
     *            {@link TransactionalEditingDomain} in which the transformation should be executed.
     *            May be {@code null}.
     * @param globalVars
     *            A {@link Map<String, Variable>} containing global variables. May be {@code null}.
     */
    public XtendTransformationEffect(final String extentionFile, final String[] basePackages,
            final String transformationName, final Object[] parameters,
            final TransactionalEditingDomain theEditingDomain,
            final Map<String, Variable> globalVars) {

        // initialize a facade, the constructor and a descriptor
        XtendFacade facade = XtendTransformationUtil.initializeFacade(extentionFile, basePackages,
                globalVars);
        XtendTransformationContext context = new XtendTransformationContext(facade,
                theEditingDomain);
        TransformationDescriptor descriptor = new TransformationDescriptor(transformationName,
                parameters);
        setContext(context);
        setDescriptor(descriptor);

    }
}
