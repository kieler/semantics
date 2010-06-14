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

package de.cau.cs.kieler.synccharts.contentadapter;

import java.util.Comparator;

import de.cau.cs.kieler.synccharts.Transition;

/**
 * A Comparator class that compares Transitions according to their priorities.
 * Can be used to sort a list of Transitions by priority, e.g. by the call
 * Collections.sort(list, new TransitionPrioComparator())
 * 
 * @author haf
 * 
 * @kieler.rating 2010-01-19 proposed yellow proposed by haf
 */
public class TransitionPrioComparator implements Comparator<Transition> {

    /** {@inheritDoc} **/
    public int compare(final Transition t1, final Transition t2) {
        if (t1.getPriority() < t2.getPriority()) {
            return -1;
        } else if (t1.getPriority() == t2.getPriority()) {
            return 0;
        } else {
            return 1;
        }
    }

}
