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

import org.eclipse.debug.core.DebugEvent
import org.eclipse.debug.core.DebugException
import org.eclipse.debug.core.IDebugEventSetListener
import org.eclipse.jdt.core.dom.Message
import org.eclipse.jdt.debug.core.IJavaBreakpoint
import org.eclipse.jdt.debug.core.IJavaBreakpointListener
import org.eclipse.jdt.debug.core.IJavaDebugTarget
import org.eclipse.jdt.debug.core.IJavaLineBreakpoint
import org.eclipse.jdt.debug.core.IJavaThread
import org.eclipse.jdt.debug.core.IJavaType

/**
 * Simple listener to catch debugging-related events.
 * 
 * @author peu
 * 
 */
class JavaBreakpointListener implements IJavaBreakpointListener, IDebugEventSetListener {

    override breakpointHit(IJavaThread thread, IJavaBreakpoint breakpoint) {
        if (!breakpoint.isEnabled) {
            println("Disabled breakpoint, skipping...")
            return DONT_SUSPEND
        }
        
        return DebugBreakpointManager.instance.breakpointHit(thread, breakpoint)
    }

    override handleDebugEvents(DebugEvent[] events) {
        for (event : events) {
            if (event.kind == DebugEvent.SUSPEND && 
                (event.detail == DebugEvent.STEP_END || event.detail == DebugEvent.CLIENT_REQUEST)
            ) {
                val thread = event.source
                if (thread instanceof IJavaThread) {
                    DebugBreakpointManager.instance.stepEnding(thread)
                }
            } else if (event.kind == DebugEvent.TERMINATE) {
                DebugBreakpointManager.instance.runEnding
                println("Ending debug run.")
                
            } else if (event.kind == DebugEvent.RESUME 
                && event.detail != DebugEvent.EVALUATION 
                && event.detail != DebugEvent.EVALUATION_IMPLICIT
            ) {
                DebugBreakpointManager.instance.resuming
            }
        }
    }

    override addingBreakpoint(IJavaDebugTarget target, IJavaBreakpoint breakpoint) {
        DebugBreakpointManager.instance.addBreakpoint(breakpoint)
    }

    /**************************************************************************************
     * Unsupported Method Stubs ***********************************************************
     **************************************************************************************/
    override breakpointInstalled(IJavaDebugTarget target, IJavaBreakpoint breakpoint) {
        // UNSUPPORTED
    }

    override breakpointRemoved(IJavaDebugTarget target, IJavaBreakpoint breakpoint) {
        // UNSUPPORTED
    }

    override installingBreakpoint(IJavaDebugTarget target, IJavaBreakpoint breakpoint, IJavaType type) {
        // UNSUPPORTED
        return DONT_CARE
    }

    override breakpointHasCompilationErrors(IJavaLineBreakpoint breakpoint, Message[] errors) {
        // UNSUPPORTED
    }

    override breakpointHasRuntimeException(IJavaLineBreakpoint breakpoint, DebugException exception) {
        // UNSUPPORTED
    }

}
