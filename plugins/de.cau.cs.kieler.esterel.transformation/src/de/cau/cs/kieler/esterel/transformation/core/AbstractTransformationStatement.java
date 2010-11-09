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
package de.cau.cs.kieler.esterel.transformation.core;

import org.eclipse.emf.ecore.EObject;

/**
 * Wrapperkind class containing a name of a Xtend transformation and the parameters to pass.
 * 
 * @author uru
 */
public abstract class AbstractTransformationStatement {

    private boolean done = false;

    /**
     * @return the parameters being passed to the transformation.
     */
    public abstract Object[] getParameters();

    /**
     * @return the name of the transformation to be executed.
     */
    public abstract String getTransformationName();

    /**
     * @return the done
     */
    public boolean isDone() {
        return done;
    }

    /**
     * @param nowDone
     *            is this statement done?
     */
    public void setDone(final boolean nowDone) {
        this.done = nowDone;
    }

}
