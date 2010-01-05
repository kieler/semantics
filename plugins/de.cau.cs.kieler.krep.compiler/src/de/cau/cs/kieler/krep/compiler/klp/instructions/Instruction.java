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
package de.cau.cs.kieler.krep.compiler.klp.instructions;

/**
 * Abstract superclass for all KLP assembler instructions.
 * 
 * @kieler.rating 2010-01-05 proposed yellow ctr
 * 
 * @author ctr
 */
public abstract class Instruction {

    private String comment;

    @Override
    public abstract String toString();

    /**
     * 
     * @param c comment fot this instruction
     */
    public void setComment(final String c) {
        comment = c;
    }

    /**
     * 
     * @return comment for this instructions
     */
    public String getComment() {
        if (comment == null) {
            return "";
        } else {
            return "\t# " + comment;
        }
    }

}
