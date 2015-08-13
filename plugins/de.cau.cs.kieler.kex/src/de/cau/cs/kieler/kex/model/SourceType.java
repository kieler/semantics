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
package de.cau.cs.kieler.kex.model;

/**
 * Sourcetype describes the backend of kex. KIELER means examples by kieler developers that will be
 * saved in plugin projects and PUBLIC means examples by every user of kieler which will be saved by
 * the online interface, here database.
 * 
 * @author pkl
 * 
 */
public enum SourceType {
    /**
     * examples are creatable by KIELER developer, or PUBLIC users (,but not yet).
     */
    KIELER, PUBLIC;

    /**
     * Gets the name of a source type.
     * 
     * @param type
     *            , {@link SourceType}
     * @return {@link String}
     */
    public static String map(final SourceType type) {
        switch (type) {
        case KIELER:
            return "Kieler";
        case PUBLIC:
            return "Public";
        }
        return null;
    }
}
