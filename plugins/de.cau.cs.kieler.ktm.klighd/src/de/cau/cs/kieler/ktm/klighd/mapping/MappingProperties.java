/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.ktm.klighd.mapping;

import de.cau.cs.kieler.core.properties.IProperty;
import de.cau.cs.kieler.core.properties.Property;

/**
 * Contains Properties for marking diagram elements.
 * 
 * @author als
 * 
 */
public final class MappingProperties {

    /**
     * Privates constructor to prevent instantiation.
     */
    private MappingProperties() {
    }

    /**
     * Marks a edge as an mapping edges.
     */
    public static final IProperty<Boolean> IS_MAPPING_EDGE = new Property<Boolean>(
            "de.cau.cs.kieler.ktm.mappingedge", false);
    

    /**
     * Marks a style as highlighting.
     */
    public static final IProperty<Boolean> SELECTED_NODE_HIGHLIGHTING = new Property<Boolean>(
            "de.cau.cs.kieler.ktm.klighd.SelectionHighlighting", false);
}
