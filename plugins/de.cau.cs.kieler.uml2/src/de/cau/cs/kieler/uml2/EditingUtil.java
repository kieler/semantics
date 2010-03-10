/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.uml2;

import org.eclipse.uml2.uml.NamedElement;

/**
 * Utility class for structure-based editing of the UML metamodel.
 * 
 * @author msp
 */
public final class EditingUtil {

    /**
     * Set the name of a named element. This is a workaround for Xtend cannot handle
     * attributes of type {@code String}, but only {@code EString}.
     * 
     * @param namedElement the named element to rename
     * @param name the new name
     */
    public static void setName(final NamedElement namedElement, final String name) {
        namedElement.setName(name);
    }
    
}
