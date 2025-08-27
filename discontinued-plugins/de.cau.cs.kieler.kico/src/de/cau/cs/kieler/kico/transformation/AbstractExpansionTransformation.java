/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kico.transformation;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;

import com.google.common.collect.Lists;

import de.cau.cs.kieler.kico.KielerCompilerContext;

/**
 * An abstract production transformation implementing some methods with default values.
 * 
 * @author als
 * @kieler.design 2015-05-11 proposed
 * @kieler.rating 2015-05-11 proposed yellow
 * 
 */
public abstract class AbstractExpansionTransformation implements IExpansionTransformation {

    /**
     * {@inheritDoc}
     */
    public String getName() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    public List<ProcessorOption> getProcessorOptions() {
        return Lists.newArrayList();
    }

    /**
     * {@inheritDoc}
     */
    public boolean isInplace() {
        return true;
    }

    /**
     * {@inheritDoc}
     */
    public Set<String> getProducesFeatureIds() {
        return Collections.emptySet();
    }

    /**
     * {@inheritDoc}
     */
    public Set<String> getNotHandlesFeatureIds() {
        return Collections.emptySet();
    }

    /**
     * The transform method can be overridden by a transformation to simplify the transformation
     * definition. the default processor option (which by default is the only processor option in
     * the list of processor options) refers to this transform() method. Other processor options may
     * be added before and after this transform method. Note: If the default processor option is
     * removed this transform() method may not be considered. It is mainly a design decision choice
     * if a transformation should only be build from re-usable processors or also carry a
     * main-processor (represented by the default processor option). This method should not be
     * called directly!
     * 
     * @param eObject
     *            the e object
     * @param context
     *            the context
     * @return the object
     * 
     */
    public Object transform(final EObject eObject, final KielerCompilerContext context) {
        // Either this method is overridden, or the transform method (w/o a context)
        return transform(eObject);
    }

    /**
     * @see de.cau.cs.kieler.kico.transformation.AbstractExpansionTransformation#transform(EObject,
     *      KielerCompilerContext)
     */
    public Object transform(final EObject eObject) {
        return eObject;
    }

}
