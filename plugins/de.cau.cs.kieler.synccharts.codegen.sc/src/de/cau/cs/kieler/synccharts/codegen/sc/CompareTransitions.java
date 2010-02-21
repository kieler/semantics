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
 *
 *****************************************************************************/

package de.cau.cs.kieler.synccharts.codegen.sc;

import java.util.Comparator;

import de.cau.cs.kieler.synccharts.Transition;

/**
 * A simple Class to compare Transitions.
 * 
 * @author tam
 * 
 */
public class CompareTransitions implements Comparator<Transition> {

    public int compare(final Transition t1, final Transition t2) {
        int out = 0;
        if (t1.getPriority() < t2.getPriority()) {
            out = -1;
        } else if (t1.getPriority() > t2.getPriority()) {
            out = 1;
        }
        return out;
    }

}
