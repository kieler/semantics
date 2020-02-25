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
import de.cau.cs.kieler.sccharts.Transition
import org.eclipse.debug.core.DebugException

/**
 * Breakpoint that is triggered whenever a State's outgoing transition is taken.
 * This is to keep track of whether the state has been left between two breakpoint activations.
 * This breakpoint does not suspend when hit; If that is desired, @link{TransitionTakenBreakpoint}s should be used.
 * 
 * @author peu
 */
class TransitionWatchBreakpoint extends TransitionBreakpoint {
    
    public static val String TRANSITION_WATCH_BREAKPOINT = "de.cau.cs.kieler.sccharts.ui.transitionWatchMarker"
    
    new() {
    }
    
    new(IResource resource, String typeName,
            int lineNumber, int charStart, int charEnd, int hitCount,
            boolean add, Map<String, Object> attributes, Transition transition) throws DebugException {
        super(resource, typeName, lineNumber, charStart, charEnd, hitCount, add,
                attributes, TRANSITION_WATCH_BREAKPOINT, transition);
    }
}