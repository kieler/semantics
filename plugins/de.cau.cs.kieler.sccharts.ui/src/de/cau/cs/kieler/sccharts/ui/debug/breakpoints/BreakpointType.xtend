/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.ui.debug.breakpoints

/** 
 * Enum to differentiate between the different types of breakpoints used.
 * @author stu121235
 */
enum BreakpointType {
    /**
     * Is triggered whenever the associated transition's guard is checked (not necessarily taken).
     * The edge will be highlighted in the diagram to show this.
     */
    TRANSITION_CHECK_BREAKPOINT,
    
    /**
     * Is triggered whenever the associated transition is taken.
     * The edge will be highlighted in the diagram to show this.
     */
    TRANSITION_TAKEN_BREAKPOINT,
    
    /**
     * Is triggered whenever the associated state is entered.
     * Staying within the same state should not trigger the breakpoint multiple times.
     */
    STATE_BREAKPOINT,
    
    /**
     * Used to determine whether a transition has been taken.
     * This is necessary to re-enable state breakpoints whenever a state is left.
     * The execution does NOT suspend on these breakpoints.
     */
    TRANSITION_WATCH_BREAKPOINT
}
