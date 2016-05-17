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

/**
 * An Exception class used by the {@link Language#fromExtension(String extension) } method.
 * 
 * @author nfl
 */
public class LanguageException extends Exception {

    private static final long serialVersionUID = -6961053620099419662L;

    /**
     * The constructor for a LanguageException object.
     */
    public LanguageException(String message) {
        super(message);
    }
}
