package de.cau.cs.kieler.krep.compiler.lustre;

import java.util.Iterator;
import java.util.LinkedList;

import de.cau.cs.kieler.krep.compiler.exceptions.ClockException;


/**
 * @author ctr List of lcokcs according to Lustre clock calculus
 */
public class ClockList implements Cloneable {
    private LinkedList<String> clocks = new LinkedList<String>();

    /**
     * @param clock
     *            additional clock
     */
    public void addClock(String clock) {
	clocks.addFirst(clock);
    }

    /**
     * remove outermost clock
     * 
     * @throws ClockException
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
	ClockList res = new ClockList();
	for (String c : clocks) {
	    res.clocks.add(c);
	}
	return res;
    }

    @Override
    public int hashCode() {
	assert false : "hashCode not designed";
	return 42; // any arbitrary constant will do
    }

    /**
     * @param l
     *            list of clocks to compare to
     * @return true if both lists are syntactically identical
     */
    public boolean equals(final ClockList l) {
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
	String res = "[";

	Iterator<String> i = clocks.iterator();
	if (i.hasNext()) {
	    res += i.next();
	    while (i.hasNext()) {
		res += ", " + i.next();
	    }
	}
	res += "]";
	return res;

    }

    /**
     * @return true if the clocklist is empty, ie, it runs on the base clock
     */
    public boolean isBase() {
	return clocks.isEmpty();
    }
}
