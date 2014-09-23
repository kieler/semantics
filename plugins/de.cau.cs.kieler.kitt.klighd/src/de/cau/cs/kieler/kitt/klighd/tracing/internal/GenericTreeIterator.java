/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kitt.klighd.tracing.internal;

import java.util.Iterator;

import org.eclipse.emf.common.util.AbstractTreeIterator;
import org.eclipse.xtext.xbase.lib.Functions.Function1;

/**
 * Generic Version of the EMF TreeIterator which uses a variable depthFunction to determine
 * iteration successors.
 * 
 * @author als
 * @kieler.design 2014-09-23 proposed
 * @kieler.rating 2014-09-23 proposed yellow
 */
public class GenericTreeIterator<E> extends AbstractTreeIterator<E> {
    private static final long serialVersionUID = 1L;

    /** successor function */
    private final Function1<Object, Iterator<E>> depthFunction;

    public GenericTreeIterator(E object, boolean includeRoot,
            Function1<Object, Iterator<E>> depthFunction) {
        super(object, includeRoot);
        this.depthFunction = depthFunction;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Iterator<? extends E> getChildren(Object object) {
        return depthFunction.apply(object);
    }

}
