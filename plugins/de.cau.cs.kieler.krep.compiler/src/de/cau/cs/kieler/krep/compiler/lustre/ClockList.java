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
package de.cau.cs.kieler.krep.compiler.lustre;

import java.util.Iterator;
import java.util.LinkedList;

import de.cau.cs.kieler.krep.compiler.exceptions.ClockException;

/**
 * List of clocks according to Lustre clock calculus.
 * 
 * @kieler.rating 2010-02-05 yellow 
 *   review by cmot, msp, tam
 * 
 * @author ctr
 */
public class ClockList implements Cloneable {
    private LinkedList<String> clocks = new LinkedList<String>();

    /**
     * @param clock
     *            additional clock
     */
    public void addClock(final String clock) {
        clocks.addFirst(clock);
    }

    /**
     * remove outermost clock.
     * 
     * @throws ClockException
     *             if no clock can be removed
     */
    public void removeClock() throws ClockException {
        if (clocks.isEmpty()) {
            throw new ClockException(null, null, null);
        }
        clocks.removeFirst();
    }

    /**
     * @return actual clock that is used
     */
    public String getClock() {
        if (clocks.isEmpty()) {
            return null;
        } else {
            return clocks.getFirst();
        }
    }

    @Override
    public ClockList clone() {
        try {
            super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        ClockList res = new ClockList();
        for (String c : clocks) {
            res.clocks.add(c);
        }
        return res;
    }

    @Override
    public int hashCode() {
        assert false : "hashCode not designed";
        return 0; // any arbitrary constant will do
    }

    /**
     * @param o
     *            list of clocks to compare to
     * @return true if both lists are syntactically identical
     */
    @Override
    public boolean equals(final Object o) {
        if (!(o instanceof ClockList)) {
            return false;
        }
        final ClockList l = (ClockList) o;
        if (clocks.size() != l.clocks.size()) {
            return false;
        }
        Iterator<String> i = l.clocks.iterator();
        for (String s : clocks) {
            if (!s.equals(i.next())) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuffer res = new StringBuffer("[");

        Iterator<String> i = clocks.iterator();
        if (i.hasNext()) {
            res.append(i.next());
            while (i.hasNext()) {
                res.append(", " + i.next());
            }
        }
        res.append("]");
        return res.toString();

    }

    /**
     * @return true if the clocklist is empty, ie, it runs on the base clock
     */
    public boolean isBase() {
        return clocks.isEmpty();
    }
}
