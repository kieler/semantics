/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2016 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.comparison.core;

import java.util.ArrayList;
import java.util.Collection;

/**
 * This class is used to store all known properties used by compilers or test cases.
 * 
 * @author nfl
 */
public abstract class LanguageProperties {

    /**
     * The String representing the cyclic property.
     */
    public static final String CYCLIC = "CYCLIC";

    /**
     * The String representing the acyclic property.
     */
    public static final String ACYCLIC = "ACYCLIC";

    /**
     * The String representing the reactive property.
     */
    public static final String REACTIVE = "REACTIVE";

    /**
     * The String representing the deterministic property.
     */
    public static final String DETERMINISTIC = "DETERMINISTIC";

    /**
     * The String representing the logically correct property.
     */
    public static final String LOGICALLY_CORRECT = "LOGICAL-CORRECT";

    /**
     * The String representing the constructive property.
     */
    public static final String CONSTRUCTIVE = "CONSTRUCTIVE";

    /**
     * The String representing the non constructive property.
     */
    public static final String NON_CONSTRUCTIVE = "NON-CONSTRUCTIVE";

    /**
     * The String representing the sequentially constructive property.
     */
    public static final String SEQUENTIALLY_CONSTRUCTIVE = "SEQUENTIAL-CONSTRUCTIVE";

    /**
     * The String representing the pure property.
     */
    public static final String PURE = "PURE";

    /**
     * The String representing the valued property.
     */
    public static final String VALUED = "VALUED";

    /**
     * This static method can be used to get a collection of properties, which are used by compilers
     * or test cases in the comparison framework.
     * 
     * @return a collection of properties represented as Strings
     */
    public static Collection<String> getAllProperties() {
        ArrayList<String> ret = new ArrayList<String>();
        ret.add(CYCLIC);
        ret.add(ACYCLIC);
        ret.add(REACTIVE);
        ret.add(DETERMINISTIC);
        ret.add(LOGICALLY_CORRECT);
        ret.add(CONSTRUCTIVE);
        ret.add(SEQUENTIALLY_CONSTRUCTIVE);
        ret.add(PURE);
        ret.add(VALUED);

        // TODO maybe add extension point?

        return ret;
    }
}
