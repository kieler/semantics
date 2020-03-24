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

import org.eclipse.core.resources.IResource
import java.util.Map
import org.eclipse.debug.core.DebugException
import de.cau.cs.kieler.sccharts.Transition

/**
 * Breakpoint that triggers each time a transition's guard is evaluated.
 * This happens regardless of whether the transition is actually taken.
 * If the breakpoint should only be triggered when the transition is in fact taken,
 * @link{TransitionTakenBreakpoint}s should be used.
 * 
 * @author peu
 */
class TransitionCheckBreakpoint extends TransitionBreakpoint {
    
    public static val String TRANSITION_CHECK_BREAKPOINT = "de.cau.cs.kieler.sccharts.ui.transitionCheckMarker"
    
    new() {
    }
    
    new(IResource resource, String typeName,
            int lineNumber, int charStart, int charEnd, int hitCount,
            boolean add, Map<String, Object> attributes, Transition transition) throws DebugException {
        super(resource, typeName, lineNumber, charStart, charEnd, hitCount, add,
                attributes, TRANSITION_CHECK_BREAKPOINT, transition);
    }
}