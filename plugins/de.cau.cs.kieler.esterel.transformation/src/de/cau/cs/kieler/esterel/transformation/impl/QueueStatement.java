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

import java.util.LinkedList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;

import de.cau.cs.kieler.esterel.transformation.core.AbstractTransformationStatement;
import de.cau.cs.kieler.synccharts.State;

/**
 * Class represents a queue statement used to store a transformation and an according module within
 * the queue.
 * 
 * @author uru
 */
public class QueueStatement extends AbstractTransformationStatement {

    private String transformation;
    private State state;
    private Object estElement;

    private LinkedList<QueueStatement> children;

    /**
     * @param trans
     *            the name of the transformation to be run
     * @param theState
     *            syncchartselement
     * @param theEstElement
     *            esterel element
     * 
     */
    public QueueStatement(final String trans, final State theState, final Object theEstElement) {
        this.transformation = trans;
        this.state = theState;
        this.estElement = theEstElement;
        children = new LinkedList<QueueStatement>();
    }

    /**
     * /** {@inheritDoc}
     */
    public Object[] getParameters() {
        return new Object[] { state, estElement };
    }

    /**
     * {@inheritDoc}
     */
    public String getTransformationName() {
        return transformation;
    }

    /**
     * @return the syncElement
     */
    public State getState() {
        return state;
    }

    /**
     * @return the children
     */
    public LinkedList<QueueStatement> getChildren() {
        return children;
    }
}
