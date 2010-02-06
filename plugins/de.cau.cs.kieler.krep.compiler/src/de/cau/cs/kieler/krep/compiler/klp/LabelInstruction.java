/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.krep.compiler.klp;

import java.util.HashMap;

import de.cau.cs.kieler.krep.compiler.util.Debug;

/**
 * Label in the assembler code. Connects names and actual addresses.
 * 
 * @kieler.rating 2010-02-05 yellow 
 *   review by cmot, msp, tam
 * 
 * @author ctr
 * 
 */
public final class LabelInstruction extends AbstractInstruction {

    private static HashMap<String, LabelInstruction> labels = new HashMap<String, LabelInstruction>();

    private String label;

    /**
     * 
     * @param name
     *            unique identifier of the label
     */
    private LabelInstruction(final String name) {
        label = name;
    }

    /**
     * @param name
     *            of the label
     * @return Label with this name, if it exists, null otherwise
     */
    public static LabelInstruction get(final String name) {
        LabelInstruction l = labels.get(name);
        if (l == null) {
            l = new LabelInstruction(name);
            labels.put(name, l);
            Debug.low("define label " + name);
        } else {
            Debug.low("get label " + name);
        }
        return labels.get(name);
    }

    @Override
    public String toString() {
        return getName() + ": "; // (" + pos + ")";
    }

    /**
     * @return name of the label
     */
    public String getName() {
        return "L_" + label;
    }
}
