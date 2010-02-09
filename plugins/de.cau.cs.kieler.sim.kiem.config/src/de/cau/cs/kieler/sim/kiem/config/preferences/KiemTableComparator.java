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
package de.cau.cs.kieler.sim.kiem.config.preferences;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerComparator;

import de.cau.cs.kieler.sim.kiem.properties.KiemProperty;

/**
 * Compares two KIEMProperty objects and determines which one should be
 * displayed first based on the key of the property.
 * 
 * @author soh
 * @kieler.rating 2010-01-27 proposed yellow
 */
public class KiemTableComparator extends ViewerComparator {

    /**
     * {@inheritDoc}
     */
    @Override
    public final int compare(final Viewer viewer, final Object e1,
            final Object e2) {
        String name1 = "";
        String name2 = "";

        if (e1 != null && e1 instanceof KiemProperty) {
            name1 = ((KiemProperty) e1).getKey();
        }

        if (e2 != null && e2 instanceof KiemProperty) {
            name2 = ((KiemProperty) e2).getKey();
        }

        // use the String comparator to compare the two keys
        return name1.compareTo(name2);
    }
}
