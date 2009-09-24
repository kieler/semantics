package de.cau.cs.kieler.krep.evalbench.trace;

/**
 * distinguishes the kinds of signal that are stored in a trace
 * @author ctr
 *
 */
public enum IO {
    /**
     * Input signals
     */
    INPUT,
    /**
     * Output signals
     */
    OUTPUT,
    /**
     * Reference value for output signals
     */
    SAVED_OUTPUT
}
