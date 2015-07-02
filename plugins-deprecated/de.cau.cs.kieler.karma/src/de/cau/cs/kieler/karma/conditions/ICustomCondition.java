/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */

package de.cau.cs.kieler.karma.conditions;


/**
 * Interface for conditions that can be used with an extension point.
 * 
 * @author ckru
 * @kieler.design proposed by msp
 * @kieler.rating proposed yellow by msp
 * @param <T> the type for which the condition is used
 */
public abstract class ICustomCondition<T> implements ICondition<T> {
    
    /**
     * Key for referencing the annotation.
     */
    // No gain in using getter here. 
    // SUPPRESS CHECKSTYLE NEXT Visibility Modifier
    protected String key;

    /**
     * Desired value of the annotation.
     */
    // SUPPRESS CHECKSTYLE NEXT Visibility Modifier
    protected String value;

    /**
     * Feed the condition with some initial values because extension points support only the
     * standard constructor.
     * 
     * @param thekey
     *            a key for referencing something.
     * @param thevalue
     *            the value the condition could evaluate for.
     */
    public void initialize(final String thekey, final String thevalue) {
        key = thekey;
        value = thevalue;
    }

}
