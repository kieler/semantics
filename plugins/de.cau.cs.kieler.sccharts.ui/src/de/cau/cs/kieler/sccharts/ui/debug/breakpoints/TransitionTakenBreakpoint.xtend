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

import de.cau.cs.kieler.sccharts.Transition
import org.eclipse.core.resources.IResource
import java.util.Map
import org.eclipse.debug.core.DebugException

/**
 * Breakpoint that is triggered whenever a transition is taken.
 * If the breakpoint should also be triggered when the guard is evaluated to false
 * (i.e. the transition is checked, but not taken), @link{TransitionCheckBreakpoint}s should be used.
 * 
 * @author peu
 */
class TransitionTakenBreakpoint extends TransitionBreakpoint {
    
    public static val String TRANSITION_TAKEN_BREAKPOINT = "de.cau.cs.kieler.sccharts.ui.transitionTakenMarker"
    
    new() {
    }
    
    new(IResource resource, String typeName,
            int lineNumber, int charStart, int charEnd, int hitCount,
            boolean add, Map<String, Object> attributes, Transition transition) throws DebugException {
        super(resource, typeName, lineNumber, charStart, charEnd, hitCount, add,
                attributes, TRANSITION_TAKEN_BREAKPOINT, transition);
    }
}