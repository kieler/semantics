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
package de.cau.cs.kieler.sim.esi;

import org.eclipse.emf.ecore.EObject;

/**
 * Implementation of a signal, which has a name, as status and an optional value. A signal does not
 * have a status: a signal that exists is present.
 * 
 * @author ctr
 * 
 */
public class EsiSignal implements ISignal {
    private String name;
    private Object value = null;

    /**
     * Generate pure signal
     * 
     * @param theName
     *            name of the signal
     */
    public EsiSignal(String theName) {
        name = theName;
    }

    /**
     * Generate valued signal.
     * 
     * @param theName
     *            name of the signal
     * @param theValue
     *            value of the signal.
     */
    public EsiSignal(String theName, Object theValue) {
        name = theName;
        value = theValue;
    }

    /**
     * {@inheritDoc}
     */
    public Object getValue() {
        return value;
    }

    /**
     * {@inheritDoc}
     */
    public String getName() {
        return name;
    }

    /**
     * {@inheritDoc}
     */
    public boolean isValued() {
        return value != null;
    }
}
