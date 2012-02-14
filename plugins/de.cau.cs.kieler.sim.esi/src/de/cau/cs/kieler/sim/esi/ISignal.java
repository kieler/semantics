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
package de.cau.cs.kieler.sim.esi;

import org.eclipse.emf.ecore.EObject;

/**
 * @author ssc
 *
 */
public interface ISignal {

    /**
     * @return value of the signal
     */
    public Object getValue();

    /**
     * 
     * @return name of the signal
     */
    public String getName();

    /**
     * 
     * @return true if it is a valued signal.
     */
    public boolean isValued();

}
