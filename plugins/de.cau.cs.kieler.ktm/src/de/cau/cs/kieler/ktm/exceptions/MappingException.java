/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.ktm.exceptions;

import org.eclipse.emf.ecore.EObject;

/**
 * Indicates a violation of relation constraints in mapping.
 * Constraints are:
 *   - Object mapped as child cannot be a parent in the same mapping and vice versa.
 * @author als
 * 
 */
public class MappingException extends Exception {

    private static final long serialVersionUID = 1973057419968069435L;

    private EObject object;

    public MappingException() {
    }

    /**
     * 
     * @param message
     */
    public MappingException(String message) {
        super(message);
    }

    /**
     * @param message
     * @param causativeObject - object caused mapping faliure
     */
    public MappingException(String message, EObject causativeObject) {
        super(message);
        object = causativeObject;
    }

    /**
     * @return the object
     */
    public EObject getCausativeObject() {
        return object;
    }

}
