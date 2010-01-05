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
 * Comment inside the klp program.
 * 
 * @kieler.rating 2010-01-05 proposed yellow ctr
 * 
 * @author ctr
 * 
 */
public class Comment extends Instruction {

    private String comment;
    
    /**
     * @param com to add for this program part.
     */
    public Comment(final String com) {
        this.comment = com;
    }

    @Override
    public String toString() {
        return "";
    }

    @Override
    public String getComment() {
        return "# " + comment;
    }

}
