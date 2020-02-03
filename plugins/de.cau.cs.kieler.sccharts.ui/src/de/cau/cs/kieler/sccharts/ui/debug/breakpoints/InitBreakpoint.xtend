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

import org.eclipse.jdt.internal.debug.core.breakpoints.JavaLineBreakpoint
import org.eclipse.core.resources.IResource
import java.util.Map
import org.eclipse.debug.core.DebugException

/**
 * @author stu121235
 *
 */
class InitBreakpoint extends JavaLineBreakpoint {
    public static val String INIT_BREAKPOINT = "de.cau.cs.kieler.sccharts.ui.initMarker"

    new() {
    }
    
    new(IResource resource, String typeName,
            int lineNumber, int charStart, int charEnd, int hitCount,
            boolean add, Map<String, Object> attributes) throws DebugException {
        super(resource, typeName, lineNumber, charStart, charEnd, hitCount, add,
                attributes, INIT_BREAKPOINT);
    }
}