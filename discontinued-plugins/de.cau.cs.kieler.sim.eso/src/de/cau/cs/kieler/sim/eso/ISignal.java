/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2011 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sim.eso;

/**
 * @author ssc
 * @kieler.design 2012-10-08 proposed cmot
 * @kieler.rating 2012-10-08 proposed yellow cmot
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
