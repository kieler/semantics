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
package de.cau.cs.kieler.esterel.transformation.impl;

import org.eclipse.emf.ecore.EObject;

import de.cau.cs.kieler.esterel.transformation.core.ITransformationStatement;

/**
 * Class represents a queue statement used to store a transformation and an according module within
 * the queue.
 * 
 * @author uru
 */
public class QueueStatement implements ITransformationStatement {

    private String transformation;
    private EObject syncElement;
    private EObject estElement;

    /**
     * @param trans
     *            the name of the transformation to be run
     * @param theSyncElement
     *            syncchartselement
     * @param theEstElement
     *            esterel element
     * 
     */
    public QueueStatement(final String trans, final EObject theSyncElement,
            final EObject theEstElement) {
        this.transformation = trans;
        this.syncElement = theSyncElement;
        this.estElement = theEstElement;
    }

    /**
     * /** {@inheritDoc}
     */
    public EObject[] getParameters() {
        return new EObject[] { syncElement, estElement };
    }

    /**
     * {@inheritDoc}
     */
    public String getTransformationName() {
        return transformation;
    }
}
