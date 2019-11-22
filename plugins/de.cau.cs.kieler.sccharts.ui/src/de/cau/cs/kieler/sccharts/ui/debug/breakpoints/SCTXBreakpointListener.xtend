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

import org.eclipse.core.resources.IMarkerDelta
import org.eclipse.core.runtime.CoreException
import org.eclipse.debug.core.IBreakpointListener
import org.eclipse.debug.core.model.IBreakpoint
import org.eclipse.debug.core.model.LineBreakpoint
import de.cau.cs.kieler.sccharts.ui.debug.highlighting.BreakpointVisualizationHook
import de.cau.cs.kieler.sccharts.ui.debug.highlighting.DebugHighlighter
import de.cau.cs.kieler.sccharts.State

/** 
 * This class listens to adding breakpoints, changing them or removing them. According to the event
 * the highlighting is delegated so breakpoints are visualized.
 * 
 * @author lgr, peu
 */
class SCTXBreakpointListener implements IBreakpointListener {
    
    BreakpointVisualizationHook visHook = BreakpointVisualizationHook.instance
    static SCTXBreakpointListener instance
    private DebugHighlighter highlighter = DebugHighlighter.instance


    def static void create() {
        instance = new SCTXBreakpointListener()
    }

    private new() {
        // For singleton behavior
    }

    /** 
     * When a breakpoint is added and enabled, it will get highlighted.
     * {@inheritDoc}
     */
    override void breakpointAdded(IBreakpoint breakpoint) {
        try {
            if (breakpoint instanceof LineBreakpoint && breakpoint.enabled) {
                val line = (breakpoint as LineBreakpoint).lineNumber
                val obj = SCChartsBreakpointTargetAdapter.lineToModelElement.get(line)
                // TODO handle transitions
                if (obj instanceof State) {
                    highlighter.addBreakpointHighlight(obj as State)
                }
//                visHook.handleHighlight(obj, true)
            }
        } catch (CoreException e) {
            e.printStackTrace()
        }
    }

    /** 
     * When a breakpoint is removed, its highlighting will be removed.
     * {@inheritDoc}
     */
    override void breakpointRemoved(IBreakpoint breakpoint, IMarkerDelta delta) {
        try {
            if (breakpoint instanceof LineBreakpoint) {
                var int line = (breakpoint as LineBreakpoint).lineNumber
                val obj = SCChartsBreakpointTargetAdapter.lineToModelElement.get(line)
                //TODO handle transitions
                if (obj instanceof State) {
                    highlighter.removeBreakpointHighlight(obj as State)
                }
//                visHook.handleHighlight(obj, false)
            }
        } catch (CoreException e) {
            e.printStackTrace()
        }

    }

    /** 
     * When a breakpoint is changed, its checked on whether it is still enabled or not. The
     * highlighting will be changed accordingly.
     * {@inheritDoc}
     */
    override void breakpointChanged(IBreakpoint breakpoint, IMarkerDelta delta) {
        try {
            if (breakpoint instanceof LineBreakpoint && delta !== null) {
                val line = (breakpoint as LineBreakpoint).lineNumber
                val obj = SCChartsBreakpointTargetAdapter.lineToModelElement.get(line)
                if (obj instanceof State) {
                    if (breakpoint.enabled) {
                        highlighter.addBreakpointHighlight(obj as State)
//                        visHook.handleHighlight(obj, true)
                    } else {
                        highlighter.removeBreakpointHighlight(obj as State)
//                        visHook.handleHighlight(obj, false)
                    }
                }
            }
        } catch (CoreException e) {
            e.printStackTrace()
        }

    }

    def static SCTXBreakpointListener getInstance() {
        if (instance === null) {
            create()
        }
        return instance
    }
}
