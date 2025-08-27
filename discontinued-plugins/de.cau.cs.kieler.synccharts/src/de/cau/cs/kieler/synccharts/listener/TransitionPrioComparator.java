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
package de.cau.cs.kieler.synccharts.listener;

import java.util.Comparator;

import de.cau.cs.kieler.synccharts.Transition;

/**
 * A Comparator class that compares Transitions according to their priorities.
 * Can be used to sort a list of Transitions by priority, e.g. by the call
 * Collections.sort(list, new TransitionPrioComparator())
 * 
 * @author haf
 * @kieler.ignore (excluded from review process)
 */
public class TransitionPrioComparator implements Comparator<Transition> {

    /** {@inheritDoc} **/
    public int compare(final Transition t1, final Transition t2) {
        return t1.getPriority() - t2.getPriority();
    }

}
