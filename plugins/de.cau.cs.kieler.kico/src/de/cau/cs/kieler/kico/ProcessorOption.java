/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kico;


/**
 * An processor option item as a pair of a processor ID combined with a boolean indicating if this
 * processor is optional (for the defined transformation) or not.
 * 
 * @author cmot
 * @kieler.design 2014-03-11 proposed
 * @kieler.rating 2014-03-11 proposed yellow
 * 
 */
class ProcessorOption {

    private String id;
    private boolean optional;

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new processor option.
     *
     * @param id the id
     * @param optional the optional
     */
    public ProcessorOption(String id, boolean optional) {
        this.id = id;
        this.optional = optional;
    }

    // -------------------------------------------------------------------------

    /**
     * The identifier of the processor id.
     * 
     * @return the string
     */
    public String getId() {
        return id;
    }

    // -------------------------------------------------------------------------

    /**
     * Returns whether the processor is optional. 
     *
     * @return true, if is optional
     */
    public boolean isOptional() {
        return optional;
    }

    // -------------------------------------------------------------------------
}
